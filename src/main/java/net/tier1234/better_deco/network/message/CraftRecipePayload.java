package net.tier1234.better_deco.network.message;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.screen.custom.FurniWorkbenchMenu;

public record CraftRecipePayload(int containerId, int recipeIndex) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<CraftRecipePayload> TYPE =
            new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID, "craft_recipe"));

    public static final StreamCodec<FriendlyByteBuf, CraftRecipePayload> STREAM_CODEC = StreamCodec.of(
            (buf, payload) -> {
                buf.writeInt(payload.containerId);
                buf.writeInt(payload.recipeIndex);
            },
            buf -> new CraftRecipePayload(buf.readInt(), buf.readInt())
    );

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(CraftRecipePayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player() instanceof ServerPlayer serverPlayer &&
                    serverPlayer.containerMenu instanceof FurniWorkbenchMenu menu &&
                    menu.containerId == payload.containerId) {
                menu.craftSelectedRecipe(payload.recipeIndex);
            }
        });
    }
}