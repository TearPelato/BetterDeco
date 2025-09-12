package net.tier1234.better_deco.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tier1234.better_deco.util.VoxelShapeHelper;

import java.util.ArrayList;
import java.util.List;

public class DinningTableBlock extends FurnitureWaterloggedBlock {
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty WEST = BooleanProperty.create("west");

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public DinningTableBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(NORTH, false)
                .setValue(EAST, false)
                .setValue(SOUTH, false)
                .setValue(WEST, false)
                .setValue(WATERLOGGED, false));

        SHAPES = generateShapes(this.getStateDefinition().getPossibleStates());
    }

    protected ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape TABLE_TOP_TALL = Block.box(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
        final VoxelShape LEG_SOUTH_EAST_TALL = Block.box(13.5, 0, 13.5, 15.5, 14, 15.5);
        final VoxelShape LEG_SOUTH_WEST_TALL = Block.box(0.5, 0, 13.5, 2.5, 14, 15.5);
        final VoxelShape LEG_NORTH_WEST_TALL = Block.box(0.5, 0, 0.5, 2.5, 14, 2.5);
        final VoxelShape LEG_NORTH_EAST_TALL = Block.box(13.5, 0, 0.5, 15.5, 14, 2.5);

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            boolean north = state.getValue(NORTH);
            boolean east = state.getValue(EAST);
            boolean south = state.getValue(SOUTH);
            boolean west = state.getValue(WEST);

            List<VoxelShape> shapes = new ArrayList<>();
            shapes.add(TABLE_TOP_TALL);

            if (!north && !west) shapes.add(LEG_NORTH_WEST_TALL);
            if (!north && !east) shapes.add(LEG_NORTH_EAST_TALL);
            if (!south && !west) shapes.add(LEG_SOUTH_WEST_TALL);
            if (!south && !east) shapes.add(LEG_SOUTH_EAST_TALL);

            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState neighborState,
                                  LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        boolean north = isDinningTable(level, pos, Direction.NORTH);
        boolean east = isDinningTable(level, pos, Direction.EAST);
        boolean south = isDinningTable(level, pos, Direction.SOUTH);
        boolean west = isDinningTable(level, pos, Direction.WEST);

        BlockState updated = state
                .setValue(NORTH, north)
                .setValue(EAST, east)
                .setValue(SOUTH, south)
                .setValue(WEST, west);

        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }


        return updated;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor level = context.getLevel();
        BlockPos pos = context.getClickedPos();

        boolean north = isDinningTable(level, pos, Direction.NORTH);
        boolean east = isDinningTable(level, pos, Direction.EAST);
        boolean south = isDinningTable(level, pos, Direction.SOUTH);
        boolean west = isDinningTable(level, pos, Direction.WEST);

        boolean waterlogged = level.getFluidState(pos).getType() == Fluids.WATER;

        return this.defaultBlockState()
                .setValue(NORTH, north)
                .setValue(EAST, east)
                .setValue(SOUTH, south)
                .setValue(WEST, west)
                .setValue(WATERLOGGED, waterlogged);
    }

    private boolean isDinningTable(LevelAccessor level, BlockPos pos, Direction direction) {
        BlockState neighbor = level.getBlockState(pos.relative(direction));
        return neighbor.is(this);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(NORTH, EAST, SOUTH, WEST);
    }
}