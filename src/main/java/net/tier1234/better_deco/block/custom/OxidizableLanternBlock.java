package net.tier1234.better_deco.block.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class OxidizableLanternBlock extends LanternBlock implements WeatheringCopper {
    public static final MapCodec<OxidizableLanternBlock> CODEC = RecordCodecBuilder.mapCodec((instance) ->
            instance.group(WeatherState.CODEC.fieldOf("weathering_state").forGetter(OxidizableLanternBlock::getAge),
                    propertiesCodec()).apply(instance, OxidizableLanternBlock::new));


    private final WeatheringCopper.WeatherState weatherState;

    public OxidizableLanternBlock(WeatheringCopper.WeatherState weatherState, BlockBehaviour.Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        this.changeOverTime(blockState, serverLevel, blockPos, randomSource);
    }

   /* public boolean isRandomlyTicking(BlockState blockState) {
        return WeatheringBlocksCustom.getNext(blockState.getBlock()).isPresent();
    }*/

    public WeatherState getAge() {
        return this.weatherState;
    }
}
