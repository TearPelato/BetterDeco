package net.tier1234.better_deco.init;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.creative_tabs.BundledTabs;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterDeco.MOD_ID);

    public static final
    Supplier<CreativeModeTab> BETTER_DECO = CREATIVE_MODE_TAB.register(
            "better_deco",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 1)
                    .withSearchBar()
                    .title(Component.translatable("creativetab.better_deco.better_deco"))
                    .icon(() -> new ItemStack(ModBlocks.OAK_BARREL))
                    .displayItems((parameters, output) -> {
                        var provider = parameters.holders();
                        List<BundledTabs> filters = ModBundledTabs.getFilters();
                        Collections.reverse(filters);
                        filters.forEach(tab -> tab.populate(provider));
                        filters.stream()
                                .flatMap(filter -> filter.getDisplayItems().stream())
                                .forEach(output::accept);
                    })
                    .build()
    );





    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
