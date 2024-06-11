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
/*     */ public class SmallboxguiMenu
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
/*     */   public SmallboxguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  36 */     super(LatexModMenus.SMALLBOXGUI, id);
/*  37 */     this.entity = inv.f_35978_;
/*  38 */     this.world = inv.f_35978_.f_19853_;
/*  39 */     this.internal = (IItemHandler)new ItemStackHandler(4);
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
/*  77 */     this.customSlots.put(Integer.valueOf(0), m_38897_((Slot)new SlotItemHandler(this.internal, 0, 70, 20) {  }
/*     */         ));
/*  79 */     this.customSlots.put(Integer.valueOf(1), m_38897_((Slot)new SlotItemHandler(this.internal, 1, 88, 20) {  }
/*     */         ));
/*  81 */     this.customSlots.put(Integer.valueOf(2), m_38897_((Slot)new SlotItemHandler(this.internal, 2, 70, 38) {  }
/*     */         ));
/*  83 */     this.customSlots.put(Integer.valueOf(3), m_38897_((Slot)new SlotItemHandler(this.internal, 3, 88, 38) {  }));
/*     */     int si;
/*  85 */     for (si = 0; si < 3; si++) {
/*  86 */       for (int sj = 0; sj < 9; sj++)
/*  87 */         m_38897_(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18)); 
/*  88 */     }  for (si = 0; si < 9; si++) {
/*  89 */       m_38897_(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean m_6875_(Player player) {
/*  94 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public ItemStack m_7648_(Player playerIn, int index) {
/*  99 */     ItemStack itemstack = ItemStack.f_41583_;
/* 100 */     Slot slot = (Slot)this.f_38839_.get(index);
/* 101 */     if (slot != null && slot.m_6657_()) {
/* 102 */       ItemStack itemstack1 = slot.m_7993_();
/* 103 */       itemstack = itemstack1.m_41777_();
/* 104 */       if (index < 4) {
/* 105 */         if (!m_38903_(itemstack1, 4, this.f_38839_.size(), true)) {
/* 106 */           return ItemStack.f_41583_;
/*     */         }
/* 108 */         slot.m_40234_(itemstack1, itemstack);
/* 109 */       } else if (!m_38903_(itemstack1, 0, 4, false)) {
/* 110 */         if (index < 31) {
/* 111 */           if (!m_38903_(itemstack1, 31, this.f_38839_.size(), true)) {
/* 112 */             return ItemStack.f_41583_;
/*     */           }
/*     */         }
/* 115 */         else if (!m_38903_(itemstack1, 4, 31, false)) {
/* 116 */           return ItemStack.f_41583_;
/*     */         } 
/*     */         
/* 119 */         return ItemStack.f_41583_;
/*     */       } 
/* 121 */       if (itemstack1.m_41613_() == 0) {
/* 122 */         slot.m_5852_(ItemStack.f_41583_);
/*     */       } else {
/* 124 */         slot.m_6654_();
/*     */       } 
/* 126 */       if (itemstack1.m_41613_() == itemstack.m_41613_()) {
/* 127 */         return ItemStack.f_41583_;
/*     */       }
/* 129 */       slot.m_142406_(playerIn, itemstack1);
/*     */     } 
/* 131 */     return itemstack;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_38903_(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 136 */     boolean flag = false;
/* 137 */     int i = p_38905_;
/* 138 */     if (p_38907_) {
/* 139 */       i = p_38906_ - 1;
/*     */     }
/* 141 */     if (p_38904_.m_41753_()) {
/* 142 */       while (!p_38904_.m_41619_() && (
/* 143 */         p_38907_ ? (
/* 144 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 147 */         i >= p_38906_))) {
/*     */ 
/*     */         
/* 150 */         Slot slot = (Slot)this.f_38839_.get(i);
/* 151 */         ItemStack itemstack = slot.m_7993_();
/* 152 */         if (slot.m_5857_(itemstack) && !itemstack.m_41619_() && ItemStack.m_150942_(p_38904_, itemstack)) {
/* 153 */           int j = itemstack.m_41613_() + p_38904_.m_41613_();
/* 154 */           int maxSize = Math.min(slot.m_6641_(), p_38904_.m_41741_());
/* 155 */           if (j <= maxSize) {
/* 156 */             p_38904_.m_41764_(0);
/* 157 */             itemstack.m_41764_(j);
/* 158 */             slot.m_5852_(itemstack);
/* 159 */             flag = true;
/* 160 */           } else if (itemstack.m_41613_() < maxSize) {
/* 161 */             p_38904_.m_41774_(maxSize - itemstack.m_41613_());
/* 162 */             itemstack.m_41764_(maxSize);
/* 163 */             slot.m_5852_(itemstack);
/* 164 */             flag = true;
/*     */           } 
/*     */         } 
/* 167 */         if (p_38907_) {
/* 168 */           i--; continue;
/*     */         } 
/* 170 */         i++;
/*     */       } 
/*     */     }
/*     */     
/* 174 */     if (!p_38904_.m_41619_()) {
/* 175 */       if (p_38907_) {
/* 176 */         i = p_38906_ - 1;
/*     */       } else {
/* 178 */         i = p_38905_;
/*     */       } 
/*     */       
/* 181 */       while (p_38907_ ? (
/* 182 */         i < p_38905_) : (
/*     */ 
/*     */         
/* 185 */         i >= p_38906_)) {
/*     */ 
/*     */         
/* 188 */         Slot slot1 = (Slot)this.f_38839_.get(i);
/* 189 */         ItemStack itemstack1 = slot1.m_7993_();
/* 190 */         if (itemstack1.m_41619_() && slot1.m_5857_(p_38904_)) {
/* 191 */           if (p_38904_.m_41613_() > slot1.m_6641_()) {
/* 192 */             slot1.m_5852_(p_38904_.m_41620_(slot1.m_6641_()));
/*     */           } else {
/* 194 */             slot1.m_5852_(p_38904_.m_41620_(p_38904_.m_41613_()));
/*     */           } 
/* 196 */           slot1.m_6654_();
/* 197 */           flag = true;
/*     */           break;
/*     */         } 
/* 200 */         if (p_38907_) {
/* 201 */           i--; continue;
/*     */         } 
/* 203 */         i++;
/*     */       } 
/*     */     } 
/*     */     
/* 207 */     return flag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6877_(Player playerIn) {
/* 212 */     super.m_6877_(playerIn);
/* 213 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 214 */       if (!serverPlayer.m_6084_() || serverPlayer.m_9232_()) {
/* 215 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 216 */           playerIn.m_36176_(this.internal.extractItem(j, this.internal.getStackInSlot(j).m_41613_(), false), false);
/*     */         }
/*     */       } else {
/* 219 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 220 */           playerIn.m_150109_().m_150079_(this.internal.extractItem(i, this.internal.getStackInSlot(i).m_41613_(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 227 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\inventory\SmallboxguiMenu.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */