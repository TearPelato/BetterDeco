package net.tier1234.better_deco.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.fluids.capability.IFluidHandler;
import net.neoforged.neoforge.fluids.capability.templates.FluidTank;
import org.jetbrains.annotations.Nullable;

@Deprecated(forRemoval = true)
public abstract class FluidHandlerSyncedBlockEntity extends BlockEntity
{
    protected final FluidTank tank;

    public FluidHandlerSyncedBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state, int capacity)
    {
        super(type, pos, state);
        this.tank = new FluidTank(capacity)
        {
            @Override
            protected void onContentsChanged()
            {
                // Invalida la cache di rendering del BlockState/Modello
                setChanged();

                // Chiama il tuo metodo di sincronizzazione al client
                FluidHandlerSyncedBlockEntity.this.syncFluidToClient(FluidHandlerSyncedBlockEntity.this.level.registryAccess());
            }
        };
    }

    /**
     * Questo metodo è l'equivalente della vecchia logica "getCapability"
     * ed è quello che deve essere chiamato dal provider registrato nell'evento.
     * @param context La direzione (lato) da cui viene richiesta la capability.
     * @return L'istanza IFluidHandler (il tank).
     */
    public IFluidHandler getFluidHandler(@Nullable Direction context)
    {
        // Qui puoi aggiungere la logica "sided" se necessario (es. non permettere l'input da un certo lato).
        return this.tank;
    }

    public FluidTank getTank()
    {
        return this.tank;
    }

    // --- Logica di Sincronizzazione ---

    private void syncFluidToClient(HolderLookup.Provider registries)
    {
        // NOTA Importante: 'BlockEntityUtil.sendUpdatePacket' non è uno standard di Forge/NeoForge.
        // Ho usato un metodo comune (mark and send update packet).

        // Questo forza l'invio del pacchetto getUpdatePacket() al client
        if (this.level != null && !this.level.isClientSide) {
            this.level.sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
        }
    }

    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries)
    {
        super.loadAdditional(tag, registries);
        this.tank.readFromNBT(registries, tag);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries)
    {
        super.saveAdditional(tag, registries);
        // Il metodo writeToNBT di FluidTank è stato aggiornato per usare HolderLookup.Provider
        this.tank.writeToNBT(registries, tag);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries)
    {
        // Salva lo stato completo del BE, inclusi i dati del tank, per la sincronizzazione iniziale
        return this.saveWithFullMetadata(registries);
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket()
    {
        // Utilizza il metodo standard per creare il pacchetto di aggiornamento
        return ClientboundBlockEntityDataPacket.create(this);
    }

    // *** RIMOSSO: Il vecchio metodo getCapability è eliminato e sostituito dalla registrazione esterna ***
    /*
    @Override
    public <T> Optional<T> getCapability(BlockCapability capability, @Nullable Direction facing)
    {
        // ... Logica eliminata ...
    }
    */
}