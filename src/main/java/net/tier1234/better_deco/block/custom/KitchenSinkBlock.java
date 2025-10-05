package net.tier1234.better_deco.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tier1234.better_deco.block.entity.custom.KitchenSinkBlockEntity;
import net.tier1234.better_deco.util.VoxelShapeHelper;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class KitchenSinkBlock extends FurnitureHorizontalBlock implements EntityBlock {

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public KitchenSinkBlock(Properties properties) {
        super(properties);
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    @Override
    public BlockState updateShape(BlockState state, Direction direction, BlockState newState, LevelAccessor level, BlockPos pos, BlockPos newPos) {
        return null;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, net.minecraft.world.phys.shapes.CollisionContext context) {
        return SHAPES.get(state);
    }

    protected ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for (BlockState state : states) {
            List<VoxelShape> shapes = new ArrayList<>();
            Direction direction = state.getValue(DIRECTION);

            shapes.add(VoxelShapeHelper.getRotatedShapes(
                    VoxelShapeHelper.rotate(Block.box(0.0, 0.0, 0.0, 16.0, 9.0, 15.0), Direction.SOUTH)
            )[direction.get2DDataValue()]);
            shapes.add(VoxelShapeHelper.getRotatedShapes(
                    VoxelShapeHelper.rotate(Block.box(0.0, 9.0, 0.0, 16.0, 16.0, 16.0), Direction.SOUTH)
            )[direction.get2DDataValue()]);

            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }
        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.get(state);
    }


    private boolean isWaterSource(Level level, BlockPos pos) {
        return level.getFluidState(pos).isSourceOfType(Fluids.WATER);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new KitchenSinkBlockEntity(pos, state);
    }
}