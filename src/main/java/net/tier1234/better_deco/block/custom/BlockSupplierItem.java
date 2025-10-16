package net.tier1234.better_deco.block.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Map;
import java.util.function.Supplier;

public class BlockSupplierItem extends BlockItem
{
    public final Block block;
    public final Supplier<Block> supplier;

    public BlockSupplierItem(Item.Properties properties, Block block, Supplier<Block> supplier)
    {
        super(block, properties);
        this.block = block;
        this.supplier = supplier;
    }


    @Override
    public Block getBlock()
    {
        return this.supplier.get();
    }

    @Override
    public void registerBlocks(Map<Block, Item> map, Item item)
    {
        map.put(this.block, item);
    }
}
