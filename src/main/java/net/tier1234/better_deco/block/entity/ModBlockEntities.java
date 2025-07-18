package net.tier1234.better_deco.block.entity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;

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
                                    ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER.get()
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
                                    ModBlocks.STRIPPED_WARPED_CABINET.get()
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

    public static final Supplier<BlockEntityType<PedestalBlockEntity>> BEDSIDE_CABINET =
            BLOCK_ENTITIES.register("bedside_cabinet", () -> BlockEntityType.Builder.of(
                    PedestalBlockEntity::new,
                    ModBlocks.OAK_BEDSIDE.get(),
                    ModBlocks.SPRUCE_BEDSIDE.get(),
                    ModBlocks.BIRCH_BEDSIDE.get(),
                    ModBlocks.JUNGLE_BEDSIDE.get(),
                    ModBlocks.ACACIA_BEDSIDE.get(),
                    ModBlocks.MANGROVE_BEDSIDE.get()

            ).build(null));



    public static final Supplier<BlockEntityType<CrateBlockEntity>> STORAGE_CRATE =
            BLOCK_ENTITIES.register("storage_crate", () -> BlockEntityType.Builder.of(
                    CrateBlockEntity::new,
                    ModBlocks.OAK_CRATE.get()

            ).build(null));





    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}