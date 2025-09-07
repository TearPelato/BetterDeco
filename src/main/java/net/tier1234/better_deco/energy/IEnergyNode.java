package net.tier1234.better_deco.energy;

import net.minecraft.core.BlockPos;

import java.util.List;

public interface IEnergyNode {
    boolean isProducer();
    boolean isConsumer();

    void connectTo(BlockPos other);
    void disconnectFrom(BlockPos other);
    List<BlockPos> getConnections();
}