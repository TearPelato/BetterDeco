package net.tier1234.better_deco.event;


import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.item.creative_tabs.BundledTabSelector;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value =  Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onPlayerJoinLevel(ClientPlayerNetworkEvent.LoggingIn event) {
        BundledTabSelector.bootstrap();
    }


}
