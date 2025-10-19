package net.tier1234.better_deco.block.entity.renderer.core.render_state;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;

public class FluidRenderState extends BlockEntityRenderState {
    public Fluid fluid = Fluids.EMPTY;
    public Direction direction = Direction.NORTH;
    public AABB box;
    public int light;
    public Level level;
    public BlockPos blockPos;
    public float fullness;
}
