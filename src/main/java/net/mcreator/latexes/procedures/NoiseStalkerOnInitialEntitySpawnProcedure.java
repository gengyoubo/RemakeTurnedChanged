/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class NoiseStalkerOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.05D && 
/* 16 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.DL_AXE.get());
/* 18 */       _setstack.setCount(1);
/* 19 */       _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/* 20 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 21 */         _player.getInventory().setChanged(); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\NoiseStalkerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */