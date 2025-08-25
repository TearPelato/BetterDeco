package net.tier1234.better_deco.block.custom;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.mojang.serialization.Codec;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco.block.ModBlocks;

import java.util.Optional;
import java.util.function.Supplier;

public interface WeatheringBlocksCustom extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {

    @Deprecated
    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(
            () -> ImmutableBiMap.<Block, Block>builder()
                    .put(ModBlocks.COPPER_LANTERN.get(),ModBlocks.EXPOSED_LANTERN.get())
                    .put(ModBlocks.EXPOSED_LANTERN.get(), ModBlocks.WEATHERED_LANTERN.get())
                    .put(ModBlocks.WEATHERED_LANTERN.get(), ModBlocks.OXIDIZED_LANTERN.get())
                    .build()
    );
    /**
     * @deprecated Neo: Use the {@link net.neoforged.neoforge.common.DataMapHooks#INVERSE_OXIDIZABLES_DATAMAP inverse map} generated from the data map, this field will be ignored in a future version
     */
    @Deprecated
    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());

    static Optional<Block> getPrevious(Block block) {
        return Optional.ofNullable(net.neoforged.neoforge.common.DataMapHooks.getPreviousOxidizedStage(block));
    }

    static Block getFirst(Block p_block) {
        Block block = p_block;

        for (Block block1 = net.neoforged.neoforge.common.DataMapHooks.getPreviousOxidizedStage(p_block); block1 != null; block1 = net.neoforged.neoforge.common.DataMapHooks.getPreviousOxidizedStage(block1)) {
            block = block1;
        }

        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map(p_154903_ -> p_154903_.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        return Optional.ofNullable(net.neoforged.neoforge.common.DataMapHooks.getNextOxidizedStage(block));
    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    @Override
    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map(p_154896_ -> p_154896_.withPropertiesOf(state));
    }

    @Override
    default float getChanceModifier() {
        return this.getAge() == net.minecraft.world.level.block.WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }

    public static enum WeatherState implements StringRepresentable {
        UNAFFECTED("unaffected"),
        EXPOSED("exposed"),
        WEATHERED("weathered"),
        OXIDIZED("oxidized");

        public static final Codec<WeatheringCopper.WeatherState> CODEC = StringRepresentable.fromEnum(net.minecraft.world.level.block.WeatheringCopper.WeatherState::values);
        private final String name;

        private WeatherState(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}

