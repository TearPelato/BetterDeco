package net.tier1234.better_deco.screen.custom;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;

public class FreezerFuelSlot extends Slot
{
    private final FreezerMenu container;

    public FreezerFuelSlot(FreezerMenu menu, Container container, int index, int x, int y)
    {
        super(container, index, x, y);
        this.container = menu;
    }

}