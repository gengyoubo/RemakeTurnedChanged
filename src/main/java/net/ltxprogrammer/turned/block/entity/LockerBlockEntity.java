//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.block.entity;

import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.ltxprogrammer.turned.init.LatexModBlockEntities;
import net.ltxprogrammer.turned.world.inventory.LockerGUIMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

public class LockerBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
    private NonNullList<ItemStack> stacks;
    private final LazyOptional<? extends IItemHandler>[] handlers;

    public LockerBlockEntity(BlockPos position, BlockState state) {
        super((BlockEntityType)LatexModBlockEntities.LOCKER.get(), position, state);
        this.stacks = NonNullList.withSize(12, ItemStack.EMPTY);
        this.handlers = SidedInvWrapper.create(this, Direction.values());
    }

    public void load(CompoundTag compound) {
        super.load(compound);
        if (!this.tryLoadLootTable(compound)) {
            this.stacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        }

        ContainerHelper.loadAllItems(compound, this.stacks);
    }

    public void saveAdditional(CompoundTag compound) {
        super.saveAdditional(compound);
        if (!this.trySaveLootTable(compound)) {
            ContainerHelper.saveAllItems(compound, this.stacks);
        }

    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public CompoundTag getUpdateTag() {
        return this.saveWithFullMetadata();
    }

    public int getContainerSize() {
        return this.stacks.size();
    }

    public boolean isEmpty() {
        Iterator var1 = this.stacks.iterator();

        ItemStack itemstack;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            itemstack = (ItemStack)var1.next();
        } while(itemstack.isEmpty());

        return false;
    }

    public Component getDefaultName() {
        return new TextComponent("locker");
    }

    public int getMaxStackSize() {
        return 64;
    }

    public AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return new LockerGUIMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(this.worldPosition));
    }

    public Component getDisplayName() {
        return new TextComponent("Locker");
    }

    protected NonNullList<ItemStack> getItems() {
        return this.stacks;
    }

    protected void setItems(NonNullList<ItemStack> stacks) {
        this.stacks = stacks;
    }

    public boolean canPlaceItem(int index, ItemStack stack) {
        return true;
    }

    public int[] getSlotsForFace(Direction side) {
        return IntStream.range(0, this.getContainerSize()).toArray();
    }

    public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
        return this.canPlaceItem(index, stack);
    }

    public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
        if (index == 0) {
            return false;
        } else if (index == 1) {
            return false;
        } else if (index == 2) {
            return false;
        } else if (index == 3) {
            return false;
        } else if (index == 4) {
            return false;
        } else if (index == 5) {
            return false;
        } else if (index == 6) {
            return false;
        } else if (index == 7) {
            return false;
        } else if (index == 8) {
            return false;
        } else if (index == 9) {
            return false;
        } else if (index == 10) {
            return false;
        } else {
            return index != 11;
        }
    }

    public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
        return !this.remove && facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY ? this.handlers[facing.ordinal()].cast() : super.getCapability(capability, facing);
    }

    public void setRemoved() {
        super.setRemoved();
        LazyOptional[] var1 = this.handlers;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            LazyOptional<? extends IItemHandler> handler = var1[var3];
            handler.invalidate();
        }

    }
}
