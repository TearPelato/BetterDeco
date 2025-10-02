package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.FluidType;
import net.tier1234.better_deco.block.entity.ModBlockEntities;

public class KitchenSinkBlockEntity extends FluidHandlerSyncedBlockEntity
{
    protected KitchenSinkBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity)
    {
        super(type, pos, state, capacity);
    }

    public KitchenSinkBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.KITCHEN_SINK.get(), pos, state, FluidType.BUCKET_VOLUME * 10);
    }
}