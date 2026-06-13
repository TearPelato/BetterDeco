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

public class OvenRecipe implements Recipe<SingleRecipeInput> {

    public final Ingredient ingredient;
    public final ItemStack output;
    public int fuelCost;

    public OvenRecipe(Ingredient input, ItemStack output, int fuelCost) {
        this.ingredient = input;
        this.output = output;
        this.fuelCost = fuelCost;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, Level level) {
        return ingredient.test(singleRecipeInput.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.Provider holder) {
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
        return ModRecipes.OVEN_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return ModRecipes.OVEN_TYPE.get();
    }



    public static final MapCodec<OvenRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(recipe -> recipe.ingredient),
            ItemStack.CODEC.fieldOf("result").forGetter(recipe-> recipe.output),
            Codec.INT.optionalFieldOf("fuel_cost", 200).forGetter(recipe-> recipe.fuelCost)
    ).apply(instance, OvenRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, OvenRecipe> STREAM_CODEC = StreamCodec.of(OvenRecipe::toNetwork,
            OvenRecipe::fromNetwork);

    private static OvenRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
        final var ingredient = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        final var resultItem = ItemStack.STREAM_CODEC.decode(buf);
        final var fuelCost = buf.readVarInt();
        return new OvenRecipe(ingredient, resultItem, fuelCost);
    }
    private static void toNetwork(RegistryFriendlyByteBuf buf, OvenRecipe recipe) {
        Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
        ItemStack.STREAM_CODEC.encode(buf, recipe.output);
        buf.writeVarInt(recipe.fuelCost);
    }

}
