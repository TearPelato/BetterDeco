package net.tier1234.better_deco.compat.emi;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.RecipeManager;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.compat.emi.category.MicrowaveEmiRecipe;
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.recipe.ModRecipes;

@EmiEntrypoint
public class BetterDecoEMIPlugin implements EmiPlugin {

    // === Risorse grafiche ===
    private static final ResourceLocation OVEN_TEX =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "gui/oven/oven_jei_2");
    private static final ResourceLocation MICROWAVE_TEX =
             ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "gui/microwave/growth_chamber_gui_jei");

    // === Workstation stacks ===
    private static final EmiStack OVEN_STACK = EmiStack.of(ModBlocks.OAK_OVEN.get());
    private static final EmiStack MICROWAVE_STACK = EmiStack.of(ModBlocks.LIGHT_MICROWAVE.get());

    // === Categorie EMI ===
    public static final EmiRecipeCategory OVEN_CATEGORY = new EmiRecipeCategory(
           ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "oven"),
            OVEN_STACK,
            new EmiTexture(OVEN_TEX, 0, 0, 171, 86)
    );

    public static final EmiRecipeCategory MICROWAVE_CATEGORY = new EmiRecipeCategory(
           ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "microwave"),
            MICROWAVE_STACK,
            new EmiTexture(MICROWAVE_TEX, 0, 0, 176, 85)
    );

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(OVEN_CATEGORY);
        registry.addCategory(MICROWAVE_CATEGORY);

        registry.addWorkstation(OVEN_CATEGORY, OVEN_STACK);
        registry.addWorkstation(MICROWAVE_CATEGORY, MICROWAVE_STACK);

        RecipeManager manager = registry.getRecipeManager();

        for (RecipeHolder<MicrowaveRecipe> holder : manager.getAllRecipesFor(ModRecipes.MICROWAVE_TYPE.get())) {
            MicrowaveRecipe recipe = holder.value();
            registry.addRecipe(new MicrowaveEmiRecipe(recipe));
        }

    }
}