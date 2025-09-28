package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.capabilities.BlockCapability;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import net.tier1234.better_deco.util.BlockEntityUtil;

import javax.annotation.Nullable;

/**
 * Author: MrCrayfish
 */
public abstract class FluidHandlerSyncedBlockEntity extends BlockEntity
{
    protected final FluidTank tank;

    public FluidHandlerSyncedBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity)
    {
        super(type, pos, state);
        this.tank = new FluidTank(capacity)
        {
            @Override
            protected void onContentsChanged()
            {
                FluidHandlerSyncedBlockEntity.this.syncFluidToClient(FluidHandlerSyncedBlockEntity.this.level.registryAccess());
            }
        };
    }

    public FluidTank getTank()
    {
        return this.tank;
    }

    private void syncFluidToClient(HolderLookup.Provider registries)
    {
        BlockEntityUtil.sendUpdatePacket(this, this.saveWithFullMetadata(registries));
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries)
    {
        super.loadAdditional(tag, registries);
        this.tank.readFromNBT(registries, tag);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries)
    {
        super.saveAdditional(tag, registries);
        this.tank.writeToNBT(registries, tag);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries)
    {
        return this.saveWithFullMetadata(registries);
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public <T, C> T getCapability(BlockCapability<T, C> capability, @Nullable C context)
    {
        if (capability == Capabilities.FluidHandler.BLOCK)
            return (T) this.tank;
        return null;
    }
}