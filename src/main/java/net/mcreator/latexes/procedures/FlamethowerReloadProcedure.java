/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class FlamethowerReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.FLAMETHOWER.get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */       Player _playerHasItem = (Player)entity;
/* 18 */       Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 100.0D && ((entity instanceof Player && _playerHasItem.getInventory().contains(new ItemStack((ItemLike)Items.COAL))) || (entity instanceof Player && player1
/* 19 */         .getInventory().contains(new ItemStack((ItemLike)Items.CHARCOAL))))) {
/*    */         
/* 21 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 23 */           LivingEntity livingEntity1 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getItem(), 125); }
/* 24 */          for (int index0 = 0; index0 < 30; index0++) {
/* 25 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 27 */           Player player2 = (Player)entity;
/* 28 */           Player player3 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 100.0D && ((entity instanceof Player && player2.getInventory().contains(new ItemStack((ItemLike)Items.COAL))) || (entity instanceof Player && player3
/* 29 */             .getInventory().contains(new ItemStack((ItemLike)Items.CHARCOAL))))) {
/*    */             
/* 31 */             Player player = (Player)entity; if (entity instanceof Player && player
/* 32 */               .getInventory().contains(new ItemStack((ItemLike)Items.COAL)))
/*    */             
/* 34 */             { LivingEntity livingEntity2 = (LivingEntity)entity;
/* 35 */               livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY)
/* 36 */                   .getOrCreateTag().getDouble("ammo") + 10.0D);
/* 37 */               if (entity instanceof Player) { Player _player = (Player)entity;
/* 38 */                 ItemStack _stktoremove = new ItemStack((ItemLike)Items.COAL);
/* 39 */                 _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 40 */                     .getCraftSlots()); }
/*    */                }
/* 42 */             else { Player player4 = (Player)entity; if (entity instanceof Player && player4
/* 43 */                 .getInventory().contains(new ItemStack((ItemLike)Items.CHARCOAL))) {
/*    */                 
/* 45 */                 LivingEntity livingEntity2 = (LivingEntity)entity;
/* 46 */                 livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY)
/* 47 */                     .getOrCreateTag().getDouble("ammo") + 8.0D);
/* 48 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/* 49 */                   ItemStack _stktoremove = new ItemStack((ItemLike)Items.CHARCOAL);
/* 50 */                   _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 51 */                       .getCraftSlots()); }
/*    */               
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\FlamethowerReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */