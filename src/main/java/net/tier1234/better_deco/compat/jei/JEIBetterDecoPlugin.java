package net.tier1234.better_deco.compat.jei;


import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeType;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.recipe.ModRecipes;

import java.util.Collections;
import java.util.List;


@JeiPlugin
public class JEIBetterDecoPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {

        IGuiHelper helper = registration.getJeiHelpers().getGuiHelper();

        registration.addRecipeCategories(
                new MicrowaveRecipeCategory(helper));
        registration.addRecipeCategories(
                new OvenRecipeCategory(helper));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {

        registration.addRecipes(MicrowaveRecipeCategory.MICROWAVE_RECIPE_RECIPE_TYPE,
                this.getRecipes(ModRecipes.MICROWAVE_TYPE.get()));

        registration.addRecipes(OvenRecipeCategory.OVEN_RECIPE_RECIPE_TYPE,
                this.getRecipes(ModRecipes.OVEN_TYPE.get()));
    }



    private <C extends RecipeInput, T extends Recipe<C>> List<T> getRecipes(RecipeType<T> type)
    {
        return Collections.emptyList();
    }

}