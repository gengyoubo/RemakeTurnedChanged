/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class SneppleRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 12 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 20); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SneppleRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */