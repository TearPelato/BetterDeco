package net.tier1234.better_deco.init;

import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;

public class ModInventory extends ItemStacksResourceHandler {
    private IChanged change = null;
    public ModInventory(int size, IChanged change) {
        super(size);
        this.change = change;
    }

    public ModInventory(int size) {
        super(size);
    }

    @Override
    protected void onContentsChanged(int index, ItemStack previousContents) {
        super.onContentsChanged(index, previousContents);
        if(change != null)
            change.changed(index);
    }

    public interface IChanged {
        public void changed(int slot);
    }
}