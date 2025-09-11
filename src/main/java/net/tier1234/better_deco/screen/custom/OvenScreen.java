package net.tier1234.better_deco.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;


public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
    private static final ResourceLocation GUI_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/oven/oven.png");
    private static final ResourceLocation ARROW_TEXTURE =
            ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress_3.png");


    public OvenScreen(OvenMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176;
        this.imageHeight = 184;
    }


    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int pMouseX, int pMouseY) {
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.drawString(this.font, this.playerInventoryTitle, 7, 91, 4210752, false);
        guiGraphics.drawString(this.font, this.title, 69, 5, 4210752, false);
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float v, int i, int i1) {


        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        guiGraphics.blit(RenderType.GUI_TEXTURED,GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256,256);

        renderProgressArrows(guiGraphics, x, y);
    }

    private void renderProgressArrows(GuiGraphics gui, int x, int y) {
        for (int i = 0; i < 3; i++) {
            int progress = menu.getScaledArrowProgress(i);

            if (progress > 0) {
                int arrowHeight = 16;

                int arrowX = x + 60 + i * 18;
                int arrowY = y + 36;

                gui.blit(RenderType.GUI_TEXTURED,ARROW_TEXTURE,
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
}