/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class ScientistOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.01D) {
/*    */       
/* 17 */       Entity _entity = entity;
/* 18 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 19 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get()));
/* 20 */         _player.getInventory().setChanged(); }
/* 21 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 22 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RESPIRATOR_HELMET.get())); }
/*    */     
/*    */     } 
/*    */     
/* 26 */     if (Math.random() < 0.001D) {
/*    */       
/* 28 */       Entity _entity = entity;
/* 29 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 30 */         (_player.getInventory()).armor.set(0, new ItemStack((ItemLike)LatexModItems.HAZMAT_HELMET.get()));
/* 31 */         _player.getInventory().setChanged(); }
/* 32 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 33 */         _living.setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike)LatexModItems.HAZMAT_HELMET.get())); }
/*    */ 
/*    */ 
/*    */       
/* 37 */       _entity = entity;
/* 38 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 39 */         (_player.getInventory()).armor.set(1, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get()));
/* 40 */         _player.getInventory().setChanged(); }
/* 41 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 42 */         _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get())); }
/*    */ 
/*    */ 
/*    */       
/* 46 */       _entity = entity;
/* 47 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 48 */         (_player.getInventory()).armor.set(2, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get()));
/* 49 */         _player.getInventory().setChanged(); }
/* 50 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 51 */         _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get())); }
/*    */ 
/*    */ 
/*    */       
/* 55 */       _entity = entity;
/* 56 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 57 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get()));
/* 58 */         _player.getInventory().setChanged(); }
/* 59 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 60 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get())); }
/*    */ 
/*    */     
/* 63 */     } else if (Math.random() < 0.001D) {
/*    */       
/* 65 */       Entity _entity = entity;
/* 66 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 67 */         (_player.getInventory()).armor.set(1, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get()));
/* 68 */         _player.getInventory().setChanged(); }
/* 69 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 70 */         _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack((ItemLike)LatexModItems.HAZMAT_CHESTPLATE.get())); }
/*    */ 
/*    */ 
/*    */       
/* 74 */       _entity = entity;
/* 75 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 76 */         (_player.getInventory()).armor.set(2, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get()));
/* 77 */         _player.getInventory().setChanged(); }
/* 78 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 79 */         _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.HAZMAT_LEGGINGS.get())); }
/*    */ 
/*    */ 
/*    */       
/* 83 */       _entity = entity;
/* 84 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 85 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get()));
/* 86 */         _player.getInventory().setChanged(); }
/* 87 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 88 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.HAZMAT_BOOTS.get())); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ScientistOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */