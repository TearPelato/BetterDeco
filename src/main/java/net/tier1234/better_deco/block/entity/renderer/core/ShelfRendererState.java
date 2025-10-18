package net.tier1234.better_deco.block.entity.renderer.core;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.List;

public class ShelfRendererState extends BlockEntityRenderState {
    public BlockPos lightPosition;
    public Level blockEntityLevel;
    public final List<ItemStackRenderState> itemRenderStates = new ArrayList<>(6);
    public Direction facing;


    public ShelfRendererState() {
        for (int i = 0; i < 6; i++) {
            itemRenderStates.add(new ItemStackRenderState());
        }
    }
}