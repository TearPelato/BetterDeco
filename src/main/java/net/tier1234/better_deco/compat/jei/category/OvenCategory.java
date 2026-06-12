package net.tier1234.better_deco.compat.jei.category;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.types.IRecipeHolderType;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.compat.jei.category.core.FurnitureRecipeCategory;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;
import net.tier1234.better_deco.util.Constants;

import java.util.function.Supplier;

public class OvenCategory extends FurnitureRecipeCategory<OvenRecipe> {

    public static final Supplier<IRecipeHolderType<OvenRecipe>> TYPE = IRecipeHolderType.createDeferred(ModRecipes.OVEN_TYPE::get);
    public static final Identifier TEXTURE = Constants.id("textures/gui/oven/oven_jei_2.png");
    private static final Identifier ARROW_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress_3.png");
    private final IGuiHelper helper;
    private IDrawable arrow;

    public OvenCategory(IGuiHelper helper)
    {
        super(TYPE,
                Constants.translationUtil("jei_category","oven"),
                helper.createDrawable(TEXTURE, 0, 0, 176, 81),
                helper.createDrawableItemStack(new ItemStack(ModBlocks.OAK_OVEN)));

        this.helper = helper;
    }

    @Override
    public Component getTitle()
    {
        return Constants.translationUtil("jei_category", "oven_cooking");
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<OvenRecipe> holder, IFocusGroup focuses) {
        OvenRecipe recipe = holder.value();
        builder.addSlot(RecipeIngredientRole.INPUT, 78, 17).add(recipe.ingredient);
        builder.addSlot(RecipeIngredientRole.OUTPUT, 78, 53).add(recipe.output);
        builder.addSlot(RecipeIngredientRole.RENDER_ONLY, 42, 35).add(new ItemStack(Items.COAL));

    }

    @Override
    public void draw(RecipeHolder<OvenRecipe> recipe, IRecipeSlotsView view, GuiGraphicsExtractor graphics, double mouseX, double mouseY) {
        super.draw(recipe, view, graphics, mouseX, mouseY);
    }
}