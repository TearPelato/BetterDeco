package net.tier1234.better_deco.entity.custom;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

import java.util.List;

public class ChairEntity extends Entity {
    public ChairEntity(EntityType<?> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public boolean hurtServer(ServerLevel serverLevel, DamageSource damageSource, float v) {
        return false;
    }


    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {

    }

    @Override
    protected void readAdditionalSaveData(ValueInput input) {

    }

    @Override
    protected void addAdditionalSaveData(ValueOutput output) {

    }

    @Override
    protected void removePassenger(Entity passenger) {
        super.removePassenger(passenger);
        if(!level().isClientSide()) {
            this.kill(((ServerLevel) this.level()));
        }
    }
}