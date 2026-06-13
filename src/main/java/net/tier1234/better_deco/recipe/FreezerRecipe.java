package net.tier1234.better_deco.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tier1234.better_deco.init.ModRecipes;

public class FreezerRecipe implements Recipe<SingleRecipeInput> {


    public final Ingredient ingredient;
    public final ItemStack output;
    public final int fuelCost;

    public FreezerRecipe(Ingredient input, ItemStack output, int fuelCost) {
        this.ingredient = input;
        this.output = output;
        this.fuelCost = fuelCost;
    }


    @Override
    public boolean matches(SingleRecipeInput singleItemRecipe, Level level) {
        return ingredient.test(singleItemRecipe.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output.copy();
    }


    @Override
    public boolean showNotification() {
        return false;
    }

    @Override
    public RecipeSerializer<? extends Recipe<SingleRecipeInput>> getSerializer() {
        return ModRecipes.FREEZER_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return ModRecipes.FREEZER_TYPE.get();
    }


    public static final MapCodec<FreezerRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(recipe -> recipe.ingredient),
            ItemStack.CODEC.fieldOf("result").forGetter(recipe -> recipe.output),
            Codec.INT.optionalFieldOf("fuelCost", 200).forGetter(recipe -> recipe.fuelCost)
    ).apply(instance, FreezerRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, FreezerRecipe> STREAM_CODEC = StreamCodec.of(FreezerRecipe::toNetwork,
            FreezerRecipe::fromNetwork);

    private static FreezerRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
        final var ingredient = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        final var resultItem = ItemStack.STREAM_CODEC.decode(buf);
        final var fuelCost = buf.readInt();
        return new FreezerRecipe(ingredient, resultItem, fuelCost);
    }
    private static void toNetwork(RegistryFriendlyByteBuf buf, FreezerRecipe recipe) {
        Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
        ItemStack.STREAM_CODEC.encode(buf, recipe.output);
        buf.writeVarInt(recipe.fuelCost);
    }
}
