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
import net.tier1234.better_deco.block.entity.custom.FluidContainerBlockEntity;
import net.tier1234.better_deco.util.FluidInteractionUtil;
import net.tier1234.better_deco.util.VoxelShapeHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class KitchenSinkBlock extends FurnitureHorizontalBlock implements SimpleWaterloggedBlock, EntityBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty HAS_WATER = ModBlockStateProperties.HAS_WATER;

    public final ImmutableMap<BlockState, VoxelShape> STATE_SHAPES;

    public KitchenSinkBlock(Properties properties) {
        super(properties);
        registerDefaultState(this.stateDefinition.any()
                .setValue(DIRECTION, Direction.SOUTH)
                .setValue(HAS_WATER, false));
        STATE_SHAPES = generateShapes(this.getStateDefinition().getPossibleStates());
    }

    public ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        ImmutableMap.Builder<BlockState, VoxelShape> b = new ImmutableMap.Builder<>();
        for (BlockState s : states) {
            List<VoxelShape> parts = new ArrayList<>();
            Direction d = s.getValue(DIRECTION);

            VoxelShape[] baseTop = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0.0, 9.0, 0.0, 16.0, 16.0, 16.0), Direction.SOUTH));
            VoxelShape[] baseBottom = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 15.0), Direction.SOUTH));

            parts.add(baseBottom[d.get2DDataValue()]);
            parts.add(baseTop[d.get2DDataValue()]);

            b.put(s, VoxelShapeHelper.combineAll(parts));
        }
        return b.build();
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
        if (level.isClientSide) return ItemInteractionResult.SUCCESS;

        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof KitchenSinkBlockEntity sinkBE)) return ItemInteractionResult.FAIL;
        if (stack.isEmpty()) {
            BlockPos source = pos.below(2);
            FluidState fs = level.getFluidState(source);

            if (fs.isSource() && !fs.isEmpty()) {
                Fluid f = fs.getType();
                if (!Config.isSinkUniversal() && f != Fluids.WATER) {
                    return ItemInteractionResult.FAIL;
                }

                int cur = sinkBE.getStoredAmount();
                int cap = sinkBE.getCapacity();
                int add = FluidContainerBlockEntity.BUCKET_VOLUME;

                if ((sinkBE.isEmpty() || sinkBE.getFluid() == f) && cur + add <= cap) {
                    sinkBE.setFluidAndAmount(f, cur + add);
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
        Fluid fluidFromItem = FluidInteractionUtil.getFluidFromItemStack(stack);
        if (fluidFromItem != Fluids.EMPTY && item != Items.BUCKET) {
            if (!Config.isSinkUniversal() && fluidFromItem != Fluids.WATER) {
                return ItemInteractionResult.FAIL;
            }

            int cur = sinkBE.getStoredAmount();
            int cap = sinkBE.getCapacity();
            int add = FluidContainerBlockEntity.BUCKET_VOLUME;

            if ((sinkBE.isEmpty() || sinkBE.getFluid() == fluidFromItem) && cur + add <= cap) {
                sinkBE.setFluidAndAmount(fluidFromItem, cur + add);

                if (!player.isCreative()) {
                    player.setItemInHand(hand, Items.BUCKET.getDefaultInstance());
                }

                SoundEvent sfx = null;
                if (fluidFromItem == Fluids.WATER) sfx = SoundEvents.BUCKET_EMPTY;
                else if (fluidFromItem == Fluids.LAVA) sfx = SoundEvents.BUCKET_EMPTY_LAVA;

                if (sfx != null) level.playSound(null, pos, sfx, SoundSource.BLOCKS, 1.0F, 1.0F);

                return ItemInteractionResult.SUCCESS;
            } else {
                return ItemInteractionResult.FAIL;
            }
        }
        if (item == Items.BUCKET) {
            int cur = sinkBE.getStoredAmount();
            int take = FluidContainerBlockEntity.BUCKET_VOLUME;
            Fluid fIn = sinkBE.getFluid();

            if (!sinkBE.isEmpty() && cur >= take) {
                Item filledBucket = fIn.getBucket();
                if (filledBucket != Items.AIR) {
                    sinkBE.setFluidAndAmount(fIn, cur - take);

                    if (!player.isCreative()) {
                        ItemStack newStack = filledBucket.getDefaultInstance();
                        stack.shrink(1);
                        if (stack.isEmpty()) {
                            player.setItemInHand(hand, newStack);
                        } else if (!player.getInventory().add(newStack)) {
                            player.drop(newStack, false);
                        }
                    }

                    SoundEvent sfx = null;
                    if (fIn == Fluids.WATER) sfx = SoundEvents.BUCKET_FILL;
                    else if (fIn == Fluids.LAVA) sfx = SoundEvents.BUCKET_FILL_LAVA;

                    if (sfx != null) level.playSound(null, pos, sfx, SoundSource.BLOCKS, 1.0F, 1.0F);

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
        return STATE_SHAPES.get(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DIRECTION, WATERLOGGED, HAS_WATER);
    }
}