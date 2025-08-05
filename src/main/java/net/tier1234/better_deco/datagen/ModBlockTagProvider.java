package net.tier1234.better_deco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BetterDeco.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
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
        //Oak Additions
                .add(ModBlocks.OAK_PILED_PLANKS.get())
                .add(ModBlocks.OAK_VERTICAL_PLANKS.get())
                .add(ModBlocks.OAK_POLISHED_PLANKS.get())

                .add(ModBlocks.SPRUCE_PILED_PLANKS.get())
                .add(ModBlocks.SPRUCE_VERTICAL_PLANKS.get())
                .add(ModBlocks.SPRUCE_POLISHED_PLANKS.get())

                .add(ModBlocks.BIRCH_PILED_PLANKS.get())
                .add(ModBlocks.BIRCH_VERTICAL_PLANKS.get())
                .add(ModBlocks.BIRCH_POLISHED_PLANKS.get())

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


        ;

          tag(BlockTags.MINEABLE_WITH_PICKAXE)
                  .add(ModBlocks.PEDESTAL.get())
                  .add(ModBlocks.STONE_PEDESTAL.get())
                  .add(ModBlocks.BLACKSTONE_PEDESTAL.get())
                  .add(ModBlocks.DIORITE_PEDESTAL.get())
                  .add(ModBlocks.GRANITE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_TILE_PEDESTAL.get())
                  .add(ModBlocks.DEEPSLATE_PEDESTAL.get())

                  .add(ModBlocks.ANDESITE_BRICKS.get())
                  .add(ModBlocks.ANDESITE_MOSAIC_BRICKS.get())
                  .add(ModBlocks.ANDESITE_ARRAY_BRICKS.get())
                  .add(ModBlocks.ANDESITE_MIXED_BRICKS.get())
                  .add(ModBlocks.RAW_ANDESITE.get())
                  .add(ModBlocks.STONE_GLASS_TECQUE.get())
                  .add(ModBlocks.LIMESTONE.get())





          ;

    }
}
