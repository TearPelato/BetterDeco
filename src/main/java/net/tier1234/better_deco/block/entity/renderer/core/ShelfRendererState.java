package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.Direction;

public class ShelfRendererState extends BlockEntityRenderState {

    public final ItemStackRenderState[] items = new ItemStackRenderState[6];
    public Direction facing;
    public int packedLight;


    public ShelfRendererState() {
    }

}