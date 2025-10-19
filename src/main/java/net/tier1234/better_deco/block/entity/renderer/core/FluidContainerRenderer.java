package net.tier1234.better_deco.block.entity.renderer.core;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.BiomeColors;
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
        if (fluid == null || fluid == Fluids.EMPTY || level == null) return;

        FluidStack stack = new FluidStack(fluid, 1000);

        TextureAtlasSprite[] sprites = FluidContainerRendererUtil.getFluidSprites(fluid);
        if (sprites == null || sprites.length == 0 || sprites[0] == null) return;

        TextureAtlasSprite still = sprites[0];
        int color = FluidContainerRendererUtil.getFluidColor(stack, level, pos);
        if (fluid.isSame(Fluids.WATER)) color = BiomeColors.getAverageWaterColor(level, pos);

        float r = FastColor.ARGB32.red(color) / 255f;
        float g = FastColor.ARGB32.green(color) / 255f;
        float b = FastColor.ARGB32.blue(color) / 255f;
        float a = 0.9f;
        float minFluidY = (float) box.minY;
        float maxFluidY = (float) box.maxY;

        float y = minFluidY + (maxFluidY - minFluidY) * fullness;
        y = Math.min(maxFluidY, Math.max(minFluidY, y));

        float u0 = still.getU0();
        float u1 = still.getU1();
        float v0 = still.getV0();
        float v1 = still.getV1();

        Matrix4f mat = poseStack.last().pose();

        consumer.addVertex(mat, (float) box.minX, y, (float) box.minZ).setColor(r,g,b,a).setUv(u0,v0).setLight(light).setNormal(0,1,0);
        consumer.addVertex(mat, (float) box.minX, y, (float) box.maxZ).setColor(r,g,b,a).setUv(u0,v1).setLight(light).setNormal(0,1,0);
        consumer.addVertex(mat, (float) box.maxX, y, (float) box.maxZ).setColor(r,g,b,a).setUv(u1,v1).setLight(light).setNormal(0,1,0);
        consumer.addVertex(mat, (float) box.maxX, y, (float) box.minZ).setColor(r,g,b,a).setUv(u1,v0).setLight(light).setNormal(0,1,0);
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