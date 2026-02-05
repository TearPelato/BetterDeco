package net.tier1234.better_deco.block.entity.custom;

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
import net.minecraftforge.fluids.FluidStack;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.system.NonnullDefault;

import java.util.Optional;

@Deprecated(forRemoval = true)
@NonnullDefault
public abstract class FluidContainerBlockEntity extends BlockEntity {

    public static final int BUCKET_VOLUME = 1000;

    private FluidStack stack = FluidStack.EMPTY;
    private final int capacity;

    public FluidContainerBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity) {
        super(type, pos, state);
        this.capacity = capacity;
    }

    public FluidStack getFluidStack() {
        return stack;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void setFluidStack(FluidStack stack) {
        if (stack.getAmount() > capacity) {
            this.stack = new FluidStack(stack.getFluid(), capacity);
        } else {
            this.stack = stack.copy();
        }

        setChanged();
        if (level != null && !level.isClientSide) {
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 3);
        }
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);

        if (!stack.isEmpty()) {
            FluidStack.CODEC
                    .encodeStart(NbtOps.INSTANCE, stack)
                    .resultOrPartial(err -> {})
                    .ifPresent(nbt -> tag.put("FluidStack", nbt));
        }
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);

        if (tag.contains("FluidName")) {
            ResourceLocation id = ResourceLocation.tryParse(tag.getString("FluidName"));
            if (id == null) {
                stack = FluidStack.EMPTY;
                return;
            }

            Fluid fluid = BuiltInRegistries.FLUID.get(id);
            if (fluid == Fluids.EMPTY) {
                stack = FluidStack.EMPTY;
                return;
            }

            int amount = Math.min(tag.getInt("Amount"), capacity);
            stack = amount > 0 ? new FluidStack(fluid, amount) : FluidStack.EMPTY;
            return;
        }

        if (tag.contains("FluidStack")) {
            FluidStack.CODEC
                    .parse(NbtOps.INSTANCE, tag.get("FluidStack"))
                    .resultOrPartial(err -> {})
                    .ifPresent(fs -> stack = fs);
            return;
        }

        stack = FluidStack.EMPTY;
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }
}
