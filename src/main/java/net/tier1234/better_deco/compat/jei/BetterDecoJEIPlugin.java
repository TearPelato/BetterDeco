package net.tier1234.better_deco.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.compat.jei.category.MicrowaveRecipeCategory;
import net.tier1234.better_deco.compat.jei.category.OvenRecipeCategory;
import net.tier1234.better_deco.event.ModRecipeReceived;
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.recipe.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.screen.custom.MicrowaveScreen;
import net.tier1234.better_deco.screen.custom.OvenScreen;

import java.util.List;

@JeiPlugin
public class BetterDecoJEIPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new OvenRecipeCategory(registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new MicrowaveRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        List<RecipeHolder<OvenRecipe>> ovenRecipes = ModRecipeReceived.recipeMap.byType(ModRecipes.OVEN_TYPE.get()).stream().toList();
        registration.addRecipes(OvenRecipeCategory.OVEN_TYPE, ovenRecipes);

        List<RecipeHolder<MicrowaveRecipe>> microwaveRecipes = ModRecipeReceived.recipeMap.byType(ModRecipes.MICROWAVE_TYPE.get()).stream().toList();
        registration.addRecipes(MicrowaveRecipeCategory.MICROWAVE_TYPE, microwaveRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OvenScreen.class, 74, 30, 22, 20,
                OvenRecipeCategory.OVEN_TYPE);
        registration.addRecipeClickArea(MicrowaveScreen.class, 74, 30, 22, 20,
                MicrowaveRecipeCategory.MICROWAVE_TYPE);

    }
}