/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class MatchlockPistolReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCHLOCK_PISTOL
/* 15 */       .get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 1.0D && entity instanceof Player && _playerHasItem
/* 18 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get()))) {
/*    */         
/* 20 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 22 */           LivingEntity livingEntity2 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getItem(), 124); }
/* 23 */          LivingEntity livingEntity1 = (LivingEntity)entity;
/* 24 */         livingEntity1 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0D);
/*    */         
/* 26 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get());
/* 28 */           _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 29 */               .getCraftSlots()); }
/*    */       
/*    */       } 
/*    */     } else {
/* 33 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCHLOCK_PISTOL
/* 34 */         .get()) {
/* 35 */         LivingEntity livingEntity1 = (LivingEntity)entity;
/* 36 */         Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 1.0D && entity instanceof Player && _playerHasItem
/* 37 */           .getInventory().contains(new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get()))) {
/*    */           
/* 39 */           if (entity instanceof Player) { Player _player = (Player)entity;
/*    */             
/* 41 */             LivingEntity livingEntity3 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity3.getOffhandItem() : ItemStack.EMPTY).getItem(), 124); }
/* 42 */            LivingEntity livingEntity2 = (LivingEntity)entity;
/* 43 */           livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity2.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0D);
/*    */           
/* 45 */           if (entity instanceof Player) { Player _player = (Player)entity;
/* 46 */             ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.MUSKETBALL.get());
/* 47 */             _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 48 */                 .getCraftSlots()); }
/*    */         
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\MatchlockPistolReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */