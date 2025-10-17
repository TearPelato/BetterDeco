package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

public class RotationRendererState extends BlockEntityRenderState {
    public BlockPos lightPosition;
    public Level blockEntityLevel;
    public float rotation;

  public final ItemStackRenderState itemStackRenderState = new ItemStackRenderState();
}
