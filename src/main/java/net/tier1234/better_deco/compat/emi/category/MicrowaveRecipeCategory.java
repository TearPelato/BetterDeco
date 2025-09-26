package net.tier1234.better_deco.compat.emi.category;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.tier1234.better_deco.compat.emi.BetterDecoEMIPlugin;
import net.tier1234.better_deco.recipe.MicrowaveRecipe;

import java.util.List;

public class MicrowaveRecipeCategory implements EmiRecipe {
    private final Ingredient id;
    private final List<EmiIngredient> input;
    private final List<EmiStack> output;


    public MicrowaveRecipeCategory(MicrowaveRecipe recipe) {
        this.id = recipe.inputItem();
        this.input = List.of(EmiIngredient.of(recipe.getIngredients().get(0)));
        this.output = List.of(EmiStack.of(recipe.output()));
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return BetterDecoEMIPlugin.MICROWAVE_CATEGORY;
    }

    @Override
    public ResourceLocation getId() {
        return getId();
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return input;
    }

    @Override
    public List<EmiStack> getOutputs() {
        return output;
    }

    @Override
    public int getDisplayWidth() {
        return 76;
    }

    @Override
    public int getDisplayHeight() {
        return 18;
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        // Add an arrow texture to indicate processing
        widgets.addTexture(EmiTexture.EMPTY_ARROW, 26, 1);

        // Adds an input slot on the left
        widgets.addSlot(input.get(0), 0, 0);

        // Adds an output slot on the right
        // Note that output slots need to call `recipeContext` to inform EMI about their recipe context
        // This includes being able to resolve recipe trees, favorite stacks with recipe context, and more
        widgets.addSlot(output.get(0), 58, 0).recipeContext(this);
    }
}
