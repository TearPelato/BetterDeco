package net.tier1234.better_deco.block.custom;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.apache.commons.lang3.function.TriFunction;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public record WeatheringCopperBlocks(Block unaffected, Block exposed, Block weathered, Block oxidized, Block waxed, Block waxedExposed, Block waxedWeathered, Block waxedOxidized) {
    public static <WaxedBlock extends Block, WeatheringBlock extends Block & WeatheringCopper> WeatheringCopperBlocks create(String string, TriFunction<String, Function<BlockBehaviour.Properties, Block>, BlockBehaviour.Properties, Block> triFunction, Function<BlockBehaviour.Properties, WaxedBlock> function, BiFunction<WeatheringCopper.WeatherState, BlockBehaviour.Properties, WeatheringBlock> biFunction, Function<WeatheringCopper.WeatherState, BlockBehaviour.Properties> function2) {
        Block var10002 = (Block)triFunction.apply(string, (Function)(properties) -> (Block)biFunction.apply(WeatheringCopper.WeatherState.UNAFFECTED, (BlockBehaviour.Properties) properties), (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.UNAFFECTED));
        Block var10003 = (Block)triFunction.apply("exposed_" + string, (Function)(properties) -> (Block)biFunction.apply(WeatheringCopper.WeatherState.EXPOSED, (BlockBehaviour.Properties) properties), (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.EXPOSED));
        Block var10004 = (Block)triFunction.apply("weathered_" + string, (Function)(properties) -> (Block)biFunction.apply(WeatheringCopper.WeatherState.WEATHERED, (BlockBehaviour.Properties) properties), (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.WEATHERED));
        Block var10005 = (Block)triFunction.apply("oxidized_" + string, (Function)(properties) -> (Block)biFunction.apply(WeatheringCopper.WeatherState.OXIDIZED, (BlockBehaviour.Properties) properties), (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.OXIDIZED));
        String var10007 = "waxed_" + string;
        Objects.requireNonNull(function);
        Block var10006 = (Block)triFunction.apply(var10007, function::apply, (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.UNAFFECTED));
        String var10008 = "waxed_exposed_" + string;
        Objects.requireNonNull(function);
        Block var5 = (Block)triFunction.apply(var10008, function::apply, (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.EXPOSED));
        String var10009 = "waxed_weathered_" + string;
        Objects.requireNonNull(function);
        Block var6 = (Block)triFunction.apply(var10009, function::apply, (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.WEATHERED));
        String var10010 = "waxed_oxidized_" + string;
        Objects.requireNonNull(function);
        return new WeatheringCopperBlocks(var10002, var10003, var10004, var10005, var10006, var5, var6, (Block)triFunction.apply(var10010, function::apply, (BlockBehaviour.Properties)function2.apply(WeatheringCopper.WeatherState.OXIDIZED)));
    }

    public ImmutableBiMap<Block, Block> weatheringMapping() {
        return ImmutableBiMap.of(this.unaffected, this.exposed, this.exposed, this.weathered, this.weathered, this.oxidized);
    }

    public ImmutableBiMap<Block, Block> waxedMapping() {
        return ImmutableBiMap.of(this.unaffected, this.waxed, this.exposed, this.waxedExposed, this.weathered, this.waxedWeathered, this.oxidized, this.waxedOxidized);
    }

    public ImmutableList<Block> asList() {
        return ImmutableList.of(this.unaffected, this.waxed, this.exposed, this.waxedExposed, this.weathered, this.waxedWeathered, this.oxidized, this.waxedOxidized);
    }

    public void forEach(Consumer<Block> consumer) {
        consumer.accept(this.unaffected);
        consumer.accept(this.exposed);
        consumer.accept(this.weathered);
        consumer.accept(this.oxidized);
        consumer.accept(this.waxed);
        consumer.accept(this.waxedExposed);
        consumer.accept(this.waxedWeathered);
        consumer.accept(this.waxedOxidized);
    }
}
