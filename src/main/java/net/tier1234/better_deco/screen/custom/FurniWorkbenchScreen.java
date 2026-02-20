package net.tier1234.better_deco.screen.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.WidgetSprites;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.tooltip.ClientTooltipComponent;
import net.minecraft.client.gui.screens.inventory.tooltip.DefaultTooltipPositioner;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.mixin.GuiGraphicsInvoker;
import net.tier1234.better_deco.network.message.CraftRecipePayload;
import net.tier1234.better_deco.recipe.CountedIngredient;
import net.tier1234.better_deco.recipe.FurniCraftingRecipe;
import net.tier1234.better_deco.screen.tooltip.ClientFurnicrafterRecipeIngredientTooltip;
import net.tier1234.better_deco.screen.tooltip.ClientFurnicrafterRecipeTooltip;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurniWorkbenchScreen extends AbstractContainerScreen<FurniWorkbenchMenu> {

    public static final ResourceLocation TEXTURE = BetterDeco.id("textures/gui/workbench/workbench_interface.png");
    private static final WidgetSprites BUTTON_TEXTURE = new WidgetSprites(
            BetterDeco.id(""),
            BetterDeco.id(""),
            BetterDeco.id(""),
            BetterDeco.id("")
    );

    private static final int RECIPES_PER_ROW = 6;
    private static final int BUTTON_SIZE = 20;
    private static final int GRID_X_OFFSET = 7;
    private static final int GRID_Y_OFFSET = 39;
    private static final int WINDOW_WIDTH = RECIPES_PER_ROW * BUTTON_SIZE;
    private static final int WINDOW_HEIGHT = 67;
    private static final int SCROLL_SPEED = 10;
    private static final int SCROLLBAR_HEIGHT = 15;
    private static final int SCROLLBAR_AREA = 67;

    private static final int SCROLLBAR_TEXTURE_ENABLED_X = 176;
    private static final int SCROLLBAR_TEXTURE_DISABLED_X = 188;
    private static final int SCROLLBAR_TEXTURE_Y = 40;
    private static final int Y_OFFSET_CORRECTION = 0;

    private List<FurniCraftingRecipe> recipes = new ArrayList<>();
    private double scroll = 0;
    private double targetScroll = 0;                 // NEW: animazione thumb
    private int hoveredRecipeIndex = -1;
    private int selectedRecipeIndex = -1;            // NEW: highlight selezione
    private int clickedY = -1;

    private EditBox searchField;
    private ImageButton sortToggleButton;             // FIX: ImageButton
    private boolean showCraftableOnly = false;

    public FurniWorkbenchScreen(FurniWorkbenchMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        this.imageWidth = 176;
        this.imageHeight = 204;
        this.inventoryLabelY = 110;
        updateRecipes();
    }

    @Override
    protected void init() {
        super.init();

        this.searchField = new EditBox(this.font, this.leftPos + 7, this.topPos + 18, 120, 20,
                Component.translatable("text.better_deco.recipe.search"));
        this.searchField.setResponder(s -> applySearchFilter());
        this.searchField.setMaxLength(50);
        this.searchField.setHint(Component.translatable("text.better_deco.recipe.search"));
        this.addRenderableWidget(this.searchField);

        this.sortToggleButton = new ImageButton(this.leftPos + 130, this.topPos + 18, 12, 21, BUTTON_TEXTURE, btn ->{
            showCraftableOnly = !showCraftableOnly;
            sortToggleButton.setMessage(showCraftableOnly
            ? Component.translatable("text.better_deco.recipe.show_all")
            : Component.translatable("text.better_deco.recipe.show_craftable"));
            applySearchFilter();
        });

        this.addRenderableWidget(this.sortToggleButton);
        this.addRenderableWidget(this.sortToggleButton);
    }

    private void updateRecipes() {
        this.recipes = menu.getAvailableRecipes().stream()
                .map(RecipeHolder::value)
                .toList();

        applySearchFilter();
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        // NEW: animazione fluida thumb
        scroll = Mth.lerp(0.3f, scroll, targetScroll);

        super.render(graphics, mouseX, mouseY, partialTick);
        this.renderTooltip(graphics, mouseX, mouseY);
        this.searchField.render(graphics, mouseX, mouseY, partialTick);

        if (sortToggleButton.isHovered()) {
            graphics.renderTooltip(font,
                    Component.translatable(showCraftableOnly
                            ? "text.better_deco.recipe.show_craftable"
                            : "text.better_deco.recipe.show_all"),
                    mouseX, mouseY);
        }

        if (hoveredRecipeIndex != -1 &&
                isMouseWithinBounds(mouseX, mouseY,
                        leftPos + GRID_X_OFFSET,
                        topPos + GRID_Y_OFFSET,
                        WINDOW_WIDTH,
                        WINDOW_HEIGHT)) {
            renderRecipeTooltip(graphics, mouseX, mouseY, hoveredRecipeIndex);
        }
    }

    private void renderRecipeTooltip(GuiGraphics graphics, int mouseX, int mouseY, int recipeIndex) {
        FurniCraftingRecipe recipe = recipes.get(recipeIndex); // FIX: usa lista filtrata

        List<ClientTooltipComponent> components = new ArrayList<>();
        components.add(ClientTooltipComponent.create(
                recipe.getResultItem(null).getHoverName().getVisualOrderText()
        ));

        if (!Screen.hasShiftDown()) {
            components.add(new ClientFurnicrafterRecipeTooltip(menu, recipe));
            components.add(ClientTooltipComponent.create(
                    Component.translatable("gui.better_deco.hold_shift_for_details")
                            .withStyle(ChatFormatting.GRAY)
                            .getVisualOrderText()
            ));
        } else {
            Map<Integer, Integer> counted = new HashMap<>();
            for (CountedIngredient ingredient : recipe.getMaterials()) {
                components.add(new ClientFurnicrafterRecipeIngredientTooltip(menu, ingredient, counted));
            }
        }

        ((GuiGraphicsInvoker) graphics)
                .invokeRenderTooltipInternal(this.font, components, mouseX, mouseY, DefaultTooltipPositioner.INSTANCE);
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTicks, int mouseX, int mouseY) {
        graphics.blit(TEXTURE, leftPos, topPos, 0, 0, imageWidth, imageHeight, 256, 256);
        renderRecipes(graphics, mouseX, mouseY);
        renderScrollbar(graphics, mouseY);
    }

    private void renderRecipes(GuiGraphics graphics, int mouseX, int mouseY) {
        hoveredRecipeIndex = -1;
        int clipX = leftPos + GRID_X_OFFSET;
        int clipY = topPos + GRID_Y_OFFSET;
        graphics.enableScissor(clipX, clipY, clipX + WINDOW_WIDTH, clipY + WINDOW_HEIGHT);

        int totalRecipes = recipes.size();
        int startRow = (int) (scroll / BUTTON_SIZE);
        int startIndex = startRow * RECIPES_PER_ROW;
        int rowsToDraw = (int) Math.ceil(WINDOW_HEIGHT / (double) BUTTON_SIZE) + 1;
        int endIndex = Math.min(totalRecipes, startIndex + rowsToDraw * RECIPES_PER_ROW);

        boolean mouseInGrid = isMouseWithinBounds(mouseX, mouseY, clipX, clipY, WINDOW_WIDTH, WINDOW_HEIGHT);

        for (int i = startIndex; i < endIndex; i++) {
            int visibleIndex = i - startIndex; // FIX: hover e posizioni corrette
            int row = visibleIndex / RECIPES_PER_ROW;
            int col = visibleIndex % RECIPES_PER_ROW;

            int x = leftPos + GRID_X_OFFSET + col * BUTTON_SIZE;
            int y = topPos + GRID_Y_OFFSET + row * BUTTON_SIZE - Y_OFFSET_CORRECTION;

            FurniCraftingRecipe recipe = recipes.get(i);
            boolean canCraft = menu.canCraft(recipe);

            int textureU = 176 + (!canCraft ? BUTTON_SIZE : 0);
            graphics.blit(TEXTURE, x, y, textureU, 0, BUTTON_SIZE, BUTTON_SIZE, 256, 256);
            graphics.renderFakeItem(recipe.getResultItem(null), x + 2, y + 2);

            // NEW: highlight selezione
            if (i == selectedRecipeIndex) {
                graphics.fill(x, y, x + BUTTON_SIZE, y + BUTTON_SIZE, 0x66FFFFFF);
            }

            if (mouseInGrid && mouseX >= x && mouseX < x + BUTTON_SIZE && mouseY >= y && mouseY < y + BUTTON_SIZE) {
                hoveredRecipeIndex = i;
            }
        }
        graphics.disableScissor();
    }

    private void renderScrollbar(GuiGraphics graphics, int mouseY) {
        int maxScroll = getMaxScroll();
        if (maxScroll <= 0) return;

        int scrollbarX = leftPos + GRID_X_OFFSET + WINDOW_WIDTH + 3;
        int scrollbarY = topPos + GRID_Y_OFFSET - Y_OFFSET_CORRECTION;

        int scrollbarPos = maxScroll == 0 ? 0 :
                (int) (scroll * (SCROLLBAR_AREA - SCROLLBAR_HEIGHT) / (double) maxScroll);

        graphics.blit(TEXTURE,
                scrollbarX,
                scrollbarY + scrollbarPos,
                SCROLLBAR_TEXTURE_ENABLED_X,
                SCROLLBAR_TEXTURE_Y,
                12,
                SCROLLBAR_HEIGHT,
                256,
                256);
    }

    private int getMaxScroll() {
        int totalRows = (int) Math.ceil(recipes.size() / (double) RECIPES_PER_ROW);
        return Math.max(0, totalRows * BUTTON_SIZE - WINDOW_HEIGHT);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            if (hoveredRecipeIndex != -1) {
                selectedRecipeIndex = hoveredRecipeIndex; // NEW: selezione

                boolean craftAll = Screen.hasControlDown() || Screen.hasShiftDown(); // NEW
                craftItem(hoveredRecipeIndex);

                Minecraft.getInstance().getSoundManager().play(
                        SimpleSoundInstance.forUI(SoundEvents.UI_BUTTON_CLICK, 1.0F)
                );
                return true;
            }

            int scrollbarX = leftPos + GRID_X_OFFSET + WINDOW_WIDTH + 3;
            int scrollbarPos = (int) ((scroll / (double) getMaxScroll()) * (SCROLLBAR_AREA - SCROLLBAR_HEIGHT));
            if (isMouseWithinBounds(mouseX, mouseY, scrollbarX,
                    topPos + GRID_Y_OFFSET - Y_OFFSET_CORRECTION + scrollbarPos, 12, SCROLLBAR_HEIGHT)) {
                clickedY = (int) mouseY;
                return true;
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (button == GLFW.GLFW_MOUSE_BUTTON_LEFT && clickedY != -1) {
            targetScroll = Mth.clamp(targetScroll, 0, getMaxScroll()); // FIX: usa targetScroll
            clickedY = -1;
            return true;
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double deltaX, double deltaY) {
        if (getMaxScroll() > 0 && clickedY == -1 &&
                isMouseWithinBounds(mouseX, mouseY,
                        leftPos + GRID_X_OFFSET,
                        topPos + GRID_Y_OFFSET,
                        WINDOW_WIDTH + 15,
                        WINDOW_HEIGHT)) {
            targetScroll = Mth.clamp(targetScroll - deltaY * SCROLL_SPEED, 0, getMaxScroll()); // FIX: targetScroll
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, deltaX, deltaY);
    }

    private void craftItem(int recipeIndex) {
        PacketDistributor.sendToServer(new CraftRecipePayload(menu.containerId, recipeIndex));
    }

    public void updateRecipeButtons() {
        updateRecipes();
    }

    private void applySearchFilter() {
        if (this.searchField == null) return;

        String query = this.searchField.getValue().toLowerCase().trim();

        this.recipes = menu.getAvailableRecipes().stream()
                .map(RecipeHolder::value)
                .filter(recipe -> {
                    boolean matchesSearch = query.isEmpty() ||
                            recipe.getResultItem(null).getHoverName().getString().toLowerCase().contains(query);
                    boolean matchesCraftable = !showCraftableOnly || menu.canCraft(recipe);
                    return matchesSearch && matchesCraftable;
                })
                .toList();

        targetScroll = 0;
        scroll = 0;
    }

    private boolean isMouseWithinBounds(double mouseX, double mouseY, int x, int y, int width, int height) {
        return mouseX >= x && mouseX < x + width && mouseY >= y && mouseY < y + height;
    }
}