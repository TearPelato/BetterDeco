package net.tier1234.better_deco.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tier1234.better_deco.init.ModRecipes;

public class MicrowaveRecipe implements Recipe<SingleRecipeInput>{

    public final Ingredient ingredient;
    public final ItemStack output;

    public MicrowaveRecipe(Ingredient input, ItemStack output) {
        this.ingredient = input;
        this.output = output;
    }


    @Override
    public boolean matches(SingleRecipeInput singleItemRecipe, Level level) {
        return ingredient.test(singleItemRecipe.item());
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleItemRecipe, HolderLookup.Provider provider) {
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
        return ModRecipes.MICROWAVE_SERIALIZER.get();
    }

    @Override
    public RecipeType<? extends Recipe<SingleRecipeInput>> getType() {
        return ModRecipes.MICROWAVE_TYPE.get();
    }

    
    public static final MapCodec<MicrowaveRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(recipe -> recipe.ingredient),
            ItemStack.CODEC.fieldOf("result").forGetter(recipe-> recipe.output)
    ).apply(instance, MicrowaveRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, MicrowaveRecipe> STREAM_CODEC = StreamCodec.of(MicrowaveRecipe::toNetwork,
            MicrowaveRecipe::fromNetwork);

    private static MicrowaveRecipe fromNetwork(RegistryFriendlyByteBuf buf) {
        final var ingredient = Ingredient.CONTENTS_STREAM_CODEC.decode(buf);
        final var resultItem = ItemStack.STREAM_CODEC.decode(buf);
        return new MicrowaveRecipe(ingredient, resultItem);
    }
    private static void toNetwork(RegistryFriendlyByteBuf buf, MicrowaveRecipe recipe) {
        Ingredient.CONTENTS_STREAM_CODEC.encode(buf, recipe.ingredient);
        ItemStack.STREAM_CODEC.encode(buf, recipe.output);
    }
    
    
}
