package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.KitchenSinkBlock;
import net.tier1234.better_deco.block.entity.core.FluidContainerRenderer;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.FluidContainerRendererState;
import net.tier1234.better_deco.block.entity.renderer.core.IFluidContainerRenderer;
import org.jetbrains.annotations.Nullable;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity, FluidContainerRendererState> {

    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {}

    @Override
    public void extractRenderState (KitchenSinkBlockEntity entity, FluidContainerRendererState renderState, float partialTick, Vec3 camera, @Nullable ModelFeatureRenderer.CrumblingOverlay overlay) {
        BlockEntityRenderer.super.extractRenderState(entity, renderState, partialTick, camera, overlay);
        FluidContainerRendererState.extract(renderState, (IFluidContainerRenderer) entity, entity.getLevel(), entity.getBlockPos());
        BlockState blockState = entity.getBlockState();
        if(blockState.hasProperty(KitchenSinkBlock.DIRECTION))
        {
            Direction direction = blockState.getValue(KitchenSinkBlock.DIRECTION);
            renderState.box = FluidContainerRenderer.createRotatedBox(direction, 2, 8, 2, 12, 15, 14);
        }
    }

    @Override
    public FluidContainerRendererState createRenderState() {
        return new FluidContainerRendererState();
    }

    @Override
    public void submit(FluidContainerRendererState fluidContainerRendererState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {
        //FluidContainerRenderer.drawContainer(be.getLevel(), be.getBlockPos(), be, box, ms, buf, light);
    }
}

