package net.tier1234.better_deco.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.tier1234.better_deco.block.entity.GeneratorBlockEntity;
import net.tier1234.better_deco.block.entity.MicrowaveBlockEntity;
import net.tier1234.better_deco.block.entity.OvenBlockEntity;

import java.util.List;

public class WireItem extends Item {

    public WireItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext c) {
        Player player = c.getPlayer();
        Level level = c.getLevel();
        ItemStack stack = c.getItemInHand();
        BlockPos clickedPos = c.getClickedPos();

        if (player == null || level.isClientSide()) return InteractionResult.PASS;
        if (!player.isCrouching()) return InteractionResult.PASS;

        CustomData data = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag nbt = data.copyTag();

        BlockEntity be = level.getBlockEntity(clickedPos);
        if (be == null) return InteractionResult.PASS;

        if (!nbt.contains("generatorPos")) {
            if (be instanceof GeneratorBlockEntity) {
                nbt.putLong("generatorPos", clickedPos.asLong());
                stack.set(DataComponents.CUSTOM_DATA, CustomData.of(nbt));

                player.displayClientMessage(Component.translatable("util.better_deco.generator_linked"), true);
                level.playSound(null, clickedPos, SoundEvents.NOTE_BLOCK_PLING.value(), SoundSource.BLOCKS, 1.0f, 1.2f);
                return InteractionResult.SUCCESS;
            }
        }
        else {
            BlockPos generatorPos = BlockPos.of(nbt.getLong("generatorPos"));
            BlockEntity genBe = level.getBlockEntity(generatorPos);

            if (genBe instanceof GeneratorBlockEntity generator) {
                if (be instanceof OvenBlockEntity || be instanceof MicrowaveBlockEntity) {
                    generator.addLinkedBlock(clickedPos);

                    player.displayClientMessage(Component.translatable("util.better_deco.consumer_linked"), true);
                    level.playSound(null, clickedPos, SoundEvents.NOTE_BLOCK_XYLOPHONE.value(), SoundSource.BLOCKS, 1.0f, 1.0f);

                    nbt.remove("generatorPos");
                    stack.set(DataComponents.CUSTOM_DATA, CustomData.of(nbt));
                    return InteractionResult.SUCCESS;
                } else {
                    player.displayClientMessage(Component.translatable("util.better_deco.invalid_consumer"), true);
                    level.playSound(null, clickedPos, SoundEvents.NOTE_BLOCK_DIDGERIDOO.value(), SoundSource.BLOCKS, 1.0f, 0.8f);
                }
            }
            nbt.remove("generatorPos");
            stack.set(DataComponents.CUSTOM_DATA, CustomData.of(nbt));
        }

        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

        CustomData data = stack.get(DataComponents.CUSTOM_DATA);
        if (data == null) return;
        CompoundTag nbt = data.copyTag();

        if (nbt.contains("generatorPos")) {
            tooltipComponents.add(Component.translatable("util.better_deco.wire_linked"));
        }
    }

}