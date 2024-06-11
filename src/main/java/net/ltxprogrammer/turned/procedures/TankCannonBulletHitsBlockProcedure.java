/*    */ package net.ltxprogrammer.turned.procedures;
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
/* 12 */     entity.m_20254_(10);
/* 13 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 14 */         _level.m_46511_(null, x, y, z, 5.0F, Explosion.BlockInteraction.BREAK);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TankCannonBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */