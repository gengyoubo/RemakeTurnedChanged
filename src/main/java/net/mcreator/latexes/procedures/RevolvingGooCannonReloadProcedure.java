/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class RevolvingGooCannonReloadProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.REVOLVING_GOO_CANNON
/* 15 */       .get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 3.0D && entity instanceof Player && _playerHasItem
/* 18 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()))) {
/*    */         
/* 20 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*    */           
/* 22 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/* 23 */           LivingEntity livingEntity2 = (LivingEntity)entity;
/* 24 */           _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getItem(), (int)(80.0D - ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") * 10.0D)); }
/* 25 */          for (int index0 = 0; index0 < 3; index0++) {
/* 26 */           LivingEntity livingEntity1 = (LivingEntity)entity;
/*    */           
/* 28 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 3.0D && entity instanceof Player && player
/* 29 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()))) {
/*    */             
/* 31 */             LivingEntity livingEntity2 = (LivingEntity)entity;
/* 32 */             livingEntity2 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY)
/* 33 */                 .getOrCreateTag().getDouble("ammo") + 1.0D);
/* 34 */             if (entity instanceof Player) { Player _player = (Player)entity;
/* 35 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/* 36 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 37 */                   .getCraftSlots()); }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\RevolvingGooCannonReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */