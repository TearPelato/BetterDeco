package net.tier1234.better_deco.creative_tabs;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.tier1234.better_deco.block.ModBlocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * BundledTabs from VanillaBackport, used with BlackGear's permission.
 * @author BlackGear
 */
public class ModBundledTabs {
    private static final Map<BundledTabs, FeatureFlag> FILTERS = new HashMap<>();

    public static final BundledTabs BUILDINGS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.buildings.title"))
                    .icon(new ItemStack(ModBlocks.OAK_BARREL.get()))
                    .displayItems((provider, output) -> {

                        output.accept(ModBlocks.OAK_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.OAK_PILED_PLANKS.get());
                        output.accept(ModBlocks.OAK_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.OAK_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.OAK_SOFT_BRICKS.get());
                        output.accept(ModBlocks.OAK_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.OAK_BARREL.get());
                        //Spruce
                        output.accept(ModBlocks.SPRUCE_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.SPRUCE_PILED_PLANKS.get());
                        output.accept(ModBlocks.SPRUCE_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.SPRUCE_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.SPRUCE_SOFT_BRICKS.get());
                        output.accept(ModBlocks.SPRUCE_PLANKS_PILLAR.get());
                        output.accept(Blocks.BARREL);
                        //Birch
                        output.accept(ModBlocks.BIRCH_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.BIRCH_PILED_PLANKS.get());
                        output.accept(ModBlocks.BIRCH_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.BIRCH_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.BIRCH_SOFT_BRICKS.get());
                        output.accept(ModBlocks.BIRCH_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.BIRCH_BARREL.get());
                        //Jungle
                        output.accept(ModBlocks.JUNGLE_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.JUNGLE_PILED_PLANKS.get());
                        output.accept(ModBlocks.JUNGLE_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.JUNGLE_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.JUNGLE_SOFT_BRICKS.get());
                        output.accept(ModBlocks.JUNGLE_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.JUNGLE_BARREL.get());
                        //Acacia
                        output.accept(ModBlocks.ACACIA_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.ACACIA_PILED_PLANKS.get());
                        output.accept(ModBlocks.ACACIA_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.ACACIA_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.ACACIA_SOFT_BRICKS.get());
                        output.accept(ModBlocks.ACACIA_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.ACACIA_BARREL.get());
                        //DarkOak
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.DARK_OAK_PILED_PLANKS.get());
                        output.accept(ModBlocks.DARK_OAK_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.DARK_OAK_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.DARK_OAK_SOFT_BRICKS.get());
                        output.accept(ModBlocks.DARK_OAK_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.DARK_OAK_BARREL.get());
                        //Mangrove
                        output.accept(ModBlocks.MANGROVE_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.MANGROVE_PILED_PLANKS.get());
                        output.accept(ModBlocks.MANGROVE_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.MANGROVE_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.MANGROVE_SOFT_BRICKS.get());
                        output.accept(ModBlocks.MANGROVE_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.MANGROVE_BARREL.get());
                        //Cherry
                        output.accept(ModBlocks.CHERRY_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.CHERRY_PILED_PLANKS.get());
                        output.accept(ModBlocks.CHERRY_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.CHERRY_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.CHERRY_SOFT_BRICKS.get());
                        output.accept(ModBlocks.CHERRY_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.CHERRY_BARREL.get());
                        //Bamboo
                        output.accept(ModBlocks.BAMBOO_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.BAMBOO_PILED_PLANKS.get());
                        output.accept(ModBlocks.BAMBOO_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.BAMBOO_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.BAMBOO_SOFT_BRICKS.get());
                        output.accept(ModBlocks.BAMBOO_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.BAMBOO_BARREL.get());
                        //Crimson
                        output.accept(ModBlocks.CRIMSON_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_PILED_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.CRIMSON_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.CRIMSON_SOFT_BRICKS.get());
                        output.accept(ModBlocks.CRIMSON_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.CRIMSON_BARREL.get());
                        //Warped
                        output.accept(ModBlocks.WARPED_VERTICAL_PLANKS.get());
                        output.accept(ModBlocks.WARPED_PILED_PLANKS.get());
                        output.accept(ModBlocks.WARPED_POLISHED_PLANKS.get());
                        output.accept(ModBlocks.WARPED_PLANKS_BRICKS.get());
                        output.accept(ModBlocks.WARPED_SOFT_BRICKS.get());
                        output.accept(ModBlocks.WARPED_PLANKS_PILLAR.get());
                        output.accept(ModBlocks.WARPED_BARREL.get());

                        output.accept(ModBlocks.ANDESITE_ARRAY_BRICKS.get());
                        output.accept(ModBlocks.ANDESITE_MIXED_BRICKS.get());
                        output.accept(ModBlocks.ANDESITE_MOSAIC_BRICKS.get());
                        output.accept(ModBlocks.ANDESITE_BRICKS.get());
                        output.accept(ModBlocks.RAW_ANDESITE.get());

                        output.accept(ModBlocks.DIORITE_ARRAY_BRICKS.get());
                        output.accept(ModBlocks.DIORITE_MIXED_BRICKS.get());
                        output.accept(ModBlocks.DIORITE_MOSAIC_BRICKS.get());
                        output.accept(ModBlocks.DIORITE_BRICKS.get());
                        output.accept(ModBlocks.RAW_DIORITE.get());

                        output.accept(ModBlocks.GRANITE_ARRAY_BRICKS.get());
                        output.accept(ModBlocks.GRANITE_MIXED_BRICKS.get());
                        output.accept(ModBlocks.GRANITE_MOSAIC_BRICKS.get());
                        output.accept(ModBlocks.GRANITE_BRICKS.get());
                        output.accept(ModBlocks.RAW_GRANITE.get());



                    })
                    .build()
    );

    public static final BundledTabs FURNITURE = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.furniture.title"))
                    .icon(new ItemStack(ModBlocks.OAK_CHAIR.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.SPRUCE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.BIRCH_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.JUNGLE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.ACACIA_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.DARK_OAK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.MANGROVE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.CHERRY_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.BAMBOO_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.CRIMSON_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.WARPED_KITCHEN_COUNTER.get());

                        output.accept(ModBlocks.WHITE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.LIGHT_GRAY_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.GRAY_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.BLACK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.RED_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.ORANGE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.YELLOW_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.LIME_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.GREEN_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.CYAN_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.LIGHT_BLUE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.BLUE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.PURPLE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.MAGENTA_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.PINK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.BROWN_KITCHEN_COUNTER.get());

                        output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER.get());

                        output.accept(ModBlocks.OAK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.SPRUCE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.BIRCH_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.JUNGLE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.ACACIA_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.DARK_OAK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.MANGROVE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.CHERRY_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.BAMBOO_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.CRIMSON_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.WARPED_KITCHEN_DRAWER.get());

                        output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get());

                        output.accept(ModBlocks.WHITE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.LIGHT_GRAY_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.GRAY_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.BLACK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.RED_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.ORANGE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.YELLOW_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.LIME_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.GREEN_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.CYAN_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.LIGHT_BLUE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.BLUE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.PURPLE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.MAGENTA_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.PINK_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.BROWN_KITCHEN_DRAWER.get());

                        output.accept(ModBlocks.OAK_SINK.get());
                        output.accept(ModBlocks.SPRUCE_SINK.get());
                        output.accept(ModBlocks.BIRCH_SINK.get());
                        output.accept(ModBlocks.JUNGLE_SINK.get());
                        output.accept(ModBlocks.ACACIA_SINK.get());
                        output.accept(ModBlocks.DARK_OAK_SINK.get());
                        output.accept(ModBlocks.MANGROVE_SINK.get());
                        output.accept(ModBlocks.CHERRY_SINK.get());
                        output.accept(ModBlocks.BAMBOO_SINK.get());
                        output.accept(ModBlocks.CRIMSON_SINK.get());
                        output.accept(ModBlocks.WARPED_SINK.get());

                        output.accept(ModBlocks.OAK_SINK_DARK.get());
                        output.accept(ModBlocks.SPRUCE_SINK_DARK.get());
                        output.accept(ModBlocks.BIRCH_SINK_DARK.get());
                        output.accept(ModBlocks.JUNGLE_SINK_DARK.get());
                        output.accept(ModBlocks.ACACIA_SINK_DARK.get());
                        output.accept(ModBlocks.DARK_OAK_SINK_DARK.get());
                        output.accept(ModBlocks.MANGROVE_SINK_DARK.get());
                        output.accept(ModBlocks.CHERRY_SINK_DARK.get());
                        output.accept(ModBlocks.BAMBOO_SINK_DARK.get());
                        output.accept(ModBlocks.CRIMSON_SINK_DARK.get());
                        output.accept(ModBlocks.WARPED_SINK_DARK.get());

                        output.accept(ModBlocks.WHITE_SINK.get());
                        output.accept(ModBlocks.LIGHT_GRAY_SINK.get());
                        output.accept(ModBlocks.GRAY_SINK.get());
                        output.accept(ModBlocks.BLACK_SINK.get());
                        output.accept(ModBlocks.RED_SINK.get());
                        output.accept(ModBlocks.ORANGE_SINK.get());
                        output.accept(ModBlocks.YELLOW_SINK.get());
                        output.accept(ModBlocks.LIME_SINK.get());
                        output.accept(ModBlocks.GREEN_SINK.get());
                        output.accept(ModBlocks.CYAN_SINK.get());
                        output.accept(ModBlocks.LIGHT_BLUE_SINK.get());
                        output.accept(ModBlocks.BLUE_SINK.get());
                        output.accept(ModBlocks.PURPLE_SINK.get());
                        output.accept(ModBlocks.MAGENTA_SINK.get());
                        output.accept(ModBlocks.PINK_SINK.get());
                        output.accept(ModBlocks.BROWN_SINK.get());

                        output.accept(ModBlocks.OAK_CABINET.get());
                        output.accept(ModBlocks.SPRUCE_CABINET.get());
                        output.accept(ModBlocks.BIRCH_CABINET.get());
                        output.accept(ModBlocks.JUNGLE_CABINET.get());
                        output.accept(ModBlocks.ACACIA_CABINET.get());
                        output.accept(ModBlocks.DARK_OAK_CABINET.get());
                        output.accept(ModBlocks.MANGROVE_CABINET.get());
                        output.accept(ModBlocks.CHERRY_CABINET.get());
                        output.accept(ModBlocks.BAMBOO_CABINET.get());
                        output.accept(ModBlocks.CRIMSON_CABINET.get());
                        output.accept(ModBlocks.WARPED_CABINET.get());

                        output.accept(ModBlocks.STRIPPED_OAK_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CABINET.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_CABINET.get());

                        output.accept(ModBlocks.WHITE_CABINET.get());
                        output.accept(ModBlocks.LIGHT_GRAY_CABINET.get());
                        output.accept(ModBlocks.GRAY_CABINET.get());
                        output.accept(ModBlocks.BLACK_CABINET.get());
                        output.accept(ModBlocks.RED_CABINET.get());
                        output.accept(ModBlocks.ORANGE_CABINET.get());
                        output.accept(ModBlocks.YELLOW_CABINET.get());
                        output.accept(ModBlocks.LIME_CABINET.get());
                        output.accept(ModBlocks.GREEN_CABINET.get());
                        output.accept(ModBlocks.CYAN_CABINET.get());
                        output.accept(ModBlocks.LIGHT_BLUE_CABINET.get());
                        output.accept(ModBlocks.BLUE_CABINET.get());
                        output.accept(ModBlocks.PURPLE_CABINET.get());
                        output.accept(ModBlocks.MAGENTA_CABINET.get());
                        output.accept(ModBlocks.PINK_CABINET.get());
                        output.accept(ModBlocks.BROWN_CABINET.get());


                        output.accept(ModBlocks.STONE_COUNTER.get());
                        output.accept(ModBlocks.GRANITE_COUNTER.get());
                        output.accept(ModBlocks.DIORITE_COUNTER.get());
                        output.accept(ModBlocks.DEEPSLATE_COUNTER.get());
                        output.accept(ModBlocks.DEEPSLATE_TILE_COUNTER.get());
                        output.accept(ModBlocks.BLACKSTONE_COUNTER.get());
                        output.accept(ModBlocks.SPRUCE_DIORITE_COUNTER.get());
                        output.accept(ModBlocks.DARK_OAK_CALCITE_COUNTER.get());
                        output.accept(ModBlocks.OAK_ANDESITE_COUNTER.get());

                        output.accept(ModBlocks.STONE_DRAWER.get());
                        output.accept(ModBlocks.GRANITE_DRAWER.get());
                        output.accept(ModBlocks.DIORITE_DRAWER.get());
                        output.accept(ModBlocks.DEEPSLATE_DRAWER.get());
                        output.accept(ModBlocks.DEEPSLATE_TILES_DRAWER.get());
                        output.accept(ModBlocks.BLACKSTONE_DRAWER.get());
                        output.accept(ModBlocks.SPRUCE_DIORITE_KITCHEN_DRAWER.get());
                        output.accept(ModBlocks.DARK_OAK_CALCITE_DRAWER.get());
                        output.accept(ModBlocks.OAK_ANDESITE_DRAWER.get());

                        output.accept(ModBlocks.STONE_CABINET.get());
                        output.accept(ModBlocks.GRANITE_CABINET.get());
                        output.accept(ModBlocks.DIORITE_CABINET.get());
                        output.accept(ModBlocks.DEEPSLATE_CABINET.get());
                        output.accept(ModBlocks.DEEPSLATE_TILES_CABINET.get());
                        output.accept(ModBlocks.BLACKSTONE_CABINET.get());
                        output.accept(ModBlocks.SPRUCE_DIORITE_CABINET.get());
                        output.accept(ModBlocks.DARK_OAK_CALCITE_CABINET.get());
                        output.accept(ModBlocks.OAK_ANDESITE_CABINET.get());

                        output.accept(ModBlocks.FRIDGE_DARK.get());
                        output.accept(ModBlocks.FRIDGE_LIGHT.get());

                        output.accept(ModBlocks.TOASTER_DARK.get());
                        output.accept(ModBlocks.TOASTER_LIGHT.get());

                        output.accept(ModBlocks.CHOPPING_BOARD.get());

                        output.accept(ModBlocks.OAK_BEDSIDE.get());
                        output.accept(ModBlocks.SPRUCE_BEDSIDE.get());
                        output.accept(ModBlocks.BIRCH_BEDSIDE.get());
                        output.accept(ModBlocks.JUNGLE_BEDSIDE.get());
                        output.accept(ModBlocks.ACACIA_BEDSIDE.get());
                        output.accept(ModBlocks.MANGROVE_BEDSIDE.get());
                        output.accept(ModBlocks.DARK_OAK_BEDSIDE.get());
                        output.accept(ModBlocks.CHERRY_BEDSIDE.get());
                        output.accept(ModBlocks.BAMBOO_BEDSIDE.get());
                        output.accept(ModBlocks.CRIMSON_BEDSIDE.get());
                        output.accept(ModBlocks.WARPED_BEDSIDE.get());

                        output.accept(ModBlocks.OAK_TABLE.get());
                        output.accept(ModBlocks.SPRUCE_TABLE.get());
                        output.accept(ModBlocks.BIRCH_TABLE.get());
                        output.accept(ModBlocks.JUNGLE_TABLE.get());
                        output.accept(ModBlocks.ACACIA_TABLE.get());
                        output.accept(ModBlocks.DARK_OAK_TABLE.get());
                        output.accept(ModBlocks.MANGROVE_TABLE.get());
                        output.accept(ModBlocks.CHERRY_TABLE.get());
                        output.accept(ModBlocks.BAMBOO_TABLE.get());
                        output.accept(ModBlocks.CRIMSON_TABLE.get());
                        output.accept(ModBlocks.WARPED_TABLE.get());

                        output.accept(ModBlocks.STRIPPED_OAK_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_TABLE.get());

                        output.accept(ModBlocks.OAK_COFFEE_TABLE.get());
                        output.accept(ModBlocks.SPRUCE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.BIRCH_COFFEE_TABLE.get());
                        output.accept(ModBlocks.JUNGLE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.ACACIA_COFFEE_TABLE.get());
                        output.accept(ModBlocks.DARK_OAK_COFFEE_TABLE.get());
                        output.accept(ModBlocks.MANGROVE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.CHERRY_COFFEE_TABLE.get());
                        output.accept(ModBlocks.BAMBOO_COFFEE_TABLE.get());
                        output.accept(ModBlocks.CRIMSON_COFFEE_TABLE.get());
                        output.accept(ModBlocks.WARPED_COFFEE_TABLE.get());

                        output.accept(ModBlocks.STRIPPED_OAK_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_COFFEE_TABLE.get());


                        output.accept(ModBlocks.OAK_DINNING_TABLE.get());
                        output.accept(ModBlocks.SPRUCE_DINNING_TABLE.get());
                        output.accept(ModBlocks.BIRCH_DINNING_TABLE.get());
                        output.accept(ModBlocks.JUNGLE_DINNING_TABLE.get());
                        output.accept(ModBlocks.ACACIA_DINNING_TABLE.get());
                        output.accept(ModBlocks.DARK_OAK_DINNING_TABLE.get());
                        output.accept(ModBlocks.MANGROVE_DINNING_TABLE.get());
                        output.accept(ModBlocks.CHERRY_DINNING_TABLE.get());
                        output.accept(ModBlocks.BAMBOO_DINNING_TABLE.get());
                        output.accept(ModBlocks.CRIMSON_DINNING_TABLE.get());
                        output.accept(ModBlocks.WARPED_DINNING_TABLE.get());

                        output.accept(ModBlocks.STRIPPED_OAK_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_DINNING_TABLE.get());

                        output.accept(ModBlocks.OAK_DESK.get());
                        output.accept(ModBlocks.SPRUCE_DESK.get());
                        output.accept(ModBlocks.BIRCH_DESK.get());
                        output.accept(ModBlocks.JUNGLE_DESK.get());
                        output.accept(ModBlocks.ACACIA_DESK.get());
                        output.accept(ModBlocks.DARK_OAK_DESK.get());
                        output.accept(ModBlocks.MANGROVE_DESK.get());
                        output.accept(ModBlocks.CHERRY_DESK.get());
                        output.accept(ModBlocks.BAMBOO_DESK.get());
                        output.accept(ModBlocks.CRIMSON_DESK.get());
                        output.accept(ModBlocks.WARPED_DESK.get());

                        output.accept(ModBlocks.OAK_DESK_CABINET.get());
                        output.accept(ModBlocks.SPRUCE_DESK_CABINET.get());
                        output.accept(ModBlocks.BIRCH_DESK_CABINET.get());
                        output.accept(ModBlocks.JUNGLE_DESK_CABINET.get());
                        output.accept(ModBlocks.ACACIA_DESK_CABINET.get());
                        output.accept(ModBlocks.DARK_OAK_DESK_CABINET.get());
                        output.accept(ModBlocks.MANGROVE_DESK_CABINET.get());
                        output.accept(ModBlocks.CHERRY_DESK_CABINET.get());
                        output.accept(ModBlocks.BAMBOO_DESK_CABINET.get());
                        output.accept(ModBlocks.CRIMSON_DESK_CABINET.get());
                        output.accept(ModBlocks.WARPED_DESK_CABINET.get());


                        output.accept(ModBlocks.OAK_CHAIR.get());
                        output.accept(ModBlocks.SPRUCE_CHAIR.get());
                        output.accept(ModBlocks.BIRCH_CHAIR.get());
                        output.accept(ModBlocks.JUNGLE_CHAIR.get());
                        output.accept(ModBlocks.ACACIA_CHAIR.get());
                        output.accept(ModBlocks.DARK_OAK_CHAIR.get());
                        output.accept(ModBlocks.MANGROVE_CHAIR.get());
                        output.accept(ModBlocks.CHERRY_CHAIR.get());
                        output.accept(ModBlocks.BAMBOO_CHAIR.get());
                        output.accept(ModBlocks.CRIMSON_CHAIR.get());
                        output.accept(ModBlocks.WARPED_CHAIR.get());

                        output.accept(ModBlocks.STRIPPED_OAK_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CHAIR.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_CHAIR.get());

                        output.accept(ModBlocks.WITHE_SOFA.get());
                        output.accept(ModBlocks.LIGHT_GREY_SOFA.get());
                        output.accept(ModBlocks.GREY_SOFA.get());
                        output.accept(ModBlocks.BLACK_SOFA.get());
                        output.accept(ModBlocks.RED_SOFA.get());
                        output.accept(ModBlocks.ORANGE_SOFA.get());
                        output.accept(ModBlocks.YELLOW_SOFA.get());
                        output.accept(ModBlocks.LIME_SOFA.get());
                        output.accept(ModBlocks.GREEN_SOFA.get());
                        output.accept(ModBlocks.CYAN_SOFA.get());
                        output.accept(ModBlocks.LIGHT_BLUE_SOFA.get());
                        output.accept(ModBlocks.BLUE_SOFA.get());
                        output.accept(ModBlocks.PURPLE_SOFA.get());
                        output.accept(ModBlocks.MAGENTA_SOFA.get());
                        output.accept(ModBlocks.PINK_SOFA.get());
                        output.accept(ModBlocks.BROWN_SOFA.get());

                        output.accept(ModBlocks.WITHE_STOOL.get());
                        output.accept(ModBlocks.LIGHT_GREY_STOOL.get());
                        output.accept(ModBlocks.GREY_STOOL.get());
                        output.accept(ModBlocks.BLACK_STOOL.get());
                        output.accept(ModBlocks.RED_STOOL.get());
                        output.accept(ModBlocks.ORANGE_STOOL.get());
                        output.accept(ModBlocks.YELLOW_STOOL.get());
                        output.accept(ModBlocks.LIME_STOOL.get());
                        output.accept(ModBlocks.GREEN_STOOL.get());
                        output.accept(ModBlocks.CYAN_STOOL.get());
                        output.accept(ModBlocks.LIGHT_BLUE_STOOL.get());
                        output.accept(ModBlocks.BLUE_STOOL.get());
                        output.accept(ModBlocks.PURPLE_STOOL.get());
                        output.accept(ModBlocks.MAGENTA_STOOL.get());
                        output.accept(ModBlocks.PINK_STOOL.get());
                        output.accept(ModBlocks.BROWN_STOOL.get());
                    })
                    .build()
    );

    public static final BundledTabs FURNITURE_EXTRAS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.utilities.title"))
                    .icon(new ItemStack(ModBlocks.OAK_CRATE.get()))
                    .displayItems((provider, output) -> {


                        output.accept(ModBlocks.OAK_CRATE.get());
                        output.accept(ModBlocks.SPRUCE_CRATE.get());
                        output.accept(ModBlocks.BIRCH_CRATE.get());
                        output.accept(ModBlocks.JUNGLE_CRATE.get());
                        output.accept(ModBlocks.ACACIA_CRATE.get());
                        output.accept(ModBlocks.MANGROVE_CRATE.get());
                        output.accept(ModBlocks.DARK_OAK_CRATE.get());
                        output.accept(ModBlocks.CHERRY_CRATE.get());
                        output.accept(ModBlocks.BAMBOO_CRATE.get());
                        output.accept(ModBlocks.CRIMSON_CRATE.get());
                        output.accept(ModBlocks.WARPED_CRATE.get());


                        output.accept(ModBlocks.OAK_SHELF.get());
                        output.accept(ModBlocks.SPRUCE_SHELF.get());
                        output.accept(ModBlocks.BIRCH_SHELF.get());
                        output.accept(ModBlocks.JUNGLE_SHELF.get());
                        output.accept(ModBlocks.ACACIA_SHELF.get());
                        output.accept(ModBlocks.DARK_OAK_SHELF.get());
                        output.accept(ModBlocks.MANGROVE_SHELF.get());
                        output.accept(ModBlocks.CHERRY_SHELF.get());
                        output.accept(ModBlocks.BAMBOO_SHELF.get());
                        output.accept(ModBlocks.CRIMSON_SHELF.get());
                        output.accept(ModBlocks.WARPED_SHELF.get());

                        output.accept(ModBlocks.PEDESTAL.get());
                        output.accept(ModBlocks.STONE_PEDESTAL.get());
                        output.accept(ModBlocks.DIORITE_PEDESTAL.get());
                        output.accept(ModBlocks.GRANITE_PEDESTAL.get());
                        output.accept(ModBlocks.DEEPSLATE_PEDESTAL.get());
                        output.accept(ModBlocks.DEEPSLATE_TILE_PEDESTAL.get());
                        output.accept(ModBlocks.BLACKSTONE_PEDESTAL.get());

                        output.accept(ModBlocks.STONE_GLASS_TECQUE.get());

                        output.accept(ModBlocks.OAK_GLASS_TECQUE.get());
                        output.accept(ModBlocks.SPRUCE_GLASS_TECQUE.get());
                        output.accept(ModBlocks.BIRCH_GLASS_TECQUE.get());
                        output.accept(ModBlocks.JUNGLE_GLASS_TECQUE.get());
                        output.accept(ModBlocks.ACACIA_GLASS_TECQUE.get());
                        output.accept(ModBlocks.MANGROVE_GLASS_TECQUE.get());
                        output.accept(ModBlocks.DARK_OAK_GLASS_TECQUE.get());
                        output.accept(ModBlocks.CHERRY_GLASS_TECQUE.get());
                        output.accept(ModBlocks.BAMBOO_GLASS_TECQUE.get());
                        output.accept(ModBlocks.CRIMSON_GLASS_TECQUE.get());
                        output.accept(ModBlocks.WARPED_GLASS_TECQUE.get());
                    })
                    .build()
    );

    public static final BundledTabs BUILDINGS_EXTRAS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.buildings_extras"))
                    .icon(new ItemStack(ModBlocks.OAK_VERTICAL_SLAB.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.SPRUCE_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.BIRCH_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.JUNGLE_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.ACACIA_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.MANGROVE_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.CHERRY_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.BAMBOO_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.CRIMSON_VERTICAL_SLAB.get());
                        output.accept(ModBlocks.WARPED_VERTICAL_SLAB.get());





                            })
                    .build()
    );

    public static final BundledTabs EXTERNAL_DECORATIONS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.external_deco"))
                    .icon(new ItemStack(ModBlocks.OAK_PARK_BENCH.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_PARK_BENCH.get());
                        output.accept(ModBlocks.SPRUCE_PARK_BENCH.get());
                        output.accept(ModBlocks.BIRCH_PARK_BENCH.get());
                        output.accept(ModBlocks.JUNGLE_PARK_BENCH.get());
                        output.accept(ModBlocks.ACACIA_PARK_BENCH.get());
                        output.accept(ModBlocks.DARK_OAK_PARK_BENCH.get());
                        output.accept(ModBlocks.MANGROVE_PARK_BENCH.get());
                        output.accept(ModBlocks.CHERRY_PARK_BENCH.get());
                        output.accept(ModBlocks.BAMBOO_PARK_BENCH.get());
                        output.accept(ModBlocks.CRIMSON_PARK_BENCH.get());
                        output.accept(ModBlocks.WARPED_PARK_BENCH.get());

                        output.accept(ModBlocks.STONE_PATH.get());


                    })
                            .build()
    );

    public static final BundledTabs DECORATION = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.decoration"))
                    .icon(new ItemStack(ModBlocks.BIG_CHAIN.get()))
                    .displayItems((provider, output) -> {


                        output.accept(ModBlocks.BIG_CHAIN.get());
                        output.accept(ModBlocks.WALL_LANTERN.get());

                        output.accept(ModBlocks.COPPER_LANTERN.get());
                        output.accept(ModBlocks.EXPOSED_LANTERN.get());
                        output.accept(ModBlocks.WEATHERED_LANTERN.get());
                        output.accept(ModBlocks.OXIDIZED_LANTERN.get());

                        output.accept(ModBlocks.WAXED_COPPER_LANTERN.get());
                        output.accept(ModBlocks.WAXED_EXPOSED_LANTERN.get());
                        output.accept(ModBlocks.WAXED_WEATHERED_LANTERN.get());
                        output.accept(ModBlocks.WAXED_OXIDIZED_LANTERN.get());







                    })
                    .build()
    );

    public static final BundledTabs ELECTRONICS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.electronics.title"))
                    .icon(new ItemStack(ModBlocks.OAK_OVEN.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_OVEN.get());
                        output.accept(ModBlocks.SPRUCE_OVEN.get());
                        output.accept(ModBlocks.BIRCH_OVEN.get());
                        output.accept(ModBlocks.JUNGLE_OVEN.get());
                        output.accept(ModBlocks.ACACIA_OVEN.get());
                        output.accept(ModBlocks.DARK_OAK_OVEN.get());
                        output.accept(ModBlocks.MANGROVE_OVEN.get());
                        output.accept(ModBlocks.CHERRY_OVEN.get());
                        output.accept(ModBlocks.BAMBOO_OVEN.get());
                        output.accept(ModBlocks.CRIMSON_OVEN.get());
                        output.accept(ModBlocks.WARPED_OVEN.get());

                        output.accept(ModBlocks.STRIPPED_OAK_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_SPRUCE_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_BIRCH_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_JUNGLE_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_ACACIA_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_MANGROVE_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_CHERRY_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_BAMBOO_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_CRIMSON_OVEN.get());
                        output.accept(ModBlocks.STRIPPED_WARPED_OVEN.get());
                        output.accept(ModBlocks.SPRUCE_DIORITE_OVEN.get());
                        output.accept(ModBlocks.DARK_OAK_CALCITE_OVEN.get());
                        output.accept(ModBlocks.OAK_ANDESITE_OVEN.get());

                        output.accept(ModBlocks.WHITE_OVEN.get());
                        output.accept(ModBlocks.LIGHT_GRAY_OVEN.get());
                        output.accept(ModBlocks.GRAY_OVEN.get());
                        output.accept(ModBlocks.BLACK_OVEN.get());
                        output.accept(ModBlocks.RED_OVEN.get());
                        output.accept(ModBlocks.ORANGE_OVEN.get());
                        output.accept(ModBlocks.YELLOW_OVEN.get());
                        output.accept(ModBlocks.LIME_OVEN.get());
                        output.accept(ModBlocks.GREEN_OVEN.get());
                        output.accept(ModBlocks.CYAN_OVEN.get());
                        output.accept(ModBlocks.LIGHT_BLUE_OVEN.get());
                        output.accept(ModBlocks.BLUE_OVEN.get());
                        output.accept(ModBlocks.PURPLE_OVEN.get());
                        output.accept(ModBlocks.MAGENTA_OVEN.get());
                        output.accept(ModBlocks.PINK_OVEN.get());
                        output.accept(ModBlocks.BROWN_OVEN.get());

                        output.accept(ModBlocks.LIGHT_MICROWAVE.get());
                        output.accept(ModBlocks.DARK_MICROWAVE.get());

                        output.accept(ModBlocks.WHITE_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.GRAY_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.BLACK_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.RED_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.ORANGE_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.YELLOW_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.LIME_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.GREEN_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.CYAN_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.BLUE_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.PURPLE_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.MAGENTA_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.PINK_DIGITAL_CLOCK.get());
                        output.accept(ModBlocks.BROWN_DIGITAL_CLOCK.get());

                    })
                    .build()

 );



    public static BundledTabs register(BundledTabs builder) {
        FILTERS.put(builder, FeatureFlag.DEFAULT);
        return builder;
    }

    public static List<BundledTabs> getFilters() {
        return FILTERS.entrySet().stream().filter(entry-> entry.getValue().isEnabled())
                .map(Map.Entry::getKey)
                .toList();
    }
}
