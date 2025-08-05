package net.tier1234.better_deco.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
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
        dropSelf(ModBlocks.ENCASED_ANDESITE_BRICKS.get());

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



    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
