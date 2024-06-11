/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class RevolvingGooCannonReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.REVOLVING_GOO_CANNON
/* 16 */       .get()) {
/* 17 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 18 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 3.0D && entity instanceof Player && _playerHasItem
/* 19 */         .m_150109_().m_36063_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()))) {
/*    */         
/* 21 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 23 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/* 24 */           LivingEntity livingEntity2 = (LivingEntity)entity;
/* 25 */           _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41720_(), (int)(80.0D - ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") * 10.0D)); }
/* 26 */          for (int index0 = 0; index0 < 3; index0++) {
/* 27 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 29 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 3.0D && entity instanceof Player && player
/* 30 */             .m_150109_().m_36063_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()))) {
/*    */             
/* 32 */             LivingEntity livingEntity2 = (LivingEntity)entity;
/* 33 */             livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_)
/* 34 */                 .m_41784_().m_128459_("ammo") + 1.0D);
/* 35 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 36 */               ItemStack _stktoremove = new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get());
/* 37 */               _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 38 */                   .m_39730_()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\RevolvingGooCannonReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */