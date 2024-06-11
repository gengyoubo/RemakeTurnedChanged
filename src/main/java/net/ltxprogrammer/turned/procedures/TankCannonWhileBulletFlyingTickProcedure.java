/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TankCannonWhileBulletFlyingTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 10 */       _level.m_8767_((ParticleOptions)ParticleTypes.f_123765_, x, y, z, 5, 1.0D, 1.0D, 1.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TankCannonWhileBulletFlyingTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */