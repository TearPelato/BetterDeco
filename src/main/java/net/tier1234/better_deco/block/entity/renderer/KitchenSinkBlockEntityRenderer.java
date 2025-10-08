package net.tier1234.better_deco.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity> {
    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }
    @Override
    public void render(KitchenSinkBlockEntity be, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Fluid fluid = be.getFluid();
        Level level = be.getLevel();
        if (fluid == Fluids.EMPTY || level == null) return;

        BlockState state = be.getBlockState();
        if (!state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) return;
        Direction facing = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        AABB box = FluidContainerRenderer.createRotatedBox(facing, 2, 13, 2, 14, 15.9, 14);
        FluidContainerRenderer.drawContainer(level, be.getBlockPos(), be, box, poseStack, bufferSource, packedLight);
    }
}