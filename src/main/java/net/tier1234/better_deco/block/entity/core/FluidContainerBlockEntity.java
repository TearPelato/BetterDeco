package net.tier1234.better_deco.block.entity.core;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.fluids.FluidStack;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.NonnullDefault;

import java.util.Optional;

@NonnullDefault
public abstract class FluidContainerBlockEntity extends BlockEntity {

    public static final int BUCKET_VOLUME = 1000;

    private FluidStack stack = new FluidStack(Fluids.EMPTY, 0);
    private final int capacity;

    public FluidContainerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity) {
        super(type, pos, state);
        this.capacity = capacity;
    }

    public FluidStack getFluidStack() {
        return this.stack;
    }

    public int getCapacity() { return capacity; }
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void setFluidStack(FluidStack stack) {
        if(stack.getAmount() > capacity) this.stack = new FluidStack(stack.getFluid(), capacity);
        else this.stack = stack;
        setChanged();
        if (level != null && !level.isClientSide) level.sendBlockUpdated(worldPosition,getBlockState(),getBlockState(),3);
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        if(stack.isEmpty()) return;
        output.store("FluidStack", FluidStack.CODEC, stack);
    }

    @Override
    protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        /* CODICE DA TOGLIERE QUANDO TUTTI AVRANNO CONVERTITO (PROBABILMENTE MAI) */
        if(input.getString("FluidName").isPresent()) { //LEGACY ENCODING
            String name = input.getString("FluidName").orElse("minecraft:empty");
            if ("minecraft:empty".equals(name)) {
                this.stack = new FluidStack(Fluids.EMPTY, 0);
                return;
            }
            Optional<Holder.Reference<Fluid>> fluid = BuiltInRegistries.FLUID.get(ResourceLocation.parse(name));
            if (fluid.isEmpty()) {
                this.stack = new FluidStack(Fluids.EMPTY, 0);
                return;
            }
            int amount = Math.min(input.getInt("Amount").orElse(0), capacity);
            if (amount <= 0) {
                this.stack = new FluidStack(Fluids.EMPTY, 0);
                return;
            }
            var ref = fluid.get();
            this.stack = new FluidStack(ref, amount);
        } else if(input.getString("FluidStack").isPresent()) this.stack = input.read("FluidStack", FluidStack.CODEC).orElse(new FluidStack(Fluids.EMPTY, 0));
        else this.stack = new FluidStack(Fluids.EMPTY, 0);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() { return ClientboundBlockEntityDataPacket.create(this); }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}