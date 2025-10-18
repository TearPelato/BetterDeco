package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.entity.custom.ShelfBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.ShelfRendererState;
import org.jetbrains.annotations.Nullable;

public class ShelfBlockEntityRenderer implements BlockEntityRenderer<ShelfBlockEntity, ShelfRendererState> {



    private final ItemModelResolver itemModelResolver;



    public ShelfBlockEntityRenderer(BlockEntityRendererProvider.Context context) {

        this.itemModelResolver = context.itemModelResolver();

    }



    @Override

    public ShelfRendererState createRenderState() {

        return new ShelfRendererState();

    }



    @Override

    public void extractRenderState(ShelfBlockEntity blockEntity, ShelfRendererState state, float partialTick,
                                   Vec3 cameraPos, @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockEntityRenderer.super.extractRenderState(blockEntity, state, partialTick, cameraPos, crumblingOverlay);
        state.lightPosition = blockEntity.getBlockPos();
        state.blockEntityLevel = blockEntity.getLevel();

        for (int i = 0; i < state.itemRenderStates.size(); i++) {
            ItemStack stack = blockEntity.handler.getStackInSlot(i);
            if (!stack.isEmpty()) {
                itemModelResolver.updateForTopItem(
                        state.itemRenderStates.get(i),
                        stack,
                        ItemDisplayContext.FIXED,
                        blockEntity.getLevel(),
                        null,
                        0
                );
            }

        }
        state.facing = blockEntity.getBlockState().getValue(HorizontalDirectionalBlock.FACING);

    }

    @Override
    public void submit(ShelfRendererState state, PoseStack poseStack,
                       SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {

        poseStack.pushPose();
        Direction facing = state.facing != null ? state.facing : Direction.NORTH;
        poseStack.translate(0.5f, 0.0f, 0.5f);
        poseStack.mulPose(Axis.YP.rotationDegrees(-facing.toYRot()));
        int light = getLightLevel(state.blockEntityLevel, state.lightPosition);

        for (int i = 0; i < state.itemRenderStates.size(); i++) {
            ItemStackRenderState itemState = state.itemRenderStates.get(i);
            poseStack.pushPose();
            int row = i / 3;
            int col = i % 3;
            float xOffset = (col - 1) * 0.35f;
            float yOffset = (row == 0) ? 1.0f : 0.3f;
            float zOffset = -0.25f;

            poseStack.translate(xOffset, yOffset, zOffset);
            poseStack.scale(0.4f, 0.4f, 0.4f);
            itemState.submit(poseStack, submitNodeCollector, light, OverlayTexture.NO_OVERLAY, 0);
            poseStack.popPose();
        }
        poseStack.popPose();
    }

    private int getLightLevel(Level level, BlockPos pos) {
        if (level == null || pos == null) return LightTexture.pack(15, 15);
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}