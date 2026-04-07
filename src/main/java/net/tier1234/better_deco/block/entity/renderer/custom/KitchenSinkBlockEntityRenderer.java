package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.tearpelato.deco_lib.api.fluid.renderer.FluidContainerRenderer;
import net.tearpelato.deco_lib.api.fluid.renderer.core.FluidSprites;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.render_state.KitchenSinkBlockEntityRenderState;

import javax.annotation.Nullable;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity, KitchenSinkBlockEntityRenderState> {

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public KitchenSinkBlockEntityRenderState createRenderState() {
        return new KitchenSinkBlockEntityRenderState();
    }

    @Override
    public void extractRenderState(KitchenSinkBlockEntity blockEntity, KitchenSinkBlockEntityRenderState state,
                                   float partialTick, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTick, cameraPos, crumblingOverlay);

        if (blockEntity.getLevel() == null) return;

        BlockState blockState = blockEntity.getBlockState();
        if (!blockState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) return;

        state.facing = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
        state.fluid = blockEntity.getFluid();
        state.level = blockEntity.getLevel();
        state.world = (BlockAndTintGetter) blockEntity.getLevel();
        state.pos = blockEntity.getBlockPos();
        state.be = blockEntity;

        // Fluid Sprites
        if (state.fluid != Fluids.EMPTY && state.fluid != null) {
            FluidState fluidState = state.fluid.defaultFluidState();
            state.fluidSprites = new FluidSprites(null, null).getFluidSprites(fluidState);
        } else {
            state.fluidSprites = null;
        }
    }

    @Override
    public void submit(KitchenSinkBlockEntityRenderState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        if (state.fluid == Fluids.EMPTY || state.fluidSprites == null || state.world == null) {
            return;
        }

        poseStack.pushPose();
        Direction dir = state.facing;

        poseStack.translate(0.5, 0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(-90F * dir.get2DDataValue()));
        poseStack.translate(-0.5, 0, -0.5);

        AABB box = FluidContainerRenderer.createRotatedBox(dir, 2, 13, 2, 14, 15.9, 14);

        FluidContainerRenderer.drawContainer(state, state.world, state.pos, state.be, box, poseStack,
                Minecraft.getInstance().renderBuffers().bufferSource());

        poseStack.popPose();
    }
}