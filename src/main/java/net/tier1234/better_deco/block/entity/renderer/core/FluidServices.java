package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

import javax.annotation.Nullable;

public interface FluidServices {
    @Nullable
    FluidRenderSprites getFluidSprites(Fluid fluid, BlockAndTintGetter getter, BlockPos pos, FluidState state);
}
