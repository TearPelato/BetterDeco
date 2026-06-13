package net.tier1234.better_deco.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.tier1234.better_deco.block.entity.custom.FreezerBlockEntity;
import net.tier1234.better_deco.screen.custom.FreezerMenu;

public class FreezerFuelSlot extends SlotItemHandler {
    private final FreezerMenu menu;

    public FreezerFuelSlot(FreezerMenu menu,IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
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
