package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco.Config;
import net.tier1234.better_deco.block.entity.ModBlockEntities;

public class KitchenSinkBlockEntity extends LiquidHolderBlockEntity {

    public KitchenSinkBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.KITCHEN_SINK.get(),
                pos,
                state,
                Config.getSinkCapacityBuckets() * LiquidHolderBlockEntity.BUCKET_VOLUME);
    }

}