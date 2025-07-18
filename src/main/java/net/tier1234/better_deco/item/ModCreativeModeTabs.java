package net.tier1234.better_deco.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterDeco.MOD_ID);

    //BlockTab
    public static final Supplier<CreativeModeTab> BETTER_DECO_BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OAK_BARREL.get()))
                    .title(Component.translatable("creativetab.better_deco.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.SPRUCE_PLANKS_BRICKS);
                        output.accept(ModBlocks.BIRCH_PLANKS_BRICKS);
                        output.accept(ModBlocks.JUNGLE_PLANKS_BRICKS);
                        output.accept(ModBlocks.ACACIA_PLANKS_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_BRICKS);
                        output.accept(ModBlocks.MANGROVE_PLANKS_BRICKS);
                        output.accept(ModBlocks.CHERRY_PLANKS_BRICKS);
                        output.accept(ModBlocks.BAMBOO_PLANKS_BRICKS);
                        output.accept(ModBlocks.CRIMSON_PLANKS_BRICKS);
                        output.accept(ModBlocks.WARPED_PLANKS_BRICKS);
                        output.accept(ModBlocks.OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.SPRUCE_PLANKS_PILLAR);
                        output.accept(ModBlocks.BIRCH_PLANKS_PILLAR);
                        output.accept(ModBlocks.JUNGLE_PLANKS_PILLAR);
                        output.accept(ModBlocks.ACACIA_PLANKS_PILLAR);
                        output.accept(ModBlocks.DARK_OAK_PLANKS_PILLAR);
                        output.accept(ModBlocks.MANGROVE_PLANKS_PILLAR);
                        output.accept(ModBlocks.CHERRY_PLANKS_PILLAR);
                        output.accept(ModBlocks.BAMBOO_PLANKS_PILLAR);
                        output.accept(ModBlocks.CRIMSON_PLANKS_PILLAR);
                        output.accept(ModBlocks.WARPED_PLANKS_PILLAR);
                        output.accept(ModBlocks.OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.SPRUCE_SOFT_BRICKS);
                        output.accept(ModBlocks.BIRCH_SOFT_BRICKS);
                        output.accept(ModBlocks.JUNGLE_SOFT_BRICKS);
                        output.accept(ModBlocks.ACACIA_SOFT_BRICKS);
                        output.accept(ModBlocks.DARK_OAK_SOFT_BRICKS);
                        output.accept(ModBlocks.MANGROVE_SOFT_BRICKS);
                        output.accept(ModBlocks.CHERRY_SOFT_BRICKS);
                        output.accept(ModBlocks.BAMBOO_SOFT_BRICKS);
                        output.accept(ModBlocks.CRIMSON_SOFT_BRICKS);
                        output.accept(ModBlocks.WARPED_SOFT_BRICKS);
                        output.accept(ModBlocks.OAK_BARREL);
                        output.accept(Blocks.BARREL);
                        output.accept(ModBlocks.BIRCH_BARREL);
                        output.accept(ModBlocks.JUNGLE_BARREL);
                        output.accept(ModBlocks.ACACIA_BARREL);
                        output.accept(ModBlocks.DARK_OAK_BARREL);
                        output.accept(ModBlocks.MANGROVE_BARREL);
                        output.accept(ModBlocks.CHERRY_BARREL);
                        output.accept(ModBlocks.BAMBOO_BARREL);
                        output.accept(ModBlocks.CRIMSON_BARREL);
                        output.accept(ModBlocks.WARPED_BARREL);


































































                    }).build());

    //ItemTab
    public static final Supplier<CreativeModeTab> BETTER_DECO_ITEMS_TAB = CREATIVE_MODE_TAB.register("items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CHISEL.get()))
                    .title(Component.translatable("creativetab.better_deco.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CHISEL);
                        output.accept(ModBlocks.PEDESTAL);
                        output.accept(ModBlocks.STONE_PEDESTAL);
                        output.accept(ModBlocks.DIORITE_PEDESTAL);
                        output.accept(ModBlocks.GRANITE_PEDESTAL);
                        output.accept(ModBlocks.DEEPSLATE_PEDESTAL);
                        output.accept(ModBlocks.DEEPSLATE_TILE_PEDESTAL);
                        output.accept(ModBlocks.BLACKSTONE_PEDESTAL);

                    }).build());

