package net.tier1234.better_deco.screen;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tier1234.better_deco.screen.custom.*;
import net.tier1234.better_deco.util.Constants;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, Constants.MOD_ID);


    public static final RegistryObject< MenuType<TecqueMenu>> TECQUE_MENU =
            registerMenuType("tecque_menu", TecqueMenu::new);

    public static final RegistryObject< MenuType<PedestalMenu>> PEDESTAL_MENU =
            registerMenuType("pedestal_menu", PedestalMenu::new);

    public static final RegistryObject< MenuType<CrateMenu>> CRATE_MENU =
            registerMenuType("crate_menu", CrateMenu::new);

    public static final RegistryObject< MenuType<ShelfMenu>> SHELF_MENU =
            registerMenuType("shelf_menu", ShelfMenu::new);

    public static final RegistryObject< MenuType<OvenMenu>> OVEN_MENU =
            registerMenuType("oven_menu", OvenMenu::new);

    public static final RegistryObject< MenuType<MicrowaveMenu>> MICROWAVE_MENU =
            registerMenuType("microwave_menu", MicrowaveMenu::new);

    public static final RegistryObject< MenuType<SinkMenu>> SINK_MENU =
            registerMenuType("sink_menu", SinkMenu::new);

    public static final RegistryObject< MenuType<FreezerMenu>> FREEZER_MENU =
            registerMenuType("freezer_menu", FreezerMenu::new);



    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
