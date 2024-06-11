/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class TabletRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 15 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TABLET.get());
/* 16 */       _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_.m_39730_()); }
/*    */     
/* 18 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 19 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BATTERY.get());
/* 20 */       _setstack.m_41764_(1);
/* 21 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/* 23 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 24 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.TABLETOFF.get());
/* 25 */       _setstack.m_41764_(1);
/* 26 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TabletRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */