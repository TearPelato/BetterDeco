package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.FluidStack;
import net.tearpelato.deco_lib.api.fluid.block_entity.FluidContainerBlockEntity;
import net.tier1234.better_deco.Config;
import net.tier1234.better_deco.init.ModBlockEntities;
import org.lwjgl.system.NonnullDefault;

@NonnullDefault
public class KitchenSinkBlockEntity extends FluidContainerBlockEntity {

    public KitchenSinkBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.KITCHEN_SINK.get(), pos, state,
                Config.Client.getSinkCapacityBuckets() * FluidContainerBlockEntity.BUCKET_VOLUME);
    }

    public boolean addFluid(Fluid fluid) {
        int current = getFluidStack().getAmount();
        int max = getCapacity();
        if (isEmpty() || getFluidStack().getFluid() == fluid) {
            if (current + BUCKET_VOLUME <= max) {
                setFluidStack(new FluidStack(fluid, current + BUCKET_VOLUME));
                return true;
            }
        }
        return false;
    }

    public void removeFluid(int amount) {
        int remaining = getFluidStack().getAmount() - amount;
        setFluidStack(new FluidStack(getFluidStack().getFluid(), Math.max(remaining, 0)));
    }
}