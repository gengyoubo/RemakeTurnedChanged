/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.OverundershotgunEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.projectile.Projectile;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/*    */   public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
/* 40 */     OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level);
/* 41 */     overundershotgunEntity.m_5602_(shooter);
/* 42 */     overundershotgunEntity.m_36781_(damage);
/* 43 */     overundershotgunEntity.m_36735_(knockback);
/* 44 */     overundershotgunEntity.m_20225_(true);
/* 45 */     return (Projectile)overundershotgunEntity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\OverundershotgunRangedItemUsedProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */