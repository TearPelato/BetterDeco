package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.tier1234.better_deco.util.BlockEntityUtil;

import javax.annotation.Nullable;

/**
 * Author: MrCrayfish
 */
public abstract class FluidHandlerSyncedBlockEntity extends BlockEntity {
    protected final FluidTank tank;

    public FluidHandlerSyncedBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity) {
        super(type, pos, state);
        this.tank = new FluidTank(capacity) {
            @Override
            protected void onContentsChanged() {
                FluidHandlerSyncedBlockEntity.this.syncFluidToClient();
            }
        };
    }

    public FluidTank getTank() {
        return this.tank;
    }

    private void syncFluidToClient() {
        BlockEntityUtil.sendUpdatePacket(this, this.saveWithFullMetadata());
    }

    protected abstract CompoundTag saveWithFullMetadata();

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.tank.writeToNBT(registries, tag);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        this.tank.writeToNBT(registries, tag);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider pRegistries) {
        return saveWithoutMetadata(pRegistries);
    }

    @Nullable
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return null;
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt, HolderLookup.Provider registries) {
        CompoundTag compound = pkt.getTag();
        if (compound != null) {
            this.loadAdditional(compound, registries);
        }
    }

    public Object getCapability(Class<?> capabilityType, @Nullable Direction facing) {
        if (capabilityType == IFluidHandler.class) {
            return this.tank;
        }
        return null;
    }
}
