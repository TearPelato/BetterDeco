package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.DigitalClockBlock;
import net.tier1234.better_deco.block.entity.custom.DigitalClockBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.render_state.DigitalClockRendererState;
import org.jetbrains.annotations.Nullable;

public class DigitalClockBlockEntityRenderer implements BlockEntityRenderer<DigitalClockBlockEntity, DigitalClockRendererState> {

    private final Font font;

    public DigitalClockBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public DigitalClockRendererState createRenderState() {
        return new DigitalClockRendererState();
    }

    @Override
    public void extractRenderState(DigitalClockBlockEntity blockEntity, DigitalClockRendererState state,
                                   float partialTick, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTick, cameraPos, crumblingOverlay);

        BlockState blockState = blockEntity.getBlockState();
        if (!(blockState.getBlock() instanceof DigitalClockBlock))
            return;

        state.facing = blockState.getValue(DigitalClockBlock.DIRECTION);
        state.timeText = DigitalClockBlockEntity.getFormattedTime(blockEntity.getLevel().getDayTime());
        state.color = DigitalClockBlockEntity.getFromColor(blockEntity.getTextColor());
        state.lightPosition = blockEntity.getBlockPos();
        state.level = blockEntity.getLevel();
    }

    @Override
    public void submit(DigitalClockRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        poseStack.pushPose();

        poseStack.translate(0.5, 0.5, 0.5);
        Direction facing = state.facing != null ? state.facing : Direction.NORTH;
        poseStack.mulPose(Axis.YP.rotationDegrees(-90F * facing.get2DDataValue() + 180F));

        poseStack.translate(0.0675, 0.005, -0.032);
        poseStack.translate(-4.2 * 0.0625, -5.0 * 0.0625, 1.55 * 0.0625);

        float baseScale = 0.010416667F * 1.5F;
        poseStack.scale(baseScale, -baseScale, baseScale);

        int light = getLightLevel(state.level, state.lightPosition);

        font.drawInBatch(
                state.timeText,
                0, 0,
                state.color,
                false,
                poseStack.last().pose(),
                Minecraft.getInstance().renderBuffers().bufferSource(),
                Font.DisplayMode.NORMAL,
                0,
                light
        );

        poseStack.popPose();
    }

    private int getLightLevel(Level level, BlockPos pos) {
        if (level == null || pos == null) return LightTexture.pack(15, 15);
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
