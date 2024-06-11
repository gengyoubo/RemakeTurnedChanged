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
/*     */ public class SupplyCrateGuiMenu
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
/*     */   public SupplyCrateGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  37 */     super(LatexModMenus.SUPPLY_CRATE_GUI, id);
/*  38 */     this.entity = inv.player;
/*  39 */     this.world = inv.player.level;
/*  40 */     this.internal = (IItemHandler)new ItemStackHandler(36);
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
/*  78 */     this.customSlots.put(Integer.valueOf(0), addSlot((Slot)new SlotItemHandler(this.internal, 0, 7, 8) {  }
/*     */         ));
/*  80 */     this.customSlots.put(Integer.valueOf(1), addSlot((Slot)new SlotItemHandler(this.internal, 1, 25, 8) {  }
/*     */         ));
/*  82 */     this.customSlots.put(Integer.valueOf(2), addSlot((Slot)new SlotItemHandler(this.internal, 2, 43, 8) {  }
/*     */         ));
/*  84 */     this.customSlots.put(Integer.valueOf(3), addSlot((Slot)new SlotItemHandler(this.internal, 3, 61, 8) {  }
/*     */         ));
/*  86 */     this.customSlots.put(Integer.valueOf(4), addSlot((Slot)new SlotItemHandler(this.internal, 4, 79, 8) {  }
/*     */         ));
/*  88 */     this.customSlots.put(Integer.valueOf(5), addSlot((Slot)new SlotItemHandler(this.internal, 5, 97, 8) {  }
/*     */         ));
/*  90 */     this.customSlots.put(Integer.valueOf(6), addSlot((Slot)new SlotItemHandler(this.internal, 6, 115, 8) {  }
/*     */         ));
/*  92 */     this.customSlots.put(Integer.valueOf(7), addSlot((Slot)new SlotItemHandler(this.internal, 7, 133, 8) {  }
/*     */         ));
/*  94 */     this.customSlots.put(Integer.valueOf(8), addSlot((Slot)new SlotItemHandler(this.internal, 8, 151, 8) {  }
/*     */         ));
/*  96 */     this.customSlots.put(Integer.valueOf(9), addSlot((Slot)new SlotItemHandler(this.internal, 9, 7, 26) {  }
/*     */         ));
/*  98 */     this.customSlots.put(Integer.valueOf(10), addSlot((Slot)new SlotItemHandler(this.internal, 10, 25, 26) {  }
/*     */         ));
/* 100 */     this.customSlots.put(Integer.valueOf(11), addSlot((Slot)new SlotItemHandler(this.internal, 11, 43, 26) {  }
/*     */         ));
/* 102 */     this.customSlots.put(Integer.valueOf(12), addSlot((Slot)new SlotItemHandler(this.internal, 12, 61, 26) {  }
/*     */         ));
/* 104 */     this.customSlots.put(Integer.valueOf(13), addSlot((Slot)new SlotItemHandler(this.internal, 13, 79, 26) {  }
/*     */         ));
/* 106 */     this.customSlots.put(Integer.valueOf(14), addSlot((Slot)new SlotItemHandler(this.internal, 14, 97, 26) {  }
/*     */         ));
/* 108 */     this.customSlots.put(Integer.valueOf(15), addSlot((Slot)new SlotItemHandler(this.internal, 15, 115, 26) {  }
/*     */         ));
/* 110 */     this.customSlots.put(Integer.valueOf(16), addSlot((Slot)new SlotItemHandler(this.internal, 16, 133, 26) {  }
/*     */         ));
/* 112 */     this.customSlots.put(Integer.valueOf(17), addSlot((Slot)new SlotItemHandler(this.internal, 17, 151, 26) {  }
/*     */         ));
/* 114 */     this.customSlots.put(Integer.valueOf(18), addSlot((Slot)new SlotItemHandler(this.internal, 18, 7, 44) {  }
/*     */         ));
/* 116 */     this.customSlots.put(Integer.valueOf(19), addSlot((Slot)new SlotItemHandler(this.internal, 19, 25, 44) {  }
/*     */         ));
/* 118 */     this.customSlots.put(Integer.valueOf(20), addSlot((Slot)new SlotItemHandler(this.internal, 20, 43, 44) {  }
/*     */         ));
/* 120 */     this.customSlots.put(Integer.valueOf(21), addSlot((Slot)new SlotItemHandler(this.internal, 21, 61, 44) {  }
/*     */         ));
/* 122 */     this.customSlots.put(Integer.valueOf(22), addSlot((Slot)new SlotItemHandler(this.internal, 22, 79, 44) {  }
/*     */         ));
/* 124 */     this.customSlots.put(Integer.valueOf(23), addSlot((Slot)new SlotItemHandler(this.internal, 23, 97, 44) {  }
/*     */         ));
/* 126 */     this.customSlots.put(Integer.valueOf(24), addSlot((Slot)new SlotItemHandler(this.internal, 24, 115, 44) {  }
/*     */         ));
/* 128 */     this.customSlots.put(Integer.valueOf(25), addSlot((Slot)new SlotItemHandler(this.internal, 25, 133, 44) {  }
/*     */         ));
/* 130 */     this.customSlots.put(Integer.valueOf(26), addSlot((Slot)new SlotItemHandler(this.internal, 26, 151, 44) {  }
/*     */         ));
/* 132 */     this.customSlots.put(Integer.valueOf(27), addSlot((Slot)new SlotItemHandler(this.internal, 27, 7, 62) {  }
/*     */         ));
/* 134 */     this.customSlots.put(Integer.valueOf(28), addSlot((Slot)new SlotItemHandler(this.internal, 28, 25, 62) {  }
/*     */         ));
/* 136 */     this.customSlots.put(Integer.valueOf(29), addSlot((Slot)new SlotItemHandler(this.internal, 29, 43, 62) {  }
/*     */         ));
/* 138 */     this.customSlots.put(Integer.valueOf(30), addSlot((Slot)new SlotItemHandler(this.internal, 30, 61, 62) {  }
/*     */         ));
/* 140 */     this.customSlots.put(Integer.valueOf(31), addSlot((Slot)new SlotItemHandler(this.internal, 31, 79, 62) {  }
/*     */         ));
/* 142 */     this.customSlots.put(Integer.valueOf(32), addSlot((Slot)new SlotItemHandler(this.internal, 32, 97, 62) {  }
/*     */         ));
/* 144 */     this.customSlots.put(Integer.valueOf(33), addSlot((Slot)new SlotItemHandler(this.internal, 33, 115, 62) {  }
/*     */         ));
/* 146 */     this.customSlots.put(Integer.valueOf(34), addSlot((Slot)new SlotItemHandler(this.internal, 34, 133, 62) {  }
/*     */         ));
/* 148 */     this.customSlots.put(Integer.valueOf(35), addSlot((Slot)new SlotItemHandler(this.internal, 35, 151, 62) {  }));
/*     */     int si;
/* 150 */     for (si = 0; si < 3; si++) {
/* 151 */       for (int sj = 0; sj < 9; sj++)
/* 152 */         addSlot(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/* 153 */     }  for (si = 0; si < 9; si++) {
/* 154 */       addSlot(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean stillValid(Player player) {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 164 */     ItemStack itemstack = ItemStack.EMPTY;
/* 165 */     Slot slot = (Slot)this.slots.get(index);
/* 166 */     if (slot != null && slot.hasItem()) {
/* 167 */       ItemStack itemstack1 = slot.getItem();
/* 168 */       itemstack = itemstack1.copy();
/* 169 */       if (index < 36) {
/* 170 */         if (!moveItemStackTo(itemstack1, 36, this.slots.size(), true)) {
/* 171 */           return ItemStack.EMPTY;
/*     */         }
/* 173 */         slot.onQuickCraft(itemstack1, itemstack);
/* 174 */       } else if (!moveItemStackTo(itemstack1, 0, 36, false)) {
/* 175 */         if (index < 63) {
/* 176 */           if (!moveItemStackTo(itemstack1, 63, this.slots.size(), true)) {
/* 177 */             return ItemStack.EMPTY;
/*     */           }
/*     */         }
/* 180 */         else if (!moveItemStackTo(itemstack1, 36, 63, false)) {
/* 181 */           return ItemStack.EMPTY;
/*     */         } 
/*     */         
/* 184 */         return ItemStack.EMPTY;
/*     */       } 
/* 186 */       if (itemstack1.getCount() == 0) {
/* 187 */         slot.set(ItemStack.EMPTY);
/*     */       } else {
/* 189 */         slot.setChanged();
/*     */       } 
/* 191 */       if (itemstack1.getCount() == itemstack.getCount()) {
/* 192 */         return ItemStack.EMPTY;
/*     */       }
/* 194 */       slot.onTake(playerIn, itemstack1);
/*     */     } 
/* 196 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 201 */     boolean flag = false;
/* 202 */     int i = p_38905_;
/* 203 */     if (p_38907_) {
/* 204 */       i = p_38906_ - 1;
/*     */     }
/* 206 */     if (p_38904_.isStackable()) {
/* 207 */       while (!p_38904_.isEmpty() && (
/* 208 */         p_38907_ ? (
/* 209 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 212 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 215 */         Slot slot = (Slot)this.slots.get(i);
/* 216 */         ItemStack itemstack = slot.getItem();
/* 217 */         if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
/* 218 */           int j = itemstack.getCount() + p_38904_.getCount();
/* 219 */           int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
/* 220 */           if (j <= maxSize) {
/* 221 */             p_38904_.setCount(0);
/* 222 */             itemstack.setCount(j);
/* 223 */             slot.set(itemstack);
/* 224 */             flag = true;
/* 225 */           } else if (itemstack.getCount() < maxSize) {
/* 226 */             p_38904_.shrink(maxSize - itemstack.getCount());
/* 227 */             itemstack.setCount(maxSize);
/* 228 */             slot.set(itemstack);
/* 229 */             flag = true;
/*     */           } 
/*     */         } 
/* 232 */         if (p_38907_) {
/* 233 */           i--; continue;
/*     */         } 
/* 235 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 239 */     if (!p_38904_.isEmpty()) {
/* 240 */       if (p_38907_) {
/* 241 */         i = p_38906_ - 1;
/*     */       } else {
/* 243 */         i = p_38905_;
/*     */       } 
/*     */       
/* 246 */       while (p_38907_ ? (
/* 247 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 250 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 253 */         Slot slot1 = (Slot)this.slots.get(i);
/* 254 */         ItemStack itemstack1 = slot1.getItem();
/* 255 */         if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
/* 256 */           if (p_38904_.getCount() > slot1.getMaxStackSize()) {
/* 257 */             slot1.set(p_38904_.split(slot1.getMaxStackSize()));
/*     */           } else {
/* 259 */             slot1.set(p_38904_.split(p_38904_.getCount()));
/*     */           } 
/* 261 */           slot1.setChanged();
/* 262 */           flag = true;
/*     */           break;
/*     */         } 
/* 265 */         if (p_38907_) {
/* 266 */           i--; continue;
/*     */         } 
/* 268 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 272 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void removed(Player playerIn) {
/* 277 */     super.removed(playerIn);
/* 278 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 279 */       if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
/* 280 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 281 */           playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
/*     */         }
/*     */       } else {
/* 284 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 285 */           playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 292 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\inventory\SupplyCrateGuiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */