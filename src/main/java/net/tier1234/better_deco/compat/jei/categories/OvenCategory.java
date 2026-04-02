package net.tier1234.better_deco.compat.jei.categories;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.types.IRecipeHolderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.util.Constants;
import net.tier1234.better_deco.util.Utils;

import java.util.function.Supplier;

public class OvenCategory extends FurnitureRecipeCategory<OvenRecipe>
{
    public static final Supplier<IRecipeHolderType<OvenRecipe>> TYPE = IRecipeHolderType.createDeferred(ModRecipes.OVEN_TYPE::get);
    public static final Identifier TEXTURE = Constants.id("textures/gui/oven/oven_jei_2.png");


    private final IGuiHelper helper;
    private IDrawable arrow;

    public OvenCategory(IGuiHelper helper)
    {
        super(TYPE,
                Utils.translation("jei_category","oven"),
                helper.createDrawable(TEXTURE, 0, 0, 80, 80),
                helper.createDrawableItemStack(new ItemStack(ModBlocks.OAK_OVEN)));

        this.helper = helper;
    }

    @Override
    public Component getTitle()
    {
        return Utils.translation("jei_category", "oven_baking");
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<OvenRecipe> holder, IFocusGroup focuses) {
        OvenRecipe recipe = holder.value();
        builder.addSlot(RecipeIngredientRole.INPUT, 58, 5).add(recipe.getIngredients().getFirst());
        builder.addSlot(RecipeIngredientRole.OUTPUT, 58, 41).add(recipe.output().getItem());
    }


}