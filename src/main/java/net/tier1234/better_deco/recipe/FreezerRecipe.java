package net.tier1234.better_deco.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record FreezerRecipe(Ingredient inputItem, ItemStack output, int freezeTime)
        implements Recipe<FreezerRecipeInput> {


    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(FreezerRecipeInput recipeInput, Level level) {
        if (level.isClientSide()) return false;
        return inputItem.test(recipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(FreezerRecipeInput recipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }


    @Override
    public RecipeSerializer<? extends Recipe<FreezerRecipeInput>> getSerializer() {
        return ModRecipes.FREEZER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<FreezerRecipeInput>> getType() {
        return ModRecipes.FREEZER_TYPE.get();
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.create(inputItem);
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }


    public int getFreezeTime() {
        return freezeTime;
    }

    public static class Serializer implements RecipeSerializer<FreezerRecipe> {
        public static final MapCodec<FreezerRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.CODEC.fieldOf("ingredient").forGetter(FreezerRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(FreezerRecipe::output),
                Codec.INT.optionalFieldOf("freezeTime", 200).forGetter(FreezerRecipe::getFreezeTime)
        ).apply(inst, FreezerRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, FreezerRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        Ingredient.CONTENTS_STREAM_CODEC, FreezerRecipe::inputItem,
                        ItemStack.STREAM_CODEC, FreezerRecipe::output,
                        ByteBufCodecs.VAR_INT, FreezerRecipe::getFreezeTime,
                        FreezerRecipe::new
                );

        @Override
        public MapCodec<FreezerRecipe> codec() {
            return CODEC;
        }

        @Override
        public StreamCodec<RegistryFriendlyByteBuf, FreezerRecipe> streamCodec() {
            return STREAM_CODEC;
        }
    }
}
