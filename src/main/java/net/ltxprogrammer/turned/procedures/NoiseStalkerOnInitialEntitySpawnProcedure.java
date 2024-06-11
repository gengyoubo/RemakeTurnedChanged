/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class NoiseStalkerOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (Math.random() < 0.05D && 
/* 15 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.DL_AXE.get());
/* 17 */       _setstack.m_41764_(1);
/* 18 */       _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/* 19 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 20 */         _player.m_150109_().m_6596_(); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\NoiseStalkerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */