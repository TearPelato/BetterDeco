package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Direction;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.tier1234.better_deco.block.custom.FurnitureHorizontalBlock;
import net.tier1234.better_deco.block.entity.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.ModBlockEntityRendererState;
import org.joml.Matrix4f;

import java.util.concurrent.CompletableFuture;

public class KitchenSinkBlockEntityRenderer implements BlockEntityRenderer<KitchenSinkBlockEntity, ModBlockEntityRendererState>
{
    public KitchenSinkBlockEntityRenderer(BlockEntityRendererProvider.Context context) {}


    public void render(KitchenSinkBlockEntity tileEntity, float partialTicks, PoseStack poseStack, MultiBufferSource source, int light, int overlay, Vec3 vec3)
    {
        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        Direction direction = tileEntity.getBlockState().getValue(FurnitureHorizontalBlock.DIRECTION);
        poseStack.mulPose(Axis.YP.rotationDegrees(direction.get2DDataValue() * -90F - 90F));
        poseStack.translate(-0.5, -0.5, -0.5);
        poseStack.popPose();
    }



    @Override
    public ModBlockEntityRendererState createRenderState() {
        return new ModBlockEntityRendererState();
    }

    @Override
    public void submit(ModBlockEntityRendererState modBlockEntityRendererState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState cameraRenderState) {

    }
}
