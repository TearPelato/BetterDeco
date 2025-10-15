package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco.block.entity.core.BasicLootBlockEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco.block.custom.DeskCabinetBlock;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.block.entity.core.BasicLootBlockEntity;

public class DeskCabinetBlockEntity extends BasicLootBlockEntity
{
    protected DeskCabinetBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state)
    {
        super(type, pos, state);
    }

    public DeskCabinetBlockEntity(BlockPos pos, BlockState state)
    {
        super(ModBlockEntities.DESK_CABINET.get(), pos, state);
    }

    @Override
    public int getContainerSize()
    {
        return 9;
    }

    @Override
    protected Component getDefaultName()
    {
        return Component.translatable("gui.better_deco.desk_cabinet");
    }

    @Override
    protected AbstractContainerMenu createMenu(int windowId, Inventory playerInventory)
    {
        return new ChestMenu(MenuType.GENERIC_9x1, windowId, playerInventory, this, 1);
    }



    private void setDoorState(BlockState state, boolean open)
    {
        Level level = this.getLevel();
        if(level != null)
        {
            level.setBlock(this.getBlockPos(), state.setValue(DeskCabinetBlock.OPEN, open), 3);
        }
    }
}