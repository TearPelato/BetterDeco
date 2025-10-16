package net.tier1234.better_deco.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, BetterDeco.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, BetterDeco.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<OvenRecipe>>OVEN_SERIALIZER =
            SERIALIZERS.register("oven", OvenRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<OvenRecipe>> OVEN_TYPE =
            TYPES.register("oven", () -> new RecipeType<OvenRecipe>() {
                @Override
                public String toString() {
                    return "oven";
                }
            });


    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<MicrowaveRecipe>> MICROWAVE_SERIALIZER =
            SERIALIZERS.register("microwave", MicrowaveRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<MicrowaveRecipe>> MICROWAVE_TYPE =
            TYPES.register("microwave", () -> new RecipeType<MicrowaveRecipe>() {
                @Override
                public String toString() {
                    return "microwave";
                }
            });


    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<FreezerRecipe>> FREEZER_SERIALIZER =
            SERIALIZERS.register("freezer", FreezerRecipe.Serializer::new);
    public static final DeferredHolder<RecipeType<?>, RecipeType<FreezerRecipe>> FREEZER_TYPE =
            TYPES.register("freezer", ()-> new RecipeType<FreezerRecipe>() {
                @Override
                public String toString() {
                    return "freezer";
                }
            } );


    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
