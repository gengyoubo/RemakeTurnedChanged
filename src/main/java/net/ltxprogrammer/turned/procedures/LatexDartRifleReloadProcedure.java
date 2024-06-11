/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class LatexDartRifleReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.LATEX_DART_RIFLE
/* 15 */       .get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 5.0D && entity instanceof Player && _playerHasItem
/* 18 */         .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.LATEXDART.get()))) {
/*    */         
/* 20 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 22 */           LivingEntity livingEntity1 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41720_(), 95); }
/* 23 */          for (int index0 = 0; index0 < 5; index0++) {
/* 24 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 26 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 5.0D && entity instanceof Player && player
/* 27 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.LATEXDART.get()))) {
/*    */             
/* 29 */             LivingEntity livingEntity2 = (LivingEntity)entity;
/* 30 */             livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_)
/* 31 */                 .m_41784_().m_128459_("ammo") + 1.0D);
/* 32 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 33 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.LATEXDART.get());
/* 34 */               _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 35 */                   .m_39730_()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexDartRifleReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */