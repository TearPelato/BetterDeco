package net.tier1234.better_deco;


import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import org.slf4j.Logger;

import java.util.Set;


@Mod.EventBusSubscriber(modid = BetterDeco.MOD_ID, value = Dist.CLIENT)
public class Config {

    private static final Logger LOGGER = BetterDeco.LOGGER;

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    //Sink Category
    private static final ForgeConfigSpec.BooleanValue SINK_ALLOW_ALL_LIQUIDS;
    private static final ForgeConfigSpec.IntValue SINK_CAPACITY_BUCKETS;

    static {
        BUILDER.push("sink_category"); // crea la categoria principale

        SINK_ALLOW_ALL_LIQUIDS = BUILDER
                .comment("If true, sinks can accept all fluid types (not just water).")
                .define("sink_allow_all_liquids", false);

        SINK_CAPACITY_BUCKETS = BUILDER
                .comment("Defines the maximum capacity of sinks in buckets.")
                .defineInRange("sink_capacity_buckets", 3, 1, 10);

        BUILDER.pop(); // chiude la categoria
    }

    public static final ForgeConfigSpec SPEC = BUILDER.build();


    //Getters
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