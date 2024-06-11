/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class TabletoffRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.BATTERY.get()))) {
/* 15 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 16 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.BATTERY.get());
/* 17 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 18 */             .m_39730_()); }
/*    */       
/* 20 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 21 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TABLETOFF.get());
/* 22 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 23 */             .m_39730_()); }
/*    */       
/* 25 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 26 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.TABLET.get());
/* 27 */         _setstack.m_41764_(1);
/* 28 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TabletoffRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */