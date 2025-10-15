package net.tier1234.better_deco.block.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class BlockSupplierItem extends BlockItem {
    private final Supplier<Block> blockSupplier;

    public BlockSupplierItem(Supplier<Block> blockSupplier, Properties properties, Block staticBlock) {
        super(staticBlock, properties);
        this.blockSupplier = blockSupplier;
    }


    @Override
    public Block getBlock() {
        return this.blockSupplier.get();
    }
}
