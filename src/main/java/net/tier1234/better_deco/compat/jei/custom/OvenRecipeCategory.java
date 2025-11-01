package net.tier1234.better_deco.compat.jei.custom;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.util.Constants;
import net.tier1234.better_deco.util.Utils;

public class OvenRecipeCategory implements IRecipeCategory<OvenRecipe>
{

    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,
            "textures/gui/oven/oven_jei_2.png");

    public static final RecipeType<OvenRecipe> OVEN_RECIPE_RECIPE_TYPE = RecipeType.create(Constants.MOD_ID, "oven_baking", OvenRecipe.class);

    private final IGuiHelper helper;
    private final IDrawable background;
    private final IDrawable icon;
    private IDrawable arrow;

    public OvenRecipeCategory(IGuiHelper helper)
    {
        this.helper = helper;
        this.background = helper.createDrawable(TEXTURE, 0,0,176, 81);
        this.icon = helper.createDrawableItemStack(new ItemStack(ModBlocks.OAK_OVEN.get()));
    }

    @Override
    public RecipeType<OvenRecipe> getRecipeType()
    {
        return OVEN_RECIPE_RECIPE_TYPE;
    }

    @Override
    public Component getTitle()
    {
        return Utils.translation("jei_category", "oven_baking");
    }

    @Override
    public IDrawable getBackground()
    {
        return this.background;
    }

    @Override
    public IDrawable getIcon()
    {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, OvenRecipe recipe, IFocusGroup focuses)
    {
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 5).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 58, 41).addItemStack(recipe.getResult());
    }

}