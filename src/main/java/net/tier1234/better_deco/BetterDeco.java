package net.tier1234.better_deco;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.block.entity.renderer.*;
import net.tier1234.better_deco.creative_tabs.ModCreativeTabs;
import net.tier1234.better_deco.entity.ModEntities;
import net.tier1234.better_deco.entity.client.ChairRenderer;
import net.tier1234.better_deco.item.ModItems;
import net.tier1234.better_deco.recipe.ModRecipes;
import net.tier1234.better_deco.screen.ModMenuTypes;
import net.tier1234.better_deco.screen.custom.*;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BetterDeco.MOD_ID)
public class BetterDeco {
    public static final String MOD_ID = "better_deco";
    private static final Logger LOGGER = LogUtils.getLogger();
    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public BetterDeco(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for mod loading

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    public static ResourceLocation id(String path, Object... args) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, String.format(path, args));
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.CHAIR_ENTITY.get(), ChairRenderer::new);
        }
        @SubscribeEvent
        public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.PEDESTAL_BE.get(), PedestalBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.GLASS_TECQUE.get(), TecqueBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.SHELF_BE.get(), ShelfBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.DIGITAL_CLOCK.get(), DigitalClockBlockEntityRenderer::new);
            event.registerBlockEntityRenderer(ModBlockEntities.KITCHEN_SINK.get(), KitchenSinkBlockEntityRenderer::new);
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
}