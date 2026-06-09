package net.tier1234.better_deco.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tier1234.better_deco.init.ModRecipes;
import net.tier1234.better_deco.util.ModTags;

public class OvenRecipe implements Recipe<SingleRecipeInput> {

    public final Ingredient ingredient;
    public final ItemStackTemplate output;
    public int fuelCost;

    public OvenRecipe(Ingredient input, ItemStackTemplate output, int fuelCost) {
        this.ingredient = input;
        this.output = output;
        this.fuelCost = fuelCost;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, Level level) {
        return ingredient.test(singleRecipeInput.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput) {
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
        return ModRecipes.OVEN_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return ModRecipes.OVEN_TYPE.get();
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.create(ingredient);
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }


    public static final MapCodec<OvenRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(recipe -> recipe.ingredient),
            ItemStackTemplate.CODEC.fieldOf("result").forGetter(recipe-> recipe.output),
            Codec.INT.optionalFieldOf("fuel_cost", 200).forGetter(recipe-> recipe.fuelCost)
    ).apply(instance, OvenRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, OvenRecipe> STREAM_CODEC = StreamCodec.of(OvenRecipe::toNetwork,
            OvenRecipe::fromNetwork);

    private static OvenRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
        final var ingredient = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        final var resultItem = ItemStackTemplate.STREAM_CODEC.decode(buf);
        final var fuelCost = buf.readVarInt();
        return new OvenRecipe(ingredient, resultItem, fuelCost);
    }
    private static void toNetwork(RegistryFriendlyByteBuf buf, OvenRecipe recipe) {
        Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
        ItemStackTemplate.STREAM_CODEC.encode(buf, recipe.output);
        buf.writeVarInt(recipe.fuelCost);
    }

}
