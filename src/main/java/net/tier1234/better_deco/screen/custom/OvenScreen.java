package net.tier1234.better_deco.screen.custom;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;


public class OvenScreen extends AbstractContainerScreen<OvenMenu> {
    private static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/oven/oven.png");
    private static final Identifier ARROW_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress_3.png");


    public OvenScreen(OvenMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
       /* this.imageWidth = 176;
        this.imageHeight = 184;*/
    }


   /* protected void renderLabels(GuiGraphicsExtractor GuiGraphicsExtractor, int mouseX, int mouseY) {
        GuiGraphicsExtractor.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, -12566464, false);
    }


    @Override
    protected void renderBg(GuiGraphicsExtractor GuiGraphicsExtractor, float v, int i, int i1) {


        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED,GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256,256);

        renderProgressArrows(GuiGraphicsExtractor, x, y);
    }

    private void renderProgressArrows(GuiGraphicsExtractor gui, int x, int y) {
        for (int i = 0; i < 3; i++) {
            int progress = menu.getScaledArrowProgress(i);

            if (progress > 0) {
                int arrowHeight = 16;

                int arrowX = x + 60 + i * 18;
                int arrowY = y + 36;

                gui.blit(RenderPipelines.GUI_TEXTURED,ARROW_TEXTURE,
                        arrowX, arrowY,
                        0, 0,
                        16, progress,
                        16, 16
                );
            }
        }
    }

    @Override
    public void render(GuiGraphicsExtractor pGuiGraphicsExtractor, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphicsExtractor, pMouseX, pMouseY, pPartialTick);
        this.renderTooltip(pGuiGraphicsExtractor, pMouseX, pMouseY);
    }*/
}