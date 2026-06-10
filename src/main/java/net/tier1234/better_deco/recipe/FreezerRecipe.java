package net.tier1234.better_deco.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tier1234.better_deco.init.ModRecipes;

public class FreezerRecipe implements Recipe<SingleRecipeInput> {


    public final Ingredient ingredient;
    public final ItemStackTemplate output;

    public FreezerRecipe(Ingredient input, ItemStackTemplate output) {
        this.ingredient = input;
        this.output = output;
    }


    @Override
    public boolean matches(SingleRecipeInput singleItemRecipe, Level level) {
        return ingredient.test(singleItemRecipe.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleItemRecipe) {
        return output.create();
    }

    @Override
    public boolean showNotification() {
        return false;
    }

    @Override
    public String group() {
        return "";
    }

    @Override
    public RecipeSerializer<? extends Recipe<SingleRecipeInput>> getSerializer() {
        return ModRecipes.FREEZER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return ModRecipes.FREEZER_TYPE.get();
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.create(ingredient);
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }

    public static final MapCodec<FreezerRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(recipe -> recipe.ingredient),
            ItemStackTemplate.CODEC.fieldOf("result").forGetter(recipe-> recipe.output)
    ).apply(instance, FreezerRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, FreezerRecipe> STREAM_CODEC = StreamCodec.of(FreezerRecipe::toNetwork,
            FreezerRecipe::fromNetwork);

    private static FreezerRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
        final var ingredient = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        final var resultItem = ItemStackTemplate.STREAM_CODEC.decode(buf);
        return new FreezerRecipe(ingredient, resultItem);
    }
    private static void toNetwork(RegistryFriendlyByteBuf buf, FreezerRecipe recipe) {
        Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
        ItemStackTemplate.STREAM_CODEC.encode(buf, recipe.output);
    }
}
