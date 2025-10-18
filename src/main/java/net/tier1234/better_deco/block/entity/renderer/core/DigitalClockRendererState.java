package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

public class DigitalClockRendererState extends BlockEntityRenderState {
    public String timeText;
    public int color;
    public Direction facing;
    public BlockPos lightPosition;
    public Level blockEntityLevel;
}
