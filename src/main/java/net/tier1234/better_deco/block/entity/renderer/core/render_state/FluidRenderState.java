package net.tier1234.better_deco.block.entity.renderer.core.render_state;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;

public class FluidRenderState extends BlockEntityRenderState {
    public Direction facing;
    public Fluid fluid;
    public Level level;
    public BlockPos pos;
    public KitchenSinkBlockEntity be;
}
