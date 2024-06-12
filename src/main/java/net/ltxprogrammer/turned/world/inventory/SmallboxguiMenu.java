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
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/world/inventory/SmallboxguiMenu.class */
public class SmallboxguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap<>();
    public final Level world;
    public final Player entity;

    /* renamed from: x */
    public int f24x;

    /* renamed from: y */
    public int f25y;

    /* renamed from: z */
    public int f26z;
    private final Map<Integer, Slot> customSlots = new HashMap<>();
    private boolean bound = false;
    private IItemHandler internal = new ItemStackHandler(4);

    public SmallboxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(LatexModMenus.SMALLBOXGUI, id);
        ItemStack itemstack;
        this.entity = inv.player;
        this.world = inv.player.level;
        BlockPos pos = null;
        if (extraData != null) {
            pos = extraData.readBlockPos();
            this.f24x = pos.getX();
            this.f25y = pos.getY();
            this.f26z = pos.getZ();
        }
        if (pos != null) {
            if (extraData.readableBytes() == 1) {
                if (extraData.readByte() == 0) {
                    itemstack = this.entity.getMainHandItem();
                } else {
                    itemstack = this.entity.getOffhandItem();
                }
                itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                    this.internal = capability;
                    this.bound = true;
                });
            } else if (extraData.readableBytes() > 1) {
                extraData.readByte();
                Entity entity = this.world.getEntity(extraData.readVarInt());
                if (entity != null) {
                    entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            } else {
                BlockEntity ent = inv.player.level.getBlockEntity(pos);
                if (ent != null) {
                    ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            }
        }
        this.customSlots.put(0, addSlot(new SlotItemHandler(this.internal, 0, 70, 20) { // from class: net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu.1
        }));
        this.customSlots.put(1, addSlot(new SlotItemHandler(this.internal, 1, 88, 20) { // from class: net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu.2
        }));
        this.customSlots.put(2, addSlot(new SlotItemHandler(this.internal, 2, 70, 38) { // from class: net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu.3
        }));
        this.customSlots.put(3, addSlot(new SlotItemHandler(this.internal, 3, 88, 38) { // from class: net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu.4
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

    public boolean stillValid(@NotNull Player player) {
        return true;
    }

    public @NotNull ItemStack quickMoveStack(@NotNull Player playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < 4) {
                if (!moveItemStackTo(itemstack1, 4, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemstack1, itemstack);
            } else if (!moveItemStackTo(itemstack1, 0, 4, false)) {
                if (index < 31) {
                    if (!moveItemStackTo(itemstack1, 31, this.slots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!moveItemStackTo(itemstack1, 4, 31, false)) {
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
    protected boolean moveItemStackTo(net.minecraft.world.item.@NotNull ItemStack r5, int r6, int r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 372
        */
        throw new UnsupportedOperationException("Method not decompiled: net.ltxprogrammer.turned.world.inventory.SmallboxguiMenu.moveItemStackTo(net.minecraft.world.item.ItemStack, int, int, boolean):boolean");
    }

    public void removed(@NotNull Player playerIn) {
        removed(playerIn);
        if (!this.bound && (playerIn instanceof ServerPlayer serverPlayer)) {
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
