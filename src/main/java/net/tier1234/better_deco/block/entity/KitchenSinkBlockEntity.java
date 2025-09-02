package net.tier1234.better_deco.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidType;

public class KitchenSinkBlockEntity extends FluidHandlerSyncedBlockEntity
{
    protected KitchenSinkBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity)
    {
        super(type, pos, state, capacity);
    }

    @Override
    protected CompoundTag saveWithFullMetadata() {
        return null;
    }

    public KitchenSinkBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.KITCHEN_SINK.get(), pos, state, FluidType.BUCKET_VOLUME * 10);
    }
}