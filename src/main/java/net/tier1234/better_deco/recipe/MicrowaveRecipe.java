package net.tier1234.better_deco.recipe;


import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public record MicrowaveRecipe(ResourceLocation id, Ingredient inputItem, ItemStack output)
        implements Recipe<MicrowaveRecipeInput> {
    // inputItem & output ==> Read From JSON File!
    // MicrowaveRecipeInput --> INVENTORY of the Block Entity

    public ResourceLocation getId() {
        return id;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(inputItem);
        return list;
    }

    @Override
    public boolean matches(MicrowaveRecipeInput microwaveRecipeInput, Level level) {
        if (level.isClientSide()) {
            return false;
        }
        return inputItem.test(microwaveRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(MicrowaveRecipeInput microwaveRecipeInput, HolderLookup.Provider provider) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.MICROWAVE_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.MICROWAVE_TYPE.get();
    }

    public static class Serializer implements RecipeSerializer<MicrowaveRecipe> {
        public static final MapCodec<MicrowaveRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                ResourceLocation.CODEC.fieldOf("id").forGetter(MicrowaveRecipe::getId),
                Ingredient.CODEC_NONEMPTY.fieldOf("ingredient").forGetter(MicrowaveRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(MicrowaveRecipe::output)
        ).apply(inst, MicrowaveRecipe::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, MicrowaveRecipe> STREAM_CODEC =
                StreamCodec.composite(
                        ResourceLocation.STREAM_CODEC, MicrowaveRecipe::getId,
                        Ingredient.CONTENTS_STREAM_CODEC, MicrowaveRecipe::inputItem,
                        ItemStack.STREAM_CODEC, MicrowaveRecipe::output,
                        MicrowaveRecipe::new
                );

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