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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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
                    case 2 -> FreezerBlockEntity.this.fuelTime;
                    case 3 -> FreezerBlockEntity.this.fuelDuration;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> FreezerBlockEntity.this.progress = value;
                    case 1 -> FreezerBlockEntity.this.maxProgress = value;
                    case 2 -> FreezerBlockEntity.this.fuelTime = value;
                    case 3 -> FreezerBlockEntity.this.fuelDuration = value;
                }
            }

            @Override
            public int getCount() {
                return 4;
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


    private boolean hasFuel() {
        return fuelTime > 0;
    }


    private void consumeFuelItem(HolderLookup.Provider provider) {
        ItemStack fuel = itemHandler.getResource(SLOT_FUEL).toStack();
        if (fuel.isEmpty()) return;

        int burnTime = FreezerFuelValues.of(fuel)
                .map(f -> f.freezTime)
                .orElse(0);
        if (burnTime <= 0) return;

        fuelDuration = burnTime;
        fuelTime     = burnTime;

        try (Transaction tx = Transaction.openRoot()) {
            itemHandler.extract(SLOT_FUEL, ItemResource.of(fuel), 1, tx);
            tx.commit();
        }
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        boolean changed = false;

        boolean anyActive = false;
        for (int i = 0; i < 3; i++) {
            if (hasRecipe(SLOT_INPUT, SLOT_OUTPUT)) {
                anyActive = true; break; }
        }

        if (anyActive && !hasFuel()) {
            consumeFuelItem(level.registryAccess());
            changed = true;
        }

        for (int i = 0; i < 3; i++) {
            if (hasFuel() && hasRecipe(SLOT_INPUT, SLOT_OUTPUT)) {
                progress++;
                changed = true;

                if (progress >= maxProgress) {
                    craftItem(SLOT_INPUT, SLOT_OUTPUT);
                    progress = 0;
                }
            } else {
                if (progress > 0) {
                    progress = 0; changed = true;
                }
            }
        }

        if (hasFuel() && anyActive) {
            fuelTime--;
            changed = true;
        }

        if (changed) setChanged(level, pos, state);
    }

    private boolean hasRecipe(int inputSlot, int outputSlot) {
        ItemResource resource = itemHandler.getResource(inputSlot);
        if (resource.isEmpty()) return false;

        Optional<RecipeHolder<FreezerRecipe>> recipe = getRecipeFor(resource.toStack());
        if (recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output.create();
        return canInsert(output, outputSlot);
    }

    private boolean canInsert(ItemStack output, int slot) {
        ItemResource existing = itemHandler.getResource(slot);
        int existingAmount = itemHandler.getAmountAsInt(slot);

        if (existing.isEmpty()) return true;
        return existing.equals(ItemResource.of(output))
                && existingAmount + output.getCount() <= existing.toStack().getMaxStackSize();
    }

    private Optional<RecipeHolder<FreezerRecipe>> getRecipeFor(ItemStack input) {
        return ((ServerLevel) this.level).recipeAccess()
                .getRecipeFor(ModRecipes.FREEZER_TYPE.get(), new SingleRecipeInput(input), level);
    }

    private void craftItem(int inputSlot, int outputSlot) {
        ItemStack inputStack = itemHandler.getResource(inputSlot).toStack();
        Optional<RecipeHolder<FreezerRecipe>> recipe = getRecipeFor(inputStack);
        if (recipe.isEmpty()) return;

        ItemStack output = recipe.get().value().output.create();
        ItemResource outputResource = ItemResource.of(output);
        ItemResource inputResource = itemHandler.getResource(inputSlot);

        try (Transaction tx = Transaction.openRoot()) {
            int extracted = itemHandler.extract(inputSlot, inputResource, 1, tx);
            if (extracted != 1) return;
            int inserted = itemHandler.insert(outputSlot, outputResource, output.getCount(), tx);
            if (inserted != output.getCount()) return;

            tx.commit();
        }
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
        output.putInt("fuelTime", fuelTime);
        output.putInt("fuelDuration", fuelDuration);
        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        itemHandler.deserialize(input);
        progress = input.getIntOr("Freezer.progress", 0);
        maxProgress = input.getIntOr("Freezer.max_progress", 0);
        fuelTime     = input.getIntOr("fuelTime", 0);
        fuelDuration = input.getIntOr("fuelDuration", 0);
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


    public enum FreezerFuelValues {
        ICE(450, Items.ICE),
        PACKED_ICE(350, Items.PACKED_ICE),
        BLUE_ICE(300, Items.BLUE_ICE),
        POWDER_SNOW(550, Items.POWDER_SNOW_BUCKET);

        public final int freezTime;
        public final Item item;

        FreezerFuelValues(int freezTime, Item item){
            this.freezTime = freezTime;
            this.item = item;

        }

        public static Optional<FreezerFuelValues> of(ItemStack stack) {
            if (stack.isEmpty()) return Optional.empty();
            for (FreezerFuelValues fuel : values()) {
                if (stack.is(fuel.item)) return Optional.of(fuel);
            }
            return Optional.empty();
        }

        public static boolean isValid(ItemStack stack) {
            return of(stack).isPresent();
        }

        public static float getMultiplier(ItemStack stack) {
            return of(stack).map(f -> f.freezTime).orElse(0);
        }

    }
}
