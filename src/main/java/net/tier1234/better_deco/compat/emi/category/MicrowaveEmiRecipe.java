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

public class MicrowaveEmiRecipe implements EmiRecipe {
    private final ResourceLocation id;
    private final List<EmiIngredient> inputs;
    private final List<EmiStack> outputs;

    public MicrowaveEmiRecipe(MicrowaveRecipe recipe) {
        this.id = recipe.getId();
        this.inputs = recipe.getIngredients().isEmpty()
                ? List.of()
                : List.of(EmiIngredient.of(recipe.getIngredients().get(0)));
        this.outputs = List.of(EmiStack.of(recipe.output()));
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return BetterDecoEMIPlugin.MICROWAVE_CATEGORY;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return inputs;
    }

    @Override
    public List<EmiStack> getOutputs() {
        return outputs;
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
        // freccia di processo
        widgets.addTexture(EmiTexture.EMPTY_ARROW, 26, 1);
        // slot input/output
        if (!inputs.isEmpty()) {
            widgets.addSlot(inputs.get(0), 0, 0);
        }
        if (!outputs.isEmpty()) {
            widgets.addSlot(outputs.get(0), 58, 0).recipeContext(this);
        }
    }
}
