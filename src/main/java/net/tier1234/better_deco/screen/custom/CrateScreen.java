package net.tier1234.better_deco.screen.custom;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;
import net.tier1234.better_deco.BetterDeco;


public class CrateScreen extends AbstractContainerScreen<CrateMenu> {

    public static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/crate/crate_1.png");


    public CrateScreen(CrateMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
    }


  /*  @Override
    protected void renderBg(GuiGraphicsExtractor GuiGraphicsExtractor, float pPartialTick, int pMouseX, int pMouseY) {

        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;


        GuiGraphicsExtractor.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, 212,234,212,234 );
    }
    @Override
    public void render(GuiGraphicsExtractor pGuiGraphicsExtractor, int pMouseX, int pMouseY, float pPartialTick) {
        super.render(pGuiGraphicsExtractor, pMouseX, pMouseY, pPartialTick);
        this.renderTooltip(pGuiGraphicsExtractor, pMouseX, pMouseY);
    }

    protected void renderLabels(GuiGraphicsExtractor GuiGraphicsExtractor, int mouseX, int mouseY) {
        GuiGraphicsExtractor.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, -12566464, false);
    }

*/
}
