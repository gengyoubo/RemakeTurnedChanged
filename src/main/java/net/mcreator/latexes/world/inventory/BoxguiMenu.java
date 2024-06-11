package net.mcreator.latexes.world.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import net.mcreator.latexes.init.LatexModMenus;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu.class */
public class BoxguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap<>();
    public final Level world;
    public final Player entity;
    public int x;
    public int y;
    public int z;
    private final Map<Integer, Slot> customSlots = new HashMap();
    private boolean bound = false;
    private IItemHandler internal = new ItemStackHandler(12);

    public BoxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(LatexModMenus.BOXGUI, id);
        ItemStack itemstack;
        this.entity = inv.player;
        this.world = inv.player.level;
        BlockPos pos = null;
        if (extraData != null) {
            pos = extraData.readBlockPos();
            this.x = pos.getX();
            this.y = pos.getY();
            this.z = pos.getZ();
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
        this.customSlots.put(0, addSlot(new AnonymousClass1(this.internal, 0, 52, 17)));
        this.customSlots.put(1, addSlot(new AnonymousClass2(this.internal, 1, 70, 17)));
        this.customSlots.put(2, addSlot(new AnonymousClass3(this.internal, 2, 88, 17)));
        this.customSlots.put(3, addSlot(new AnonymousClass4(this.internal, 3, 106, 17)));
        this.customSlots.put(4, addSlot(new AnonymousClass5(this.internal, 4, 52, 35)));
        this.customSlots.put(5, addSlot(new AnonymousClass6(this.internal, 5, 70, 35)));
        this.customSlots.put(6, addSlot(new AnonymousClass7(this.internal, 6, 88, 35)));
        this.customSlots.put(7, addSlot(new AnonymousClass8(this.internal, 7, 106, 35)));
        this.customSlots.put(8, addSlot(new AnonymousClass9(this.internal, 8, 52, 53)));
        this.customSlots.put(9, addSlot(new AnonymousClass10(this.internal, 9, 70, 53)));
        this.customSlots.put(10, addSlot(new AnonymousClass11(this.internal, 10, 88, 53)));
        this.customSlots.put(11, addSlot(new AnonymousClass12(this.internal, 11, 106, 53)));
        for (int si = 0; si < 3; si++) {
            for (int sj = 0; sj < 9; sj++) {
                addSlot(new Slot(inv, sj + ((si + 1) * 9), 8 + (sj * 18), 84 + (si * 18)));
            }
        }
        for (int si2 = 0; si2 < 9; si2++) {
            addSlot(new Slot(inv, si2, 8 + (si2 * 18), 142));
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$1.class */
    class AnonymousClass1 extends SlotItemHandler {
        AnonymousClass1(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$2.class */
    class AnonymousClass2 extends SlotItemHandler {
        AnonymousClass2(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$3.class */
    class AnonymousClass3 extends SlotItemHandler {
        AnonymousClass3(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$4.class */
    class AnonymousClass4 extends SlotItemHandler {
        AnonymousClass4(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$5.class */
    class AnonymousClass5 extends SlotItemHandler {
        AnonymousClass5(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$6.class */
    class AnonymousClass6 extends SlotItemHandler {
        AnonymousClass6(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$7.class */
    class AnonymousClass7 extends SlotItemHandler {
        AnonymousClass7(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$8.class */
    class AnonymousClass8 extends SlotItemHandler {
        AnonymousClass8(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$9.class */
    class AnonymousClass9 extends SlotItemHandler {
        AnonymousClass9(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$10.class */
    class AnonymousClass10 extends SlotItemHandler {
        AnonymousClass10(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$11.class */
    class AnonymousClass11 extends SlotItemHandler {
        AnonymousClass11(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.BoxguiMenu$12  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/BoxguiMenu$12.class */
    class AnonymousClass12 extends SlotItemHandler {
        AnonymousClass12(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
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
            if (index < 12) {
                if (!moveItemStackTo(itemstack1, 12, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemstack1, itemstack);
            } else if (!moveItemStackTo(itemstack1, 0, 12, false)) {
                if (index < 39) {
                    if (!moveItemStackTo(itemstack1, 39, this.slots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!moveItemStackTo(itemstack1, 12, 39, false)) {
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
    protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
        int i;
        Slot slot1;
        Slot slot;
        ItemStack itemstack;
        int j;
        int maxSize;
        boolean flag = false;
        int i2 = p_38905_;
        if (p_38907_) {
            i2 = p_38906_ - 1;
        }
        if (p_38904_.isStackable()) {
            while (!p_38904_.isEmpty()) {
                if (p_38907_) {
                    if (i2 < p_38905_) {
                        break;
                    }
                    slot = (Slot) this.slots.get(i2);
                    itemstack = slot.getItem();
                    if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
                        j = itemstack.getCount() + p_38904_.getCount();
                        maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
                        if (j > maxSize) {
                            p_38904_.setCount(0);
                            itemstack.setCount(j);
                            slot.set(itemstack);
                            flag = true;
                        } else if (itemstack.getCount() < maxSize) {
                            p_38904_.shrink(maxSize - itemstack.getCount());
                            itemstack.setCount(maxSize);
                            slot.set(itemstack);
                            flag = true;
                        }
                    }
                    if (!p_38907_) {
                        i2--;
                    } else {
                        i2++;
                    }
                } else {
                    if (i2 >= p_38906_) {
                        break;
                    }
                    slot = (Slot) this.slots.get(i2);
                    itemstack = slot.getItem();
                    if (slot.mayPlace(itemstack)) {
                        j = itemstack.getCount() + p_38904_.getCount();
                        maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
                        if (j > maxSize) {
                        }
                    }
                    if (!p_38907_) {
                    }
                }
            }
        }
        if (!p_38904_.isEmpty()) {
            if (p_38907_) {
                i = p_38906_ - 1;
            } else {
                i = p_38905_;
            }
            while (true) {
                if (p_38907_) {
                    if (i < p_38905_) {
                        break;
                    }
                    slot1 = (Slot) this.slots.get(i);
                    if (!slot1.getItem().isEmpty() && slot1.mayPlace(p_38904_)) {
                        if (p_38904_.getCount() > slot1.getMaxStackSize()) {
                            slot1.set(p_38904_.split(slot1.getMaxStackSize()));
                        } else {
                            slot1.set(p_38904_.split(p_38904_.getCount()));
                        }
                        slot1.setChanged();
                        flag = true;
                    } else if (!p_38907_) {
                        i--;
                    } else {
                        i++;
                    }
                } else {
                    if (i >= p_38906_) {
                        break;
                    }
                    slot1 = (Slot) this.slots.get(i);
                    if (!slot1.getItem().isEmpty()) {
                    }
                    if (!p_38907_) {
                    }
                }
            }
        }
        return flag;
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