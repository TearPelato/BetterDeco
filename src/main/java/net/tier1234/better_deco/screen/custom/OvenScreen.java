package net.tier1234.better_deco.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.render.EnergyDisplayTooltipArea;
import net.tier1234.better_deco.util.MouseUtil;

import java.util.Optional;

public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
    private static final ResourceLocation GUI_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/oven/oven_gui.png");
    private static final ResourceLocation ARROW_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress_3.png");
    private EnergyDisplayTooltipArea energyInfoArea;

    public OvenScreen(OvenMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 175;
        this.imageHeight = 183;
        assignEnergyInfoArea();
    }

    private void assignEnergyInfoArea() {
        energyInfoArea = new EnergyDisplayTooltipArea(((width - imageWidth) / 2) + 156,
                ((height - imageHeight) / 2 ) + 9, menu.blockEntity.getEnergyStorage(null), 8, 48);
    }

    private void renderEnergyAreaTooltip(GuiGraphics guiGraphics, int pMouseX, int pMouseY, int x, int y) {
        if(isMouseAboveArea(pMouseX, pMouseY, x, y, 156, 11, 8, 48)) {
            guiGraphics.renderTooltip(this.font, energyInfoArea.getTooltips(),
                    Optional.empty(), pMouseX - x, pMouseY - y);
        }
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int pMouseX, int pMouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        renderEnergyAreaTooltip(guiGraphics, pMouseX, pMouseY, x, y);


        guiGraphics.drawString(this.font, this.playerInventoryTitle, 7, 91, 4210752, false);
        guiGraphics.drawString(this.font, this.title, 69, 5, 4210752, false);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight);

        renderProgressArrows(guiGraphics, x, y);
        energyInfoArea.render(guiGraphics);
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

    @Override
    public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
        this.renderTooltip(pGuiGraphics, pMouseX, pMouseY);
    }

    public static boolean isMouseAboveArea(int pMouseX, int pMouseY, int x, int y, int offsetX, int offsetY, int width, int height) {
        return MouseUtil.isMouseOver(pMouseX, pMouseY, x + offsetX, y + offsetY, width, height);
    }
}