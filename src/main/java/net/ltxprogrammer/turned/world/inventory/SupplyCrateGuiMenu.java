package net.ltxprogrammer.turned.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.ltxprogrammer.turned.init.LatexModMenus;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/world/inventory/SupplyCrateGuiMenu.class */
public class SupplyCrateGuiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap<>();
    public final Level world;
    public final Player entity;

    /* renamed from: x */
    public int f27x;

    /* renamed from: y */
    public int f28y;

    /* renamed from: z */
    public int f29z;
    private final Map<Integer, Slot> customSlots = new HashMap();
    private boolean bound = false;
    private IItemHandler internal = new ItemStackHandler(36);

    public SupplyCrateGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(LatexModMenus.SUPPLY_CRATE_GUI, id);
        ItemStack itemstack;
        this.entity = inv.player;
        this.world = inv.player.level;
        BlockPos pos = null;
        if (extraData != null) {
            pos = extraData.readBlockPos();
            this.f27x = pos.getX();
            this.f28y = pos.getY();
            this.f29z = pos.getZ();
        }
        if (pos != null) {
            if (extraData.readableBytes() == 1) {
                if (extraData.readByte() == 0) {
                    itemstack = this.entity.getMainHandItem();
                } else {
                    itemstack = this.entity.getOffhandItem();
                }
                itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction) null).ifPresent(capability -> {
                    this.internal = capability;
                    this.bound = true;
                });
            } else if (extraData.readableBytes() > 1) {
                extraData.readByte();
                Entity entity = this.world.getEntity(extraData.readVarInt());
                if (entity != null) {
                    entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction) null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            } else {
                BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
                if (ent != null) {
                    ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction) null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            }
        }
        this.customSlots.put(0, addSlot(new SlotItemHandler(this.internal, 0, 7, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.1
        }));
        this.customSlots.put(1, addSlot(new SlotItemHandler(this.internal, 1, 25, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.2
        }));
        this.customSlots.put(2, addSlot(new SlotItemHandler(this.internal, 2, 43, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.3
        }));
        this.customSlots.put(3, addSlot(new SlotItemHandler(this.internal, 3, 61, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.4
        }));
        this.customSlots.put(4, addSlot(new SlotItemHandler(this.internal, 4, 79, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.5
        }));
        this.customSlots.put(5, addSlot(new SlotItemHandler(this.internal, 5, 97, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.6
        }));
        this.customSlots.put(6, addSlot(new SlotItemHandler(this.internal, 6, 115, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.7
        }));
        this.customSlots.put(7, addSlot(new SlotItemHandler(this.internal, 7, 133, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.8
        }));
        this.customSlots.put(8, addSlot(new SlotItemHandler(this.internal, 8, 151, 8) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.9
        }));
        this.customSlots.put(9, addSlot(new SlotItemHandler(this.internal, 9, 7, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.10
        }));
        this.customSlots.put(10, addSlot(new SlotItemHandler(this.internal, 10, 25, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.11
        }));
        this.customSlots.put(11, addSlot(new SlotItemHandler(this.internal, 11, 43, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.12
        }));
        this.customSlots.put(12, addSlot(new SlotItemHandler(this.internal, 12, 61, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.13
        }));
        this.customSlots.put(13, addSlot(new SlotItemHandler(this.internal, 13, 79, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.14
        }));
        this.customSlots.put(14, addSlot(new SlotItemHandler(this.internal, 14, 97, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.15
        }));
        this.customSlots.put(15, addSlot(new SlotItemHandler(this.internal, 15, 115, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.16
        }));
        this.customSlots.put(16, addSlot(new SlotItemHandler(this.internal, 16, 133, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.17
        }));
        this.customSlots.put(17, addSlot(new SlotItemHandler(this.internal, 17, 151, 26) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.18
        }));
        this.customSlots.put(18, addSlot(new SlotItemHandler(this.internal, 18, 7, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.19
        }));
        this.customSlots.put(19, addSlot(new SlotItemHandler(this.internal, 19, 25, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.20
        }));
        this.customSlots.put(20, addSlot(new SlotItemHandler(this.internal, 20, 43, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.21
        }));
        this.customSlots.put(21, addSlot(new SlotItemHandler(this.internal, 21, 61, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.22
        }));
        this.customSlots.put(22, addSlot(new SlotItemHandler(this.internal, 22, 79, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.23
        }));
        this.customSlots.put(23, addSlot(new SlotItemHandler(this.internal, 23, 97, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.24
        }));
        this.customSlots.put(24, addSlot(new SlotItemHandler(this.internal, 24, 115, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.25
        }));
        this.customSlots.put(25, addSlot(new SlotItemHandler(this.internal, 25, 133, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.26
        }));
        this.customSlots.put(26, addSlot(new SlotItemHandler(this.internal, 26, 151, 44) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.27
        }));
        this.customSlots.put(27, addSlot(new SlotItemHandler(this.internal, 27, 7, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.28
        }));
        this.customSlots.put(28, addSlot(new SlotItemHandler(this.internal, 28, 25, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.29
        }));
        this.customSlots.put(29, addSlot(new SlotItemHandler(this.internal, 29, 43, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.30
        }));
        this.customSlots.put(30, addSlot(new SlotItemHandler(this.internal, 30, 61, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.31
        }));
        this.customSlots.put(31, addSlot(new SlotItemHandler(this.internal, 31, 79, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.32
        }));
        this.customSlots.put(32, addSlot(new SlotItemHandler(this.internal, 32, 97, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.33
        }));
        this.customSlots.put(33, addSlot(new SlotItemHandler(this.internal, 33, 115, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.34
        }));
        this.customSlots.put(34, addSlot(new SlotItemHandler(this.internal, 34, 133, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.35
        }));
        this.customSlots.put(35, addSlot(new SlotItemHandler(this.internal, 35, 151, 62) { // from class: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.36
        }));
        for (int si = 0; si < 3; si++) {
            for (int sj = 0; sj < 9; sj++) {
                addSlot(new Slot(inv, sj + ((si + 1) * 9), 8 + (sj * 18), 84 + (si * 18)));
            }
        }
        for (int si2 = 0; si2 < 9; si2++) {
            addSlot(new Slot(inv, si2, 8 + (si2 * 18), 142));
        }
    }

    public boolean stillValid(Player player) {
        return true;
    }

    public ItemStack quickMoveStack(Player playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot) this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < 36) {
                if (!moveItemStackTo(itemstack1, 36, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemstack1, itemstack);
            } else if (!moveItemStackTo(itemstack1, 0, 36, false)) {
                if (index < 63) {
                    if (!moveItemStackTo(itemstack1, 63, this.slots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!moveItemStackTo(itemstack1, 36, 63, false)) {
                    return ItemStack.EMPTY;
                }
                return ItemStack.EMPTY;
            }
            if (itemstack1.getCount() == 0) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTake(playerIn, itemstack1);
        }
        return itemstack;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x016b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0165 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean moveItemStackTo(net.minecraft.world.item.ItemStack r5, int r6, int r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu.moveItemStackTo(net.minecraft.world.item.ItemStack, int, int, boolean):boolean");
    }

    public void removed(Player playerIn) {
        removed(playerIn);
        if (!this.bound && (playerIn instanceof ServerPlayer)) {
            ServerPlayer serverPlayer = (ServerPlayer) playerIn;
            if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
                for (int j = 0; j < this.internal.getSlots(); j++) {
                    playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
                }
                return;
            }
            for (int i = 0; i < this.internal.getSlots(); i++) {
                playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
            }
        }
    }

    @Override // java.util.function.Supplier
    public Map<Integer, Slot> get() {
        return this.customSlots;
    }
}
