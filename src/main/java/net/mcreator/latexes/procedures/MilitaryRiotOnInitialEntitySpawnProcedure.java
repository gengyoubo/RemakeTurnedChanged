/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class MilitaryRiotOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (Math.random() < 0.2D && 
/* 15 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */       ItemStack _setstack = new ItemStack((ItemLike)Items.SHIELD);
/* 17 */       _setstack.setCount(1);
/* 18 */       _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
/* 19 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 20 */         _player.getInventory().setChanged(); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\MilitaryRiotOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */