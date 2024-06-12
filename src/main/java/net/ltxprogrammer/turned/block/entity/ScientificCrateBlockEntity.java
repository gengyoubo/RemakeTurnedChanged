package net.ltxprogrammer.turned.block.entity;

import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.ltxprogrammer.turned.init.LatexModBlockEntities;
import net.ltxprogrammer.turned.world.inventory.CrateguiMenu;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/block/entity/ScientificCrateBlockEntity.class */
public class ScientificCrateBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
    private NonNullList<ItemStack> stacks = NonNullList.withSize(5, ItemStack.EMPTY);
    private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

    public ScientificCrateBlockEntity(BlockPos position, BlockState state) {
        super((BlockEntityType) LatexModBlockEntities.SCIENTIFIC_CRATE.get(), position, state);
    }

    public void load(CompoundTag compound) {
        load(compound);
        if (!tryLoadLootTable(compound)) {
            this.stacks = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY);
        }
        ContainerHelper.loadAllItems(compound, this.stacks);
    }

    public void saveAdditional(CompoundTag compound) {
        saveAdditional(compound);
        if (!trySaveLootTable(compound)) {
            ContainerHelper.saveAllItems(compound, this.stacks);
        }
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public CompoundTag getUpdateTag() {
        return saveWithFullMetadata();
    }

    public int getContainerSize() {
        return this.stacks.size();
    }

    public boolean isEmpty() {
        Iterator it = this.stacks.iterator();
        while (it.hasNext()) {
            if (!((ItemStack) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public Component getDefaultName() {
        return new TextComponent("scientific_crate");
    }

    public int getMaxStackSize() {
        return 64;
    }

    public AbstractContainerMenu createMenu(int id, Inventory inventory) {
        return new CrateguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.worldPosition));
    }

    public Component getDisplayName() {
        return new TextComponent("Scientific Crate");
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
        return IntStream.range(0, getContainerSize()).toArray();
    }

    public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
        return canPlaceItem(index, stack);
    }

    public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
        return (index == 0 || index == 1 || index == 2 || index == 3 || index == 4) ? false : true;
    }

    public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
        if (this.remove || facing == null || capability != CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            return getCapability(capability, facing);
        }
        return this.handlers[facing.ordinal()].cast();
    }

    public void setRemoved() {
        setRemoved();
        for (LazyOptional<? extends IItemHandler> handler : this.handlers) {
            handler.invalidate();
        }
    }
}
