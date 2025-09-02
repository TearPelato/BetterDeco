package net.tier1234.better_deco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.item.ModItems;
import net.tier1234.better_deco.util.Constants;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);

    }
    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> PLANKS = List.of(Blocks.OAK_PLANKS,
                Blocks.SPRUCE_PLANKS, Blocks.BIRCH_PLANKS, Blocks.JUNGLE_PLANKS, Blocks.ACACIA_PLANKS, Blocks.DARK_OAK_PLANKS,
                Blocks.MANGROVE_PLANKS,Blocks.CHERRY_PLANKS,Blocks.BAMBOO_PLANKS,Blocks.CRIMSON_PLANKS,Blocks.WARPED_PLANKS);


        //StoneCutter


        //Planks

        //Oak
       SingleItemRecipeBuilder.stonecutting(
               Ingredient.of(Blocks.OAK_PLANKS.asItem()),
               RecipeCategory.MISC,
               ModBlocks.OAK_PLANKS_BRICKS.get()
       )
               .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
               .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.OAK_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.OAK_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.OAK_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.OAK_PILED_PLANKS.get()
                )
                .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
                .save(recipeOutput);


        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.OAK_SOFT_BRICKS.get()
                )
                .unlockedBy("has_oak_planks", has(Blocks.OAK_PLANKS.asItem()))
                .save(recipeOutput);

//Spruce

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_SOFT_BRICKS.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_PILED_PLANKS.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.SPRUCE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.SPRUCE_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_spruce_planks", has(Blocks.SPRUCE_PLANKS.asItem()))
                .save(recipeOutput);


//Birch
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_SOFT_BRICKS.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_PILED_PLANKS.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BIRCH_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BIRCH_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_birch_planks", has(Blocks.BIRCH_PLANKS.asItem()))
                .save(recipeOutput);

        //Jungle
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_SOFT_BRICKS.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_PILED_PLANKS.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.JUNGLE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.JUNGLE_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_jungle_planks", has(Blocks.JUNGLE_PLANKS.asItem()))
                .save(recipeOutput);

        //Acacia
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_SOFT_BRICKS.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_PILED_PLANKS.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ACACIA_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ACACIA_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_acacia_planks", has(Blocks.ACACIA_PLANKS.asItem()))
                .save(recipeOutput);




        //Dark Oak
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_SOFT_BRICKS.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_PILED_PLANKS.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.DARK_OAK_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_dark_oak_planks", has(Blocks.DARK_OAK_PLANKS.asItem()))
                .save(recipeOutput);


        //Mangrove
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_SOFT_BRICKS.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_PILED_PLANKS.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.MANGROVE_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.MANGROVE_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_mangrove_planks", has(Blocks.MANGROVE_PLANKS.asItem()))
                .save(recipeOutput);


        //Cherry
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_SOFT_BRICKS.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_PILED_PLANKS.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CHERRY_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CHERRY_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_cherry_planks", has(Blocks.CHERRY_PLANKS.asItem()))
                .save(recipeOutput);



        //Bamboo
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_SOFT_BRICKS.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_PILED_PLANKS.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.BAMBOO_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.BAMBOO_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_bamboo_planks", has(Blocks.BAMBOO_PLANKS.asItem()))
                .save(recipeOutput);



        //Crimson
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_SOFT_BRICKS.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_PILED_PLANKS.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.CRIMSON_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.CRIMSON_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_crimson_planks", has(Blocks.CRIMSON_PLANKS.asItem()))
                .save(recipeOutput);


        //Warped
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_PLANKS_BRICKS.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_PLANKS_PILLAR.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_SOFT_BRICKS.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_PILED_PLANKS.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_POLISHED_PLANKS.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.WARPED_PLANKS.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.WARPED_VERTICAL_PLANKS.get()
                )
                .unlockedBy("has_warped_planks", has(Blocks.WARPED_PLANKS.asItem()))
                .save(recipeOutput);




