package net.tier1234.better_deco.compat.jei.categories;

import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.types.IRecipeHolderType;
import mezz.jei.api.recipe.types.IRecipeType;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.tier1234.better_deco.compat.jei.BetterDecoJEIPlugin;
import org.jetbrains.annotations.Nullable;
import java.util.function.Supplier;


public abstract class FurnitureRecipeCategory<T extends Recipe<?>> implements IRecipeCategory<RecipeHolder<T>>
{
    private final Supplier<IRecipeHolderType<T>> typeSupplier;
    private final Component title;
    private final IDrawable background;
    private final IDrawable icon;

    public FurnitureRecipeCategory(Supplier<IRecipeHolderType<T>> typeSupplier, Component title, IDrawable background, IDrawable icon)
    {
        this.typeSupplier = typeSupplier;
        this.title = title;
        this.background = background;
        this.icon = icon;
    }

    @Override
    public IRecipeType<RecipeHolder<T>> getRecipeType()
    {
        return this.typeSupplier.get();
    }

    @Override
    public Component getTitle()
    {
        return this.title;
    }

    @Override
    public int getWidth()
    {
        return this.background.getWidth();
    }

    @Override
    public int getHeight()
    {
        return this.background.getHeight();
    }

    @Override
    @Nullable
    public IDrawable getIcon()
    {
        return this.icon;
    }

    @Override
    public void draw(RecipeHolder<T> recipe, IRecipeSlotsView view, GuiGraphicsExtractor graphics, double mouseX, double mouseY)
    {
        this.background.draw(graphics);
    }

    protected void drawSeconds(GuiGraphicsExtractor graphics, int x, int y, int ticks)
    {
        float seconds = ticks / 20.0F;
        String formattedTime = BetterDecoJEIPlugin.FORMATTER.format(seconds);
        int width = BetterDecoJEIPlugin.getFont().width(formattedTime) / 2;
        graphics.text(BetterDecoJEIPlugin.getFont(), formattedTime, x - width, y, 0xFF808080, false);
    }
}