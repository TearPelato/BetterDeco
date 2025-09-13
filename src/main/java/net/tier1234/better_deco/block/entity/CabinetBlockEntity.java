package net.tier1234.better_deco.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.items.ItemStackHandler;

public class CabinetBlockEntity extends RandomizableContainerBlockEntity
        implements MenuProvider {

    public final ItemStackHandler inventory = new ItemStackHandler(18);

    private NonNullList<ItemStack> items = NonNullList.withSize(18, ItemStack.EMPTY);

    public CabinetBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CUSTOM_CABINET_BE.get(), pos, state);
    }

    @Override
    protected Component getDefaultName() {
        return Component.literal("Kitchen Cabinet");
    }

    @Override
    protected AbstractContainerMenu createMenu(int id, Inventory playerInventory) {
        return ChestMenu.twoRows(id, playerInventory );
    }

    @Override
    public int getContainerSize() {
        return items.size();
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        return items;
    }

    @Override
    public void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory").get());
    }

}
