/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class ScrapM16RifleRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 12 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 6); }
/* 13 */      if (itemstack.m_41784_().m_128459_("ammo") >= 1.0D)
/* 14 */       itemstack.m_41784_().m_128347_("ammo", itemstack.m_41784_().m_128459_("ammo") - 1.0D); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ScrapM16RifleRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */