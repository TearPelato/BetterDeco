package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

public abstract class FluidContainerBlockEntity extends BlockEntity {

    public static final int BUCKET_VOLUME = 1000;

    private Fluid storedFluid = Fluids.EMPTY;
    private int storedAmount = 0;
    private final int capacity;

    public FluidContainerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity) {
        super(type, pos, state);
        this.capacity = capacity;
    }

    public Fluid getFluid() {
        return this.storedFluid != null ? this.storedFluid : Fluids.EMPTY;
    }

    public void setFluid(Fluid fluid) {
        if (fluid == null || fluid == Fluids.EMPTY) {
            setFluidAndAmount(Fluids.EMPTY, 0);
        } else {
            setFluidAndAmount(fluid, this.capacity);
        }
    }

    public void setFluidAndAmount(Fluid fluid, int amount) {
        if (fluid == null) fluid = Fluids.EMPTY;

        boolean changed = false;
        if (this.storedFluid != fluid || this.storedAmount != amount) {
            this.storedFluid = fluid;
            this.storedAmount = Math.min(amount, this.capacity);
            if (this.storedAmount <= 0) {
                this.storedFluid = Fluids.EMPTY;
                this.storedAmount = 0;
            }
            changed = true;
        }

        if (changed) {
            setChanged();
            if (level != null && !level.isClientSide) {
                level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
            }
        }
    }

    public int getStoredAmount() {
        return this.storedAmount;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return this.storedFluid == Fluids.EMPTY || this.storedAmount <= 0;
    }
    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        if (!isEmpty()) {
            ResourceLocation id = BuiltInRegistries.FLUID.getKey(getFluid());
            if (id != null) {
                tag.putString("FluidName", id.toString());
                tag.putInt("Amount", this.storedAmount);
                return;
            }
        }
        tag.putString("FluidName", "minecraft:empty");
        tag.putInt("Amount", 0);
    }
    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        if (tag.contains("FluidName")) {
            String name = tag.getString("FluidName");
            if ("minecraft:empty".equals(name)) {
                this.storedFluid = Fluids.EMPTY;
                this.storedAmount = 0;
                return;
            }

            try {
                ResourceLocation rl = ResourceLocation.parse(name);
                Fluid loaded = BuiltInRegistries.FLUID.get(rl);
                if (loaded == null || loaded == Fluids.EMPTY) {
                    this.storedFluid = Fluids.EMPTY;
                    this.storedAmount = 0;
                } else {
                    this.storedFluid = loaded;
                    int amt = tag.getInt("Amount");
                    if (amt <= 0) {
                        this.storedFluid = Fluids.EMPTY;
                        this.storedAmount = 0;
                    } else {
                        this.storedAmount = Math.min(amt, this.capacity);
                    }
                }
            } catch (Exception e) {
                this.storedFluid = Fluids.EMPTY;
                this.storedAmount = 0;
            }
        } else {
            this.storedFluid = Fluids.EMPTY;
            this.storedAmount = 0;
        }
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}