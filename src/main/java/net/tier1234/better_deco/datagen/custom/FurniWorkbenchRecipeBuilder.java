package net.tier1234.better_deco.datagen.custom;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.NonNullList;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.tier1234.better_deco.recipe.CountedIngredient;
import net.tier1234.better_deco.recipe.FurniCraftingRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;

public class FurniWorkbenchRecipeBuilder implements RecipeBuilder {

    private final ItemStack result;
    private final NonNullList<CountedIngredient> materials = NonNullList.create();
    private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
    private boolean showNotification = false;

    private FurniWorkbenchRecipeBuilder(ItemStack result) {
        this.result = result;
    }

    public static FurniWorkbenchRecipeBuilder workbench(ItemLike result) {
        return workbench(result, 1);
    }

    public static FurniWorkbenchRecipeBuilder workbench(ItemLike result, int count) {
        return new FurniWorkbenchRecipeBuilder(new ItemStack(result, count));
    }

    public static FurniWorkbenchRecipeBuilder workbench(ItemStack result) {
        return new FurniWorkbenchRecipeBuilder(result);
    }

    /**
     * Adds a material with count
     */
    public FurniWorkbenchRecipeBuilder requires(ItemLike item, int count) {
        return this.requires(Ingredient.of(item), count);
    }

    /**
     * Adds a material from tag with count
     */
    public FurniWorkbenchRecipeBuilder requires(TagKey<Item> tag, int count) {
        return this.requires(Ingredient.of(tag), count);
    }

    /**
     * Adds a material from ingredient with count
     */
    public FurniWorkbenchRecipeBuilder requires(Ingredient ingredient, int count) {
        this.materials.add(new CountedIngredient(ingredient, count));
        return this;
    }

    /**
     * Shorthand for count = 1
     */
    public FurniWorkbenchRecipeBuilder requires(ItemLike item) {
        return this.requires(item, 1);
    }

    /**
     * Shorthand for count = 1
     */
    public FurniWorkbenchRecipeBuilder requires(TagKey<Item> tag) {
        return this.requires(tag, 1);
    }

    /**
     * Shorthand for count = 1
     */
    public FurniWorkbenchRecipeBuilder requires(Ingredient ingredient) {
        return this.requires(ingredient, 1);
    }

    /**
     * Enable notification when recipe is crafted
     */
    public FurniWorkbenchRecipeBuilder showNotification() {
        this.showNotification = true;
        return this;
    }

    @Override
    public FurniWorkbenchRecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        this.criteria.put(name, criterion);
        return this;
    }

    @Override
    public FurniWorkbenchRecipeBuilder group(@Nullable String group) {
        // Group not used for workbench recipes
        return this;
    }

    @Override
    public Item getResult() {
        return this.result.getItem();
    }

    @Override
    public void save(RecipeOutput output, ResourceLocation id) {
        if (this.materials.isEmpty()) {
            throw new IllegalStateException("No materials defined for workbench recipe " + id);
        }

        if (this.criteria.isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + id);
        }

        Advancement.Builder advancement = output.advancement()
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(AdvancementRewards.Builder.recipe(id))
                .requirements(AdvancementRequirements.Strategy.OR);

        this.criteria.forEach(advancement::addCriterion);

        FurniCraftingRecipe recipe = new FurniCraftingRecipe(
                this.materials,
                this.result,
                this.showNotification
        );

        output.accept(id, recipe, advancement.build(id.withPrefix("recipes/furni_workbench/")));
    }
}