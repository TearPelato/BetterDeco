package net.tier1234.better_deco.init;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.network.message.CraftRecipePayload;
import net.tier1234.better_deco.network.message.SyncCraftableRecipesPayload;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class ModNetworking {

    @SubscribeEvent
    public static void register(RegisterPayloadHandlersEvent event) {
        PayloadRegistrar registrar = event.registrar("1");

        // Client to Server
        registrar.playToServer(
                CraftRecipePayload.TYPE,
                CraftRecipePayload.STREAM_CODEC,
                CraftRecipePayload::handle
        );

        // Server to Client
        registrar.playToClient(
                SyncCraftableRecipesPayload.TYPE,
                SyncCraftableRecipesPayload.STREAM_CODEC,
                SyncCraftableRecipesPayload::handle
        );
    }
}