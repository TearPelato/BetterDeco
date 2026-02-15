package net.tier1234.better_deco.network.message;

import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.screen.custom.FurniWorkbenchMenu;
import net.tier1234.better_deco.screen.custom.FurniWorkbenchScreen;

public record SyncCraftableRecipesPayload(int containerId, boolean[] craftable) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<SyncCraftableRecipesPayload> TYPE =
            new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(BetterDeco.MOD_ID,"sync_craftable_recipes"));

    public static final StreamCodec<FriendlyByteBuf, SyncCraftableRecipesPayload> STREAM_CODEC = StreamCodec.of(
            (buf, payload) -> {
                buf.writeInt(payload.containerId);
                buf.writeInt(payload.craftable.length);
                for (boolean b : payload.craftable) {
                    buf.writeBoolean(b);
                }
            },
            buf -> {
                int containerId = buf.readInt();
                int len = buf.readInt();
                boolean[] craftable = new boolean[len];
                for (int i = 0; i < len; i++) {
                    craftable[i] = buf.readBoolean();
                }
                return new SyncCraftableRecipesPayload(containerId, craftable);
            }
    );

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(SyncCraftableRecipesPayload payload, IPayloadContext context) {
        context.enqueueWork(() -> {
            if (Minecraft.getInstance().player.containerMenu instanceof FurniWorkbenchMenu menu &&
                    menu.containerId == payload.containerId) {
                menu.setCraftableRecipes(payload.craftable);
                if (Minecraft.getInstance().screen instanceof FurniWorkbenchScreen screen) {
                    screen.updateRecipeButtons();
                }
            }
        });
    }
}