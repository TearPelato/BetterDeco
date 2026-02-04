package net.tier1234.better_deco.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;

@Deprecated(forRemoval = true)
public class FluidInteractionUtil {

    public static Fluid getFluidFromItemStack(ItemStack stack) {
        if (stack.isEmpty()) {
            return Fluids.EMPTY;
        }

        // Get the IFluidHandlerItem capability from the ItemStack
        IFluidHandlerItem fluidHandler = stack.getCapability(Capabilities.FluidHandler.ITEM);

        if (fluidHandler != null) {
            // Check the fluid in the first tank (most buckets/standard containers have one tank)
            FluidStack fluidInHandler = fluidHandler.getFluidInTank(0);
            if (!fluidInHandler.isEmpty()) {
                return fluidInHandler.getFluid();
            }
        }

        return Fluids.EMPTY;
    }
}