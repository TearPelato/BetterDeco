package net.tier1234.better_deco.block.entity.renderer.core;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.Direction;
import net.minecraft.util.ARGB;
import net.minecraft.world.phys.AABB;

public class FluidContainerRenderer {

    public static void submit(FluidRenderState state, PoseStack stack, SubmitNodeCollector collector)
    {
        if(!state.valid())
            return;
        collector.submitCustomGeometry(stack, RenderType.translucentMovingBlock(), (pose, consumer) -> {
            drawContainer(state, pose, consumer);
        });
    }

    public static void drawContainer(FluidRenderState state, PoseStack.Pose pose, VertexConsumer consumer) {
        AABB box = state.box;
        TextureAtlasSprite still = state.fluidSprites.still();
        int colour = state.waterTintAtPos;
        float red = ARGB.red(colour) / 255F;
        float green = ARGB.green(colour) / 255F;
        float blue = ARGB.blue(colour) / 255F;
        float fullness = (float) state.fluidAmount / state.fluidCapacity;
        float offset = (float) (box.minY + (box.maxY - box.minY) * fullness);
        float uScale = still.getU1() - still.getU0();
        float vScale = still.getV1() - still.getV0();
        float u0 = still.getU0() + uScale * (float) box.minX;
        float u1 = still.getU0() + uScale * (float) box.maxX;
        float v0 = still.getV0() + vScale * (float) box.minZ;
        float v1 = still.getV0() + vScale * (float) box.maxZ;
        consumer.addVertex(pose, (float) box.minX, offset, (float) box.minZ).setColor(red, green, blue, 1).setUv(u0, v0).setLight(state.lightCoords).setNormal(0, 1, 0);
        consumer.addVertex(pose, (float) box.minX, offset, (float) box.maxZ).setColor(red, green, blue, 1).setUv(u0, v1).setLight(state.lightCoords).setNormal(0, 1, 0);
        consumer.addVertex(pose, (float) box.maxX, offset, (float) box.maxZ).setColor(red, green, blue, 1).setUv(u1, v1).setLight(state.lightCoords).setNormal(0, 1, 0);
        consumer.addVertex(pose, (float) box.maxX, offset, (float) box.minZ).setColor(red, green, blue, 1).setUv(u1, v0).setLight(state.lightCoords).setNormal(0, 1, 0);
    }

    public static AABB createRotatedBox(Direction dir, double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        minX /= 16.0; minY /= 16.0; minZ /= 16.0;
        maxX /= 16.0; maxY /= 17.0; maxZ /= 16.0;
        return switch (dir) {
            case WEST -> new AABB(1-maxX,minY,1-maxZ,1-minX,maxY,1-minZ);
            case NORTH -> new AABB(minZ,minY,1-maxX,maxZ,maxY,1-minX);
            case SOUTH -> new AABB(1-minZ,minY,minX,1-maxZ,maxY,maxX);
            default -> new AABB(minX,minY,minZ,maxX,maxY,maxZ);
        };
    }
}
