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
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tier1234.better_deco.block.custom.CustomShelfBlock;
import net.tier1234.better_deco.block.entity.custom.ShelfBlockEntity;
import net.tier1234.better_deco.block.entity.renderer.core.ShelfRendererState;
import org.jetbrains.annotations.Nullable;

public class ShelfBlockEntityRenderer implements BlockEntityRenderer<ShelfBlockEntity, ShelfRendererState> {
    private static final float U1 = 1f / 16f;
    private static final float SCALE = 0.30f;
    private static final float X_OFFSET = 5.2f;
    private static final float Y_OFFSET = 3.5f;
    private static final float Y_OFFSET2 = 4.5f;
    private static final float Z_OFFSET = 0.15f;

    private final ItemModelResolver itemModelResolver;

    public ShelfBlockEntityRenderer(BlockEntityRendererProvider.Context context) {
        this.itemModelResolver = context.itemModelResolver();
    }


    @Override
    public ShelfRendererState createRenderState() {
        return new ShelfRendererState();
    }

    @Override
    public void extractRenderState(ShelfBlockEntity blockEntity, ShelfRendererState state, float partialTick, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {

        BlockState blockState = blockEntity.getBlockState();
        NonNullList<ItemStack> stacks = blockEntity.getItems();
        BlockPos pos = blockEntity.getBlockPos();
        Level level = blockEntity.getLevel();

        int seed = pos.hashCode();
        state.packedLight = getLightLevel(level, pos);

        for (int i = 0; i < stacks.size() && i < state.items.length; i++) {
            ItemStack stack = stacks.get(i);
            if (!stack.isEmpty()) {
                ItemStackRenderState stackState = state.items[i] != null ? state.items[i] : new ItemStackRenderState();

                itemModelResolver.updateForTopItem(stackState, stack, ItemDisplayContext.FIXED, level, blockEntity, seed + i);
                state.items[i] = stackState;
            } else {
                state.items[i] = null;
            }
        }

        state.facing = blockState.getValue(CustomShelfBlock.FACING);
    }

    @Override
    public void submit(ShelfRendererState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
        Direction dir = state.facing;
        float rot = -dir.toYRot() + 180f;

        poseStack.pushPose();
        poseStack.translate(0.5f, 0.5f, 0.5f);
        poseStack.mulPose(Axis.YP.rotationDegrees(rot));

        renderSlot(state, poseStack, submitNodeCollector, 0,  U1 * X_OFFSET,  U1 * Y_OFFSET,  Z_OFFSET);
        renderSlot(state, poseStack, submitNodeCollector, 1,  0f,             U1 * Y_OFFSET,  Z_OFFSET);
        renderSlot(state, poseStack, submitNodeCollector, 2, -U1 * X_OFFSET,  U1 * Y_OFFSET,  Z_OFFSET);
        renderSlot(state, poseStack, submitNodeCollector, 3,  U1 * X_OFFSET, -U1 * Y_OFFSET2, Z_OFFSET);
        renderSlot(state, poseStack, submitNodeCollector, 4,  0f,            -U1 * Y_OFFSET2, Z_OFFSET);
        renderSlot(state, poseStack, submitNodeCollector, 5, -U1 * X_OFFSET, -U1 * Y_OFFSET2, Z_OFFSET);

        poseStack.popPose();
    }

    private void renderSlot(ShelfRendererState state, PoseStack poseStack, SubmitNodeCollector collector, int index,
                            float x, float y, float z) {
        ItemStackRenderState stackState = state.items[index];
        if (stackState == null) return;

        poseStack.pushPose();
        poseStack.translate(x, y, z);
        poseStack.scale(SCALE, SCALE, SCALE);

        stackState.submit(poseStack, collector, state.packedLight, OverlayTexture.NO_OVERLAY, 0);
        poseStack.popPose();
    }

    private int getLightLevel(Level level, BlockPos pos) {
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
