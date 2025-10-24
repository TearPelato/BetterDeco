package net.tier1234.better_deco.block.entity.renderer.core.render_state;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

public class DigitalClockRendererState extends BlockEntityRenderState {
    public Direction facing;
    public String timeText;
    public int color;
    public Level level;
    public BlockPos lightPosition;
}