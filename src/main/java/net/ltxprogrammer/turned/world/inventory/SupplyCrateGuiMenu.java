//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class SupplyCrateGuiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap();
    public final Level world;
    public final Player entity;
    public int x;
    public int y;
    public int z;
    private IItemHandler internal;
    private final Map<Integer, Slot> customSlots = new HashMap();
    private boolean bound = false;

    public SupplyCrateGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(LatexModMenus.SUPPLY_CRATE_GUI, id);
        this.entity = inv.player;
        this.world = inv.player.level;
        this.internal = new ItemStackHandler(36);
        BlockPos pos = null;
        if (extraData != null) {
            pos = extraData.readBlockPos();
            this.x = pos.getX();
            this.y = pos.getY();
            this.z = pos.getZ();
        }

        int si;
        if (pos != null) {
            if (extraData.readableBytes() == 1) {
                si = extraData.readByte();
                ItemStack itemstack;
                if (si == 0) {
                    itemstack = this.entity.getMainHandItem();
                } else {
                    itemstack = this.entity.getOffhandItem();
                }

                itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction)null).ifPresent((capability) -> {
                    this.internal = capability;
                    this.bound = true;
                });
            } else if (extraData.readableBytes() > 1) {
                extraData.readByte();
                Entity entity = this.world.getEntity(extraData.readVarInt());
                if (entity != null) {
                    entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction)null).ifPresent((capability) -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            } else {
                BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
                if (ent != null) {
                    ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, (Direction)null).ifPresent((capability) -> {
                        this.internal = capability;
                        this.bound = true;
                    });
                }
            }
        }

        this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 7, 8) {
        }));
        this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 25, 8) {
        }));
        this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 43, 8) {
        }));
        this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 61, 8) {
        }));
        this.customSlots.put(4, this.addSlot(new SlotItemHandler(this.internal, 4, 79, 8) {
        }));
        this.customSlots.put(5, this.addSlot(new SlotItemHandler(this.internal, 5, 97, 8) {
        }));
        this.customSlots.put(6, this.addSlot(new SlotItemHandler(this.internal, 6, 115, 8) {
        }));
        this.customSlots.put(7, this.addSlot(new SlotItemHandler(this.internal, 7, 133, 8) {
        }));
        this.customSlots.put(8, this.addSlot(new SlotItemHandler(this.internal, 8, 151, 8) {
        }));
        this.customSlots.put(9, this.addSlot(new SlotItemHandler(this.internal, 9, 7, 26) {
        }));
        this.customSlots.put(10, this.addSlot(new SlotItemHandler(this.internal, 10, 25, 26) {
        }));
        this.customSlots.put(11, this.addSlot(new SlotItemHandler(this.internal, 11, 43, 26) {
        }));
        this.customSlots.put(12, this.addSlot(new SlotItemHandler(this.internal, 12, 61, 26) {
        }));
        this.customSlots.put(13, this.addSlot(new SlotItemHandler(this.internal, 13, 79, 26) {
        }));
        this.customSlots.put(14, this.addSlot(new SlotItemHandler(this.internal, 14, 97, 26) {
        }));
        this.customSlots.put(15, this.addSlot(new SlotItemHandler(this.internal, 15, 115, 26) {
        }));
        this.customSlots.put(16, this.addSlot(new SlotItemHandler(this.internal, 16, 133, 26) {
        }));
        this.customSlots.put(17, this.addSlot(new SlotItemHandler(this.internal, 17, 151, 26) {
        }));
        this.customSlots.put(18, this.addSlot(new SlotItemHandler(this.internal, 18, 7, 44) {
        }));
        this.customSlots.put(19, this.addSlot(new SlotItemHandler(this.internal, 19, 25, 44) {
        }));
        this.customSlots.put(20, this.addSlot(new SlotItemHandler(this.internal, 20, 43, 44) {
        }));
        this.customSlots.put(21, this.addSlot(new SlotItemHandler(this.internal, 21, 61, 44) {
        }));
        this.customSlots.put(22, this.addSlot(new SlotItemHandler(this.internal, 22, 79, 44) {
        }));
        this.customSlots.put(23, this.addSlot(new SlotItemHandler(this.internal, 23, 97, 44) {
        }));
        this.customSlots.put(24, this.addSlot(new SlotItemHandler(this.internal, 24, 115, 44) {
        }));
        this.customSlots.put(25, this.addSlot(new SlotItemHandler(this.internal, 25, 133, 44) {
        }));
        this.customSlots.put(26, this.addSlot(new SlotItemHandler(this.internal, 26, 151, 44) {
        }));
        this.customSlots.put(27, this.addSlot(new SlotItemHandler(this.internal, 27, 7, 62) {
        }));
        this.customSlots.put(28, this.addSlot(new SlotItemHandler(this.internal, 28, 25, 62) {
        }));
        this.customSlots.put(29, this.addSlot(new SlotItemHandler(this.internal, 29, 43, 62) {
        }));
        this.customSlots.put(30, this.addSlot(new SlotItemHandler(this.internal, 30, 61, 62) {
        }));
        this.customSlots.put(31, this.addSlot(new SlotItemHandler(this.internal, 31, 79, 62) {
        }));
        this.customSlots.put(32, this.addSlot(new SlotItemHandler(this.internal, 32, 97, 62) {
        }));
        this.customSlots.put(33, this.addSlot(new SlotItemHandler(this.internal, 33, 115, 62) {
        }));
        this.customSlots.put(34, this.addSlot(new SlotItemHandler(this.internal, 34, 133, 62) {
        }));
        this.customSlots.put(35, this.addSlot(new SlotItemHandler(this.internal, 35, 151, 62) {
        }));

        for(si = 0; si < 3; ++si) {
            for(int sj = 0; sj < 9; ++sj) {
                this.addSlot(new Slot(inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18));
            }
        }

        for(si = 0; si < 9; ++si) {
            this.addSlot(new Slot(inv, si, 8 + si * 18, 142));
        }

    }

    public boolean stillValid(Player player) {
        return true;
    }

    public ItemStack quickMoveStack(Player playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = (Slot)this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < 36) {
                if (!this.moveItemStackTo(itemstack1, 36, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(itemstack1, itemstack);
            } else if (!this.moveItemStackTo(itemstack1, 0, 36, false)) {
                if (index < 63) {
                    if (!this.moveItemStackTo(itemstack1, 63, this.slots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!this.moveItemStackTo(itemstack1, 36, 63, false)) {
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

    protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
        boolean flag = false;
        int i = p_38905_;
        if (p_38907_) {
            i = p_38906_ - 1;
        }

        Slot slot1;
        ItemStack itemstack;
        if (p_38904_.isStackable()) {
            while(!p_38904_.isEmpty()) {
                if (p_38907_) {
                    if (i < p_38905_) {
                        break;
                    }
                } else if (i >= p_38906_) {
                    break;
                }

                slot1 = (Slot)this.slots.get(i);
                itemstack = slot1.getItem();
                if (slot1.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
                    int j = itemstack.getCount() + p_38904_.getCount();
                    int maxSize = Math.min(slot1.getMaxStackSize(), p_38904_.getMaxStackSize());
                    if (j <= maxSize) {
                        p_38904_.setCount(0);
                        itemstack.setCount(j);
                        slot1.set(itemstack);
                        flag = true;
                    } else if (itemstack.getCount() < maxSize) {
                        p_38904_.shrink(maxSize - itemstack.getCount());
                        itemstack.setCount(maxSize);
                        slot1.set(itemstack);
                        flag = true;
                    }
                }

                if (p_38907_) {
                    --i;
                } else {
                    ++i;
                }
            }
        }

        if (!p_38904_.isEmpty()) {
            if (p_38907_) {
                i = p_38906_ - 1;
            } else {
                i = p_38905_;
            }

            while(true) {
                if (p_38907_) {
                    if (i < p_38905_) {
                        break;
                    }
                } else if (i >= p_38906_) {
                    break;
                }

                slot1 = (Slot)this.slots.get(i);
                itemstack = slot1.getItem();
                if (itemstack.isEmpty() && slot1.mayPlace(p_38904_)) {
                    if (p_38904_.getCount() > slot1.getMaxStackSize()) {
                        slot1.set(p_38904_.split(slot1.getMaxStackSize()));
                    } else {
                        slot1.set(p_38904_.split(p_38904_.getCount()));
                    }

                    slot1.setChanged();
                    flag = true;
                    break;
                }

                if (p_38907_) {
                    --i;
                } else {
                    ++i;
                }
            }
        }

        return flag;
    }

    public void removed(Player playerIn) {
        super.removed(playerIn);
        if (!this.bound && playerIn instanceof ServerPlayer serverPlayer) {
            int j;
            if (serverPlayer.isAlive() && !serverPlayer.hasDisconnected()) {
                for(j = 0; j < this.internal.getSlots(); ++j) {
                    playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false));
                }
            } else {
                for(j = 0; j < this.internal.getSlots(); ++j) {
                    playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
                }
            }
        }

    }

    public Map<Integer, Slot> get() {
        return this.customSlots;
    }
}
