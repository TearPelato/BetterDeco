package net.tier1234.better_deco.screen.custom;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;


public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
    private static final ResourceLocation GUI_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/oven/oven.png");
    private static final ResourceLocation ARROW_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress_3.png");
    private static final ResourceLocation LIT_PROGRESS_SPRITE = ResourceLocation.withDefaultNamespace("container/furnace/lit_progress");

    private int GUIimageWidht = this.imageWidth;
    private int GUIimageHeight = this.imageHeight;


    public OvenScreen(OvenMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        GUIimageWidht = 176;
        GUIimageHeight = 184;
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        guiGraphics.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY - 9, -12566464, false);
        guiGraphics.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY + 9, -12566464, false);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {

        int x = (width - imageWidth) / 2;
        int y = (height - GUIimageHeight) / 2;

        guiGraphics.blit(GUI_TEXTURE, x, y, 0, 0, imageWidth, GUIimageHeight, 256,256);

        renderProgressArrows(guiGraphics, x, y);
        renderBurnProgress(guiGraphics, x, y);
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        super.render(guiGraphics, mouseX, mouseY, partialTick);
        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    private void renderBurnProgress(GuiGraphics graphics, int x, int y) {
        int xLeft = this.getGuiLeft();
        int yTop = this.getGuiTop();

        if (this.menu.isBurning()) {
            int litSpriteHeight = 14;
            int litProgressHeight = Mth.ceil(this.menu.getBurnProgress() * 13.0F) + 1;
            graphics.blitSprite(LIT_PROGRESS_SPRITE, 14, 14, 0, 14 - litProgressHeight, xLeft + 42, yTop + 10 + 14 - litProgressHeight, 14, litProgressHeight);
        }

    }



    private void renderProgressArrows(GuiGraphics gui, int x, int y) {
        for (int i = 0; i < 3; i++) {
            int progress = menu.getScaledArrowProgress(i);

            if (progress > 0) {
                int arrowHeight = 16;

                int arrowX = x + 60 + i * 18;
                int arrowY = y + 36;

                gui.blit(ARROW_TEXTURE,
                        arrowX, arrowY,
                        0, 0,
                        16, progress,
                        16, 16
                );
            }
        }

    }

}