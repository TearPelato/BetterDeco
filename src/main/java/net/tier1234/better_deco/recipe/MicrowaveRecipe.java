package net.tier1234.better_deco.recipe;


import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record MicrowaveRecipe(Ingredient inputItem, ItemStack output) implements Recipe<MicrowaveRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // MicrowaveRecipeInput --> INVENTORY of the Block Entity

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(MicrowaveRecipeInput MicrowaveRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItem.test(MicrowaveRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(MicrowaveRecipeInput microwaveRecipeInput) {
        return output.copy();
    }

    @Override
    public RecipeSerializer<? extends Recipe<MicrowaveRecipeInput>> getSerializer() {
        return ModRecipes.MICROWAVE_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<MicrowaveRecipeInput>> getType() {
        return ModRecipes.MICROWAVE_TYPE.get();
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.create(inputItem);
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }

    public static class Serializer implements RecipeSerializer<MicrowaveRecipe> {
        public static final MapCodec<MicrowaveRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(MicrowaveRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(MicrowaveRecipe::output)
        ).apply(inst, MicrowaveRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, MicrowaveRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, MicrowaveRecipe::inputItem,
                        ItemStack.STREAM_CODEC, MicrowaveRecipe::output,
                        MicrowaveRecipe::new);

        @Override
        public MapCodec<MicrowaveRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, MicrowaveRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
