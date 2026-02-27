package net.tier1234.better_deco.item.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.tier1234.better_deco.init.ModBlocks;

import java.util.function.Supplier;
@Deprecated(forRemoval = true)
public class ChiselItem extends Item {
    Supplier<BiMap<Block, Block>> CHISEL_MAP = Suppliers.memoize(
            () -> ImmutableBiMap.<Block, Block>builder()
                    //Stones
                    .put(Blocks.STONE, Blocks.STONE_BRICKS)
                    .put(Blocks.STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS)
                    .put(Blocks.CHISELED_STONE_BRICKS, Blocks.STONE)

                    .put(Blocks.DEEPSLATE, Blocks.COBBLED_DEEPSLATE)
                    .put(Blocks.COBBLED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE)
                    .put(Blocks.POLISHED_DEEPSLATE, Blocks.DEEPSLATE_BRICKS)
                    .put(Blocks.DEEPSLATE_BRICKS, Blocks.DEEPSLATE_TILES)
                    .put(Blocks.DEEPSLATE_TILES, Blocks.CHISELED_DEEPSLATE)
                    .put(Blocks.CHISELED_DEEPSLATE, Blocks.DEEPSLATE)

                    .put(Blocks.END_STONE, Blocks.END_STONE_BRICKS)
                    .put(Blocks.END_STONE_BRICKS, Blocks.END_STONE)

                    .put(Blocks.ANDESITE, ModBlocks.RAW_ANDESITE.get())
                    .put(ModBlocks.RAW_ANDESITE.get(),Blocks.POLISHED_ANDESITE)
                    .put(Blocks.POLISHED_ANDESITE,ModBlocks.ANDESITE_BRICKS.get())
                    .put(ModBlocks.ANDESITE_BRICKS.get(), ModBlocks.ANDESITE_ARRAY_BRICKS.get())
                    .put(ModBlocks.ANDESITE_ARRAY_BRICKS.get(),ModBlocks.ANDESITE_MIXED_BRICKS.get())
                    .put(ModBlocks.ANDESITE_MIXED_BRICKS.get(),ModBlocks.ANDESITE_MOSAIC_BRICKS.get())
                    .put(ModBlocks.ANDESITE_MOSAIC_BRICKS.get(),Blocks.ANDESITE)

                    .put(Blocks.DIORITE, ModBlocks.RAW_DIORITE.get())
                    .put(ModBlocks.RAW_DIORITE.get(),Blocks.POLISHED_DIORITE)
                    .put(Blocks.POLISHED_DIORITE,ModBlocks.DIORITE_BRICKS.get())
                    .put(ModBlocks.DIORITE_BRICKS.get(), ModBlocks.DIORITE_ARRAY_BRICKS.get())
                    .put(ModBlocks.DIORITE_ARRAY_BRICKS.get(),ModBlocks.DIORITE_MIXED_BRICKS.get())
                    .put(ModBlocks.DIORITE_MIXED_BRICKS.get(),ModBlocks.DIORITE_MOSAIC_BRICKS.get())
                    .put(ModBlocks.DIORITE_MOSAIC_BRICKS.get(),Blocks.DIORITE)

                    .put(Blocks.GRANITE, ModBlocks.RAW_GRANITE.get())
                    .put(ModBlocks.RAW_GRANITE.get(),Blocks.POLISHED_GRANITE)
                    .put(Blocks.POLISHED_GRANITE,ModBlocks.GRANITE_BRICKS.get())
                    .put(ModBlocks.GRANITE_BRICKS.get(), ModBlocks.GRANITE_ARRAY_BRICKS.get())
                    .put(ModBlocks.GRANITE_ARRAY_BRICKS.get(),ModBlocks.GRANITE_MIXED_BRICKS.get())
                    .put(ModBlocks.GRANITE_MIXED_BRICKS.get(),ModBlocks.GRANITE_MOSAIC_BRICKS.get())
                    .put(ModBlocks.GRANITE_MOSAIC_BRICKS.get(),Blocks.GRANITE)

                    //Woods
                    .put(Blocks.OAK_PLANKS, ModBlocks.OAK_VERTICAL_PLANKS.get())
                    .put(ModBlocks.OAK_VERTICAL_PLANKS.get(), ModBlocks.OAK_PLANKS_BRICKS.get())
                    .put(ModBlocks.OAK_PLANKS_BRICKS.get(), ModBlocks.OAK_SOFT_BRICKS.get())
                    .put(ModBlocks.OAK_SOFT_BRICKS.get(), ModBlocks.OAK_PLANKS_PILLAR.get())
                    .put(ModBlocks.OAK_PLANKS_PILLAR.get(), ModBlocks.OAK_PILED_PLANKS.get())
                    .put(ModBlocks.OAK_PILED_PLANKS.get(), ModBlocks.OAK_POLISHED_PLANKS.get())
                    .put(ModBlocks.OAK_POLISHED_PLANKS.get(), Blocks.OAK_PLANKS)

                    .put(Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_VERTICAL_PLANKS.get())
                    .put(ModBlocks.SPRUCE_VERTICAL_PLANKS.get(), ModBlocks.SPRUCE_PLANKS_BRICKS.get())
                    .put(ModBlocks.SPRUCE_PLANKS_BRICKS.get(), ModBlocks.SPRUCE_SOFT_BRICKS.get())
                    .put(ModBlocks.SPRUCE_SOFT_BRICKS.get(), ModBlocks.SPRUCE_PLANKS_PILLAR.get())
                    .put(ModBlocks.SPRUCE_PLANKS_PILLAR.get(), ModBlocks.SPRUCE_PILED_PLANKS.get())
                    .put(ModBlocks.SPRUCE_PILED_PLANKS.get(), ModBlocks.SPRUCE_POLISHED_PLANKS.get())
                    .put(ModBlocks.SPRUCE_POLISHED_PLANKS.get(), Blocks.SPRUCE_PLANKS)

                    .put(Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_VERTICAL_PLANKS.get())
                    .put(ModBlocks.BIRCH_VERTICAL_PLANKS.get(), ModBlocks.BIRCH_PLANKS_BRICKS.get())
                    .put(ModBlocks.BIRCH_PLANKS_BRICKS.get(), ModBlocks.BIRCH_SOFT_BRICKS.get())
                    .put(ModBlocks.BIRCH_SOFT_BRICKS.get(), ModBlocks.BIRCH_PLANKS_PILLAR.get())
                    .put(ModBlocks.BIRCH_PLANKS_PILLAR.get(), ModBlocks.BIRCH_PILED_PLANKS.get())
                    .put(ModBlocks.BIRCH_PILED_PLANKS.get(), ModBlocks.BIRCH_POLISHED_PLANKS.get())
                    .put(ModBlocks.BIRCH_POLISHED_PLANKS.get(), Blocks.BIRCH_PLANKS)

                    .put(Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_VERTICAL_PLANKS.get())
                    .put(ModBlocks.JUNGLE_VERTICAL_PLANKS.get(), ModBlocks.JUNGLE_PLANKS_BRICKS.get())
                    .put(ModBlocks.JUNGLE_PLANKS_BRICKS.get(), ModBlocks.JUNGLE_SOFT_BRICKS.get())
                    .put(ModBlocks.JUNGLE_SOFT_BRICKS.get(), ModBlocks.JUNGLE_PLANKS_PILLAR.get())
                    .put(ModBlocks.JUNGLE_PLANKS_PILLAR.get(), ModBlocks.JUNGLE_PILED_PLANKS.get())
                    .put(ModBlocks.JUNGLE_PILED_PLANKS.get(), ModBlocks.JUNGLE_POLISHED_PLANKS.get())
                    .put(ModBlocks.JUNGLE_POLISHED_PLANKS.get(), Blocks.JUNGLE_PLANKS)

                    .put(Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_VERTICAL_PLANKS.get())
                    .put(ModBlocks.DARK_OAK_VERTICAL_PLANKS.get(), ModBlocks.DARK_OAK_PLANKS_BRICKS.get())
                    .put(ModBlocks.DARK_OAK_PLANKS_BRICKS.get(), ModBlocks.DARK_OAK_SOFT_BRICKS.get())
                    .put(ModBlocks.DARK_OAK_SOFT_BRICKS.get(), ModBlocks.DARK_OAK_PLANKS_PILLAR.get())
                    .put(ModBlocks.DARK_OAK_PLANKS_PILLAR.get(), ModBlocks.DARK_OAK_PILED_PLANKS.get())
                    .put(ModBlocks.DARK_OAK_PILED_PLANKS.get(), ModBlocks.DARK_OAK_POLISHED_PLANKS.get())
                    .put(ModBlocks.DARK_OAK_POLISHED_PLANKS.get(), Blocks.DARK_OAK_PLANKS)

                    .put(Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_VERTICAL_PLANKS.get())
                    .put(ModBlocks.MANGROVE_VERTICAL_PLANKS.get(), ModBlocks.MANGROVE_PLANKS_BRICKS.get())
                    .put(ModBlocks.MANGROVE_PLANKS_BRICKS.get(), ModBlocks.MANGROVE_SOFT_BRICKS.get())
                    .put(ModBlocks.MANGROVE_SOFT_BRICKS.get(), ModBlocks.MANGROVE_PLANKS_PILLAR.get())
                    .put(ModBlocks.MANGROVE_PLANKS_PILLAR.get(), ModBlocks.MANGROVE_PILED_PLANKS.get())
                    .put(ModBlocks.MANGROVE_PILED_PLANKS.get(), ModBlocks.MANGROVE_POLISHED_PLANKS.get())
                    .put(ModBlocks.MANGROVE_POLISHED_PLANKS.get(), Blocks.MANGROVE_PLANKS)

                    .put(Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_VERTICAL_PLANKS.get())
                    .put(ModBlocks.ACACIA_VERTICAL_PLANKS.get(), ModBlocks.ACACIA_PLANKS_BRICKS.get())
                    .put(ModBlocks.ACACIA_PLANKS_BRICKS.get(), ModBlocks.ACACIA_SOFT_BRICKS.get())
                    .put(ModBlocks.ACACIA_SOFT_BRICKS.get(), ModBlocks.ACACIA_PLANKS_PILLAR.get())
                    .put(ModBlocks.ACACIA_PLANKS_PILLAR.get(), ModBlocks.ACACIA_PILED_PLANKS.get())
                    .put(ModBlocks.ACACIA_PILED_PLANKS.get(), ModBlocks.ACACIA_POLISHED_PLANKS.get())
                    .put(ModBlocks.ACACIA_POLISHED_PLANKS.get(), Blocks.ACACIA_PLANKS)

                    .put(Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_VERTICAL_PLANKS.get())
                    .put(ModBlocks.CHERRY_VERTICAL_PLANKS.get(), ModBlocks.CHERRY_PLANKS_BRICKS.get())
                    .put(ModBlocks.CHERRY_PLANKS_BRICKS.get(), ModBlocks.CHERRY_SOFT_BRICKS.get())
                    .put(ModBlocks.CHERRY_SOFT_BRICKS.get(), ModBlocks.CHERRY_PLANKS_PILLAR.get())
                    .put(ModBlocks.CHERRY_PLANKS_PILLAR.get(), ModBlocks.CHERRY_PILED_PLANKS.get())
                    .put(ModBlocks.CHERRY_PILED_PLANKS.get(), ModBlocks.CHERRY_POLISHED_PLANKS.get())
                    .put(ModBlocks.CHERRY_POLISHED_PLANKS.get(), Blocks.CHERRY_PLANKS)

                    .put(Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_VERTICAL_PLANKS.get())
                    .put(ModBlocks.BAMBOO_VERTICAL_PLANKS.get(), ModBlocks.BAMBOO_PLANKS_BRICKS.get())
                    .put(ModBlocks.BAMBOO_PLANKS_BRICKS.get(), ModBlocks.BAMBOO_SOFT_BRICKS.get())
                    .put(ModBlocks.BAMBOO_SOFT_BRICKS.get(), ModBlocks.BAMBOO_PLANKS_PILLAR.get())
                    .put(ModBlocks.BAMBOO_PLANKS_PILLAR.get(), ModBlocks.BAMBOO_PILED_PLANKS.get())
                    .put(ModBlocks.BAMBOO_PILED_PLANKS.get(), ModBlocks.BAMBOO_POLISHED_PLANKS.get())
                    .put(ModBlocks.BAMBOO_POLISHED_PLANKS.get(), Blocks.BAMBOO_PLANKS)

                    .put(Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_VERTICAL_PLANKS.get())
                    .put(ModBlocks.CRIMSON_VERTICAL_PLANKS.get(), ModBlocks.CRIMSON_PLANKS_BRICKS.get())
                    .put(ModBlocks.CRIMSON_PLANKS_BRICKS.get(), ModBlocks.CRIMSON_SOFT_BRICKS.get())
                    .put(ModBlocks.CRIMSON_SOFT_BRICKS.get(), ModBlocks.CRIMSON_PLANKS_PILLAR.get())
                    .put(ModBlocks.CRIMSON_PLANKS_PILLAR.get(), ModBlocks.CRIMSON_PILED_PLANKS.get())
                    .put(ModBlocks.CRIMSON_PILED_PLANKS.get(), ModBlocks.CRIMSON_POLISHED_PLANKS.get())
                    .put(ModBlocks.CRIMSON_POLISHED_PLANKS.get(), Blocks.CRIMSON_PLANKS)

                    .put(Blocks.WARPED_PLANKS, ModBlocks.WARPED_VERTICAL_PLANKS.get())
                    .put(ModBlocks.WARPED_VERTICAL_PLANKS.get(), ModBlocks.WARPED_PLANKS_BRICKS.get())
                    .put(ModBlocks.WARPED_PLANKS_BRICKS.get(), ModBlocks.WARPED_SOFT_BRICKS.get())
                    .put(ModBlocks.WARPED_SOFT_BRICKS.get(), ModBlocks.WARPED_PLANKS_PILLAR.get())
                    .put(ModBlocks.WARPED_PLANKS_PILLAR.get(), ModBlocks.WARPED_PILED_PLANKS.get())
                    .put(ModBlocks.WARPED_PILED_PLANKS.get(), ModBlocks.WARPED_POLISHED_PLANKS.get())
                    .put(ModBlocks.WARPED_POLISHED_PLANKS.get(), Blocks.WARPED_PLANKS)



                    .build()
    );


    public ChiselItem(Properties properties) {
        super(properties);
    }


    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(CHISEL_MAP.get().containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), CHISEL_MAP.get().get(clickedBlock).defaultBlockState());

                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                        item -> context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, context.getClickedPos(), SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
