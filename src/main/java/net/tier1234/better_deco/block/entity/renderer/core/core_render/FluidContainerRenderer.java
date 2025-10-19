package net.tier1234.better_deco.block.entity.renderer.core.core_render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.neoforged.neoforge.fluids.FluidStack;
import org.joml.Matrix4f;

public class FluidContainerRenderer {

    public static void drawContainer(
            Level level,
            BlockPos pos,
            Fluid fluid,
            AABB box,
            PoseStack poseStack,
            float fullness,
            int light,
            VertexConsumer consumer
    ) {
        if (fluid == null || fluid == Fluids.EMPTY || level == null || box == null || fullness <= 0f) return;

        FluidStack stack = new FluidStack(fluid, 1000);

        TextureAtlasSprite[] sprites = FluidContainerRendererUtil.getFluidSprites(fluid);
        if (sprites == null || sprites.length == 0 || sprites[0] == null) return;

        TextureAtlasSprite still = sprites[0];
        int color = FluidContainerRendererUtil.getFluidColor(stack, level, pos);
        if (fluid.isSame(Fluids.WATER)) {
            color = BiomeColors.getAverageWaterColor(level, pos);
        }

        float r = FastColor.ARGB32.red(color) / 255f;
        float g = FastColor.ARGB32.green(color) / 255f;
        float b = FastColor.ARGB32.blue(color) / 255f;
        float a = 0.9f;

        float minX = (float) box.minX;
        float minY = (float) box.minY;
        float minZ = (float) box.minZ;
        float maxX = (float) box.maxX;
        float maxY = (float) box.maxY;
        float maxZ = (float) box.maxZ;

        float yTop = minY + (maxY - minY) * fullness;
        yTop = Math.min(maxY, Math.max(minY, yTop));

        float u0 = still.getU0();
        float u1 = still.getU1();
        float v0 = still.getV0();
        float v1 = still.getV1();

        Matrix4f mat = poseStack.last().pose();

        addVertex(consumer, mat, minX, yTop, minZ, r, g, b, a, u0, v0, light, 0, 1, 0);
        addVertex(consumer, mat, minX, yTop, maxZ, r, g, b, a, u0, v1, light, 0, 1, 0);
        addVertex(consumer, mat, maxX, yTop, maxZ, r, g, b, a, u1, v1, light, 0, 1, 0);
        addVertex(consumer, mat, maxX, yTop, minZ, r, g, b, a, u1, v0, light, 0, 1, 0);

        addVertex(consumer, mat, minX, minY, minZ, r, g, b, a, u0, v0, light, -1, 0, 0);
        addVertex(consumer, mat, minX, yTop, minZ, r, g, b, a, u0, v1, light, -1, 0, 0);
        addVertex(consumer, mat, minX, yTop, maxZ, r, g, b, a, u1, v1, light, -1, 0, 0);
        addVertex(consumer, mat, minX, minY, maxZ, r, g, b, a, u1, v0, light, -1, 0, 0);

        addVertex(consumer, mat, maxX, minY, minZ, r, g, b, a, u0, v0, light, 1, 0, 0);
        addVertex(consumer, mat, maxX, yTop, minZ, r, g, b, a, u0, v1, light, 1, 0, 0);
        addVertex(consumer, mat, maxX, yTop, maxZ, r, g, b, a, u1, v1, light, 1, 0, 0);
        addVertex(consumer, mat, maxX, minY, maxZ, r, g, b, a, u1, v0, light, 1, 0, 0);

        addVertex(consumer, mat, minX, minY, minZ, r, g, b, a, u0, v0, light, 0, 0, -1);
        addVertex(consumer, mat, minX, yTop, minZ, r, g, b, a, u0, v1, light, 0, 0, -1);
        addVertex(consumer, mat, maxX, yTop, minZ, r, g, b, a, u1, v1, light, 0, 0, -1);
        addVertex(consumer, mat, maxX, minY, minZ, r, g, b, a, u1, v0, light, 0, 0, -1);

        addVertex(consumer, mat, minX, minY, maxZ, r, g, b, a, u0, v0, light, 0, 0, 1);
        addVertex(consumer, mat, minX, yTop, maxZ, r, g, b, a, u0, v1, light, 0, 0, 1);
        addVertex(consumer, mat, maxX, yTop, maxZ, r, g, b, a, u1, v1, light, 0, 0, 1);
        addVertex(consumer, mat, maxX, minY, maxZ, r, g, b, a, u1, v0, light, 0, 0, 1);
    }

    private static void addVertex(VertexConsumer consumer, Matrix4f mat, float x, float y, float z,
                                  float r, float g, float b, float a,
                                  float u, float v, int light,
                                  float nx, float ny, float nz) {
        consumer.addVertex(mat, x, y, z)
                .setColor(r, g, b, a)
                .setUv(u, v)
                .setOverlay(OverlayTexture.NO_OVERLAY)
                .setLight(light)
                .setNormal(nx, ny, nz);
    }

    public static AABB createRotatedBox(Direction dir,
                                        double minX, double minY, double minZ,
                                        double maxX, double maxY, double maxZ) {
        minX /= 16.0;
        minY /= 16.0;
        minZ /= 16.0;
        maxX /= 16.0;
        maxY /= 16.0;
        maxZ /= 16.0;
        return switch (dir) {
            case WEST -> new AABB(1 - maxX, minY, 1 - maxZ, 1 - minX, maxY, 1 - minZ);
            case NORTH -> new AABB(minZ, minY, 1 - maxX, maxZ, maxY, 1 - minX);
            case SOUTH -> new AABB(1 - minZ, minY, minX, 1 - maxZ, maxY, maxX);
            default -> new AABB(minX, minY, minZ, maxX, maxY, maxZ);
        };
    }
}