//FurnitureTab
public static final Supplier<CreativeModeTab> BETTER_DECO_FURNITURE_TAB = CREATIVE_MODE_TAB.register("furnitures",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.OAK_KITCHEN_COUNTER.get()))
                .title(Component.translatable("creativetab.better_deco.furnitures"))
                .displayItems((itemDisplayParameters, output) -> {

                    output.accept(ModBlocks.OAK_KITCHEN_COUNTER);
                    output.accept(ModBlocks.SPRUCE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.BIRCH_KITCHEN_COUNTER);
                    output.accept(ModBlocks.JUNGLE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.ACACIA_KITCHEN_COUNTER);
                    output.accept(ModBlocks.DARK_OAK_KITCHEN_COUNTER);
                    output.accept(ModBlocks.MANGROVE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.CHERRY_KITCHEN_COUNTER);
                    output.accept(ModBlocks.BAMBOO_KITCHEN_COUNTER);
                    output.accept(ModBlocks.CRIMSON_KITCHEN_COUNTER);
                    output.accept(ModBlocks.WARPED_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_COUNTER);
                    output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_COUNTER);
                    output.accept(ModBlocks.OAK_KITCHEN_DRAWER);
                    output.accept(ModBlocks.SPRUCE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.BIRCH_KITCHEN_DRAWER);
                    output.accept(ModBlocks.JUNGLE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.ACACIA_KITCHEN_DRAWER);
                    output.accept(ModBlocks.DARK_OAK_KITCHEN_DRAWER);
                    output.accept(ModBlocks.MANGROVE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.CHERRY_KITCHEN_DRAWER);
                    output.accept(ModBlocks.BAMBOO_KITCHEN_DRAWER);
                    output.accept(ModBlocks.CRIMSON_KITCHEN_DRAWER);
                    output.accept(ModBlocks.WARPED_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_OAK_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_SPRUCE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_BIRCH_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_JUNGLE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_ACACIA_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_DARK_OAK_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_MANGROVE_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_CHERRY_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_BAMBOO_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_CRIMSON_KITCHEN_DRAWER);
                    output.accept(ModBlocks.STRIPPED_WARPED_KITCHEN_DRAWER);
                    output.accept(ModBlocks.OAK_CABINET);
                    output.accept(ModBlocks.SPRUCE_CABINET);
                    output.accept(ModBlocks.BIRCH_CABINET);
                    output.accept(ModBlocks.JUNGLE_CABINET);
                    output.accept(ModBlocks.ACACIA_CABINET);
                    output.accept(ModBlocks.DARK_OAK_CABINET);
                    output.accept(ModBlocks.MANGROVE_CABINET);
                    output.accept(ModBlocks.CHERRY_CABINET);
                    output.accept(ModBlocks.BAMBOO_CABINET);
                    output.accept(ModBlocks.CRIMSON_CABINET);
                    output.accept(ModBlocks.WARPED_CABINET);
                    output.accept(ModBlocks.STRIPPED_OAK_CABINET);
                    output.accept(ModBlocks.STRIPPED_SPRUCE_CABINET);
                    output.accept(ModBlocks.STRIPPED_BIRCH_CABINET);
                    output.accept(ModBlocks.STRIPPED_JUNGLE_CABINET);
                    output.accept(ModBlocks.STRIPPED_ACACIA_CABINET);
                    output.accept(ModBlocks.STRIPPED_DARK_OAK_CABINET);
                    output.accept(ModBlocks.STRIPPED_MANGROVE_CABINET);
                    output.accept(ModBlocks.STRIPPED_CHERRY_CABINET);
                    output.accept(ModBlocks.STRIPPED_BAMBOO_CABINET);
                    output.accept(ModBlocks.STRIPPED_CRIMSON_CABINET);
                    output.accept(ModBlocks.STRIPPED_WARPED_CABINET);
                    output.accept(ModBlocks.OAK_BEDSIDE);
                    output.accept(ModBlocks.SPRUCE_BEDSIDE);
                    output.accept(ModBlocks.BIRCH_BEDSIDE);
                    output.accept(ModBlocks.JUNGLE_BEDSIDE);
                    output.accept(ModBlocks.ACACIA_BEDSIDE);
                    output.accept(ModBlocks.MANGROVE_BEDSIDE);
                    output.accept(ModBlocks.OAK_TABLE);
                    output.accept(ModBlocks.SPRUCE_TABLE);
                    output.accept(ModBlocks.BIRCH_TABLE);
                    output.accept(ModBlocks.JUNGLE_TABLE);
                    output.accept(ModBlocks.ACACIA_TABLE);
                    output.accept(ModBlocks.DARK_OAK_TABLE);
                    output.accept(ModBlocks.MANGROVE_TABLE);
                    output.accept(ModBlocks.CHERRY_TABLE);
                    output.accept(ModBlocks.BAMBOO_TABLE);
                    output.accept(ModBlocks.CRIMSON_TABLE);
                    output.accept(ModBlocks.WARPED_TABLE);
                    output.accept(ModBlocks.OAK_CHAIR);
                    output.accept(ModBlocks.SPRUCE_CHAIR);
                    output.accept(ModBlocks.BIRCH_CHAIR);
                    output.accept(ModBlocks.JUNGLE_CHAIR);
                    output.accept(ModBlocks.ACACIA_CHAIR);
                    output.accept(ModBlocks.DARK_OAK_CHAIR);
                    output.accept(ModBlocks.MANGROVE_CHAIR);
                    output.accept(ModBlocks.CHERRY_CHAIR);
                    output.accept(ModBlocks.BAMBOO_CHAIR);
                    output.accept(ModBlocks.CRIMSON_CHAIR);
                    output.accept(ModBlocks.WARPED_CHAIR);
                    output.accept(ModBlocks.WITHE_SOFA);
                    output.accept(ModBlocks.LIGHT_GREY_SOFA);
                    output.accept(ModBlocks.GREY_SOFA);
                    output.accept(ModBlocks.BLACK_SOFA);
                    output.accept(ModBlocks.RED_SOFA);
                    output.accept(ModBlocks.ORANGE_SOFA);
                    output.accept(ModBlocks.YELLOW_SOFA);
                    output.accept(ModBlocks.LIME_SOFA);
                    output.accept(ModBlocks.GREEN_SOFA);
                    output.accept(ModBlocks.CYAN_SOFA);
                    output.accept(ModBlocks.LIGHT_BLUE_SOFA);
                    output.accept(ModBlocks.BLUE_SOFA);
                    output.accept(ModBlocks.PURPLE_SOFA);
                    output.accept(ModBlocks.MAGENTA_SOFA);
                    output.accept(ModBlocks.PINK_SOFA);
                    output.accept(ModBlocks.BROWN_SOFA);

                }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}