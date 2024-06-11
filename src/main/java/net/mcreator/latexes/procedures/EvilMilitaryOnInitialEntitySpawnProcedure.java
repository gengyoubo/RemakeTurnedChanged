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
/*    */ public class EvilMilitaryOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.05D) {
/*    */       
/* 17 */       Entity _entity = entity;
/* 18 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 19 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)LatexModItems.EVIL_BERET_HELMET.get()));
/* 20 */         _player.getInventory().setChanged(); }
/* 21 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/* 22 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.EVIL_BERET_HELMET.get())); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\EvilMilitaryOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */