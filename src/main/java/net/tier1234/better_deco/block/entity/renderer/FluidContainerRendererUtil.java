package net.tier1234.better_deco.block.entity.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import org.jetbrains.annotations.Nullable;

public class FluidContainerRendererUtil {
    public static TextureAtlasSprite[] getSprites(Fluid fluid) {
        IClientFluidTypeExtensions ext = IClientFluidTypeExtensions.of(fluid);
        ResourceLocation stillRL = ext.getStillTexture();
        ResourceLocation flowRL = ext.getFlowingTexture();

        TextureAtlas atlas = (TextureAtlas) Minecraft.getInstance().getTextureManager().getTexture(InventoryMenu.BLOCK_ATLAS);

        TextureAtlasSprite stillSprite = stillRL != null ? atlas.getSprite(stillRL) : null;
        TextureAtlasSprite flowSprite = flowRL != null ? atlas.getSprite(flowRL) : null;

        if (stillSprite == null && flowSprite == null) return null;

        return new TextureAtlasSprite[] { stillSprite, flowSprite };
    }

    public static int getColor(FluidStack fluidStack, @Nullable BlockAndTintGetter world, @Nullable BlockPos pos) {
        IClientFluidTypeExtensions ext = IClientFluidTypeExtensions.of(fluidStack.getFluid());

        FluidState state = null;
        if (world != null && pos != null) {
            FluidState worldState = world.getFluidState(pos);
            if (worldState.is(fluidStack.getFluid())) {
                state = worldState;
            }
        }

        if (state == null) state = fluidStack.getFluid().defaultFluidState();

        int tint = ext.getTintColor(state, world, pos);
        return tint != -1 ? tint : 0xFFFFFFFF;
    }
}