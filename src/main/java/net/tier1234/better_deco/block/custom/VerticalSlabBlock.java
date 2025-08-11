package net.tier1234.better_deco.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block {
    public static final DirectionProperty HORIZONTAL_AXIS = HorizontalDirectionalBlock.FACING;

    public static enum VType implements StringRepresentable {
        SINGLE("single"),
        DOUBLE("double");

        private final String name;

        VType(String n) {
            this.name = n;
        }

        @Override
        public String getSerializedName() {
            return name;
        }
    }

    public static final EnumProperty<VType> TYPE = EnumProperty.create("type", VType.class);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final VoxelShape FULL = Shapes.block();
    private static final VoxelShape NORTH_HALF = Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 8.0);
    private static final VoxelShape SOUTH_HALF = Block.box(0.0, 0.0, 8.0, 16.0, 16.0, 16.0);
    private static final VoxelShape WEST_HALF  = Block.box(0.0, 0.0, 0.0, 8.0, 16.0, 16.0);
    private static final VoxelShape EAST_HALF  = Block.box(8.0, 0.0, 0.0, 16.0, 16.0, 16.0);

    public VerticalSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(HORIZONTAL_AXIS, Direction.NORTH)
                .setValue(TYPE, VType.SINGLE)
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_AXIS, TYPE, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        LevelAccessor level = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos();
        BlockState existing = level.getBlockState(pos);

        FluidState fluidState = level.getFluidState(pos);
        boolean water = fluidState.getType() == Fluids.WATER;

        Direction clickedFace = ctx.getClickedFace();

        Direction placingFacing = clickedFace.getAxis().isHorizontal()
                ? clickedFace.getOpposite()
                : ctx.getHorizontalDirection();

        if (!placingFacing.getAxis().isHorizontal()) {
            placingFacing = Direction.NORTH;
        }

        if (existing.getBlock() == this) {
            if (existing.getValue(TYPE) == VType.SINGLE) {
                Direction existingFacing = existing.getValue(HORIZONTAL_AXIS);
                if (existingFacing == placingFacing) {
                    return existing.setValue(TYPE, VType.DOUBLE).setValue(WATERLOGGED, water);
                }
            }
            // Impedisce la sovrascrittura se non si può unire
            return null;
        }

        return this.defaultBlockState()
                .setValue(HORIZONTAL_AXIS, placingFacing)
                .setValue(TYPE, VType.SINGLE)
                .setValue(WATERLOGGED, water);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext ctx) {
        if (state.getValue(TYPE) == VType.DOUBLE) return FULL;

        Direction f = state.getValue(HORIZONTAL_AXIS);
        return switch (f) {
            case NORTH -> NORTH_HALF;
            case SOUTH -> SOUTH_HALF;
            case WEST  -> WEST_HALF;
            case EAST  -> EAST_HALF;
            default -> FULL;
        };
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return state.getValue(TYPE) != VType.DOUBLE;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState neighbor, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER.getSource(false).getType(), Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, facing, neighbor, world, pos, neighborPos);
    }
}

