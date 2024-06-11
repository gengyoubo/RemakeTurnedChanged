/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TankCannonBulletHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     entity.setSecondsOnFire(10);
/* 13 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 14 */         _level.explode(null, x, y, z, 5.0F, Explosion.BlockInteraction.BREAK);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TankCannonBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */