package net.tier1234.better_deco.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

import net.tier1234.better_deco.screen.custom.OvenMenu;


public class OvenFuelSlot extends SlotItemHandler {

    private final OvenMenu  menu;

    public OvenFuelSlot(OvenMenu menu,IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
        this.menu = menu;
    }


    @Override
    public boolean mayPlace(ItemStack stack) {
        return menu.isFuelItem(stack);
    }

    @Override
    public int getMaxStackSize(ItemStack itemStack) {
        return isBucket(itemStack) ? 1 : super.getMaxStackSize(itemStack);
    }

    public static boolean isBucket(ItemStack itemStack) {
        return itemStack.is(Items.BUCKET);
    }
}
