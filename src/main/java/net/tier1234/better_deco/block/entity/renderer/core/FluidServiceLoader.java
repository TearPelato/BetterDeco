package net.tier1234.better_deco.block.entity.renderer.core;

import net.tier1234.better_deco.util.ModService;

import javax.annotation.Nullable;

public class FluidServiceLoader
{
    private static volatile FluidServices FLUID_INSTANCE;
    @Nullable
    public static FluidServices getFluidService() {
        if (FLUID_INSTANCE == null) {
            synchronized (FluidServiceLoader.class) {
                if (FLUID_INSTANCE == null) {
                    FLUID_INSTANCE = ModService.load(FluidServices.class);
                }
            }
        }
        return FLUID_INSTANCE;
    }
}
