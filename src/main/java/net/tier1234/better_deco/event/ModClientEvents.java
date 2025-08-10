package net.tier1234.better_deco.event;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.neoforge.client.event.ContainerScreenEvent;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.item.creative_tabs.BundledTabSelector;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value =  Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onPlayerJoinLevel(ClientPlayerNetworkEvent.LoggingIn event) {
        BundledTabSelector.bootstrap();
    }
@SubscribeEvent
    public static void onContainerInit(ScreenEvent.Init.Post event) {
        BundledTabSelector.bootstrap().init(event);
    }
@SubscribeEvent
    public static void onContainerRender(ContainerScreenEvent.Render.Background event) {
        BundledTabSelector.bootstrap().renderBackground(event);
    }
    @SubscribeEvent
    public static void onContainerClose(ScreenEvent.Closing event) {
        BundledTabSelector.bootstrap().onClose(event);
    }
}
