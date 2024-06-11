/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class MatchlockPistolReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.MATCHLOCK_PISTOL
/* 14 */       .get()) {
/* 15 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 16 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 1.0D && entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get()))) {
/* 17 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 19 */           LivingEntity livingEntity2 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41720_(), 124); }
/* 20 */          LivingEntity livingEntity1 = (LivingEntity)entity;
/* 21 */         livingEntity1 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") + 1.0D);
/*    */         
/* 23 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 24 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get());
/* 25 */           _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 26 */               .m_39730_()); }
/*    */       
/*    */       } 
/*    */     } else {
/* 30 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.MATCHLOCK_PISTOL
/* 31 */         .get()) {
/* 32 */         LivingEntity livingEntity1 = (LivingEntity)entity;
/* 33 */         Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 1.0D && entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get()))) {
/* 34 */           if (entity instanceof Player) { Player _player = (Player)entity;
/*    */             
/* 36 */             LivingEntity livingEntity3 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity3.m_21206_() : ItemStack.f_41583_).m_41720_(), 124); }
/* 37 */            LivingEntity livingEntity2 = (LivingEntity)entity;
/* 38 */           livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21206_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") + 1.0D);
/*    */           
/* 40 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 41 */             ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get());
/* 42 */             _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 43 */                 .m_39730_()); }
/*    */         
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\MatchlockPistolReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */