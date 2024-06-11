/*   */ package net.mcreator.latexes.procedures;
/*   */ import net.minecraft.core.particles.ParticleOptions;
/*   */ import net.minecraft.core.particles.ParticleTypes;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ 
/*   */ public class TSCPistolWhileBulletFlyingTickProcedure {
/*   */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 8 */     world.addParticle((ParticleOptions)ParticleTypes.WITCH, x, y, z, 1.0D, 1.0D, 1.0D);
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCPistolWhileBulletFlyingTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */