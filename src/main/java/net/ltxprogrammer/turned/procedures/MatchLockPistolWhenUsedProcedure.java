/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class MatchLockPistolWhenUsedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 15 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 22); }
/* 16 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       _level.m_8767_((ParticleOptions)ParticleTypes.f_123777_, x, y, z, 8, 0.5D, 0.5D, 0.5D, 0.25D); }
/* 18 */      if (itemstack.m_41784_().m_128459_("ammo") >= 1.0D)
/* 19 */       itemstack.m_41784_().m_128347_("ammo", itemstack.m_41784_().m_128459_("ammo") - 1.0D); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\MatchLockPistolWhenUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */