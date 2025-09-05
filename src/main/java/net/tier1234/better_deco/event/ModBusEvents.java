package net.tier1234.better_deco.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.tier1234.better_deco.block.entity.GeneratorBlockEntity;
import net.tier1234.better_deco.block.entity.MicrowaveBlockEntity;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import net.tier1234.better_deco.block.entity.OvenBlockEntity;


public class ModBusEvents {

@SubscribeEvent
public static void registerCapabilities(RegisterCapabilitiesEvent event) {

    event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ModBlockEntities.GENERATOR.get(), GeneratorBlockEntity::getEnergyStorage);
    event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ModBlockEntities.MICROWAVE.get(), MicrowaveBlockEntity::getEnergyStorage);
    event.registerBlockEntity(Capabilities.EnergyStorage.BLOCK, ModBlockEntities.OVEN.get(), OvenBlockEntity::getEnergyStorage);

 }
}
