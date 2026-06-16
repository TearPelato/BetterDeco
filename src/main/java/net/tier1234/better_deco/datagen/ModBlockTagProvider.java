package net.tier1234.better_deco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.init.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, BetterDeco.MOD_ID);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
      /*  tag(BlockTags.MINEABLE_WITH_AXE)
                //Planks Bricks
                .add(ModBlocks.OAK_PLANKS_BRICKS.get())
                .add(ModBlocks.SPRUCE_PLANKS_BRICKS.get())
                .add(ModBlocks.BIRCH_PLANKS_BRICKS.get())
                .add(ModBlocks.JUNGLE_PLANKS_BRICKS.get())
                .add(ModBlocks.ACACIA_PLANKS_BRICKS.get())
                .add(ModBlocks.MANGROVE_PLANKS_BRICKS.get())
                .add(ModBlocks.DARK_OAK_PLANKS_BRICKS.get())
                .add(ModBlocks.CHERRY_PLANKS_BRICKS.get())
                .add(ModBlocks.BAMBOO_PLANKS_BRICKS.get())
                .add(ModBlocks.CRIMSON_PLANKS_BRICKS.get())
                .add(ModBlocks.WARPED_PLANKS_BRICKS.get())

                  //Planks Pillar
                .add(ModBlocks.OAK_PLANKS_PILLAR.get())
                .add(ModBlocks.SPRUCE_PLANKS_PILLAR.get())
                .add(ModBlocks.BIRCH_PLANKS_PILLAR.get())
                .add(ModBlocks.JUNGLE_PLANKS_PILLAR.get())
                .add(ModBlocks.ACACIA_PLANKS_PILLAR.get())
                .add(ModBlocks.MANGROVE_PLANKS_PILLAR.get())
                .add(ModBlocks.DARK_OAK_PLANKS_PILLAR.get())
                .add(ModBlocks.CHERRY_PLANKS_PILLAR.get())
                .add(ModBlocks.BAMBOO_PLANKS_PILLAR.get())
                .add(ModBlocks.CRIMSON_PLANKS_PILLAR.get())
                .add(ModBlocks.WARPED_PLANKS_PILLAR.get())

                  //Soft Bricks Planks
                .add(ModBlocks.OAK_SOFT_BRICKS.get())
                .add(ModBlocks.SPRUCE_SOFT_BRICKS.get())
                .add(ModBlocks.BIRCH_SOFT_BRICKS.get())
                .add(ModBlocks.JUNGLE_SOFT_BRICKS.get())
                .add(ModBlocks.ACACIA_SOFT_BRICKS.get())
                .add(ModBlocks.MANGROVE_SOFT_BRICKS.get())
                .add(ModBlocks.DARK_OAK_SOFT_BRICKS.get())
                .add(ModBlocks.CHERRY_SOFT_BRICKS.get())
                .add(ModBlocks.BAMBOO_SOFT_BRICKS.get())
                .add(ModBlocks.CRIMSON_SOFT_BRICKS.get())
                .add(ModBlocks.WARPED_SOFT_BRICKS.get())

                 //Barrels
                .add(ModBlocks.OAK_BARREL.get())
                .add(ModBlocks.BIRCH_BARREL.get())
                .add(ModBlocks.JUNGLE_BARREL.get())
                .add(ModBlocks.ACACIA_BARREL.get())
                .add(ModBlocks.MANGROVE_BARREL.get())
                .add(ModBlocks.DARK_OAK_BARREL.get())
                .add(ModBlocks.CHERRY_BARREL.get())
                .add(ModBlocks.BAMBOO_BARREL.get())
                .add(ModBlocks.CRIMSON_BARREL.get())
                .add(ModBlocks.WARPED_BARREL.get())

        //Furniture
                   //Tables
                .add(ModBlocks.OAK_TABLE.get())
                .add(ModBlocks.SPRUCE_TABLE.get())
                .add(ModBlocks.BIRCH_TABLE.get())
                .add(ModBlocks.JUNGLE_TABLE.get())
                .add(ModBlocks.ACACIA_TABLE.get())
                .add(ModBlocks.MANGROVE_TABLE.get())
                .add(ModBlocks.DARK_OAK_TABLE.get())
                .add(ModBlocks.CHERRY_TABLE.get())
                .add(ModBlocks.BAMBOO_TABLE.get())
                .add(ModBlocks.CRIMSON_TABLE.get())
                .add(ModBlocks.WARPED_TABLE.get())

                .add(ModBlocks.STRIPPED_OAK_TABLE.get())
                .add(ModBlocks.STRIPPED_SPRUCE_TABLE.get())
                .add(ModBlocks.STRIPPED_BIRCH_TABLE.get())
                .add(ModBlocks.STRIPPED_JUNGLE_TABLE.get())
                .add(ModBlocks.STRIPPED_ACACIA_TABLE.get())
                .add(ModBlocks.STRIPPED_MANGROVE_TABLE.get())
                .add(ModBlocks.STRIPPED_DARK_OAK_TABLE.get())
                .add(ModBlocks.STRIPPED_CHERRY_TABLE.get())
                .add(ModBlocks.STRIPPED_BAMBOO_TABLE.get())
                .add(ModBlocks.STRIPPED_CRIMSON_TABLE.get())
                .add(ModBlocks.STRIPPED_WARPED_TABLE.get())

        //Chairs
                .add(ModBlocks.OAK_CHAIR.get())
                .add(ModBlocks.SPRUCE_CHAIR.get())
                .add(ModBlocks.BIRCH_CHAIR.get())
                .add(ModBlocks.JUNGLE_CHAIR.get())
                .add(ModBlocks.ACACIA_CHAIR.get())
                .add(ModBlocks.MANGROVE_CHAIR.get())
                .add(ModBlocks.DARK_OAK_CHAIR.get())
                .add(ModBlocks.CHERRY_CHAIR.get())
                .add(ModBlocks.BAMBOO_CHAIR.get())
                .add(ModBlocks.CRIMSON_CHAIR.get())
                .add(ModBlocks.WARPED_CHAIR.get())

                .add(ModBlocks.STRIPPED_OAK_CHAIR.get())
                .add(ModBlocks.STRIPPED_SPRUCE_CHAIR.get())
                .add(ModBlocks.STRIPPED_BIRCH_CHAIR.get())
                .add(ModBlocks.STRIPPED_JUNGLE_CHAIR.get())
                .add(ModBlocks.STRIPPED_ACACIA_CHAIR.get())
                .add(ModBlocks.STRIPPED_MANGROVE_CHAIR.get())
                .add(ModBlocks.STRIPPED_DARK_OAK_CHAIR.get())
                .add(ModBlocks.STRIPPED_CHERRY_CHAIR.get())
                .add(ModBlocks.STRIPPED_BAMBOO_CHAIR.get())
                .add(ModBlocks.STRIPPED_CRIMSON_CHAIR.get())
                .add(ModBlocks.STRIPPED_WARPED_CHAIR.get())

        //Crates
                .add(ModBlocks.OAK_CRATE.get())
                .add(ModBlocks.SPRUCE_CRATE.get())
                .add(ModBlocks.BIRCH_CRATE.get())
                .add(ModBlocks.JUNGLE_CRATE.get())
                .add(ModBlocks.ACACIA_CRATE.get())
                .add(ModBlocks.MANGROVE_CRATE.get())
                .add(ModBlocks.DARK_OAK_CRATE.get())
                .add(ModBlocks.CHERRY_CRATE.get())
                .add(ModBlocks.BAMBOO_CRATE.get())
                .add(ModBlocks.CRIMSON_CRATE.get())
                .add(ModBlocks.WARPED_CRATE.get())

        //Planks Additions
                .add(ModBlocks.OAK_PILED_PLANKS.get())
                .add(ModBlocks.OAK_VERTICAL_PLANKS.get())
                .add(ModBlocks.OAK_POLISHED_PLANKS.get())

                .add(ModBlocks.SPRUCE_PILED_PLANKS.get())
                .add(ModBlocks.SPRUCE_VERTICAL_PLANKS.get())
                .add(ModBlocks.SPRUCE_POLISHED_PLANKS.get())

                .add(ModBlocks.BIRCH_PILED_PLANKS.get())
                .add(ModBlocks.BIRCH_VERTICAL_PLANKS.get())
                .add(ModBlocks.BIRCH_POLISHED_PLANKS.get())

                .add(ModBlocks.ACACIA_PILED_PLANKS.get())
                .add(ModBlocks.ACACIA_VERTICAL_PLANKS.get())
                .add(ModBlocks.ACACIA_POLISHED_PLANKS.get())

                .add(ModBlocks.JUNGLE_PILED_PLANKS.get())
                .add(ModBlocks.JUNGLE_VERTICAL_PLANKS.get())
                .add(ModBlocks.JUNGLE_POLISHED_PLANKS.get())

                .add(ModBlocks.DARK_OAK_PILED_PLANKS.get())
                .add(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get())
                .add(ModBlocks.DARK_OAK_POLISHED_PLANKS.get())

                .add(ModBlocks.MANGROVE_PILED_PLANKS.get())
                .add(ModBlocks.MANGROVE_VERTICAL_PLANKS.get())
                .add(ModBlocks.MANGROVE_POLISHED_PLANKS.get())

                .add(ModBlocks.CHERRY_PILED_PLANKS.get())
                .add(ModBlocks.CHERRY_VERTICAL_PLANKS.get())
                .add(ModBlocks.CHERRY_POLISHED_PLANKS.get())

                .add(ModBlocks.BAMBOO_PILED_PLANKS.get())
                .add(ModBlocks.BAMBOO_VERTICAL_PLANKS.get())
                .add(ModBlocks.BAMBOO_POLISHED_PLANKS.get())

                .add(ModBlocks.CRIMSON_PILED_PLANKS.get())
                .add(ModBlocks.CRIMSON_VERTICAL_PLANKS.get())
                .add(ModBlocks.CRIMSON_POLISHED_PLANKS.get())

                .add(ModBlocks.WARPED_PILED_PLANKS.get())
                .add(ModBlocks.WARPED_VERTICAL_PLANKS.get())
                .add(ModBlocks.WARPED_POLISHED_PLANKS.get())



                //Bedside
                .add(ModBlocks.OAK_BEDSIDE.get())
                .add(ModBlocks.SPRUCE_BEDSIDE.get())
                .add(ModBlocks.BIRCH_BEDSIDE.get())
                .add(ModBlocks.JUNGLE_BEDSIDE.get())
                .add(ModBlocks.ACACIA_BEDSIDE.get())
                .add(ModBlocks.DARK_OAK_BEDSIDE.get())
                .add(ModBlocks.MANGROVE_BEDSIDE.get())
                .add(ModBlocks.CHERRY_BEDSIDE.get())
                .add(ModBlocks.BAMBOO_BEDSIDE.get())
                .add(ModBlocks.CRIMSON_BEDSIDE.get())
                .add(ModBlocks.WARPED_BEDSIDE.get())

                //Sink
                .add(ModBlocks.OAK_SINK.get())
                .add(ModBlocks.SPRUCE_SINK.get())
                .add(ModBlocks.BIRCH_SINK.get())
                .add(ModBlocks.JUNGLE_SINK.get())
                .add(ModBlocks.ACACIA_SINK.get())
                .add(ModBlocks.DARK_OAK_SINK.get())
                .add(ModBlocks.MANGROVE_SINK.get())
                .add(ModBlocks.CHERRY_SINK.get())
                .add(ModBlocks.BAMBOO_SINK.get())
                .add(ModBlocks.CRIMSON_SINK.get())
                .add(ModBlocks.WARPED_SINK.get())

                .add(ModBlocks.OAK_SINK_DARK.get())
                .add(ModBlocks.SPRUCE_SINK_DARK.get())
                .add(ModBlocks.BIRCH_SINK_DARK.get())
                .add(ModBlocks.JUNGLE_SINK_DARK.get())
                .add(ModBlocks.ACACIA_SINK_DARK.get())
                .add(ModBlocks.DARK_OAK_SINK_DARK.get())
                .add(ModBlocks.MANGROVE_SINK_DARK.get())
                .add(ModBlocks.CHERRY_SINK_DARK.get())
                .add(ModBlocks.BAMBOO_SINK_DARK.get())
                .add(ModBlocks.CRIMSON_SINK_DARK.get())
                .add(ModBlocks.WARPED_SINK_DARK.get())



                //Wooden Tecque
                .add(ModBlocks.OAK_GLASS_TECQUE.get())
                .add(ModBlocks.SPRUCE_GLASS_TECQUE.get())
                .add(ModBlocks.BIRCH_GLASS_TECQUE.get())
                .add(ModBlocks.JUNGLE_GLASS_TECQUE.get())
                .add(ModBlocks.ACACIA_GLASS_TECQUE.get())
                .add(ModBlocks.DARK_OAK_GLASS_TECQUE.get())
                .add(ModBlocks.MANGROVE_GLASS_TECQUE.get())
                .add(ModBlocks.CHERRY_GLASS_TECQUE.get())
                .add(ModBlocks.BAMBOO_GLASS_TECQUE.get())
                .add(ModBlocks.CRIMSON_GLASS_TECQUE.get())
                .add(ModBlocks.WARPED_GLASS_TECQUE.get())

                //Sofa
                .add(ModBlocks.RED_SOFA.get())
                .add(ModBlocks.ORANGE_SOFA.get())
                .add(ModBlocks.YELLOW_SOFA.get())
                .add(ModBlocks.MAGENTA_SOFA.get())
                .add(ModBlocks.PINK_SOFA.get())
                .add(ModBlocks.PURPLE_SOFA.get())
                .add(ModBlocks.BLUE_SOFA.get())
                .add(ModBlocks.CYAN_SOFA.get())
                .add(ModBlocks.LIGHT_BLUE_SOFA.get())
                .add(ModBlocks.GREEN_SOFA.get())
                .add(ModBlocks.LIME_SOFA.get())
                .add(ModBlocks.GREY_SOFA.get())
                .add(ModBlocks.LIGHT_GREY_SOFA.get())
                .add(ModBlocks.BLACK_SOFA.get())
                .add(ModBlocks.WITHE_SOFA.get())
                .add(ModBlocks.BROWN_SOFA.get())

                //Shelf
                .add(ModBlocks.OAK_SHELF.get())
                .add(ModBlocks.SPRUCE_SHELF.get())
                .add(ModBlocks.BIRCH_SHELF.get())
                .add(ModBlocks.JUNGLE_SHELF.get())
                .add(ModBlocks.ACACIA_SHELF.get())
                .add(ModBlocks.DARK_OAK_SHELF.get())
                .add(ModBlocks.MANGROVE_SHELF.get())
                .add(ModBlocks.CHERRY_SHELF.get())
                .add(ModBlocks.BAMBOO_SHELF.get())
                .add(ModBlocks.CRIMSON_SHELF.get())
                .add(ModBlocks.WARPED_SHELF.get())

                //Vertical Slab Planks
                .add(ModBlocks.OAK_VERTICAL_SLAB.get())
                .add(ModBlocks.SPRUCE_VERTICAL_SLAB.get())
                .add(ModBlocks.BIRCH_VERTICAL_SLAB.get())
                .add(ModBlocks.JUNGLE_VERTICAL_SLAB.get())
                .add(ModBlocks.ACACIA_VERTICAL_SLAB.get())
                .add(ModBlocks.DARK_OAK_VERTICAL_SLAB.get())
                .add(ModBlocks.MANGROVE_VERTICAL_SLAB.get())
                .add(ModBlocks.CHERRY_VERTICAL_SLAB.get())
                .add(ModBlocks.BAMBOO_VERTICAL_SLAB.get())
                .add(ModBlocks.CRIMSON_VERTICAL_SLAB.get())
                .add(ModBlocks.WARPED_VERTICAL_SLAB.get())


                //Coffee Table
                .add(ModBlocks.OAK_COFFEE_TABLE.get())
                .add(ModBlocks.SPRUCE_COFFEE_TABLE.get())
                .add(ModBlocks.BIRCH_COFFEE_TABLE.get())
                .add(ModBlocks.JUNGLE_COFFEE_TABLE.get())
                .add(ModBlocks.ACACIA_COFFEE_TABLE.get())
                .add(ModBlocks.DARK_OAK_COFFEE_TABLE.get())
                .add(ModBlocks.MANGROVE_COFFEE_TABLE.get())
                .add(ModBlocks.CHERRY_COFFEE_TABLE.get())
                .add(ModBlocks.BAMBOO_COFFEE_TABLE.get())
                .add(ModBlocks.CRIMSON_COFFEE_TABLE.get())
                .add(ModBlocks.WARPED_COFFEE_TABLE.get())

                .add(ModBlocks.STRIPPED_OAK_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE.get())
                .add(ModBlocks.STRIPPED_WARPED_COFFEE_TABLE.get())

                 //Dinning Table
                .add(ModBlocks.OAK_DINNING_TABLE.get())
                .add(ModBlocks.SPRUCE_DINNING_TABLE.get())
                .add(ModBlocks.BIRCH_DINNING_TABLE.get())
                .add(ModBlocks.JUNGLE_DINNING_TABLE.get())
                .add(ModBlocks.ACACIA_DINNING_TABLE.get())
                .add(ModBlocks.DARK_OAK_DINNING_TABLE.get())
                .add(ModBlocks.MANGROVE_DINNING_TABLE.get())
                .add(ModBlocks.CHERRY_DINNING_TABLE.get())
                .add(ModBlocks.BAMBOO_DINNING_TABLE.get())
                .add(ModBlocks.CRIMSON_DINNING_TABLE.get())
                .add(ModBlocks.WARPED_DINNING_TABLE.get())

                .add(ModBlocks.STRIPPED_OAK_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_BIRCH_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_ACACIA_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_CHERRY_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE.get())
                .add(ModBlocks.STRIPPED_WARPED_DINNING_TABLE.get())





        //Counter
                .add(ModBlocks.OAK_KITCHEN_COUNTER.get())
                .add(ModBlocks.SPRUCE_KITCHEN_COUNTER.get())
                .add(ModBlocks.BIRCH_KITCHEN_COUNTER.get())
                .add(ModBlocks.JUNGLE_KITCHEN_COUNTER.get())
                .add(ModBlocks.ACACIA_KITCHEN_COUNTER.get())
                .add(ModBlocks.DARK_OAK_KITCHEN_COUNTER.get())
                .add(ModBlocks.MANGROVE_KITCHEN_COUNTER.get())
                .add(ModBlocks.CHERRY_KITCHEN_COUNTER.get())
                .add(ModBlocks.BAMBOO_KITCHEN_COUNTER.get())
                .add(ModBlocks.CRIMSON_KITCHEN_COUNTER.get())
                .add(ModBlocks.WARPED_KITCHEN_COUNTER.get())
        //Drawer
                .add(ModBlocks.OAK_KITCHEN_DRAWER.get())
                .add(ModBlocks.SPRUCE_KITCHEN_DRAWER.get())
                .add(ModBlocks.BIRCH_KITCHEN_DRAWER.get())
                .add(ModBlocks.JUNGLE_KITCHEN_DRAWER.get())
                .add(ModBlocks.ACACIA_KITCHEN_DRAWER.get())
                .add(ModBlocks.DARK_OAK_KITCHEN_DRAWER.get())
                .add(ModBlocks.MANGROVE_KITCHEN_DRAWER.get())
                .add(ModBlocks.CHERRY_KITCHEN_DRAWER.get())
                .add(ModBlocks.BAMBOO_KITCHEN_DRAWER.get())
                .add(ModBlocks.CRIMSON_KITCHEN_DRAWER.get())
                .add(ModBlocks.WARPED_KITCHEN_DRAWER.get())
        //Cabinet
                .add(ModBlocks.OAK_CABINET.get())
                .add(ModBlocks.SPRUCE_CABINET.get())
                .add(ModBlocks.BIRCH_CABINET.get())
                .add(ModBlocks.JUNGLE_CABINET.get())
                .add(ModBlocks.ACACIA_CABINET.get())
                .add(ModBlocks.DARK_OAK_CABINET.get())
                .add(ModBlocks.MANGROVE_CABINET.get())
                .add(ModBlocks.CHERRY_CABINET.get())
                .add(ModBlocks.BAMBOO_CABINET.get())
                .add(ModBlocks.CRIMSON_CABINET.get())
                .add(ModBlocks.WARPED_CABINET.get())
        //Oven
                .add(ModBlocks.OAK_OVEN.get())
                .add(ModBlocks.SPRUCE_OVEN.get())
                .add(ModBlocks.BIRCH_OVEN.get())
                .add(ModBlocks.JUNGLE_OVEN.get())
                .add(ModBlocks.ACACIA_OVEN.get())
                .add(ModBlocks.DARK_OAK_OVEN.get())
                .add(ModBlocks.MANGROVE_OVEN.get())
                .add(ModBlocks.CHERRY_OVEN.get())
                .add(ModBlocks.BAMBOO_OVEN.get())
                .add(ModBlocks.CRIMSON_OVEN.get())
                .add(ModBlocks.WARPED_OVEN.get())

                .add(ModBlocks.STRIPPED_OAK_OVEN.get())
                .add(ModBlocks.STRIPPED_SPRUCE_OVEN.get())
                .add(ModBlocks.STRIPPED_BIRCH_OVEN.get())
                .add(ModBlocks.STRIPPED_JUNGLE_OVEN.get())
                .add(ModBlocks.STRIPPED_ACACIA_OVEN.get())
                .add(ModBlocks.STRIPPED_DARK_OAK_OVEN.get())
                .add(ModBlocks.STRIPPED_MANGROVE_OVEN.get())
                .add(ModBlocks.STRIPPED_CHERRY_OVEN.get())
                .add(ModBlocks.STRIPPED_BAMBOO_OVEN.get())
                .add(ModBlocks.STRIPPED_CRIMSON_OVEN.get())
                .add(ModBlocks.STRIPPED_WARPED_OVEN.get())

        ;

          tag(BlockTags.MINEABLE_WITH_PICKAXE)
                  .add(ModBlocks.PEDESTAL.get())
                  .add(ModBlocks.STONE_PEDESTAL.get())
                  .add(ModBlocks.BLACKSTONE_PEDESTAL.get())
                  .add(ModBlocks.DIORITE_PEDESTAL.get())
                  .add(ModBlocks.GRANITE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_TILE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_PEDESTAL.get())

                  //Andesite
                  .add(ModBlocks.ANDESITE_BRICKS.get())
                  .add(ModBlocks.ANDESITE_MOSAIC_BRICKS.get())
                  .add(ModBlocks.ANDESITE_ARRAY_BRICKS.get())
                  .add(ModBlocks.ANDESITE_MIXED_BRICKS.get())
                  .add(ModBlocks.RAW_ANDESITE.get())
                  //Diorite
                  .add(ModBlocks.DIORITE_BRICKS.get())
                  .add(ModBlocks.DIORITE_MOSAIC_BRICKS.get())
                  .add(ModBlocks.DIORITE_ARRAY_BRICKS.get())
                  .add(ModBlocks.DIORITE_MIXED_BRICKS.get())
                  .add(ModBlocks.RAW_DIORITE.get())
                  //Granite
                  .add(ModBlocks.GRANITE_BRICKS.get())
                  .add(ModBlocks.GRANITE_MOSAIC_BRICKS.get())
                  .add(ModBlocks.GRANITE_ARRAY_BRICKS.get())
                  .add(ModBlocks.GRANITE_MIXED_BRICKS.get())
                  .add(ModBlocks.RAW_GRANITE.get())


                  .add(ModBlocks.STONE_GLASS_TECQUE.get())
                  .add(ModBlocks.LIMESTONE.get())

                  //Pedestal
                  .add(ModBlocks.PEDESTAL.get())
                  .add(ModBlocks.STONE_PEDESTAL.get())
                  .add(ModBlocks.DIORITE_PEDESTAL.get())
                  .add(ModBlocks.GRANITE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_TILE_PEDESTAL.get())
                  .add(ModBlocks.BLACKSTONE_PEDESTAL.get())

                 //Stone Furniture
                  .add(ModBlocks.STONE_COUNTER.get())
                  .add(ModBlocks.DIORITE_COUNTER.get())
                  .add(ModBlocks.GRANITE_COUNTER.get())
                  .add(ModBlocks.DEEPSLATE_COUNTER.get())
                  .add(ModBlocks.DEEPSLATE_TILE_COUNTER.get())
                  .add(ModBlocks.BLACKSTONE_COUNTER.get())

                  .add(ModBlocks.STONE_CABINET.get())
                  .add(ModBlocks.DIORITE_CABINET.get())
                  .add(ModBlocks.GRANITE_CABINET.get())
                  .add(ModBlocks.DEEPSLATE_CABINET.get())
                  .add(ModBlocks.DEEPSLATE_TILES_CABINET.get())
                  .add(ModBlocks.BLACKSTONE_CABINET.get())

                  .add(ModBlocks.STONE_DRAWER.get())
                  .add(ModBlocks.DIORITE_DRAWER.get())
                  .add(ModBlocks.GRANITE_DRAWER.get())
                  .add(ModBlocks.DEEPSLATE_DRAWER.get())
                  .add(ModBlocks.DEEPSLATE_TILES_DRAWER.get())
                  .add(ModBlocks.BLACKSTONE_DRAWER.get())

          //UTILITIES
                  .add(ModBlocks.BIG_CHAIN.get())
                  .add(ModBlocks.WALL_LANTERN.get())

          //Clock

                  .add(ModBlocks.RED_DIGITAL_CLOCK.get())
                  .add(ModBlocks.ORANGE_DIGITAL_CLOCK.get())
                  .add(ModBlocks.YELLOW_DIGITAL_CLOCK.get())
                  .add(ModBlocks.MAGENTA_DIGITAL_CLOCK.get())
                  .add(ModBlocks.PINK_DIGITAL_CLOCK.get())
                  .add(ModBlocks.PURPLE_DIGITAL_CLOCK.get())
                  .add(ModBlocks.BLUE_DIGITAL_CLOCK.get())
                  .add(ModBlocks.CYAN_DIGITAL_CLOCK.get())
                  .add(ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK.get())
                  .add(ModBlocks.GREEN_DIGITAL_CLOCK.get())
                  .add(ModBlocks.LIME_DIGITAL_CLOCK.get())
                  .add(ModBlocks.GRAY_DIGITAL_CLOCK.get())
                  .add(ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK.get())
                  .add(ModBlocks.BLACK_DIGITAL_CLOCK.get())
                  .add(ModBlocks.WHITE_DIGITAL_CLOCK.get())
                  .add(ModBlocks.BROWN_DIGITAL_CLOCK.get())

          //Stool
                  .add(ModBlocks.RED_STOOL.get())
                  .add(ModBlocks.ORANGE_STOOL.get())
                  .add(ModBlocks.YELLOW_STOOL.get())
                  .add(ModBlocks.MAGENTA_STOOL.get())
                  .add(ModBlocks.PINK_STOOL.get())
                  .add(ModBlocks.PURPLE_STOOL.get())
                  .add(ModBlocks.BLUE_STOOL.get())
                  .add(ModBlocks.CYAN_STOOL.get())
                  .add(ModBlocks.LIGHT_BLUE_STOOL.get())
                  .add(ModBlocks.GREEN_STOOL.get())
                  .add(ModBlocks.LIME_STOOL.get())
                  .add(ModBlocks.GREY_STOOL.get())
                  .add(ModBlocks.LIGHT_GREY_STOOL.get())
                  .add(ModBlocks.BLACK_STOOL.get())
                  .add(ModBlocks.WITHE_STOOL.get())
                  .add(ModBlocks.BROWN_STOOL.get())

                  .add(ModBlocks.LIGHT_MICROWAVE.get())
                  .add(ModBlocks.DARK_MICROWAVE.get())


          ;*/



    }
}
