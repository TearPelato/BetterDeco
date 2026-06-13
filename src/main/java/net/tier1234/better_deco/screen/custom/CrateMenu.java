package net.tier1234.better_deco.screen.custom;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;
import net.tier1234.better_deco.init.ModBlocks;
import net.tier1234.better_deco.block.entity.custom.CrateBlockEntity;
import net.tier1234.better_deco.init.ModMenuTypes;

public class CrateMenu extends AbstractContainerMenu {
    public final CrateBlockEntity blockEntity;
    public final Level level;


   public CrateMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        this(containerId,inv, inv.player.level().getBlockEntity(extraData.readBlockPos()));
    }
    public CrateMenu(int containerId, Inventory inv, BlockEntity blockEntity) {
       super(ModMenuTypes.CRATE_MENU.get(), containerId);
       this.blockEntity= ((CrateBlockEntity) blockEntity);
       this.level = inv.player.level();
       addPlayerInventory(inv);
        addPlayerHotbar(inv);

        //First Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,0,-10,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,1,8,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,2,26,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,3,44,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,4,62,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,5,80,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,6,98,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,7,116,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,8,134,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,9,152,-16));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,10,170,-16));
        //Second Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,11,-10,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,12,8,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,13,26,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,14,44,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,15,62,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,16,80,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,17,98,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,18,116,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,19,134,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,20,152,2));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,21,170,2));
        //Third Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,22,-10,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,23,8,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,24,26,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,25,44,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,26,62,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,27,80,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,28,98,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,29,116,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,30,134,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,31,152,20));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,32,170,20));
        //Fourth Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,33,-10,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,34,8,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,35,26,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,36,44,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,37,62,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,38,80,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,39,98,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,40,116,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,41,134,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,42,152,38));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,43,170,38));
        //Fifth Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,44,-10,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,45,8,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,46,26,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,47,44,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,48,62,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,49,80,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,50,98,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,51,116,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,52,134,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,53,152,56));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,54,170,56));
        //Sixth Row
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,55,-10,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,56,8,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,57,26,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,58,44,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,59,62,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,60,80,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,61,98,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,62,116,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,63,134,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,64,152,74));
        this.addSlot(new SlotItemHandler(this.blockEntity.inventory,65,170,74));

    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 66;  // must be the number of slots you have!
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                player, ModBlocks.OAK_CRATE.get())
                ||
        stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                player, ModBlocks.WARPED_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.SPRUCE_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.BIRCH_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.JUNGLE_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.ACACIA_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.DARK_OAK_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.MANGROVE_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.CHERRY_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.BAMBOO_CRATE.get())
                ||
                stillValid(ContainerLevelAccess.create(level, blockEntity.getBlockPos()),
                        player, ModBlocks.CRIMSON_CRATE.get());

    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 118 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 176));
        }
    }
}
