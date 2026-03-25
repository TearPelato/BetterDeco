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
            Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID, "textures/gui/crate/crate.png");

    private int GUIimageWidht = this.imageWidth;
    private int GUIimageHeight = this.imageHeight;

    public CrateScreen(CrateMenu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        GUIimageWidht = 212;
        GUIimageHeight = 234;
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
        super.extractBackground(graphics, mouseX, mouseY, a);
        int x = (width - GUIimageWidht) / 2;
        int y = (height - GUIimageHeight) / 2;


        graphics.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0, GUIimageWidht,GUIimageHeight,212,234 );
    }

    @Override
    public void extractContents(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float partialTicks) {
        super.extractContents(graphics, mouseX, mouseY, partialTicks);
        this.extractTooltip(graphics, mouseX, mouseY);
    }

    @Override
    protected void extractLabels(GuiGraphicsExtractor graphics, int xm, int ym) {
        graphics.text(this.font, this.title, this.titleLabelX - 18, this.titleLabelY - 34, -12566464, false);
        graphics.text(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY + 34, -12566464, false);
    }

}
