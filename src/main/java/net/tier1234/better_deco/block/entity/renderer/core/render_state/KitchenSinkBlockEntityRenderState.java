package net.tier1234.better_deco.block.entity.renderer.core.render_state;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.StagedVertexBuffer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.tearpelato.deco_lib.api.fluid.renderer.render_state.FluidRenderState;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;

public class KitchenSinkBlockEntityRenderState extends FluidRenderState {
    public KitchenSinkBlockEntity be;
    public StagedVertexBuffer.Draw draw;
    public SubmitNodeCollector.CustomGeometryRenderer geometryRenderer;
    public PoseStack.Pose pose;
}
