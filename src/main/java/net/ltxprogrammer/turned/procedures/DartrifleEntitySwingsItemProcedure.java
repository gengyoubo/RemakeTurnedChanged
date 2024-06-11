/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class DartrifleEntitySwingsItemProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.DARTRIFLE.get())
/* 16 */     { if (entity instanceof Player) { Player _player = (Player)entity;
/* 17 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get());
/* 18 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 19 */             .m_39730_()); }
/*    */       
/* 21 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 22 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.LATEX_DART_RIFLE.get());
/* 23 */         _setstack.m_41764_(1);
/* 24 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */        }
/* 26 */     else { LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.LATEX_DART_RIFLE
/* 27 */         .get()) {
/* 28 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 29 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.LATEX_DART_RIFLE.get());
/* 30 */           _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 31 */               .m_39730_()); }
/*    */         
/* 33 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 34 */           ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get());
/* 35 */           _setstack.m_41764_(1);
/* 36 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DartrifleEntitySwingsItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */