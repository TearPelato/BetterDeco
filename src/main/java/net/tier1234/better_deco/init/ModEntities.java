package net.tier1234.better_deco.init;


import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.better_deco.BetterDeco;
import net.tier1234.better_deco.entity.custom.ChairEntity;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, BetterDeco.MOD_ID);


    public static ResourceKey<EntityType<?>> CHAIR_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.withDefaultNamespace("chair_entity"));

    public static final Supplier<EntityType<ChairEntity>> CHAIR_ENTITY =
            ENTITY_TYPES.register("chair_entity", () -> EntityType.Builder.of(ChairEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build(CHAIR_KEY));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}