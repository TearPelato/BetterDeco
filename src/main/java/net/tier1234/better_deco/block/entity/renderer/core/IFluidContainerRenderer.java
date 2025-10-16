package net.tier1234.better_deco.block.entity.renderer.core;

import net.tier1234.better_deco.block.entity.custom.FluidContainerBlockEntity;
import org.jetbrains.annotations.Nullable;

public interface IFluidContainerRenderer {
    @Nullable
    FluidContainerBlockEntity getFluidContainer();

}
