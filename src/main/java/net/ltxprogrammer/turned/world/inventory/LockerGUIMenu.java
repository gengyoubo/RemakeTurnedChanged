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
/*     */ public class LockerGUIMenu
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
/*     */   public LockerGUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  36 */     super(LatexModMenus.LOCKER_GUI, id);
/*  37 */     this.entity = inv.f_35978_;
/*  38 */     this.world = inv.f_35978_.f_19853_;
/*  39 */     this.internal = (IItemHandler)new ItemStackHandler(12);
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
/*  77 */     this.customSlots.put(Integer.valueOf(0), m_38897_((Slot)new SlotItemHandler(this.internal, 0, 61, 63) {  }
/*     */         ));
/*  79 */     this.customSlots.put(Integer.valueOf(1), m_38897_((Slot)new SlotItemHandler(this.internal, 1, 79, 63) {  }
/*     */         ));
/*  81 */     this.customSlots.put(Integer.valueOf(2), m_38897_((Slot)new SlotItemHandler(this.internal, 2, 97, 63) {  }
/*     */         ));
/*  83 */     this.customSlots.put(Integer.valueOf(3), m_38897_((Slot)new SlotItemHandler(this.internal, 3, 61, 45) {  }
/*     */         ));
/*  85 */     this.customSlots.put(Integer.valueOf(4), m_38897_((Slot)new SlotItemHandler(this.internal, 4, 79, 45) {  }
/*     */         ));
/*  87 */     this.customSlots.put(Integer.valueOf(5), m_38897_((Slot)new SlotItemHandler(this.internal, 5, 97, 45) {  }
/*     */         ));
/*  89 */     this.customSlots.put(Integer.valueOf(6), m_38897_((Slot)new SlotItemHandler(this.internal, 6, 61, 27) {  }
/*     */         ));
/*  91 */     this.customSlots.put(Integer.valueOf(7), m_38897_((Slot)new SlotItemHandler(this.internal, 7, 79, 27) {  }
/*     */         ));
/*  93 */     this.customSlots.put(Integer.valueOf(8), m_38897_((Slot)new SlotItemHandler(this.internal, 8, 97, 27) {  }
/*     */         ));
/*  95 */     this.customSlots.put(Integer.valueOf(9), m_38897_((Slot)new SlotItemHandler(this.internal, 9, 61, 9) {  }
/*     */         ));
/*  97 */     this.customSlots.put(Integer.valueOf(10), m_38897_((Slot)new SlotItemHandler(this.internal, 10, 79, 9) {  }
/*     */         ));
/*  99 */     this.customSlots.put(Integer.valueOf(11), m_38897_((Slot)new SlotItemHandler(this.internal, 11, 97, 9) {  }));
/*     */     int si;
/* 101 */     for (si = 0; si < 3; si++) {
/* 102 */       for (int sj = 0; sj < 9; sj++)
/* 103 */         m_38897_(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 94 + si * 18)); 
/* 104 */     }  for (si = 0; si < 9; si++) {
/* 105 */       m_38897_(new Slot((Container)inv, si, 8 + si * 18, 152));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m_6875_(Player player) {
/* 110 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack m_7648_(Player playerIn, int index) {
/* 115 */     ItemStack itemstack = ItemStack.f_41583_;
/* 116 */     Slot slot = (Slot)this.f_38839_.get(index);
/* 117 */     if (slot != null && slot.m_6657_()) {
/* 118 */       ItemStack itemstack1 = slot.m_7993_();
/* 119 */       itemstack = itemstack1.m_41777_();
/* 120 */       if (index < 12) {
/* 121 */         if (!m_38903_(itemstack1, 12, this.f_38839_.size(), true)) {
/* 122 */           return ItemStack.f_41583_;
/*     */         }
/* 124 */         slot.m_40234_(itemstack1, itemstack);
/* 125 */       } else if (!m_38903_(itemstack1, 0, 12, false)) {
/* 126 */         if (index < 39) {
/* 127 */           if (!m_38903_(itemstack1, 39, this.f_38839_.size(), true)) {
/* 128 */             return ItemStack.f_41583_;
/*     */           }
/*     */         }
/* 131 */         else if (!m_38903_(itemstack1, 12, 39, false)) {
/* 132 */           return ItemStack.f_41583_;
/*     */         } 
/*     */         
/* 135 */         return ItemStack.f_41583_;
/*     */       } 
/* 137 */       if (itemstack1.m_41613_() == 0) {
/* 138 */         slot.m_5852_(ItemStack.f_41583_);
/*     */       } else {
/* 140 */         slot.m_6654_();
/*     */       } 
/* 142 */       if (itemstack1.m_41613_() == itemstack.m_41613_()) {
/* 143 */         return ItemStack.f_41583_;
/*     */       }
/* 145 */       slot.m_142406_(playerIn, itemstack1);
/*     */     } 
/* 147 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 152 */     boolean flag = false;
/* 153 */     int i = p_38905_;
/* 154 */     if (p_38907_) {
/* 155 */       i = p_38906_ - 1;
/*     */     }
/* 157 */     if (p_38904_.m_41753_()) {
/* 158 */       while (!p_38904_.m_41619_() && (
/* 159 */         p_38907_ ? (
/* 160 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 163 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 166 */         Slot slot = (Slot)this.f_38839_.get(i);
/* 167 */         ItemStack itemstack = slot.m_7993_();
/* 168 */         if (slot.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
/* 169 */           int j = itemstack.m_41613_() + p_38904_.m_41613_();
/* 170 */           int maxSize = Math.min(slot.m_6641_(), p_38904_.m_41741_());
/* 171 */           if (j <= maxSize) {
/* 172 */             p_38904_.m_41764_(0);
/* 173 */             itemstack.m_41764_(j);
/* 174 */             slot.m_5852_(itemstack);
/* 175 */             flag = true;
/* 176 */           } else if (itemstack.m_41613_() < maxSize) {
/* 177 */             p_38904_.m_41774_(maxSize - itemstack.m_41613_());
/* 178 */             itemstack.m_41764_(maxSize);
/* 179 */             slot.m_5852_(itemstack);
/* 180 */             flag = true;
/*     */           } 
/*     */         } 
/* 183 */         if (p_38907_) {
/* 184 */           i--; continue;
/*     */         } 
/* 186 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 190 */     if (!p_38904_.m_41619_()) {
/* 191 */       if (p_38907_) {
/* 192 */         i = p_38906_ - 1;
/*     */       } else {
/* 194 */         i = p_38905_;
/*     */       } 
/*     */       
/* 197 */       while (p_38907_ ? (
/* 198 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 201 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 204 */         Slot slot1 = (Slot)this.f_38839_.get(i);
/* 205 */         ItemStack itemstack1 = slot1.m_7993_();
/* 206 */         if (itemstack1.m_41619_() && slot1.m_5857_(p_38904_)) {
/* 207 */           if (p_38904_.m_41613_() > slot1.m_6641_()) {
/* 208 */             slot1.m_5852_(p_38904_.m_41620_(slot1.m_6641_()));
/*     */           } else {
/* 210 */             slot1.m_5852_(p_38904_.m_41620_(p_38904_.m_41613_()));
/*     */           } 
/* 212 */           slot1.m_6654_();
/* 213 */           flag = true;
/*     */           break;
/*     */         } 
/* 216 */         if (p_38907_) {
/* 217 */           i--; continue;
/*     */         } 
/* 219 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 223 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6877_(Player playerIn) {
/* 228 */     super.m_6877_(playerIn);
/* 229 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 230 */       if (!serverPlayer.m_6084_() || serverPlayer.m_9232_()) {
/* 231 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 232 */           playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
/*     */         }
/*     */       } else {
/* 235 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 236 */           playerIn.m_150109_().m_150079_(this.internal.extractItem(i, this.internal.getStackInSlot(i).m_41613_(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 243 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\inventory\LockerGUIMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */