package net.tier1234.better_deco.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.tier1234.better_deco.block.entity.GeneratorBlockEntity;
import net.tier1234.better_deco.energy.ModEnergyUtil;

public class WireItem extends Item {
    public WireItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();
        BlockPos pos = context.getClickedPos();

        if (player.isCrouching()&& !level.isClientSide())

            return InteractionResult.SUCCESS;

        CustomData cd = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY);
        CompoundTag tag = cd.copyTag();

        if (!tag.contains("generatorPos")) {
            if (ModEnergyUtil.doesBlockHaveEnergyStorage(pos, level)) {
                tag.putLong("generatorPos", pos.asLong());
                player.displayClientMessage(Component.translatable("util.better_deco.generator_linked"), true);
                return InteractionResult.SUCCESS;
            }
        }
        // Secondo click → collega al consumer
        else {
            BlockPos generatorPos = BlockPos.of(tag.getLong("generatorPos"));
            BlockEntity be = level.getBlockEntity(generatorPos);

            if (be instanceof GeneratorBlockEntity generator) {
                if (ModEnergyUtil.doesBlockHaveEnergyStorage(pos, level)) {
                    generator.addLinkedBlock(pos);
                    player.displayClientMessage(Component.translatable("util.better_deco.consumer_linked"), true);
                }
            }
            tag.remove("generatorPos");
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}