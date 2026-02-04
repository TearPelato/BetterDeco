package net.tier1234.better_deco.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tier1234.better_deco.BetterDeco;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, BetterDeco.MOD_ID);
    public static final DeferredRegister<RecipeType<?>> TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, BetterDeco.MOD_ID);

    public static final RegistryObject<RecipeSerializer<OvenRecipe>> OVEN_SERIALIZER =
            SERIALIZERS.register("oven", ()-> OvenRecipe.Serializer.INSTANCE);
    
    public static final RegistryObject<RecipeSerializer<MicrowaveRecipe>> MICROWAVE_SERIALIZER =
            SERIALIZERS.register("microwave", ()-> MicrowaveRecipe.Serializer.INSTANCE);
    
    public static final RegistryObject<RecipeSerializer<FreezerRecipe>> FREEZER_SERIALIZER =
            SERIALIZERS.register("freezer", ()-> FreezerRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
        TYPES.register(eventBus);
    }
}
