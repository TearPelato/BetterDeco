package net.tier1234.better_deco.util;

import net.minecraft.resources.ResourceLocation;
import net.tier1234.better_deco.BetterDeco;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants
{
    public static final String MOD_ID = "better_deco";
    public static final String MOD_NAME = "Better Deco";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public ResourceLocation id (String name) {
        return ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,name);
    }
}
