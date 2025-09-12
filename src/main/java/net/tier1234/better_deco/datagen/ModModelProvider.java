package net.tier1234.better_deco.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.item.ModItems;

import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, BetterDeco.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* BLOCKS */

    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().filter(x -> !x.is(ModBlocks.PEDESTAL) && !x.is(ModBlocks.OAK_CHAIR));
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream().filter(x -> x.get() != ModBlocks.PEDESTAL.asItem() && x.get() != ModBlocks.OAK_CHAIR.asItem()
                && !x.is(ModItems.IRON_CHISEL));
    }
}
