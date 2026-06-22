package net.tier1234.better_deco.compat.jei.category;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.types.IRecipeHolderType;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.compat.jei.category.core.FurnitureRecipeCategory;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.util.Constants;

import java.util.function.Supplier;

public class MicrowaveCategory extends FurnitureRecipeCategory<MicrowaveRecipe> {
    public static final Supplier<IRecipeHolderType<MicrowaveRecipe>> TYPE = IRecipeHolderType.createDeferred(ModRecipes.MICROWAVE_TYPE::get);
    public static final Identifier TEXTURE = Constants.id("textures/gui/microwave/microwave_jei.png");

    private final IGuiHelper helper;

    public MicrowaveCategory(IGuiHelper helper)
    {
        super(TYPE,
                Constants.translationUtil("jei_category","microwave"),
                helper.createDrawable(TEXTURE, 0, 0, 176, 85),
                helper.createDrawableItemStack(new ItemStack(ModBlocks.LIGHT_MICROWAVE)));

        this.helper = helper;
    }

    @Override
    public Component getTitle()
    {
        return Constants.translationUtil("jei_category", "microwave_cooking");
    }


    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, RecipeHolder<MicrowaveRecipe> holder, IFocusGroup focuses) {
        MicrowaveRecipe recipe = holder.value();
        builder.addSlot(RecipeIngredientRole.INPUT, 54,34).add(recipe.ingredient);
        builder.addSlot(RecipeIngredientRole.OUTPUT, 104,34).add(recipe.output);
    }

    @Override
    public void draw(RecipeHolder<MicrowaveRecipe> recipe, IRecipeSlotsView view, GuiGraphicsExtractor graphics, double mouseX, double mouseY) {
        super.draw(recipe, view, graphics, mouseX, mouseY);
    }
}
