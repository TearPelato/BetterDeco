package net.tier1234.better_deco.init;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.tier1234.better_deco.creative_tabs.BundledTabs;

import java.util.ArrayList;
import java.util.List;

/**
 * BundledTabs from VanillaBackport, used with BlackGear's permission.
 * @author BlackGear
 */
public class ModBundledTabs {
    private static final List<BundledTabs> FILTERS = new ArrayList<>();

    public static final BundledTabs BUILDINGS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.buildings.title"))
                    .icon(new ItemStack(ModBlocks.OAK_BARREL))
                    .displayItems((provider, output) -> {

                        output.accept(ModBlocks.OAK_VERTICAL_PLANKS);
                        output.accept(ModBlocks.OAK_PILED_PLANKS);
                        output.accept(ModBlocks.OAK_POLISHED_PLANKS);
                        output.accept(ModBlocks.OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.OAK_BARREL);
                        //Spruce
                        output.accept(ModBlocks.SPRUCE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.SPRUCE_PILED_PLANKS);
                        output.accept(ModBlocks.SPRUCE_POLISHED_PLANKS);
                        output.accept(ModBlocks.SPRUCE_PLANKS_BRICKS);
                        output.accept(ModBlocks.SPRUCE_SOFT_BRICKS);
                        output.accept(ModBlocks.SPRUCE_PLANKS_PILLAR);
                        output.accept(Blocks.BARREL);
                        //Birch
                        output.accept(ModBlocks.BIRCH_VERTICAL_PLANKS);
                        output.accept(ModBlocks.BIRCH_PILED_PLANKS);
                        output.accept(ModBlocks.BIRCH_POLISHED_PLANKS);
                        output.accept(ModBlocks.BIRCH_PLANKS_BRICKS);
                        output.accept(ModBlocks.BIRCH_SOFT_BRICKS);
                        output.accept(ModBlocks.BIRCH_PLANKS_PILLAR);
                        output.accept(ModBlocks.BIRCH_BARREL);
                        //Jungle
                        output.accept(ModBlocks.JUNGLE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.JUNGLE_PILED_PLANKS);
                        output.accept(ModBlocks.JUNGLE_POLISHED_PLANKS);
                        output.accept(ModBlocks.JUNGLE_PLANKS_BRICKS);
                        output.accept(ModBlocks.JUNGLE_SOFT_BRICKS);
                        output.accept(ModBlocks.JUNGLE_PLANKS_PILLAR);
                        output.accept(ModBlocks.JUNGLE_BARREL);
                        //Acacia
                        output.accept(ModBlocks.ACACIA_VERTICAL_PLANKS);
                        output.accept(ModBlocks.ACACIA_PILED_PLANKS);
                        output.accept(ModBlocks.ACACIA_POLISHED_PLANKS);
                        output.accept(ModBlocks.ACACIA_PLANKS_BRICKS);
                        output.accept(ModBlocks.ACACIA_SOFT_BRICKS);
                        output.accept(ModBlocks.ACACIA_PLANKS_PILLAR);
                        output.accept(ModBlocks.ACACIA_BARREL);
                        //DarkOak
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_PILED_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_POLISHED_PLANKS);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.DARK_OAK_BARREL);
                        //Mangrove
                        output.accept(ModBlocks.MANGROVE_VERTICAL_PLANKS);
                        output.accept(ModBlocks.MANGROVE_PILED_PLANKS);
                        output.accept(ModBlocks.MANGROVE_POLISHED_PLANKS);
                        output.accept(ModBlocks.MANGROVE_PLANKS_BRICKS);
                        output.accept(ModBlocks.MANGROVE_SOFT_BRICKS);
                        output.accept(ModBlocks.MANGROVE_PLANKS_PILLAR);
                        output.accept(ModBlocks.MANGROVE_BARREL);
                        //Cherry
                        output.accept(ModBlocks.CHERRY_VERTICAL_PLANKS);
                        output.accept(ModBlocks.CHERRY_PILED_PLANKS);
                        output.accept(ModBlocks.CHERRY_POLISHED_PLANKS);
                        output.accept(ModBlocks.CHERRY_PLANKS_BRICKS);
                        output.accept(ModBlocks.CHERRY_SOFT_BRICKS);
                        output.accept(ModBlocks.CHERRY_PLANKS_PILLAR);
                        output.accept(ModBlocks.CHERRY_BARREL);
                        //Pale Oak
                        output.accept(ModBlocks.PALE_OAK_VERTICAL);
                        output.accept(ModBlocks.PALE_OAK_LARGE_PLANKS);
                        output.accept(ModBlocks.PALE_OAK_SMOOTH_PLANKS);
                        output.accept(ModBlocks.PALE_OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.PALE_OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.PALE_OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.PALE_OAK_BARREL);
                        //Bamboo
                        output.accept(ModBlocks.BAMBOO_VERTICAL_PLANKS);
                        output.accept(ModBlocks.BAMBOO_PILED_PLANKS);
                        output.accept(ModBlocks.BAMBOO_POLISHED_PLANKS);
                        output.accept(ModBlocks.BAMBOO_PLANKS_BRICKS);
                        output.accept(ModBlocks.BAMBOO_SOFT_BRICKS);
                        output.accept(ModBlocks.BAMBOO_PLANKS_PILLAR);
                        output.accept(ModBlocks.BAMBOO_BARREL);
                        //Crimson
                        output.accept(ModBlocks.CRIMSON_VERTICAL_PLANKS);
                        output.accept(ModBlocks.CRIMSON_PILED_PLANKS);
                        output.accept(ModBlocks.CRIMSON_POLISHED_PLANKS);
                        output.accept(ModBlocks.CRIMSON_PLANKS_BRICKS);
                        output.accept(ModBlocks.CRIMSON_SOFT_BRICKS);
                        output.accept(ModBlocks.CRIMSON_PLANKS_PILLAR);
                        output.accept(ModBlocks.CRIMSON_BARREL);
                        //Warped
                        output.accept(ModBlocks.WARPED_VERTICAL_PLANKS);
                        output.accept(ModBlocks.WARPED_PILED_PLANKS);
                        output.accept(ModBlocks.WARPED_POLISHED_PLANKS);
                        output.accept(ModBlocks.WARPED_PLANKS_BRICKS);
                        output.accept(ModBlocks.WARPED_SOFT_BRICKS);
                        output.accept(ModBlocks.WARPED_PLANKS_PILLAR);
                        output.accept(ModBlocks.WARPED_BARREL);

