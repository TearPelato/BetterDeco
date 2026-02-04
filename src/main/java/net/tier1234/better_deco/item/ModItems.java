package net.tier1234.better_deco.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.item.custom.ChiselItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,BetterDeco.MOD_ID);

//Chisel

    public static final RegistryObject<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(new Item.Properties().durability(250)));
    public static final RegistryObject<Item> GOLD_CHISEL = ITEMS.register("gold_chisel",
            () -> new ChiselItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(new Item.Properties().durability(1561)));
    public static final RegistryObject<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            () -> new ChiselItem(new Item.Properties().durability(2031)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
