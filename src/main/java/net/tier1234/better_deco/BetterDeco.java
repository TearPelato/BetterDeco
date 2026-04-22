package net.tier1234.better_deco;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.tier1234.better_deco.init.*;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BetterDeco.MOD_ID)
public class BetterDeco {
    public static final String MOD_ID = "better_deco";
    public static final Logger LOGGER = LogUtils.getLogger();
    
    public BetterDeco(IEventBus modEventBus, ModContainer modContainer) {
    

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    public static ResourceLocation id(String path, Object... args) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, String.format(path, args));
    }


}
