package net.tier1234.better_deco.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Items
    {
        public static final TagKey<Item> FURNITURE = tag("furniture");
        public static final TagKey<Item> UTILITIES = tag("utilities");
        public static final TagKey<Item> ITEMS = tag("items");
        public static final TagKey<Item> BUILDINGS = tag("buildings");


        private static TagKey<Item> tag(String name)
        {
            return TagKey.create(Registries.ITEM, Utils.resource(name));
        }

        public static TagKey<Item> common(String name)
        {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Blocks
    {
        public static final TagKey<Block> TUCKABLE = tag("tuckable");

        private static TagKey<Block> tag(String name)
        {
            return TagKey.create(Registries.BLOCK, Utils.resource(name));
        }

        private static TagKey<Block> common(String name)
        {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}