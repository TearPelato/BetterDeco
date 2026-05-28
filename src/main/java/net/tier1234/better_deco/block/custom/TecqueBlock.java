package net.tier1234.better_deco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import net.tier1234.better_deco.block.entity.custom.TecqueBlockEntity;
import org.jetbrains.annotations.Nullable;


public class TecqueBlock extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(1, 0, 1, 15, 11, 15);
    //public static final MapCodec<TecqueBlock> CODEC = simpleCodec(TecqueBlock::new);

    public TecqueBlock(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
/*
    @Override
    public MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }
*/
    /* BLOCK ENTITY */

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new TecqueBlockEntity(blockPos, blockState);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if(state.getBlock() != newState.getBlock()) {
            if(level.getBlockEntity(pos) instanceof TecqueBlockEntity tecqueBlockEntity) {
                tecqueBlockEntity.drops();
                level.updateNeighbourForOutputSignal(pos, this);
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if(pLevel.getBlockEntity(pPos) instanceof TecqueBlockEntity tecqueBlockEntity) {
            if(pPlayer.isCrouching() && !pLevel.isClientSide()) {
                NetworkHooks.openScreen(((ServerPlayer)pPlayer), tecqueBlockEntity, pPos);
                return InteractionResult.SUCCESS;
            }
            ItemStack stack = pPlayer.getItemInHand(pHand);
            if(tecqueBlockEntity.inventory.getStackInSlot(0).isEmpty() && !stack.isEmpty()) {
                tecqueBlockEntity.inventory.insertItem(0, stack.copy(), false);
                stack.shrink(1);
                pLevel.playSound(pPlayer, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 2f);
            } else if(stack.isEmpty()) {
                ItemStack stackOnTecque = tecqueBlockEntity.inventory.extractItem(0, 1, false);
                pPlayer.setItemInHand(InteractionHand.MAIN_HAND, stackOnTecque);
                tecqueBlockEntity.clearContents();
                pLevel.playSound(pPlayer, pPos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 1f, 1f);
            }
        }

        return InteractionResult.SUCCESS;
    }

}
