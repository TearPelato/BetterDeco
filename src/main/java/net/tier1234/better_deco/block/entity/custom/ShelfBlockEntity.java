package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.ItemOwner;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.ShelfBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.neoforged.neoforge.transfer.transaction.Transaction;
import net.tearpelato.deco_lib.api.block_entity.BasicLootBlockEntity;
import net.tier1234.better_deco.init.ModBlockEntities;
import net.tier1234.better_deco.init.ModInventory;
import net.tier1234.better_deco.screen.custom.ShelfMenu;
import org.jetbrains.annotations.Nullable;

public class ShelfBlockEntity extends BasicLootBlockEntity implements ItemOwner{
    public final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(6) {
        @Override
        public int size() {
            return 1;
        }

        @Override
        protected void onContentsChanged(int slot,ItemStack previousContents) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    public final ModInventory handler;

    public ShelfBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SHELF_BE.get(), pos, state);
        this.handler = new ModInventory(6, stack -> this.setChanged()); // 6 slot
    }

    @Override
    protected Component getDefaultName() {
        return Component.literal("Shelf");
    }

    @Override
    public int getContainerSize() {
        return 6;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < handler.size(); i++) {
            if (!handler.getResource(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public NonNullList<ItemStack> getItems() {
        NonNullList<ItemStack> items = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY);
        for (int i = 0; i < getContainerSize(); i++) {
            ItemResource res = handler.getResource(i);
            int amount = handler.getAmountAsInt(i);
            if (!res.isEmpty()) {
                items.set(i, res.toStack(amount));
            }
        }
        return items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        try (var tx = Transaction.openRoot()) {
            for (int i = 0; i < items.size(); i++) {
                handler.extract(i, handler.getResource(i), handler.getAmountAsInt(i), tx);
                ItemStack stack = items.get(i);
                if (!stack.isEmpty()) {
                    handler.insert(i, ItemResource.of(stack), stack.getCount(), tx);
                }
            }
            tx.commit();
        }
        setChanged();
    }

    @Override
    public void clearContent() {
        try (var tx = Transaction.openRoot()) {
            for (int i = 0; i < handler.size(); i++) {
                handler.extract(i, handler.getResource(i), handler.getAmountAsInt(i), tx);
            }
            tx.commit();
        }
        setChanged();
    }

    @Override
    public boolean stillValid(Player player) {
        return !player.isSpectator() && player.distanceToSqr(
                (double) worldPosition.getX() + 0.5D,
                (double) worldPosition.getY() + 0.5D,
                (double) worldPosition.getZ() + 0.5D
        ) <= 64.0D;
    }

    @Override
    public void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
    }

    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    public void handleUpdateTag(ValueInput input) {
        loadAdditional(input);
    }


    public int getComparatorOutput() {
        return AbstractContainerMenu.getRedstoneSignalFromContainer(this);
    }

    public static void dropContents(Level level, BlockPos pos, ShelfBlockEntity shelf) {
        Containers.dropContents(level, pos, shelf);
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int containerId, Inventory playerInventory) {
        return new ShelfMenu(containerId, playerInventory, this);
    }

    @Override
    public Level level() {
        return this.level;
    }

    @Override
    public Vec3 position() {
        return this.getBlockPos().clampLocationWithin(new Vec3(0.5, 0.5, 0.5));
    }

    @Override
    public float getVisualRotationYInDegrees() {
        return ((Direction)this.getBlockState().getValue(ShelfBlock.FACING)).getOpposite().toYRot();
    }
}