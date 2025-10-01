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
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.recipe.ModRecipes;

public class MicrowaveRecipeCategory extends AbstractRecipeCategory<RecipeHolder<MicrowaveRecipe>> {

    public static final ResourceLocation UID = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "microwave");
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,
            "textures/gui/microwave/growth_chamber_gui_jei.png");

    public static final IRecipeHolderType<MicrowaveRecipe> MICROWAVE_TYPE = IRecipeHolderType.create(ModRecipes.MICROWAVE_TYPE.get());


    public MicrowaveRecipeCategory(IGuiHelper helper) {
        super(MICROWAVE_TYPE, Component.translatable("gui.better_deco.microwave"), helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.LIGHT_MICROWAVE.get())), 176, 84);
    }

    @Override
    public void draw(RecipeHolder<MicrowaveRecipe> recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        guiGraphics.blit(RenderPipelines.GUI_TEXTURED, TEXTURE, 0, 0, 0, 0, 176, 85, 256, 256);
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder,RecipeHolder<MicrowaveRecipe> recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 54, 34).add(recipe.value().inputItem());

        builder.addSlot(RecipeIngredientRole.OUTPUT, 104, 34).add(recipe.value().output());
    }

}