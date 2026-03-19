package net.tier1234.better_deco.screen.custom;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;

public class FreezerScreen extends AbstractContainerScreen<FreezerMenu> {
    private static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/freezer/freezer.png");

    public FreezerScreen(FreezerMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
       /* this.imageWidth = 176;
        this.imageHeight = 166;*/
    }

   /* ++@Override
    protected void renderLabels(GuiGraphicsExtractor GuiGraphicsExtractor, int mouseX, int mouseY) {
        GuiGraphicsExtractor.drawString(this.font, this.playerInventoryTitle, 8, this.imageHeight - 94, 4210752, false);
        GuiGraphicsExtractor.drawString(this.font, this.title, 60, 6, 4210752, false);
    }

    @Override
    protected void renderBg(GuiGraphicsExtractor GuiGraphicsExtractor, float partialTick, int mouseX, int mouseY) {
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;

        GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, imageWidth,imageHeight, 256,256);
    }

    @Override
    public void render(GuiGraphicsExtractor GuiGraphicsExtractor, int mouseX, int mouseY, float partialTick) {
        super.render(GuiGraphicsExtractor, mouseX, mouseY, partialTick);
        this.renderTooltip(GuiGraphicsExtractor, mouseX, mouseY);
    }*/
}
