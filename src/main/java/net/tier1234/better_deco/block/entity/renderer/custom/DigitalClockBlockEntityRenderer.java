package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.DigitalClockBlock;
import net.tier1234.better_deco.block.entity.DigitalClockBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.ModBlockEntityRendererState;

public class DigitalClockBlockEntityRenderer implements BlockEntityRenderer<DigitalClockBlockEntity, ModBlockEntityRendererState> {

    private final Font font;

    public DigitalClockBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    public void render(DigitalClockBlockEntity blockEntity, float partialTicks, PoseStack poseStack,
                       MultiBufferSource buffer, int packedLight, int packedOverlay, Vec3 vec3) {

        BlockState state = blockEntity.getBlockState();
        if (!(state.getBlock() instanceof DigitalClockBlock))
            return;

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);

        int rotation = state.getValue(DigitalClockBlock.DIRECTION).get2DDataValue();
        poseStack.mulPose(Axis.YP.rotationDegrees(-90F * rotation + 180F));

        poseStack.translate(0.0675, 0.005, -0.032);
        poseStack.translate(-4.2 * 0.0625, -5.0 * 0.0625, 1.55 * 0.0625);
        poseStack.scale(0.010416667F, -0.010416667F, 0.010416667F);
        poseStack.scale(1.5F, 1.5F, 1.5F);

        String timeText = DigitalClockBlockEntity.getFormattedTime(Minecraft.getInstance().level.getDayTime());

        int color = DigitalClockBlockEntity.getFromColor(blockEntity.getTextColor());

        this.font.drawInBatch(timeText, 0, 0, color, false, poseStack.last().pose(), buffer,
                Font.DisplayMode.NORMAL, 0, packedLight);

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