package net.tier1234.better_deco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.datagen.custom.FurniCraftingRecipeBuilder;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.init.ModItems;
import net.tier1234.better_deco.Constants;

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


        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FURNI_WORKBENCH.get())
                .pattern("PPP")
                .pattern("ICI")
                .pattern("I I")
                .define('P', ItemTags.PLANKS)
                .define('I', Tags.Items.INGOTS_IRON)
                .define('C', Blocks.CRAFTING_TABLE)
                .unlockedBy("has_crafting_table", has(Blocks.CRAFTING_TABLE))
                .save(recipeOutput);


        //CUSTOM WORKBENCH RECIPE
//OAK
        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_TABLE.get(), 4)
                .requires(Blocks.OAK_LOG,2)
                .requires(Blocks.OAK_PLANKS, 4)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.OAK_PLANKS, 4)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_KITCHEN_COUNTER.get(), 2)
                .requires(Items.OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 6)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_KITCHEN_DRAWER.get(), 2)
                .requires(Items.OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_CABINET.get(), 1)
                .requires(Items.OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_COFFEE_TABLE.get(), 3)
                .requires(Items.OAK_LOG,1)
                .requires(Items.OAK_PLANKS, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_DINNING_TABLE.get(), 2)
                .requires(Items.OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 3)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.OAK_PLANKS, 6)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_BEDSIDE.get(), 2)
                .requires(Items.OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.OAK_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.OAK_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.OAK_PLANKS, 5)
                .requires(Items.OAK_LOG, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);
        
        FurniCraftingRecipeBuilder.crafting(ModBlocks.OAK_PARK_BENCH.get(), 4)
                .requires(Items.OAK_PLANKS,5)
                .requires(Items.OAK_LOG,4)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        //DARK OAK

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_TABLE.get(), 4)
                .requires(Blocks.DARK_OAK_LOG,2)
                .requires(Blocks.DARK_OAK_PLANKS, 4)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.DARK_OAK_PLANKS, 4)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_KITCHEN_COUNTER.get(), 2)
                .requires(Items.DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 6)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_KITCHEN_DRAWER.get(), 2)
                .requires(Items.DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_CABINET.get(), 1)
                .requires(Items.DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_COFFEE_TABLE.get(), 3)
                .requires(Items.DARK_OAK_LOG,1)
                .requires(Items.DARK_OAK_PLANKS, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_DINNING_TABLE.get(), 2)
                .requires(Items.DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.DARK_OAK_PLANKS, 6)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_BEDSIDE.get(), 2)
                .requires(Items.DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.DARK_OAK_PLANKS, 5)
                .requires(Items.DARK_OAK_LOG, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.DARK_OAK_PARK_BENCH.get(), 4)
                .requires(Items.DARK_OAK_PLANKS,5)
                .requires(Items.DARK_OAK_LOG,4)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        // SPRUCE

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_TABLE.get(), 4)
                .requires(Blocks.SPRUCE_LOG,2)
                .requires(Blocks.SPRUCE_PLANKS, 4)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.SPRUCE_PLANKS, 4)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 6)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_CABINET.get(), 1)
                .requires(Items.SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_COFFEE_TABLE.get(), 3)
                .requires(Items.SPRUCE_LOG,1)
                .requires(Items.SPRUCE_PLANKS, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_DINNING_TABLE.get(), 2)
                .requires(Items.SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 3)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.SPRUCE_PLANKS, 6)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_BEDSIDE.get(), 2)
                .requires(Items.SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.SPRUCE_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.SPRUCE_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.SPRUCE_PLANKS, 5)
                .requires(Items.SPRUCE_LOG, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.SPRUCE_PARK_BENCH.get(), 4)
                .requires(Items.SPRUCE_PLANKS,5)
                .requires(Items.SPRUCE_LOG,4)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);
        

        // Birch
        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_TABLE.get(), 4)
                .requires(Blocks.BIRCH_LOG,2)
                .requires(Blocks.BIRCH_PLANKS, 4)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.BIRCH_PLANKS, 4)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_KITCHEN_COUNTER.get(), 2)
                .requires(Items.BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 6)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_KITCHEN_DRAWER.get(), 2)
                .requires(Items.BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_CABINET.get(), 1)
                .requires(Items.BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_COFFEE_TABLE.get(), 3)
                .requires(Items.BIRCH_LOG,1)
                .requires(Items.BIRCH_PLANKS, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_DINNING_TABLE.get(), 2)
                .requires(Items.BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 3)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.BIRCH_PLANKS, 6)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_BEDSIDE.get(), 2)
                .requires(Items.BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.BIRCH_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.BIRCH_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.BIRCH_PLANKS, 5)
                .requires(Items.BIRCH_LOG, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BIRCH_PARK_BENCH.get(), 4)
                .requires(Items.BIRCH_PLANKS,5)
                .requires(Items.BIRCH_LOG,4)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);
        
        
        //JUNGLE
        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_TABLE.get(), 4)
                .requires(Blocks.JUNGLE_LOG,2)
                .requires(Blocks.JUNGLE_PLANKS, 4)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.JUNGLE_PLANKS, 4)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 6)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_CABINET.get(), 1)
                .requires(Items.JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_COFFEE_TABLE.get(), 3)
                .requires(Items.JUNGLE_LOG,1)
                .requires(Items.JUNGLE_PLANKS, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_DINNING_TABLE.get(), 2)
                .requires(Items.JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 3)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.JUNGLE_PLANKS, 6)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_BEDSIDE.get(), 2)
                .requires(Items.JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.JUNGLE_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.JUNGLE_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.JUNGLE_PLANKS, 5)
                .requires(Items.JUNGLE_LOG, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.JUNGLE_PARK_BENCH.get(), 4)
                .requires(Items.JUNGLE_PLANKS,5)
                .requires(Items.JUNGLE_LOG,4)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);
        //ACACIA
        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_TABLE.get(), 4)
                .requires(Blocks.ACACIA_LOG,2)
                .requires(Blocks.ACACIA_PLANKS, 4)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.ACACIA_PLANKS, 4)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_KITCHEN_COUNTER.get(), 2)
                .requires(Items.ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 6)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_KITCHEN_DRAWER.get(), 2)
                .requires(Items.ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_CABINET.get(), 1)
                .requires(Items.ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_COFFEE_TABLE.get(), 3)
                .requires(Items.ACACIA_LOG,1)
                .requires(Items.ACACIA_PLANKS, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_DINNING_TABLE.get(), 2)
                .requires(Items.ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 3)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.ACACIA_PLANKS, 6)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_BEDSIDE.get(), 2)
                .requires(Items.ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.ACACIA_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.ACACIA_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.ACACIA_PLANKS, 5)
                .requires(Items.ACACIA_LOG, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.ACACIA_PARK_BENCH.get(), 4)
                .requires(Items.ACACIA_PLANKS,5)
                .requires(Items.ACACIA_LOG,4)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        //MANGROVE
        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_TABLE.get(), 4)
                .requires(Blocks.MANGROVE_LOG,2)
                .requires(Blocks.MANGROVE_PLANKS, 4)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.MANGROVE_PLANKS, 4)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 6)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_CABINET.get(), 1)
                .requires(Items.MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_COFFEE_TABLE.get(), 3)
                .requires(Items.MANGROVE_LOG,1)
                .requires(Items.MANGROVE_PLANKS, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_DINNING_TABLE.get(), 2)
                .requires(Items.MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 3)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.MANGROVE_PLANKS, 6)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_BEDSIDE.get(), 2)
                .requires(Items.MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.MANGROVE_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.MANGROVE_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.MANGROVE_PLANKS, 5)
                .requires(Items.MANGROVE_LOG, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.MANGROVE_PARK_BENCH.get(), 4)
                .requires(Items.MANGROVE_PLANKS,5)
                .requires(Items.MANGROVE_LOG,4)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);
        
        //CHERRY
        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_TABLE.get(), 4)
                .requires(Blocks.CHERRY_LOG,2)
                .requires(Blocks.CHERRY_PLANKS, 4)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.CHERRY_PLANKS, 4)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_KITCHEN_COUNTER.get(), 2)
                .requires(Items.CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 6)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_KITCHEN_DRAWER.get(), 2)
                .requires(Items.CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_CABINET.get(), 1)
                .requires(Items.CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_COFFEE_TABLE.get(), 3)
                .requires(Items.CHERRY_LOG,1)
                .requires(Items.CHERRY_PLANKS, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_DINNING_TABLE.get(), 2)
                .requires(Items.CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 3)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.CHERRY_PLANKS, 6)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_BEDSIDE.get(), 2)
                .requires(Items.CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.CHERRY_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.CHERRY_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.CHERRY_PLANKS, 5)
                .requires(Items.CHERRY_LOG, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CHERRY_PARK_BENCH.get(), 4)
                .requires(Items.CHERRY_PLANKS,5)
                .requires(Items.CHERRY_LOG,4)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);
        
        //BAMBOO
        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_TABLE.get(), 4)
                .requires(Blocks.BAMBOO_BLOCK,2)
                .requires(Blocks.BAMBOO_PLANKS, 4)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.BAMBOO_PLANKS, 4)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_KITCHEN_COUNTER.get(), 2)
                .requires(Items.BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 6)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_KITCHEN_DRAWER.get(), 2)
                .requires(Items.BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_CABINET.get(), 1)
                .requires(Items.BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_COFFEE_TABLE.get(), 3)
                .requires(Items.BAMBOO_BLOCK,1)
                .requires(Items.BAMBOO_PLANKS, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_DINNING_TABLE.get(), 2)
                .requires(Items.BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 3)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.BAMBOO_PLANKS, 6)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_BEDSIDE.get(), 2)
                .requires(Items.BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.BAMBOO_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.BAMBOO_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.BAMBOO_PLANKS, 5)
                .requires(Items.BAMBOO_BLOCK, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.BAMBOO_PARK_BENCH.get(), 4)
                .requires(Items.BAMBOO_PLANKS,5)
                .requires(Items.BAMBOO_BLOCK,4)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        //CRIMSON
        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_TABLE.get(), 4)
                .requires(Blocks.CRIMSON_STEM,2)
                .requires(Blocks.CRIMSON_PLANKS, 4)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.CRIMSON_PLANKS, 4)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_KITCHEN_COUNTER.get(), 2)
                .requires(Items.CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 6)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_KITCHEN_DRAWER.get(), 2)
                .requires(Items.CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_CABINET.get(), 1)
                .requires(Items.CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_COFFEE_TABLE.get(), 3)
                .requires(Items.CRIMSON_STEM,1)
                .requires(Items.CRIMSON_PLANKS, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_DINNING_TABLE.get(), 2)
                .requires(Items.CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 3)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.CRIMSON_PLANKS, 6)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_BEDSIDE.get(), 2)
                .requires(Items.CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.CRIMSON_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.CRIMSON_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.CRIMSON_PLANKS, 5)
                .requires(Items.CRIMSON_STEM, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.CRIMSON_PARK_BENCH.get(), 4)
                .requires(Items.CRIMSON_PLANKS,5)
                .requires(Items.CRIMSON_STEM,4)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);
        
        
        //WARPED
        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_TABLE.get(), 4)
                .requires(Blocks.WARPED_STEM,2)
                .requires(Blocks.WARPED_PLANKS, 4)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.WARPED_PLANKS, 4)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_KITCHEN_COUNTER.get(), 2)
                .requires(Items.WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 6)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_KITCHEN_DRAWER.get(), 2)
                .requires(Items.WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_CABINET.get(), 1)
                .requires(Items.WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_COFFEE_TABLE.get(), 3)
                .requires(Items.WARPED_STEM,1)
                .requires(Items.WARPED_PLANKS, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_DINNING_TABLE.get(), 2)
                .requires(Items.WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 3)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_CRATE.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.WARPED_PLANKS, 6)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_BEDSIDE.get(), 2)
                .requires(Items.WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 5)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_SINK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.WARPED_PLANKS, 3)
                .requires(Items.WHITE_CONCRETE, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_SINK_DARK.get(), 2)
                .requires(Items.BUCKET,1)
                .requires(Items.WARPED_PLANKS, 3)
                .requires(Items.GRAY_CONCRETE, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.WARPED_PLANKS, 5)
                .requires(Items.WARPED_STEM, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.WARPED_PARK_BENCH.get(), 4)
                .requires(Items.WARPED_PLANKS,5)
                .requires(Items.WARPED_STEM,4)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);
        
        // STRIPED VARIANTS

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_OAK_LOG,2)
                .requires(Blocks.OAK_PLANKS, 4)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_OAK_LOG, 4)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 6)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_CABINET.get(), 1)
                .requires(Items.STRIPPED_OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_OAK_LOG,1)
                .requires(Items.OAK_PLANKS, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_OAK_LOG,2)
                .requires(Items.OAK_PLANKS, 3)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_OAK_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.OAK_PLANKS, 5)
                .requires(Items.STRIPPED_OAK_LOG, 2)
                .unlockedBy("has_oak_planks", has(Items.OAK_PLANKS))
                .save(recipeOutput);
        
        // DARK OAK

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_DARK_OAK_LOG,2)
                .requires(Blocks.DARK_OAK_PLANKS, 4)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_DARK_OAK_LOG, 4)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 6)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_CABINET.get(), 1)
                .requires(Items.STRIPPED_DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_DARK_OAK_LOG,1)
                .requires(Items.DARK_OAK_PLANKS, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_DARK_OAK_LOG,2)
                .requires(Items.DARK_OAK_PLANKS, 3)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_DARK_OAK_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.DARK_OAK_PLANKS, 5)
                .requires(Items.STRIPPED_DARK_OAK_LOG, 2)
                .unlockedBy("has_dark_oak", has(Items.DARK_OAK_PLANKS))
                .save(recipeOutput);
        
        // SPRUCE

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_SPRUCE_LOG,2)
                .requires(Blocks.SPRUCE_PLANKS, 4)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_SPRUCE_LOG, 4)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 6)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_CABINET.get(), 1)
                .requires(Items.STRIPPED_SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_SPRUCE_LOG,1)
                .requires(Items.SPRUCE_PLANKS, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_SPRUCE_LOG,2)
                .requires(Items.SPRUCE_PLANKS, 3)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_SPRUCE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.SPRUCE_PLANKS, 5)
                .requires(Items.STRIPPED_SPRUCE_LOG, 2)
                .unlockedBy("has_spruce_planks", has(Items.SPRUCE_PLANKS))
                .save(recipeOutput);
        
        //BIRCH

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_BIRCH_LOG,2)
                .requires(Blocks.BIRCH_PLANKS, 4)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_BIRCH_LOG, 4)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 6)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_CABINET.get(), 1)
                .requires(Items.STRIPPED_BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_BIRCH_LOG,1)
                .requires(Items.BIRCH_PLANKS, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_BIRCH_LOG,2)
                .requires(Items.BIRCH_PLANKS, 3)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BIRCH_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.BIRCH_PLANKS, 5)
                .requires(Items.STRIPPED_BIRCH_LOG, 2)
                .unlockedBy("has_birch_planks", has(Items.BIRCH_PLANKS))
                .save(recipeOutput);
        
        // ACACIA
        
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_ACACIA_LOG,2)
                .requires(Blocks.ACACIA_PLANKS, 4)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_ACACIA_LOG, 4)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 6)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_CABINET.get(), 1)
                .requires(Items.STRIPPED_ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_ACACIA_LOG,1)
                .requires(Items.ACACIA_PLANKS, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_ACACIA_LOG,2)
                .requires(Items.ACACIA_PLANKS, 3)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_ACACIA_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.ACACIA_PLANKS, 5)
                .requires(Items.STRIPPED_ACACIA_LOG, 2)
                .unlockedBy("has_acacia_planks", has(Items.ACACIA_PLANKS))
                .save(recipeOutput);
        
        // JUNGLE
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_JUNGLE_LOG,2)
                .requires(Blocks.JUNGLE_PLANKS, 4)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_JUNGLE_LOG, 4)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 6)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_CABINET.get(), 1)
                .requires(Items.STRIPPED_JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_JUNGLE_LOG,1)
                .requires(Items.JUNGLE_PLANKS, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_JUNGLE_LOG,2)
                .requires(Items.JUNGLE_PLANKS, 3)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_JUNGLE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.JUNGLE_PLANKS, 5)
                .requires(Items.STRIPPED_JUNGLE_LOG, 2)
                .unlockedBy("has_jungle_planks", has(Items.JUNGLE_PLANKS))
                .save(recipeOutput);

        
        // CHERRY
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_CHERRY_LOG,2)
                .requires(Blocks.CHERRY_PLANKS, 4)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_CHERRY_LOG, 4)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 6)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_CABINET.get(), 1)
                .requires(Items.STRIPPED_CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_CHERRY_LOG,1)
                .requires(Items.CHERRY_PLANKS, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_CHERRY_LOG,2)
                .requires(Items.CHERRY_PLANKS, 3)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CHERRY_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.CHERRY_PLANKS, 5)
                .requires(Items.STRIPPED_CHERRY_LOG, 2)
                .unlockedBy("has_cherry_planks", has(Items.CHERRY_PLANKS))
                .save(recipeOutput);

        
        // BAMBOO
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_BAMBOO_BLOCK,2)
                .requires(Blocks.BAMBOO_PLANKS, 4)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_BAMBOO_BLOCK, 4)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 6)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_CABINET.get(), 1)
                .requires(Items.STRIPPED_BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_BAMBOO_BLOCK,1)
                .requires(Items.BAMBOO_PLANKS, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_BAMBOO_BLOCK,2)
                .requires(Items.BAMBOO_PLANKS, 3)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_BAMBOO_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.BAMBOO_PLANKS, 5)
                .requires(Items.STRIPPED_BAMBOO_BLOCK, 2)
                .unlockedBy("has_bamboo_block", has(Items.BAMBOO_PLANKS))
                .save(recipeOutput);

        //CRIMSON
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_CRIMSON_STEM,2)
                .requires(Blocks.CRIMSON_PLANKS, 4)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_CRIMSON_STEM, 4)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 6)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_CABINET.get(), 1)
                .requires(Items.STRIPPED_CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_CRIMSON_STEM,1)
                .requires(Items.CRIMSON_PLANKS, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_CRIMSON_STEM,2)
                .requires(Items.CRIMSON_PLANKS, 3)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_CRIMSON_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.CRIMSON_PLANKS, 5)
                .requires(Items.STRIPPED_CRIMSON_STEM, 2)
                .unlockedBy("has_crimson_planks", has(Items.CRIMSON_PLANKS))
                .save(recipeOutput);

        // WARPED
        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_WARPED_STEM,2)
                .requires(Blocks.WARPED_PLANKS, 4)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_WARPED_STEM, 4)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 6)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_CABINET.get(), 1)
                .requires(Items.STRIPPED_WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_WARPED_STEM,1)
                .requires(Items.WARPED_PLANKS, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_WARPED_STEM,2)
                .requires(Items.WARPED_PLANKS, 3)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_WARPED_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.WARPED_PLANKS, 5)
                .requires(Items.STRIPPED_WARPED_STEM, 2)
                .unlockedBy("has_warped_planks", has(Items.WARPED_PLANKS))
                .save(recipeOutput);
        
        // MANGROVE

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_TABLE.get(), 4)
                .requires(Blocks.STRIPPED_MANGROVE_LOG,2)
                .requires(Blocks.MANGROVE_PLANKS, 4)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_CHAIR.get(), 4)
                .requires(Items.STICK,2)
                .requires(Blocks.STRIPPED_MANGROVE_LOG, 4)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER.get(), 2)
                .requires(Items.STRIPPED_MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 6)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER.get(), 2)
                .requires(Items.STRIPPED_MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 6)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_CABINET.get(), 1)
                .requires(Items.STRIPPED_MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 3)
                .requires(Items.CHEST, 1)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_COFFEE_TABLE.get(), 3)
                .requires(Items.STRIPPED_MANGROVE_LOG,1)
                .requires(Items.MANGROVE_PLANKS, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_DINNING_TABLE.get(), 2)
                .requires(Items.STRIPPED_MANGROVE_LOG,2)
                .requires(Items.MANGROVE_PLANKS, 3)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.STRIPPED_MANGROVE_OVEN.get(), 1)
                .requires(Items.SMOKER,1)
                .requires(Items.MANGROVE_PLANKS, 5)
                .requires(Items.STRIPPED_MANGROVE_LOG, 2)
                .unlockedBy("has_mangrove_planks", has(Items.MANGROVE_PLANKS))
                .save(recipeOutput);














































        FurniCraftingRecipeBuilder.crafting(ModBlocks.FRIDGE_LIGHT.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.WHITE_CONCRETE, 5)
                .requires(Items.IRON_INGOT, 2)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);

        FurniCraftingRecipeBuilder.crafting(ModBlocks.FRIDGE_DARK.get(), 1)
                .requires(Items.CHEST,1)
                .requires(Items.GRAY_CONCRETE, 5)
                .requires(Items.IRON_INGOT, 2)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
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