//Barrels
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.OAK_PLANKS.asItem())
                .define('#', Blocks.OAK_SLAB.asItem())
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .unlockedBy("has_oak_slab", has(Blocks.OAK_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIRCH_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.BIRCH_PLANKS.asItem())
                .define('#', Blocks.BIRCH_SLAB.asItem())
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .unlockedBy("has_birch_slab", has(Blocks.BIRCH_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.JUNGLE_SLAB.asItem())
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .unlockedBy("has_jungle_slab", has(Blocks.JUNGLE_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.ACACIA_PLANKS.asItem())
                .define('#', Blocks.ACACIA_SLAB.asItem())
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .unlockedBy("has_acacia_slab", has(Blocks.OAK_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.DARK_OAK_SLAB.asItem())
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .unlockedBy("has_dark_oak_slab", has(Blocks.DARK_OAK_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.MANGROVE_SLAB.asItem())
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .unlockedBy("has_mangrove_slab", has(Blocks.MANGROVE_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.CHERRY_PLANKS.asItem())
                .define('#', Blocks.CHERRY_SLAB.asItem())
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .unlockedBy("has_cherry_slab", has(Blocks.CHERRY_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAMBOO_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.BAMBOO_SLAB.asItem())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .unlockedBy("has_bamboo_slab", has(Blocks.BAMBOO_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.CRIMSON_SLAB.asItem())
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .unlockedBy("has_crimson_slab", has(Blocks.CRIMSON_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_BARREL.get())
                .pattern("B#B")
                .pattern("B B")
                .pattern("B#B")
                .define('B', Blocks.WARPED_PLANKS.asItem())
                .define('#', Blocks.WARPED_SLAB.asItem())
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .unlockedBy("has_warped_slab", has(Blocks.WARPED_SLAB))
                .save(recipeOutput);

        //Chairs
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIRCH_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                        .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAMBOO_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.STICK.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_OAK_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_SPRUCE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('#', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BIRCH_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('#', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_JUNGLE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('#', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_ACACIA_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('#', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_DARK_OAK_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('#', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_MANGROVE_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('#', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_CHERRY_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('#', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_BAMBOO_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('#', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_CRIMSON_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('#', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STRIPPED_WARPED_CHAIR.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.WARPED_STEM.asItem())
                .define('#', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);


        //Sofa
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.RED_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.RED_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.ORANGE_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.ORANGE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.YELLOW_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.YELLOW_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.PURPLE_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.PURPLE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.PINK_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.PINK_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.MAGENTA_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.MAGENTA_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.BROWN_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.BROWN_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.BLACK_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.BLACK_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WITHE_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.WHITE_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.WHITE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.GREEN_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.GREEN_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.LIME_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.LIME_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.BLUE_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.BLUE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_BLUE_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.LIGHT_BLUE_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.BLUE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREY_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.GRAY_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.GRAY_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHT_GREY_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.LIGHT_GRAY_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.LIGHT_GRAY_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_SOFA.get())
                .pattern("#  ")
                .pattern("###")
                .pattern("B B")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.CYAN_WOOL.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_wool", has(Blocks.CYAN_WOOL))
                .save(recipeOutput);


//Counters
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_birch", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        //Stripped
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .unlockedBy("has_birch", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        //Drawer
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.SPRUCE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.BIRCH_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.JUNGLE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.ACACIA_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.DARK_OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.MANGROVE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.CHERRY_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_bamboo_log", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.CRIMSON_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.WARPED_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        //Stripped

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_bamboo_log", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_WARPED_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        //Cabinets

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.WARPED_STEM.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);



        //Stripped Variants

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.OAK_LOG.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_SPRUCE_LOG.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .unlockedBy("has_sppruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_BIRCH_LOG.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_JUNGLE_LOG.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_ACACIA_LOG.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_MANGROVE_LOG.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_DARK_OAK_LOG.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_CHERRY_LOG.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_BAMBOO_BLOCK.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_CRIMSON_STEM.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.STRIPPED_WARPED_STEM.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);



        //Table

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('X', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('X', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('X', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('X', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('X', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('X', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('X', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('B', Items.WARPED_STEM.asItem())
                .define('X', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);
        //Stripped
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.SPRUCE_LOG.asItem())
                .define('B', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.BIRCH_LOG.asItem())
                .define('B', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.JUNGLE_LOG.asItem())
                .define('B', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.ACACIA_LOG.asItem())
                .define('B', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.DARK_OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.MANGROVE_LOG.asItem())
                .define('B', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.CHERRY_LOG.asItem())
                .define('B', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.BAMBOO_BLOCK.asItem())
                .define('B', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.CRIMSON_STEM.asItem())
                .define('B', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_TABLE.get())
                .pattern("BBB")
                .pattern(" X ")
                .pattern(" X ")
                .define('X', Items.WARPED_STEM.asItem())
                .define('B', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);

        //Coffee Table

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('X', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('X', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('X', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('X', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('X', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('X', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_oak_log", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('X', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_oak_log", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('B', Items.WARPED_STEM.asItem())
                .define('X', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_oak_log", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);

        //Stripped
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.SPRUCE_LOG.asItem())
                .define('B', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.BIRCH_LOG.asItem())
                .define('B', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.JUNGLE_LOG.asItem())
                .define('B', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.ACACIA_LOG.asItem())
                .define('B', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.DARK_OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.MANGROVE_LOG.asItem())
                .define('B', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.CHERRY_LOG.asItem())
                .define('B', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.BAMBOO_BLOCK.asItem())
                .define('B', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_oak_log", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.CRIMSON_STEM.asItem())
                .define('B', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_oak_log", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_COFFEE_TABLE.get())
                .pattern("   ")
                .pattern("BBB")
                .pattern("X X")
                .define('X', Items.WARPED_STEM.asItem())
                .define('B', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_oak_log", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);

        //Dinning Table

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('X', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_spruce", has(Blocks.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('X', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_birch", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('X', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_jungle", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('X', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_acacia", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('X', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_dark_oak", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('X', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_mangrove", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('X', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_cherry", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('X', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('B', Items.WARPED_STEM.asItem())
                .define('X', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);

        //Stripped

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_OAK_LOG.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_stripped_oak", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.SPRUCE_LOG.asItem())
                .define('B', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_stripped_spruce", has(Blocks.STRIPPED_SPRUCE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.BIRCH_LOG.asItem())
                .define('B', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_stripped_birch", has(Blocks.STRIPPED_BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.JUNGLE_LOG.asItem())
                .define('B', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_stripped_jungle", has(Blocks.STRIPPED_JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.ACACIA_LOG.asItem())
                .define('B', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_stripped_acacia", has(Blocks.STRIPPED_ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.DARK_OAK_LOG.asItem())
                .define('B', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_stripped_dark_oak", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.MANGROVE_LOG.asItem())
                .define('B', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_stripped_mangrove", has(Blocks.STRIPPED_MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.CHERRY_LOG.asItem())
                .define('B', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_stripped_cherry", has(Blocks.STRIPPED_CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.BAMBOO_BLOCK.asItem())
                .define('B', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_stripped_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.CRIMSON_STEM.asItem())
                .define('B', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_stripped_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_DINNING_TABLE.get())
                .pattern("BBB")
                .pattern("X X")
                .pattern("X X")
                .define('X', Items.WARPED_STEM.asItem())
                .define('B', Blocks.STRIPPED_WARPED_STEM.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_stripped_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .save(recipeOutput);

        //Microwave
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_MICROWAVE)
                .pattern("BBC")
                .pattern("XX#")
                .pattern("BBC")
                .define('B', Items.IRON_INGOT.asItem())
                .define('X', Blocks.WHITE_STAINED_GLASS_PANE.asItem())
                .define('#', Blocks.STONE_BUTTON.asItem())
                .define('C', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT.asItem()))
                .unlockedBy("has_white_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_MICROWAVE)
                .pattern("BBC")
                .pattern("XX#")
                .pattern("BBC")
                .define('B', Items.IRON_INGOT.asItem())
                .define('X', Blocks.GRAY_STAINED_GLASS_PANE.asItem())
                .define('#', Blocks.STONE_BUTTON.asItem())
                .define('C', Blocks.GRAY_CONCRETE.asItem())
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT.asItem()))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);











































         //Crates

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_CRATE.get())
                .pattern("BBB")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .save(recipeOutput);

        //Bedside

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.SPRUCE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.BIRCH_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.JUNGLE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.ACACIA_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.MANGROVE_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.CHERRY_LOG.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.CRIMSON_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_BEDSIDE.get())
                .pattern("BBB")
                .pattern("#X#")
                .pattern("BBB")
                .define('B', Items.WARPED_STEM.asItem())
                .define('X', Blocks.CHEST.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .save(recipeOutput);

         //Sinks

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.CRIMSON_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_SINK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.WHITE_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.WARPED_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_withe_concrete", has(Blocks.WHITE_CONCRETE))
                .save(recipeOutput);

        //Dark
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.OAK_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.SPRUCE_PLANKS.asItem())
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.BIRCH_PLANKS.asItem())
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.JUNGLE_PLANKS.asItem())
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.ACACIA_PLANKS.asItem())
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.DARK_OAK_PLANKS.asItem())
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.MANGROVE_PLANKS.asItem())
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.CHERRY_PLANKS.asItem())
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.BAMBOO_PLANKS.asItem())
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.CRIMSON_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.CRIMSON_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_SINK_DARK.get())
                .pattern("BXB")
                .pattern("BBB")
                .pattern("# #")
                .define('B', Items.GRAY_CONCRETE.asItem())
                .define('X', Items.BUCKET.asItem())
                .define('#', Blocks.WARPED_PLANKS.asItem())
                .unlockedBy("has_oak", has(Blocks.WARPED_PLANKS))
                .unlockedBy("has_chest", has(Blocks.CHEST))
                .unlockedBy("has_gray_concrete", has(Blocks.GRAY_CONCRETE))
                .save(recipeOutput);

          //STONE FURNITURE VARIANTS
        //COUNTERS

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STONE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.COBBLESTONE.asItem())
                .define('#', Blocks.STONE.asItem())
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.GRANITE.asItem())
                .define('#', Blocks.POLISHED_GRANITE.asItem())
                .unlockedBy("has_granite", has(Blocks.POLISHED_GRANITE))
                .unlockedBy("has_polished_granite", has(Blocks.GRANITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.DIORITE.asItem())
                .define('#', Blocks.POLISHED_DIORITE.asItem())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_BRICKS.asItem())
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_TILES.asItem())
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy("has_deepslate_tiles", has(Blocks.DEEPSLATE_TILES))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_COUNTER.get())
                .pattern("###")
                .pattern("B B")
                .pattern("BBB")
                .define('B', Items.BLACKSTONE.asItem())
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
                .unlockedBy("has_blackstone", has(Blocks.BLACKSTONE))
                .unlockedBy("has_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .save(recipeOutput);

        //DRAWERS
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STONE_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.COBBLESTONE.asItem())
                .define('#', Blocks.STONE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.GRANITE.asItem())
                .define('#', Blocks.POLISHED_GRANITE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_granite", has(Blocks.POLISHED_GRANITE))
                .unlockedBy("has_polished_granite", has(Blocks.GRANITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DIORITE.asItem())
                .define('#', Blocks.POLISHED_DIORITE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_BRICKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_TILES.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .unlockedBy("has_deepslate_tiles", has(Blocks.DEEPSLATE_TILES))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_DRAWER.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BLACKSTONE.asItem())
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_blackstone", has(Blocks.BLACKSTONE))
                .unlockedBy("has_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .save(recipeOutput);

        //CABINETS
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STONE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.COBBLESTONE.asItem())
                .define('#', Blocks.STONE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_stone", has(Blocks.STONE))
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.GRANITE.asItem())
                .define('#', Blocks.POLISHED_GRANITE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .unlockedBy("has_polished_granite", has(Blocks.POLISHED_GRANITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.DIORITE.asItem())
                .define('#', Blocks.POLISHED_DIORITE.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_diortie", has(Blocks.DIORITE))
                .unlockedBy("has_polished_diorite", has(Blocks.POLISHED_DIORITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_BRICKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_deepslate_bricks", has(Blocks.DEEPSLATE_BRICKS))
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILES_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.COBBLED_DEEPSLATE.asItem())
                .define('#', Blocks.DEEPSLATE_TILES.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_deepslate_tiles", has(Blocks.STONE))
                .unlockedBy("has_deepslate", has(Blocks.COBBLED_DEEPSLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_CABINET.get())
                .pattern("#BB")
                .pattern("#XB")
                .pattern("#BB")
                .define('B', Items.BLACKSTONE.asItem())
                .define('#', Blocks.POLISHED_BLACKSTONE_BRICKS.asItem())
                .define('X', Blocks.CHEST.asItem())
                .unlockedBy("has_blackstone", has(Blocks.BLACKSTONE))
                .unlockedBy("has_blackstone_bricks", has(Blocks.POLISHED_BLACKSTONE_BRICKS))
                .save(recipeOutput);


        //Stool
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WITHE_STOOL.get())
                        .pattern(" X ")
                        .pattern(" B ")
                        .pattern(" # ")
                        .define('X', Blocks.WHITE_WOOL.asItem())
                        .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                        .define('#', Blocks.WHITE_CONCRETE.asItem())
                        .unlockedBy("has_wool", has(Items.WHITE_WOOL))
                        .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BROWN_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.BROWN_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.BROWN_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.BLACK_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.BLACK_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GREY_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.GRAY_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.GRAY_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GREY_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.LIGHT_GRAY_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.LIGHT_GRAY_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GREEN_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.GREEN_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.GREEN_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIME_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.LIME_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.LIME_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLUE_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.BLUE_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.BLUE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.LIGHT_BLUE_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.LIGHT_BLUE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CYAN_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.CYAN_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.CYAN_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.YELLOW_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.YELLOW_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.ORANGE_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.ORANGE_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.RED_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.RED_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.RED_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PINK_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.PINK_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.PINK_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.MAGENTA_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.MAGENTA_WOOL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_STOOL.get())
                .pattern(" X ")
                .pattern(" B ")
                .pattern(" # ")
                .define('X', Blocks.PURPLE_WOOL.asItem())
                .define('B', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('#', Blocks.WHITE_CONCRETE.asItem())
                .unlockedBy("has_wool", has(Items.PURPLE_WOOL))
                .save(recipeOutput);




        //Pedestal

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.STONE_SLAB.asItem())
                .define('X', Blocks.SMOOTH_STONE.asItem())
                .unlockedBy("has_stone_slab", has(Blocks.STONE_SLAB))
                .unlockedBy("has_smooth_stone", has(Blocks.SMOOTH_STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STONE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.STONE_SLAB.asItem())
                .define('X', Blocks.STONE.asItem())
                .unlockedBy("has_stone_slab", has(Blocks.STONE_SLAB))
                .unlockedBy("has_stone", has(Blocks.STONE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRANITE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.POLISHED_GRANITE_SLAB.asItem())
                .define('X', Blocks.GRANITE.asItem())
                .unlockedBy("has_polished_granite_slab", has(Blocks.POLISHED_GRANITE_SLAB))
                .unlockedBy("has_granite", has(Blocks.GRANITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DIORITE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.POLISHED_DIORITE_SLAB.asItem())
                .define('X', Blocks.DIORITE.asItem())
                .unlockedBy("has_polished_diorite_slab", has(Blocks.POLISHED_DIORITE_SLAB))
                .unlockedBy("has_diorite", has(Blocks.DIORITE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.DEEPSLATE_BRICK_SLAB.asItem())
                .define('X', Blocks.POLISHED_DEEPSLATE.asItem())
                .unlockedBy("has_deepslate_slab", has(Blocks.DEEPSLATE_BRICK_SLAB))
                .unlockedBy("has_ddeepslate_polished", has(Blocks.POLISHED_DEEPSLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DEEPSLATE_TILE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.DEEPSLATE_TILE_SLAB.asItem())
                .define('X', Blocks.POLISHED_DEEPSLATE.asItem())
                .unlockedBy("has_deepslate_tile_slab", has(Blocks.DEEPSLATE_TILE_SLAB))
                .unlockedBy("has_deepslate_polished", has(Blocks.POLISHED_DEEPSLATE))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACKSTONE_PEDESTAL.get())
                .pattern(" B ")
                .pattern(" X ")
                .pattern(" B ")
                .define('B', Items.POLISHED_BLACKSTONE_BRICK_SLAB.asItem())
                .define('X', Blocks.BLACKSTONE.asItem())
                .unlockedBy("has_polished_blackstone_slab", has(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB))
                .unlockedBy("has_blackstone", has(Blocks.BLACKSTONE))
                .save(recipeOutput);

        //Tecque
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.STONE_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.STONE_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_stone_slab", has(Blocks.STONE_SLAB))
                .save(recipeOutput);
        //Wood Tecque
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OAK_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.OAK_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_oak_slab", has(Blocks.OAK_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SPRUCE_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.SPRUCE_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_spruce_slab", has(Blocks.SPRUCE_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BIRCH_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.BIRCH_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_birch_slab", has(Blocks.BIRCH_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JUNGLE_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.JUNGLE_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_jungle_slab", has(Blocks.JUNGLE_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ACACIA_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.ACACIA_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_acacia_slab", has(Blocks.ACACIA_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARK_OAK_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.DARK_OAK_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_dark_oak_slab", has(Blocks.DARK_OAK_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MANGROVE_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.MANGROVE_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_mangrove_slab", has(Blocks.MANGROVE_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHERRY_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.CHERRY_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_cherry_slab", has(Blocks.CHERRY_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BAMBOO_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.BAMBOO_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_bamboo_slab", has(Blocks.BAMBOO_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CRIMSON_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.CRIMSON_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_crimson_slab", has(Blocks.CRIMSON_SLAB))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WARPED_GLASS_TECQUE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("BBB")
                .define('B', Blocks.WARPED_SLAB.asItem())
                .define('#', Blocks.GLASS.asItem())
                .unlockedBy("has_glass", has(Blocks.GLASS))
                .unlockedBy("has_warped_slab", has(Blocks.WARPED_SLAB))
                .save(recipeOutput);

        //Deco
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_CHAIN.get())
                .pattern(" # ")
                .pattern(" B ")
                .pattern(" # ")
                .define('B', Blocks.CHAIN.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        //DigitalClock

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.RED_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.RED_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.YELLOW_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.YELLOW_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ORANGE_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.ORANGE_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PINK_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.PINK_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PURPLE_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.PURPLE_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GREEN_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.GREEN_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIME_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.LIME_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GRAY_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.GRAY_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.LIGHT_GRAY_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLUE_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.BLUE_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.LIGHT_BLUE_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CYAN_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.CYAN_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BROWN_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.BROWN_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BLACK_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.BLACK_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WHITE_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.WHITE_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MAGENTA_DIGITAL_CLOCK.get())
                .pattern("###")
                .pattern("#B#")
                .pattern("CCC")
                .define('B', Items.CLOCK.asItem())
                .define('#', Items.MAGENTA_CONCRETE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .save(recipeOutput);



        //Shelf
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.OAK_SLAB.asItem())
                .define('#', Items.OAK_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.SPRUCE_SLAB.asItem())
                .define('#', Items.SPRUCE_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.BIRCH_SLAB.asItem())
                .define('#', Items.BIRCH_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.JUNGLE_SLAB.asItem())
                .define('#', Items.JUNGLE_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.ACACIA_SLAB.asItem())
                .define('#', Items.ACACIA_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.DARK_OAK_SLAB.asItem())
                .define('#', Items.DARK_OAK_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.MANGROVE_SLAB.asItem())
                .define('#', Items.MANGROVE_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.CHERRY_SLAB.asItem())
                .define('#', Items.CHERRY_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.BAMBOO_SLAB.asItem())
                .define('#', Items.BAMBOO_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.CRIMSON_SLAB.asItem())
                .define('#', Items.CRIMSON_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_SHELF.get())
                .pattern("#B#")
                .pattern("#X#")
                .pattern("#B#")
                .define('B', Blocks.WARPED_SLAB.asItem())
                .define('#', Items.WARPED_PLANKS.asItem())
                .define('X', Items.ITEM_FRAME.asItem())
                .unlockedBy("has_oak", has(Items.WARPED_PLANKS))
                .save(recipeOutput);













        //Building Extras
        //Vetical Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.OAK_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.SPRUCE_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.BIRCH_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.JUNGLE_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.ACACIA_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.DARK_OAK_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.MANGROVE_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.CHERRY_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.BAMBOO_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.CRIMSON_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_VERTICAL_SLAB.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" # ")
                .define('#', Items.WARPED_PLANKS.asItem())
                .unlockedBy("has_oak", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        //Lanterns
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WALL_LANTERN.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("   ")
                .define('#', Items.LANTERN.asItem())
                .unlockedBy("has_lantern", has(Items.LANTERN))
                .save(recipeOutput);



















































































//Andesite
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ANDESITE.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ANDESITE_MIXED_BRICKS.get()
                )
                .unlockedBy("has_andesite", has(Blocks.ANDESITE.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ANDESITE.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ANDESITE_ARRAY_BRICKS.get()
                )
                .unlockedBy("has_andesite", has(Blocks.ANDESITE.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ANDESITE.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ANDESITE_BRICKS.get()
                )
                .unlockedBy("has_andesite", has(Blocks.ANDESITE.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ANDESITE.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.RAW_ANDESITE.get()
                )
                .unlockedBy("has_andesite", has(Blocks.ANDESITE.asItem()))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(Blocks.ANDESITE.asItem()),
                        RecipeCategory.MISC,
                        ModBlocks.ANDESITE_MOSAIC_BRICKS.get()
                )
                .unlockedBy("has_andesite", has(Blocks.ANDESITE.asItem()))
                .save(recipeOutput);

        //Oven
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.OAK_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.OAK_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_oak_log", has(Blocks.OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SPRUCE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.SPRUCE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_spruce_log", has(Blocks.SPRUCE_LOG))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIRCH_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.BIRCH_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_birch_log", has(Blocks.BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JUNGLE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.JUNGLE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_jungle_log", has(Blocks.JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ACACIA_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.ACACIA_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_acacia_log", has(Blocks.ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DARK_OAK_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.DARK_OAK_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_dark_oak_log", has(Blocks.DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MANGROVE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.MANGROVE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_mangrove_log", has(Blocks.MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CHERRY_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.CHERRY_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_cherry_log", has(Blocks.CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.BAMBOO_BLOCK.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_bamboo_block", has(Blocks.BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CRIMSON_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.CRIMSON_STEM.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_crimson_stem", has(Blocks.CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WARPED_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.WARPED_STEM.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_warped_stem", has(Blocks.WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);

        //Stripped

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_OAK_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_OAK_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .unlockedBy("has_oak", has(Blocks.OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_SPRUCE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.SPRUCE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_SPRUCE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_spruce_log", has(Blocks.STRIPPED_SPRUCE_LOG))
                .unlockedBy("has_spruce", has(Blocks.SPRUCE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BIRCH_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BIRCH_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BIRCH_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_birch_log", has(Blocks.STRIPPED_BIRCH_LOG))
                .unlockedBy("has_birch", has(Blocks.BIRCH_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_JUNGLE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.JUNGLE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_JUNGLE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_jungle_log", has(Blocks.STRIPPED_JUNGLE_LOG))
                .unlockedBy("has_jungle", has(Blocks.JUNGLE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_ACACIA_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.ACACIA_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_ACACIA_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_acacia_log", has(Blocks.STRIPPED_ACACIA_LOG))
                .unlockedBy("has_acacia", has(Blocks.ACACIA_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_DARK_OAK_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.DARK_OAK_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_DARK_OAK_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_dark_oak_log", has(Blocks.STRIPPED_DARK_OAK_LOG))
                .unlockedBy("has_dark_oak", has(Blocks.DARK_OAK_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_MANGROVE_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.MANGROVE_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_MANGROVE_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_mangrove_log", has(Blocks.STRIPPED_MANGROVE_LOG))
                .unlockedBy("has_mangrove", has(Blocks.MANGROVE_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CHERRY_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CHERRY_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CHERRY_LOG.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_cherry_log", has(Blocks.STRIPPED_CHERRY_LOG))
                .unlockedBy("has_cherry", has(Blocks.CHERRY_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_BAMBOO_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.BAMBOO_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_BAMBOO_BLOCK.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_bamboo_block", has(Blocks.STRIPPED_BAMBOO_BLOCK))
                .unlockedBy("has_bamboo", has(Blocks.BAMBOO_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_CRIMSON_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.CRIMSON_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_CRIMSON_STEM.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_crimson_stem", has(Blocks.STRIPPED_CRIMSON_STEM))
                .unlockedBy("has_crimson", has(Blocks.CRIMSON_PLANKS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.STRIPPED_WARPED_OVEN.get())
                .pattern("###")
                .pattern("BXB")
                .pattern("BBB")
                .define('B', Items.WARPED_PLANKS.asItem())
                .define('#', Blocks.STRIPPED_WARPED_STEM.asItem())
                .define('X', Blocks.SMOKER.asItem())
                .unlockedBy("has_stripped_warped_stem", has(Blocks.STRIPPED_WARPED_STEM))
                .unlockedBy("has_warped", has(Blocks.WARPED_PLANKS))
                .save(recipeOutput);









//Items
        //Chisel
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.IRON_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLD_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.GOLD_INGOT.asItem())
                .unlockedBy("has_gold", has(Items.GOLD_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DIAMOND_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.DIAMOND.asItem())
                .unlockedBy("has_diamond", has(Items.IRON_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.NETHERITE_CHISEL.get())
                .pattern("   ")
                .pattern(" # ")
                .pattern("B  ")
                .define('B', Items.STICK.asItem())
                .define('#', Items.NETHERITE_INGOT.asItem())
                .unlockedBy("has_netherite", has(Items.NETHERITE_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);














































































































































































































    }
    protected static void netheriteSmithing(RecipeOutput recipeOutput, Item ingredientItem, RecipeCategory category, Item resultItem) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ingredientItem), Ingredient.of(Items.NETHERITE_INGOT), category, resultItem
                )
                .unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(recipeOutput, getItemName(resultItem) + "_smithing");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, Constants.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
