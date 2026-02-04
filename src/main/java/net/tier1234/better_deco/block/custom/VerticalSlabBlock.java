package net.tier1234.better_deco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.NonnullDefault;

@NonnullDefault
public class VerticalSlabBlock extends SlabBlock {
    //private static final MapCodec<VerticalSlabBlock> CODEC = simpleCodec(VerticalSlabBlock::new);
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.HORIZONTAL_AXIS;

    public static final VoxelShape WEST_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 8.0D, 16.0D, 16.0D);
    public static final VoxelShape EAST_SHAPE = Block.box(8D, 0.0D, 0.0D, 16D, 16.0D, 16.0D);
    public static final VoxelShape NORTH_SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16D, 16D, 8D);
    public static final VoxelShape SOUTH_SHAPE = Block.box(0.0D, 0.0D, 8D, 16D, 16D, 16D);

    public VerticalSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.X));
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(AXIS);
    }

    /**
     * Prende la direzione di un vertical slab
     * */
    public static Direction toDirection(BlockState state) {
        return switch (state.getValue(AXIS)) {
            case Y -> throw new IllegalStateException("Y axis is not supported for vertical slabs");
            case X -> state.getValue(TYPE) == SlabType.BOTTOM ? Direction.EAST : Direction.WEST;
            case Z -> state.getValue(TYPE) == SlabType.BOTTOM ? Direction.SOUTH : Direction.NORTH;
        };
    }

    /**
     * Trasforma una direction nello state del blocco
     * */
    public static BlockState applyBlockState(BlockState state, Direction facing) {
        state = state.setValue(AXIS, facing.getAxis());
        if(state.getValue(TYPE) != SlabType.DOUBLE) state = state.setValue(TYPE, facing.getAxisDirection() == Direction.AxisDirection.POSITIVE ? SlabType.BOTTOM : SlabType.TOP);
        return state;
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        //noinspection deprecation
        return state.rotate(mirror.getRotation(toDirection(state)));
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return applyBlockState(state, rotation.rotate(toDirection(state)));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        var slabType = state.getValue(TYPE);
        if(slabType == SlabType.DOUBLE) return Shapes.block();
        return switch (toDirection(state)) {
            case NORTH -> NORTH_SHAPE;
            case SOUTH -> SOUTH_SHAPE;
            case WEST -> WEST_SHAPE;
            case EAST -> EAST_SHAPE;
            default -> throw new IllegalStateException("Unreachable statement");
        };
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        BlockState state = context.getLevel().getBlockState(pos);
        if(state.is(this)) return state.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, false);
        FluidState fluidState = context.getLevel().getFluidState(pos);
        BlockState toPlace = defaultBlockState()
                .setValue(WATERLOGGED,fluidState.getType() == Fluids.WATER);
        return applyBlockState(toPlace, context.getHorizontalDirection());
    }

   /* @Override
    public MapCodec<? extends SlabBlock> codec() {
        return CODEC;
    }
*/
    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        ItemStack stack = useContext.getItemInHand();
        SlabType type = state.getValue(TYPE);
        if(type == SlabType.DOUBLE || !stack.is(this.asItem())) return false;
        if(useContext.replacingClickedOnBlock()) {
            var dir = toDirection(state);
            return dir == useContext.getClickedFace().getOpposite();
        }
        return false;
    }
}