                        output.accept(ModBlocks.ANDESITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.ANDESITE_MIXED_BRICKS);
                        output.accept(ModBlocks.ANDESITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.ANDESITE_BRICKS);
                        output.accept(ModBlocks.RAW_ANDESITE);

                        output.accept(ModBlocks.DIORITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.DIORITE_MIXED_BRICKS);
                        output.accept(ModBlocks.DIORITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.DIORITE_BRICKS);
                        output.accept(ModBlocks.RAW_DIORITE);

                        output.accept(ModBlocks.GRANITE_ARRAY_BRICKS);
                        output.accept(ModBlocks.GRANITE_MIXED_BRICKS);
                        output.accept(ModBlocks.GRANITE_MOSAIC_BRICKS);
                        output.accept(ModBlocks.GRANITE_BRICKS);
                        output.accept(ModBlocks.RAW_GRANITE);



                    })
                    .build()
    );

    public static final BundledTabs FURNITURE = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.furniture.title"))
                    .icon(new ItemStack(ModBlocks.OAK_CHAIR.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.SPRUCE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.BIRCH_KITCHEN_COUNTER);
                        output.accept(ModBlocks.JUNGLE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.ACACIA_KITCHEN_COUNTER);
                        output.accept(ModBlocks.DARK_OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.MANGROVE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.CHERRY_KITCHEN_COUNTER);
                        output.accept(ModBlocks.PALE_OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.BAMBOO_KITCHEN_COUNTER);
                        output.accept(ModBlocks.CRIMSON_KITCHEN_COUNTER);
                        output.accept(ModBlocks.WARPED_KITCHEN_COUNTER);

                        output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER);
                        output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER);

                        output.accept(ModBlocks.WHITE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.LIGHT_GRAY_KITCHEN_COUNTER);
                        output.accept(ModBlocks.GRAY_KITCHEN_COUNTER);
                        output.accept(ModBlocks.BLACK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.RED_KITCHEN_COUNTER);
                        output.accept(ModBlocks.ORANGE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.YELLOW_KITCHEN_COUNTER);
                        output.accept(ModBlocks.LIME_KITCHEN_COUNTER);
                        output.accept(ModBlocks.GREEN_KITCHEN_COUNTER);
                        output.accept(ModBlocks.CYAN_KITCHEN_COUNTER);
                        output.accept(ModBlocks.LIGHT_BLUE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.BLUE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.PURPLE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.MAGENTA_KITCHEN_COUNTER);
                        output.accept(ModBlocks.PINK_KITCHEN_COUNTER);
                        output.accept(ModBlocks.BROWN_KITCHEN_COUNTER);

                        output.accept(ModBlocks.OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.SPRUCE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.BIRCH_KITCHEN_DRAWER);
                        output.accept(ModBlocks.JUNGLE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.ACACIA_KITCHEN_DRAWER);
                        output.accept(ModBlocks.DARK_OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.MANGROVE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.CHERRY_KITCHEN_DRAWER);
                        output.accept(ModBlocks.PALE_OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.BAMBOO_KITCHEN_DRAWER);
                        output.accept(ModBlocks.CRIMSON_KITCHEN_DRAWER);
                        output.accept(ModBlocks.WARPED_KITCHEN_DRAWER);

                        output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER);
                        output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER);

                        output.accept(ModBlocks.WHITE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.LIGHT_GRAY_KITCHEN_DRAWER);
                        output.accept(ModBlocks.GRAY_KITCHEN_DRAWER);
                        output.accept(ModBlocks.BLACK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.RED_KITCHEN_DRAWER);
                        output.accept(ModBlocks.ORANGE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.YELLOW_KITCHEN_DRAWER);
                        output.accept(ModBlocks.LIME_KITCHEN_DRAWER);
                        output.accept(ModBlocks.GREEN_KITCHEN_DRAWER);
                        output.accept(ModBlocks.CYAN_KITCHEN_DRAWER);
                        output.accept(ModBlocks.LIGHT_BLUE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.BLUE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.PURPLE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.MAGENTA_KITCHEN_DRAWER);
                        output.accept(ModBlocks.PINK_KITCHEN_DRAWER);
                        output.accept(ModBlocks.BROWN_KITCHEN_DRAWER);

                        output.accept(ModBlocks.OAK_SINK);
                        output.accept(ModBlocks.SPRUCE_SINK);
                        output.accept(ModBlocks.BIRCH_SINK);
                        output.accept(ModBlocks.JUNGLE_SINK);
                        output.accept(ModBlocks.ACACIA_SINK);
                        output.accept(ModBlocks.DARK_OAK_SINK);
                        output.accept(ModBlocks.MANGROVE_SINK);
                        output.accept(ModBlocks.CHERRY_SINK);
                        output.accept(ModBlocks.PALE_OAK_SINK);
                        output.accept(ModBlocks.BAMBOO_SINK);
                        output.accept(ModBlocks.CRIMSON_SINK);
                        output.accept(ModBlocks.WARPED_SINK);


                        output.accept(ModBlocks.PALE_OAK_BALCKSTONE_SINK);
                        output.accept(ModBlocks.PALE_OAK_DEEPSLATE_SINK);

                        output.accept(ModBlocks.WHITE_SINK);
                        output.accept(ModBlocks.LIGHT_GRAY_SINK);
                        output.accept(ModBlocks.GRAY_SINK);
                        output.accept(ModBlocks.BLACK_SINK);
                        output.accept(ModBlocks.RED_SINK);
                        output.accept(ModBlocks.ORANGE_SINK);
                        output.accept(ModBlocks.YELLOW_SINK);
                        output.accept(ModBlocks.LIME_SINK);
                        output.accept(ModBlocks.GREEN_SINK);
                        output.accept(ModBlocks.CYAN_SINK);
                        output.accept(ModBlocks.LIGHT_BLUE_SINK);
                        output.accept(ModBlocks.BLUE_SINK);
                        output.accept(ModBlocks.PURPLE_SINK);
                        output.accept(ModBlocks.MAGENTA_SINK);
                        output.accept(ModBlocks.PINK_SINK);
                        output.accept(ModBlocks.BROWN_SINK);

                        output.accept(ModBlocks.OAK_SINK_DARK);
                        output.accept(ModBlocks.SPRUCE_SINK_DARK);
                        output.accept(ModBlocks.BIRCH_SINK_DARK);
                        output.accept(ModBlocks.JUNGLE_SINK_DARK);
                        output.accept(ModBlocks.ACACIA_SINK_DARK);
                        output.accept(ModBlocks.DARK_OAK_SINK_DARK);
                        output.accept(ModBlocks.MANGROVE_SINK_DARK);
                        output.accept(ModBlocks.CHERRY_SINK_DARK);
                        output.accept(ModBlocks.PALE_OAK_SINK_DARK);
                        output.accept(ModBlocks.BAMBOO_SINK_DARK);
                        output.accept(ModBlocks.CRIMSON_SINK_DARK);
                        output.accept(ModBlocks.WARPED_SINK_DARK);

                        output.accept(ModBlocks.OAK_CABINET);
                        output.accept(ModBlocks.SPRUCE_CABINET);
                        output.accept(ModBlocks.BIRCH_CABINET);
                        output.accept(ModBlocks.JUNGLE_CABINET);
                        output.accept(ModBlocks.ACACIA_CABINET);
                        output.accept(ModBlocks.DARK_OAK_CABINET);
                        output.accept(ModBlocks.MANGROVE_CABINET);
                        output.accept(ModBlocks.CHERRY_CABINET);
                        output.accept(ModBlocks.PALE_OAK_CABINET);
                        output.accept(ModBlocks.BAMBOO_CABINET);
                        output.accept(ModBlocks.CRIMSON_CABINET);
                        output.accept(ModBlocks.WARPED_CABINET);

                        output.accept(ModBlocks.WHITE_CABINET);
                        output.accept(ModBlocks.LIGHT_GRAY_CABINET);
                        output.accept(ModBlocks.GRAY_CABINET);
                        output.accept(ModBlocks.BLACK_CABINET);
                        output.accept(ModBlocks.RED_CABINET);
                        output.accept(ModBlocks.ORANGE_CABINET);
                        output.accept(ModBlocks.YELLOW_CABINET);
                        output.accept(ModBlocks.LIME_CABINET);
                        output.accept(ModBlocks.GREEN_CABINET);
                        output.accept(ModBlocks.CYAN_CABINET);
                        output.accept(ModBlocks.LIGHT_BLUE_CABINET);
                        output.accept(ModBlocks.BLUE_CABINET);
                        output.accept(ModBlocks.PURPLE_CABINET);
                        output.accept(ModBlocks.MAGENTA_CABINET);
                        output.accept(ModBlocks.PINK_CABINET);
                        output.accept(ModBlocks.BROWN_CABINET);

                        output.accept(ModBlocks.STRIPPED_OAK_CABINET);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_CABINET);
                        output.accept(ModBlocks.STRIPPED_BIRCH_CABINET);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_CABINET);
                        output.accept(ModBlocks.STRIPPED_ACACIA_CABINET);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_CABINET);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_CABINET);
                        output.accept(ModBlocks.STRIPPED_CHERRY_CABINET);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_CABINET);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_CABINET);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CABINET);
                        output.accept(ModBlocks.STRIPPED_WARPED_CABINET);

                        output.accept(ModBlocks.FRIDGE_LIGHT);
                        output.accept(ModBlocks.FRIDGE_DARK);

                        output.accept(ModBlocks.TOASTER_DARK);
                        output.accept(ModBlocks.TOASTER_LIGHT);

                        output.accept(ModBlocks.CHOPPING_BOARD);

                        output.accept(ModBlocks.STONE_COUNTER);
                        output.accept(ModBlocks.GRANITE_COUNTER);
                        output.accept(ModBlocks.DIORITE_COUNTER);
                        output.accept(ModBlocks.DEEPSLATE_COUNTER);
                        output.accept(ModBlocks.DEEPSLATE_TILE_COUNTER);
                        output.accept(ModBlocks.BLACKSTONE_COUNTER);
                        output.accept(ModBlocks.SPRUCE_DIORITE_COUNTER);
                        output.accept(ModBlocks.DARK_OAK_CALCITE_COUNTER);
                        output.accept(ModBlocks.OAK_ANDESITE_COUNTER);
                        output.accept(ModBlocks.PALE_OAK_BALCKSTONE_KITCHEN_COUNTER);
                        output.accept(ModBlocks.PALE_OAK_DEEPSLATE_KITCHEN_COUNTER);

                        output.accept(ModBlocks.STONE_DRAWER);
                        output.accept(ModBlocks.GRANITE_DRAWER);
                        output.accept(ModBlocks.DIORITE_DRAWER);
                        output.accept(ModBlocks.DEEPSLATE_DRAWER);
                        output.accept(ModBlocks.DEEPSLATE_TILES_DRAWER);
                        output.accept(ModBlocks.BLACKSTONE_DRAWER);
                        output.accept(ModBlocks.SPRUCE_DIORITE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.DARK_OAK_CALCITE_DRAWER);
                        output.accept(ModBlocks.OAK_ANDESITE_DRAWER);
                        output.accept(ModBlocks.PALE_OAK_BALCKSTONE_KITCHEN_DRAWER);
                        output.accept(ModBlocks.PALE_OAK_DEEPSLATE_KITCHEN_DRAWER);

                        output.accept(ModBlocks.STONE_CABINET);
                        output.accept(ModBlocks.GRANITE_CABINET);
                        output.accept(ModBlocks.DIORITE_CABINET);
                        output.accept(ModBlocks.DEEPSLATE_CABINET);
                        output.accept(ModBlocks.DEEPSLATE_TILES_CABINET);
                        output.accept(ModBlocks.BLACKSTONE_CABINET);
                        output.accept(ModBlocks.SPRUCE_DIORITE_CABINET);
                        output.accept(ModBlocks.DARK_OAK_CALCITE_CABINET);
                        output.accept(ModBlocks.OAK_ANDESITE_CABINET);
                        output.accept(ModBlocks.PALE_OAK_BALCKSTONE_CABINET);
                        output.accept(ModBlocks.PALE_OAK_DEEPSLATE_CABINET);

                        output.accept(ModBlocks.OAK_BEDSIDE);
                        output.accept(ModBlocks.SPRUCE_BEDSIDE);
                        output.accept(ModBlocks.BIRCH_BEDSIDE);
                        output.accept(ModBlocks.JUNGLE_BEDSIDE);
                        output.accept(ModBlocks.ACACIA_BEDSIDE);
                        output.accept(ModBlocks.MANGROVE_BEDSIDE);
                        output.accept(ModBlocks.DARK_OAK_BEDSIDE);
                        output.accept(ModBlocks.CHERRY_BEDSIDE);
                        output.accept(ModBlocks.PALE_OAK_BEDSIDE);
                        output.accept(ModBlocks.BAMBOO_BEDSIDE);
                        output.accept(ModBlocks.CRIMSON_BEDSIDE);
                        output.accept(ModBlocks.WARPED_BEDSIDE);

                        output.accept(ModBlocks.OAK_TABLE);
                        output.accept(ModBlocks.SPRUCE_TABLE);
                        output.accept(ModBlocks.BIRCH_TABLE);
                        output.accept(ModBlocks.JUNGLE_TABLE);
                        output.accept(ModBlocks.ACACIA_TABLE);
                        output.accept(ModBlocks.DARK_OAK_TABLE);
                        output.accept(ModBlocks.MANGROVE_TABLE);
                        output.accept(ModBlocks.CHERRY_TABLE);
                        output.accept(ModBlocks.PALE_OAK_TABLE);
                        output.accept(ModBlocks.BAMBOO_TABLE);
                        output.accept(ModBlocks.CRIMSON_TABLE);
                        output.accept(ModBlocks.WARPED_TABLE);

                        output.accept(ModBlocks.STRIPPED_OAK_TABLE);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_TABLE);
                        output.accept(ModBlocks.STRIPPED_BIRCH_TABLE);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_TABLE);
                        output.accept(ModBlocks.STRIPPED_ACACIA_TABLE);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_TABLE);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_TABLE);
                        output.accept(ModBlocks.STRIPPED_CHERRY_TABLE);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_TABLE);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_TABLE);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_TABLE);
                        output.accept(ModBlocks.STRIPPED_WARPED_TABLE);

                        output.accept(ModBlocks.OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.SPRUCE_COFFEE_TABLE);
                        output.accept(ModBlocks.BIRCH_COFFEE_TABLE);
                        output.accept(ModBlocks.JUNGLE_COFFEE_TABLE);
                        output.accept(ModBlocks.ACACIA_COFFEE_TABLE);
                        output.accept(ModBlocks.DARK_OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.MANGROVE_COFFEE_TABLE);
                        output.accept(ModBlocks.CHERRY_COFFEE_TABLE);
                        output.accept(ModBlocks.PALE_OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.BAMBOO_COFFEE_TABLE);
                        output.accept(ModBlocks.CRIMSON_COFFEE_TABLE);
                        output.accept(ModBlocks.WARPED_COFFEE_TABLE);

                        output.accept(ModBlocks.STRIPPED_OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE);
                        output.accept(ModBlocks.STRIPPED_WARPED_COFFEE_TABLE);

                        output.accept(ModBlocks.OAK_DINNING_TABLE);
                        output.accept(ModBlocks.SPRUCE_DINNING_TABLE);
                        output.accept(ModBlocks.BIRCH_DINNING_TABLE);
                        output.accept(ModBlocks.JUNGLE_DINNING_TABLE);
                        output.accept(ModBlocks.ACACIA_DINNING_TABLE);
                        output.accept(ModBlocks.DARK_OAK_DINNING_TABLE);
                        output.accept(ModBlocks.MANGROVE_DINNING_TABLE);
                        output.accept(ModBlocks.CHERRY_DINNING_TABLE);
                        output.accept(ModBlocks.PALE_OAK_DINNING_TABLE);
                        output.accept(ModBlocks.BAMBOO_DINNING_TABLE);
                        output.accept(ModBlocks.CRIMSON_DINNING_TABLE);
                        output.accept(ModBlocks.WARPED_DINNING_TABLE);

                        output.accept(ModBlocks.STRIPPED_OAK_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_BIRCH_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_ACACIA_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_CHERRY_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE);
                        output.accept(ModBlocks.STRIPPED_WARPED_DINNING_TABLE);

                        output.accept(ModBlocks.OAK_DESK);
                        output.accept(ModBlocks.SPRUCE_DESK);
                        output.accept(ModBlocks.BIRCH_DESK);
                        output.accept(ModBlocks.JUNGLE_DESK);
                        output.accept(ModBlocks.ACACIA_DESK);
                        output.accept(ModBlocks.DARK_OAK_DESK);
                        output.accept(ModBlocks.MANGROVE_DESK);
                        output.accept(ModBlocks.CHERRY_DESK);
                        output.accept(ModBlocks.PALE_OAK_DESK);
                        output.accept(ModBlocks.BAMBOO_DESK);
                        output.accept(ModBlocks.CRIMSON_DESK);
                        output.accept(ModBlocks.WARPED_DESK);

                        output.accept(ModBlocks.OAK_DESK_CABINET);
                        output.accept(ModBlocks.SPRUCE_DESK_CABINET);
                        output.accept(ModBlocks.BIRCH_DESK_CABINET);
                        output.accept(ModBlocks.JUNGLE_DESK_CABINET);
                        output.accept(ModBlocks.ACACIA_DESK_CABINET);
                        output.accept(ModBlocks.DARK_OAK_DESK_CABINET);
                        output.accept(ModBlocks.MANGROVE_DESK_CABINET);
                        output.accept(ModBlocks.CHERRY_DESK_CABINET);
                        output.accept(ModBlocks.PALE_OAK_DESK_CABINET);
                        output.accept(ModBlocks.BAMBOO_DESK_CABINET);
                        output.accept(ModBlocks.CRIMSON_DESK_CABINET);
                        output.accept(ModBlocks.WARPED_DESK_CABINET);

                        output.accept(ModBlocks.OAK_CHAIR);
                        output.accept(ModBlocks.SPRUCE_CHAIR);
                        output.accept(ModBlocks.BIRCH_CHAIR);
                        output.accept(ModBlocks.JUNGLE_CHAIR);
                        output.accept(ModBlocks.ACACIA_CHAIR);
                        output.accept(ModBlocks.DARK_OAK_CHAIR);
                        output.accept(ModBlocks.MANGROVE_CHAIR);
                        output.accept(ModBlocks.CHERRY_CHAIR);
                        output.accept(ModBlocks.PALE_OAK_CHAIR);
                        output.accept(ModBlocks.BAMBOO_CHAIR);
                        output.accept(ModBlocks.CRIMSON_CHAIR);
                        output.accept(ModBlocks.WARPED_CHAIR);

                        output.accept(ModBlocks.STRIPPED_OAK_CHAIR);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_CHAIR);
                        output.accept(ModBlocks.STRIPPED_BIRCH_CHAIR);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_CHAIR);
                        output.accept(ModBlocks.STRIPPED_ACACIA_CHAIR);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_CHAIR);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_CHAIR);
                        output.accept(ModBlocks.STRIPPED_CHERRY_CHAIR);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_CHAIR);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_CHAIR);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_CHAIR);
                        output.accept(ModBlocks.STRIPPED_WARPED_CHAIR);

                        output.accept(ModBlocks.WITHE_SOFA);
                        output.accept(ModBlocks.LIGHT_GREY_SOFA);
                        output.accept(ModBlocks.GREY_SOFA);
                        output.accept(ModBlocks.BLACK_SOFA);
                        output.accept(ModBlocks.RED_SOFA);
                        output.accept(ModBlocks.ORANGE_SOFA);
                        output.accept(ModBlocks.YELLOW_SOFA);
                        output.accept(ModBlocks.LIME_SOFA);
                        output.accept(ModBlocks.GREEN_SOFA);
                        output.accept(ModBlocks.CYAN_SOFA);
                        output.accept(ModBlocks.LIGHT_BLUE_SOFA);
                        output.accept(ModBlocks.BLUE_SOFA);
                        output.accept(ModBlocks.PURPLE_SOFA);
                        output.accept(ModBlocks.MAGENTA_SOFA);
                        output.accept(ModBlocks.PINK_SOFA);
                        output.accept(ModBlocks.BROWN_SOFA);

                        output.accept(ModBlocks.WITHE_STOOL);
                        output.accept(ModBlocks.LIGHT_GREY_STOOL);
                        output.accept(ModBlocks.GREY_STOOL);
                        output.accept(ModBlocks.BLACK_STOOL);
                        output.accept(ModBlocks.RED_STOOL);
                        output.accept(ModBlocks.ORANGE_STOOL);
                        output.accept(ModBlocks.YELLOW_STOOL);
                        output.accept(ModBlocks.LIME_STOOL);
                        output.accept(ModBlocks.GREEN_STOOL);
                        output.accept(ModBlocks.CYAN_STOOL);
                        output.accept(ModBlocks.LIGHT_BLUE_STOOL);
                        output.accept(ModBlocks.BLUE_STOOL);
                        output.accept(ModBlocks.PURPLE_STOOL);
                        output.accept(ModBlocks.MAGENTA_STOOL);
                        output.accept(ModBlocks.PINK_STOOL);
                        output.accept(ModBlocks.BROWN_STOOL);

                    })
                    .build()
    );

    public static final BundledTabs EXTERNAL_DECORATIONS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.external_deco"))
                    .icon(new ItemStack(ModBlocks.OAK_PARK_BENCH.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_PARK_BENCH);
                        output.accept(ModBlocks.SPRUCE_PARK_BENCH);
                        output.accept(ModBlocks.BIRCH_PARK_BENCH);
                        output.accept(ModBlocks.JUNGLE_PARK_BENCH);
                        output.accept(ModBlocks.ACACIA_PARK_BENCH);
                        output.accept(ModBlocks.DARK_OAK_PARK_BENCH);
                        output.accept(ModBlocks.MANGROVE_PARK_BENCH);
                        output.accept(ModBlocks.CHERRY_PARK_BENCH);
                        output.accept(ModBlocks.PALE_OAK_PARK_BENCH);
                        output.accept(ModBlocks.BAMBOO_PARK_BENCH);
                        output.accept(ModBlocks.CRIMSON_PARK_BENCH);
                        output.accept(ModBlocks.WARPED_PARK_BENCH);

                        output.accept(ModBlocks.STONE_PATH);


                    })
                    .build()
    );

    public static final BundledTabs FURNITURE_EXTRAS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.utilities.title"))
                    .icon(new ItemStack(ModBlocks.OAK_CRATE.get()))
                    .displayItems((provider, output) -> {


                        output.accept(ModBlocks.OAK_CRATE);
                        output.accept(ModBlocks.SPRUCE_CRATE);
                        output.accept(ModBlocks.BIRCH_CRATE);
                        output.accept(ModBlocks.JUNGLE_CRATE);
                        output.accept(ModBlocks.ACACIA_CRATE);
                        output.accept(ModBlocks.MANGROVE_CRATE);
                        output.accept(ModBlocks.DARK_OAK_CRATE);
                        output.accept(ModBlocks.CHERRY_CRATE);
                        output.accept(ModBlocks.PALE_OAK_CRATE);
                        output.accept(ModBlocks.BAMBOO_CRATE);
                        output.accept(ModBlocks.CRIMSON_CRATE);
                        output.accept(ModBlocks.WARPED_CRATE);


                        output.accept(ModBlocks.OAK_SHELF);
                        output.accept(ModBlocks.SPRUCE_SHELF);
                        output.accept(ModBlocks.BIRCH_SHELF);
                        output.accept(ModBlocks.JUNGLE_SHELF);
                        output.accept(ModBlocks.ACACIA_SHELF);
                        output.accept(ModBlocks.DARK_OAK_SHELF);
                        output.accept(ModBlocks.MANGROVE_SHELF);
                        output.accept(ModBlocks.CHERRY_SHELF);
                        output.accept(ModBlocks.PALE_OAK_SHELF);
                        output.accept(ModBlocks.BAMBOO_SHELF);
                        output.accept(ModBlocks.CRIMSON_SHELF);
                        output.accept(ModBlocks.WARPED_SHELF);

                        output.accept(ModBlocks.PEDESTAL);
                        output.accept(ModBlocks.STONE_PEDESTAL);
                        output.accept(ModBlocks.DIORITE_PEDESTAL);
                        output.accept(ModBlocks.GRANITE_PEDESTAL);
                        output.accept(ModBlocks.DEEPSLATE_PEDESTAL);
                        output.accept(ModBlocks.DEEPSLATE_TILE_PEDESTAL);
                        output.accept(ModBlocks.BLACKSTONE_PEDESTAL);

                        output.accept(ModBlocks.STONE_GLASS_TECQUE);

                        output.accept(ModBlocks.OAK_GLASS_TECQUE);
                        output.accept(ModBlocks.SPRUCE_GLASS_TECQUE);
                        output.accept(ModBlocks.BIRCH_GLASS_TECQUE);
                        output.accept(ModBlocks.JUNGLE_GLASS_TECQUE);
                        output.accept(ModBlocks.ACACIA_GLASS_TECQUE);
                        output.accept(ModBlocks.MANGROVE_GLASS_TECQUE);
                        output.accept(ModBlocks.DARK_OAK_GLASS_TECQUE);
                        output.accept(ModBlocks.CHERRY_GLASS_TECQUE);
                        output.accept(ModBlocks.PALE_OAK_GLASS_TECQUE);
                        output.accept(ModBlocks.BAMBOO_GLASS_TECQUE);
                        output.accept(ModBlocks.CRIMSON_GLASS_TECQUE);
                        output.accept(ModBlocks.WARPED_GLASS_TECQUE);
                    })
                    .build()
    );

    public static final BundledTabs BUILDINGS_EXTRAS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.buildings_extras"))
                    .icon(new ItemStack(ModBlocks.OAK_VERTICAL_SLAB.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_VERTICAL_SLAB);
                        output.accept(ModBlocks.SPRUCE_VERTICAL_SLAB);
                        output.accept(ModBlocks.BIRCH_VERTICAL_SLAB);
                        output.accept(ModBlocks.JUNGLE_VERTICAL_SLAB);
                        output.accept(ModBlocks.ACACIA_VERTICAL_SLAB);
                        output.accept(ModBlocks.DARK_OAK_VERTICAL_SLAB);
                        output.accept(ModBlocks.MANGROVE_VERTICAL_SLAB);
                        output.accept(ModBlocks.CHERRY_VERTICAL_SLAB);
                        output.accept(ModBlocks.PALE_OAK_VERTICAL_SLAB);
                        output.accept(ModBlocks.BAMBOO_VERTICAL_SLAB);
                        output.accept(ModBlocks.CRIMSON_VERTICAL_SLAB);
                        output.accept(ModBlocks.WARPED_VERTICAL_SLAB);





                    })
                    .build()
    );

    public static final BundledTabs DECORATION = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.decoration"))
                    .icon(new ItemStack(ModBlocks.BIG_CHAIN.get()))
                    .displayItems((provider, output) -> {


                        output.accept(ModBlocks.BIG_CHAIN);
                        output.accept(ModBlocks.WALL_LANTERN);

                        output.accept(ModBlocks.COPPER_LANTERN);
                        output.accept(ModBlocks.EXPOSED_LANTERN);
                        output.accept(ModBlocks.WEATHERED_LANTERN);
                        output.accept(ModBlocks.OXIDIZED_LANTERN);

                        output.accept(ModBlocks.WAXED_COPPER_LANTERN);
                        output.accept(ModBlocks.WAXED_EXPOSED_LANTERN);
                        output.accept(ModBlocks.WAXED_WEATHERED_LANTERN);
                        output.accept(ModBlocks.WAXED_OXIDIZED_LANTERN);







                    })
                    .build()
    );

    public static final BundledTabs ELECTRONICS = register(
            BundledTabs.builder()
                    .title(Component.translatable("bundled_tab.electronics.title"))
                    .icon(new ItemStack(ModBlocks.OAK_OVEN.get()))
                    .displayItems((provider, output) -> {
                        output.accept(ModBlocks.OAK_OVEN);
                        output.accept(ModBlocks.SPRUCE_OVEN);
                        output.accept(ModBlocks.BIRCH_OVEN);
                        output.accept(ModBlocks.JUNGLE_OVEN);
                        output.accept(ModBlocks.ACACIA_OVEN);
                        output.accept(ModBlocks.DARK_OAK_OVEN);
                        output.accept(ModBlocks.MANGROVE_OVEN);
                        output.accept(ModBlocks.CHERRY_OVEN);
                        output.accept(ModBlocks.PALE_OAK_OVEN);
                        output.accept(ModBlocks.BAMBOO_OVEN);
                        output.accept(ModBlocks.CRIMSON_OVEN);
                        output.accept(ModBlocks.WARPED_OVEN);

                        output.accept(ModBlocks.STRIPPED_OAK_OVEN);
                        output.accept(ModBlocks.STRIPPED_SPRUCE_OVEN);
                        output.accept(ModBlocks.STRIPPED_BIRCH_OVEN);
                        output.accept(ModBlocks.STRIPPED_JUNGLE_OVEN);
                        output.accept(ModBlocks.STRIPPED_ACACIA_OVEN);
                        output.accept(ModBlocks.STRIPPED_DARK_OAK_OVEN);
                        output.accept(ModBlocks.STRIPPED_MANGROVE_OVEN);
                        output.accept(ModBlocks.STRIPPED_CHERRY_OVEN);
                        output.accept(ModBlocks.STRIPPED_PALE_OAK_OVEN);
                        output.accept(ModBlocks.STRIPPED_BAMBOO_OVEN);
                        output.accept(ModBlocks.STRIPPED_CRIMSON_OVEN);
                        output.accept(ModBlocks.STRIPPED_WARPED_OVEN);

                        output.accept(ModBlocks.WHITE_OVEN);
                        output.accept(ModBlocks.LIGHT_GRAY_OVEN);
                        output.accept(ModBlocks.GRAY_OVEN);
                        output.accept(ModBlocks.BLACK_OVEN);
                        output.accept(ModBlocks.RED_OVEN);
                        output.accept(ModBlocks.ORANGE_OVEN);
                        output.accept(ModBlocks.YELLOW_OVEN);
                        output.accept(ModBlocks.LIME_OVEN);
                        output.accept(ModBlocks.GREEN_OVEN);
                        output.accept(ModBlocks.CYAN_OVEN);
                        output.accept(ModBlocks.LIGHT_BLUE_OVEN);
                        output.accept(ModBlocks.BLUE_OVEN);
                        output.accept(ModBlocks.PURPLE_OVEN);
                        output.accept(ModBlocks.MAGENTA_OVEN);
                        output.accept(ModBlocks.PINK_OVEN);
                        output.accept(ModBlocks.BROWN_OVEN);

                        output.accept(ModBlocks.SPRUCE_DIORITE_OVEN);
                        output.accept(ModBlocks.DARK_OAK_CALCITE_OVEN);
                        output.accept(ModBlocks.OAK_ANDESITE_OVEN);
                        output.accept(ModBlocks.PALE_OAK_BALCKSTONE_OVEN);
                        output.accept(ModBlocks.PALE_OAK_DEEPSLATE_OVEN);

                        output.accept(ModBlocks.LIGHT_MICROWAVE);
                        output.accept(ModBlocks.DARK_MICROWAVE);

                        output.accept(ModBlocks.WHITE_DIGITAL_CLOCK);
                        output.accept(ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK);
                        output.accept(ModBlocks.GRAY_DIGITAL_CLOCK);
                        output.accept(ModBlocks.BLACK_DIGITAL_CLOCK);
                        output.accept(ModBlocks.RED_DIGITAL_CLOCK);
                        output.accept(ModBlocks.ORANGE_DIGITAL_CLOCK);
                        output.accept(ModBlocks.YELLOW_DIGITAL_CLOCK);
                        output.accept(ModBlocks.LIME_DIGITAL_CLOCK);
                        output.accept(ModBlocks.GREEN_DIGITAL_CLOCK);
                        output.accept(ModBlocks.CYAN_DIGITAL_CLOCK);
                        output.accept(ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK);
                        output.accept(ModBlocks.BLUE_DIGITAL_CLOCK);
                        output.accept(ModBlocks.PURPLE_DIGITAL_CLOCK);
                        output.accept(ModBlocks.MAGENTA_DIGITAL_CLOCK);
                        output.accept(ModBlocks.PINK_DIGITAL_CLOCK);
                        output.accept(ModBlocks.BROWN_DIGITAL_CLOCK);

                    })
                    .build()

    );



    public static BundledTabs register(BundledTabs builder) {
        FILTERS.add(builder);
        return builder;
    }

    public static List<BundledTabs> getFilters() {
        return FILTERS;
    }
}