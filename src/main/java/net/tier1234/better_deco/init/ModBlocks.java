package net.tier1234.better_deco.init;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.custom.*;

import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BetterDeco.MOD_ID);



    //Test

    public static final DeferredBlock<Block> FURNI_WORKBENCH = registerBlock("furni_workbench",
            ()-> new FurniWorkbench(BlockBehaviour.Properties.of().strength(2.7f)));

    public static final DeferredBlock<Block> CHOPPING_BOARD = registerBlock("chopping_board",
            ()-> new ChoppingBoardBlock(BlockBehaviour.Properties.of().strength(2.5f)));

    //Desk

    public static final DeferredBlock<Block> OAK_DESK = registerBlock("oak_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.OAK));
    public static final DeferredBlock<Block> SPRUCE_DESK = registerBlock("spruce_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.SPRUCE));
    public static final DeferredBlock<Block> BIRCH_DESK = registerBlock("birch_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.BIRCH));
    public static final DeferredBlock<Block> JUNGLE_DESK = registerBlock("jungle_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.JUNGLE));
    public static final DeferredBlock<Block> ACACIA_DESK = registerBlock("acacia_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.ACACIA));
    public static final DeferredBlock<Block> MANGROVE_DESK = registerBlock("mangrove_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.MANGROVE));
    public static final DeferredBlock<Block> DARK_OAK_DESK = registerBlock("dark_oak_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.DARK_OAK));
    public static final DeferredBlock<Block>  CHERRY_DESK = registerBlock("cherry_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.CHERRY));
    public static final DeferredBlock<Block> BAMBOO_DESK = registerBlock("bamboo_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.BAMBOO));
    public static final DeferredBlock<Block> CRIMSON_DESK = registerBlock("crimson_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.CRIMSON));
    public static final DeferredBlock<Block> WARPED_DESK = registerBlock("warped_desk",
            ()-> new DeskBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.WARPED));

    public static final DeferredBlock<Block> OAK_DESK_CABINET = registerBlock("oak_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.OAK));
    public static final DeferredBlock<Block> SPRUCE_DESK_CABINET = registerBlock("spruce_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.SPRUCE));
    public static final DeferredBlock<Block> BIRCH_DESK_CABINET = registerBlock("birch_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.BIRCH));
    public static final DeferredBlock<Block> JUNGLE_DESK_CABINET = registerBlock("jungle_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.JUNGLE));
    public static final DeferredBlock<Block> ACACIA_DESK_CABINET = registerBlock("acacia_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.ACACIA));
    public static final DeferredBlock<Block> MANGROVE_DESK_CABINET = registerBlock("mangrove_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.MANGROVE));
    public static final DeferredBlock<Block> DARK_OAK_DESK_CABINET = registerBlock("dark_oak_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.DARK_OAK));
    public static final DeferredBlock<Block>  CHERRY_DESK_CABINET = registerBlock("cherry_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.CHERRY));
    public static final DeferredBlock<Block> BAMBOO_DESK_CABINET = registerBlock("bamboo_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.BAMBOO));
    public static final DeferredBlock<Block> CRIMSON_DESK_CABINET = registerBlock("crimson_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.CRIMSON));
    public static final DeferredBlock<Block> WARPED_DESK_CABINET = registerBlock("warped_desk_cabinet",
            ()-> new DeskCabinetBlock(BlockBehaviour.Properties.of(), DeskBlock.MaterialType.WARPED));



    //Path
    public static final DeferredBlock<Block> STONE_PATH = registerBlock("stone_path",
            ()-> new RockPath(BlockBehaviour.Properties.of().strength(3.1f)));

    //PARK BENCH

    public static final DeferredBlock<Block> OAK_PARK_BENCH = registerBlock("oak_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> SPRUCE_PARK_BENCH = registerBlock("spruce_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> BIRCH_PARK_BENCH = registerBlock("birch_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> JUNGLE_PARK_BENCH = registerBlock("jungle_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> ACACIA_PARK_BENCH = registerBlock("acacia_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> DARK_OAK_PARK_BENCH = registerBlock("dark_oak_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> MANGROVE_PARK_BENCH = registerBlock("mangrove_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> CHERRY_PARK_BENCH = registerBlock("cherry_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> BAMBOO_PARK_BENCH = registerBlock("bamboo_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> CRIMSON_PARK_BENCH = registerBlock("crimson_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));
    public static final DeferredBlock<Block> WARPED_PARK_BENCH = registerBlock("warped_park_bench",
            ()-> new ParkBenchBlock(BlockBehaviour.Properties.of().strength(2.5f)));



    public static final DeferredBlock<Block> TOASTER_LIGHT = registerBlock("toaster_light",
            ()->  new ToasterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    public static final DeferredBlock<Block> TOASTER_DARK = registerBlock("toaster_dark",
            ()->  new ToasterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));


    //FRIDGE & FREEZERS

        public static final DeferredBlock<NewFridgeBlock> FRIDGE_LIGHT = registerBlock("fridge_light",
                () -> new NewFridgeBlock(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<NewFridgeBlock> FRIDGE_DARK = registerBlock("fridge_dark",
            () -> new NewFridgeBlock(BlockBehaviour.Properties.of()));


    public static final DeferredBlock<Block> LIGHT_MICROWAVE = registerBlock("microwave_light",
            ()-> new MicrowaveBlock(BlockBehaviour.Properties.of().strength(2.5f).sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DARK_MICROWAVE = registerBlock("microwave_dark",
            ()-> new MicrowaveBlock(BlockBehaviour.Properties.of().strength(2.5f).sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

//Oven
   public static final  DeferredBlock<Block> OAK_OVEN = registerBlock("oak_oven",
           ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> SPRUCE_OVEN = registerBlock("spruce_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> BIRCH_OVEN = registerBlock("birch_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> JUNGLE_OVEN = registerBlock("jungle_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> ACACIA_OVEN = registerBlock("acacia_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> DARK_OAK_OVEN = registerBlock("dark_oak_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> MANGROVE_OVEN = registerBlock("mangrove_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> CHERRY_OVEN = registerBlock("cherry_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> BAMBOO_OVEN = registerBlock("bamboo_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> CRIMSON_OVEN = registerBlock("crimson_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> WARPED_OVEN = registerBlock("warped_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));

    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_OVEN = registerBlock("stripped_oak_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_OVEN = registerBlock("stripped_spruce_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_OVEN = registerBlock("stripped_birch_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_OVEN = registerBlock("stripped_jungle_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_OVEN = registerBlock("stripped_acacia_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_OVEN = registerBlock("stripped_dark_oak_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_OVEN = registerBlock("stripped_mangrove_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_OVEN = registerBlock("stripped_cherry_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_OVEN = registerBlock("stripped_bamboo_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_OVEN = registerBlock("stripped_crimson_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_OVEN = registerBlock("stripped_warped_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of()));

    public static final DeferredBlock<Block> SPRUCE_DIORITE_OVEN = registerBlock("spruce_diorite_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_OVEN = registerBlock("dark_oak_calcite_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_OVEN = registerBlock("oak_andesite_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(3f)));




//SHELFS
public static final DeferredBlock<Block> OAK_SHELF = registerBlock("oak_shelf",
        ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> SPRUCE_SHELF = registerBlock("spruce_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> BIRCH_SHELF = registerBlock("birch_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> JUNGLE_SHELF = registerBlock("jungle_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> ACACIA_SHELF = registerBlock("acacia_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> MANGROVE_SHELF = registerBlock("mangrove_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> CHERRY_SHELF = registerBlock("cherry_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> BAMBOO_SHELF = registerBlock("bamboo_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> CRIMSON_SHELF = registerBlock("crimson_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> WARPED_SHELF = registerBlock("warped_shelf",
            ()-> new CustomShelfBlock(BlockBehaviour.Properties.of().sound(SoundType.WOOD).strength(2f)));



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

    //Stripped
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CHAIR = registerBlock("stripped_birch_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CHAIR = registerBlock("stripped_spruce_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_OAK_CHAIR = registerBlock("stripped_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CHAIR = registerBlock("stripped_dark_oak_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CHAIR = registerBlock("stripped_mangrove_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_CHAIR = registerBlock("stripped_warped_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CHAIR = registerBlock("stripped_crimson_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CHAIR = registerBlock("stripped_acacia_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CHAIR = registerBlock("stripped_jungle_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CHAIR = registerBlock("stripped_cherry_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_CHAIR = registerBlock("stripped_bamboo_chair",
            () -> new ChairBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    //Counters

    public static final DeferredBlock<KitchenCounterBlock> OAK_KITCHEN_COUNTER = registerBlock("oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> SPRUCE_KITCHEN_COUNTER = registerBlock("spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> BIRCH_KITCHEN_COUNTER = registerBlock("birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> JUNGLE_KITCHEN_COUNTER = registerBlock("jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> ACACIA_KITCHEN_COUNTER = registerBlock("acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> DARK_OAK_KITCHEN_COUNTER = registerBlock("dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> MANGROVE_KITCHEN_COUNTER = registerBlock("mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> CHERRY_KITCHEN_COUNTER = registerBlock("cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> BAMBOO_KITCHEN_COUNTER = registerBlock("bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> CRIMSON_KITCHEN_COUNTER = registerBlock("crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> WARPED_KITCHEN_COUNTER = registerBlock("warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

            //Stripped Counters Variant

    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_OAK_KITCHEN_COUNTER = registerBlock("stripped_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_SPRUCE_KITCHEN_COUNTER = registerBlock("stripped_spruce_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_BIRCH_KITCHEN_COUNTER = registerBlock("stripped_birch_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_JUNGLE_KITCHEN_COUNTER = registerBlock("stripped_jungle_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_ACACIA_KITCHEN_COUNTER = registerBlock("stripped_acacia_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_DARK_OAK_KITCHEN_COUNTER = registerBlock("stripped_dark_oak_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_MANGROVE_KITCHEN_COUNTER = registerBlock("stripped_mangrove_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_CHERRY_KITCHEN_COUNTER = registerBlock("stripped_cherry_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_BAMBOO_KITCHEN_COUNTER = registerBlock("stripped_bamboo_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_CRIMSON_KITCHEN_COUNTER = registerBlock("stripped_crimson_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> STRIPPED_WARPED_KITCHEN_COUNTER = registerBlock("stripped_warped_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenCounterBlock> DARK_OAK_CALCITE_COUNTER = registerBlock("dark_oak_calcite_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<KitchenCounterBlock> OAK_ANDESITE_COUNTER = registerBlock("oak_andesite_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(3f)));

  //Drawers
  public static final DeferredBlock<KitchenDrawerBlock> OAK_KITCHEN_DRAWER = registerBlock("oak_kitchen_drawer",
          ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> SPRUCE_KITCHEN_DRAWER = registerBlock("spruce_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> BIRCH_KITCHEN_DRAWER = registerBlock("birch_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> JUNGLE_KITCHEN_DRAWER = registerBlock("jungle_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> ACACIA_KITCHEN_DRAWER = registerBlock("acacia_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> DARK_OAK_KITCHEN_DRAWER = registerBlock("dark_oak_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> MANGROVE_KITCHEN_DRAWER = registerBlock("mangrove_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> CHERRY_KITCHEN_DRAWER = registerBlock("cherry_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> BAMBOO_KITCHEN_DRAWER = registerBlock("bamboo_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> CRIMSON_KITCHEN_DRAWER = registerBlock("crimson_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<KitchenDrawerBlock> WARPED_KITCHEN_DRAWER = registerBlock("warped_kitchen_drawer",
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

    public static final DeferredBlock<Block> SPRUCE_DIORITE_KITCHEN_DRAWER = registerBlock("spruce_diorite_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_DRAWER = registerBlock("dark_oak_calcite_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_DRAWER = registerBlock("oak_andesite_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(3f)));

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

//Stripped
    public static final DeferredBlock<Block> STRIPPED_OAK_TABLE = registerBlock("stripped_oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_TABLE = registerBlock("stripped_spruce_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_TABLE = registerBlock("stripped_birch_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_TABLE = registerBlock("stripped_jungle_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_TABLE = registerBlock("stripped_acacia_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_TABLE = registerBlock("stripped_dark_oak_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_TABLE = registerBlock("stripped_mangrove_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_TABLE = registerBlock("stripped_cherry_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_TABLE = registerBlock("stripped_bamboo_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_TABLE = registerBlock("stripped_crimson_table",
            ()-> new TableBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_TABLE = registerBlock("stripped_warped_table",
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

    public static final DeferredBlock<Block> SPRUCE_DIORITE_CABINET = registerBlock("spruce_diorite_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_CABINET = registerBlock("dark_oak_calcite_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_CABINET = registerBlock("oak_andesite_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(3f)));

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
public static final DeferredBlock<Block> OAK_SINK = registerBlock("light_oak_sink",
        () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_SINK = registerBlock("light_spruce_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_SINK = registerBlock("light_birch_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_SINK = registerBlock("light_jungle_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_SINK = registerBlock("light_acacia_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_SINK = registerBlock("light_mangrove_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_SINK = registerBlock("light_dark_oak_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_SINK = registerBlock("light_cherry_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_SINK = registerBlock("light_bamboo_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_SINK = registerBlock("light_crimson_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_SINK = registerBlock("light_warped_sink",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    public static final DeferredBlock<Block> OAK_SINK_DARK = registerBlock("oak_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_SINK_DARK = registerBlock("spruce_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_SINK_DARK = registerBlock("birch_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_SINK_DARK = registerBlock("jungle_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_SINK_DARK = registerBlock("acacia_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_SINK_DARK = registerBlock("mangrove_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_SINK_DARK = registerBlock("dark_oak_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_SINK_DARK= registerBlock("cherry_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final DeferredBlock<Block> BAMBOO_SINK_DARK= registerBlock("bamboo_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_SINK_DARK = registerBlock("crimson_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_SINK_DARK = registerBlock("warped_sink_dark",
            () -> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2f).noOcclusion()));

    //Colored Variants
    public static final DeferredBlock<Block> RED_KITCHEN_COUNTER = registerBlock("red_kitchen_counter",
           ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_KITCHEN_COUNTER = registerBlock("yellow_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_KITCHEN_COUNTER = registerBlock("orange_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_KITCHEN_COUNTER = registerBlock("magenta_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_KITCHEN_COUNTER = registerBlock("purple_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_KITCHEN_COUNTER = registerBlock("pink_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_KITCHEN_COUNTER = registerBlock("blue_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_KITCHEN_COUNTER = registerBlock("light_blue_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_KITCHEN_COUNTER = registerBlock("cyan_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_KITCHEN_COUNTER = registerBlock("green_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_KITCHEN_COUNTER = registerBlock("lime_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_KITCHEN_COUNTER = registerBlock("gray_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_KITCHEN_COUNTER = registerBlock("light_gray_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_KITCHEN_COUNTER = registerBlock("black_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_KITCHEN_COUNTER = registerBlock("brown_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_KITCHEN_COUNTER = registerBlock("white_kitchen_counter",
            ()-> new KitchenCounterBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));

    //Colored Drawers

    public static final DeferredBlock<Block> RED_KITCHEN_DRAWER = registerBlock("red_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_KITCHEN_DRAWER = registerBlock("yellow_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_KITCHEN_DRAWER = registerBlock("orange_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_KITCHEN_DRAWER = registerBlock("magenta_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_KITCHEN_DRAWER = registerBlock("purple_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_KITCHEN_DRAWER = registerBlock("pink_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_KITCHEN_DRAWER = registerBlock("blue_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_KITCHEN_DRAWER = registerBlock("light_blue_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_KITCHEN_DRAWER = registerBlock("cyan_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_KITCHEN_DRAWER = registerBlock("green_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_KITCHEN_DRAWER = registerBlock("lime_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_KITCHEN_DRAWER = registerBlock("gray_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_KITCHEN_DRAWER = registerBlock("light_gray_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_KITCHEN_DRAWER = registerBlock("black_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_KITCHEN_DRAWER = registerBlock("brown_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_KITCHEN_DRAWER = registerBlock("white_kitchen_drawer",
            ()-> new KitchenDrawerBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));

//Oven
   public static final DeferredBlock<Block> RED_OVEN = registerBlock("red_oven",
        ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_OVEN = registerBlock("yellow_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_OVEN = registerBlock("orange_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_OVEN = registerBlock("magenta_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_OVEN = registerBlock("purple_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_OVEN = registerBlock("pink_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_OVEN = registerBlock("blue_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_OVEN = registerBlock("light_blue_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_OVEN = registerBlock("cyan_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_OVEN = registerBlock("green_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_OVEN = registerBlock("lime_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_OVEN = registerBlock("gray_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_OVEN = registerBlock("light_gray_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_OVEN = registerBlock("black_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_OVEN = registerBlock("brown_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_OVEN = registerBlock("white_oven",
            ()-> new OvenBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));


    public static final DeferredBlock<Block> RED_SINK = registerBlock("red_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_SINK = registerBlock("yellow_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_SINK = registerBlock("orange_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_SINK = registerBlock("magenta_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_SINK = registerBlock("purple_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_SINK = registerBlock("pink_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_SINK = registerBlock("blue_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SINK = registerBlock("light_blue_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_SINK = registerBlock("cyan_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SINK = registerBlock("green_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_SINK = registerBlock("lime_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_SINK = registerBlock("gray_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_SINK = registerBlock("light_gray_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SINK = registerBlock("black_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_SINK = registerBlock("brown_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SINK = registerBlock("white_sink",
            ()-> new KitchenSinkBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));


    public static final DeferredBlock<Block> RED_CABINET = registerBlock("red_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_CABINET = registerBlock("yellow_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_CABINET = registerBlock("orange_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_CABINET = registerBlock("magenta_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_CABINET = registerBlock("purple_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_CABINET = registerBlock("pink_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_CABINET = registerBlock("blue_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CABINET = registerBlock("light_blue_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_CABINET = registerBlock("cyan_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_CABINET = registerBlock("green_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_CABINET = registerBlock("lime_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_CABINET = registerBlock("gray_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CABINET = registerBlock("light_gray_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_CABINET = registerBlock("black_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_CABINET = registerBlock("brown_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CABINET = registerBlock("white_cabinet",
            ()-> new CabinetBlock(BlockBehaviour.Properties.of().strength(2.5f).noOcclusion()));


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
    public static final  DeferredBlock<Block> SPRUCE_COFFEE_TABLE = registerBlock("spruce_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BIRCH_COFFEE_TABLE = registerBlock("birch_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> JUNGLE_COFFEE_TABLE = registerBlock("jungle_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> ACACIA_COFFEE_TABLE = registerBlock("acacia_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> DARK_OAK_COFFEE_TABLE = registerBlock("dark_oak_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> MANGROVE_COFFEE_TABLE = registerBlock("mangrove_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CHERRY_COFFEE_TABLE = registerBlock("cherry_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BAMBOO_COFFEE_TABLE = registerBlock("bamboo_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CRIMSON_COFFEE_TABLE = registerBlock("crimson_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> WARPED_COFFEE_TABLE = registerBlock("warped_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));

    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_COFFEE_TABLE = registerBlock("stripped_oak_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_COFFEE_TABLE = registerBlock("stripped_spruce_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_COFFEE_TABLE = registerBlock("stripped_birch_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_COFFEE_TABLE = registerBlock("stripped_jungle_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_COFFEE_TABLE = registerBlock("stripped_acacia_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_COFFEE_TABLE = registerBlock("stripped_dark_oak_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_COFFEE_TABLE = registerBlock("stripped_mangrove_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_COFFEE_TABLE = registerBlock("stripped_cherry_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_COFFEE_TABLE = registerBlock("stripped_bamboo_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_COFFEE_TABLE = registerBlock("stripped_crimson_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_COFFEE_TABLE = registerBlock("stripped_warped_coffee_table",
            ()-> new CoffeeTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));









    //DINNING TABLE
    public static final  DeferredBlock<Block> OAK_DINNING_TABLE = registerBlock("oak_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> SPRUCE_DINNING_TABLE = registerBlock("spruce_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BIRCH_DINNING_TABLE = registerBlock("birch_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> JUNGLE_DINNING_TABLE = registerBlock("jungle_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> ACACIA_DINNING_TABLE = registerBlock("acacia_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> DARK_OAK_DINNING_TABLE = registerBlock("dark_oak_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> MANGROVE_DINNING_TABLE = registerBlock("mangrove_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CHERRY_DINNING_TABLE = registerBlock("cherry_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BAMBOO_DINNING_TABLE = registerBlock("bamboo_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CRIMSON_DINNING_TABLE = registerBlock("crimson_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> WARPED_DINNING_TABLE = registerBlock("warped_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));

    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_DINNING_TABLE = registerBlock("stripped_oak_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_DINNING_TABLE = registerBlock("stripped_spruce_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_DINNING_TABLE = registerBlock("stripped_birch_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_DINNING_TABLE = registerBlock("stripped_jungle_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_DINNING_TABLE = registerBlock("stripped_acacia_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_DINNING_TABLE = registerBlock("stripped_dark_oak_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_DINNING_TABLE = registerBlock("stripped_mangrove_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_DINNING_TABLE = registerBlock("stripped_cherry_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_DINNING_TABLE = registerBlock("stripped_bamboo_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_DINNING_TABLE = registerBlock("stripped_crimson_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_DINNING_TABLE = registerBlock("stripped_warped_dinning_table",
            ()-> new DinningTableBlock(BlockBehaviour.Properties.of().strength(2f).sound(SoundType.WOOD)));









  //Digital Clock
    public static final  DeferredBlock<Block>   RED_DIGITAL_CLOCK = registerBlock("red_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> ORANGE_DIGITAL_CLOCK = registerBlock("orange_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> YELLOW_DIGITAL_CLOCK = registerBlock("yellow_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> MAGENTA_DIGITAL_CLOCK = registerBlock("magenta_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> PINK_DIGITAL_CLOCK = registerBlock("pink_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> PURPLE_DIGITAL_CLOCK = registerBlock("purple_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BLUE_DIGITAL_CLOCK = registerBlock("blue_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIGHT_BLUE_DIGITAL_CLOCK = registerBlock("light_blue_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> CYAN_DIGITAL_CLOCK = registerBlock("cyan_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> GREEN_DIGITAL_CLOCK = registerBlock("green_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIME_DIGITAL_CLOCK = registerBlock("lime_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> GRAY_DIGITAL_CLOCK = registerBlock("gray_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIGHT_GRAY_DIGITAL_CLOCK = registerBlock("light_gray_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BROWN_DIGITAL_CLOCK = registerBlock("brown_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BLACK_DIGITAL_CLOCK = registerBlock("black_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> WHITE_DIGITAL_CLOCK = registerBlock("white_digital_clock",
            ()-> new DigitalClockBlock(BlockBehaviour.Properties.of().sound(SoundType.DECORATED_POT).strength(2f)));







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
























































































































































































  //REGISTER

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