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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu.class */
public class SupplyCrateGuiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap<>();
    public final Level world;
    public final Player entity;
    public int x;
    public int y;
    public int z;
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
        this.customSlots.put(0, addSlot(new AnonymousClass1(this.internal, 0, 7, 8)));
        this.customSlots.put(1, addSlot(new AnonymousClass2(this.internal, 1, 25, 8)));
        this.customSlots.put(2, addSlot(new AnonymousClass3(this.internal, 2, 43, 8)));
        this.customSlots.put(3, addSlot(new AnonymousClass4(this.internal, 3, 61, 8)));
        this.customSlots.put(4, addSlot(new AnonymousClass5(this.internal, 4, 79, 8)));
        this.customSlots.put(5, addSlot(new AnonymousClass6(this.internal, 5, 97, 8)));
        this.customSlots.put(6, addSlot(new AnonymousClass7(this.internal, 6, 115, 8)));
        this.customSlots.put(7, addSlot(new AnonymousClass8(this.internal, 7, 133, 8)));
        this.customSlots.put(8, addSlot(new AnonymousClass9(this.internal, 8, 151, 8)));
        this.customSlots.put(9, addSlot(new AnonymousClass10(this.internal, 9, 7, 26)));
        this.customSlots.put(10, addSlot(new AnonymousClass11(this.internal, 10, 25, 26)));
        this.customSlots.put(11, addSlot(new AnonymousClass12(this.internal, 11, 43, 26)));
        this.customSlots.put(12, addSlot(new AnonymousClass13(this.internal, 12, 61, 26)));
        this.customSlots.put(13, addSlot(new AnonymousClass14(this.internal, 13, 79, 26)));
        this.customSlots.put(14, addSlot(new AnonymousClass15(this.internal, 14, 97, 26)));
        this.customSlots.put(15, addSlot(new AnonymousClass16(this.internal, 15, 115, 26)));
        this.customSlots.put(16, addSlot(new AnonymousClass17(this.internal, 16, 133, 26)));
        this.customSlots.put(17, addSlot(new AnonymousClass18(this.internal, 17, 151, 26)));
        this.customSlots.put(18, addSlot(new AnonymousClass19(this.internal, 18, 7, 44)));
        this.customSlots.put(19, addSlot(new AnonymousClass20(this.internal, 19, 25, 44)));
        this.customSlots.put(20, addSlot(new AnonymousClass21(this.internal, 20, 43, 44)));
        this.customSlots.put(21, addSlot(new AnonymousClass22(this.internal, 21, 61, 44)));
        this.customSlots.put(22, addSlot(new AnonymousClass23(this.internal, 22, 79, 44)));
        this.customSlots.put(23, addSlot(new AnonymousClass24(this.internal, 23, 97, 44)));
        this.customSlots.put(24, addSlot(new AnonymousClass25(this.internal, 24, 115, 44)));
        this.customSlots.put(25, addSlot(new AnonymousClass26(this.internal, 25, 133, 44)));
        this.customSlots.put(26, addSlot(new AnonymousClass27(this.internal, 26, 151, 44)));
        this.customSlots.put(27, addSlot(new AnonymousClass28(this.internal, 27, 7, 62)));
        this.customSlots.put(28, addSlot(new AnonymousClass29(this.internal, 28, 25, 62)));
        this.customSlots.put(29, addSlot(new AnonymousClass30(this.internal, 29, 43, 62)));
        this.customSlots.put(30, addSlot(new AnonymousClass31(this.internal, 30, 61, 62)));
        this.customSlots.put(31, addSlot(new AnonymousClass32(this.internal, 31, 79, 62)));
        this.customSlots.put(32, addSlot(new AnonymousClass33(this.internal, 32, 97, 62)));
        this.customSlots.put(33, addSlot(new AnonymousClass34(this.internal, 33, 115, 62)));
        this.customSlots.put(34, addSlot(new AnonymousClass35(this.internal, 34, 133, 62)));
        this.customSlots.put(35, addSlot(new AnonymousClass36(this.internal, 35, 151, 62)));
        for (int si = 0; si < 3; si++) {
            for (int sj = 0; sj < 9; sj++) {
                addSlot(new Slot(inv, sj + ((si + 1) * 9), 8 + (sj * 18), 84 + (si * 18)));
            }
        }
        for (int si2 = 0; si2 < 9; si2++) {
            addSlot(new Slot(inv, si2, 8 + (si2 * 18), 142));
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$1.class */
    class AnonymousClass1 extends SlotItemHandler {
        AnonymousClass1(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$2.class */
    class AnonymousClass2 extends SlotItemHandler {
        AnonymousClass2(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$3.class */
    class AnonymousClass3 extends SlotItemHandler {
        AnonymousClass3(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$4.class */
    class AnonymousClass4 extends SlotItemHandler {
        AnonymousClass4(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$5.class */
    class AnonymousClass5 extends SlotItemHandler {
        AnonymousClass5(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$6.class */
    class AnonymousClass6 extends SlotItemHandler {
        AnonymousClass6(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$7.class */
    class AnonymousClass7 extends SlotItemHandler {
        AnonymousClass7(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$8.class */
    class AnonymousClass8 extends SlotItemHandler {
        AnonymousClass8(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$9.class */
    class AnonymousClass9 extends SlotItemHandler {
        AnonymousClass9(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$10.class */
    class AnonymousClass10 extends SlotItemHandler {
        AnonymousClass10(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$11.class */
    class AnonymousClass11 extends SlotItemHandler {
        AnonymousClass11(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$12  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$12.class */
    class AnonymousClass12 extends SlotItemHandler {
        AnonymousClass12(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$13  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$13.class */
    class AnonymousClass13 extends SlotItemHandler {
        AnonymousClass13(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$14  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$14.class */
    class AnonymousClass14 extends SlotItemHandler {
        AnonymousClass14(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$15  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$15.class */
    class AnonymousClass15 extends SlotItemHandler {
        AnonymousClass15(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$16  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$16.class */
    class AnonymousClass16 extends SlotItemHandler {
        AnonymousClass16(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$17  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$17.class */
    class AnonymousClass17 extends SlotItemHandler {
        AnonymousClass17(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$18  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$18.class */
    class AnonymousClass18 extends SlotItemHandler {
        AnonymousClass18(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$19  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$19.class */
    class AnonymousClass19 extends SlotItemHandler {
        AnonymousClass19(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$20  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$20.class */
    class AnonymousClass20 extends SlotItemHandler {
        AnonymousClass20(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$21  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$21.class */
    class AnonymousClass21 extends SlotItemHandler {
        AnonymousClass21(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$22  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$22.class */
    class AnonymousClass22 extends SlotItemHandler {
        AnonymousClass22(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$23  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$23.class */
    class AnonymousClass23 extends SlotItemHandler {
        AnonymousClass23(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$24  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$24.class */
    class AnonymousClass24 extends SlotItemHandler {
        AnonymousClass24(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$25  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$25.class */
    class AnonymousClass25 extends SlotItemHandler {
        AnonymousClass25(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$26  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$26.class */
    class AnonymousClass26 extends SlotItemHandler {
        AnonymousClass26(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$27  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$27.class */
    class AnonymousClass27 extends SlotItemHandler {
        AnonymousClass27(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$28  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$28.class */
    class AnonymousClass28 extends SlotItemHandler {
        AnonymousClass28(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$29  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$29.class */
    class AnonymousClass29 extends SlotItemHandler {
        AnonymousClass29(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$30  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$30.class */
    class AnonymousClass30 extends SlotItemHandler {
        AnonymousClass30(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$31  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$31.class */
    class AnonymousClass31 extends SlotItemHandler {
        AnonymousClass31(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$32  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$32.class */
    class AnonymousClass32 extends SlotItemHandler {
        AnonymousClass32(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$33  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$33.class */
    class AnonymousClass33 extends SlotItemHandler {
        AnonymousClass33(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$34  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$34.class */
    class AnonymousClass34 extends SlotItemHandler {
        AnonymousClass34(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$35  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$35.class */
    class AnonymousClass35 extends SlotItemHandler {
        AnonymousClass35(IItemHandler arg0, int arg1, int arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }
    }

    /* renamed from: net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu$36  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/inventory/SupplyCrateGuiMenu$36.class */
    class AnonymousClass36 extends SlotItemHandler {
        AnonymousClass36(IItemHandler arg0, int arg1, int arg2, int arg3) {
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
