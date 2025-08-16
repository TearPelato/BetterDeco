package net.tier1234.better_deco.block;



import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.custom.*;
import net.tier1234.better_deco.block.custom.ChainBlock;
import net.tier1234.better_deco.item.ModItems;
import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BetterDeco.MOD_ID);



      //TEST
    public static final  DeferredBlock<Block> RED_DIGITAL_CLOCK = registerBlock("red_digital_clock",
              ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT)));



public static final DeferredBlock<Block> WALL_LANTERN = registerBlock("wall_lantern",
      ()-> new WallLanternBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.LANTERN).lightLevel(state -> 15)));


    //DECORATIONS
    //DECO
public static final DeferredBlock<Block> BIG_CHAIN = registerBlock("big_chain",
              ()-> new ChainBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion().sound(SoundType.CHAIN)
              ));
//SHELFS
public static final DeferredBlock<Block> OAK_SHELF = registerBlock("oak_shelf",
        ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SHELF = registerBlock("spruce_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SHELF = registerBlock("birch_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SHELF = registerBlock("jungle_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SHELF = registerBlock("acacia_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SHELF = registerBlock("mangrove_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SHELF = registerBlock("cherry_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SHELF = registerBlock("bamboo_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_SHELF = registerBlock("crimson_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SHELF = registerBlock("warped_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD)));


//EXTRA BUILDINGS

    //VERTICAL SLABS
    public static final DeferredBlock<Block> OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_VERTICAL_SLAB = registerBlock("cherry_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            ()-> new VerticalSlabBlock(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));




//STONES
    //Andesite
public static final DeferredBlock<Block> ANDESITE_ARRAY_BRICKS = registerBlock("andesite_array_bricks",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MOSAIC_BRICKS = registerBlock("andesite_mosaic_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MIXED_BRICKS = registerBlock("andesite_mixed_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_ANDESITE = registerBlock("raw_andesite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));






//WOOD


//Extra wood variants
    //Oak
public static final DeferredBlock<Block> OAK_VERTICAL_PLANKS = registerBlock("oak_vertical_planks",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_PILED_PLANKS = registerBlock("oak_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_POLISHED_PLANKS = registerBlock("oak_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));







    //Spruce
    public static final DeferredBlock<Block> SPRUCE_VERTICAL_PLANKS = registerBlock("spruce_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PILED_PLANKS = registerBlock("spruce_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_POLISHED_PLANKS = registerBlock("spruce_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));




    //Birch
    public static final DeferredBlock<Block> BIRCH_VERTICAL_PLANKS = registerBlock("birch_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PILED_PLANKS = registerBlock("birch_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_POLISHED_PLANKS = registerBlock("birch_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Jungle
    public static final DeferredBlock<Block> JUNGLE_VERTICAL_PLANKS = registerBlock("jungle_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PILED_PLANKS = registerBlock("jungle_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_POLISHED_PLANKS = registerBlock("jungle_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Acacia
    public static final DeferredBlock<Block> ACACIA_VERTICAL_PLANKS = registerBlock("acacia_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PILED_PLANKS = registerBlock("acacia_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_POLISHED_PLANKS = registerBlock("acacia_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Dark Oak
    public static final DeferredBlock<Block> DARK_OAK_VERTICAL_PLANKS = registerBlock("dark_oak_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PILED_PLANKS = registerBlock("dark_oak_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_POLISHED_PLANKS = registerBlock("dark_oak_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Mangrove
    public static final DeferredBlock<Block> MANGROVE_VERTICAL_PLANKS = registerBlock("mangrove_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PILED_PLANKS = registerBlock("mangrove_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_POLISHED_PLANKS = registerBlock("mangrove_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Cherry
    public static final DeferredBlock<Block> CHERRY_VERTICAL_PLANKS = registerBlock("cherry_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PILED_PLANKS = registerBlock("cherry_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_POLISHED_PLANKS = registerBlock("cherry_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Bamboo
    public static final DeferredBlock<Block> BAMBOO_VERTICAL_PLANKS = registerBlock("bamboo_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PILED_PLANKS = registerBlock("bamboo_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_POLISHED_PLANKS = registerBlock("bamboo_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Crimson
    public static final DeferredBlock<Block> CRIMSON_VERTICAL_PLANKS = registerBlock("crimson_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PILED_PLANKS = registerBlock("crimson_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_POLISHED_PLANKS = registerBlock("crimson_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Warped
    public static final DeferredBlock<Block> WARPED_VERTICAL_PLANKS = registerBlock("warped_vertical_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PILED_PLANKS = registerBlock("warped_piled_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_POLISHED_PLANKS = registerBlock("warped_polished_planks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



























    //Bricks
    public static final DeferredBlock<Block> OAK_PLANKS_BRICKS = registerBlock("oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_BRICKS = registerBlock("spruce_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_BRICKS = registerBlock("dark_oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_BRICKS = registerBlock("birch_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_BRICKS = registerBlock("mangrove_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_BRICKS = registerBlock("cherry_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_BRICKS = registerBlock("bamboo_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_BRICKS = registerBlock("crimson_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PLANKS_BRICKS = registerBlock("warped_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PLANKS_BRICKS = registerBlock("acacia_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_BRICKS = registerBlock("jungle_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Pillars
    public static final DeferredBlock<Block> ACACIA_PLANKS_PILLAR = registerBlock("acacia_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_PILLAR = registerBlock("birch_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_PILLAR = registerBlock("bamboo_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_PILLAR = registerBlock("cherry_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_PILLAR = registerBlock("crimson_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_PILLAR = registerBlock("spruce_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> OAK_PLANKS_PILLAR = registerBlock("oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> WARPED_PLANKS_PILLAR = registerBlock("warped_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_PILLAR = registerBlock("jungle_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_PILLAR = registerBlock("mangrove_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_PILLAR = registerBlock("dark_oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR) .strength(2f)));




//Soft Bricks
public static final DeferredBlock<Block> OAK_SOFT_BRICKS = registerBlock("oak_soft_bricks",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SOFT_BRICKS = registerBlock("dark_oak_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SOFT_BRICKS = registerBlock("spruce_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SOFT_BRICKS = registerBlock("birch_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SOFT_BRICKS = registerBlock("bamboo_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SOFT_BRICKS = registerBlock("cherry_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SOFT_BRICKS = registerBlock("mangrove_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SOFT_BRICKS = registerBlock("jungle_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SOFT_BRICKS = registerBlock("acacia_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_SOFT_BRICKS = registerBlock("crimson_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SOFT_BRICKS = registerBlock("warped_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Barrels
    public static final DeferredBlock<Block> OAK_BARREL = registerBlock("oak_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BIRCH_BARREL = registerBlock("birch_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ACACIA_BARREL = registerBlock("acacia_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> JUNGLE_BARREL = registerBlock("jungle_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MANGROVE_BARREL = registerBlock("mangrove_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHERRY_BARREL = registerBlock("cherry_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BAMBOO_BARREL = registerBlock("bamboo_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRIMSON_BARREL = registerBlock("crimson_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WARPED_BARREL = registerBlock("warped_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));



//Tests
public static final DeferredBlock<Block> ENCASED_ANDESITE_BRICKS = registerBlock("encased_andesite_bricks",
        ()-> new ConnectedTextureBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));


    //Furnitures
    //Chairs
public static final DeferredBlock<Block> BIRCH_CHAIR = registerBlock("birch_chair",
        () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> OAK_CHAIR = registerBlock("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CHAIR = registerBlock("mangrove_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CHAIR = registerBlock("warped_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CHAIR = registerBlock("crimson_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CHAIR = registerBlock("acacia_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CHAIR = registerBlock("jungle_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CHAIR = registerBlock("cherry_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CHAIR = registerBlock("bamboo_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    //Counters

    public static final DeferredBlock<Block> OAK_KITCHEN_COUNTER = registerBlock("oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_COUNTER = registerBlock("spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_COUNTER = registerBlock("birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_COUNTER = registerBlock("jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_COUNTER = registerBlock("acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_COUNTER = registerBlock("dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_COUNTER = registerBlock("mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_COUNTER = registerBlock("cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_COUNTER = registerBlock("bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_COUNTER = registerBlock("crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_COUNTER = registerBlock("warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

            //Stripped Counters Variant

    public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_COUNTER = registerBlock("stripped_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_COUNTER = registerBlock("stripped_spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_COUNTER = registerBlock("stripped_birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_COUNTER = registerBlock("stripped_jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_COUNTER = registerBlock("stripped_acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_COUNTER = registerBlock("stripped_dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_COUNTER = registerBlock("stripped_mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_COUNTER = registerBlock("stripped_cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_COUNTER = registerBlock("stripped_bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_COUNTER = registerBlock("stripped_crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_COUNTER = registerBlock("stripped_warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));



  //Drawers
  public static final DeferredBlock<Block> OAK_KITCHEN_DRAWER = registerBlock("oak_kitchen_drawer",
          ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_DRAWER = registerBlock("spruce_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_DRAWER = registerBlock("birch_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_DRAWER = registerBlock("jungle_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_DRAWER = registerBlock("acacia_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_DRAWER = registerBlock("dark_oak_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_DRAWER = registerBlock("mangrove_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_DRAWER = registerBlock("cherry_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_DRAWER = registerBlock("bamboo_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_DRAWER = registerBlock("crimson_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_DRAWER = registerBlock("warped_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

         //Stripped Variants
         public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_DRAWER = registerBlock("stripped_oak_kitchen_drawer",
                 ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_DRAWER = registerBlock("stripped_spruce_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_DRAWER = registerBlock("stripped_birch_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_DRAWER = registerBlock("stripped_jungle_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_DRAWER = registerBlock("stripped_acacia_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_DRAWER = registerBlock("stripped_dark_oak_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_DRAWER = registerBlock("stripped_mangrove_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_DRAWER = registerBlock("stripped_cherry_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_DRAWER = registerBlock("stripped_bamboo_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_DRAWER = registerBlock("stripped_crimson_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_DRAWER = registerBlock("stripped_warped_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));




    //Tables
    public static final DeferredBlock<Block> OAK_TABLE = registerBlock("oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_TABLE = registerBlock("spruce_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_TABLE = registerBlock("birch_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_TABLE = registerBlock("jungle_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_TABLE = registerBlock("acacia_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_TABLE = registerBlock("mangrove_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_TABLE = registerBlock("cherry_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_TABLE = registerBlock("bamboo_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_TABLE = registerBlock("crimson_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_TABLE = registerBlock("warped_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


    //Sofas
public static final DeferredBlock<Block> RED_SOFA = registerBlock("red_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_SOFA = registerBlock("orange_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_SOFA = registerBlock("blue_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_SOFA = registerBlock("cyan_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SOFA = registerBlock("light_blue_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_SOFA = registerBlock("purple_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_SOFA = registerBlock("magenta_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_SOFA = registerBlock("yellow_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREY_SOFA = registerBlock("grey_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GREY_SOFA = registerBlock("light_grey_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA = registerBlock("black_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WITHE_SOFA = registerBlock("white_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA = registerBlock("green_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_SOFA = registerBlock("lime_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_SOFA = registerBlock("pink_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_SOFA = registerBlock("brown_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
//Cabinet
public static final DeferredBlock<Block> OAK_CABINET = registerBlock("oak_cabinet",
        ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CABINET = registerBlock("spruce_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CABINET = registerBlock("birch_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CABINET = registerBlock("jungle_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CABINET = registerBlock("acacia_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CABINET = registerBlock("dark_oak_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CABINET = registerBlock("mangrove_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CABINET = registerBlock("cherry_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CABINET = registerBlock("bamboo_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CABINET = registerBlock("crimson_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CABINET = registerBlock("warped_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
//Stripped Variants
public static final DeferredBlock<Block> STRIPPED_OAK_CABINET = registerBlock("stripped_oak_cabinet",
        ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CABINET = registerBlock("stripped_spruce_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CABINET = registerBlock("stripped_birch_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CABINET = registerBlock("stripped_jungle_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CABINET = registerBlock("stripped_acacia_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CABINET = registerBlock("stripped_mangrove_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CABINET = registerBlock("stripped_dark_oak_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CABINET = registerBlock("stripped_cherry_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_CABINET = registerBlock("stripped_bamboo_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CABINET = registerBlock("stripped_crimson_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_CABINET = registerBlock("stripped_warped_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


//Pedestals

public static final DeferredBlock<Block> PEDESTAL = registerBlock("pedestal",
        ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_PEDESTAL = registerBlock("deepslate_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_PEDESTAL = registerBlock("deepslate_tile_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_PEDESTAL = registerBlock("blackstone_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));




//Bedside Cabinets
public static final DeferredBlock<Block> OAK_BEDSIDE = registerBlock("oak_bedside",
        ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_BEDSIDE = registerBlock("spruce_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_BEDSIDE = registerBlock("birch_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_BEDSIDE = registerBlock("jungle_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_BEDSIDE = registerBlock("acacia_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_BEDSIDE = registerBlock("mangrove_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_BEDSIDE = registerBlock("dark_oak_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_BEDSIDE = registerBlock("cherry_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_BEDSIDE = registerBlock("bamboo_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_BEDSIDE = registerBlock("crimson_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_BEDSIDE = registerBlock("warped_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));






//Crates
public static final DeferredBlock<Block> OAK_CRATE = registerBlock("oak_storage_crate",
        ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CRATE = registerBlock("spruce_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CRATE = registerBlock("birch_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CRATE = registerBlock("jungle_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CRATE = registerBlock("acacia_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CRATE = registerBlock("mangrove_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CRATE = registerBlock("dark_oak_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CRATE = registerBlock("cherry_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CRATE = registerBlock("bamboo_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CRATE = registerBlock("crimson_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CRATE = registerBlock("warped_storage_crate",
            ()-> new CrateBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));



//Sinks
public static final DeferredBlock<Block> OAK_SINK = registerBlock("oak_sink",
        () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_SINK = registerBlock("spruce_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_SINK = registerBlock("birch_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_SINK = registerBlock("jungle_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_SINK = registerBlock("acacia_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_SINK = registerBlock("mangrove_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_SINK = registerBlock("dark_oak_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_SINK = registerBlock("cherry_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_SINK = registerBlock("bamboo_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_SINK = registerBlock("crimson_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_SINK = registerBlock("warped_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


    //Stone Variants

    //Counter
public static final DeferredBlock<Block> STONE_COUNTER = registerBlock("stone_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_COUNTER = registerBlock("diorite_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_COUNTER = registerBlock("granite_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_COUNTER = registerBlock("blackstone_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_COUNTER = registerBlock("deepslate_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_COUNTER = registerBlock("deepslate_tiles_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));

    public static final DeferredBlock<Block> SPRUCE_DIORITE_COUNTER = registerBlock("spruce_diorite_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));

    //Drawers
    public static final DeferredBlock<Block> STONE_DRAWER = registerBlock("stone_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_DRAWER = registerBlock("granite_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_DRAWER = registerBlock("diorite_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_DRAWER = registerBlock("deepslate_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILES_DRAWER = registerBlock("deepslate_tiles_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_DRAWER = registerBlock("blackstone_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));



    //Cabinets
    public static final DeferredBlock<Block> STONE_CABINET = registerBlock("stone_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_CABINET = registerBlock("granite_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_CABINET = registerBlock("diorite_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_CABINET = registerBlock("deepslate_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILES_CABINET = registerBlock("deepslate_tiles_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_CABINET = registerBlock("blackstone_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));

    //STOOL
    public static final DeferredBlock<Block> RED_STOOL = registerBlock("red_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_STOOL = registerBlock("orange_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_STOOL = registerBlock("blue_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_STOOL = registerBlock("cyan_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_STOOL = registerBlock("light_blue_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_STOOL = registerBlock("purple_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_STOOL = registerBlock("magenta_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_STOOL = registerBlock("yellow_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREY_STOOL = registerBlock("grey_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GREY_STOOL = registerBlock("light_grey_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_STOOL = registerBlock("black_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WITHE_STOOL = registerBlock("white_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_STOOL = registerBlock("green_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_STOOL = registerBlock("lime_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_STOOL = registerBlock("pink_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_STOOL = registerBlock("brown_stool",
            ()-> new BarStoolBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));



   //COFFEE TABLE
    public static final  DeferredBlock<Block> OAK_COFFEE_TABLE = registerBlock("oak_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));

    //DINNING TABLE
    public static final  DeferredBlock<Block> OAK_DINNING_TABLE = registerBlock("oak_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));





















//Glass Tecque
public static final DeferredBlock<Block> STONE_GLASS_TECQUE = registerBlock("stone_glass_tecque",
        ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_GLASS_TECQUE = registerBlock("acacia_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_GLASS_TECQUE = registerBlock("spruce_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> OAK_GLASS_TECQUE = registerBlock("oak_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_GLASS_TECQUE = registerBlock("birch_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_GLASS_TECQUE = registerBlock("jungle_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_GLASS_TECQUE = registerBlock("mangrove_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_GLASS_TECQUE = registerBlock("dark_oak_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_GLASS_TECQUE = registerBlock("cherry_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_GLASS_TECQUE = registerBlock("bamboo_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_GLASS_TECQUE = registerBlock("crimson_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_GLASS_TECQUE = registerBlock("warped_glass_tecque",
            ()-> new TecqueBlock(BlockBehaviour.Properties.of().strength(3f).noOcclusion()));


    //Test2
    public static final  DeferredBlock<Block> LIMESTONE =registerBlock("limestone",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));































































































































































































































































    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}