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
/*    */ public class TabletoffRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem.getInventory().contains(new ItemStack((ItemLike)LatexModItems.BATTERY.get()))) {
/* 16 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 17 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.BATTERY.get());
/* 18 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 19 */             .getCraftSlots()); }
/*    */       
/* 21 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 22 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TABLETOFF.get());
/* 23 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 24 */             .getCraftSlots()); }
/*    */       
/* 26 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.TABLET.get());
/* 28 */         _setstack.setCount(1);
/* 29 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TabletoffRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */