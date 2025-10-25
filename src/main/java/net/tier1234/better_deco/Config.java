package net.tier1234.better_deco;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.slf4j.Logger;

import java.util.Set;

@EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class Config {

    private static final Logger LOGGER = BetterDeco.LOGGER;

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.BooleanValue SINK_ALLOW_ALL_LIQUIDS;
    private static final ModConfigSpec.IntValue SINK_CAPACITY_BUCKETS;

    static {
        BUILDER.push("sink_category");

        SINK_ALLOW_ALL_LIQUIDS = BUILDER
                .comment("If true, sinks can accept all fluid types (not just water).")
                .define("sink_allow_all_liquids", false);

        SINK_CAPACITY_BUCKETS = BUILDER
                .comment("Defines the maximum capacity of sinks in buckets.")
                .defineInRange("sink_capacity_buckets", 3, 1, 10);

        BUILDER.pop();
    }

    public static final ModConfigSpec SPEC = BUILDER.build();


    public static Set<Item> items;

    private static boolean validateItemName(final Object obj) {
        return obj instanceof String itemName &&
                BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }

    public static boolean isSinkUniversal() {
        return SINK_ALLOW_ALL_LIQUIDS.get();
    }

    public static int getSinkCapacityBuckets() {
        return SINK_CAPACITY_BUCKETS.get();
    }


    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading event) {
        LOGGER.info("BetterDeco Config loaded: sink_allow_all_liquids={}, sink_capacity_buckets={}",
                isSinkUniversal(), getSinkCapacityBuckets());
    }
}