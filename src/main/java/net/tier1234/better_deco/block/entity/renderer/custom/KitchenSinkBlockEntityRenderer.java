package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.BlockAndTintGetter;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.tearpelato.deco_lib.api.fluid.block_entity.FluidContainerBlockEntity;
import net.tearpelato.deco_lib.api.fluid.renderer.FluidContainerRenderer;
import net.tearpelato.deco_lib.api.fluid.renderer.core.FluidSprites;
import net.tearpelato.deco_lib.api.fluid.renderer.render_state.FluidRenderState;
import net.tier1234.better_deco.block.custom.KitchenSinkBlock;

import javax.annotation.Nullable;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<FluidContainerBlockEntity, FluidRenderState> {

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public FluidRenderState createRenderState() {
        return new FluidRenderState();
    }

    @Override
    public void extractRenderState(FluidContainerBlockEntity blockEntity, FluidRenderState state,
                                   float partialTick, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTick, cameraPos, crumblingOverlay);
        if (blockEntity.getLevel() == null) return;
        BlockState blockState = blockEntity.getBlockState();

        state.facing = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
        state.fluid = blockEntity.getFluid();
        state.level = blockEntity.getLevel();
        state.world = (BlockAndTintGetter) blockEntity.getLevel();
        state.be = blockEntity;

        // Fluid Sprites
        if (state.fluid != Fluids.EMPTY && state.fluid != null) {
            FluidState fluidState = state.fluid.defaultFluidState();
            state.fluidSprites = new FluidSprites(null, null).getFluidSprites(fluidState);
        } else {
            state.fluidSprites = null;
        }
        FluidRenderState.extract(state, blockEntity.getLevel(), blockEntity.getBlockPos());
        if(blockState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
            Direction direction = blockState.getValue(KitchenSinkBlock.DIRECTION);
            state.box = FluidContainerRenderer.createRotatedBox(direction,2, 8, 2, 12, 16, 14);
        }
    }

    @Override
    public void submit(FluidRenderState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        FluidContainerRenderer.submit(state, poseStack, submitNodeCollector);
    }
}