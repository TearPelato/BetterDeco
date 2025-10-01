package net.tier1234.better_deco.compat.jei.category;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.AbstractRecipeCategory;
import mezz.jei.api.recipe.types.IRecipeHolderType;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.recipe.ModRecipes;
import net.tier1234.better_deco.recipe.OvenRecipe;

public class OvenRecipeCategory extends AbstractRecipeCategory<RecipeHolder<OvenRecipe>> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "oven");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,
            "textures/gui/oven/oven_jei_2.png");

    public static final IRecipeHolderType<OvenRecipe> OVEN_TYPE = IRecipeHolderType.create(ModRecipes.OVEN_TYPE.get());



    public OvenRecipeCategory(IGuiHelper helper) {
        super(OVEN_TYPE, Component.translatable("gui.better_deco.oven"), helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.OAK_OVEN.get())), 176, 81);

    }
    @Override
    public void draw(RecipeHolder<OvenRecipe> recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, 0, 0, 0, 0, 176, 81, 256, 256);
    }



    @Override
    public void setRecipe(IRecipeLayoutBuilder builder,RecipeHolder<OvenRecipe> recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 78, 17).add(recipe.value().inputItem());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 78, 53).add(recipe.value().output());
    }

}
