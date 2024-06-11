/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModParticleTypes;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class ExplosivegooWhileProjectileFlyingTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 11 */       _level.m_8767_((ParticleOptions)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x, y, z, 6, 1.0D, 1.0D, 1.0D, 0.1D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ExplosivegooWhileProjectileFlyingTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */