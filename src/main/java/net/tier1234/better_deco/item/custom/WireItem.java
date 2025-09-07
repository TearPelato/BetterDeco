package net.tier1234.better_deco.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.tier1234.better_deco.energy.IEnergyNode;

import java.util.List;

public class WireItem extends Item {

    public WireItem(Properties props) {
        super(props);
    }

    @Override
    public InteractionResult useOn(UseOnContext c) {
        if (c.getPlayer() == null) return InteractionResult.PASS;
        if (!c.getPlayer().isShiftKeyDown()) return InteractionResult.PASS;

        ItemStack stack = c.getItemInHand();
        var customData = stack.get(DataComponents.CUSTOM_DATA);
        CompoundTag nbt = customData != null ? customData.copyTag() : new CompoundTag();

        BlockPos clickedPos = c.getClickedPos();
        Level level = c.getLevel();
        BlockEntity be = level.getBlockEntity(clickedPos);

        if (!(be instanceof IEnergyNode node)) {
            return InteractionResult.PASS;
        }

        if (hasPos(nbt)) {
            BlockPos firstPos = getPos(nbt);
            BlockEntity firstBe = level.getBlockEntity(firstPos);

            if (!(firstBe instanceof IEnergyNode firstNode)) {
                stack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
                c.getPlayer().displayClientMessage(Component.translatable("util.better_deco.invalid_generator"), true);
                return InteractionResult.FAIL;
            }

            if (firstNode.isProducer() && node.isConsumer()) {
                firstNode.connectTo(clickedPos);
                node.connectTo(firstPos);

                playConnectSound(level, clickedPos);
                c.getPlayer().displayClientMessage(Component.translatable("util.better_deco.consumer_linked"), true);

                if (!c.getPlayer().isCreative()) {
                    stack.shrink(1);
                }
            } else {
                c.getPlayer().displayClientMessage(Component.translatable("util.better_deco.invalid_consumer"), true);
                playErrorSound(level, clickedPos);
            }

            // reset dati
            stack.set(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
            return InteractionResult.CONSUME;

        } else {
            CompoundTag newNbt = new CompoundTag();
            newNbt.putInt("x", clickedPos.getX());
            newNbt.putInt("y", clickedPos.getY());
            newNbt.putInt("z", clickedPos.getZ());

            stack.set(DataComponents.CUSTOM_DATA, CustomData.of(newNbt));

            c.getPlayer().displayClientMessage(Component.translatable("util.better_deco.generator_linked"), true);
            playSelectSound(level, clickedPos);
            return InteractionResult.CONSUME;
        }
    }

    public static boolean hasPos(CompoundTag nbt) {
        return nbt.contains("x") && nbt.contains("y") && nbt.contains("z");
    }

    public static BlockPos getPos(CompoundTag nbt) {
        return new BlockPos(nbt.getInt("x"), nbt.getInt("y"), nbt.getInt("z"));
    }

    public static void setPos(ItemStack stack, BlockPos pos) {
        CustomData.update(DataComponents.CUSTOM_DATA, stack, nbt -> {
            nbt.putInt("x", pos.getX());
            nbt.putInt("y", pos.getY());
            nbt.putInt("z", pos.getZ());
        });
    }

    public static void clearPos(ItemStack stack) {
        CustomData.update(DataComponents.CUSTOM_DATA, stack, nbt -> {
            nbt.remove("x");
            nbt.remove("y");
            nbt.remove("z");
        });
    }

    private void playSelectSound(Level level, BlockPos pos) {
        level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(),
                SoundEvents.BOOK_PUT, SoundSource.BLOCKS, 1f, 1f, false);
    }

    private void playConnectSound(Level level, BlockPos pos) {
        level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(),
                SoundEvents.NOTE_BLOCK_XYLOPHONE.value(), SoundSource.BLOCKS, 0.7f, 1f, false);
    }

    private void playErrorSound(Level level, BlockPos pos) {
        level.playLocalSound(pos.getX(), pos.getY(), pos.getZ(),
                SoundEvents.NOTE_BLOCK_DIDGERIDOO.value(), SoundSource.BLOCKS, 0.7f, 1f, false);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);
        var customData = stack.get(DataComponents.CUSTOM_DATA);
        if (customData != null && hasPos(customData.copyTag())) {
            tooltip.add(Component.translatable("util.better_deco.linked"));
        }
    }
}