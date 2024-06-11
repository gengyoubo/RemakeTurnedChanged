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
/*     */ public class CrateguiMenu
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
/*     */   public CrateguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  36 */     super(LatexModMenus.CRATEGUI, id);
/*  37 */     this.entity = inv.f_35978_;
/*  38 */     this.world = inv.f_35978_.f_19853_;
/*  39 */     this.internal = (IItemHandler)new ItemStackHandler(5);
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
/*  77 */     this.customSlots.put(Integer.valueOf(0), m_38897_((Slot)new SlotItemHandler(this.internal, 0, 43, 35) {  }
/*     */         ));
/*  79 */     this.customSlots.put(Integer.valueOf(1), m_38897_((Slot)new SlotItemHandler(this.internal, 1, 61, 35) {  }
/*     */         ));
/*  81 */     this.customSlots.put(Integer.valueOf(2), m_38897_((Slot)new SlotItemHandler(this.internal, 2, 79, 35) {  }
/*     */         ));
/*  83 */     this.customSlots.put(Integer.valueOf(3), m_38897_((Slot)new SlotItemHandler(this.internal, 3, 97, 35) {  }
/*     */         ));
/*  85 */     this.customSlots.put(Integer.valueOf(4), m_38897_((Slot)new SlotItemHandler(this.internal, 4, 115, 35) {  }));
/*     */     int si;
/*  87 */     for (si = 0; si < 3; si++) {
/*  88 */       for (int sj = 0; sj < 9; sj++)
/*  89 */         m_38897_(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/*  90 */     }  for (si = 0; si < 9; si++) {
/*  91 */       m_38897_(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m_6875_(Player player) {
/*  96 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack m_7648_(Player playerIn, int index) {
/* 101 */     ItemStack itemstack = ItemStack.f_41583_;
/* 102 */     Slot slot = (Slot)this.f_38839_.get(index);
/* 103 */     if (slot != null && slot.m_6657_()) {
/* 104 */       ItemStack itemstack1 = slot.m_7993_();
/* 105 */       itemstack = itemstack1.m_41777_();
/* 106 */       if (index < 5) {
/* 107 */         if (!m_38903_(itemstack1, 5, this.f_38839_.size(), true)) {
/* 108 */           return ItemStack.f_41583_;
/*     */         }
/* 110 */         slot.m_40234_(itemstack1, itemstack);
/* 111 */       } else if (!m_38903_(itemstack1, 0, 5, false)) {
/* 112 */         if (index < 32) {
/* 113 */           if (!m_38903_(itemstack1, 32, this.f_38839_.size(), true)) {
/* 114 */             return ItemStack.f_41583_;
/*     */           }
/*     */         }
/* 117 */         else if (!m_38903_(itemstack1, 5, 32, false)) {
/* 118 */           return ItemStack.f_41583_;
/*     */         } 
/*     */         
/* 121 */         return ItemStack.f_41583_;
/*     */       } 
/* 123 */       if (itemstack1.m_41613_() == 0) {
/* 124 */         slot.m_5852_(ItemStack.f_41583_);
/*     */       } else {
/* 126 */         slot.m_6654_();
/*     */       } 
/* 128 */       if (itemstack1.m_41613_() == itemstack.m_41613_()) {
/* 129 */         return ItemStack.f_41583_;
/*     */       }
/* 131 */       slot.m_142406_(playerIn, itemstack1);
/*     */     } 
/* 133 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 138 */     boolean flag = false;
/* 139 */     int i = p_38905_;
/* 140 */     if (p_38907_) {
/* 141 */       i = p_38906_ - 1;
/*     */     }
/* 143 */     if (p_38904_.m_41753_()) {
/* 144 */       while (!p_38904_.m_41619_() && (
/* 145 */         p_38907_ ? (
/* 146 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 149 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 152 */         Slot slot = (Slot)this.f_38839_.get(i);
/* 153 */         ItemStack itemstack = slot.m_7993_();
/* 154 */         if (slot.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
/* 155 */           int j = itemstack.m_41613_() + p_38904_.m_41613_();
/* 156 */           int maxSize = Math.min(slot.m_6641_(), p_38904_.m_41741_());
/* 157 */           if (j <= maxSize) {
/* 158 */             p_38904_.m_41764_(0);
/* 159 */             itemstack.m_41764_(j);
/* 160 */             slot.m_5852_(itemstack);
/* 161 */             flag = true;
/* 162 */           } else if (itemstack.m_41613_() < maxSize) {
/* 163 */             p_38904_.m_41774_(maxSize - itemstack.m_41613_());
/* 164 */             itemstack.m_41764_(maxSize);
/* 165 */             slot.m_5852_(itemstack);
/* 166 */             flag = true;
/*     */           } 
/*     */         } 
/* 169 */         if (p_38907_) {
/* 170 */           i--; continue;
/*     */         } 
/* 172 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 176 */     if (!p_38904_.m_41619_()) {
/* 177 */       if (p_38907_) {
/* 178 */         i = p_38906_ - 1;
/*     */       } else {
/* 180 */         i = p_38905_;
/*     */       } 
/*     */       
/* 183 */       while (p_38907_ ? (
/* 184 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 187 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 190 */         Slot slot1 = (Slot)this.f_38839_.get(i);
/* 191 */         ItemStack itemstack1 = slot1.m_7993_();
/* 192 */         if (itemstack1.m_41619_() && slot1.m_5857_(p_38904_)) {
/* 193 */           if (p_38904_.m_41613_() > slot1.m_6641_()) {
/* 194 */             slot1.m_5852_(p_38904_.m_41620_(slot1.m_6641_()));
/*     */           } else {
/* 196 */             slot1.m_5852_(p_38904_.m_41620_(p_38904_.m_41613_()));
/*     */           } 
/* 198 */           slot1.m_6654_();
/* 199 */           flag = true;
/*     */           break;
/*     */         } 
/* 202 */         if (p_38907_) {
/* 203 */           i--; continue;
/*     */         } 
/* 205 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 209 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6877_(Player playerIn) {
/* 214 */     super.m_6877_(playerIn);
/* 215 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 216 */       if (!serverPlayer.m_6084_() || serverPlayer.m_9232_()) {
/* 217 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 218 */           playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
/*     */         }
/*     */       } else {
/* 221 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 222 */           playerIn.m_150109_().m_150079_(this.internal.extractItem(i, this.internal.getStackInSlot(i).m_41613_(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 229 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\inventory\CrateguiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */