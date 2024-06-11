/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class ShotgunReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.OVERUNDERSHOTGUN
/* 15 */       .get()) {
/* 16 */       LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 2.0D) {
/* 17 */         LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_()
/* 18 */           .m_128459_("ammo") > 1.0D) {
/* 19 */           Player player = (Player)entity; if (entity instanceof Player && player
/* 20 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */             
/* 22 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*    */               
/* 24 */               LivingEntity livingEntity3 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41720_(), 32); }
/* 25 */              for (int index0 = 0; index0 < 2; index0++) {
/* 26 */               LivingEntity livingEntity3 = (LivingEntity)entity;
/*    */               
/* 28 */               Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 2.0D && entity instanceof Player && player1
/* 29 */                 .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */                 
/* 31 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/* 32 */                 livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity4.m_21205_() : ItemStack.f_41583_)
/* 33 */                     .m_41784_().m_128459_("ammo") + 1.0D);
/* 34 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/* 35 */                   ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get());
/* 36 */                   _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 37 */                       .m_39730_()); }
/*    */               
/*    */               } 
/*    */             } 
/*    */           }  return;
/*    */         } 
/* 43 */       }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*    */       
/* 45 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 2.0D && entity instanceof Player && _playerHasItem
/* 46 */         .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */         
/* 48 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 50 */           LivingEntity livingEntity = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41720_(), 48); }
/* 51 */          for (int index1 = 0; index1 < 2; index1++) {
/* 52 */           LivingEntity livingEntity = (LivingEntity)entity;
/*    */           
/* 54 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 2.0D && entity instanceof Player && player
/* 55 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */             
/* 57 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/* 58 */             livingEntity3 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_)
/* 59 */                 .m_41784_().m_128459_("ammo") + 1.0D);
/* 60 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 61 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get());
/* 62 */               _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 63 */                   .m_39730_()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ShotgunReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */