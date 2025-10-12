package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.Nullable;

public abstract class FluidContainerBlockEntity extends BlockEntity {

    public static final int BUCKET_VOLUME = 1000;

    protected final FluidTank tank;

    public FluidContainerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity) {
        super(type, pos, state);
        this.tank = new FluidTank(capacity, this::isFluidValid);
    }

    public FluidStack getFluid() {
        return tank.getFluid();
    }

    public int getStoredAmount() {
        return tank.getFluidAmount();
    }

    public int getCapacity() {
        return tank.getCapacity();
    }

    public boolean isEmpty() {
        return tank.isEmpty();
    }

    protected boolean isFluidValid(FluidStack stack) {
        return true;
    }

    public void setFluidAndAmount(FluidStack stack) {
        if (stack == null || stack.isEmpty()) {
            tank.setFluid(FluidStack.EMPTY);
        } else {
            FluidStack copy = stack.copy();
            if (copy.getAmount() > tank.getCapacity()) {
                copy.setAmount(tank.getCapacity());
            }
            tank.setFluid(copy);
        }

        setChanged();
        if (level != null && !level.isClientSide) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }

    public int fill(FluidStack stack, boolean simulate) {
        int filled = tank.fill(stack, simulate);
        if (!simulate && filled > 0) {
            setChanged();
            if (level != null && !level.isClientSide)
                level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
        return filled;
    }

    public FluidStack drain(int amount, boolean simulate) {
        FluidStack drained = tank.drain(amount, simulate);
        if (!simulate && !drained.isEmpty()) {
            setChanged();
            if (level != null && !level.isClientSide)
                level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
        return drained;
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("Tank", tank.writeToNBT(new CompoundTag()));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("Tank")) {
            tank.readFromNBT(tag.getCompound("Tank"));
        } else {
            tank.setFluid(FluidStack.EMPTY);
        }
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
}