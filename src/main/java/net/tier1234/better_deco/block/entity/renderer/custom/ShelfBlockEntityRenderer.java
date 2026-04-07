package net.tier1234.better_deco.block.entity.renderer.custom;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
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
import net.tier1234.better_deco.block.entity.renderer.core.render_state.ShelfRendererState;
import org.jetbrains.annotations.Nullable;

public class ShelfBlockEntityRenderer implements BlockEntityRenderer<ShelfBlockEntity, ShelfRendererState> {
    private final ItemModelResolver itemModelResolver;
    private static final float U1 = 1f / 16f;

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

        float scale = 0.30f;
        float xOffset = 5.2f;
        float yOffset = 3.5f;
        float yOffset2 = 4.5f;
        float zOffset = 0.15f;

        for (int i = 0; i < state.itemRenderStates.size(); i++) {
            ItemStackRenderState itemState = state.itemRenderStates.get(i);
            poseStack.pushPose();

            // Calcolo della riga e colonna (3 per riga)
            int row = i / 3;
            int col = i % 3;

            // Posizioni base (centro mensola)
            float baseX = -0.35f + (col * 0.35f); // da sinistra a destra
            float baseY = 0.25f + (row * 0.5f);  // da basso l'alto
            float baseZ = -0.3f;                  // leggermente dentro la mensola

            poseStack.translate(baseX, baseY, baseZ);
            poseStack.scale(0.35f, 0.35f, 0.35f);

            itemState.submit(poseStack, submitNodeCollector, state.lightCoords, OverlayTexture.NO_OVERLAY, 0);
            poseStack.popPose();
        }

        poseStack.popPose();
    }

}