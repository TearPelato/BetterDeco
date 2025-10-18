package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.KitchenSinkBlock;
import net.tier1234.better_deco.block.entity.core.FluidContainerBlockEntityUtil;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.FluidContainerRenderer;
import net.tier1234.better_deco.block.entity.renderer.core.FluidRenderState;

import javax.annotation.Nullable;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity, FluidRenderState> {

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {

    }

    @Override
    public FluidRenderState createRenderState() {
        return new FluidRenderState();
    }

    @Override
    public void extractRenderState(KitchenSinkBlockEntity entity, FluidRenderState renderState, float partialTick, Vec3 camera, @Nullable ModelFeatureRenderer.CrumblingOverlay overlay)
    {
        BlockEntityRenderer.super.extractRenderState(entity, renderState, partialTick, camera, overlay);
        FluidRenderState.extract(renderState, (FluidContainerBlockEntityUtil) entity, entity.getLevel(), entity.getBlockPos());
        BlockState blockState = entity.getBlockState();
        if(blockState.hasProperty(KitchenSinkBlock.DIRECTION))
        {
            Direction direction = blockState.getValue(KitchenSinkBlock.DIRECTION);
            renderState.box = FluidContainerRenderer.createRotatedBox(direction, 2, 8, 2, 12, 15, 14);
        }
    }



    @Override
    public void submit(FluidRenderState fluidRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
          FluidContainerRenderer.submit(fluidRenderState, poseStack, submitNodeCollector);

    }
}
