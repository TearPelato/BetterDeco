package net.tier1234.better_deco.init;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;


/**
 * Class core to create the blockitem automatically whe registering a new Block,
 * actually empty, maybe with new custom items in the future
 * */
public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterDeco.MOD_ID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
