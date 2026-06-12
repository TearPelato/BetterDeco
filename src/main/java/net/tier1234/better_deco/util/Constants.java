package net.tier1234.better_deco.util;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants
{
    public static final String MOD_ID = "better_deco";
    public static final String MOD_NAME = "Better Deco";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id (String path){
        return Identifier.fromNamespaceAndPath(MOD_ID,path);
    }

    public static MutableComponent translationUtil(String category, String path, Object ... params){
        return Component.translatable(String.format("%s.%s.%s", category, Constants.MOD_ID, path), params);
    }

}
