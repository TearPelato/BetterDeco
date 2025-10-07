package net.tier1234.better_deco.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.tier1234.better_deco.block.custom.FurnitureHorizontalBlock;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import org.joml.Matrix4f;

import java.util.Objects;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity> {
    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
    }

    public void render(KitchenSinkBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, int packedOverlay) {
        Fluid fluid = blockEntity.getFluid();
        if (fluid == Fluids.EMPTY || blockEntity.getLevel() == null) {
            return;
        }

        BlockState state = blockEntity.getBlockState();
        if (!state.hasProperty(BlockStateProperties.HORIZONTAL_FACING)) {
            return;
        }

        Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        Level level = Objects.requireNonNull(blockEntity.getLevel());
        AABB box = SimpleFluidRenderer.createRotatedBox(direction, 2, 13, 2, 14, 15.9, 14);
        SimpleFluidRenderer.drawContainer(level, blockEntity.getBlockPos(), blockEntity, box, poseStack, bufferSource, packedLight);
    }
}