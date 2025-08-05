package net.tier1234.better_deco.block.custom;

import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class CustomLadderBlock extends LadderBlock {
    public CustomLadderBlock(Properties properties) {
        super(BlockBehaviour.Properties.of()
                .mapColor(MapColor.METAL)
                .strength(0.4F)
                .noOcclusion()
                .isRedstoneConductor((state, level, pos) -> false));
    }
}
