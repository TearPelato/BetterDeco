package net.tier1234.better_deco.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;


public class MicrowaveScreen extends AbstractContainerScreen<MicrowaveMenu> {
    private static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/microwave/growth_chamber_gui.png");
    private static final Identifier ARROW_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID,"textures/gui/arrow_progress.png");

    public MicrowaveScreen(MicrowaveMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);    }


/*
    @Override
    protected void renderBg(GuiGraphicsExtractor GuiGraphicsExtractor, float v, int i, int i1) {

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, imageWidth, imageHeight, 256, 256);

        renderProgressArrow(GuiGraphicsExtractor, x, y);
    }

    private void renderProgressArrow(GuiGraphicsExtractor GuiGraphicsExtractor, int x, int y) {
        if(menu.isCrafting()) {
            GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED,ARROW_TEXTURE,x + 73, y + 35, 0, 0, menu.getScaledArrowProgress(), 16, 24, 16);
        }
    }

    @Override
    public void render(GuiGraphicsExtractor pGuiGraphicsExtractor, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphicsExtractor, pMouseX, pMouseY, pPartialTick);
        this.renderTooltip(pGuiGraphicsExtractor, pMouseX, pMouseY);
    }
*/
}
