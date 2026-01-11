package net.tier1234.better_deco.event;

import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.ContainerScreenEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.creative_tabs.BundledTabSelector;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class ModClientEvents {

    private static final boolean IS_CLIENT = FMLEnvironment.dist == Dist.CLIENT;
/*
    @SubscribeEvent
    public static void onPlayerJoinLevel(ClientPlayerNetworkEvent.LoggingIn event) {
        if (!IS_CLIENT) return;
        BundledTabSelector.bootstrap();
    }
*/
    @SubscribeEvent
    public static void onContainerInit(ScreenEvent.Init.Post event) {
        if (!(event.getScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().init(event);
    }

    @SubscribeEvent
    public static void onContainerRender(ContainerScreenEvent.Render.Background event) {
        if (!(event.getContainerScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().renderBackground(event);
    }

    @SubscribeEvent
    public static void onContainerClose(ScreenEvent.Closing event) {
        if (!(event.getScreen() instanceof CreativeModeInventoryScreen)) return;
        BundledTabSelector.bootstrap().onClose(event);
    }
}