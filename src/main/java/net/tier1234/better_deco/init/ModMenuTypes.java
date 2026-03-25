package net.tier1234.better_deco.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.screen.custom.*;
import net.tier1234.better_deco.util.Constants;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, Constants.MOD_ID);


    public static final DeferredHolder<MenuType<?>, MenuType<TecqueMenu>> TECQUE_MENU =
            registerMenuType("tecque_menu", TecqueMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<PedestalMenu>> PEDESTAL_MENU =
            registerMenuType("pedestal_menu", PedestalMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<CrateMenu>> CRATE_MENU =
            registerMenuType("crate_menu", CrateMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<ShelfMenu>> SHELF_MENU =
            registerMenuType("shelf_menu", ShelfMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<OvenMenu>> OVEN_MENU =
            registerMenuType("oven_menu", OvenMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<MicrowaveMenu>> MICROWAVE_MENU =
            registerMenuType("microwave_menu", MicrowaveMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<SinkMenu>> SINK_MENU =
            registerMenuType("sink_menu", SinkMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<FreezerMenu>> FREEZER_MENU =
            registerMenuType("freezer_menu", FreezerMenu::new);






    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name,
                                                                                                               IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
