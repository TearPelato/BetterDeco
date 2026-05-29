package net.tier1234.better_deco.block.entity.api;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.fluids.capability.templates.FluidTank;
import net.tier1234.better_deco.util.BlockEntityUtil;
import org.jetbrains.annotations.Nullable;

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
                FluidHandlerSyncedBlockEntity.this.syncFluidToClient();
            }
        };
    }

    public FluidTank getTank()
    {
        return this.tank;
    }

    private void syncFluidToClient()
    {
        BlockEntityUtil.sendUpdatePacket(this, this.saveWithFullMetadata());
    }

    @Override
    public void load(CompoundTag tag)
    {
        //TODO may need to implement fluid fix from Vehicle Mod. See FluidUtils#fixEmptyTag(NBTTagCompound tag)
        super.load(tag);
        this.tank.readFromNBT(tag);
    }

    @Override
    protected void saveAdditional(CompoundTag tag)
    {
        super.saveAdditional(tag);
        this.tank.writeToNBT(tag);
    }

    @Override
    public CompoundTag getUpdateTag()
    {
        return this.saveWithFullMetadata();
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt)
    {
        this.load(pkt.getTag());
    }

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing)
    {
        if (capability == ForgeCapabilities.FLUID_HANDLER)
            return LazyOptional.of(() -> this.tank).cast();
        return super.getCapability(capability, facing);
    }
}