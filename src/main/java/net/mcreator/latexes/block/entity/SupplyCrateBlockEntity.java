/*     */ package net.mcreator.latexes.block.entity;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModBlockEntities;
/*     */ import net.mcreator.latexes.world.inventory.SupplyCrateGuiMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*     */ import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.capabilities.Capability;
/*     */ import net.minecraftforge.common.util.LazyOptional;
/*     */ import net.minecraftforge.items.CapabilityItemHandler;
/*     */ import net.minecraftforge.items.IItemHandler;
/*     */ import net.minecraftforge.items.wrapper.SidedInvWrapper;
/*     */ 
/*     */ public class SupplyCrateBlockEntity
/*     */   extends RandomizableContainerBlockEntity
/*     */   implements WorldlyContainer {
/*  35 */   private NonNullList<ItemStack> stacks = NonNullList.withSize(36, ItemStack.EMPTY);
/*  36 */   private final LazyOptional<? extends IItemHandler>[] handlers = (LazyOptional<? extends IItemHandler>[])SidedInvWrapper.create(this, Direction.values());
/*     */   
/*     */   public SupplyCrateBlockEntity(BlockPos position, BlockState state) {
/*  39 */     super((BlockEntityType)LatexModBlockEntities.SUPPLY_CRATE.get(), position, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public void load(CompoundTag compound) {
/*  44 */     super.load(compound);
/*  45 */     if (!tryLoadLootTable(compound))
/*  46 */       this.stacks = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY); 
/*  47 */     ContainerHelper.loadAllItems(compound, this.stacks);
/*     */   }
/*     */ 
/*     */   
/*     */   public void saveAdditional(CompoundTag compound) {
/*  52 */     super.saveAdditional(compound);
/*  53 */     if (!trySaveLootTable(compound)) {
/*  54 */       ContainerHelper.saveAllItems(compound, this.stacks);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  60 */     return ClientboundBlockEntityDataPacket.create((BlockEntity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public CompoundTag getUpdateTag() {
/*  65 */     return saveWithFullMetadata();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getContainerSize() {
/*  70 */     return this.stacks.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/*  75 */     for (ItemStack itemstack : this.stacks) {
/*  76 */       if (!itemstack.isEmpty())
/*  77 */         return false; 
/*  78 */     }  return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Component getDefaultName() {
/*  83 */     return (Component)new TextComponent("supply_crate");
/*     */   }
/*     */ 
/*     */   
/*     */   public int getMaxStackSize() {
/*  88 */     return 64;
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractContainerMenu createMenu(int id, Inventory inventory) {
/*  93 */     return (AbstractContainerMenu)new SupplyCrateGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(this.worldPosition));
/*     */   }
/*     */ 
/*     */   
/*     */   public Component getDisplayName() {
/*  98 */     return (Component)new TextComponent("Supply Crate");
/*     */   }
/*     */ 
/*     */   
/*     */   protected NonNullList<ItemStack> getItems() {
/* 103 */     return this.stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setItems(NonNullList<ItemStack> stacks) {
/* 108 */     this.stacks = stacks;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canPlaceItem(int index, ItemStack stack) {
/* 113 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int[] getSlotsForFace(Direction side) {
/* 118 */     return IntStream.range(0, getContainerSize()).toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
/* 123 */     return canPlaceItem(index, stack);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
/* 128 */     if (index == 0)
/* 129 */       return false; 
/* 130 */     if (index == 1)
/* 131 */       return false; 
/* 132 */     if (index == 2)
/* 133 */       return false; 
/* 134 */     if (index == 3)
/* 135 */       return false; 
/* 136 */     if (index == 4)
/* 137 */       return false; 
/* 138 */     if (index == 5)
/* 139 */       return false; 
/* 140 */     if (index == 6)
/* 141 */       return false; 
/* 142 */     if (index == 7)
/* 143 */       return false; 
/* 144 */     if (index == 8)
/* 145 */       return false; 
/* 146 */     if (index == 9)
/* 147 */       return false; 
/* 148 */     if (index == 10)
/* 149 */       return false; 
/* 150 */     if (index == 11)
/* 151 */       return false; 
/* 152 */     if (index == 12)
/* 153 */       return false; 
/* 154 */     if (index == 13)
/* 155 */       return false; 
/* 156 */     if (index == 14)
/* 157 */       return false; 
/* 158 */     if (index == 15)
/* 159 */       return false; 
/* 160 */     if (index == 16)
/* 161 */       return false; 
/* 162 */     if (index == 17)
/* 163 */       return false; 
/* 164 */     if (index == 18)
/* 165 */       return false; 
/* 166 */     if (index == 19)
/* 167 */       return false; 
/* 168 */     if (index == 20)
/* 169 */       return false; 
/* 170 */     if (index == 21)
/* 171 */       return false; 
/* 172 */     if (index == 22)
/* 173 */       return false; 
/* 174 */     if (index == 23)
/* 175 */       return false; 
/* 176 */     if (index == 24)
/* 177 */       return false; 
/* 178 */     if (index == 25)
/* 179 */       return false; 
/* 180 */     if (index == 26)
/* 181 */       return false; 
/* 182 */     if (index == 27)
/* 183 */       return false; 
/* 184 */     if (index == 28)
/* 185 */       return false; 
/* 186 */     if (index == 29)
/* 187 */       return false; 
/* 188 */     if (index == 30)
/* 189 */       return false; 
/* 190 */     if (index == 31)
/* 191 */       return false; 
/* 192 */     if (index == 32)
/* 193 */       return false; 
/* 194 */     if (index == 33)
/* 195 */       return false; 
/* 196 */     if (index == 34)
/* 197 */       return false; 
/* 198 */     if (index == 35)
/* 199 */       return false; 
/* 200 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction facing) {
/* 205 */     if (!this.remove && facing != null && capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)
/* 206 */       return this.handlers[facing.ordinal()].cast(); 
/* 207 */     return super.getCapability(capability, facing);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRemoved() {
/* 212 */     super.setRemoved();
/* 213 */     for (LazyOptional<? extends IItemHandler> handler : this.handlers)
/* 214 */       handler.invalidate(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\entity\SupplyCrateBlockEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */