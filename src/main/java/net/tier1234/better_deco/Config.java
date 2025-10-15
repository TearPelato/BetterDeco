package net.tier1234.better_deco;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.Set;

@EventBusSubscriber(modid = BetterDeco.MOD_ID)
public class Config {

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue SINK_ALLOW_ALL_LIQUIDS =
            BUILDER.comment("If true, sinks can accept all fluid types (not just water).")
                    .define("sink_allow_all_liquids", false);

    private static final ModConfigSpec.IntValue SINK_CAPACITY_BUCKETS =
            BUILDER.comment("Defines the maximum capacity of sinks in buckets.")
                    .defineInRange("sink_capacity_buckets", 3, 1, 10
                    );


    public static final ModConfigSpec SPEC = BUILDER.build();

    // Optional example set
    public static Set<Item> items;

    private static boolean validateItemName(final Object obj) {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }

    // === Getters ===

    public static boolean isSinkUniversal() {
        return SINK_ALLOW_ALL_LIQUIDS.get();
    }

    public static int getSinkCapacityBuckets() {
        return SINK_CAPACITY_BUCKETS.get();
    }

    // === Config event handling ===

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        // Called when config is loaded or reloaded
        BetterDeco.LOGGER.info("BetterDeco Config loaded: sink_allow_all_liquids={}, sink_capacity_buckets={}",
                isSinkUniversal(), getSinkCapacityBuckets());
    }
}
