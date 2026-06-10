package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.tier1234.better_deco.init.ModBlockEntities;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.FreezerRecipe;
import net.tier1234.better_deco.recipe.FreezerRecipe;
import net.tier1234.better_deco.screen.custom.FreezerMenu;

import javax.annotation.Nullable;
import java.util.Optional;

public class FreezerBlockEntity extends BlockEntity implements MenuProvider {
    public final ItemStacksResourceHandler itemHandler = new ItemStacksResourceHandler(3) {
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents) {
                setChanged();
                if (!level.isClientSide()) {
                    level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
                }
        }
    };

    private static final int SLOT_INPUT = 0;
    private static final int SLOT_OUTPUT = 1;
    private static final int SLOT_FUEL = 2;

    private int progress = 0;
    private int maxProgress = 450;
    private int fuelTime = 0;
    private int fuelDuration = 0;
    protected final ContainerData data;

    public FreezerBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.FREEZER.get(), pos, state);
        data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> FreezerBlockEntity.this.progress;
                    case 1 -> FreezerBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> FreezerBlockEntity.this.progress = value;
                    case 1 -> FreezerBlockEntity.this.maxProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.better_deco.freezer");
    }

    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state) {
        drops();
        super.preRemoveSideEffects(pos, state);
    }


    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new FreezerMenu(id, inv, this, this.data);
    }

    public void tick(Level level, BlockPos blockPos, BlockState blockState) {
        if(hasRecipe()) {
            increaseCraftingProgress();
            setChanged(level, blockPos, blockState);

            if(hasCraftingFinished()) {
                craftItem();
                resetProgress();
            }
        } else {
            resetProgress();
        }
    }

    private void craftItem() {
        Optional<RecipeHolder<FreezerRecipe>> recipe = getCurrentRecipe();
        if(recipe.isEmpty()) return;

        ItemStack output = recipe.get().value().output.create();
        ItemResource inputResource = itemHandler.getResource(SLOT_INPUT);
        ItemResource outputResource = ItemResource.of(output);

        try (Transaction tx = Transaction.openRoot()) {
            int extracted = itemHandler.extract(SLOT_INPUT, inputResource, 1, tx);
            if(extracted != 1) return;

            int inserted = itemHandler.insert(SLOT_INPUT, outputResource, output.getCount(), tx);
            if(inserted != output.getCount()) return;

            tx.commit();
        }
    }

    private void resetProgress() {
        progress = 0;
        maxProgress = 72;
    }

    private boolean hasCraftingFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress() {
        progress++;
    }

    private boolean hasRecipe() {
        ItemResource inputResource = itemHandler.getResource(SLOT_INPUT);
        if(inputResource.isEmpty()) return false;

        Optional<RecipeHolder<FreezerRecipe>> recipe = getCurrentRecipe();
        if(recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output.create();
        return canInsert(output);
    }

    private Optional<RecipeHolder<FreezerRecipe>> getCurrentRecipe() {
        ItemResource inputResource = itemHandler.getResource(SLOT_INPUT);
        if(inputResource.isEmpty()) return Optional.empty();

        return ((ServerLevel) this.level).recipeAccess()
                .getRecipeFor(ModRecipes.FREEZER_TYPE.get(), new SingleRecipeInput(inputResource.toStack()), level);
    }

    private boolean canInsert(ItemStack output) {
        ItemResource existing = itemHandler.getResource(SLOT_OUTPUT);
        int existingAmount = itemHandler.getAmountAsInt(SLOT_OUTPUT);

        if(existing.isEmpty()) return true;

        return existing.equals(ItemResource.of(output))
                && existingAmount + output.getCount() <= output.getMaxStackSize();
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.size());
        for(int i = 0; i < itemHandler.size(); i++) {
            inventory.setItem(i, itemHandler.getResource(i).toStack(itemHandler.getAmountAsInt(i)));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        itemHandler.serialize(output);
        output.putInt("Freezer.progress", progress);
        output.putInt("Freezer.max_progress", maxProgress);
        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        itemHandler.deserialize(input);
        progress = input.getIntOr("Freezer.progress", 0);
        maxProgress = input.getIntOr("Freezer.max_progress", 0);
    }
    
    @org.jetbrains.annotations.Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        return saveWithoutMetadata(provider);
    }
}
