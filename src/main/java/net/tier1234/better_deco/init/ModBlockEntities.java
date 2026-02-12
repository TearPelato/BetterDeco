package net.tier1234.better_deco.init;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.entity.custom.*;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BetterDeco.MOD_ID);


    public static final Supplier<BlockEntityType<CustomBarrelBlockEntity>> CUSTOM_BARREL_BE =
            BLOCK_ENTITIES.register("custom_barrel", () ->
                    BlockEntityType.Builder
                            .of(CustomBarrelBlockEntity::new,
                                    ModBlocks.OAK_BARREL.get(),
                                    ModBlocks.BIRCH_BARREL.get(),
                                    ModBlocks.DARK_OAK_BARREL.get(),
                                    ModBlocks.JUNGLE_BARREL.get(),
                                    ModBlocks.ACACIA_BARREL.get(),
                                    ModBlocks.CHERRY_BARREL.get(),
                                    ModBlocks.BAMBOO_BARREL.get(),
                                    ModBlocks.MANGROVE_BARREL.get(),
                                    ModBlocks.CRIMSON_BARREL.get(),
                                    ModBlocks.WARPED_BARREL.get())
                            .build(null)
            );

    public static final Supplier<BlockEntityType<KitchenDrawerBlockEntity>> CUSTOM_KITCHEN_DRAWER_BE =
            BLOCK_ENTITIES.register("kitchen_drawer", () ->
                    BlockEntityType.Builder
                            .of(KitchenDrawerBlockEntity::new,
                                    ModBlocks.OAK_KITCHEN_DRAWER.get(),
                                    ModBlocks.SPRUCE_KITCHEN_DRAWER.get(),
                                    ModBlocks.BIRCH_KITCHEN_DRAWER.get(),
                                    ModBlocks.JUNGLE_KITCHEN_DRAWER.get(),
                                    ModBlocks.ACACIA_KITCHEN_DRAWER.get(),
                                    ModBlocks.DARK_OAK_KITCHEN_DRAWER.get(),
                                    ModBlocks.MANGROVE_KITCHEN_DRAWER.get(),
                                    ModBlocks.CHERRY_KITCHEN_DRAWER.get(),
                                    ModBlocks.BAMBOO_KITCHEN_DRAWER.get(),
                                    ModBlocks.CRIMSON_KITCHEN_DRAWER.get(),
                                    ModBlocks.WARPED_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER.get(),
                                    ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get(),
                                    ModBlocks.STONE_DRAWER.get(),
                                    ModBlocks.GRANITE_DRAWER.get(),
                                    ModBlocks.DIORITE_DRAWER.get(),
                                    ModBlocks.DEEPSLATE_DRAWER.get(),
                                    ModBlocks.DEEPSLATE_TILES_DRAWER.get(),
                                    ModBlocks.BLACKSTONE_DRAWER.get(),

                                    ModBlocks.SPRUCE_DIORITE_KITCHEN_DRAWER.get(),
                                    ModBlocks.DARK_OAK_CALCITE_DRAWER.get(),
                                    ModBlocks.OAK_ANDESITE_DRAWER.get(),

                                    ModBlocks.WHITE_KITCHEN_DRAWER.get(),
                                    ModBlocks.LIGHT_GRAY_KITCHEN_DRAWER.get(),
                                    ModBlocks.GRAY_KITCHEN_DRAWER.get(),
                                    ModBlocks.BLACK_KITCHEN_DRAWER.get(),
                                    ModBlocks.RED_KITCHEN_DRAWER.get(),
                                    ModBlocks.ORANGE_KITCHEN_DRAWER.get(),
                                    ModBlocks.YELLOW_KITCHEN_DRAWER.get(),
                                    ModBlocks.LIME_KITCHEN_DRAWER.get(),
                                    ModBlocks.GREEN_KITCHEN_DRAWER.get(),
                                    ModBlocks.CYAN_KITCHEN_DRAWER.get(),
                                    ModBlocks.LIGHT_BLUE_KITCHEN_DRAWER.get(),
                                    ModBlocks.BLUE_KITCHEN_DRAWER.get(),
                                    ModBlocks.PURPLE_KITCHEN_DRAWER.get(),
                                    ModBlocks.MAGENTA_KITCHEN_DRAWER.get(),
                                    ModBlocks.PINK_KITCHEN_DRAWER.get(),
                                    ModBlocks.BROWN_KITCHEN_DRAWER.get()
                            )
                            .build(null)
            );





    public static final Supplier<BlockEntityType<CabinetBlockEntity>> CUSTOM_CABINET_BE =
            BLOCK_ENTITIES.register("cabinet", () ->
                    BlockEntityType.Builder
                            .of(CabinetBlockEntity::new,
                                    ModBlocks.OAK_CABINET.get(),
                                    ModBlocks.SPRUCE_CABINET.get(),
                                    ModBlocks.BIRCH_CABINET.get(),
                                    ModBlocks.JUNGLE_CABINET.get(),
                                    ModBlocks.ACACIA_CABINET.get(),
                                    ModBlocks.DARK_OAK_CABINET.get(),
                                    ModBlocks.MANGROVE_CABINET.get(),
                                    ModBlocks.CHERRY_CABINET.get(),
                                    ModBlocks.BAMBOO_CABINET.get(),
                                    ModBlocks.CRIMSON_CABINET.get(),
                                    ModBlocks.WARPED_CABINET.get(),
                                    ModBlocks.STRIPPED_ACACIA_CABINET.get(),
                                    ModBlocks.STRIPPED_OAK_CABINET.get(),
                                    ModBlocks.STRIPPED_SPRUCE_CABINET.get(),
                                    ModBlocks.STRIPPED_JUNGLE_CABINET.get(),
                                    ModBlocks.STRIPPED_BIRCH_CABINET.get(),
                                    ModBlocks.STRIPPED_MANGROVE_CABINET.get(),
                                    ModBlocks.STRIPPED_DARK_OAK_CABINET.get(),
                                    ModBlocks.STRIPPED_CHERRY_CABINET.get(),
                                    ModBlocks.STRIPPED_BAMBOO_CABINET.get(),
                                    ModBlocks.STRIPPED_CRIMSON_CABINET.get(),
                                    ModBlocks.STRIPPED_WARPED_CABINET.get(),
                                    ModBlocks.STONE_CABINET.get(),
                                    ModBlocks.GRANITE_CABINET.get(),
                                    ModBlocks.DIORITE_CABINET.get(),
                                    ModBlocks.DEEPSLATE_CABINET.get(),
                                    ModBlocks.DEEPSLATE_TILES_CABINET.get(),
                                    ModBlocks.BLACKSTONE_CABINET.get(),
                                    ModBlocks.SPRUCE_DIORITE_CABINET.get(),
                                    ModBlocks.DARK_OAK_CALCITE_CABINET.get(),
                                    ModBlocks.OAK_ANDESITE_CABINET.get(),

                                    ModBlocks.RED_CABINET.get(),
                                    ModBlocks.ORANGE_CABINET.get(),
                                    ModBlocks.YELLOW_CABINET.get(),
                                    ModBlocks.GREEN_CABINET.get(),
                                    ModBlocks.LIME_CABINET.get(),
                                    ModBlocks.GRAY_CABINET.get(),
                                    ModBlocks.LIGHT_GRAY_CABINET.get(),
                                    ModBlocks.BLUE_CABINET.get(),
                                    ModBlocks.CYAN_CABINET.get(),
                                    ModBlocks.LIGHT_BLUE_CABINET.get(),
                                    ModBlocks.MAGENTA_CABINET.get(),
                                    ModBlocks.PURPLE_CABINET.get(),
                                    ModBlocks.BROWN_CABINET.get(),
                                    ModBlocks.BLACK_CABINET.get(),
                                    ModBlocks.WHITE_CABINET.get(),
                                    ModBlocks.PINK_CABINET.get()



                            )
                            .build(null)
            );

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> PEDESTAL_BE =
            BLOCK_ENTITIES.register("pedestal_be", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new,
                    ModBlocks.PEDESTAL.get(),
                    ModBlocks.STONE_PEDESTAL.get(),
                    ModBlocks.DIORITE_PEDESTAL.get(),
                    ModBlocks.GRANITE_PEDESTAL.get(),
                    ModBlocks.DEEPSLATE_PEDESTAL.get(),
                    ModBlocks.DEEPSLATE_TILE_PEDESTAL.get(),
                    ModBlocks.BLACKSTONE_PEDESTAL.get()

            ).build(null));

    public static final Supplier<BlockEntityType<BedsideCabinetBlockEntity>> BEDSIDE_CABINET =
            BLOCK_ENTITIES.register("bedside_cabinet", () -> BlockEntityType.Builder.of(
                    BedsideCabinetBlockEntity::new,
                    ModBlocks.OAK_BEDSIDE.get(),
                    ModBlocks.SPRUCE_BEDSIDE.get(),
                    ModBlocks.BIRCH_BEDSIDE.get(),
                    ModBlocks.JUNGLE_BEDSIDE.get(),
                    ModBlocks.ACACIA_BEDSIDE.get(),
                    ModBlocks.MANGROVE_BEDSIDE.get(),
                    ModBlocks.DARK_OAK_BEDSIDE.get(),
                    ModBlocks.CHERRY_BEDSIDE.get(),
                    ModBlocks.BAMBOO_BEDSIDE.get(),
                    ModBlocks.CRIMSON_BEDSIDE.get(),
                    ModBlocks.WARPED_BEDSIDE.get()

            ).build(null));




    public static final Supplier<BlockEntityType<KitchenSinkBlockEntity>> KITCHEN_SINK =
            BLOCK_ENTITIES.register("kitchen_sink", () -> BlockEntityType.Builder.of(
                   KitchenSinkBlockEntity::new,
                    ModBlocks.OAK_SINK.get(),
                    ModBlocks.SPRUCE_SINK.get(),
                    ModBlocks.BIRCH_SINK.get(),
                    ModBlocks.JUNGLE_SINK.get(),
                    ModBlocks.ACACIA_SINK.get(),
                    ModBlocks.MANGROVE_SINK.get(),
                    ModBlocks.DARK_OAK_SINK.get(),
                    ModBlocks.CHERRY_SINK.get(),
                    ModBlocks.BAMBOO_SINK.get(),
                    ModBlocks.CRIMSON_SINK.get(),
                    ModBlocks.WARPED_SINK.get(),

                    ModBlocks.OAK_SINK_DARK.get(),
                    ModBlocks.SPRUCE_SINK_DARK.get(),
                    ModBlocks.BIRCH_SINK_DARK.get(),
                    ModBlocks.JUNGLE_SINK_DARK.get(),
                    ModBlocks.ACACIA_SINK_DARK.get(),
                    ModBlocks.MANGROVE_SINK_DARK.get(),
                    ModBlocks.DARK_OAK_SINK_DARK.get(),
                    ModBlocks.CHERRY_SINK_DARK.get(),
                    ModBlocks.BAMBOO_SINK_DARK.get(),
                    ModBlocks.CRIMSON_SINK_DARK.get(),
                    ModBlocks.WARPED_SINK_DARK.get(),

                    ModBlocks.RED_SINK.get(),
                    ModBlocks.ORANGE_SINK.get(),
                    ModBlocks.YELLOW_SINK.get(),
                    ModBlocks.GREEN_SINK.get(),
                    ModBlocks.LIME_SINK.get(),
                    ModBlocks.GRAY_SINK.get(),
                    ModBlocks.LIGHT_GRAY_SINK.get(),
                    ModBlocks.BLUE_SINK.get(),
                    ModBlocks.CYAN_SINK.get(),
                    ModBlocks.LIGHT_BLUE_SINK.get(),
                    ModBlocks.MAGENTA_SINK.get(),
                    ModBlocks.PURPLE_SINK.get(),
                    ModBlocks.BROWN_SINK.get(),
                    ModBlocks.BLACK_SINK.get(),
                    ModBlocks.WHITE_SINK.get(),
                    ModBlocks.PINK_SINK.get()

            ).build(null));

    public static final Supplier<BlockEntityType<TecqueBlockEntity>> GLASS_TECQUE =
            BLOCK_ENTITIES.register("glass_tecque", () -> BlockEntityType.Builder.of(
                   TecqueBlockEntity::new,
                    ModBlocks.STONE_GLASS_TECQUE.get(),
                    ModBlocks.SPRUCE_GLASS_TECQUE.get(),
                    ModBlocks.ACACIA_GLASS_TECQUE.get(),
                    ModBlocks.OAK_GLASS_TECQUE.get(),
                    ModBlocks.BIRCH_GLASS_TECQUE.get(),
                    ModBlocks.JUNGLE_GLASS_TECQUE.get(),
                    ModBlocks.MANGROVE_GLASS_TECQUE.get(),
                    ModBlocks.DARK_OAK_GLASS_TECQUE.get(),
                    ModBlocks.CHERRY_GLASS_TECQUE.get(),
                    ModBlocks.BAMBOO_GLASS_TECQUE.get(),
                    ModBlocks.CRIMSON_GLASS_TECQUE.get(),
                    ModBlocks.WARPED_GLASS_TECQUE.get()


            ).build(null));


    public static final Supplier<BlockEntityType<CrateBlockEntity>> STORAGE_CRATE =
            BLOCK_ENTITIES.register("crate", () -> BlockEntityType.Builder.of(
                    CrateBlockEntity::new,
                    ModBlocks.OAK_CRATE.get(),
                    ModBlocks.SPRUCE_CRATE.get(),
                    ModBlocks.BIRCH_CRATE.get(),
                    ModBlocks.JUNGLE_CRATE.get(),
                    ModBlocks.ACACIA_CRATE.get(),
                    ModBlocks.MANGROVE_CRATE.get(),
                    ModBlocks.DARK_OAK_CRATE.get(),
                    ModBlocks.CHERRY_CRATE.get(),
                    ModBlocks.BAMBOO_CRATE.get(),
                    ModBlocks.CRIMSON_CRATE.get(),
                    ModBlocks.WARPED_CRATE.get()


            ).build(null));


    public static final Supplier<BlockEntityType<ShelfBlockEntity>> SHELF_BE =
            BLOCK_ENTITIES.register("shelf", () -> BlockEntityType.Builder.of(
                    ShelfBlockEntity::new,
                    ModBlocks.ACACIA_SHELF.get(),
                    ModBlocks.OAK_SHELF.get(),
                    ModBlocks.SPRUCE_SHELF.get(),
                    ModBlocks.BIRCH_SHELF.get(),
                    ModBlocks.JUNGLE_SHELF.get(),
                    ModBlocks.MANGROVE_SHELF.get(),
                    ModBlocks.DARK_OAK_SHELF.get(),
                    ModBlocks.CHERRY_SHELF.get(),
                    ModBlocks.CRIMSON_SHELF.get(),
                    ModBlocks.BAMBOO_SHELF.get(),
                    ModBlocks.WARPED_SHELF.get()


            ).build(null));

    public static final Supplier<BlockEntityType<DigitalClockBlockEntity>> DIGITAL_CLOCK =
            BLOCK_ENTITIES.register("digital_clock", () -> BlockEntityType.Builder.of(
                    DigitalClockBlockEntity::new,
                    ModBlocks.RED_DIGITAL_CLOCK.get(),
                    ModBlocks.ORANGE_DIGITAL_CLOCK.get(),
                    ModBlocks.YELLOW_DIGITAL_CLOCK.get(),
                    ModBlocks.GREEN_DIGITAL_CLOCK.get(),
                    ModBlocks.LIME_DIGITAL_CLOCK.get(),
                    ModBlocks.GRAY_DIGITAL_CLOCK.get(),
                    ModBlocks.LIGHT_GRAY_DIGITAL_CLOCK.get(),
                    ModBlocks.BLUE_DIGITAL_CLOCK.get(),
                    ModBlocks.CYAN_DIGITAL_CLOCK.get(),
                    ModBlocks.LIGHT_BLUE_DIGITAL_CLOCK.get(),
                    ModBlocks.MAGENTA_DIGITAL_CLOCK.get(),
                    ModBlocks.PURPLE_DIGITAL_CLOCK.get(),
                    ModBlocks.BROWN_DIGITAL_CLOCK.get(),
                    ModBlocks.BLACK_DIGITAL_CLOCK.get(),
                    ModBlocks.WHITE_DIGITAL_CLOCK.get(),
                    ModBlocks.PINK_DIGITAL_CLOCK.get()


            ).build(null));


    public static final Supplier<BlockEntityType<OvenBlockEntity>> OVEN =
            BLOCK_ENTITIES.register("oven", () -> BlockEntityType.Builder.of(
                    OvenBlockEntity::new,
                    ModBlocks.OAK_OVEN.get(),
                    ModBlocks.SPRUCE_OVEN.get(),
                    ModBlocks.BIRCH_OVEN.get(),
                    ModBlocks.JUNGLE_OVEN.get(),
                    ModBlocks.ACACIA_OVEN.get(),
                    ModBlocks.DARK_OAK_OVEN.get(),
                    ModBlocks.MANGROVE_OVEN.get(),
                    ModBlocks.CHERRY_OVEN.get(),
                    ModBlocks.BAMBOO_OVEN.get(),
                    ModBlocks.CRIMSON_OVEN.get(),
                    ModBlocks.WARPED_OVEN.get(),

                    ModBlocks.STRIPPED_OAK_OVEN.get(),
                    ModBlocks.STRIPPED_SPRUCE_OVEN.get(),
                    ModBlocks.STRIPPED_BIRCH_OVEN.get(),
                    ModBlocks.STRIPPED_JUNGLE_OVEN.get(),
                    ModBlocks.STRIPPED_ACACIA_OVEN.get(),
                    ModBlocks.STRIPPED_DARK_OAK_OVEN.get(),
                    ModBlocks.STRIPPED_MANGROVE_OVEN.get(),
                    ModBlocks.STRIPPED_CHERRY_OVEN.get(),
                    ModBlocks.STRIPPED_BAMBOO_OVEN.get(),
                    ModBlocks.STRIPPED_CRIMSON_OVEN.get(),
                    ModBlocks.STRIPPED_WARPED_OVEN.get(),
                    ModBlocks.SPRUCE_DIORITE_OVEN.get(),
                    ModBlocks.DARK_OAK_CALCITE_OVEN.get(),
                    ModBlocks.OAK_ANDESITE_OVEN.get(),

                    ModBlocks.WHITE_OVEN.get(),
                    ModBlocks.LIGHT_GRAY_OVEN.get(),
                    ModBlocks.GRAY_OVEN.get(),
                    ModBlocks.BLACK_OVEN.get(),
                    ModBlocks.RED_OVEN.get(),
                    ModBlocks.ORANGE_OVEN.get(),
                    ModBlocks.YELLOW_OVEN.get(),
                    ModBlocks.LIME_OVEN.get(),
                    ModBlocks.GREEN_OVEN.get(),
                    ModBlocks.CYAN_OVEN.get(),
                    ModBlocks.LIGHT_BLUE_OVEN.get(),
                    ModBlocks.BLUE_OVEN.get(),
                    ModBlocks.PURPLE_OVEN.get(),
                    ModBlocks.MAGENTA_OVEN.get(),
                    ModBlocks.PINK_OVEN.get(),
                    ModBlocks.BROWN_OVEN.get()




            ).build(null));

    public static final Supplier<BlockEntityType<MicrowaveBlockEntity>> MICROWAVE =
            BLOCK_ENTITIES.register("microwave", () -> BlockEntityType.Builder.of(
                    MicrowaveBlockEntity::new,
                    ModBlocks.LIGHT_MICROWAVE.get(),
                    ModBlocks.DARK_MICROWAVE.get()


            ).build(null));

    public static final Supplier<BlockEntityType<DeskCabinetBlockEntity>> DESK_CABINET =
            BLOCK_ENTITIES.register("desk_cabinet", ()-> BlockEntityType.Builder.of(
                    DeskCabinetBlockEntity::new,
                    ModBlocks.OAK_DESK_CABINET.get(),
                    ModBlocks.SPRUCE_DESK_CABINET.get(),
                    ModBlocks.BIRCH_DESK_CABINET.get(),
                    ModBlocks.JUNGLE_DESK_CABINET.get(),
                    ModBlocks.ACACIA_DESK_CABINET.get(),
                    ModBlocks.DARK_OAK_DESK_CABINET.get(),
                    ModBlocks.MANGROVE_DESK_CABINET.get(),
                    ModBlocks.CHERRY_DESK_CABINET.get(),
                    ModBlocks.BAMBOO_DESK_CABINET.get(),
                    ModBlocks.CRIMSON_DESK_CABINET.get(),
                    ModBlocks.WARPED_DESK_CABINET.get()

            ).build(null));

    public static final Supplier<BlockEntityType<FridgeBlockEntity>> FRIDGE =
            BLOCK_ENTITIES.register("fridge", ()-> BlockEntityType.Builder.of(
                    FridgeBlockEntity::new,
                    ModBlocks.FRIDGE_LIGHT.get(),
                    ModBlocks.FRIDGE_DARK.get()
            ).build(null));



    public static final Supplier<BlockEntityType<FreezerBlockEntity>> FREEZER =
            BLOCK_ENTITIES.register("freezer", ()-> BlockEntityType.Builder.of(
                    FreezerBlockEntity::new,
                    ModBlocks.FRIDGE_LIGHT.get(),
                    ModBlocks.FRIDGE_DARK.get()
            ).build(null));





    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}