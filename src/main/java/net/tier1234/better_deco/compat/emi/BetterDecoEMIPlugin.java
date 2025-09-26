package net.tier1234.better_deco.compat.emi;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.compat.emi.category.MicrowaveRecipeCategory;
import net.tier1234.better_deco.recipe.MicrowaveRecipe;
import net.tier1234.better_deco.recipe.ModRecipes;

@EmiEntrypoint
public class BetterDecoEMIPlugin implements EmiPlugin {
    public static final ResourceLocation OVEN = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/oven/oven_jei_2");
    public static final EmiStack OVEN_STACK = EmiStack.of(ModBlocks.OAK_OVEN);

    public static final ResourceLocation MICROWAVE = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/microwave/growth_chamber_gui_jei.png");
    public static final EmiStack MICROWAVE_STACK = EmiStack.of(ModBlocks.LIGHT_MICROWAVE);


    public static final EmiRecipeCategory OVEN_CATEGORY
            = new EmiRecipeCategory(ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/oven/oven_jei_2"), OVEN_STACK, new EmiTexture(OVEN, 0, 0, 171, 86));

    public static final EmiRecipeCategory MICROWAVE_CATEGORY
            = new EmiRecipeCategory(ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/microwave/growth_chamber_gui_jei.png"), MICROWAVE_STACK, new EmiTexture(MICROWAVE, 0,0,176, 85));


    @Override
    public void register(EmiRegistry registry) {
        // Tell EMI to add a tab for your category
        registry.addCategory(OVEN_CATEGORY);
        registry.addCategory(MICROWAVE_CATEGORY);

        // Add all the workstations your category uses
        registry.addWorkstation(OVEN_CATEGORY, OVEN_STACK);
        registry.addWorkstation(MICROWAVE_CATEGORY,MICROWAVE_STACK);


        RecipeManager manager = registry.getRecipeManager();

        // Use vanilla's concept of your recipes and pass them to your EmiRecipe representation

    }
}