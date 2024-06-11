/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TankCannonWhileBulletFlyingTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 10 */       _level.sendParticles((ParticleOptions)ParticleTypes.SQUID_INK, x, y, z, 5, 1.0D, 1.0D, 1.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TankCannonWhileBulletFlyingTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */