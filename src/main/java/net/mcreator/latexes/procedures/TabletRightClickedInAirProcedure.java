/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class TabletRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 16 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TABLET.get());
/* 17 */       _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu.getCraftSlots()); }
/*    */     
/* 19 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 20 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BATTERY.get());
/* 21 */       _setstack.setCount(1);
/* 22 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/* 24 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 25 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.TABLETOFF.get());
/* 26 */       _setstack.setCount(1);
/* 27 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TabletRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */