package net.tier1234.better_deco.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.LongTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.Connection;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.energy.IEnergyStorage;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.tier1234.better_deco.energy.IEnergyNode;
import net.tier1234.better_deco.energy.ModEnergyStorage;
import net.tier1234.better_deco.energy.ModEnergyUtil;
import net.tier1234.better_deco.screen.custom.GeneratorMenu;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class GeneratorBlockEntity extends BlockEntity implements MenuProvider, IEnergyNode {

    public final ItemStackHandler itemHandler = new ItemStackHandler(1) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
            if (!level.isClientSide()) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        }
    };



    private static final int INPUT_SLOT = 0;
    private static final int ENERGY_TRANSFER_AMOUNT = 320;

    private final List<BlockPos> linkedConsumers = new ArrayList<>();

    private int burnProgress = 160;
    private int maxBurnProgress = 160;
    private boolean isBurning = false;

    private final ModEnergyStorage ENERGY_STORAGE = createEnergyStorage();

    private ModEnergyStorage createEnergyStorage() {
        return new ModEnergyStorage(64000, 320) {
            @Override
            public void onEnergyChanged() {
                setChanged();
                getLevel().sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        };
    }

    protected final ContainerData data;

    public GeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GENERATOR.get(), pos, state);
        this.data = new ContainerData() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> GeneratorBlockEntity.this.burnProgress;
                    case 1 -> GeneratorBlockEntity.this.maxBurnProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0 -> GeneratorBlockEntity.this.burnProgress = value;
                    case 1 -> GeneratorBlockEntity.this.maxBurnProgress = value;
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        };
    }

    @Override
    public void disconnectFrom(BlockPos pos) {
        linkedConsumers.remove(pos);
        setChanged();
    }

    @Override
    public boolean isProducer() {
        return true;
    }

    @Override
    public boolean isConsumer() {
        return false;
    }

    @Override
    public void connectTo(BlockPos pos) {
        if (!linkedConsumers.contains(pos)) {
            linkedConsumers.add(pos);
            setChanged();
        }
    }

    @Override
    public List<BlockPos> getConnections() {
        return linkedConsumers;
    }

    public IEnergyStorage getEnergyStorage(@Nullable net.minecraft.core.Direction direction) {
        return this.ENERGY_STORAGE;
    }

    public void tick(Level level, BlockPos blockPos, BlockState state) {
        if (hasFuelItemInSlot()) {
            if (!isBurningFuel()) {
                startBurning();
            }
        }

        if (isBurningFuel()) {
            increaseBurnTimer();
            if (currentFuelDoneBurning()) {
                resetBurning();
            }
            fillUpOnEnergy();
        }

        pushEnergyToNeighbourAbove();
        pushEnergyToLinkedConsumers();
    }

    private void pushEnergyToNeighbourAbove() {
        if (ModEnergyUtil.doesBlockHaveEnergyStorage(this.worldPosition.above(), this.level)) {
            ModEnergyUtil.move(this.worldPosition, this.worldPosition.above(), ENERGY_TRANSFER_AMOUNT, this.level);
        }
    }

    private void pushEnergyToLinkedConsumers() {
        linkedConsumers.removeIf(pos -> {
            if (ModEnergyUtil.doesBlockHaveEnergyStorage(pos, this.level)) {
                ModEnergyUtil.move(this.worldPosition, pos, ENERGY_TRANSFER_AMOUNT, this.level);
                return false;
            }
            return true; // remove invalid
        });
    }

    private boolean hasFuelItemInSlot() {
        return this.itemHandler.getStackInSlot(INPUT_SLOT).is(Items.COAL);
    }

    private boolean isBurningFuel() {
        return isBurning;
    }

    private void startBurning() {
        this.itemHandler.extractItem(INPUT_SLOT, 1, false);
        isBurning = true;
    }

    private void increaseBurnTimer() {
        this.burnProgress--;
    }

    private boolean currentFuelDoneBurning() {
        return this.burnProgress <= 0;
    }

    private void resetBurning() {
        isBurning = false;
        this.burnProgress = 160;
    }

    private void fillUpOnEnergy() {
        this.ENERGY_STORAGE.receiveEnergy(320, false);
    }



    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        tag.put("inventory", itemHandler.serializeNBT(provider));
        tag.putInt("burn_progress", burnProgress);
        tag.putInt("max_burn_progress", maxBurnProgress);
        tag.putInt("energy", ENERGY_STORAGE.getEnergyStored());

        ListTag listTag = new ListTag();
        for (BlockPos pos : linkedConsumers) {
            listTag.add(LongTag.valueOf(pos.asLong()));
        }
        tag.put("linked_consumers", listTag);

        super.saveAdditional(tag, provider);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider provider) {
        super.loadAdditional(tag, provider);
        itemHandler.deserializeNBT(provider, tag.getCompound("inventory"));
        ENERGY_STORAGE.setEnergy(tag.getInt("energy"));

        burnProgress = tag.getInt("burn_progress");
        maxBurnProgress = tag.getInt("max_burn_progress");

        linkedConsumers.clear();
        if (tag.contains("linked_consumers")) {
            ListTag listTag = tag.getList("linked_consumers", Tag.TAG_LONG);
            for (Tag t : listTag) {
                if (t instanceof LongTag longTag) {
                    linkedConsumers.add(BlockPos.of(longTag.getAsLong()));
                }
            }
        }
    }
    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider provider) {
        return saveWithoutMetadata(provider);
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt, HolderLookup.Provider provider) {
        super.onDataPacket(net, pkt, provider);
    }


    public void drops() {
        SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
        for (int i = 0; i < itemHandler.getSlots(); i++) {
            inventory.setItem(i, itemHandler.getStackInSlot(i));
        }
        Containers.dropContents(this.level, this.worldPosition, inventory);
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("gui.better_deco.generator");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int pContainerId, Inventory pPlayerInventory, Player pPlayer) {
        return new GeneratorMenu(pContainerId, pPlayerInventory, this, this.data);
    }
}