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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WallLanternBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<WallLanternBlock> CODEC = simpleCodec(WallLanternBlock::new);

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    // Hitbox per ogni direzione
    private static final VoxelShape SHAPE_N = Block.box(4, 0, 8, 12, 16, 16);
    private static final VoxelShape SHAPE_S = Block.box(4, 0, 0, 12, 16, 8);
    private static final VoxelShape SHAPE_W = Block.box(8, 0, 4, 16, 16, 12);
    private static final VoxelShape SHAPE_E = Block.box(0, 0, 4, 8, 16, 12);

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
