/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class CrystalBowUnloadedRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.CRYSTALARROW.get())
/* 18 */     { if (entity instanceof Player) { Player _player = (Player)entity;
/* 19 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 20 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 21 */             .getCraftSlots()); }
/*    */       
/* 23 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 24 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 25 */         _setstack.setCount(1);
/* 26 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */        }
/* 28 */     else { LivingEntity _entGetArmor = (LivingEntity)entity;
/*    */       
/* 30 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && entity instanceof Player && _playerHasItem
/* 31 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get()))) {
/*    */         
/* 33 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 34 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 35 */           _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 36 */               .getCraftSlots()); }
/*    */         
/* 38 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 39 */           ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 40 */           _setstack.setCount(1);
/* 41 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CrystalBowUnloadedRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */