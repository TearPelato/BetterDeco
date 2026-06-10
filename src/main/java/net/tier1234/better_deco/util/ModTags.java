package net.tier1234.better_deco.util;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tier1234.better_deco.BetterDeco;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> OVEN = createTag("OVEN");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID, name));
        }
    }
    public static class Items {

        public static final TagKey<Item> FREEZER_FUEL = createTag("freezer_fuel");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(BetterDeco.MOD_ID, name));
        }
    }
}