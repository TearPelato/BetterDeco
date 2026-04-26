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
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.screen.custom.MicrowaveMenu;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MicrowaveBlockEntity extends BlockEntity implements MenuProvider {
    public final ItemStacksResourceHandler itemHandler = new ItemStacksResourceHandler(2) {
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int INPUT_SLOT = 0;
    private static final int OUTPUT_SLOT = 1;

    private int progress = 0;
    private int maxProgress = 200;

    public MicrowaveBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MICROWAVE.get(), pos, state);
    }

    protected final ContainerData data = new ContainerData() {
        @Override
        public int get(int index) {
            return switch (index) {
                case 0 -> MicrowaveBlockEntity.this.progress;
                case 1 -> MicrowaveBlockEntity.this.maxProgress;
                default -> 0;
            };
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0 -> MicrowaveBlockEntity.this.progress = value;
                case 1 -> MicrowaveBlockEntity.this.maxProgress = value;
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    };

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
        Optional<RecipeHolder<MicrowaveRecipe>> recipe = getCurrentRecipe();
        if(recipe.isEmpty()) return;

        ItemStack output = recipe.get().value().output.create();
        ItemResource inputResource = itemHandler.getResource(INPUT_SLOT);
        ItemResource outputResource = ItemResource.of(output);

        try (Transaction tx = Transaction.openRoot()) {
            int extracted = itemHandler.extract(INPUT_SLOT, inputResource, 1, tx);
            if(extracted != 1) return;

            int inserted = itemHandler.insert(OUTPUT_SLOT, outputResource, output.getCount(), tx);
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
        ItemResource inputResource = itemHandler.getResource(INPUT_SLOT);
        if(inputResource.isEmpty()) return false;

        Optional<RecipeHolder<MicrowaveRecipe>> recipe = getCurrentRecipe();
        if(recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output.create();
        return canInsert(output);
    }

    private Optional<RecipeHolder<MicrowaveRecipe>> getCurrentRecipe() {
        ItemResource inputResource = itemHandler.getResource(INPUT_SLOT);
        if(inputResource.isEmpty()) return Optional.empty();

        return ((ServerLevel) this.level).recipeAccess()
                .getRecipeFor(ModRecipes.MICROWAVE_TYPE.get(), new SingleRecipeInput(inputResource.toStack()), level);
    }

    private boolean canInsert(ItemStack output) {
        ItemResource existing = itemHandler.getResource(OUTPUT_SLOT);
        int existingAmount = itemHandler.getAmountAsInt(OUTPUT_SLOT);

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
        output.putInt("microwave.progress", progress);
        output.putInt("microwave.max_progress", maxProgress);
        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        itemHandler.deserialize(input);
        progress = input.getIntOr("microwave.progress", 0);
        maxProgress = input.getIntOr("microwave.max_progress", 0);
    }

    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state) {
        drops();
        super.preRemoveSideEffects(pos, state);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        return saveWithoutMetadata(provider);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("gui.better_deco.microwave");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new MicrowaveMenu(id, inv, this, this.data);
    }
}