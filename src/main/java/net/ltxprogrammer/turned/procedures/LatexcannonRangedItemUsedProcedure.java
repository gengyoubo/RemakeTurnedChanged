/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class LatexcannonRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 13 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 25); }
/* 14 */      if (itemstack.m_41773_() <= 0.1D) {
/* 15 */       Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get())))
/* 16 */       { if (entity instanceof Player) { Player _player = (Player)entity;
/* 17 */           ItemStack _stktoremove = new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get());
/* 18 */           _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 19 */               .m_39730_()); }
/*    */         
/* 21 */         itemstack.m_41721_(0);
/* 22 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 23 */           _player.m_36335_().m_41524_(itemstack.m_41720_(), 120); }  }
/* 24 */       else { Player player = (Player)entity; if (entity instanceof Player && player.m_150109_().m_36063_(new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get()))) {
/* 25 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 26 */             ItemStack _stktoremove = new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get());
/* 27 */             _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 28 */                 .m_39730_()); }
/*    */           
/* 30 */           itemstack.m_41721_(0);
/* 31 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 32 */             _player.m_36335_().m_41524_(itemstack.m_41720_(), 120); }
/*    */         
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexcannonRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */