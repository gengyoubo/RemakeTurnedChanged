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
/*     */ public class SmallboxguiMenu
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
/*     */   public SmallboxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  37 */     super(LatexModMenus.SMALLBOXGUI, id);
/*  38 */     this.entity = inv.player;
/*  39 */     this.world = inv.player.level;
/*  40 */     this.internal = (IItemHandler)new ItemStackHandler(4);
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
/*  78 */     this.customSlots.put(Integer.valueOf(0), addSlot((Slot)new SlotItemHandler(this.internal, 0, 70, 20) {  }
/*     */         ));
/*  80 */     this.customSlots.put(Integer.valueOf(1), addSlot((Slot)new SlotItemHandler(this.internal, 1, 88, 20) {  }
/*     */         ));
/*  82 */     this.customSlots.put(Integer.valueOf(2), addSlot((Slot)new SlotItemHandler(this.internal, 2, 70, 38) {  }
/*     */         ));
/*  84 */     this.customSlots.put(Integer.valueOf(3), addSlot((Slot)new SlotItemHandler(this.internal, 3, 88, 38) {  }));
/*     */     int si;
/*  86 */     for (si = 0; si < 3; si++) {
/*  87 */       for (int sj = 0; sj < 9; sj++)
/*  88 */         addSlot(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/*  89 */     }  for (si = 0; si < 9; si++) {
/*  90 */       addSlot(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean stillValid(Player player) {
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 100 */     ItemStack itemstack = ItemStack.EMPTY;
/* 101 */     Slot slot = (Slot)this.slots.get(index);
/* 102 */     if (slot != null && slot.hasItem()) {
/* 103 */       ItemStack itemstack1 = slot.getItem();
/* 104 */       itemstack = itemstack1.copy();
/* 105 */       if (index < 4) {
/* 106 */         if (!moveItemStackTo(itemstack1, 4, this.slots.size(), true)) {
/* 107 */           return ItemStack.EMPTY;
/*     */         }
/* 109 */         slot.onQuickCraft(itemstack1, itemstack);
/* 110 */       } else if (!moveItemStackTo(itemstack1, 0, 4, false)) {
/* 111 */         if (index < 31) {
/* 112 */           if (!moveItemStackTo(itemstack1, 31, this.slots.size(), true)) {
/* 113 */             return ItemStack.EMPTY;
/*     */           }
/*     */         }
/* 116 */         else if (!moveItemStackTo(itemstack1, 4, 31, false)) {
/* 117 */           return ItemStack.EMPTY;
/*     */         } 
/*     */         
/* 120 */         return ItemStack.EMPTY;
/*     */       } 
/* 122 */       if (itemstack1.getCount() == 0) {
/* 123 */         slot.set(ItemStack.EMPTY);
/*     */       } else {
/* 125 */         slot.setChanged();
/*     */       } 
/* 127 */       if (itemstack1.getCount() == itemstack.getCount()) {
/* 128 */         return ItemStack.EMPTY;
/*     */       }
/* 130 */       slot.onTake(playerIn, itemstack1);
/*     */     } 
/* 132 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 137 */     boolean flag = false;
/* 138 */     int i = p_38905_;
/* 139 */     if (p_38907_) {
/* 140 */       i = p_38906_ - 1;
/*     */     }
/* 142 */     if (p_38904_.isStackable()) {
/* 143 */       while (!p_38904_.isEmpty() && (
/* 144 */         p_38907_ ? (
/* 145 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 148 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 151 */         Slot slot = (Slot)this.slots.get(i);
/* 152 */         ItemStack itemstack = slot.getItem();
/* 153 */         if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
/* 154 */           int j = itemstack.getCount() + p_38904_.getCount();
/* 155 */           int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
/* 156 */           if (j <= maxSize) {
/* 157 */             p_38904_.setCount(0);
/* 158 */             itemstack.setCount(j);
/* 159 */             slot.set(itemstack);
/* 160 */             flag = true;
/* 161 */           } else if (itemstack.getCount() < maxSize) {
/* 162 */             p_38904_.shrink(maxSize - itemstack.getCount());
/* 163 */             itemstack.setCount(maxSize);
/* 164 */             slot.set(itemstack);
/* 165 */             flag = true;
/*     */           } 
/*     */         } 
/* 168 */         if (p_38907_) {
/* 169 */           i--; continue;
/*     */         } 
/* 171 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 175 */     if (!p_38904_.isEmpty()) {
/* 176 */       if (p_38907_) {
/* 177 */         i = p_38906_ - 1;
/*     */       } else {
/* 179 */         i = p_38905_;
/*     */       } 
/*     */       
/* 182 */       while (p_38907_ ? (
/* 183 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 186 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 189 */         Slot slot1 = (Slot)this.slots.get(i);
/* 190 */         ItemStack itemstack1 = slot1.getItem();
/* 191 */         if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
/* 192 */           if (p_38904_.getCount() > slot1.getMaxStackSize()) {
/* 193 */             slot1.set(p_38904_.split(slot1.getMaxStackSize()));
/*     */           } else {
/* 195 */             slot1.set(p_38904_.split(p_38904_.getCount()));
/*     */           } 
/* 197 */           slot1.setChanged();
/* 198 */           flag = true;
/*     */           break;
/*     */         } 
/* 201 */         if (p_38907_) {
/* 202 */           i--; continue;
/*     */         } 
/* 204 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void removed(Player playerIn) {
/* 213 */     super.removed(playerIn);
/* 214 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 215 */       if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
/* 216 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 217 */           playerIn.drop(this.internal.extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
/*     */         }
/*     */       } else {
/* 220 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 221 */           playerIn.getInventory().placeItemBackInInventory(this.internal.extractItem(i, this.internal.getStackInSlot(i).getCount(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 228 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\inventory\SmallboxguiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */