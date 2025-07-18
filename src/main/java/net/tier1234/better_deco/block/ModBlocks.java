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
import net.tier1234.better_deco.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BetterDeco.MOD_ID);





//WOOD BRICKS


    //Bricks
    public static final DeferredBlock<Block> OAK_PLANKS_BRICKS = registerBlock("oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_BRICKS = registerBlock("spruce_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_BRICKS = registerBlock("dark_oak_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_BRICKS = registerBlock("birch_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_BRICKS = registerBlock("mangrove_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_BRICKS = registerBlock("cherry_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_BRICKS = registerBlock("bamboo_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_BRICKS = registerBlock("crimson_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PLANKS_BRICKS = registerBlock("warped_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PLANKS_BRICKS = registerBlock("acacia_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_BRICKS = registerBlock("jungle_planks_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Pillars
    public static final DeferredBlock<Block> ACACIA_PLANKS_PILLAR = registerBlock("acacia_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_PILLAR = registerBlock("birch_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_PILLAR = registerBlock("bamboo_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_PILLAR = registerBlock("cherry_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_PILLAR = registerBlock("crimson_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_PILLAR = registerBlock("spruce_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> OAK_PLANKS_PILLAR = registerBlock("oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> WARPED_PLANKS_PILLAR = registerBlock("warped_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_PILLAR = registerBlock("jungle_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_PILLAR = registerBlock("mangrove_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_PILLAR = registerBlock("dark_oak_planks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_PILLAR)));




//Soft Bricks
public static final DeferredBlock<Block> OAK_SOFT_BRICKS = registerBlock("oak_soft_bricks",
        () -> new Block(BlockBehaviour.Properties.of()
                .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SOFT_BRICKS = registerBlock("dark_oak_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SOFT_BRICKS = registerBlock("spruce_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SOFT_BRICKS = registerBlock("birch_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SOFT_BRICKS = registerBlock("bamboo_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SOFT_BRICKS = registerBlock("cherry_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SOFT_BRICKS = registerBlock("mangrove_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SOFT_BRICKS = registerBlock("jungle_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SOFT_BRICKS = registerBlock("acacia_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_SOFT_BRICKS = registerBlock("crimson_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SOFT_BRICKS = registerBlock("warped_soft_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Barrels
    public static final DeferredBlock<Block> OAK_BARREL = registerBlock("oak_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_BARREL = registerBlock("birch_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_BARREL = registerBlock("acacia_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_BARREL = registerBlock("jungle_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_BARREL = registerBlock("mangrove_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_BARREL = registerBlock("cherry_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_BARREL = registerBlock("bamboo_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_BARREL = registerBlock("crimson_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_BARREL = registerBlock("warped_barrel",
            () -> new CustomBarrelBlock(BlockBehaviour.Properties.of().noOcclusion()));



//Tests



    //Furnitures
    //Chairs
public static final DeferredBlock<Block> BIRCH_CHAIR = registerBlock("birch_chair",
        () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> OAK_CHAIR = registerBlock("oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CHAIR = registerBlock("mangrove_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CHAIR = registerBlock("warped_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CHAIR = registerBlock("crimson_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CHAIR = registerBlock("acacia_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CHAIR = registerBlock("jungle_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CHAIR = registerBlock("cherry_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CHAIR = registerBlock("bamboo_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().noOcclusion()));

    //Counters

    public static final DeferredBlock<Block> OAK_KITCHEN_COUNTER = registerBlock("oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_COUNTER = registerBlock("spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_COUNTER = registerBlock("birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_COUNTER = registerBlock("jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_COUNTER = registerBlock("acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_COUNTER = registerBlock("dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_COUNTER = registerBlock("mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_COUNTER = registerBlock("cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_COUNTER = registerBlock("bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_COUNTER = registerBlock("crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_COUNTER = registerBlock("warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));

            //Stripped Counters Variant

    public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_COUNTER = registerBlock("stripped_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_COUNTER = registerBlock("stripped_spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_COUNTER = registerBlock("stripped_birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_COUNTER = registerBlock("stripped_jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_COUNTER = registerBlock("stripped_acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_COUNTER = registerBlock("stripped_dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_COUNTER = registerBlock("stripped_mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_COUNTER = registerBlock("stripped_cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_COUNTER = registerBlock("stripped_bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_COUNTER = registerBlock("stripped_crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_COUNTER = registerBlock("stripped_warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().noOcclusion()));



  //Drawers
  public static final DeferredBlock<Block> OAK_KITCHEN_DRAWER = registerBlock("oak_kitchen_drawer",
          ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_DRAWER = registerBlock("spruce_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_DRAWER = registerBlock("birch_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_DRAWER = registerBlock("jungle_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_DRAWER = registerBlock("acacia_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_DRAWER = registerBlock("dark_oak_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_DRAWER = registerBlock("mangrove_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_DRAWER = registerBlock("cherry_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_DRAWER = registerBlock("bamboo_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_DRAWER = registerBlock("crimson_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_DRAWER = registerBlock("warped_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
         //Stripped Variants
         public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_DRAWER = registerBlock("stripped_oak_kitchen_drawer",
                 ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_DRAWER = registerBlock("stripped_spruce_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_DRAWER = registerBlock("stripped_birch_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_DRAWER = registerBlock("stripped_jungle_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_DRAWER = registerBlock("stripped_acacia_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_DRAWER = registerBlock("stripped_dark_oak_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_DRAWER = registerBlock("stripped_mangrove_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_DRAWER = registerBlock("stripped_cherry_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_DRAWER = registerBlock("stripped_bamboo_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_DRAWER = registerBlock("stripped_crimson_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_DRAWER = registerBlock("stripped_warped_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().noOcclusion()));




    //Tables
    public static final DeferredBlock<Block> OAK_TABLE = registerBlock("oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_TABLE = registerBlock("spruce_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_TABLE = registerBlock("birch_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_TABLE = registerBlock("jungle_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_TABLE = registerBlock("acacia_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_TABLE = registerBlock("mangrove_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_TABLE = registerBlock("cherry_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_TABLE = registerBlock("bamboo_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_TABLE = registerBlock("crimson_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_TABLE = registerBlock("warped_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().noOcclusion()));


    //Sofas
public static final DeferredBlock<Block> RED_SOFA = registerBlock("red_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_SOFA = registerBlock("orange_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLUE_SOFA = registerBlock("blue_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CYAN_SOFA = registerBlock("cyan_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SOFA = registerBlock("light_blue_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_SOFA = registerBlock("purple_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_SOFA = registerBlock("magenta_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_SOFA = registerBlock("yellow_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GREY_SOFA = registerBlock("grey_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GREY_SOFA = registerBlock("light_grey_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA = registerBlock("black_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WITHE_SOFA = registerBlock("white_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA = registerBlock("green_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> LIME_SOFA = registerBlock("lime_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> PINK_SOFA = registerBlock("pink_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BROWN_SOFA = registerBlock("brown_sofa",
            ()-> new SofaBlock(BlockBehaviour.Properties.of().noOcclusion()));
//Cabinet
public static final DeferredBlock<Block> OAK_CABINET = registerBlock("oak_cabinet",
        ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CABINET = registerBlock("spruce_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CABINET = registerBlock("birch_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CABINET = registerBlock("jungle_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CABINET = registerBlock("acacia_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CABINET = registerBlock("dark_oak_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CABINET = registerBlock("mangrove_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CABINET = registerBlock("cherry_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CABINET = registerBlock("bamboo_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CABINET = registerBlock("crimson_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CABINET = registerBlock("warped_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
//Stripped Variants
public static final DeferredBlock<Block> STRIPPED_OAK_CABINET = registerBlock("stripped_oak_cabinet",
        ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CABINET = registerBlock("stripped_spruce_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CABINET = registerBlock("stripped_birch_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CABINET = registerBlock("stripped_jungle_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CABINET = registerBlock("stripped_acacia_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CABINET = registerBlock("stripped_mangrove_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CABINET = registerBlock("stripped_dark_oak_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CABINET = registerBlock("stripped_cherry_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_CABINET = registerBlock("stripped_bamboo_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CABINET = registerBlock("stripped_crimson_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_CABINET = registerBlock("stripped_warped_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));


//Pedestals

public static final DeferredBlock<Block> PEDESTAL = registerBlock("pedestal",
        ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_PEDESTAL = registerBlock("deepslate_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_PEDESTAL = registerBlock("deepslate_tile_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_PEDESTAL = registerBlock("blackstone_pedestal",
            ()-> new PedestalBlock(BlockBehaviour.Properties.of().noOcclusion()));

//Bedside Cabinets
public static final DeferredBlock<Block> OAK_BEDSIDE = registerBlock("oak_bedside",
        ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_BEDSIDE = registerBlock("spruce_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_BEDSIDE = registerBlock("birch_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_BEDSIDE = registerBlock("jungle_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_BEDSIDE = registerBlock("acacia_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_BEDSIDE = registerBlock("mangrove_bedside",
            ()-> new BedsideCabinetBlock(BlockBehaviour.Properties.of().noOcclusion()));


//Crates
public static final DeferredBlock<Block> OAK_CRATE = registerBlock("oak_storage_crate",
        ()-> new CrateBlock(BlockBehaviour.Properties.of().noOcclusion()));















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