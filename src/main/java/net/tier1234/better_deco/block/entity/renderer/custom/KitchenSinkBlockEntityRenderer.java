package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.core_render.FluidContainerRenderer;
import net.tier1234.better_deco.block.entity.renderer.core.render_state.FluidRenderState;

import javax.annotation.Nullable;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity, FluidRenderState> {

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {

    }

    @Override
    public FluidRenderState createRenderState() {
        return new FluidRenderState();
    }

    @Override
    public void extractRenderState(
            KitchenSinkBlockEntity be,
            FluidRenderState renderState,
            float partialTick,
            Vec3 cameraPos,
            @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay
    ) {
        if (be == null || be.getLevel() == null || be.getFluid() == Fluids.EMPTY || be.getStoredAmount() <= 0) return;

        BlockState state = be.getBlockState();
        if (!state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) return;

        Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        AABB box = FluidContainerRenderer.createRotatedBox(dir, 2, 13, 2, 14, 15.9, 14);

        renderState.level = be.getLevel();
        renderState.fluid = be.getFluid();
        renderState.direction = dir;
        renderState.box = box;
        renderState.light = be.getLevel().getLightEmission(be.getBlockPos());
        renderState.blockPos = be.getBlockPos();

        int amount = be.getStoredAmount();
        int capacity = be.getCapacity();
        renderState.fullness = (capacity > 0) ? (float) amount / (float) capacity : 0f;
    }

    @Override
    public void submit(FluidRenderState renderState, PoseStack poseStack, SubmitNodeCollector collector, CameraRenderState camera) {
        if (renderState.level == null || renderState.fluid == Fluids.EMPTY || renderState.box == null || renderState.fullness <= 0f)
            return;

        poseStack.pushPose();
        final RenderType fluidRenderType = RenderType.translucentMovingBlock();
        MultiBufferSource bufferSource = Minecraft.getInstance().renderBuffers().bufferSource();
        VertexConsumer consumer = bufferSource.getBuffer(fluidRenderType);

        FluidContainerRenderer.drawContainer(renderState.level, renderState.blockPos,renderState.fluid, renderState.box, poseStack,renderState.fullness,renderState.light,consumer);

        if (bufferSource instanceof MultiBufferSource.BufferSource bs) {
            bs.endBatch(fluidRenderType);
        }

        poseStack.popPose();
    }
}
