package net.tier1234.better_deco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WallLanternBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<WallLanternBlock> CODEC = simpleCodec(WallLanternBlock::new);
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    // NORTH (base di riferimento, dal JSON)
    private static final VoxelShape SHAPE_N = Shapes.or(
            Block.box(5, 1, 5, 11, 8, 11),   // corpo
            Block.box(6, 8, 6, 10, 10, 10),  // top
            Block.box(6.5, 11, 7.9, 9.5, 15, 8.1), // barra
            Block.box(7.9, 10, 6.5, 8.1, 14, 9.5), // barra
            Block.box(6, 13, 2, 10, 15, 12),       // supporto
            Block.box(6, 12, 0, 10, 16, 2)         // gancio
    );

    // SOUTH → speculare sul retro
    private static final VoxelShape SHAPE_S = Shapes.or(
            Block.box(5, 1, 5, 11, 8, 11),
            Block.box(6, 8, 6, 10, 10, 10),
            Block.box(6.5, 11, 7.9, 9.5, 15, 8.1),
            Block.box(7.9, 10, 6.5, 8.1, 14, 9.5),
            Block.box(6, 13, 4, 10, 15, 14),   // supporto spostato dietro
            Block.box(6, 12, 14, 10, 16, 16)   // gancio sul retro
    );

    // WEST
    private static final VoxelShape SHAPE_W = Shapes.or(
            Block.box(5, 1, 5, 11, 8, 11),
            Block.box(6, 8, 6, 10, 10, 10),
            Block.box(7.9, 11, 6.5, 8.1, 15, 9.5), // barra ruotata
            Block.box(6.5, 10, 6.5, 9.5, 14, 7.9), // barra ruotata
            Block.box(2, 13, 6, 12, 15, 10),       // supporto sul lato
            Block.box(0, 12, 6, 2, 16, 10)         // gancio sul lato
    );

    // EAST
    private static final VoxelShape SHAPE_E = Shapes.or(
            Block.box(5, 1, 5, 11, 8, 11),
            Block.box(6, 8, 6, 10, 10, 10),
            Block.box(7.9, 11, 6.5, 8.1, 15, 9.5),
            Block.box(6.5, 10, 8.1, 9.5, 14, 9.5),
            Block.box(4, 13, 6, 14, 15, 10),
            Block.box(14, 12, 6, 16, 16, 10)
    );

    public WallLanternBlock(BlockBehaviour.Properties props) {
        super(props);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            case NORTH -> SHAPE_N;
            case SOUTH -> SHAPE_S;
            case WEST  -> SHAPE_W;
            case EAST  -> SHAPE_E;
            default -> SHAPE_N;
        };
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }
}