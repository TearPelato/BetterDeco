package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.EmptyBlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.AABB;
import net.tier1234.better_deco.block.entity.core.FluidContainerRendererUtil;
import net.tier1234.better_deco.block.entity.custom.FluidContainerBlockEntity;
import org.jetbrains.annotations.Nullable;

public class FluidContainerRendererState extends BlockEntityRenderState
{
    public TextureAtlasSprite[] fluidSprites;
    public long fluidAmount;
    public long fluidCapacity;
    public int waterTintAtPos = 0xFFFFFF;
    public AABB box;

    public boolean valid()
    {
        return this.fluidSprites != null && this.fluidAmount > 0 && this.fluidCapacity > 0 && this.box != null;
    }

    public static void extract(FluidContainerRendererState state, IFluidContainerRenderer block, @Nullable Level level, BlockPos pos)
    {
        FluidContainerBlockEntity container = block.getFluidContainer();
        if(container != null && !container.isEmpty())
        {
            Fluid fluid = container.getFluid();
            BlockAndTintGetter tintGetter = level != null ? level : EmptyBlockAndTintGetter.INSTANCE;
            state.fluidSprites = FluidContainerRendererUtil.getFluidSprites(fluid, tintGetter, pos, fluid.defaultFluidState());
            state.fluidCapacity = container.getCapacity();
            state.fluidAmount = container.getStoredAmount();
            state.waterTintAtPos = BiomeColors.getAverageWaterColor(tintGetter, pos);
        }
    }
}
