/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class MilitaryOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (Math.random() < 0.05D) {
/*    */       
/* 16 */       Entity _entity = entity;
/* 17 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 18 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)LatexModItems.GOOD_BERET_HELMET.get()));
/* 19 */         _player.m_150109_().m_6596_(); }
/* 20 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 21 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.GOOD_BERET_HELMET.get())); }
/*    */ 
/*    */     
/* 24 */     } else if (Math.random() < 0.05D) {
/*    */       
/* 26 */       Entity _entity = entity;
/* 27 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 28 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get()));
/* 29 */         _player.m_150109_().m_6596_(); }
/* 30 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 31 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get())); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\MilitaryOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */