/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class DartRifleReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARTRIFLE.get()) {
/* 15 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 16 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 5.0D && entity instanceof Player && _playerHasItem
/* 17 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.DART.get()))) {
/*    */         
/* 19 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 21 */           LivingEntity livingEntity1 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getItem(), 95); }
/* 22 */          for (int index0 = 0; index0 < 5; index0++) {
/* 23 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 25 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 5.0D && entity instanceof Player && player
/* 26 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.DART.get()))) {
/*    */             
/* 28 */             LivingEntity livingEntity2 = (LivingEntity)entity;
/* 29 */             livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY)
/* 30 */                 .getOrCreateTag().getDouble("ammo") + 1.0D);
/* 31 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 32 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DART.get());
/* 33 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 34 */                   .getCraftSlots()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DartRifleReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */