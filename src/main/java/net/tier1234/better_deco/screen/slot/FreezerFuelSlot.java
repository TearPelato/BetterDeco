package net.tier1234.better_deco.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.transfer.IndexModifier;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ResourceHandlerSlot;
import net.tier1234.better_deco.block.entity.custom.FreezerBlockEntity;
import net.tier1234.better_deco.screen.custom.FreezerMenu;

public class FreezerFuelSlot extends ResourceHandlerSlot {
    private final FreezerMenu menu;

    public FreezerFuelSlot(FreezerMenu menu, ResourceHandler<ItemResource> handler, IndexModifier<ItemResource> slotModifier, int handlerSlot, int xPosition, int yPosition) {
        super(handler, slotModifier, handlerSlot, xPosition, yPosition);
        this.menu = menu;
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return FreezerBlockEntity.FreezerFuelValues.isValid(stack);
    }

    @Override
    public int getMaxStackSize() {
        return super.getMaxStackSize();
    }
}
