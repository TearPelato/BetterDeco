package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.Direction;

public class ModBlockEntityRendererState extends BlockEntityRenderState {
    // Mutable field to hold the facing:
    Direction facing;
    // Field to hold the mutable item stack render state:
    final ItemStackRenderState item = new ItemStackRenderState();
}