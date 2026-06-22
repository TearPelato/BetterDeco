package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.font.TextRenderable;
import net.minecraft.client.renderer.OrderedSubmitNodeCollector;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.DigitalClockBlock;
import net.tier1234.better_deco.block.entity.custom.DigitalClockBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.render_state.DigitalClockRendererState;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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
        state.timeText = FormattedCharSequence.forward(DigitalClockBlockEntity.getFormattedTime(Minecraft.getInstance().level.getGameTime()), Style.EMPTY.withColor(blockEntity.getFromColor(blockEntity.getTextColor())));
        state.color = DigitalClockBlockEntity.getFromColor(blockEntity.getTextColor());
        state.lightPosition = blockEntity.getBlockPos();
        state.level = blockEntity.getLevel();
        state.be = blockEntity;
        state.colorInt = blockEntity.getFromColorAsInt(blockEntity.getTextColor());
    }

    @Override
    public void submit(DigitalClockRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        if (state.timeText == null || state.facing == null) return;

        poseStack.pushPose();

        poseStack.translate(0.5, 0.5, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(-90F * state.facing.get2DDataValue() + 180F));
        poseStack.translate(0.0675, 0.005, -0.032);
        poseStack.translate(-4.2 * 0.0625, -5.0 * 0.0625, 1.55 * 0.0625);

        float baseScale = 0.010416667F * 1.5F;
        poseStack.scale(baseScale, -baseScale, baseScale);

        Font.PreparedText preparedText = this.font.prepareText(
                state.timeText, 0, 0, state.colorInt, false, false, 0
        );

        List<TextRenderable> renderables = new ArrayList<>();
        preparedText.visit(new Font.GlyphVisitor() {
            @Override
            public void acceptRenderable(TextRenderable renderable) {
                renderables.add(renderable);
            }
        });

        Map<RenderType, List<TextRenderable>> byRenderType = new LinkedHashMap<>();
        for (TextRenderable r : renderables) {
            byRenderType.computeIfAbsent(r.renderType(Font.DisplayMode.NORMAL), k -> new ArrayList<>()).add(r);
        }

        PoseStack.Pose capturedPose = poseStack.last();

        for (Map.Entry<RenderType, List<TextRenderable>> entry : byRenderType.entrySet()) {
            List<TextRenderable> group = entry.getValue();
            submitNodeCollector.submitCustomGeometry(poseStack, entry.getKey(),
                    (pose, buffer) -> {
                        Matrix4f matrix = pose.pose();
                        for (TextRenderable renderable : group) {
                            renderable.render(matrix, buffer, state.lightCoords, false);
                        }
                    }
            );
        }

        poseStack.popPose();
    }
}
