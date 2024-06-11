/*     */ package net.ltxprogrammer.turned.world.inventory;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import net.ltxprogrammer.turned.init.LatexModMenus;
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
/*     */   implements Supplier<Map<Integer, Slot>> {
/*  27 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*     */   
/*     */   public final Level world;
/*     */   public final Player entity;
/*     */   public int x;
/*  32 */   private final Map<Integer, Slot> customSlots = new HashMap<>(); public int y; public int z; private IItemHandler internal;
/*     */   private boolean bound = false;
/*     */   
/*     */   public SupplyCrateGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  36 */     super(LatexModMenus.SUPPLY_CRATE_GUI, id);
/*  37 */     this.entity = inv.f_35978_;
/*  38 */     this.world = inv.f_35978_.f_19853_;
/*  39 */     this.internal = (IItemHandler)new ItemStackHandler(36);
/*  40 */     BlockPos pos = null;
/*  41 */     if (extraData != null) {
/*  42 */       pos = extraData.m_130135_();
/*  43 */       this.x = pos.m_123341_();
/*  44 */       this.y = pos.m_123342_();
/*  45 */       this.z = pos.m_123343_();
/*     */     } 
/*  47 */     if (pos != null) {
/*  48 */       if (extraData.readableBytes() == 1) {
/*  49 */         ItemStack itemstack; byte hand = extraData.readByte();
/*     */         
/*  51 */         if (hand == 0) {
/*  52 */           itemstack = this.entity.m_21205_();
/*     */         } else {
/*  54 */           itemstack = this.entity.m_21206_();
/*  55 */         }  itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */               this.internal = capability;
/*     */               this.bound = true;
/*     */             });
/*  59 */       } else if (extraData.readableBytes() > 1) {
/*  60 */         extraData.readByte();
/*  61 */         Entity entity = this.world.m_6815_(extraData.m_130242_());
/*  62 */         if (entity != null)
/*  63 */           entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               }); 
/*     */       } else {
/*  68 */         BlockEntity ent = (inv.f_35978_ != null) ? inv.f_35978_.f_19853_.m_7702_(pos) : null;
/*  69 */         if (ent != null) {
/*  70 */           ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
/*     */                 this.internal = capability;
/*     */                 this.bound = true;
/*     */               });
/*     */         }
/*     */       } 
/*     */     }
/*  77 */     this.customSlots.put(Integer.valueOf(0), m_38897_((Slot)new SlotItemHandler(this.internal, 0, 7, 8) {  }
/*     */         ));
/*  79 */     this.customSlots.put(Integer.valueOf(1), m_38897_((Slot)new SlotItemHandler(this.internal, 1, 25, 8) {  }
/*     */         ));
/*  81 */     this.customSlots.put(Integer.valueOf(2), m_38897_((Slot)new SlotItemHandler(this.internal, 2, 43, 8) {  }
/*     */         ));
/*  83 */     this.customSlots.put(Integer.valueOf(3), m_38897_((Slot)new SlotItemHandler(this.internal, 3, 61, 8) {  }
/*     */         ));
/*  85 */     this.customSlots.put(Integer.valueOf(4), m_38897_((Slot)new SlotItemHandler(this.internal, 4, 79, 8) {  }
/*     */         ));
/*  87 */     this.customSlots.put(Integer.valueOf(5), m_38897_((Slot)new SlotItemHandler(this.internal, 5, 97, 8) {  }
/*     */         ));
/*  89 */     this.customSlots.put(Integer.valueOf(6), m_38897_((Slot)new SlotItemHandler(this.internal, 6, 115, 8) {  }
/*     */         ));
/*  91 */     this.customSlots.put(Integer.valueOf(7), m_38897_((Slot)new SlotItemHandler(this.internal, 7, 133, 8) {  }
/*     */         ));
/*  93 */     this.customSlots.put(Integer.valueOf(8), m_38897_((Slot)new SlotItemHandler(this.internal, 8, 151, 8) {  }
/*     */         ));
/*  95 */     this.customSlots.put(Integer.valueOf(9), m_38897_((Slot)new SlotItemHandler(this.internal, 9, 7, 26) {  }
/*     */         ));
/*  97 */     this.customSlots.put(Integer.valueOf(10), m_38897_((Slot)new SlotItemHandler(this.internal, 10, 25, 26) {  }
/*     */         ));
/*  99 */     this.customSlots.put(Integer.valueOf(11), m_38897_((Slot)new SlotItemHandler(this.internal, 11, 43, 26) {  }
/*     */         ));
/* 101 */     this.customSlots.put(Integer.valueOf(12), m_38897_((Slot)new SlotItemHandler(this.internal, 12, 61, 26) {  }
/*     */         ));
/* 103 */     this.customSlots.put(Integer.valueOf(13), m_38897_((Slot)new SlotItemHandler(this.internal, 13, 79, 26) {  }
/*     */         ));
/* 105 */     this.customSlots.put(Integer.valueOf(14), m_38897_((Slot)new SlotItemHandler(this.internal, 14, 97, 26) {  }
/*     */         ));
/* 107 */     this.customSlots.put(Integer.valueOf(15), m_38897_((Slot)new SlotItemHandler(this.internal, 15, 115, 26) {  }
/*     */         ));
/* 109 */     this.customSlots.put(Integer.valueOf(16), m_38897_((Slot)new SlotItemHandler(this.internal, 16, 133, 26) {  }
/*     */         ));
/* 111 */     this.customSlots.put(Integer.valueOf(17), m_38897_((Slot)new SlotItemHandler(this.internal, 17, 151, 26) {  }
/*     */         ));
/* 113 */     this.customSlots.put(Integer.valueOf(18), m_38897_((Slot)new SlotItemHandler(this.internal, 18, 7, 44) {  }
/*     */         ));
/* 115 */     this.customSlots.put(Integer.valueOf(19), m_38897_((Slot)new SlotItemHandler(this.internal, 19, 25, 44) {  }
/*     */         ));
/* 117 */     this.customSlots.put(Integer.valueOf(20), m_38897_((Slot)new SlotItemHandler(this.internal, 20, 43, 44) {  }
/*     */         ));
/* 119 */     this.customSlots.put(Integer.valueOf(21), m_38897_((Slot)new SlotItemHandler(this.internal, 21, 61, 44) {  }
/*     */         ));
/* 121 */     this.customSlots.put(Integer.valueOf(22), m_38897_((Slot)new SlotItemHandler(this.internal, 22, 79, 44) {  }
/*     */         ));
/* 123 */     this.customSlots.put(Integer.valueOf(23), m_38897_((Slot)new SlotItemHandler(this.internal, 23, 97, 44) {  }
/*     */         ));
/* 125 */     this.customSlots.put(Integer.valueOf(24), m_38897_((Slot)new SlotItemHandler(this.internal, 24, 115, 44) {  }
/*     */         ));
/* 127 */     this.customSlots.put(Integer.valueOf(25), m_38897_((Slot)new SlotItemHandler(this.internal, 25, 133, 44) {  }
/*     */         ));
/* 129 */     this.customSlots.put(Integer.valueOf(26), m_38897_((Slot)new SlotItemHandler(this.internal, 26, 151, 44) {  }
/*     */         ));
/* 131 */     this.customSlots.put(Integer.valueOf(27), m_38897_((Slot)new SlotItemHandler(this.internal, 27, 7, 62) {  }
/*     */         ));
/* 133 */     this.customSlots.put(Integer.valueOf(28), m_38897_((Slot)new SlotItemHandler(this.internal, 28, 25, 62) {  }
/*     */         ));
/* 135 */     this.customSlots.put(Integer.valueOf(29), m_38897_((Slot)new SlotItemHandler(this.internal, 29, 43, 62) {  }
/*     */         ));
/* 137 */     this.customSlots.put(Integer.valueOf(30), m_38897_((Slot)new SlotItemHandler(this.internal, 30, 61, 62) {  }
/*     */         ));
/* 139 */     this.customSlots.put(Integer.valueOf(31), m_38897_((Slot)new SlotItemHandler(this.internal, 31, 79, 62) {  }
/*     */         ));
/* 141 */     this.customSlots.put(Integer.valueOf(32), m_38897_((Slot)new SlotItemHandler(this.internal, 32, 97, 62) {  }
/*     */         ));
/* 143 */     this.customSlots.put(Integer.valueOf(33), m_38897_((Slot)new SlotItemHandler(this.internal, 33, 115, 62) {  }
/*     */         ));
/* 145 */     this.customSlots.put(Integer.valueOf(34), m_38897_((Slot)new SlotItemHandler(this.internal, 34, 133, 62) {  }
/*     */         ));
/* 147 */     this.customSlots.put(Integer.valueOf(35), m_38897_((Slot)new SlotItemHandler(this.internal, 35, 151, 62) {  }));
/*     */     int si;
/* 149 */     for (si = 0; si < 3; si++) {
/* 150 */       for (int sj = 0; sj < 9; sj++)
/* 151 */         m_38897_(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/* 152 */     }  for (si = 0; si < 9; si++) {
/* 153 */       m_38897_(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m_6875_(Player player) {
/* 158 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack m_7648_(Player playerIn, int index) {
/* 163 */     ItemStack itemstack = ItemStack.f_41583_;
/* 164 */     Slot slot = (Slot)this.f_38839_.get(index);
/* 165 */     if (slot != null && slot.m_6657_()) {
/* 166 */       ItemStack itemstack1 = slot.m_7993_();
/* 167 */       itemstack = itemstack1.m_41777_();
/* 168 */       if (index < 36) {
/* 169 */         if (!m_38903_(itemstack1, 36, this.f_38839_.size(), true)) {
/* 170 */           return ItemStack.f_41583_;
/*     */         }
/* 172 */         slot.m_40234_(itemstack1, itemstack);
/* 173 */       } else if (!m_38903_(itemstack1, 0, 36, false)) {
/* 174 */         if (index < 63) {
/* 175 */           if (!m_38903_(itemstack1, 63, this.f_38839_.size(), true)) {
/* 176 */             return ItemStack.f_41583_;
/*     */           }
/*     */         }
/* 179 */         else if (!m_38903_(itemstack1, 36, 63, false)) {
/* 180 */           return ItemStack.f_41583_;
/*     */         } 
/*     */         
/* 183 */         return ItemStack.f_41583_;
/*     */       } 
/* 185 */       if (itemstack1.m_41613_() == 0) {
/* 186 */         slot.m_5852_(ItemStack.f_41583_);
/*     */       } else {
/* 188 */         slot.m_6654_();
/*     */       } 
/* 190 */       if (itemstack1.m_41613_() == itemstack.m_41613_()) {
/* 191 */         return ItemStack.f_41583_;
/*     */       }
/* 193 */       slot.m_142406_(playerIn, itemstack1);
/*     */     } 
/* 195 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 200 */     boolean flag = false;
/* 201 */     int i = p_38905_;
/* 202 */     if (p_38907_) {
/* 203 */       i = p_38906_ - 1;
/*     */     }
/* 205 */     if (p_38904_.m_41753_()) {
/* 206 */       while (!p_38904_.m_41619_() && (
/* 207 */         p_38907_ ? (
/* 208 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 211 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 214 */         Slot slot = (Slot)this.f_38839_.get(i);
/* 215 */         ItemStack itemstack = slot.m_7993_();
/* 216 */         if (slot.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
/* 217 */           int j = itemstack.m_41613_() + p_38904_.m_41613_();
/* 218 */           int maxSize = Math.min(slot.m_6641_(), p_38904_.m_41741_());
/* 219 */           if (j <= maxSize) {
/* 220 */             p_38904_.m_41764_(0);
/* 221 */             itemstack.m_41764_(j);
/* 222 */             slot.m_5852_(itemstack);
/* 223 */             flag = true;
/* 224 */           } else if (itemstack.m_41613_() < maxSize) {
/* 225 */             p_38904_.m_41774_(maxSize - itemstack.m_41613_());
/* 226 */             itemstack.m_41764_(maxSize);
/* 227 */             slot.m_5852_(itemstack);
/* 228 */             flag = true;
/*     */           } 
/*     */         } 
/* 231 */         if (p_38907_) {
/* 232 */           i--; continue;
/*     */         } 
/* 234 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 238 */     if (!p_38904_.m_41619_()) {
/* 239 */       if (p_38907_) {
/* 240 */         i = p_38906_ - 1;
/*     */       } else {
/* 242 */         i = p_38905_;
/*     */       } 
/*     */       
/* 245 */       while (p_38907_ ? (
/* 246 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 249 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 252 */         Slot slot1 = (Slot)this.f_38839_.get(i);
/* 253 */         ItemStack itemstack1 = slot1.m_7993_();
/* 254 */         if (itemstack1.m_41619_() && slot1.m_5857_(p_38904_)) {
/* 255 */           if (p_38904_.m_41613_() > slot1.m_6641_()) {
/* 256 */             slot1.m_5852_(p_38904_.m_41620_(slot1.m_6641_()));
/*     */           } else {
/* 258 */             slot1.m_5852_(p_38904_.m_41620_(p_38904_.m_41613_()));
/*     */           } 
/* 260 */           slot1.m_6654_();
/* 261 */           flag = true;
/*     */           break;
/*     */         } 
/* 264 */         if (p_38907_) {
/* 265 */           i--; continue;
/*     */         } 
/* 267 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 271 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6877_(Player playerIn) {
/* 276 */     super.m_6877_(playerIn);
/* 277 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 278 */       if (!serverPlayer.m_6084_() || serverPlayer.m_9232_()) {
/* 279 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 280 */           playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
/*     */         }
/*     */       } else {
/* 283 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 284 */           playerIn.m_150109_().m_150079_(this.internal.extractItem(i, this.internal.getStackInSlot(i).m_41613_(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 291 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\inventory\SupplyCrateGuiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */