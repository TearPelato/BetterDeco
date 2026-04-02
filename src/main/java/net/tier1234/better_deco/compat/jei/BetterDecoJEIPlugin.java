package net.tier1234.better_deco.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.resources.Identifier;
import net.tier1234.better_deco.util.Constants;

import java.text.DecimalFormat;

@JeiPlugin
public class BetterDecoJEIPlugin implements IModPlugin {
    public static final DecimalFormat FORMATTER = new DecimalFormat("0.##s");


    @Override
    public Identifier getPluginUid() {
        return Constants.id("jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        IModPlugin.super.registerCategories(registration);
    }


    public static Font getFont()
    {
        return Minecraft.getInstance().font;
    }
}
