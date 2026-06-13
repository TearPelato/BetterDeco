package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
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
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.tier1234.better_deco.init.ModBlockEntities;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.FreezerRecipe;
import net.tier1234.better_deco.screen.custom.FreezerMenu;

import javax.annotation.Nullable;
import java.util.Optional;

public class FreezerBlockEntity extends BlockEntity implements MenuProvider {

    public final ItemStackHandler itemHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (level != null && !level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int SLOT_INPUT  = 0;
    private static final int SLOT_OUTPUT = 1;
    private static final int SLOT_FUEL   = 2;

    private int progress     = 0;
    private int maxProgress  = 450;
    private int fuelTime     = 0;
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
                    case 0 -> FreezerBlockEntity.this.progress     = value;
                    case 1 -> FreezerBlockEntity.this.maxProgress  = value;
                    case 2 -> FreezerBlockEntity.this.fuelTime     = value;
                    case 3 -> FreezerBlockEntity.this.fuelDuration = value;
                }
            }

            @Override
            public int getCount() { return 4; }
        };
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.better_deco.freezer");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new FreezerMenu(id, inv, this, this.data);
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    private boolean hasFuel() {
        return fuelTime > 0;
    }

    private void consumeFuelItem() {
        ItemStack fuel = itemHandler.getStackInSlot(SLOT_FUEL);
        if (fuel.isEmpty()) return;

        int burnTime = FreezerFuelValues.of(fuel).map(f -> f.freezTime).orElse(0);
        if (burnTime <= 0) return;

        fuelDuration = burnTime;
        fuelTime     = burnTime;

        itemHandler.extractItem(SLOT_FUEL, 1, false);
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        boolean changed = false;

        boolean anyActive = hasRecipe(SLOT_INPUT, SLOT_OUTPUT);

        if (anyActive && !hasFuel()) {
            consumeFuelItem();
            changed = true;
        }

        if (hasFuel() && anyActive) {
            progress++;
            changed = true;

            if (progress >= maxProgress) {
                craftItem(SLOT_INPUT, SLOT_OUTPUT);
                progress = 0;
            }
        } else {
            if (progress > 0) {
                progress = 0;
                changed  = true;
            }
        }

        if (hasFuel() && anyActive) {
            fuelTime--;
            changed = true;
        }

        if (changed) setChanged(level, pos, state);
    }

    private boolean hasRecipe(int inputSlot, int outputSlot) {
        ItemStack input = itemHandler.getStackInSlot(inputSlot);
        if (input.isEmpty()) return false;

        Optional<RecipeHolder<FreezerRecipe>> recipe = getRecipeFor(input);
        if (recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output.copy();
        return canInsert(output, outputSlot);
    }

    private boolean canInsert(ItemStack output, int slot) {
        ItemStack existing = itemHandler.getStackInSlot(slot);
        if (existing.isEmpty()) return true;
        return ItemStack.isSameItemSameComponents(existing, output)
                && existing.getCount() + output.getCount() <= existing.getMaxStackSize();
    }

    private Optional<RecipeHolder<FreezerRecipe>> getRecipeFor(ItemStack input) {
        return level.getRecipeManager()
                .getRecipeFor(ModRecipes.FREEZER_TYPE.get(), new SingleRecipeInput(input), level);
    }

    private void craftItem(int inputSlot, int outputSlot) {
        ItemStack input = itemHandler.getStackInSlot(inputSlot);
        Optional<RecipeHolder<FreezerRecipe>> recipe = getRecipeFor(input);
        if (recipe.isEmpty()) return;

        ItemStack output = recipe.get().value().output.copy();

        itemHandler.extractItem(inputSlot, 1, false);

        ItemStack existing = itemHandler.getStackInSlot(outputSlot);
        if (existing.isEmpty()) {
            itemHandler.setStackInSlot(outputSlot, output.copy());
        } else {
            existing.grow(output.getCount());
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", itemHandler.serializeNBT(registries));
        tag.putInt("Freezer.progress",     progress);
        tag.putInt("Freezer.max_progress", maxProgress);
        tag.putInt("fuelTime",             fuelTime);
        tag.putInt("fuelDuration",         fuelDuration);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("inventory")) {
            itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
        }
        progress     = tag.getInt("Freezer.progress");
        maxProgress  = tag.contains("Freezer.max_progress") ? tag.getInt("Freezer.max_progress") : 450;
        fuelTime     = tag.getInt("fuelTime");
        fuelDuration = tag.getInt("fuelDuration");
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    public enum FreezerFuelValues {
        ICE(300,         Items.ICE),
        PACKED_ICE(350,  Items.PACKED_ICE),
        BLUE_ICE(450,    Items.BLUE_ICE),
        POWDER_SNOW(250, Items.POWDER_SNOW_BUCKET);

        public final int  freezTime;
        public final Item item;

        FreezerFuelValues(int freezTime, Item item) {
            this.freezTime = freezTime;
            this.item      = item;
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

        public static int getBurnTime(ItemStack stack) {
            return of(stack).map(f -> f.freezTime).orElse(0);
        }
    }
}
