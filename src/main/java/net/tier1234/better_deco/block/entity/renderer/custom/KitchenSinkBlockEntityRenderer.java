package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.Vec3;
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

        renderState.fluidSprites = null;
        renderState.fluidAmount = 0;
        renderState.fluidCapacity = 0;
        renderState.box = null;

        FluidRenderState.extract(renderState, entity, entity.getLevel(), entity.getBlockPos());
        if(renderState.valid())
        {
            BlockState blockState = entity.getBlockState();
            if(blockState.hasProperty(BlockStateProperties.HORIZONTAL_FACING))
            {
                Direction direction = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
                renderState.box = FluidContainerRenderer.createRotatedBox(direction, 2, 13, 2, 14, 15.9, 14);
            }
        }
    }


    @Override
    public void submit(FluidRenderState fluidRenderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
        FluidContainerRenderer.submit(fluidRenderState, poseStack, submitNodeCollector);
    }
}
