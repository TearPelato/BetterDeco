package net.tier1234.better_deco.block.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.FastColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.neoforged.neoforge.fluids.FluidStack;
import net.tier1234.better_deco.block.entity.custom.FluidContainerBlockEntity;
import org.joml.Matrix4f;

public class FluidContainerRenderer
{
    public static void drawContainer(Level level, BlockPos pos, FluidContainerBlockEntity blockEntity, AABB box, PoseStack poseStack, MultiBufferSource source, int light)
    {
        Fluid fluid = blockEntity.getFluid();
        FluidStack fluidStack = new FluidStack(fluid, blockEntity.getStoredAmount());

        if (fluidStack.isEmpty()) return;

        TextureAtlasSprite[] sprites = FluidContainerRendererUtil.getSprites(fluid);
        if (sprites == null || sprites.length == 0 || sprites[0] == null) return;
        TextureAtlasSprite still = sprites[0];

        int colour = FluidContainerRendererUtil.getColor(fluidStack, level, pos);

        if (fluid.isSame(Fluids.WATER)) {
            colour = BiomeColors.getAverageWaterColor(level, pos);
        }

        float r = FastColor.ARGB32.red(colour) / 255F;
        float g = FastColor.ARGB32.green(colour) / 255F;
        float b = FastColor.ARGB32.blue(colour) / 255F;
        float a = 1.0f;

        float fullness = (float) blockEntity.getStoredAmount() / (float) blockEntity.getCapacity();
        float minY = (float) box.minY;
        float maxY = (float) box.maxY;
        float height = (maxY - minY) * fullness;
        float y = Math.min(maxY, Math.max(minY, minY + height));
        float uScale = still.getU1() - still.getU0();
        float vScale = still.getV1() - still.getV0();

        float u0 = still.getU0() + uScale * (float) (box.minX - Math.floor(box.minX));
        float u1 = still.getU0() + uScale * (float) (box.maxX - Math.floor(box.minX));
        float v0 = still.getV0() + vScale * (float) (box.minZ - Math.floor(box.minZ));
        float v1 = still.getV0() + vScale * (float) (box.maxZ - Math.floor(box.minZ));

        RenderType type = RenderType.translucent();
        VertexConsumer consumer = source.getBuffer(type);
        Matrix4f m = poseStack.last().pose();

        consumer.addVertex(m, (float) box.minX, y, (float) box.minZ).setColor(r, g, b, a).setUv(u0, v0).setLight(light).setNormal(0, 1, 0);
        consumer.addVertex(m, (float) box.minX, y, (float) box.maxZ).setColor(r, g, b, a).setUv(u0, v1).setLight(light).setNormal(0, 1, 0);
        consumer.addVertex(m, (float) box.maxX, y, (float) box.maxZ).setColor(r, g, b, a).setUv(u1, v1).setLight(light).setNormal(0, 1, 0);
        consumer.addVertex(m, (float) box.maxX, y, (float) box.minZ).setColor(r, g, b, a).setUv(u1, v0).setLight(light).setNormal(0, 1, 0);
    }

    public static AABB createRotatedBox(Direction direction, double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
    {
        minX /= 16.0;
        minY /= 16.0;
        minZ /= 16.0;
        maxX /= 16.0;
        maxY /= 17.0;
        maxZ /= 16.0;

        return switch (direction) {
            case WEST -> new AABB(1 - maxX, minY, 1 - maxZ, 1 - minX, maxY, 1 - minZ);
            case NORTH -> new AABB(minZ, minY, 1 - maxX, maxZ, maxY, 1 - minX);
            case SOUTH -> new AABB(1 - maxZ, minY, minX, 1 - minZ, maxY, maxX);
            default -> new AABB(minX, minY, minZ, maxX, maxY, maxZ);
        };
    }
}