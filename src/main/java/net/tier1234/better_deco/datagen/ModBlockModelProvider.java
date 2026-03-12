package net.tier1234.better_deco.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.block.ModBlocks;
import net.tier1234.better_deco.block.custom.VerticalSlabBlock;

public class ModBlockModelProvider extends BlockModelProvider {
    public ModBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterDeco.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        makeVerticalSlab(ModBlocks.OAK_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/oak_planks"));
        makeVerticalSlab(ModBlocks.SPRUCE_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/spruce_planks"));
        makeVerticalSlab(ModBlocks.BIRCH_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/birch_planks"));
        makeVerticalSlab(ModBlocks.JUNGLE_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/jungle_planks"));
        makeVerticalSlab(ModBlocks.ACACIA_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/acacia_planks"));
        makeVerticalSlab(ModBlocks.DARK_OAK_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/dark_oak_planks"));
        makeVerticalSlab(ModBlocks.MANGROVE_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/mangrove_planks"));
        makeVerticalSlab(ModBlocks.CHERRY_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/cherry_planks"));
        makeVerticalSlab(ModBlocks.BAMBOO_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/bamboo_planks"));
        makeVerticalSlab(ModBlocks.CRIMSON_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/crimson_planks"));
        makeVerticalSlab(ModBlocks.WARPED_VERTICAL_SLAB.get(), ResourceLocation.tryParse("block/warped_planks"));
    }

    public void makeVerticalSlab(VerticalSlabBlock block, ResourceLocation texture) {
        withExistingParent(BuiltInRegistries.BLOCK.getKey(block).getPath(), BetterDeco.id("block/template_vertical_slab"))
                .texture("texture", texture)
                .texture("particle", texture);
    }
}