package net.tier1234.better_deco.block.custom;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import net.tearpelato.deco_lib.api.block.furniture.FurnitureHorizontalBlock;
import net.tearpelato.deco_lib.api.block_entity.BasicLootBlockEntity;
import net.tearpelato.deco_lib.api.shape.VoxelShapeHelper;
import net.tier1234.better_deco.block.entity.custom.CrateBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CrateBlock extends FurnitureHorizontalBlock implements EntityBlock
{
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    public final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public CrateBlock(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(OPEN, false).setValue(DIRECTION, Direction.NORTH));
        SHAPES = this.generateShapes(this.getStateDefinition().getPossibleStates());
    }

    protected ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states)
    {
        final VoxelShape[] OPEN_LID = VoxelShapeHelper.getRotatedShapes(VoxelShapeHelper.rotate(Block.box(0, 13, -2, 16, 29, 1), Direction.SOUTH));

        ImmutableMap.Builder<BlockState, VoxelShape> builder = new ImmutableMap.Builder<>();
        for(BlockState state : states)
        {
            Direction direction = state.getValue(DIRECTION);
            boolean open = state.getValue(OPEN);

            List<VoxelShape> shapes = new ArrayList<>();
            if(open)
            {
                shapes.add(Block.box(0, 0, 0, 16, 13, 16));
                shapes.add(OPEN_LID[direction.get2DDataValue()]);
            }
            else
            {
                shapes.add(Shapes.block());
            }
            builder.put(state, VoxelShapeHelper.combineAll(shapes));
        }

        return builder.build();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext context)
    {
        return SHAPES.get(state);
    }

    @Override
    public VoxelShape getOcclusionShape(BlockState state, BlockGetter reader, BlockPos pos)
    {
        return SHAPES.get(state);
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean movedByPiston) {
        if(state.getBlock() != newState.getBlock()) {
            if(level.getBlockEntity(pos) instanceof CrateBlockEntity crateBlockEntity) {
                crateBlockEntity.drops();
                level.updateNeighbourForOutputSignal(pos, this);
            }
        }
        super.onRemove(state, level, pos, newState, movedByPiston);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {{
            if (pLevel.isClientSide) {
                return InteractionResult.SUCCESS;
            } else {
                BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
                if (blockEntity instanceof CrateBlockEntity crateBlockEntity) {
                    NetworkHooks.openScreen(((ServerPlayer)pPlayer), crateBlockEntity, pPos);
                    return InteractionResult.SUCCESS;
                }
                return InteractionResult.PASS;
            }
    }
    }



    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random)
    {
        if(level.getBlockEntity(pos) instanceof BasicLootBlockEntity blockEntity)
        {
            blockEntity.updateOpenerCount();
        }
    }



    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder)
    {
        super.createBlockStateDefinition(builder);
        builder.add(OPEN);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state)
    {
        return new CrateBlockEntity(pos, state);
    }
}
