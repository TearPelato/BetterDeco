package net.tier1234.better_deco.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.init.ModBlocks;

public class ModBlockModelProvider extends BlockModelProvider {
    public ModBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BetterDeco.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

}