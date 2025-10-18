package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.EmptyBlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.AABB;
import net.tier1234.better_deco.block.entity.core.FluidContainerBlockEntityUtil;
import net.tier1234.better_deco.block.entity.custom.FluidContainerBlockEntity;

import javax.annotation.Nullable;

public class FluidRenderState extends BlockEntityRenderState
{
    public FluidRenderSprites fluidSprites;
    public long fluidAmount;
    public long fluidCapacity;
    public int waterTintAtPos = 0xFFFFFF;
    public AABB box;

    public boolean valid()
    {
        return this.fluidSprites != null && this.fluidAmount > 0 && this.fluidCapacity > 0 && this.box != null;
    }

    public static void extract(FluidRenderState state, FluidContainerBlockEntityUtil block, @Nullable Level level, BlockPos pos)
    {
        FluidContainerBlockEntity container = block.getFluidContainer();
        if(container != null && !container.isEmpty())
        {
            Fluid fluid = container.getFluid();
            BlockAndTintGetter tintGetter = level != null ? level : EmptyBlockAndTintGetter.INSTANCE;
            state.fluidSprites = FluidServiceLoader.FLUID.getFluidSprites(fluid, tintGetter, pos, fluid.defaultFluidState());
            state.fluidCapacity = container.getCapacity();
            state.fluidAmount = container.getStoredAmount();
            state.waterTintAtPos = BiomeColors.getAverageWaterColor(tintGetter, pos);
        }
    }
}
