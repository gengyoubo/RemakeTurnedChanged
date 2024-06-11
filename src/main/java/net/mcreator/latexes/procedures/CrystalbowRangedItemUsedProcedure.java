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
/*    */ public class CrystalbowRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 18 */       _player.getCooldowns().addCooldown(itemstack.getItem(), 25); }
/* 19 */      LivingEntity _entGetArmor = (LivingEntity)entity;
/*    */     
/* 21 */     Player _playerHasItem = (Player)entity; if (((((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && entity instanceof Player && _playerHasItem
/* 22 */       .getInventory().contains(new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get()))) ? true : false) != true) {
/*    */       
/* 24 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 25 */         _player.getCooldowns().addCooldown(itemstack.getItem(), 25); }
/* 26 */        if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 28 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 29 */             .getCraftSlots()); }
/*    */       
/* 31 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 32 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 33 */         _setstack.setCount(1);
/* 34 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CrystalbowRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */