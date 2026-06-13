package net.tier1234.better_deco.block.custom;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tier1234.better_deco.init.ModEntities;
import net.tier1234.better_deco.entity.custom.ChairEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BarStoolBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty COLOUR = IntegerProperty.create("colour", 0, 15);

    private final ImmutableMap<BlockState, VoxelShape> SHAPES;

    public BarStoolBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(COLOUR, 0));
        this.SHAPES = this.generateShapes(this.stateDefinition.getPossibleStates());
    }

    private ImmutableMap<BlockState, VoxelShape> generateShapes(ImmutableList<BlockState> states) {
        final VoxelShape baseShape = Block.box(2, 0, 2, 13, 9, 13);
        final VoxelShape legFrontLeft = Block.box(2, 0, 2, 4, 13, 4);
        final VoxelShape legFrontRight = Block.box(12, 0, 2, 14, 13, 4);
        final VoxelShape legBackLeft = Block.box(2, 0, 12, 4, 13, 14);
        final VoxelShape legBackRight = Block.box(12, 0, 12, 14, 13, 14);

        ImmutableMap.Builder<BlockState, VoxelShape> builder = ImmutableMap.builder();
        for (BlockState state : states) {
            List<VoxelShape> parts = new ArrayList<>();
            parts.add(baseShape);
            parts.add(legFrontLeft);
            parts.add(legFrontRight);
            parts.add(legBackLeft);
            parts.add(legBackRight);

            VoxelShape combined = parts.get(0);
            for (int i = 1; i < parts.size(); i++) {
                combined = Shapes.or(combined, parts.get(i));
            }
            builder.put(state, combined);
        }
        return builder.build();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, COLOUR);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.getOrDefault(state, Block.box(0, 0, 0, 16, 16, 16));
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES.getOrDefault(state, Block.box(0, 0, 0, 16, 16, 16));
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            Entity entity = null;
            List<ChairEntity> entities = level.getEntities(ModEntities.CHAIR_ENTITY.get(), new AABB(pos), chair -> true);
            if (entities.isEmpty() && level instanceof ServerLevel serverLevel) {
                entity = ModEntities.CHAIR_ENTITY.get().spawn(serverLevel, pos, MobSpawnType.TRIGGERED);
            } else if (!entities.isEmpty()) {
                entity = entities.get(0);
            }

            if (entity != null) {
                player.startRiding(entity);
            }
        }
        return InteractionResult.SUCCESS;
    }
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction dir = context.getHorizontalDirection().getOpposite();
        return this.defaultBlockState()
                .setValue(FACING, dir)
                .setValue(COLOUR, 0);
    }
}
