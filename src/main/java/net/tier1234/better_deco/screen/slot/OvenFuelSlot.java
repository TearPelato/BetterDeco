package net.tier1234.better_deco.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.transfer.IndexModifier;
import net.neoforged.neoforge.transfer.ResourceHandler;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ResourceHandlerSlot;
import net.tier1234.better_deco.screen.custom.OvenMenu;

/**
 * Same behaviours of
 * {@link net.minecraft.world.inventory.FurnaceFuelSlot}
 * but as a {@link ResourceHandlerSlot}
 *using OvenMenu
 * */
public class OvenFuelSlot extends ResourceHandlerSlot {

    private final OvenMenu  menu;

    public OvenFuelSlot(OvenMenu menu,ResourceHandler<ItemResource> handler, IndexModifier<ItemResource> slotModifier, int handlerSlot, int xPosition, int yPosition) {
        super(handler, slotModifier, handlerSlot, xPosition, yPosition);
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
