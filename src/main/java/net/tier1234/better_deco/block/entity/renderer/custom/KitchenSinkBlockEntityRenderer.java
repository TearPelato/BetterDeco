package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;
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

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}

    @Override
    public FluidRenderState createRenderState() {
        return new FluidRenderState();
    }

    @Override
    public void extractRenderState(KitchenSinkBlockEntity blockEntity, FluidRenderState state,
                                   float partialTick, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTick, cameraPos, crumblingOverlay);

        if (blockEntity.getLevel() == null) return;

        BlockState blockState = blockEntity.getBlockState();
        if (!blockState.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) return;

        state.facing = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
        state.fluid = blockEntity.getFluid();
        state.level = blockEntity.getLevel();
        state.pos = blockEntity.getBlockPos();
        state.be = blockEntity;
    }

    @Override
    public void submit(FluidRenderState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        if (state.fluid == Fluids.EMPTY || state.level == null || state.facing == null) return;
        poseStack.pushPose();
        Direction dir = state.facing;

        poseStack.translate(0.5, 0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(-90F * dir.get2DDataValue()));
        poseStack.translate(-0.5, 0, -0.5);

        AABB box = FluidContainerRenderer.createRotatedBox(dir, 2, 13, 2, 14, 15.9, 14);
        int light=0;
                //= getLightLevel(state.level, state.pos);

        FluidContainerRenderer.drawContainer(state.level, state.pos, state.be, box, poseStack,
                Minecraft.getInstance().renderBuffers().bufferSource(), light);

        poseStack.popPose();
    }

  /*  private int getLightLevel(Level level, BlockPos pos) {
        if (level == null || pos == null) return LightTexture.pack(15, 15);
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }*/
}