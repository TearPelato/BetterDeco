package net.tier1234.better_deco.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.tier1234.better_deco.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Blocks
        //Stones

        //Andesite
        dropSelf(ModBlocks.ANDESITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.ANDESITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_ANDESITE.get());

        //Diorite
        dropSelf(ModBlocks.DIORITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.DIORITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_DIORITE.get());
        //Granite
        dropSelf(ModBlocks.GRANITE_ARRAY_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_MIXED_BRICKS.get());
        dropSelf(ModBlocks.GRANITE_MOSAIC_BRICKS.get());
        dropSelf(ModBlocks.RAW_GRANITE.get());


        //Oak Variants

        dropSelf(ModBlocks.OAK_PILED_PLANKS.get());
        dropSelf(ModBlocks.OAK_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.OAK_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.SPRUCE_PILED_PLANKS.get());
        dropSelf(ModBlocks.SPRUCE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.SPRUCE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.BIRCH_PILED_PLANKS.get());
        dropSelf(ModBlocks.BIRCH_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.BIRCH_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.JUNGLE_PILED_PLANKS.get());
        dropSelf(ModBlocks.JUNGLE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.JUNGLE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.ACACIA_PILED_PLANKS.get());
        dropSelf(ModBlocks.ACACIA_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.ACACIA_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.DARK_OAK_PILED_PLANKS.get());
        dropSelf(ModBlocks.DARK_OAK_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.MANGROVE_PILED_PLANKS.get());
        dropSelf(ModBlocks.MANGROVE_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.MANGROVE_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.CHERRY_PILED_PLANKS.get());
        dropSelf(ModBlocks.CHERRY_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.CHERRY_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.BAMBOO_PILED_PLANKS.get());
        dropSelf(ModBlocks.BAMBOO_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.BAMBOO_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.CRIMSON_PILED_PLANKS.get());
        dropSelf(ModBlocks.CRIMSON_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.CRIMSON_VERTICAL_PLANKS.get());

        dropSelf(ModBlocks.WARPED_PILED_PLANKS.get());
        dropSelf(ModBlocks.WARPED_POLISHED_PLANKS.get());
        dropSelf(ModBlocks.WARPED_VERTICAL_PLANKS.get());







        //Tecque
        dropSelf(ModBlocks.STONE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.SPRUCE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.BIRCH_GLASS_TECQUE.get());
        dropSelf(ModBlocks.JUNGLE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.ACACIA_GLASS_TECQUE.get());
        dropSelf(ModBlocks.DARK_OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.MANGROVE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.CHERRY_GLASS_TECQUE.get());
        dropSelf(ModBlocks.BAMBOO_GLASS_TECQUE.get());




        //Planks Bricks
        dropSelf(ModBlocks.OAK_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.SPRUCE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.BIRCH_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.JUNGLE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.MANGROVE_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.DARK_OAK_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.CHERRY_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.BAMBOO_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.CRIMSON_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.WARPED_PLANKS_BRICKS.get());



        //Barrels
        dropSelf(ModBlocks.OAK_BARREL.get());
        dropSelf(ModBlocks.BIRCH_BARREL.get());
        dropSelf(ModBlocks.JUNGLE_BARREL.get());
        dropSelf(ModBlocks.ACACIA_BARREL.get());
        dropSelf(ModBlocks.MANGROVE_BARREL.get());
        dropSelf(ModBlocks.DARK_OAK_BARREL.get());
        dropSelf(ModBlocks.CHERRY_BARREL.get());
        dropSelf(ModBlocks.BAMBOO_BARREL.get());
        dropSelf(ModBlocks.CRIMSON_BARREL.get());
        dropSelf(ModBlocks.WARPED_BARREL.get());
        //Planks Pillar
        dropSelf(ModBlocks.OAK_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.SPRUCE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.BIRCH_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.JUNGLE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.MANGROVE_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.DARK_OAK_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.CHERRY_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.BAMBOO_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.CRIMSON_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.WARPED_PLANKS_PILLAR.get());

        //Planks Soft Bricks
        dropSelf(ModBlocks.OAK_SOFT_BRICKS.get());
        dropSelf(ModBlocks.SPRUCE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.BIRCH_SOFT_BRICKS.get());
        dropSelf(ModBlocks.JUNGLE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.ACACIA_SOFT_BRICKS.get());
        dropSelf(ModBlocks.MANGROVE_SOFT_BRICKS.get());
        dropSelf(ModBlocks.DARK_OAK_SOFT_BRICKS.get());
        dropSelf(ModBlocks.CHERRY_SOFT_BRICKS.get());
        dropSelf(ModBlocks.BAMBOO_SOFT_BRICKS.get());
        dropSelf(ModBlocks.CRIMSON_SOFT_BRICKS.get());
        dropSelf(ModBlocks.WARPED_SOFT_BRICKS.get());





        //Furnitures
        //Chairs

        dropSelf(ModBlocks.OAK_CHAIR.get());
        dropSelf(ModBlocks.SPRUCE_CHAIR.get());
        dropSelf(ModBlocks.BIRCH_CHAIR.get());
        dropSelf(ModBlocks.JUNGLE_CHAIR.get());
        dropSelf(ModBlocks.ACACIA_CHAIR.get());
        dropSelf(ModBlocks.MANGROVE_CHAIR.get());
        dropSelf(ModBlocks.DARK_OAK_CHAIR.get());
        dropSelf(ModBlocks.CHERRY_CHAIR.get());
        dropSelf(ModBlocks.BAMBOO_CHAIR.get());
        dropSelf(ModBlocks.CRIMSON_CHAIR.get());
        dropSelf(ModBlocks.WARPED_CHAIR.get());

        dropSelf(ModBlocks.STRIPPED_OAK_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_CHAIR.get());


        //Kitchen Counters
        dropSelf(ModBlocks.OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.SPRUCE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.BIRCH_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.JUNGLE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.ACACIA_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.MANGROVE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.DARK_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.CHERRY_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.BAMBOO_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.CRIMSON_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.WARPED_KITCHEN_COUNTER.get());
            //Stripped Variants
        dropSelf(ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER.get());

        //Kitchen Drawers
        dropSelf(ModBlocks.OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.SPRUCE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.BIRCH_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.JUNGLE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.ACACIA_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.MANGROVE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.DARK_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.CHERRY_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.BAMBOO_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.CRIMSON_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.WARPED_KITCHEN_DRAWER.get());

            //Stripped Variants
        dropSelf(ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get());

        //Kitchen Cabinet
        dropSelf(ModBlocks.OAK_CABINET.get());
        dropSelf(ModBlocks.SPRUCE_CABINET.get());
        dropSelf(ModBlocks.BIRCH_CABINET.get());
        dropSelf(ModBlocks.JUNGLE_CABINET.get());
        dropSelf(ModBlocks.ACACIA_CABINET.get());
        dropSelf(ModBlocks.MANGROVE_CABINET.get());
        dropSelf(ModBlocks.DARK_OAK_CABINET.get());
        dropSelf(ModBlocks.CHERRY_CABINET.get());
        dropSelf(ModBlocks.BAMBOO_CABINET.get());
        dropSelf(ModBlocks.CRIMSON_CABINET.get());
        dropSelf(ModBlocks.WARPED_CABINET.get());

           //Stripped Variants
        dropSelf(ModBlocks.STRIPPED_OAK_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_CABINET.get());


        //Tables
        dropSelf(ModBlocks.OAK_TABLE.get());
        dropSelf(ModBlocks.SPRUCE_TABLE.get());
        dropSelf(ModBlocks.BIRCH_TABLE.get());
        dropSelf(ModBlocks.JUNGLE_TABLE.get());
        dropSelf(ModBlocks.ACACIA_TABLE.get());
        dropSelf(ModBlocks.MANGROVE_TABLE.get());
        dropSelf(ModBlocks.DARK_OAK_TABLE.get());
        dropSelf(ModBlocks.CHERRY_TABLE.get());
        dropSelf(ModBlocks.BAMBOO_TABLE.get());
        dropSelf(ModBlocks.CRIMSON_TABLE.get());
        dropSelf(ModBlocks.WARPED_TABLE.get());

        dropSelf(ModBlocks.STRIPPED_OAK_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_TABLE.get());

        //Sofa
        dropSelf(ModBlocks.RED_SOFA.get());
        dropSelf(ModBlocks.YELLOW_SOFA.get());
        dropSelf(ModBlocks.PINK_SOFA.get());
        dropSelf(ModBlocks.PURPLE_SOFA.get());
        dropSelf(ModBlocks.BROWN_SOFA.get());
        dropSelf(ModBlocks.ORANGE_SOFA.get());
        dropSelf(ModBlocks.BLACK_SOFA.get());
        dropSelf(ModBlocks.WITHE_SOFA.get());
        dropSelf(ModBlocks.MAGENTA_SOFA.get());
        dropSelf(ModBlocks.LIGHT_BLUE_SOFA.get());
        dropSelf(ModBlocks.BLUE_SOFA.get());
        dropSelf(ModBlocks.GREEN_SOFA.get());
        dropSelf(ModBlocks.LIME_SOFA.get());
        dropSelf(ModBlocks.LIGHT_GREY_SOFA.get());
        dropSelf(ModBlocks.GREY_SOFA.get());
        dropSelf(ModBlocks.CYAN_SOFA.get());


        //Bedside
        dropSelf(ModBlocks.OAK_BEDSIDE.get());
        dropSelf(ModBlocks.SPRUCE_BEDSIDE.get());
        dropSelf(ModBlocks.BIRCH_BEDSIDE.get());
        dropSelf(ModBlocks.JUNGLE_BEDSIDE.get());
        dropSelf(ModBlocks.ACACIA_BEDSIDE.get());
        dropSelf(ModBlocks.MANGROVE_BEDSIDE.get());
        dropSelf(ModBlocks.DARK_OAK_BEDSIDE.get());
        dropSelf(ModBlocks.CHERRY_BEDSIDE.get());
        dropSelf(ModBlocks.BAMBOO_BEDSIDE.get());
        dropSelf(ModBlocks.CRIMSON_BEDSIDE.get());
        dropSelf(ModBlocks.WARPED_BEDSIDE.get());

        //Crates
        dropSelf(ModBlocks.OAK_CRATE.get());
        dropSelf(ModBlocks.SPRUCE_CRATE.get());
        dropSelf(ModBlocks.BIRCH_CRATE.get());
        dropSelf(ModBlocks.JUNGLE_CRATE.get());
        dropSelf(ModBlocks.ACACIA_CRATE.get());
        dropSelf(ModBlocks.MANGROVE_CRATE.get());
        dropSelf(ModBlocks.DARK_OAK_CRATE.get());
        dropSelf(ModBlocks.CHERRY_CRATE.get());
        dropSelf(ModBlocks.BAMBOO_CRATE.get());
        dropSelf(ModBlocks.CRIMSON_CRATE.get());
        dropSelf(ModBlocks.WARPED_CRATE.get());

        //Utilities

        //Pedestals

        dropSelf(ModBlocks.PEDESTAL.get());
        dropSelf(ModBlocks.DIORITE_PEDESTAL.get());
        dropSelf(ModBlocks.GRANITE_PEDESTAL.get());
        dropSelf(ModBlocks.BLACKSTONE_PEDESTAL.get());
        dropSelf(ModBlocks.DEEPSLATE_PEDESTAL.get());
        dropSelf(ModBlocks.DEEPSLATE_TILE_PEDESTAL.get());
        dropSelf(ModBlocks.STONE_PEDESTAL.get());

        //Sinks
        dropSelf(ModBlocks.OAK_SINK.get());
        dropSelf(ModBlocks.SPRUCE_SINK.get());
        dropSelf(ModBlocks.BIRCH_SINK.get());
        dropSelf(ModBlocks.JUNGLE_SINK.get());
        dropSelf(ModBlocks.ACACIA_SINK.get());
        dropSelf(ModBlocks.MANGROVE_SINK.get());
        dropSelf(ModBlocks.DARK_OAK_SINK.get());
        dropSelf(ModBlocks.CHERRY_SINK.get());
        dropSelf(ModBlocks.BAMBOO_SINK.get());
        dropSelf(ModBlocks.CRIMSON_SINK.get());
        dropSelf(ModBlocks.WARPED_SINK.get());

        dropSelf(ModBlocks.OAK_SINK_DARK.get());
        dropSelf(ModBlocks.SPRUCE_SINK_DARK.get());
        dropSelf(ModBlocks.BIRCH_SINK_DARK.get());
        dropSelf(ModBlocks.JUNGLE_SINK_DARK.get());
        dropSelf(ModBlocks.ACACIA_SINK_DARK.get());
        dropSelf(ModBlocks.MANGROVE_SINK_DARK.get());
        dropSelf(ModBlocks.DARK_OAK_SINK_DARK.get());
        dropSelf(ModBlocks.CHERRY_SINK_DARK.get());
        dropSelf(ModBlocks.BAMBOO_SINK_DARK.get());
        dropSelf(ModBlocks.CRIMSON_SINK_DARK.get());
        dropSelf(ModBlocks.WARPED_SINK_DARK.get());


        //Stones Variants
        //Counter
        dropSelf(ModBlocks.STONE_COUNTER.get());
        dropSelf(ModBlocks.SPRUCE_DIORITE_COUNTER.get());
        dropSelf(ModBlocks.GRANITE_COUNTER.get());
        dropSelf(ModBlocks.DIORITE_COUNTER.get());
        dropSelf(ModBlocks.BLACKSTONE_COUNTER.get());
        dropSelf(ModBlocks.DEEPSLATE_COUNTER.get());
        dropSelf(ModBlocks.DEEPSLATE_TILE_COUNTER.get());




        dropSelf(ModBlocks.STONE_DRAWER.get());
        dropSelf(ModBlocks.GRANITE_DRAWER.get());
        dropSelf(ModBlocks.DIORITE_DRAWER.get());
        dropSelf(ModBlocks.DEEPSLATE_DRAWER.get());
        dropSelf(ModBlocks.DEEPSLATE_TILES_DRAWER.get());
        dropSelf(ModBlocks.BLACKSTONE_DRAWER.get());





        dropSelf(ModBlocks.STONE_CABINET.get());
        dropSelf(ModBlocks.LIMESTONE.get());

        dropSelf(ModBlocks.STONE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.SPRUCE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.BIRCH_GLASS_TECQUE.get());
        dropSelf(ModBlocks.JUNGLE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.ACACIA_GLASS_TECQUE.get());
        dropSelf(ModBlocks.DARK_OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.MANGROVE_GLASS_TECQUE.get());
        dropSelf(ModBlocks.CHERRY_GLASS_TECQUE.get());
        dropSelf(ModBlocks.BAMBOO_GLASS_TECQUE.get());
        dropSelf(ModBlocks.CRIMSON_GLASS_TECQUE.get());
        dropSelf(ModBlocks.WARPED_GLASS_TECQUE.get());

        dropSelf(ModBlocks.GRANITE_CABINET.get());
        dropSelf(ModBlocks.DIORITE_CABINET.get());
        dropSelf(ModBlocks.DEEPSLATE_CABINET.get());
        dropSelf(ModBlocks.DEEPSLATE_TILES_CABINET.get());
        dropSelf(ModBlocks.BLACKSTONE_CABINET.get());


        dropSelf(ModBlocks.RED_STOOL.get());
        dropSelf(ModBlocks.YELLOW_STOOL.get());
        dropSelf(ModBlocks.ORANGE_STOOL.get());
        dropSelf(ModBlocks.PURPLE_STOOL.get());
        dropSelf(ModBlocks.MAGENTA_STOOL.get());
        dropSelf(ModBlocks.PINK_STOOL.get());
        dropSelf(ModBlocks.BLUE_STOOL.get());
        dropSelf(ModBlocks.LIGHT_BLUE_STOOL.get());
        dropSelf(ModBlocks.WITHE_STOOL.get());
        dropSelf(ModBlocks.CYAN_STOOL.get());
        dropSelf(ModBlocks.GREY_STOOL.get());
        dropSelf(ModBlocks.LIGHT_GREY_STOOL.get());
        dropSelf(ModBlocks.GREEN_STOOL.get());
        dropSelf(ModBlocks.LIME_STOOL.get());
        dropSelf(ModBlocks.BLACK_STOOL.get());
        dropSelf(ModBlocks.BROWN_STOOL.get());

        dropSelf(ModBlocks.RED_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.YELLOW_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.ORANGE_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.PURPLE_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.MAGENTA_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.PINK_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.BLUE_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.WHITE_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.CYAN_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.GRAY_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.GREEN_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.LIME_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.BLACK_DIGITAL_CLOCK.get());
        dropSelf(ModBlocks.BROWN_DIGITAL_CLOCK.get());

        dropSelf(ModBlocks.BIG_CHAIN.get());
        dropSelf(ModBlocks.WALL_LANTERN.get());

        dropSelf(ModBlocks.OAK_SHELF.get());
        dropSelf(ModBlocks.SPRUCE_SHELF.get());
        dropSelf(ModBlocks.BIRCH_SHELF.get());
        dropSelf(ModBlocks.JUNGLE_SHELF.get());
        dropSelf(ModBlocks.ACACIA_SHELF.get());
        dropSelf(ModBlocks.DARK_OAK_SHELF.get());
        dropSelf(ModBlocks.MANGROVE_SHELF.get());
        dropSelf(ModBlocks.CHERRY_SHELF.get());
        dropSelf(ModBlocks.BAMBOO_SHELF.get());
        dropSelf(ModBlocks.CRIMSON_SHELF.get());
        dropSelf(ModBlocks.WARPED_SHELF.get());

        //Copper Lantern
        dropSelf(ModBlocks.COPPER_LANTERN.get());
        dropSelf(ModBlocks.EXPOSED_LANTERN.get());
        dropSelf(ModBlocks.WEATHERED_LANTERN.get());
        dropSelf(ModBlocks.OXIDIZED_LANTERN.get());

        //Waxed Copper Lantern
        dropSelf(ModBlocks.WAXED_COPPER_LANTERN.get());
        dropSelf(ModBlocks.WAXED_EXPOSED_LANTERN.get());
        dropSelf(ModBlocks.WAXED_WEATHERED_LANTERN.get());
        dropSelf(ModBlocks.WAXED_OXIDIZED_LANTERN.get());


     // Vertical slab
        add(ModBlocks.OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OAK_VERTICAL_SLAB.get()));
        add(ModBlocks.SPRUCE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SPRUCE_VERTICAL_SLAB.get()));
        add(ModBlocks.BIRCH_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BIRCH_VERTICAL_SLAB.get()));
        add(ModBlocks.JUNGLE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.JUNGLE_VERTICAL_SLAB.get()));
        add(ModBlocks.ACACIA_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ACACIA_VERTICAL_SLAB.get()));
        add(ModBlocks.DARK_OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_OAK_VERTICAL_SLAB.get()));
        add(ModBlocks.MANGROVE_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MANGROVE_VERTICAL_SLAB.get()));
        add(ModBlocks.CHERRY_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHERRY_VERTICAL_SLAB.get()));
        add(ModBlocks.BAMBOO_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BAMBOO_VERTICAL_SLAB.get()));
        add(ModBlocks.CRIMSON_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRIMSON_VERTICAL_SLAB.get()));
        add(ModBlocks.WARPED_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WARPED_VERTICAL_SLAB.get()));
        add(ModBlocks.PALE_OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALE_OAK_VERTICAL_SLAB.get()));




        dropSelf(ModBlocks.OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.SPRUCE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.BIRCH_COFFEE_TABLE.get());
        dropSelf(ModBlocks.JUNGLE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.ACACIA_COFFEE_TABLE.get());
        dropSelf(ModBlocks.DARK_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.MANGROVE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.CHERRY_COFFEE_TABLE.get());
        dropSelf(ModBlocks.BAMBOO_COFFEE_TABLE.get());
        dropSelf(ModBlocks.CRIMSON_COFFEE_TABLE.get());
        dropSelf(ModBlocks.WARPED_COFFEE_TABLE.get());

        dropSelf(ModBlocks.STRIPPED_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_COFFEE_TABLE.get());



        dropSelf(ModBlocks.OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.SPRUCE_DINNING_TABLE.get());
        dropSelf(ModBlocks.BIRCH_DINNING_TABLE.get());
        dropSelf(ModBlocks.JUNGLE_DINNING_TABLE.get());
        dropSelf(ModBlocks.ACACIA_DINNING_TABLE.get());
        dropSelf(ModBlocks.DARK_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.MANGROVE_DINNING_TABLE.get());
        dropSelf(ModBlocks.CHERRY_DINNING_TABLE.get());
        dropSelf(ModBlocks.BAMBOO_DINNING_TABLE.get());
        dropSelf(ModBlocks.CRIMSON_DINNING_TABLE.get());
        dropSelf(ModBlocks.WARPED_DINNING_TABLE.get());

        dropSelf(ModBlocks.STRIPPED_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_DINNING_TABLE.get());

        dropSelf(ModBlocks.OAK_OVEN.get());
        dropSelf(ModBlocks.SPRUCE_OVEN.get());
        dropSelf(ModBlocks.BIRCH_OVEN.get());
        dropSelf(ModBlocks.JUNGLE_OVEN.get());
        dropSelf(ModBlocks.ACACIA_OVEN.get());
        dropSelf(ModBlocks.DARK_OAK_OVEN.get());
        dropSelf(ModBlocks.MANGROVE_OVEN.get());
        dropSelf(ModBlocks.CHERRY_OVEN.get());
        dropSelf(ModBlocks.BAMBOO_OVEN.get());
        dropSelf(ModBlocks.CRIMSON_OVEN.get());
        dropSelf(ModBlocks.WARPED_OVEN.get());

        dropSelf(ModBlocks.STRIPPED_OAK_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_BIRCH_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_JUNGLE_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_ACACIA_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_DARK_OAK_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_MANGROVE_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_CHERRY_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_BAMBOO_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_CRIMSON_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_WARPED_OVEN.get());

        dropSelf(ModBlocks.OAK_ANDESITE_OVEN.get());
        dropSelf(ModBlocks.SPRUCE_DIORITE_OVEN.get());
        dropSelf(ModBlocks.DARK_OAK_CALCITE_OVEN.get());



        dropSelf(ModBlocks.LIGHT_MICROWAVE.get());
        dropSelf(ModBlocks.DARK_MICROWAVE.get());

        dropSelf(ModBlocks.DARK_OAK_CALCITE_COUNTER.get());
        dropSelf(ModBlocks.DARK_OAK_CALCITE_DRAWER.get());
        dropSelf(ModBlocks.DARK_OAK_CALCITE_CABINET.get());

        dropSelf(ModBlocks.OAK_ANDESITE_COUNTER.get());
        dropSelf(ModBlocks.OAK_ANDESITE_DRAWER.get());
        dropSelf(ModBlocks.OAK_ANDESITE_CABINET.get());

        dropSelf(ModBlocks.SPRUCE_DIORITE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.SPRUCE_DIORITE_CABINET.get());

        dropSelf(ModBlocks.PALE_OAK_SHELF.get());
        dropSelf(ModBlocks.PALE_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.PALE_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.PALE_OAK_OVEN.get());
        dropSelf(ModBlocks.PALE_OAK_CRATE.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_OVEN.get());
        dropSelf(ModBlocks.PALE_OAK_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_SPRUCE_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_SINK.get());
        dropSelf(ModBlocks.PALE_OAK_SINK_DARK.get());
        dropSelf(ModBlocks.PALE_OAK_BEDSIDE.get());
        dropSelf(ModBlocks.PALE_OAK_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.PALE_OAK_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_TABLE.get());

        dropSelf(ModBlocks.OAK_PARK_BENCH.get());
        dropSelf(ModBlocks.SPRUCE_PARK_BENCH.get());
        dropSelf(ModBlocks.BIRCH_PARK_BENCH.get());
        dropSelf(ModBlocks.JUNGLE_PARK_BENCH.get());
        dropSelf(ModBlocks.ACACIA_PARK_BENCH.get());
        dropSelf(ModBlocks.DARK_OAK_PARK_BENCH.get());
        dropSelf(ModBlocks.MANGROVE_PARK_BENCH.get());
        dropSelf(ModBlocks.CHERRY_PARK_BENCH.get());
        dropSelf(ModBlocks.BAMBOO_PARK_BENCH.get());
        dropSelf(ModBlocks.CRIMSON_PARK_BENCH.get());
        dropSelf(ModBlocks.WARPED_PARK_BENCH.get());

        dropSelf(ModBlocks.OAK_DESK.get());
        dropSelf(ModBlocks.SPRUCE_DESK.get());
        dropSelf(ModBlocks.BIRCH_DESK.get());
        dropSelf(ModBlocks.JUNGLE_DESK.get());
        dropSelf(ModBlocks.ACACIA_DESK.get());
        dropSelf(ModBlocks.DARK_OAK_DESK.get());
        dropSelf(ModBlocks.MANGROVE_DESK.get());
        dropSelf(ModBlocks.CHERRY_DESK.get());
        dropSelf(ModBlocks.BAMBOO_DESK.get());
        dropSelf(ModBlocks.CRIMSON_DESK.get());
        dropSelf(ModBlocks.WARPED_DESK.get());

        dropSelf(ModBlocks.OAK_DESK_CABINET.get());
        dropSelf(ModBlocks.SPRUCE_DESK_CABINET.get());
        dropSelf(ModBlocks.BIRCH_DESK_CABINET.get());
        dropSelf(ModBlocks.JUNGLE_DESK_CABINET.get());
        dropSelf(ModBlocks.ACACIA_DESK_CABINET.get());
        dropSelf(ModBlocks.DARK_OAK_DESK_CABINET.get());
        dropSelf(ModBlocks.MANGROVE_DESK_CABINET.get());
        dropSelf(ModBlocks.CHERRY_DESK_CABINET.get());
        dropSelf(ModBlocks.BAMBOO_DESK_CABINET.get());
        dropSelf(ModBlocks.CRIMSON_DESK_CABINET.get());
        dropSelf(ModBlocks.WARPED_DESK_CABINET.get());

        dropSelf(ModBlocks.RED_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.YELLOW_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.PINK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.PURPLE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.BROWN_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.ORANGE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.BLACK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.WHITE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.MAGENTA_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.LIGHT_BLUE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.BLUE_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.GREEN_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.LIME_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.LIGHT_GRAY_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.GRAY_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.CYAN_KITCHEN_COUNTER.get());

        dropSelf(ModBlocks.RED_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.YELLOW_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.PINK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.PURPLE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.BROWN_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.ORANGE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.BLACK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.WHITE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.MAGENTA_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.LIGHT_BLUE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.BLUE_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.GREEN_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.LIME_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.LIGHT_GRAY_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.GRAY_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.CYAN_KITCHEN_DRAWER.get());

        dropSelf(ModBlocks.RED_OVEN.get());
        dropSelf(ModBlocks.YELLOW_OVEN.get());
        dropSelf(ModBlocks.PINK_OVEN.get());
        dropSelf(ModBlocks.PURPLE_OVEN.get());
        dropSelf(ModBlocks.BROWN_OVEN.get());
        dropSelf(ModBlocks.ORANGE_OVEN.get());
        dropSelf(ModBlocks.BLACK_OVEN.get());
        dropSelf(ModBlocks.WHITE_OVEN.get());
        dropSelf(ModBlocks.MAGENTA_OVEN.get());
        dropSelf(ModBlocks.LIGHT_BLUE_OVEN.get());
        dropSelf(ModBlocks.BLUE_OVEN.get());
        dropSelf(ModBlocks.GREEN_OVEN.get());
        dropSelf(ModBlocks.LIME_OVEN.get());
        dropSelf(ModBlocks.LIGHT_GRAY_OVEN.get());
        dropSelf(ModBlocks.GRAY_OVEN.get());
        dropSelf(ModBlocks.CYAN_OVEN.get());

        dropSelf(ModBlocks.RED_SINK.get());
        dropSelf(ModBlocks.YELLOW_SINK.get());
        dropSelf(ModBlocks.PINK_SINK.get());
        dropSelf(ModBlocks.PURPLE_SINK.get());
        dropSelf(ModBlocks.BROWN_SINK.get());
        dropSelf(ModBlocks.ORANGE_SINK.get());
        dropSelf(ModBlocks.BLACK_SINK.get());
        dropSelf(ModBlocks.WHITE_SINK.get());
        dropSelf(ModBlocks.MAGENTA_SINK.get());
        dropSelf(ModBlocks.LIGHT_BLUE_SINK.get());
        dropSelf(ModBlocks.BLUE_SINK.get());
        dropSelf(ModBlocks.GREEN_SINK.get());
        dropSelf(ModBlocks.LIME_SINK.get());
        dropSelf(ModBlocks.LIGHT_GRAY_SINK.get());
        dropSelf(ModBlocks.GRAY_SINK.get());
        dropSelf(ModBlocks.CYAN_SINK.get());

        dropSelf(ModBlocks.RED_CABINET.get());
        dropSelf(ModBlocks.YELLOW_CABINET.get());
        dropSelf(ModBlocks.PINK_CABINET.get());
        dropSelf(ModBlocks.PURPLE_CABINET.get());
        dropSelf(ModBlocks.BROWN_CABINET.get());
        dropSelf(ModBlocks.ORANGE_CABINET.get());
        dropSelf(ModBlocks.BLACK_CABINET.get());
        dropSelf(ModBlocks.WHITE_CABINET.get());
        dropSelf(ModBlocks.MAGENTA_CABINET.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CABINET.get());
        dropSelf(ModBlocks.BLUE_CABINET.get());
        dropSelf(ModBlocks.GREEN_CABINET.get());
        dropSelf(ModBlocks.LIME_CABINET.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CABINET.get());
        dropSelf(ModBlocks.GRAY_CABINET.get());
        dropSelf(ModBlocks.CYAN_CABINET.get());

        dropSelf(ModBlocks.FRIDGE_LIGHT.get());
        dropSelf(ModBlocks.FRIDGE_DARK.get());

        dropOther(ModBlocks.FREEZER_LIGHT.get(), ModBlocks.FRIDGE_LIGHT.get());
        dropOther(ModBlocks.FREEZER_DARK.get(), ModBlocks.FRIDGE_DARK.get());

        dropSelf(ModBlocks.STONE_PATH.get());

        dropSelf(ModBlocks.PALE_OAK_BARREL.get());
        dropSelf(ModBlocks.PALE_OAK_DESK.get());
        dropSelf(ModBlocks.PALE_OAK_DESK_CABINET.get());
        dropSelf(ModBlocks.PALE_OAK_PARK_BENCH.get());
        dropSelf(ModBlocks.PALE_OAK_SOFT_BRICKS.get());
        dropSelf(ModBlocks.PALE_OAK_PLANKS_BRICKS.get());
        dropSelf(ModBlocks.PALE_OAK_PLANKS_PILLAR.get());
        dropSelf(ModBlocks.PALE_OAK_VERTICAL.get());
        dropSelf(ModBlocks.PALE_OAK_SMOOTH_PLANKS.get());
        dropSelf(ModBlocks.PALE_OAK_LARGE_PLANKS.get());
        dropSelf(ModBlocks.PALE_OAK_SHELF.get());
        dropSelf(ModBlocks.PALE_OAK_GLASS_TECQUE.get());
        dropSelf(ModBlocks.PALE_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.PALE_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.PALE_OAK_OVEN.get());
        dropSelf(ModBlocks.PALE_OAK_SINK.get());
        dropSelf(ModBlocks.PALE_OAK_SINK_DARK.get());
        dropSelf(ModBlocks.PALE_OAK_CABINET.get());
        dropSelf(ModBlocks.PALE_OAK_CHAIR.get());
        dropSelf(ModBlocks.PALE_OAK_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_BEDSIDE.get());
        dropSelf(ModBlocks.PALE_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_COFFEE_TABLE.get());
        dropSelf(ModBlocks.PALE_OAK_CRATE.get());
        add(ModBlocks.PALE_OAK_VERTICAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PALE_OAK_VERTICAL_SLAB.get()));



        dropSelf(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_COUNTER.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_KITCHEN_DRAWER.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_OVEN.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_CABINET.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_CHAIR.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_DINNING_TABLE.get());
        dropSelf(ModBlocks.STRIPPED_PALE_OAK_COFFEE_TABLE.get());

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
