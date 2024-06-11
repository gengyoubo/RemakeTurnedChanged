/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class FlamethowerReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.FLAMETHOWER.get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */       Player _playerHasItem = (Player)entity;
/* 18 */       Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 100.0D && ((entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42413_))) || (entity instanceof Player && player1
/* 19 */         .m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42414_))))) {
/*    */         
/* 21 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 23 */           LivingEntity livingEntity1 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41720_(), 125); }
/* 24 */          for (int index0 = 0; index0 < 30; index0++) {
/* 25 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 27 */           Player player2 = (Player)entity;
/* 28 */           Player player3 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 100.0D && ((entity instanceof Player && player2.m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42413_))) || (entity instanceof Player && player3
/* 29 */             .m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42414_))))) {
/*    */             
/* 31 */             Player player = (Player)entity; if (entity instanceof Player && player
/* 32 */               .m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42413_)))
/*    */             
/* 34 */             { LivingEntity livingEntity2 = (LivingEntity)entity;
/* 35 */               livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_)
/* 36 */                   .m_41784_().m_128459_("ammo") + 10.0D);
/* 37 */               if (entity instanceof Player) { Player _player = (Player)entity;
/* 38 */                 ItemStack _stktoremove = new ItemStack((ItemLike)Items.f_42413_);
/* 39 */                 _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 40 */                     .m_39730_()); }
/*    */                }
/* 42 */             else { Player player4 = (Player)entity; if (entity instanceof Player && player4
/* 43 */                 .m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42414_))) {
/*    */                 
/* 45 */                 LivingEntity livingEntity2 = (LivingEntity)entity;
/* 46 */                 livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_)
/* 47 */                     .m_41784_().m_128459_("ammo") + 8.0D);
/* 48 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/* 49 */                   ItemStack _stktoremove = new ItemStack((ItemLike)Items.f_42414_);
/* 50 */                   _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 51 */                       .m_39730_()); }
/*    */               
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\FlamethowerReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */