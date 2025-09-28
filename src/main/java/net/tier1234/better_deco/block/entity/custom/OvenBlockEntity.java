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
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.recipe.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.recipe.OvenRecipeInput;
import net.tier1234.better_deco.screen.custom.OvenMenu;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class OvenBlockEntity extends BlockEntity implements MenuProvider {
    public final ItemStackHandler itemHandler = new ItemStackHandler(6) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    private static final int[] INPUT_SLOTS = {0, 1, 2};
    private static final int[] OUTPUT_SLOTS = {3, 4, 5};

    protected final ContainerData data;
    private final int[] progress = new int[3];
    private final int maxProgress = 72;

    public OvenBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.OVEN.get(), pos, state);
        data = new ContainerData() {
            @Override
            public int get(int i) {
                return i < 3 ? progress[i] : 0;
            }

            @Override
            public void set(int i, int value) {
                if(i < 3) progress[i] = value;
            }

            @Override
            public int getCount() {
                return 3;
            }
        };
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

    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    public void tick(Level level, BlockPos pos, BlockState state) {
        boolean changed = false;

        for (int i = 0; i < 3; i++) {
            if (hasRecipe(INPUT_SLOTS[i], OUTPUT_SLOTS[i])) {
                progress[i]++;
                changed = true;
                if (progress[i] >= maxProgress) {
                    craftItem(INPUT_SLOTS[i], OUTPUT_SLOTS[i]);
                    progress[i] = 0;
                }
            } else {
                progress[i] = 0;
            }
        }

        if(changed) setChanged(level, pos, state);
    }

    private boolean hasRecipe(int inputSlot, int outputSlot) {
        ItemStack inputStack = itemHandler.getStackInSlot(inputSlot);
        if(inputStack.isEmpty()) return false;

        Optional<RecipeHolder<OvenRecipe>> recipe = getRecipeFor(inputStack);
        if(recipe.isEmpty()) return false;

        ItemStack output = recipe.get().value().output();
        return canInsert(output, outputSlot);
    }

    private Optional<RecipeHolder<OvenRecipe>> getRecipeFor(ItemStack input) {
        return level.getRecipeManager().getRecipeFor(ModRecipes.OVEN_TYPE.get(), new OvenRecipeInput(input), level);
    }

    private void craftItem(int inputSlot, int outputSlot) {
        ItemStack inputStack = itemHandler.getStackInSlot(inputSlot);
        Optional<RecipeHolder<OvenRecipe>> recipe = getRecipeFor(inputStack);
        if(recipe.isEmpty()) return;

        ItemStack output = recipe.get().value().output();
        itemHandler.extractItem(inputSlot, 1, false);

        ItemStack existing = itemHandler.getStackInSlot(outputSlot);
        if(existing.isEmpty()) itemHandler.setStackInSlot(outputSlot, output.copy());
        else existing.grow(output.getCount());
    }

    private boolean canInsert(ItemStack output, int slot) {
        ItemStack existing = itemHandler.getStackInSlot(slot);
        return existing.isEmpty() || (existing.getItem() == output.getItem() && existing.getCount() + output.getCount() <= existing.getMaxStackSize());
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        tag.put("inventory", itemHandler.serializeNBT(registries));
        for(int i=0;i<3;i++) tag.putInt("progress" + i, progress[i]);
        super.saveAdditional(tag, registries);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        itemHandler.deserializeNBT(registries, tag.getCompound("inventory"));
        for(int i=0;i<3;i++) progress[i] = tag.getInt("progress" + i);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) { return saveWithoutMetadata(registries); }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}