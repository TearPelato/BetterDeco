package net.tier1234.better_deco.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.util.Constants;

public class TecqueScreen extends AbstractContainerScreen<TecqueMenu> {
    private static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "textures/gui/pedestal/pedestal_gui_new.png");

    public TecqueScreen(TecqueMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }

   /* @Override
   protected void renderBg(GuiGraphicsExtractor GuiGraphicsExtractor, float pPartialTick, int pMouseX, int pMouseY) {

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED,GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight,256,256);
    }

    @Override
    public void render(GuiGraphicsExtractor pGuiGraphicsExtractor, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphicsExtractor, pMouseX, pMouseY, pPartialTick);
        this.renderTooltip(pGuiGraphicsExtractor, pMouseX, pMouseY);
    }*/
}