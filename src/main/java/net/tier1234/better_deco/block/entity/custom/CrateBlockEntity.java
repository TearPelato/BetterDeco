package net.tier1234.better_deco.block.entity.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.transfer.item.ItemResource;
import net.neoforged.neoforge.transfer.item.ItemStacksResourceHandler;
import net.tearpelato.deco_lib.api.block_entity.BasicLootBlockEntity;
import net.tier1234.better_deco.init.ModBlockEntities;
import net.tier1234.better_deco.screen.custom.CrateMenu;
import org.jetbrains.annotations.Nullable;

public class CrateBlockEntity extends BasicLootBlockEntity {

    public final ItemStacksResourceHandler inventory = new ItemStacksResourceHandler(66) {
        @Override
        protected int getCapacity(int index, ItemResource resource) {
            return 1;
        }
        @Override
        protected void onContentsChanged(int index, ItemStack previousContents) {
            setChanged();
            if(!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };

    public CrateBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.STORAGE_CRATE.get(), pos, blockState);
    }



    public void drops() {
        SimpleContainer inv = new SimpleContainer(inventory.size());
        for(int i = 0; i < inventory.size(); i++) {
            inv.setItem(i, inventory.copyToList().get(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inv);
    }

    @Override
    public int getContainerSize() {
        return 66;
    }

    @Override
    protected Component getDefaultName() {
        return Component.literal("Crate");
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return new CrateMenu(i, inventory, this);
    }

    @Override
    public void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
    }

    @Override
    protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
    }
    @Override
    public void preRemoveSideEffects(BlockPos pos, BlockState state) {
        drops();
        super.preRemoveSideEffects(pos, state);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider pRegistries) {
        return saveWithoutMetadata(pRegistries);
    }
}
