package net.tier1234.better_deco.block.entity.renderer.core.render_state;

import net.minecraft.client.renderer.StagedVertexBuffer;
import net.tearpelato.deco_lib.api.fluid.renderer.render_state.FluidRenderState;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;

public class KitchenSinkBlockEntityRenderState extends FluidRenderState {
    public KitchenSinkBlockEntity be;
    public StagedVertexBuffer.Draw draw;
}
