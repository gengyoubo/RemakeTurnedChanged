/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class ScientistOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (Math.random() < 0.01D) {
/*    */       
/* 16 */       Entity _entity = entity;
/* 17 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 18 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get()));
/* 19 */         _player.m_150109_().m_6596_(); }
/* 20 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 21 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get())); }
/*    */     
/*    */     } 
/*    */     
/* 25 */     if (Math.random() < 0.001D) {
/*    */       
/* 27 */       Entity _entity = entity;
/* 28 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 29 */         (_player.m_150109_()).f_35975_.set(0, new ItemStack((ItemLike)LatexModItems.HAZMAT_HELMET.get()));
/* 30 */         _player.m_150109_().m_6596_(); }
/* 31 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 32 */         _living.m_8061_(EquipmentSlot.FEET, new ItemStack((ItemLike)LatexModItems.HAZMAT_HELMET.get())); }
/*    */ 
/*    */ 
/*    */       
/* 36 */       _entity = entity;
/* 37 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 38 */         (_player.m_150109_()).f_35975_.set(1, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get()));
/* 39 */         _player.m_150109_().m_6596_(); }
/* 40 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 41 */         _living.m_8061_(EquipmentSlot.LEGS, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get())); }
/*    */ 
/*    */ 
/*    */       
/* 45 */       _entity = entity;
/* 46 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 47 */         (_player.m_150109_()).f_35975_.set(2, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get()));
/* 48 */         _player.m_150109_().m_6596_(); }
/* 49 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 50 */         _living.m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get())); }
/*    */ 
/*    */ 
/*    */       
/* 54 */       _entity = entity;
/* 55 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 56 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get()));
/* 57 */         _player.m_150109_().m_6596_(); }
/* 58 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 59 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get())); }
/*    */ 
/*    */     
/* 62 */     } else if (Math.random() < 0.001D) {
/*    */       
/* 64 */       Entity _entity = entity;
/* 65 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 66 */         (_player.m_150109_()).f_35975_.set(1, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get()));
/* 67 */         _player.m_150109_().m_6596_(); }
/* 68 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 69 */         _living.m_8061_(EquipmentSlot.LEGS, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get())); }
/*    */ 
/*    */ 
/*    */       
/* 73 */       _entity = entity;
/* 74 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 75 */         (_player.m_150109_()).f_35975_.set(2, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get()));
/* 76 */         _player.m_150109_().m_6596_(); }
/* 77 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 78 */         _living.m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get())); }
/*    */ 
/*    */ 
/*    */       
/* 82 */       _entity = entity;
/* 83 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 84 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get()));
/* 85 */         _player.m_150109_().m_6596_(); }
/* 86 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 87 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get())); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ScientistOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */