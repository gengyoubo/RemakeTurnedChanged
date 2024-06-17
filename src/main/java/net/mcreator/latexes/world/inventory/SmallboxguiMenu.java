//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class SmallboxguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
    public static final HashMap<String, Object> guistate = new HashMap();
    public final Level world;
    public final Player entity;
    public int x;
    public int y;
    public int z;
    private IItemHandler internal;
    private final Map<Integer, Slot> customSlots = new HashMap();
    private boolean bound = false;

    public SmallboxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
        super(LatexModMenus.SMALLBOXGUI, id);
        this.entity = inv.player;
        this.world = inv.player.level;
        this.internal = new ItemStackHandler(4);
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

        this.customSlots.put(0, this.addSlot(new SlotItemHandler(this.internal, 0, 70, 20) {
        }));
        this.customSlots.put(1, this.addSlot(new SlotItemHandler(this.internal, 1, 88, 20) {
        }));
        this.customSlots.put(2, this.addSlot(new SlotItemHandler(this.internal, 2, 70, 38) {
        }));
        this.customSlots.put(3, this.addSlot(new SlotItemHandler(this.internal, 3, 88, 38) {
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
            if (index < 4) {
                if (!this.moveItemStackTo(itemstack1, 4, this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(itemstack1, itemstack);
            } else if (!this.moveItemStackTo(itemstack1, 0, 4, false)) {
                if (index < 31) {
                    if (!this.moveItemStackTo(itemstack1, 31, this.slots.size(), true)) {
                        return ItemStack.EMPTY;
                    }
                } else if (!this.moveItemStackTo(itemstack1, 4, 31, false)) {
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
