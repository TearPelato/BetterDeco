package net.tier1234.better_deco.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.block.custom.VerticalSlabBlock;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BetterDeco.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        createVerticalSlab(ModBlocks.OAK_VERTICAL_SLAB.get(), ResourceLocation.parse("block/oak_planks"), BetterDeco.id("block/oak_vertical_slab"));
        createVerticalSlab(ModBlocks.SPRUCE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/spruce_planks"), BetterDeco.id("block/spruce_vertical_slab"));
        createVerticalSlab(ModBlocks.BIRCH_VERTICAL_SLAB.get(), ResourceLocation.parse("block/birch_planks"), BetterDeco.id("block/birch_vertical_slab"));
        createVerticalSlab(ModBlocks.JUNGLE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/jungle_planks"), BetterDeco.id("block/jungle_vertical_slab"));
        createVerticalSlab(ModBlocks.ACACIA_VERTICAL_SLAB.get(), ResourceLocation.parse("block/acacia_planks"), BetterDeco.id("block/acacia_vertical_slab"));
        createVerticalSlab(ModBlocks.DARK_OAK_VERTICAL_SLAB.get(), ResourceLocation.parse("block/dark_oak_planks"), BetterDeco.id("block/dark_oak_vertical_slab"));
        createVerticalSlab(ModBlocks.MANGROVE_VERTICAL_SLAB.get(), ResourceLocation.parse("block/mangrove_planks"), BetterDeco.id("block/mangrove_vertical_slab"));
        createVerticalSlab(ModBlocks.CHERRY_VERTICAL_SLAB.get(), ResourceLocation.parse("block/cherry_planks"), BetterDeco.id("block/cherry_vertical_slab"));
        createVerticalSlab(ModBlocks.BAMBOO_VERTICAL_SLAB.get(), ResourceLocation.parse("block/bamboo_planks"), BetterDeco.id("block/bamboo_vertical_slab"));
        createVerticalSlab(ModBlocks.CRIMSON_VERTICAL_SLAB.get(), ResourceLocation.parse("block/crimson_planks"), BetterDeco.id("block/crimson_vertical_slab"));
        createVerticalSlab(ModBlocks.WARPED_VERTICAL_SLAB.get(), ResourceLocation.parse("block/warped_planks"), BetterDeco.id("block/warped_vertical_slab"));
    }

    public void createVerticalSlab(VerticalSlabBlock block, ResourceLocation doubleFile, ResourceLocation slabFile) {
        createVerticalSlab(
                block,
                new ModelFile.ExistingModelFile(doubleFile, models().existingFileHelper),
                new ModelFile.ExistingModelFile(slabFile, models().existingFileHelper)
        );
    }

    public void createVerticalSlab(VerticalSlabBlock block, ModelFile doubleFile, ModelFile slabFile) {
        getVariantBuilder(block)
                .forAllStates(state -> {
                    if(state.getValue(VerticalSlabBlock.TYPE) == SlabType.DOUBLE) return ConfiguredModel.builder()
                            .modelFile(doubleFile).build();
                    return ConfiguredModel.builder()
                            .modelFile(slabFile).rotationY(((int) VerticalSlabBlock.toDirection(state).toYRot() + 180) % 360).build();
                });
    }
}
