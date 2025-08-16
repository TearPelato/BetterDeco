package net.tier1234.better_deco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements SimpleWaterloggedBlock {
    public static final EnumProperty<VerticalSlabState> TYPE = EnumProperty.create("type", VerticalSlabState.class);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    protected static final VoxelShape WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    protected static final VoxelShape EAST_SHAPE = Block.box(8D, 0.0D, 0.0D, 16D, 16.0D, 16.0D);
    protected static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16D, 16D, 8D);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8D, 16D, 16D, 16D);

    public VerticalSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(
                this.stateDefinition.any()
                        .setValue(TYPE, VerticalSlabState.NORTH)
                        .setValue(WATERLOGGED, false)
        );
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TYPE, WATERLOGGED);
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return rotate(state, mirror.getRotation(state.getValue(TYPE).getFacing()));
    }

    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(TYPE,
                VerticalSlabState.reverseFacing(rotation.rotate(state.getValue(TYPE).getFacing()),
                        state.getValue(TYPE).isDouble()));
    }

    @Override
    public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation direction) {
        return rotate(state, direction);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(TYPE)) {
            case DOUBLEX, DOUBLEZ -> Shapes.block();
            case NORTH -> NORTH_SHAPE;
            case EAST -> EAST_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
        };
    }

    public boolean isTransparent(BlockState state) {
        return !state.getValue(TYPE).isDouble();
    }

    private VerticalSlabState getDoubleState(VerticalSlabState s) {
        return (s == VerticalSlabState.EAST || s == VerticalSlabState.WEST)
                ? VerticalSlabState.DOUBLEX
                : VerticalSlabState.DOUBLEZ;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext c) {
        BlockPos blockpos = c.getClickedPos();
        BlockState blockstate = c.getLevel().getBlockState(blockpos);

        if (blockstate.getBlock() == this) {
            return blockstate.setValue(TYPE, getDoubleState(blockstate.getValue(TYPE)))
                    .setValue(WATERLOGGED, false);
        } else {
            FluidState ifluidstate = c.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState()
                    .setValue(TYPE, VerticalSlabState.NORTH)
                    .setValue(WATERLOGGED, ifluidstate.getType() == Fluids.WATER);

            Direction face = c.getClickedFace();
            double flagdx = c.getClickLocation().x - (double) blockpos.getX() - .5d;
            double flagdz = c.getClickLocation().z - (double) blockpos.getZ() - .5d;

            VerticalSlabState vss = VerticalSlabState.forFacings(face, c.getHorizontalDirection());

            if (flagdz > 0 && difg(flagdz, flagdx)) vss = VerticalSlabState.SOUTH;
            if (flagdz < 0 && difg(flagdz, flagdx)) vss = VerticalSlabState.NORTH;
            if (flagdx > 0 && difg(flagdx, flagdz)) vss = VerticalSlabState.EAST;
            if (flagdx < 0 && difg(flagdx, flagdz)) vss = VerticalSlabState.WEST;

            return blockstate1.setValue(TYPE, vss);
        }
    }

    private boolean difg(double d1, double d2) {
        return Math.abs(d1) > Math.abs(d2);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext c) {
        ItemStack itemstack = c.getItemInHand();
        VerticalSlabState slabtype = state.getValue(TYPE);

        if (slabtype != VerticalSlabState.DOUBLEX && slabtype != VerticalSlabState.DOUBLEZ
                && itemstack.getItem() == this.asItem()) {
            if (c.replacingClickedOnBlock()) {
                return switch (c.getClickedFace()) {
                    case NORTH -> slabtype == VerticalSlabState.SOUTH;
                    case EAST -> slabtype == VerticalSlabState.WEST;
                    case SOUTH -> slabtype == VerticalSlabState.NORTH;
                    case WEST -> slabtype == VerticalSlabState.EAST;
                    default -> false;
                };
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED)
                ? Fluids.WATER.getSource(false)
                : super.getFluidState(state);
    }

    @Override
    public boolean placeLiquid(LevelAccessor worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
        return (state.getValue(TYPE) != VerticalSlabState.DOUBLEX && state.getValue(TYPE) != VerticalSlabState.DOUBLEZ)
                && SimpleWaterloggedBlock.super.placeLiquid(worldIn, pos, state, fluidStateIn);
    }



    @Override
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState,
                                  LevelAccessor worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (stateIn.getValue(WATERLOGGED)) {
            worldIn.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));
        }
        return stateIn;
    }


}

