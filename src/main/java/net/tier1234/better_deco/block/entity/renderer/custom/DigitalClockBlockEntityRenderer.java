package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.entity.custom.DigitalClockBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.render_state.DigitalClockRenderState;
import org.jetbrains.annotations.Nullable;

public class DigitalClockBlockEntityRenderer implements BlockEntityRenderer<DigitalClockBlockEntity, DigitalClockRenderState> {

    private final Font font;

    public DigitalClockBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.font = context.font();
    }

    @Override
    public DigitalClockRenderState createRenderState() {
        return new DigitalClockRenderState();
    }

    @Override
    public void extractRenderState(DigitalClockBlockEntity blockEntity, DigitalClockRenderState renderState, float partialTicks, Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        renderState.timeText = DigitalClockBlockEntity.getFormattedTime(Minecraft.getInstance().level.getDayTime());
        renderState.color = DigitalClockBlockEntity.getFromColor(blockEntity.getTextColor());
    }

    @Override
    public void submit(DigitalClockRenderState renderState, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        poseStack.pushPose();
        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.popPose();
    }
}
