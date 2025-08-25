package net.tier1234.better_deco.block.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.screen.custom.ShelfScreen;

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
                                    ModBlocks.BLACKSTONE_DRAWER.get()
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
                                    ModBlocks.BLACKSTONE_CABINET.get()
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
                    ModBlocks.WARPED_SINK.get()

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
                    ModBlocks.WARPED_OVEN.get()


            ).build(null));

    public static final Supplier<BlockEntityType<MicrowaveBlockEntity>> MICROWAVE =
            BLOCK_ENTITIES.register("microwave", () -> BlockEntityType.Builder.of(
                    MicrowaveBlockEntity::new,
                    ModBlocks.LIGHT_MICROWAVE.get()


            ).build(null));









    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}