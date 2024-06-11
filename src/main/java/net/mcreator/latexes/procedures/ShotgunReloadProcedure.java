/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class ShotgunReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.OVERUNDERSHOTGUN
/* 15 */       .get()) {
/* 16 */       LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0D) {
/* 17 */         LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
/* 18 */           .getDouble("ammo") > 1.0D) {
/* 19 */           Player player = (Player)entity; if (entity instanceof Player && player
/* 20 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */             
/* 22 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*    */               
/* 24 */               LivingEntity livingEntity3 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getItem(), 32); }
/* 25 */              for (int index0 = 0; index0 < 2; index0++) {
/* 26 */               LivingEntity livingEntity3 = (LivingEntity)entity;
/*    */               
/* 28 */               Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0D && entity instanceof Player && player1
/* 29 */                 .getInventory().contains(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */                 
/* 31 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/* 32 */                 livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity4.getMainHandItem() : ItemStack.EMPTY)
/* 33 */                     .getOrCreateTag().getDouble("ammo") + 1.0D);
/* 34 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/* 35 */                   ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get());
/* 36 */                   _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 37 */                       .getCraftSlots()); }
/*    */               
/*    */               } 
/*    */             } 
/*    */           }  return;
/*    */         } 
/* 43 */       }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*    */       
/* 45 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0D && entity instanceof Player && _playerHasItem
/* 46 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */         
/* 48 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 50 */           LivingEntity livingEntity = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getItem(), 48); }
/* 51 */          for (int index1 = 0; index1 < 2; index1++) {
/* 52 */           LivingEntity livingEntity = (LivingEntity)entity;
/*    */           
/* 54 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0D && entity instanceof Player && player
/* 55 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get()))) {
/*    */             
/* 57 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/* 58 */             livingEntity3 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY)
/* 59 */                 .getOrCreateTag().getDouble("ammo") + 1.0D);
/* 60 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 61 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.SHOTGUN_SHELL.get());
/* 62 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 63 */                   .getCraftSlots()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ShotgunReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */