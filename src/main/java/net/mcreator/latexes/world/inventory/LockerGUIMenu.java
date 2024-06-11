/*     */ package net.mcreator.latexes.world.inventory;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.latexes.init.LatexModMenus;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.inventory.Slot;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraftforge.items.CapabilityItemHandler;
/*     */ import net.minecraftforge.items.IItemHandler;
/*     */ import net.minecraftforge.items.ItemStackHandler;
/*     */ import net.minecraftforge.items.SlotItemHandler;
/*     */ 
/*     */ public class LockerGUIMenu
/*     */   extends AbstractContainerMenu
/*     */   implements Supplier<Map<Integer, Slot>>
/*     */ {
/*  28 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*     */   
/*     */   public final Level world;
/*     */   public final Player entity;
/*     */   public int x;
/*  33 */   private final Map<Integer, Slot> customSlots = new HashMap<>(); public int y; public int z; private IItemHandler internal;
/*     */   private boolean bound = false;
/*     */   
/*     */   public LockerGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  37 */     super(LatexModMenus.LOCKER_GUI, id);
/*  38 */     this.entity = inv.player;
/*  39 */     this.world = inv.player.level;
/*  40 */     this.internal = (IItemHandler)new ItemStackHandler(12);
/*  41 */     BlockPos pos = null;
/*  42 */     if (extraData != null) {
/*  43 */       pos = extraData.readBlockPos();
/*  44 */       this.x = pos.getX();
/*  45 */       this.y = pos.getY();
/*  46 */       this.z = pos.getZ();
/*     */     } 
/*  48 */     if (pos != null) {
/*  49 */       if (extraData.readableBytes() == 1) {
/*  50 */         ItemStack itemstack; byte hand = extraData.readByte();
/*     */         
/*  52 */         if (hand == 0) {
/*  53 */           itemstack = this.entity.getMainHandItem();
/*     */         } else {
/*  55 */           itemstack = this.entity.getOffhandItem();
/*  56 */         }  itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */               this.internal = capability;
/*     */               this.bound = true;
/*     */             });
/*  60 */       } else if (extraData.readableBytes() > 1) {
/*  61 */         extraData.readByte();
/*  62 */         Entity entity = this.world.getEntity(extraData.readVarInt());
/*  63 */         if (entity != null)
/*  64 */           entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               }); 
/*     */       } else {
/*  69 */         BlockEntity ent = (inv.player != null) ? inv.player.level.getBlockEntity(pos) : null;
/*  70 */         if (ent != null) {
/*  71 */           ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               });
/*     */         }
/*     */       } 
/*     */     }
/*  78 */     this.customSlots.put(Integer.valueOf(0), addSlot((Slot)new SlotItemHandler(this.internal, 0, 61, 63) {  }
/*     */         ));
/*  80 */     this.customSlots.put(Integer.valueOf(1), addSlot((Slot)new SlotItemHandler(this.internal, 1, 79, 63) {  }
/*     */         ));
/*  82 */     this.customSlots.put(Integer.valueOf(2), addSlot((Slot)new SlotItemHandler(this.internal, 2, 97, 63) {  }
/*     */         ));
/*  84 */     this.customSlots.put(Integer.valueOf(3), addSlot((Slot)new SlotItemHandler(this.internal, 3, 61, 45) {  }
/*     */         ));
/*  86 */     this.customSlots.put(Integer.valueOf(4), addSlot((Slot)new SlotItemHandler(this.internal, 4, 79, 45) {  }
/*     */         ));
/*  88 */     this.customSlots.put(Integer.valueOf(5), addSlot((Slot)new SlotItemHandler(this.internal, 5, 97, 45) {  }
/*     */         ));
/*  90 */     this.customSlots.put(Integer.valueOf(6), addSlot((Slot)new SlotItemHandler(this.internal, 6, 61, 27) {  }
/*     */         ));
/*  92 */     this.customSlots.put(Integer.valueOf(7), addSlot((Slot)new SlotItemHandler(this.internal, 7, 79, 27) {  }
/*     */         ));
/*  94 */     this.customSlots.put(Integer.valueOf(8), addSlot((Slot)new SlotItemHandler(this.internal, 8, 97, 27) {  }
/*     */         ));
/*  96 */     this.customSlots.put(Integer.valueOf(9), addSlot((Slot)new SlotItemHandler(this.internal, 9, 61, 9) {  }
/*     */         ));
/*  98 */     this.customSlots.put(Integer.valueOf(10), addSlot((Slot)new SlotItemHandler(this.internal, 10, 79, 9) {  }
/*     */         ));
/* 100 */     this.customSlots.put(Integer.valueOf(11), addSlot((Slot)new SlotItemHandler(this.internal, 11, 97, 9) {  }));
/*     */     int si;
/* 102 */     for (si = 0; si < 3; si++) {
/* 103 */       for (int sj = 0; sj < 9; sj++)
/* 104 */         addSlot(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 94 + si * 18)); 
/* 105 */     }  for (si = 0; si < 9; si++) {
/* 106 */       addSlot(new Slot((Container)inv, si, 8 + si * 18, 152));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean stillValid(Player player) {
/* 111 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 116 */     ItemStack itemstack = ItemStack.EMPTY;
/* 117 */     Slot slot = (Slot)this.slots.get(index);
/* 118 */     if (slot != null && slot.hasItem()) {
/* 119 */       ItemStack itemstack1 = slot.getItem();
/* 120 */       itemstack = itemstack1.copy();
/* 121 */       if (index < 12) {
/* 122 */         if (!moveItemStackTo(itemstack1, 12, this.slots.size(), true)) {
/* 123 */           return ItemStack.EMPTY;
/*     */         }
/* 125 */         slot.onQuickCraft(itemstack1, itemstack);
/* 126 */       } else if (!moveItemStackTo(itemstack1, 0, 12, false)) {
/* 127 */         if (index < 39) {
/* 128 */           if (!moveItemStackTo(itemstack1, 39, this.slots.size(), true)) {
/* 129 */             return ItemStack.EMPTY;
/*     */           }
/*     */         }
/* 132 */         else if (!moveItemStackTo(itemstack1, 12, 39, false)) {
/* 133 */           return ItemStack.EMPTY;
/*     */         } 
/*     */         
/* 136 */         return ItemStack.EMPTY;
/*     */       } 
/* 138 */       if (itemstack1.getCount() == 0) {
/* 139 */         slot.set(ItemStack.EMPTY);
/*     */       } else {
/* 141 */         slot.setChanged();
/*     */       } 
/* 143 */       if (itemstack1.getCount() == itemstack.getCount()) {
/* 144 */         return ItemStack.EMPTY;
/*     */       }
/* 146 */       slot.onTake(playerIn, itemstack1);
/*     */     } 
/* 148 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 153 */     boolean flag = false;
/* 154 */     int i = p_38905_;
/* 155 */     if (p_38907_) {
/* 156 */       i = p_38906_ - 1;
/*     */     }
/* 158 */     if (p_38904_.isStackable()) {
/* 159 */       while (!p_38904_.isEmpty() && (
/* 160 */         p_38907_ ? (
/* 161 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 164 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 167 */         Slot slot = (Slot)this.slots.get(i);
/* 168 */         ItemStack itemstack = slot.getItem();
/* 169 */         if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
/* 170 */           int j = itemstack.getCount() + p_38904_.getCount();
/* 171 */           int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
/* 172 */           if (j <= maxSize) {
/* 173 */             p_38904_.setCount(0);
/* 174 */             itemstack.setCount(j);
/* 175 */             slot.set(itemstack);
/* 176 */             flag = true;
/* 177 */           } else if (itemstack.getCount() < maxSize) {
/* 178 */             p_38904_.shrink(maxSize - itemstack.getCount());
/* 179 */             itemstack.setCount(maxSize);
/* 180 */             slot.set(itemstack);
/* 181 */             flag = true;
/*     */           } 
/*     */         } 
/* 184 */         if (p_38907_) {
/* 185 */           i--; continue;
/*     */         } 
/* 187 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 191 */     if (!p_38904_.isEmpty()) {
/* 192 */       if (p_38907_) {
/* 193 */         i = p_38906_ - 1;
/*     */       } else {
/* 195 */         i = p_38905_;
/*     */       } 
/*     */       
/* 198 */       while (p_38907_ ? (
/* 199 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 202 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 205 */         Slot slot1 = (Slot)this.slots.get(i);
/* 206 */         ItemStack itemstack1 = slot1.getItem();
/* 207 */         if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
/* 208 */           if (p_38904_.getCount() > slot1.getMaxStackSize()) {
/* 209 */             slot1.set(p_38904_.split(slot1.getMaxStackSize()));
/*     */           } else {
/* 211 */             slot1.set(p_38904_.split(p_38904_.getCount()));
/*     */           } 
/* 213 */           slot1.setChanged();
/* 214 */           flag = true;
/*     */           break;
/*     */         } 
/* 217 */         if (p_38907_) {
/* 218 */           i--; continue;
/*     */         } 
/* 220 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 224 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void removed(Player playerIn) {
/* 229 */     super.removed(playerIn);
/* 230 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 231 */       if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
/* 232 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 233 */           playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
/*     */         }
/*     */       } else {
/* 236 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 237 */           playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 244 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\inventory\LockerGUIMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */