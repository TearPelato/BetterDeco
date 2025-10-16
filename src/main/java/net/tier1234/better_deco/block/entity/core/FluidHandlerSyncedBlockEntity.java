package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
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
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        this.tank.deserialize(input);
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        this.tank.serialize(output);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider pRegistries) {
        return saveWithoutMetadata(pRegistries);
    }

    @Nullable
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return null;
    }


    public Object getCapability(Class<?> capabilityType, @Nullable Direction facing) {
        if (capabilityType == IFluidHandler.class) {
            return this.tank;
        }
        return null;
    }
}
