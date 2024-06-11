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
/*     */ public class CrateguiMenu
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
/*     */   public CrateguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  37 */     super(LatexModMenus.CRATEGUI, id);
/*  38 */     this.entity = inv.player;
/*  39 */     this.world = inv.player.level;
/*  40 */     this.internal = (IItemHandler)new ItemStackHandler(5);
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
/*  78 */     this.customSlots.put(Integer.valueOf(0), addSlot((Slot)new SlotItemHandler(this.internal, 0, 43, 35) {  }
/*     */         ));
/*  80 */     this.customSlots.put(Integer.valueOf(1), addSlot((Slot)new SlotItemHandler(this.internal, 1, 61, 35) {  }
/*     */         ));
/*  82 */     this.customSlots.put(Integer.valueOf(2), addSlot((Slot)new SlotItemHandler(this.internal, 2, 79, 35) {  }
/*     */         ));
/*  84 */     this.customSlots.put(Integer.valueOf(3), addSlot((Slot)new SlotItemHandler(this.internal, 3, 97, 35) {  }
/*     */         ));
/*  86 */     this.customSlots.put(Integer.valueOf(4), addSlot((Slot)new SlotItemHandler(this.internal, 4, 115, 35) {  }));
/*     */     int si;
/*  88 */     for (si = 0; si < 3; si++) {
/*  89 */       for (int sj = 0; sj < 9; sj++)
/*  90 */         addSlot(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/*  91 */     }  for (si = 0; si < 9; si++) {
/*  92 */       addSlot(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean stillValid(Player player) {
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 102 */     ItemStack itemstack = ItemStack.EMPTY;
/* 103 */     Slot slot = (Slot)this.slots.get(index);
/* 104 */     if (slot != null && slot.hasItem()) {
/* 105 */       ItemStack itemstack1 = slot.getItem();
/* 106 */       itemstack = itemstack1.copy();
/* 107 */       if (index < 5) {
/* 108 */         if (!moveItemStackTo(itemstack1, 5, this.slots.size(), true)) {
/* 109 */           return ItemStack.EMPTY;
/*     */         }
/* 111 */         slot.onQuickCraft(itemstack1, itemstack);
/* 112 */       } else if (!moveItemStackTo(itemstack1, 0, 5, false)) {
/* 113 */         if (index < 32) {
/* 114 */           if (!moveItemStackTo(itemstack1, 32, this.slots.size(), true)) {
/* 115 */             return ItemStack.EMPTY;
/*     */           }
/*     */         }
/* 118 */         else if (!moveItemStackTo(itemstack1, 5, 32, false)) {
/* 119 */           return ItemStack.EMPTY;
/*     */         } 
/*     */         
/* 122 */         return ItemStack.EMPTY;
/*     */       } 
/* 124 */       if (itemstack1.getCount() == 0) {
/* 125 */         slot.set(ItemStack.EMPTY);
/*     */       } else {
/* 127 */         slot.setChanged();
/*     */       } 
/* 129 */       if (itemstack1.getCount() == itemstack.getCount()) {
/* 130 */         return ItemStack.EMPTY;
/*     */       }
/* 132 */       slot.onTake(playerIn, itemstack1);
/*     */     } 
/* 134 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 139 */     boolean flag = false;
/* 140 */     int i = p_38905_;
/* 141 */     if (p_38907_) {
/* 142 */       i = p_38906_ - 1;
/*     */     }
/* 144 */     if (p_38904_.isStackable()) {
/* 145 */       while (!p_38904_.isEmpty() && (
/* 146 */         p_38907_ ? (
/* 147 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 150 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 153 */         Slot slot = (Slot)this.slots.get(i);
/* 154 */         ItemStack itemstack = slot.getItem();
/* 155 */         if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
/* 156 */           int j = itemstack.getCount() + p_38904_.getCount();
/* 157 */           int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
/* 158 */           if (j <= maxSize) {
/* 159 */             p_38904_.setCount(0);
/* 160 */             itemstack.setCount(j);
/* 161 */             slot.set(itemstack);
/* 162 */             flag = true;
/* 163 */           } else if (itemstack.getCount() < maxSize) {
/* 164 */             p_38904_.shrink(maxSize - itemstack.getCount());
/* 165 */             itemstack.setCount(maxSize);
/* 166 */             slot.set(itemstack);
/* 167 */             flag = true;
/*     */           } 
/*     */         } 
/* 170 */         if (p_38907_) {
/* 171 */           i--; continue;
/*     */         } 
/* 173 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 177 */     if (!p_38904_.isEmpty()) {
/* 178 */       if (p_38907_) {
/* 179 */         i = p_38906_ - 1;
/*     */       } else {
/* 181 */         i = p_38905_;
/*     */       } 
/*     */       
/* 184 */       while (p_38907_ ? (
/* 185 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 188 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 191 */         Slot slot1 = (Slot)this.slots.get(i);
/* 192 */         ItemStack itemstack1 = slot1.getItem();
/* 193 */         if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
/* 194 */           if (p_38904_.getCount() > slot1.getMaxStackSize()) {
/* 195 */             slot1.set(p_38904_.split(slot1.getMaxStackSize()));
/*     */           } else {
/* 197 */             slot1.set(p_38904_.split(p_38904_.getCount()));
/*     */           } 
/* 199 */           slot1.setChanged();
/* 200 */           flag = true;
/*     */           break;
/*     */         } 
/* 203 */         if (p_38907_) {
/* 204 */           i--; continue;
/*     */         } 
/* 206 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 210 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void removed(Player playerIn) {
/* 215 */     super.removed(playerIn);
/* 216 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 217 */       if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
/* 218 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 219 */           playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
/*     */         }
/*     */       } else {
/* 222 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 223 */           playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 230 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\inventory\CrateguiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */