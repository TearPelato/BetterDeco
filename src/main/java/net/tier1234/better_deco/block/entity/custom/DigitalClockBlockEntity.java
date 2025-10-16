package net.tier1234.better_deco.block.entity.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.tier1234.better_deco.block.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class DigitalClockBlockEntity extends BlockEntity {

    private DyeColor textColor = DyeColor.WHITE;

    public DigitalClockBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DIGITAL_CLOCK.get(), pos, state);
    }

    public void setTextColor(DyeColor color) {
        this.textColor = color;
        this.sync();
    }

    public DyeColor getTextColor() {
        return textColor;
    }

    public void sync() {
        if (this.level != null && !this.level.isClientSide()) {
            this.setChanged();
            this.level.sendBlockUpdated(this.worldPosition, this.getBlockState(), this.getBlockState(), 3);
        }
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return this.saveWithoutMetadata(registries);
    }

    @Nullable
    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public static String getFormattedTime(long ticks) {
        int hours = (int) ((Math.floor(ticks / 1000.0) + 6) % 24);
        int minutes = (int) Math.floor((ticks % 1000) / 1000.0 * 60);
        return String.format("%02d:%02d", hours, minutes);
    }

    public static int getFromColor(DyeColor color) {
        return switch (color) {
            case ORANGE -> 0xFFFFA500;
            case MAGENTA -> 0xFFFF00FF;
            case LIGHT_BLUE -> 0xFF55FFFF;
            case YELLOW -> 0xFFFFFF55;
            case LIME -> 0xFF55FF55;
            case PINK -> 0xFFFF55FF;
            case GRAY -> 0xFF555555;
            case LIGHT_GRAY -> 0xFFAAAAAA;
            case CYAN -> 0xFF00AAAA;
            case PURPLE -> 0xFFAA00AA;
            case BLUE -> 0xFF0000AA;
            case BROWN -> 0xFFAA5500;
            case GREEN -> 0xFF00AA00;
            case RED -> 0xFFAA0000;
            case BLACK -> 0xFF000000;
            default -> 0xFFFFFFFF; // bianco
        };
    }
}