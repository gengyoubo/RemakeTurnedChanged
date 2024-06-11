/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class LatexcannonRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 14 */       _player.getCooldowns().addCooldown(itemstack.getItem(), 25); }
/* 15 */      if (itemstack.getDamageValue() <= 0.1D) {
/* 16 */       Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem
/* 17 */         .getInventory().contains(new ItemStack((ItemLike)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get())))
/*    */       
/* 19 */       { if (entity instanceof Player) { Player _player = (Player)entity;
/* 20 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get());
/* 21 */           _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 22 */               .getCraftSlots()); }
/*    */         
/* 24 */         itemstack.setDamageValue(0);
/* 25 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 26 */           _player.getCooldowns().addCooldown(itemstack.getItem(), 120); }  }
/* 27 */       else { Player player = (Player)entity; if (entity instanceof Player && player
/* 28 */           .getInventory().contains(new ItemStack((ItemLike)LatexModBlocks.DARKLATEXBLOCK.get()))) {
/*    */           
/* 30 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 31 */             ItemStack _stktoremove = new ItemStack((ItemLike)LatexModBlocks.DARKLATEXBLOCK.get());
/* 32 */             _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 33 */                 .getCraftSlots()); }
/*    */           
/* 35 */           itemstack.setDamageValue(0);
/* 36 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 37 */             _player.getCooldowns().addCooldown(itemstack.getItem(), 120); }
/*    */         
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexcannonRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */