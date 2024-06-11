/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class DartRifleReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.DARTRIFLE.get()) {
/* 15 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 16 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 5.0D && entity instanceof Player && _playerHasItem
/* 17 */         .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.DART.get()))) {
/*    */         
/* 19 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 21 */           LivingEntity livingEntity1 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41720_(), 95); }
/* 22 */          for (int index0 = 0; index0 < 5; index0++) {
/* 23 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 25 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 5.0D && entity instanceof Player && player
/* 26 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.DART.get()))) {
/*    */             
/* 28 */             LivingEntity livingEntity2 = (LivingEntity)entity;
/* 29 */             livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_)
/* 30 */                 .m_41784_().m_128459_("ammo") + 1.0D);
/* 31 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 32 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DART.get());
/* 33 */               _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 34 */                   .m_39730_()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DartRifleReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */