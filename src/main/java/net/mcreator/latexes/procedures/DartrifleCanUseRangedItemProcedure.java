/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class DartrifleCanUseRangedItemProcedure {
/*    */   public static boolean execute(Entity entity, ItemStack itemstack) {
/* 14 */     if (entity == null)
/* 15 */       return false; 
/* 16 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEXDART.get()) {
/* 17 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 18 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get());
/* 19 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 20 */             .getCraftSlots()); }
/*    */       
/* 22 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 23 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.LATEX_DART_RIFLE.get());
/* 24 */         _setstack.setCount(1);
/* 25 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/* 28 */     return (itemstack.getOrCreateTag().getDouble("ammo") > 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DartrifleCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */