package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.DigitalClockBlock;
import net.tier1234.better_deco.block.entity.custom.DigitalClockBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.DigitalClockRendererState;
import org.joml.Matrix4f;

import javax.annotation.Nullable;

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
    public void extractRenderState(DigitalClockBlockEntity blockEntity, DigitalClockRendererState state, float partialTick,
                                   Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockState blockState = blockEntity.getBlockState();
        if (!(blockState.getBlock() instanceof DigitalClockBlock)) {
            return;
        }
        state.facing = blockState.getValue(DigitalClockBlock.DIRECTION);
        state.timeText = DigitalClockBlockEntity.getFormattedTime(blockEntity.getLevel().getDayTime());
        state.color = DigitalClockBlockEntity.getFromColor(blockEntity.getTextColor());
        state.lightPosition = blockEntity.getBlockPos();
        state.blockEntityLevel = blockEntity.getLevel();
    }

    @Override
    public void submit(DigitalClockRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        int light = getLightLevel(state.blockEntityLevel, state.lightPosition);

        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);

        Direction facing = state.facing != null ? state.facing : Direction.NORTH;
        float rotationAngle = switch (facing) {
            case NORTH -> 180.0F;
            case SOUTH -> 0.0F;
            case WEST -> 90.0F;
            case EAST -> -90.0F;
            default -> 0.0F;
        };
        poseStack.mulPose(Axis.YP.rotationDegrees(rotationAngle));
        poseStack.translate(0.0675, 0.005, 0.032);
        poseStack.translate(-4.2 * 0.0625, -5.0 * 0.0625, -1.55 * 0.0625);
        poseStack.scale(0.010416667F, -0.010416667F, 0.010416667F);
        poseStack.scale(1.5F, 1.5F, 1.5F);

        MultiBufferSource.BufferSource bufferSource = Minecraft.getInstance().renderBuffers().bufferSource();
        Matrix4f pose = poseStack.last().pose();

//        submitNodeCollector.submitText(poseStack,0f, 0f, state.timeText,false,Font.DisplayMode.NORMAL,
//                0,getLightLevel(state.blockEntityLevel, state.lightPosition));

        poseStack.popPose();
    }
    private int getLightLevel(Level level, BlockPos pos) {
        if (level == null || pos == null) return LightTexture.pack(15, 15);
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
