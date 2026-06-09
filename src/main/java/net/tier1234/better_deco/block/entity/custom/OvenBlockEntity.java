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
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleRecipeInput;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.FuelValues;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.tier1234.better_deco.init.ModBlockEntities;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.screen.custom.OvenMenu;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class OvenBlockEntity extends BlockEntity implements MenuProvider {
    public final ItemStacksResourceHandler itemHandler = new ItemStacksResourceHandler(7) {
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int[] INPUT_SLOTS = {0, 1, 2};
    private static final int[] OUTPUT_SLOTS = {3, 4, 5};
    private static final int FUEL_SLOT = 6;

    protected final ContainerData data;
    private final int[] progress = new int[3];
    private final int maxProgress = 72;
    private int fuelTime = 0;
    private int fuelDuration = 0;

    public OvenBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OVEN.get(), pos, state);
        data = new ContainerData() {
            @Override public int get(int i) {
                return switch (i) {
                    case 0, 1, 2 -> progress[i];
                    case 3 -> fuelTime;
                    case 4 -> fuelDuration;
                    default -> 0;
                };
            }
            @Override public void set(int i, int value) {
                switch (i) {
                    case 0, 1, 2 -> progress[i] = value;
                    case 3 -> fuelTime = value;
                    case 4 -> fuelDuration = value;
                }
            }
            @Override public int getCount() { return 5; }
        };
    }


    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state) {
        drops();
        super.preRemoveSideEffects(pos, state);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("block.better_deco.oven");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inv, Player player) {
        return new OvenMenu(id, inv, this, this.data);
    }


    private boolean hasFuel() { return fuelTime > 0; }


    private void consumeFuelItem(HolderLookup.Provider provider) {
        ItemStack fuel = itemHandler.getResource(FUEL_SLOT).toStack();
        if (fuel.isEmpty()) return;


        int burnTime = fuel.getBurnTime(RecipeType.SMELTING, this.level.fuelValues());
        if (burnTime <= 0) return;

        fuelDuration = burnTime;
        fuelTime     = burnTime;

        try (Transaction tx = Transaction.openRoot()) {
            itemHandler.extract(FUEL_SLOT, ItemResource.of(fuel), 1, tx);
            tx.commit();
        }
    }

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.size());
        for (int i = 0; i < itemHandler.size(); i++) {
            inventory.setItem(i, itemHandler.copyToList().get(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        boolean changed = false;

        boolean anyActive = false;
        for (int i = 0; i < 3; i++) {
            if (hasRecipe(INPUT_SLOTS[i], OUTPUT_SLOTS[i])) { anyActive = true; break; }
        }

        if (anyActive && !hasFuel()) {
            consumeFuelItem(level.registryAccess());
            changed = true;
        }

        for (int i = 0; i < 3; i++) {
            if (hasFuel() && hasRecipe(INPUT_SLOTS[i], OUTPUT_SLOTS[i])) {
                progress[i]++;
                changed = true;

                if (progress[i] >= maxProgress) {
                    craftItem(INPUT_SLOTS[i], OUTPUT_SLOTS[i]);
                    progress[i] = 0;
                }
            } else {
                if (progress[i] > 0) { progress[i] = 0; changed = true; }
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

        Optional<RecipeHolder<OvenRecipe>> recipe = getRecipeFor(resource.toStack());
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

    private Optional<RecipeHolder<OvenRecipe>> getRecipeFor(ItemStack input) {
        return ((ServerLevel) this.level).recipeAccess()
                .getRecipeFor(ModRecipes.OVEN_TYPE.get(), new SingleRecipeInput(input), level);
    }

    private void craftItem(int inputSlot, int outputSlot) {
        ItemStack inputStack = itemHandler.getResource(inputSlot).toStack();
        Optional<RecipeHolder<OvenRecipe>> recipe = getRecipeFor(inputStack);
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

    @Override
    protected void saveAdditional(ValueOutput output) {
        itemHandler.serialize(output);
        for (int i = 0; i < 3; i++) output.putInt("progress" + i, progress[i]);
        output.putInt("fuelTime", fuelTime);
        output.putInt("fuelDuration", fuelDuration);
        super.saveAdditional(output);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        itemHandler.deserialize(input);
        for (int i = 0; i < 3; i++) progress[i] = input.getIntOr("progress" + i, 0);
        fuelTime     = input.getIntOr("fuelTime", 0);
        fuelDuration = input.getIntOr("fuelDuration", 0);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) { return saveWithoutMetadata(registries); }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}