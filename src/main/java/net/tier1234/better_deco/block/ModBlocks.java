package net.tier1234.better_deco.block;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.custom.*;
import net.tier1234.better_deco.item.ModItems;

import java.util.function.Function;


public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(BetterDeco.MOD_ID);



    //Test
    //Desk

    public static final DeferredBlock<Block> OAK_DESK = registerBlock("oak_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.OAK));
    public static final DeferredBlock<Block> SPRUCE_DESK = registerBlock("spruce_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.SPRUCE));
    public static final DeferredBlock<Block> BIRCH_DESK = registerBlock("birch_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.BIRCH));
    public static final DeferredBlock<Block> JUNGLE_DESK = registerBlock("jungle_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.JUNGLE));
    public static final DeferredBlock<Block> ACACIA_DESK = registerBlock("acacia_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.ACACIA));
    public static final DeferredBlock<Block> MANGROVE_DESK = registerBlock("mangrove_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.MANGROVE));
    public static final DeferredBlock<Block> DARK_OAK_DESK = registerBlock("dark_oak_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.DARK_OAK));
    public static final DeferredBlock<Block>  CHERRY_DESK = registerBlock("cherry_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.CHERRY));
    public static final DeferredBlock<Block>  PALE_OAK_DESK = registerBlock("pale_oak_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.PALE_OAK));
    public static final DeferredBlock<Block> BAMBOO_DESK = registerBlock("bamboo_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.BAMBOO));
    public static final DeferredBlock<Block> CRIMSON_DESK = registerBlock("crimson_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.CRIMSON));
    public static final DeferredBlock<Block> WARPED_DESK = registerBlock("warped_desk",
            (properties)-> new DeskBlock(properties, DeskBlock.MaterialType.WARPED));

    public static final DeferredBlock<Block> OAK_DESK_CABINET = registerBlock("oak_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.OAK));
    public static final DeferredBlock<Block> SPRUCE_DESK_CABINET = registerBlock("spruce_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.SPRUCE));
    public static final DeferredBlock<Block> BIRCH_DESK_CABINET = registerBlock("birch_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.BIRCH));
    public static final DeferredBlock<Block> JUNGLE_DESK_CABINET = registerBlock("jungle_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.JUNGLE));
    public static final DeferredBlock<Block> ACACIA_DESK_CABINET = registerBlock("acacia_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.ACACIA));
    public static final DeferredBlock<Block> MANGROVE_DESK_CABINET = registerBlock("mangrove_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.MANGROVE));
    public static final DeferredBlock<Block> DARK_OAK_DESK_CABINET = registerBlock("dark_oak_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.DARK_OAK));
    public static final DeferredBlock<Block>  CHERRY_DESK_CABINET = registerBlock("cherry_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.CHERRY));
    public static final DeferredBlock<Block>  PALE_OAK_DESK_CABINET = registerBlock("pale_oak_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.PALE_OAK));
    public static final DeferredBlock<Block> BAMBOO_DESK_CABINET = registerBlock("bamboo_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.BAMBOO));
    public static final DeferredBlock<Block> CRIMSON_DESK_CABINET = registerBlock("crimson_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.CRIMSON));
    public static final DeferredBlock<Block> WARPED_DESK_CABINET = registerBlock("warped_desk_cabinet",
            (properties)-> new DeskCabinetBlock(properties, DeskBlock.MaterialType.WARPED));



    //Path
    public static final DeferredBlock<Block> STONE_PATH = registerBlock("stone_path",
            (properties)-> new RockPath(properties.strength(3.1f)));

    //PARK BENCH

    public static final DeferredBlock<Block> OAK_PARK_BENCH = registerBlock("oak_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> SPRUCE_PARK_BENCH = registerBlock("spruce_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> BIRCH_PARK_BENCH = registerBlock("birch_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> JUNGLE_PARK_BENCH = registerBlock("jungle_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> ACACIA_PARK_BENCH = registerBlock("acacia_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> DARK_OAK_PARK_BENCH = registerBlock("dark_oak_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> MANGROVE_PARK_BENCH = registerBlock("mangrove_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> CHERRY_PARK_BENCH = registerBlock("cherry_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> PALE_OAK_PARK_BENCH = registerBlock("pale_oak_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> BAMBOO_PARK_BENCH = registerBlock("bamboo_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> CRIMSON_PARK_BENCH = registerBlock("crimson_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));
    public static final DeferredBlock<Block> WARPED_PARK_BENCH = registerBlock("warped_park_bench",
            (properties)-> new ParkBenchBlock(properties.strength(2.5f)));

//Fridge and Freezer

    public static final DeferredBlock<NewFridgeBlock> FRIDGE_LIGHT = registerBlock("fridge_light",
            (properties) -> new NewFridgeBlock(properties.strength(2.7f)));

    public static final DeferredBlock<NewFridgeBlock> FRIDGE_DARK = registerBlock("fridge_dark",
            (properties) -> new NewFridgeBlock(properties.strength(2.7f)));


    //Microwave
    public static final DeferredBlock<Block> LIGHT_MICROWAVE = registerBlock("microwave_light",
            (properties)-> new MicrowaveBlock(properties.sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DARK_MICROWAVE = registerBlock("microwave_dark",
            (properties)-> new MicrowaveBlock(properties.strength(2.3f).sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()));

//Oven
   public static final  DeferredBlock<Block> OAK_OVEN = registerBlock("oak_oven",
           (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> SPRUCE_OVEN = registerBlock("spruce_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> BIRCH_OVEN = registerBlock("birch_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> JUNGLE_OVEN = registerBlock("jungle_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> ACACIA_OVEN = registerBlock("acacia_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> DARK_OAK_OVEN = registerBlock("dark_oak_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> MANGROVE_OVEN = registerBlock("mangrove_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final DeferredBlock<Block> PALE_OAK_OVEN = registerBlock("pale_oak_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> CHERRY_OVEN = registerBlock("cherry_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> BAMBOO_OVEN = registerBlock("bamboo_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> CRIMSON_OVEN = registerBlock("crimson_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> WARPED_OVEN = registerBlock("warped_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final DeferredBlock<Block> SPRUCE_DIORITE_OVEN = registerBlock("spruce_diorite_oven",
            (properties)-> new OvenBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_OVEN = registerBlock("dark_oak_calcite_oven",
            (properties)-> new OvenBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_OVEN = registerBlock("oak_andesite_oven",
            (properties)-> new OvenBlock(properties.strength(3f)));

    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_OVEN = registerBlock("stripped_oak_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_OVEN = registerBlock("stripped_spruce_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_OVEN = registerBlock("stripped_birch_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_OVEN = registerBlock("stripped_jungle_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_OVEN = registerBlock("stripped_acacia_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_OVEN = registerBlock("stripped_dark_oak_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_OVEN = registerBlock("stripped_mangrove_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_OVEN = registerBlock("stripped_cherry_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_OVEN = registerBlock("stripped_bamboo_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_OVEN = registerBlock("stripped_crimson_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_OVEN = registerBlock("stripped_warped_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));
    public static final  DeferredBlock<Block> STRIPPED_PALE_OAK_OVEN = registerBlock("stripped_pale_oak_oven",
            (properties)-> new OvenBlock(properties.strength(2f)));


    //Copper Lantern
      public static final DeferredBlock<Block> COPPER_LANTERN = registerBlock("copper_lantern",
              (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                      properties
                              .mapColor(MapColor.COLOR_ORANGE)
                              .requiresCorrectToolForDrops()
                              .strength(3.0F, 6.0F)
                              .sound(SoundType.LANTERN)
                              .lightLevel(state -> 15) // fa luce!
                              .noOcclusion()

              ));

    public static final DeferredBlock<Block> EXPOSED_LANTERN = registerBlock("exposed_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.EXPOSED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));

    public static final DeferredBlock<Block> WEATHERED_LANTERN = registerBlock("weathered_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.WEATHERED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));

    public static final DeferredBlock<Block> OXIDIZED_LANTERN = registerBlock("oxidized_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));
//Waxed Lantern
public static final DeferredBlock<Block> WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern",
        (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED,
                properties
                        .mapColor(MapColor.COLOR_ORANGE)
                        .requiresCorrectToolForDrops()
                        .strength(3.0F, 6.0F)
                        .sound(SoundType.LANTERN)
                        .lightLevel(state -> 15) // fa luce!
                        .noOcclusion()
        ));

    public static final DeferredBlock<Block> WAXED_EXPOSED_LANTERN = registerBlock("waxed_exposed_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.EXPOSED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));

    public static final DeferredBlock<Block> WAXED_WEATHERED_LANTERN = registerBlock("waxed_weathered_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.WEATHERED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));

    public static final DeferredBlock<Block> WAXED_OXIDIZED_LANTERN = registerBlock("waxed_oxidized_copper_lantern",
            (properties) -> new OxidizableLanternBlock(WeatheringCopper.WeatherState.OXIDIZED,
                    properties
                            .mapColor(MapColor.COLOR_ORANGE)
                            .requiresCorrectToolForDrops()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.LANTERN)
                            .lightLevel(state -> 15) // fa luce!
                            .noOcclusion()
            ));




//SHELFS
public static final DeferredBlock<Block> OAK_SHELF = registerBlock("oak_shelf",
        (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> SPRUCE_SHELF = registerBlock("spruce_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> BIRCH_SHELF = registerBlock("birch_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> JUNGLE_SHELF = registerBlock("jungle_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> ACACIA_SHELF = registerBlock("acacia_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> DARK_OAK_SHELF = registerBlock("dark_oak_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> MANGROVE_SHELF = registerBlock("mangrove_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> CHERRY_SHELF = registerBlock("cherry_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> BAMBOO_SHELF = registerBlock("bamboo_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> CRIMSON_SHELF = registerBlock("crimson_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> WARPED_SHELF = registerBlock("warped_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));
    public static final DeferredBlock<Block> PALE_OAK_SHELF = registerBlock("pale_oak_shelf",
            (properties)-> new CustomShelfBlock(properties.sound(SoundType.WOOD).strength(2f)));


//EXTRA BUILDINGS

    //VERTICAL SLABS
    public static final DeferredBlock<VerticalSlabBlock> OAK_VERTICAL_SLAB = registerBlock("oak_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> SPRUCE_VERTICAL_SLAB = registerBlock("spruce_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> BIRCH_VERTICAL_SLAB = registerBlock("birch_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> JUNGLE_VERTICAL_SLAB = registerBlock("jungle_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> ACACIA_VERTICAL_SLAB = registerBlock("acacia_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> DARK_OAK_VERTICAL_SLAB = registerBlock("dark_oak_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> MANGROVE_VERTICAL_SLAB = registerBlock("mangrove_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> CHERRY_VERTICAL_SLAB = registerBlock("cherry_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> BAMBOO_VERTICAL_SLAB = registerBlock("bamboo_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> CRIMSON_VERTICAL_SLAB = registerBlock("crimson_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> WARPED_VERTICAL_SLAB = registerBlock("warped_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));
    public static final DeferredBlock<VerticalSlabBlock> PALE_OAK_VERTICAL_SLAB = registerBlock("pale_oak_vertical_slab",
            (properties)-> new VerticalSlabBlock(properties.strength(2f).requiresCorrectToolForDrops()
                    .sound(SoundType.WOOD)));



//STONES
    //Andesite
public static final DeferredBlock<Block> ANDESITE_ARRAY_BRICKS = registerBlock("andesite_array_bricks",
        (properties) -> new Block(properties
                .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MOSAIC_BRICKS = registerBlock("andesite_mosaic_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_MIXED_BRICKS = registerBlock("andesite_mixed_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlock("andesite_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_ANDESITE = registerBlock("raw_andesite",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    //Diorite
    public static final DeferredBlock<Block> DIORITE_ARRAY_BRICKS = registerBlock("diorite_array_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_MOSAIC_BRICKS = registerBlock("diorite_mosaic_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_MIXED_BRICKS = registerBlock("diorite_mixed_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlock("diorite_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_DIORITE = registerBlock("raw_diorite",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    //Granite
    public static final DeferredBlock<Block> GRANITE_ARRAY_BRICKS = registerBlock("granite_array_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_MOSAIC_BRICKS = registerBlock("granite_mosaic_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_MIXED_BRICKS = registerBlock("granite_mixed_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlock("granite_bricks",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> RAW_GRANITE = registerBlock("raw_granite",
            (properties) -> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));






//WOOD


//Extra wood variants
    //Oak
public static final DeferredBlock<Block> OAK_VERTICAL_PLANKS = registerBlock("oak_vertical_planks",
        (properties) -> new Block(properties
                .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_PILED_PLANKS = registerBlock("oak_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_POLISHED_PLANKS = registerBlock("oak_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));







    //Spruce
    public static final DeferredBlock<Block> SPRUCE_VERTICAL_PLANKS = registerBlock("spruce_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PILED_PLANKS = registerBlock("spruce_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_POLISHED_PLANKS = registerBlock("spruce_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));




    //Birch
    public static final DeferredBlock<Block> BIRCH_VERTICAL_PLANKS = registerBlock("birch_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PILED_PLANKS = registerBlock("birch_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_POLISHED_PLANKS = registerBlock("birch_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Jungle
    public static final DeferredBlock<Block> JUNGLE_VERTICAL_PLANKS = registerBlock("jungle_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PILED_PLANKS = registerBlock("jungle_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_POLISHED_PLANKS = registerBlock("jungle_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Acacia
    public static final DeferredBlock<Block> ACACIA_VERTICAL_PLANKS = registerBlock("acacia_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PILED_PLANKS = registerBlock("acacia_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_POLISHED_PLANKS = registerBlock("acacia_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Dark Oak
    public static final DeferredBlock<Block> DARK_OAK_VERTICAL_PLANKS = registerBlock("dark_oak_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PILED_PLANKS = registerBlock("dark_oak_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_POLISHED_PLANKS = registerBlock("dark_oak_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Mangrove
    public static final DeferredBlock<Block> MANGROVE_VERTICAL_PLANKS = registerBlock("mangrove_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PILED_PLANKS = registerBlock("mangrove_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_POLISHED_PLANKS = registerBlock("mangrove_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Cherry
    public static final DeferredBlock<Block> CHERRY_VERTICAL_PLANKS = registerBlock("cherry_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PILED_PLANKS = registerBlock("cherry_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_POLISHED_PLANKS = registerBlock("cherry_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Bamboo
    public static final DeferredBlock<Block> BAMBOO_VERTICAL_PLANKS = registerBlock("bamboo_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PILED_PLANKS = registerBlock("bamboo_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_POLISHED_PLANKS = registerBlock("bamboo_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Crimson
    public static final DeferredBlock<Block> CRIMSON_VERTICAL_PLANKS = registerBlock("crimson_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PILED_PLANKS = registerBlock("crimson_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_POLISHED_PLANKS = registerBlock("crimson_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    //Warped
    public static final DeferredBlock<Block> WARPED_VERTICAL_PLANKS = registerBlock("warped_vertical_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PILED_PLANKS = registerBlock("warped_piled_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_POLISHED_PLANKS = registerBlock("warped_polished_planks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



























    //Bricks
    public static final DeferredBlock<Block> OAK_PLANKS_BRICKS = registerBlock("oak_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_BRICKS = registerBlock("spruce_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_BRICKS = registerBlock("dark_oak_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_BRICKS = registerBlock("birch_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_BRICKS = registerBlock("mangrove_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_BRICKS = registerBlock("cherry_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_BRICKS = registerBlock("bamboo_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_BRICKS = registerBlock("crimson_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PLANKS_BRICKS = registerBlock("warped_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_PLANKS_BRICKS = registerBlock("acacia_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_BRICKS = registerBlock("jungle_planks_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Pillars
    public static final DeferredBlock<Block> ACACIA_PLANKS_PILLAR = registerBlock("acacia_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_PLANKS_PILLAR = registerBlock("birch_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_PLANKS_PILLAR = registerBlock("bamboo_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_PLANKS_PILLAR = registerBlock("cherry_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_PLANKS_PILLAR = registerBlock("crimson_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_PLANKS_PILLAR = registerBlock("spruce_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OAK_PLANKS_PILLAR = registerBlock("oak_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_PLANKS_PILLAR = registerBlock("warped_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_PLANKS_PILLAR = registerBlock("jungle_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_PLANKS_PILLAR = registerBlock("mangrove_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_PLANKS_PILLAR = registerBlock("dark_oak_planks_pillar",
            (properties) -> new RotatedPillarBlock(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));




//Soft Bricks
public static final DeferredBlock<Block> OAK_SOFT_BRICKS = registerBlock("oak_soft_bricks",
        (properties) -> new Block(properties
                .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SOFT_BRICKS = registerBlock("dark_oak_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SOFT_BRICKS = registerBlock("spruce_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SOFT_BRICKS = registerBlock("birch_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SOFT_BRICKS = registerBlock("bamboo_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SOFT_BRICKS = registerBlock("cherry_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SOFT_BRICKS = registerBlock("mangrove_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SOFT_BRICKS = registerBlock("jungle_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SOFT_BRICKS = registerBlock("acacia_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRIMSON_SOFT_BRICKS = registerBlock("crimson_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SOFT_BRICKS = registerBlock("warped_soft_bricks",
            (properties) -> new Block(properties
                    .strength(2f).requiresCorrectToolForDrops().sound(SoundType.WOOD)));



    //Barrels
    public static final DeferredBlock<Block> OAK_BARREL = registerBlock("oak_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DARK_OAK_BARREL = registerBlock("dark_oak_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BIRCH_BARREL = registerBlock("birch_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ACACIA_BARREL = registerBlock("acacia_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> JUNGLE_BARREL = registerBlock("jungle_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> MANGROVE_BARREL = registerBlock("mangrove_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CHERRY_BARREL = registerBlock("cherry_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BAMBOO_BARREL = registerBlock("bamboo_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CRIMSON_BARREL = registerBlock("crimson_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WARPED_BARREL = registerBlock("warped_barrel",
            (properties) -> new CustomBarrelBlock(properties
                    .strength(2f).noOcclusion().requiresCorrectToolForDrops()));




    //Furnitures
    //Chairs
public static final DeferredBlock<Block> BIRCH_CHAIR = registerBlock("birch_chair",
        (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CHAIR = registerBlock("spruce_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> OAK_CHAIR = registerBlock("oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CHAIR = registerBlock("dark_oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CHAIR = registerBlock("mangrove_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CHAIR = registerBlock("warped_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CHAIR = registerBlock("crimson_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CHAIR = registerBlock("acacia_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CHAIR = registerBlock("jungle_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CHAIR = registerBlock("cherry_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CHAIR = registerBlock("bamboo_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_CHAIR = registerBlock("pale_oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    //Stripped
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CHAIR = registerBlock("stripped_birch_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CHAIR = registerBlock("stripped_spruce_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_OAK_CHAIR = registerBlock("stripped_oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CHAIR = registerBlock("stripped_dark_oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CHAIR = registerBlock("stripped_mangrove_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_CHAIR = registerBlock("stripped_warped_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CHAIR = registerBlock("stripped_crimson_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CHAIR = registerBlock("stripped_acacia_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CHAIR = registerBlock("stripped_jungle_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CHAIR = registerBlock("stripped_cherry_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_CHAIR = registerBlock("stripped_bamboo_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_PALE_OAK_CHAIR = registerBlock("stripped_pale_oak_chair",
            (properties) -> new ChairBlock(properties.strength(2f).noOcclusion()));
    //Counters

    public static final DeferredBlock<Block> OAK_KITCHEN_COUNTER = registerBlock("oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_COUNTER = registerBlock("spruce_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_COUNTER = registerBlock("birch_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_COUNTER = registerBlock("jungle_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_COUNTER = registerBlock("acacia_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_COUNTER = registerBlock("dark_oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_COUNTER = registerBlock("mangrove_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_COUNTER = registerBlock("cherry_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_COUNTER = registerBlock("bamboo_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_COUNTER = registerBlock("crimson_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_COUNTER = registerBlock("warped_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_KITCHEN_COUNTER = registerBlock("pale_oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));

            //Stripped Counters Variant
    public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_COUNTER = registerBlock("stripped_oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_COUNTER = registerBlock("stripped_spruce_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_COUNTER = registerBlock("stripped_birch_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_COUNTER = registerBlock("stripped_jungle_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_COUNTER = registerBlock("stripped_acacia_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_COUNTER = registerBlock("stripped_dark_oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_COUNTER = registerBlock("stripped_mangrove_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_COUNTER = registerBlock("stripped_cherry_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_COUNTER = registerBlock("stripped_bamboo_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_COUNTER = registerBlock("stripped_crimson_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_COUNTER = registerBlock("stripped_warped_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_PALE_OAK_KITCHEN_COUNTER = registerBlock("stripped_pale_oak_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2f).noOcclusion()));


    public static final DeferredBlock<Block> DARK_OAK_CALCITE_COUNTER = registerBlock("dark_oak_calcite_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_COUNTER = registerBlock("oak_andesite_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(3f)));



  //Drawers
  public static final DeferredBlock<Block> OAK_KITCHEN_DRAWER = registerBlock("oak_kitchen_drawer",
          (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_KITCHEN_DRAWER = registerBlock("spruce_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_KITCHEN_DRAWER = registerBlock("birch_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_KITCHEN_DRAWER = registerBlock("jungle_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_KITCHEN_DRAWER = registerBlock("acacia_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_KITCHEN_DRAWER = registerBlock("dark_oak_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_KITCHEN_DRAWER = registerBlock("mangrove_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_KITCHEN_DRAWER = registerBlock("cherry_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_KITCHEN_DRAWER = registerBlock("bamboo_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_KITCHEN_DRAWER = registerBlock("crimson_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_KITCHEN_DRAWER = registerBlock("warped_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_KITCHEN_DRAWER = registerBlock("pale_oak_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
         //Stripped Variants
         public static final DeferredBlock<Block> STRIPPED_OAK_KITCHEN_DRAWER = registerBlock("stripped_oak_kitchen_drawer",
                 (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_KITCHEN_DRAWER = registerBlock("stripped_spruce_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_KITCHEN_DRAWER = registerBlock("stripped_birch_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_KITCHEN_DRAWER = registerBlock("stripped_jungle_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_KITCHEN_DRAWER = registerBlock("stripped_acacia_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_KITCHEN_DRAWER = registerBlock("stripped_dark_oak_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_KITCHEN_DRAWER = registerBlock("stripped_mangrove_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_KITCHEN_DRAWER = registerBlock("stripped_cherry_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_KITCHEN_DRAWER = registerBlock("stripped_bamboo_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_KITCHEN_DRAWER = registerBlock("stripped_crimson_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_KITCHEN_DRAWER = registerBlock("stripped_warped_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_PALE_OAK_KITCHEN_DRAWER = registerBlock("stripped_pale_oak_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2f).noOcclusion()));

    public static final DeferredBlock<Block> SPRUCE_DIORITE_KITCHEN_DRAWER = registerBlock("spruce_diorite_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_DRAWER = registerBlock("dark_oak_calcite_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_DRAWER = registerBlock("oak_andesite_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(3f)));




    //Tables
    public static final DeferredBlock<Block> OAK_TABLE = registerBlock("oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_TABLE = registerBlock("spruce_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_TABLE = registerBlock("birch_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_TABLE = registerBlock("jungle_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_TABLE = registerBlock("acacia_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_TABLE = registerBlock("dark_oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_TABLE = registerBlock("mangrove_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_TABLE = registerBlock("cherry_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_TABLE = registerBlock("bamboo_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_TABLE = registerBlock("crimson_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_TABLE = registerBlock("warped_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_TABLE = registerBlock("pale_oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
//Stripped
    public static final DeferredBlock<Block> STRIPPED_OAK_TABLE = registerBlock("stripped_oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_TABLE = registerBlock("stripped_spruce_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_TABLE = registerBlock("stripped_birch_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_TABLE = registerBlock("stripped_jungle_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_TABLE = registerBlock("stripped_acacia_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_TABLE = registerBlock("stripped_dark_oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_TABLE = registerBlock("stripped_mangrove_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_TABLE = registerBlock("stripped_cherry_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_TABLE = registerBlock("stripped_bamboo_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_TABLE = registerBlock("stripped_crimson_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_TABLE = registerBlock("stripped_warped_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_PALE_OAK_TABLE = registerBlock("stripped_pale_oak_table",
            (properties)-> new TableBlock(properties.strength(2f).noOcclusion()));

    //Sofas
public static final DeferredBlock<Block> RED_SOFA = registerBlock("red_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_SOFA = registerBlock("orange_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_SOFA = registerBlock("blue_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_SOFA = registerBlock("cyan_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SOFA = registerBlock("light_blue_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_SOFA = registerBlock("purple_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_SOFA = registerBlock("magenta_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_SOFA = registerBlock("yellow_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREY_SOFA = registerBlock("grey_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GREY_SOFA = registerBlock("light_grey_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SOFA = registerBlock("black_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WITHE_SOFA = registerBlock("white_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SOFA = registerBlock("green_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_SOFA = registerBlock("lime_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_SOFA = registerBlock("pink_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_SOFA = registerBlock("brown_sofa",
            (properties)-> new SofaBlock(properties.strength(2f).noOcclusion()));
//Cabinet
public static final DeferredBlock<Block> OAK_CABINET = registerBlock("oak_cabinet",
        (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CABINET = registerBlock("spruce_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CABINET = registerBlock("birch_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CABINET = registerBlock("jungle_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CABINET = registerBlock("acacia_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CABINET = registerBlock("dark_oak_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CABINET = registerBlock("mangrove_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CABINET = registerBlock("cherry_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CABINET = registerBlock("bamboo_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CABINET = registerBlock("crimson_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CABINET = registerBlock("warped_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_DIORITE_CABINET = registerBlock("spruce_diorite_cabinet",
            (properties)-> new CabinetBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> DARK_OAK_CALCITE_CABINET = registerBlock("dark_oak_calcite_cabinet",
            (properties)-> new CabinetBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> OAK_ANDESITE_CABINET = registerBlock("oak_andesite_cabinet",
            (properties)-> new CabinetBlock(properties.strength(3f)));
    public static final DeferredBlock<Block> PALE_OAK_CABINET = registerBlock("pale_oak_cabinet",
            (properties)-> new CabinetBlock(properties.strength(3f)));

//Stripped Variants
public static final DeferredBlock<Block> STRIPPED_OAK_CABINET = registerBlock("stripped_oak_cabinet",
        (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_SPRUCE_CABINET = registerBlock("stripped_spruce_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BIRCH_CABINET = registerBlock("stripped_birch_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_JUNGLE_CABINET = registerBlock("stripped_jungle_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_ACACIA_CABINET = registerBlock("stripped_acacia_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_MANGROVE_CABINET = registerBlock("stripped_mangrove_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_DARK_OAK_CABINET = registerBlock("stripped_dark_oak_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CHERRY_CABINET = registerBlock("stripped_cherry_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_BAMBOO_CABINET = registerBlock("stripped_bamboo_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_CRIMSON_CABINET = registerBlock("stripped_crimson_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_WARPED_CABINET = registerBlock("stripped_warped_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> STRIPPED_PALE_OAK_CABINET = registerBlock("stripped_pale_oak_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2f).noOcclusion()));


//Pedestals

public static final DeferredBlock<Block> PEDESTAL = registerBlock("pedestal",
        (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> STONE_PEDESTAL = registerBlock("stone_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_PEDESTAL = registerBlock("diorite_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_PEDESTAL = registerBlock("granite_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_PEDESTAL = registerBlock("deepslate_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_PEDESTAL = registerBlock("deepslate_tile_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_PEDESTAL = registerBlock("blackstone_pedestal",
            (properties)-> new PedestalBlock(properties.strength(4f).noOcclusion()));




//Bedside Cabinets
public static final DeferredBlock<Block> OAK_BEDSIDE = registerBlock("oak_bedside",
        (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_BEDSIDE = registerBlock("spruce_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_BEDSIDE = registerBlock("birch_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_BEDSIDE = registerBlock("jungle_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_BEDSIDE = registerBlock("acacia_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_BEDSIDE = registerBlock("mangrove_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_BEDSIDE = registerBlock("dark_oak_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_BEDSIDE = registerBlock("cherry_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_BEDSIDE = registerBlock("bamboo_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_BEDSIDE = registerBlock("crimson_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_BEDSIDE = registerBlock("warped_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_BEDSIDE = registerBlock("pale_oak_bedside",
            (properties)-> new BedsideCabinetBlock(properties.strength(2f).noOcclusion()));





//Crates
public static final DeferredBlock<Block> OAK_CRATE = registerBlock("oak_storage_crate",
        (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_CRATE = registerBlock("spruce_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_CRATE = registerBlock("birch_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_CRATE = registerBlock("jungle_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_CRATE = registerBlock("acacia_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_CRATE = registerBlock("mangrove_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_CRATE = registerBlock("dark_oak_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_CRATE = registerBlock("cherry_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_CRATE = registerBlock("bamboo_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_CRATE = registerBlock("crimson_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_CRATE = registerBlock("warped_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_CRATE = registerBlock("pale_oak_storage_crate",
            (properties)-> new CrateBlock(properties.strength(2f).noOcclusion()));


//Sinks
public static final DeferredBlock<Block> OAK_SINK = registerBlock("light_oak_sink",
        (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_SINK = registerBlock("light_spruce_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_SINK = registerBlock("light_birch_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_SINK = registerBlock("light_jungle_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_SINK = registerBlock("light_acacia_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_SINK = registerBlock("light_mangrove_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_SINK = registerBlock("light_dark_oak_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_SINK = registerBlock("light_cherry_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_SINK = registerBlock("light_bamboo_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_SINK = registerBlock("light_crimson_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_SINK = registerBlock("light_warped_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_SINK = registerBlock("light_pale_oak_sink",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));

    public static final DeferredBlock<Block> OAK_SINK_DARK = registerBlock("oak_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_SINK_DARK = registerBlock("spruce_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_SINK_DARK = registerBlock("birch_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_SINK_DARK = registerBlock("jungle_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_SINK_DARK = registerBlock("acacia_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_SINK_DARK = registerBlock("mangrove_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_SINK_DARK = registerBlock("dark_oak_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_SINK_DARK= registerBlock("cherry_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_SINK_DARK= registerBlock("bamboo_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_SINK_DARK = registerBlock("crimson_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_SINK_DARK = registerBlock("warped_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_SINK_DARK = registerBlock("pale_oak_sink_dark",
            (properties) -> new KitchenSinkBlock(properties.strength(2f).noOcclusion()));
    
    //Coloured Variants
    //Colored Variants
    public static final DeferredBlock<Block> RED_KITCHEN_COUNTER = registerBlock("red_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_KITCHEN_COUNTER = registerBlock("yellow_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_KITCHEN_COUNTER = registerBlock("orange_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_KITCHEN_COUNTER = registerBlock("magenta_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_KITCHEN_COUNTER = registerBlock("purple_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_KITCHEN_COUNTER = registerBlock("pink_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_KITCHEN_COUNTER = registerBlock("blue_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_KITCHEN_COUNTER = registerBlock("light_blue_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_KITCHEN_COUNTER = registerBlock("cyan_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_KITCHEN_COUNTER = registerBlock("green_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_KITCHEN_COUNTER = registerBlock("lime_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_KITCHEN_COUNTER = registerBlock("gray_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_KITCHEN_COUNTER = registerBlock("light_gray_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_KITCHEN_COUNTER = registerBlock("black_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_KITCHEN_COUNTER = registerBlock("brown_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_KITCHEN_COUNTER = registerBlock("white_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(2.5f).noOcclusion()));

    //Colored Drawers

    public static final DeferredBlock<Block> RED_KITCHEN_DRAWER = registerBlock("red_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_KITCHEN_DRAWER = registerBlock("yellow_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_KITCHEN_DRAWER = registerBlock("orange_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_KITCHEN_DRAWER = registerBlock("magenta_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_KITCHEN_DRAWER = registerBlock("purple_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_KITCHEN_DRAWER = registerBlock("pink_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_KITCHEN_DRAWER = registerBlock("blue_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_KITCHEN_DRAWER = registerBlock("light_blue_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_KITCHEN_DRAWER = registerBlock("cyan_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_KITCHEN_DRAWER = registerBlock("green_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_KITCHEN_DRAWER = registerBlock("lime_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_KITCHEN_DRAWER = registerBlock("gray_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_KITCHEN_DRAWER = registerBlock("light_gray_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_KITCHEN_DRAWER = registerBlock("black_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_KITCHEN_DRAWER = registerBlock("brown_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_KITCHEN_DRAWER = registerBlock("white_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(2.5f).noOcclusion()));

    //Oven
    public static final DeferredBlock<Block> RED_OVEN = registerBlock("red_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_OVEN = registerBlock("yellow_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_OVEN = registerBlock("orange_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_OVEN = registerBlock("magenta_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_OVEN = registerBlock("purple_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_OVEN = registerBlock("pink_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_OVEN = registerBlock("blue_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_OVEN = registerBlock("light_blue_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_OVEN = registerBlock("cyan_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_OVEN = registerBlock("green_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_OVEN = registerBlock("lime_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_OVEN = registerBlock("gray_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_OVEN = registerBlock("light_gray_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_OVEN = registerBlock("black_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_OVEN = registerBlock("brown_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_OVEN = registerBlock("white_oven",
            (properties)-> new OvenBlock(properties.strength(2.5f).noOcclusion()));


    public static final DeferredBlock<Block> RED_SINK = registerBlock("red_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_SINK = registerBlock("yellow_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_SINK = registerBlock("orange_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_SINK = registerBlock("magenta_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_SINK = registerBlock("purple_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_SINK = registerBlock("pink_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_SINK = registerBlock("blue_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SINK = registerBlock("light_blue_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_SINK = registerBlock("cyan_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_SINK = registerBlock("green_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_SINK = registerBlock("lime_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_SINK = registerBlock("gray_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_SINK = registerBlock("light_gray_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_SINK = registerBlock("black_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_SINK = registerBlock("brown_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_SINK = registerBlock("white_sink",
            (properties)-> new KitchenSinkBlock(properties.strength(2.5f).noOcclusion()));


    public static final DeferredBlock<Block> RED_CABINET = registerBlock("red_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_CABINET = registerBlock("yellow_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_CABINET = registerBlock("orange_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_CABINET = registerBlock("magenta_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_CABINET = registerBlock("purple_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_CABINET = registerBlock("pink_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_CABINET = registerBlock("blue_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CABINET = registerBlock("light_blue_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_CABINET = registerBlock("cyan_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_CABINET = registerBlock("green_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_CABINET = registerBlock("lime_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> GRAY_CABINET = registerBlock("gray_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CABINET = registerBlock("light_gray_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_CABINET = registerBlock("black_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_CABINET = registerBlock("brown_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    public static final DeferredBlock<Block> WHITE_CABINET = registerBlock("white_cabinet",
            (properties)-> new CabinetBlock(properties.strength(2.5f).noOcclusion()));
    
    //Stone Variants

    //Counter
public static final DeferredBlock<Block> STONE_COUNTER = registerBlock("stone_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_COUNTER = registerBlock("diorite_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_COUNTER = registerBlock("granite_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_COUNTER = registerBlock("blackstone_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_COUNTER = registerBlock("deepslate_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILE_COUNTER = registerBlock("deepslate_tiles_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));

    public static final DeferredBlock<Block> SPRUCE_DIORITE_COUNTER = registerBlock("spruce_diorite_kitchen_counter",
            (properties)-> new KitchenCounterBlock(properties.strength(4f).noOcclusion()));

    //Drawers
    public static final DeferredBlock<Block> STONE_DRAWER = registerBlock("stone_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_DRAWER = registerBlock("granite_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_DRAWER = registerBlock("diorite_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_DRAWER = registerBlock("deepslate_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILES_DRAWER = registerBlock("deepslate_tiles_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_DRAWER = registerBlock("blackstone_kitchen_drawer",
            (properties)-> new KitchenDrawerBlock(properties.strength(4f).noOcclusion()));



    //Cabinets
    public static final DeferredBlock<Block> STONE_CABINET = registerBlock("stone_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> GRANITE_CABINET = registerBlock("granite_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DIORITE_CABINET = registerBlock("diorite_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_CABINET = registerBlock("deepslate_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> DEEPSLATE_TILES_CABINET = registerBlock("deepslate_tiles_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));
    public static final DeferredBlock<Block> BLACKSTONE_CABINET = registerBlock("blackstone_cabinet",
            (properties)-> new CabinetBlock(properties.strength(4f).noOcclusion()));

    //STOOL
    public static final DeferredBlock<Block> RED_STOOL = registerBlock("red_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> ORANGE_STOOL = registerBlock("orange_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLUE_STOOL = registerBlock("blue_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> CYAN_STOOL = registerBlock("cyan_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_BLUE_STOOL = registerBlock("light_blue_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PURPLE_STOOL = registerBlock("purple_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> MAGENTA_STOOL = registerBlock("magenta_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> YELLOW_STOOL = registerBlock("yellow_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREY_STOOL = registerBlock("grey_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_GREY_STOOL = registerBlock("light_grey_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BLACK_STOOL = registerBlock("black_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> WITHE_STOOL = registerBlock("white_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> GREEN_STOOL = registerBlock("green_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> LIME_STOOL = registerBlock("lime_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> PINK_STOOL = registerBlock("pink_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));
    public static final DeferredBlock<Block> BROWN_STOOL = registerBlock("brown_stool",
            (properties)-> new BarStoolBlock(properties.strength(2f).noOcclusion()));



   //COFFEE TABLE
    public static final  DeferredBlock<Block> OAK_COFFEE_TABLE = registerBlock("oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> SPRUCE_COFFEE_TABLE = registerBlock("spruce_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BIRCH_COFFEE_TABLE = registerBlock("birch_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> JUNGLE_COFFEE_TABLE = registerBlock("jungle_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> ACACIA_COFFEE_TABLE = registerBlock("acacia_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> DARK_OAK_COFFEE_TABLE = registerBlock("dark_oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> MANGROVE_COFFEE_TABLE = registerBlock("mangrove_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CHERRY_COFFEE_TABLE = registerBlock("cherry_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BAMBOO_COFFEE_TABLE = registerBlock("bamboo_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CRIMSON_COFFEE_TABLE = registerBlock("crimson_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> WARPED_COFFEE_TABLE = registerBlock("warped_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> PALE_OAK_COFFEE_TABLE = registerBlock("pale_oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_COFFEE_TABLE = registerBlock("stripped_oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_COFFEE_TABLE = registerBlock("stripped_spruce_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_COFFEE_TABLE = registerBlock("stripped_birch_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_COFFEE_TABLE = registerBlock("stripped_jungle_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_COFFEE_TABLE = registerBlock("stripped_acacia_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_COFFEE_TABLE = registerBlock("stripped_dark_oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_COFFEE_TABLE = registerBlock("stripped_mangrove_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_COFFEE_TABLE = registerBlock("stripped_cherry_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_COFFEE_TABLE = registerBlock("stripped_bamboo_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_COFFEE_TABLE = registerBlock("stripped_crimson_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_COFFEE_TABLE = registerBlock("stripped_warped_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_PALE_OAK_COFFEE_TABLE = registerBlock("stripped_pale_oak_coffee_table",
            (properties)-> new CoffeeTableBlock(properties.strength(2f).sound(SoundType.WOOD)));








    //DINNING TABLE
    public static final  DeferredBlock<Block> OAK_DINNING_TABLE = registerBlock("oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> SPRUCE_DINNING_TABLE = registerBlock("spruce_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BIRCH_DINNING_TABLE = registerBlock("birch_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> JUNGLE_DINNING_TABLE = registerBlock("jungle_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> ACACIA_DINNING_TABLE = registerBlock("acacia_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> DARK_OAK_DINNING_TABLE = registerBlock("dark_oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> MANGROVE_DINNING_TABLE = registerBlock("mangrove_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CHERRY_DINNING_TABLE = registerBlock("cherry_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> BAMBOO_DINNING_TABLE = registerBlock("bamboo_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> CRIMSON_DINNING_TABLE = registerBlock("crimson_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> WARPED_DINNING_TABLE = registerBlock("warped_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> PALE_OAK_DINNING_TABLE = registerBlock("pale_oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    //Stripped
    public static final  DeferredBlock<Block> STRIPPED_OAK_DINNING_TABLE = registerBlock("stripped_oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_SPRUCE_DINNING_TABLE = registerBlock("stripped_spruce_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BIRCH_DINNING_TABLE = registerBlock("stripped_birch_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_JUNGLE_DINNING_TABLE = registerBlock("stripped_jungle_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_ACACIA_DINNING_TABLE = registerBlock("stripped_acacia_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_DARK_OAK_DINNING_TABLE = registerBlock("stripped_dark_oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_MANGROVE_DINNING_TABLE = registerBlock("stripped_mangrove_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CHERRY_DINNING_TABLE = registerBlock("stripped_cherry_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_BAMBOO_DINNING_TABLE = registerBlock("stripped_bamboo_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_CRIMSON_DINNING_TABLE = registerBlock("stripped_crimson_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_WARPED_DINNING_TABLE = registerBlock("stripped_warped_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));
    public static final  DeferredBlock<Block> STRIPPED_PALE_OAK_DINNING_TABLE = registerBlock("stripped_pale_oak_dinning_table",
            (properties)-> new DinningTableBlock(properties.strength(2f).sound(SoundType.WOOD)));








  //Digital Clock
    public static final  DeferredBlock<Block>   RED_DIGITAL_CLOCK = registerBlock("red_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> ORANGE_DIGITAL_CLOCK = registerBlock("orange_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> YELLOW_DIGITAL_CLOCK = registerBlock("yellow_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> MAGENTA_DIGITAL_CLOCK = registerBlock("magenta_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> PINK_DIGITAL_CLOCK = registerBlock("pink_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> PURPLE_DIGITAL_CLOCK = registerBlock("purple_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BLUE_DIGITAL_CLOCK = registerBlock("blue_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIGHT_BLUE_DIGITAL_CLOCK = registerBlock("light_blue_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> CYAN_DIGITAL_CLOCK = registerBlock("cyan_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> GREEN_DIGITAL_CLOCK = registerBlock("green_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIME_DIGITAL_CLOCK = registerBlock("lime_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> GRAY_DIGITAL_CLOCK = registerBlock("gray_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> LIGHT_GRAY_DIGITAL_CLOCK = registerBlock("light_gray_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BROWN_DIGITAL_CLOCK = registerBlock("brown_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> BLACK_DIGITAL_CLOCK = registerBlock("black_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));
    public static final  DeferredBlock<Block> WHITE_DIGITAL_CLOCK = registerBlock("white_digital_clock",
            (properties)-> new DigitalClockBlock(properties.sound(SoundType.DECORATED_POT).strength(2f)));




    //Glass Tecque


public static final DeferredBlock<Block> STONE_GLASS_TECQUE = registerBlock("stone_glass_tecque",
        (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> ACACIA_GLASS_TECQUE = registerBlock("acacia_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> SPRUCE_GLASS_TECQUE = registerBlock("spruce_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> OAK_GLASS_TECQUE = registerBlock("oak_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> BIRCH_GLASS_TECQUE = registerBlock("birch_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> JUNGLE_GLASS_TECQUE = registerBlock("jungle_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> MANGROVE_GLASS_TECQUE = registerBlock("mangrove_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> DARK_OAK_GLASS_TECQUE = registerBlock("dark_oak_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> CHERRY_GLASS_TECQUE = registerBlock("cherry_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> BAMBOO_GLASS_TECQUE = registerBlock("bamboo_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> CRIMSON_GLASS_TECQUE = registerBlock("crimson_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> WARPED_GLASS_TECQUE = registerBlock("warped_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));
    public static final DeferredBlock<Block> PALE_OAK_GLASS_TECQUE = registerBlock("pale_oak_glass_tecque",
            (properties)-> new TecqueBlock(properties.strength(3f).noOcclusion()));

    //Test2
    public static final  DeferredBlock<Block> LIMESTONE =registerBlock("limestone",
            (properties)-> new Block(properties
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));




    //DECORATIONS
    //DECO
    public static final DeferredBlock<Block> BIG_CHAIN = registerBlock("big_chain",
            (properties)-> new ChainBlock(properties.strength(4f).noOcclusion().sound(SoundType.CHAIN)
            ));
    public static final DeferredBlock<Block> WALL_LANTERN = registerBlock("wall_lantern",
            (properties)-> new WallLanternBlock(properties.strength(2f).sound(SoundType.LANTERN).lightLevel(state -> 15)));




    //PALE OAK WOOD VARIANTS
    public static final DeferredBlock<Block> PALE_OAK_BARREL = registerBlock("pale_oak_barrel",
            (properties)-> new CustomBarrelBlock(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_PLANKS_BRICKS = registerBlock("pale_oak_planks_bricks",
            (properties)-> new Block(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_SOFT_BRICKS = registerBlock("pale_oak_soft_bricks",
            (properties)-> new Block(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_PLANKS_PILLAR = registerBlock("pale_oak_planks_pillar",
            (properties)-> new RotatedPillarBlock(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_LARGE_PLANKS = registerBlock("pale_oak_piled_planks",
            (properties)-> new Block(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_VERTICAL = registerBlock("pale_oak_vertical_planks",
            (properties)-> new Block(properties.strength(2f)));

    public static final DeferredBlock<Block> PALE_OAK_SMOOTH_PLANKS = registerBlock("pale_oak_polished_planks",
            (properties)-> new Block(properties.strength(2f)));









    //REGISTRATION

    public static <T extends Block> DeferredBlock<T> registerBlockWithCustomItem(String name, Function<BlockBehaviour.Properties, T> block, Function<Item.Properties, Item> itemFactory) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, block);
        ModItems.ITEMS.registerItem(name, itemFactory);
        return toReturn;
    }



    private static <T extends Block> DeferredBlock<T> registerNoItem(String name, Function<BlockBehaviour.Properties, T> function) {
        return BLOCKS.registerBlock(name, function);
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, (properties) -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}