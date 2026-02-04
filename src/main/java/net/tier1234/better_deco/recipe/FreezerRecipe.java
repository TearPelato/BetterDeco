package net.tier1234.better_deco.recipe;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class FreezerRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final ResourceLocation id;


    public FreezerRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return inputItems;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public boolean matches(SimpleContainer simpleContainer, Level level) {
        if (level.isClientSide()) {
            return false;
        }

        return inputItems.get(0).test(simpleContainer.getItem(0));
    }

    @Override
    public ItemStack assemble(SimpleContainer simpleContainer, RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return output;
    }
   /* public int getFreezeTime() {
        return freezeTime;
    }

    public float getExperience() {
        return experience;
    }*/

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.FREEZER_SERIALIZER.get();
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(ModBlocks.FRIDGE_LIGHT.get());
    }

    public static class Type implements RecipeType<MicrowaveRecipe> {
        public static final MicrowaveRecipe.Type INSTANCE = new MicrowaveRecipe.Type();
        public static final String ID = "freezer";
    }

    public static class Serializer implements RecipeSerializer<FreezerRecipe> {
        public static final FreezerRecipe.Serializer INSTANCE = new FreezerRecipe.Serializer();
        public static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "oven");


        @Override
        public FreezerRecipe fromJson(ResourceLocation resourceLocation, JsonObject jsonObject) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(jsonObject, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(jsonObject, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new FreezerRecipe(inputs, output, resourceLocation);
        }

        @Override
        public @Nullable FreezerRecipe fromNetwork(ResourceLocation resourceLocation, FriendlyByteBuf friendlyByteBuf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(friendlyByteBuf.readInt(), Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(friendlyByteBuf));
            }

            ItemStack output = friendlyByteBuf.readItem();
            return new FreezerRecipe(inputs, output, resourceLocation);
        }

        @Override
        public void toNetwork(FriendlyByteBuf friendlyByteBuf, FreezerRecipe FreezerRecipe) {
            friendlyByteBuf.writeInt(FreezerRecipe.inputItems.size());

            for (Ingredient ingredient : FreezerRecipe.getIngredients()) {
                ingredient.toNetwork(friendlyByteBuf);
            }

            friendlyByteBuf.writeItemStack(FreezerRecipe.getResultItem(null), false);
        }
    }
}