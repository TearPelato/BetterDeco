package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.tearpelato.deco_lib.api.fluid.block_entity.FluidContainerBlockEntity;
import net.tier1234.better_deco.Config;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.screen.custom.SinkMenu;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.NonnullDefault;

@NonnullDefault
public class KitchenSinkBlockEntity extends FluidContainerBlockEntity implements MenuProvider {

    public KitchenSinkBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.KITCHEN_SINK.get(), pos, state,
                Config.getSinkCapacityBuckets() * FluidContainerBlockEntity.BUCKET_VOLUME);
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

    @Override
    public Component getDisplayName() {
        return Component.translatable("gui.better_deco.sink");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return new SinkMenu(i, inventory,this);
    }
}