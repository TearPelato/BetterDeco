package net.tier1234.better_deco.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

@Deprecated(since = "26.1", forRemoval = false)
/**Class where delcaring Oven Output Slot and what you can do inside that slot
 * Removing when finally understood the new ItemStack system*/
public class MicrowaveOutputSlot extends SlotItemHandler {

    public MicrowaveOutputSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return false;
    }

    @Override
    public int getMaxStackSize() {
        return 1;
    }
}
