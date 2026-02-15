package net.tier1234.better_deco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.tier1234.better_deco.block.entity.custom.FurniWorkbenchBlockEntity;
import net.tier1234.better_deco.screen.custom.FurniWorkbenchMenu;
import org.jetbrains.annotations.Nullable;

public class FurniWorkbench extends BaseEntityBlock {
    public static final MapCodec<FurniWorkbench> CODEC = simpleCodec(FurniWorkbench::new);
    public FurniWorkbench(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof FurniWorkbenchBlockEntity workbench) {
                serverPlayer.openMenu(
                        new SimpleMenuProvider(
                                (containerId, playerInventory, p) -> workbench.createMenu(containerId, playerInventory, p),
                                Component.translatable("container.better_deco.workbench")
                        ),
                        buf -> buf.writeBlockPos(pos)
                );
            }
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new FurniWorkbenchBlockEntity(blockPos, blockState);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())) { // Ensure block is actually removed and not just updated
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof FurniWorkbenchBlockEntity furniCrafterBE) {
                SimpleContainer container = furniCrafterBE.getOutputContainer();

                for (int i = 0; i < container.getContainerSize(); i++) {
                    ItemStack stack = container.getItem(i);
                    if (!stack.isEmpty()) {
                        Containers.dropItemStack(level, pos.getX(), pos.getY(), pos.getZ(), stack);
                    }
                }

                level.removeBlockEntity(pos);
            }
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
}
