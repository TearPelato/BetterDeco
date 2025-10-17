package net.tier1234.better_deco;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.block.entity.renderer.custom.*;
import net.tier1234.better_deco.entity.ModEntities;
import net.tier1234.better_deco.entity.client.ChairRenderer;
import net.tier1234.better_deco.screen.ModMenuTypes;
import net.tier1234.better_deco.screen.custom.*;


@Mod(value = BetterDeco.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class BetterDecoClient {


    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.CHAIR_ENTITY.get(), ChairRenderer::new);
    }
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {

        event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.GLASS_TECQUE.get(), TecqueBlockEntityRenderer::new);




    }
    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.TECQUE_MENU.get(), TecqueScreen::new);
        event.register(ModMenuTypes.PEDESTAL_MENU.get(), PedestalScreen::new);
        event.register(ModMenuTypes.CRATE_MENU.get(), CrateScreen::new);
        event.register(ModMenuTypes.SHELF_MENU.get(), ShelfScreen::new);
        event.register(ModMenuTypes.OVEN_MENU.get(), OvenScreen::new);
        event.register(ModMenuTypes.MICROWAVE_MENU.get(), MicrowaveScreen::new);
        event.register(ModMenuTypes.SINK_MENU.get(), SinkScreen::new);
    }
}