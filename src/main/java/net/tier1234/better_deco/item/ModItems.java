package net.tier1234.better_deco.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.item.custom.ChiselItem;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterDeco.MOD_ID);

//Chisel

    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(new Item.Properties().durability(250)));
    public static final DeferredItem<Item> GOLD_CHISEL = ITEMS.register("gold_chisel",
            () -> new ChiselItem(new Item.Properties().durability(100)));
    public static final DeferredItem<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(new Item.Properties().durability(1561)));
    public static final DeferredItem<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            () -> new ChiselItem(new Item.Properties().durability(2031)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
