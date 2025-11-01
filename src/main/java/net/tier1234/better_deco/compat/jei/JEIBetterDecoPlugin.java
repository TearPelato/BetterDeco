package net.tier1234.better_deco.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeInput;
import net.minecraft.world.item.crafting.RecipeType;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.compat.jei.custom.MicrowaveRecipeCategory;
import net.tier1234.better_deco.compat.jei.custom.OvenRecipeCategory;
import net.tier1234.better_deco.recipe.ModRecipes;
import net.tier1234.better_deco.screen.custom.MicrowaveScreen;
import net.tier1234.better_deco.screen.custom.OvenScreen;

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
        registration.addRecipeCategories(new OvenRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));

        registration.addRecipeCategories(new MicrowaveRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()
        ));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration)
    {
        registration.addRecipes(OvenRecipeCategory.OVEN_RECIPE_RECIPE_TYPE, this.getRecipes(ModRecipes.OVEN_TYPE.get()));
        registration.addRecipes(MicrowaveRecipeCategory.MICROWAVE_RECIPE_RECIPE_TYPE, this.getRecipes(ModRecipes.MICROWAVE_TYPE.get()));
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(OvenScreen.class, 74, 30, 22, 20,
                OvenRecipeCategory.OVEN_RECIPE_RECIPE_TYPE);
        registration.addRecipeClickArea(MicrowaveScreen.class, 74, 30, 22, 20,
                MicrowaveRecipeCategory.MICROWAVE_RECIPE_RECIPE_TYPE);


    }

    private <C extends RecipeInput, T extends Recipe<C>> List<T> getRecipes(RecipeType<T> type)
    {
        return Collections.emptyList();
        //return getRecipeManager().propertySet(type).stream().map(RecipeHolder::value).toList();
    }
}
