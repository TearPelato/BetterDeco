package net.tier1234.better_deco.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.Container;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.tier1234.better_deco.block.entity.custom.FreezerBlockEntity;
import net.tier1234.better_deco.block.entity.custom.FridgeBlockEntity;
import net.tier1234.better_deco.util.VoxelShapeHelper;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;
import java.util.stream.Stream;

public class NewFridgeBlock extends BaseEntityBlock {
    public static final MapCodec<NewFridgeBlock> CODEC = simpleCodec(NewFridgeBlock::new);
    public static final DirectionProperty DURECTION = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<FridgeModelType> MODEL_TYPE = EnumProperty.create("model", FridgeModelType.class);


    public NewFridgeBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(DURECTION, Direction.NORTH)
                .setValue(MODEL_TYPE, FridgeModelType.FRIDGE));

    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DURECTION, MODEL_TYPE);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockPos = context.getClickedPos();
        Level level = context.getLevel();
        if (level.getBlockState(blockPos.above()).canBeReplaced(context)) {
            return this.defaultBlockState().setValue(DURECTION, context.getHorizontalDirection().getOpposite());
        }
        return null;
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (state.getValue(MODEL_TYPE) == FridgeModelType.FRIDGE) {
            if (blockEntity instanceof FridgeBlockEntity fridgeBlockEntity) {
                player.openMenu(fridgeBlockEntity);
                return InteractionResult.CONSUME;
            }
        } else if (state.getValue(MODEL_TYPE) == FridgeModelType.FREEZER ) {
            if (blockEntity instanceof FreezerBlockEntity freezerBlockEntity) {
                ((ServerPlayer) player).openMenu(
                        new SimpleMenuProvider(freezerBlockEntity, Component.translatable("gui.better_deco.freezer")), pos);
            }
        }

        return InteractionResult.CONSUME;
    }

    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.is(newState.getBlock())) return;

        BlockEntity blockEntity = level.getBlockEntity(pos);
        if (blockEntity instanceof Container) {
            Containers.dropContents(level, pos, (Container)blockEntity);
            level.updateNeighbourForOutputSignal(pos, this);
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }

    private static Direction getNeighbourDirection(FridgeModelType modelType) {
        return modelType == FridgeModelType.FRIDGE ? Direction.UP : Direction.DOWN;
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide) {
            FridgeModelType modelType = state.getValue(MODEL_TYPE);
            BlockPos otherPos = pos.relative(getNeighbourDirection(modelType));
            BlockState otherState = level.getBlockState(otherPos);

            if (otherState.getBlock() == this && otherState.getValue(MODEL_TYPE) != modelType) {
                BlockPos bottomPos = modelType == FridgeModelType.FRIDGE ? pos : otherPos;
                BlockPos topPos = modelType == FridgeModelType.FREEZER ? pos : otherPos;

                level.setBlock(bottomPos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                level.levelEvent(player, 2001, bottomPos, Block.getId(state));

                level.setBlock(topPos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL);
                level.levelEvent(player, 2001, topPos, Block.getId(otherState));

                if (!player.isCreative()) {
                    dropResources(state, level, pos, null, player, player.getMainHandItem());
                    dropResources(otherState, level, otherPos, null, player, player.getMainHandItem());
                }
            }
        }

        return super.playerWillDestroy(level, pos, state, player);
    }


    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        super.setPlacedBy(level, pos, state, placer, stack);
        if (!level.isClientSide) {
            // La parte sopra è impostata come TOP
            level.setBlock(pos.above(), state.setValue(MODEL_TYPE, FridgeModelType.FREEZER), Block.UPDATE_ALL);
            level.blockUpdated(pos, Blocks.AIR);
            state.updateNeighbourShapes(level, pos, Block.UPDATE_ALL);
        }
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        if (state.getValue(MODEL_TYPE) == FridgeModelType.FREEZER ) {
            return new FreezerBlockEntity(pos, state);
        } return new FridgeBlockEntity(pos, state);
    }


    public enum FridgeModelType implements StringRepresentable {
        FRIDGE, FREEZER;

        @Override
        public String getSerializedName() {
            return name().toLowerCase(Locale.ROOT);
        }

        @Override
        public String toString() {
            return getSerializedName();
        }
    }


    private static final VoxelShape FRIDGE = Stream.of(
            Block.box(0, 0, 1, 16, 32, 16),
            Block.box(2, 2, 0, 14, 21, 1),
            Block.box(2, 24, 0, 14, 30, 1),
            Block.box(12, 28, -1, 13, 29, 0),
            Block.box(12, 25, -1, 13, 26, 0),
            Block.box(12, 25, -2, 13, 29, -1),
            Block.box(12, 16, -2, 13, 20, -1),
            Block.box(12, 19, -1, 13, 20, 0),
            Block.box(12, 16, -1, 13, 17, 0)
    ).reduce((v1, v2) -> Shapes.or(v1, v2)).get();

    private static final VoxelShape FREEZER = Stream.of(
            Block.box(0, -16, 1, 16, 16, 16),
            Block.box(2, -14, 0, 14, 5, 1),
            Block.box(2, 8, 0, 14, 14, 1),
            Block.box(12, 12, -1, 13, 13, 0),
            Block.box(12, 9, -1, 13, 10, 0),
            Block.box(12, 9, -2, 13, 13, -1),
            Block.box(12, 0, -2, 13, 4, -1),
            Block.box(12, 3, -1, 13, 4, 0),
            Block.box(12, 0, -1, 13, 1, 0)
    ).reduce((v1, v2) -> Shapes.or(v1, v2)).get();


    private static final VoxelShape[] SHAPES = new VoxelShape[8];

    static {
        SHAPES[0] = VoxelShapeHelper.rotateShape(FREEZER, Direction.SOUTH); //South
        SHAPES[1] = VoxelShapeHelper.rotateShape(FREEZER, Direction.WEST); //West
        SHAPES[2] = VoxelShapeHelper.rotateShape(FREEZER, Direction.NORTH); //North
        SHAPES[3] = VoxelShapeHelper.rotateShape(FREEZER, Direction.EAST); //East
        SHAPES[4] = VoxelShapeHelper.rotateShape(FRIDGE, Direction.SOUTH); //South Lower
        SHAPES[5] = VoxelShapeHelper.rotateShape(FRIDGE, Direction.WEST); //West Lower
        SHAPES[6] = VoxelShapeHelper.rotateShape(FRIDGE, Direction.NORTH); //North Lower
        SHAPES[7] = VoxelShapeHelper.rotateShape(FRIDGE, Direction.EAST); //East Lower
    }


    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(DURECTION);
        int d2d = direction.get2DDataValue();

        if (state.getValue(MODEL_TYPE) == FridgeModelType.FRIDGE) {
            return SHAPES[4 + d2d];
        } else {
            return SHAPES[d2d];
        }
    }
}