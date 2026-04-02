package net.tier1234.better_deco.compat.everycomp;

import net.liukrast.compat.Compat;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.PaletteStrategies;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.SimpleModule;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.tier1234.better_deco.Constants;
import net.tier1234.better_deco.block.custom.KitchenCounterBlock;
import net.tier1234.better_deco.creative_tabs.BundledTabs;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.init.ModBundledTabs;

@Compat("everycomp")
public class EveryCompatModule extends SimpleModule {
    public final SimpleEntrySet<WoodType, KitchenCounterBlock> kitchenCounter;
    private static EveryCompatModule INSTANCE;



    public EveryCompatModule(IEventBus bus) {
        super(Constants.MOD_ID, "bd", Constants.MOD_ID);
        EveryCompatAPI.registerModule(this);
        bus.register(this);
        INSTANCE = this;
        kitchenCounter = SimpleEntrySet.<WoodType, KitchenCounterBlock>builder(WoodType.class, "kitchen_counter",
                        () -> ModBlocks.OAK_KITCHEN_COUNTER.get(),
                        () -> VanillaWoodTypes.OAK,
                        w -> new KitchenCounterBlock(Utils.copyPropertySafe(w.planks)))
                .copyParentDrop()
                .defaultRecipe()
                .addTexture(modRes("block/furniture/kitchen_counter/oak_kitchen_counter"), PaletteStrategies.PLANKS_STANDARD)
                .noTab()
                //IT WORK OKAY DON'T TOUCH IT
                // .setTab(() -> ModCreativeTabs.BETTER_DECO.get())
                .build();

        this.addEntry(kitchenCounter);
    }

    /**
     * Class where registered the Custom filter tab for registering all the custom blocks
     * created with everycompat: It also features the event register
     * */
    public static class EveryCompatCreativeTabRegister {

        public static final BundledTabs EVERYCOMPAT_TAB = ModBundledTabs.register(
                        BundledTabs.builder()
                                .icon(new ItemStack(Blocks.BARREL))
                                .title(Component.translatable("bundled_tab.everycompat"))
                                .displayItems((parameters, output) -> {
                                    EveryCompatModule module = getModuleInstance();

                                    /**
                                     * Method to register all entries, I don't think i'll use that cause i'd like to register
                                     * my blocks with my logic*/
                                    /* if (module != null) {
                                        module.getEntries().forEach(entry -> {
                                            if (entry instanceof SimpleEntrySet<?, ?> entrySet) {
                                                entrySet.blocks.values().forEach(block -> {
                                                    output.accept(block.asItem());
                                               });
                                           }
                                       });
                                    }*/

                                     if (module != null) {
                                        module.kitchenCounter.blocks.forEach((woodType, block) -> {
                                            output.accept(block.asItem());
                                        });

                                    }
                                })
                                .build()
        );

        private static EveryCompatModule getModuleInstance() {
            return EveryCompatModule.INSTANCE;
        }

        public static void register(RegisterEvent.RegisterHelper<CreativeModeTab> ignored) {
            //It's okay if empty
        }
    }
/**
 * Event where the tab is registered and initializated
 **/
    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(), EveryCompatCreativeTabRegister::register);
    }
}