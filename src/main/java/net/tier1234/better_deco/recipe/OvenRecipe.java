package net.tier1234.better_deco.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
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

public class OvenRecipe implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;

    public OvenRecipe(ResourceLocation id, NonNullList<Ingredient> inputItems, ItemStack output) {
        this.id = id;
        this.inputItems = inputItems;
        this.output = output;
    }

    public NonNullList<Ingredient> getInputItems() {
        return inputItems;
    }

    public ItemStack getOutput() {
        return output;
    }

    @Override
    public boolean matches(SimpleContainer container, Level level) {
        if (level.isClientSide()) {
            return false;
        }
        // controlla 3 slot
        for (int i = 0; i < 3; i++) {
            if (!inputItems.get(i).test(container.getItem(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public ItemStack assemble(SimpleContainer container, RegistryAccess registryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return output;
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
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<OvenRecipe> {
        public static final Type INSTANCE = new Type();
        public static final String ID = "oven";
    }

    public static class Serializer implements RecipeSerializer<OvenRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID = ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "oven");

        @Override
        public OvenRecipe fromJson(ResourceLocation recipeId, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(3, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new OvenRecipe(recipeId, inputs, output);
        }

        @Override
        public OvenRecipe fromNetwork(ResourceLocation recipeId, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(3, Ingredient.EMPTY);
            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }
            ItemStack result = buf.readItem();
            return new OvenRecipe(recipeId, inputs, result);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, OvenRecipe recipe) {
            for (Ingredient ing : recipe.inputItems) {
                ing.toNetwork(buf);
            }
            buf.writeItem(recipe.output);
        }
    }
}