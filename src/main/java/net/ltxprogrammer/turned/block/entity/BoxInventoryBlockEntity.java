package net.ltxprogrammer.turned.block.entity;

import io.netty.buffer.Unpooled;
import java.util.Iterator;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import net.ltxprogrammer.turned.init.LatexModBlockEntities;
import net.ltxprogrammer.turned.world.inventory.BoxguiMenu;
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
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/block/entity/BoxInventoryBlockEntity.class */
public class BoxInventoryBlockEntity extends RandomizableContainerBlockEntity implements WorldlyContainer {
    private NonNullList<ItemStack> stacks = NonNullList.withSize(12, ItemStack.EMPTY);
    private final LazyOptional<? extends IItemHandler>[] handlers = SidedInvWrapper.create(this, Direction.values());

    public BoxInventoryBlockEntity(BlockPos position, BlockState state) {
        super(LatexModBlockEntities.BOX_INVENTORY.get(), position, state);
    }

    public void load(@NotNull CompoundTag compound) {
        load(compound);
        if (!tryLoadLootTable(compound)) {
            this.stacks = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY);
        }
        ContainerHelper.loadAllItems(compound, this.stacks);
    }

    public void saveAdditional(@NotNull CompoundTag compound) {
        saveAdditional(compound);
        if (!trySaveLootTable(compound)) {
            ContainerHelper.saveAllItems(compound, this.stacks);
        }
    }

    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public @NotNull CompoundTag getUpdateTag() {
        return saveWithFullMetadata();
    }

    public int getContainerSize() {
        return this.stacks.size();
    }

    public boolean isEmpty() {
        for (ItemStack stack : this.stacks) {
            if (!stack.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public @NotNull Component getDefaultName() {
        return new TextComponent("box_inventory");
    }

    public @NotNull AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory) {
        return new BoxguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.worldPosition));
    }

    public @NotNull Component getDisplayName() {
        return new TextComponent("Box");
    }

    protected @NotNull NonNullList<ItemStack> getItems() {
        return this.stacks;
    }

    protected void setItems(@NotNull NonNullList<ItemStack> stacks) {
        this.stacks = stacks;
    }

    public int @NotNull [] getSlotsForFace(@NotNull Direction side) {
        return IntStream.range(0, getContainerSize()).toArray();
    }

    public boolean canPlaceItemThroughFace(int index, @NotNull ItemStack stack, @Nullable Direction direction) {
        return canPlaceItem(index, stack);
    }

    public boolean canTakeItemThroughFace(int index, @NotNull ItemStack stack, @NotNull Direction direction) {
        return index != 0 && index != 1 && index != 2 && index != 3 && index != 4 && index != 5 && index != 6 && index != 7 && index != 8 && index != 9 && index != 10 && index != 11;
    }

    public <T> @NotNull LazyOptional<T> getCapability(@NotNull Capability<T> capability, @Nullable Direction facing) {
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
