package net.tier1234.better_deco.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tier1234.better_deco.Config;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.block.entity.custom.LiquidHolderBlockEntity;
import net.tier1234.better_deco.util.FluidInteractionUtil;
import net.tier1234.better_deco.util.VoxelShapeHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class KitchenSinkBlock extends FurnitureHorizontalBlock implements SimpleWaterloggedBlock, EntityBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty HAS_WATER = ModBlockStateProperties.HAS_WATER;
    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public KitchenSinkBlock(Properties properties) {
        super(properties);
        registerDefaultState(this.stateDefinition.any()
                .setValue(DIRECTION, Direction.SOUTH)
                .setValue(HAS_WATER, false));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }


    public ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            List<VoxelShape> shapes = new ArrayList<>();
            Direction direction = state.getValue(DIRECTION);
            {
                shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 15.0), Direction.SOUTH))[direction.get2DDataValue()]);
                shapes.add(VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0.0, 9.0, 0.0, 16.0, 16.0, 16.0), Direction.SOUTH))[direction.get2DDataValue()]);
            }

            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }


    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new KitchenSinkBlockEntity(pos, state);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        return InteractionResult.PASS;
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return ItemInteractionResult.SUCCESS;
        }

        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (!(blockEntity instanceof KitchenSinkBlockEntity sinkBE)) {
            return ItemInteractionResult.FAIL;
        }

        if (stack.isEmpty()) {
            BlockPos sourcePos = pos.below(2);
            FluidState fluidStateBelow = level.getFluidState(sourcePos);

            if (fluidStateBelow.isSource() && !fluidStateBelow.isEmpty()) {
                Fluid fluidBelow = fluidStateBelow.getType();
                if (!Config.isSinkUniversal() && fluidBelow != Fluids.WATER) {
                    return ItemInteractionResult.FAIL;
                }

                int currentAmount = sinkBE.getStoredAmount();
                int capacity = sinkBE.getCapacity();
                int amountToAdd = LiquidHolderBlockEntity.BUCKET_VOLUME;

                if ((sinkBE.isEmpty() || sinkBE.getFluid() == fluidBelow) && currentAmount + amountToAdd <= capacity) {
                    sinkBE.setFluidAndAmount(fluidBelow, currentAmount + amountToAdd);
                    level.playSound(null, pos, SoundEvents.BUCKET_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                    return ItemInteractionResult.SUCCESS;
                } else {
                    return ItemInteractionResult.FAIL;
                }
            } else {
                return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }
        }

        Item item = stack.getItem();



        Fluid fluidToFill = FluidInteractionUtil.getFluidFromItemStack(stack);
        if (fluidToFill != Fluids.EMPTY && item != Items.BUCKET) {
            if (!Config.isSinkUniversal() && fluidToFill != Fluids.WATER) {
                return ItemInteractionResult.FAIL;
            }

            int currentAmount = sinkBE.getStoredAmount();
            int capacity = sinkBE.getCapacity();
            int amountToAdd = LiquidHolderBlockEntity.BUCKET_VOLUME;

            if ((sinkBE.isEmpty() || sinkBE.getFluid() == fluidToFill) && currentAmount + amountToAdd <= capacity) {
                sinkBE.setFluidAndAmount(fluidToFill, currentAmount + amountToAdd);
                if (!player.isCreative()) {
                    player.setItemInHand(hand, Items.BUCKET.getDefaultInstance());
                }
                SoundEvent fillSound = null;
                if (fluidToFill == Fluids.WATER) fillSound = SoundEvents.BUCKET_EMPTY;
                else if (fluidToFill == Fluids.LAVA) fillSound = SoundEvents.BUCKET_EMPTY_LAVA;

                if (fillSound != null) {
                    level.playSound(null, pos, fillSound, SoundSource.BLOCKS, 1.0F, 1.0F);
                }
                return ItemInteractionResult.SUCCESS;
            } else {
                return ItemInteractionResult.FAIL;
            }
        }

        if (item == Items.BUCKET) {
            int currentAmount = sinkBE.getStoredAmount();
            int amountToRemove = LiquidHolderBlockEntity.BUCKET_VOLUME;
            Fluid fluidInSink = sinkBE.getFluid();

            if (!sinkBE.isEmpty() && currentAmount >= amountToRemove) {
                Item filledBucketItem = fluidInSink.getBucket();
                if (filledBucketItem != Items.AIR) {
                    sinkBE.setFluidAndAmount(fluidInSink, currentAmount - amountToRemove);
                    if (!player.isCreative()) {
                        ItemStack filledBucketStack = filledBucketItem.getDefaultInstance();
                        stack.shrink(1);
                        if (stack.isEmpty()) {
                            player.setItemInHand(hand, filledBucketStack);
                        } else if (!player.getInventory().add(filledBucketStack)) {
                            player.drop(filledBucketStack, false);
                        }
                    }
                    SoundEvent emptySound = null;
                    if (fluidInSink == Fluids.WATER) emptySound = SoundEvents.BUCKET_FILL;
                    else if (fluidInSink == Fluids.LAVA) emptySound = SoundEvents.BUCKET_FILL_LAVA;

                    if (emptySound != null) {
                        level.playSound(null, pos, emptySound, SoundSource.BLOCKS, 1.0F, 1.0F);
                    }
                    return ItemInteractionResult.SUCCESS;
                } else {
                    return ItemInteractionResult.FAIL;
                }
            } else {
                return ItemInteractionResult.FAIL;
            }
        }

        return ItemInteractionResult.CONSUME;
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        int shape = state.getValue(DIRECTION).get2DDataValue();
        return SHAPES.get(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DIRECTION, WATERLOGGED,HAS_WATER);
    }
}