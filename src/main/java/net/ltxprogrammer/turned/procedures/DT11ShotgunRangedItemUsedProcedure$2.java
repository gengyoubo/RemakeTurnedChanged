/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.CrystalbowEntity;
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
/*    */ 
/*    */ class null
/*    */ {
/*    */   public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
/* 41 */     CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
/* 42 */     crystalbowEntity.m_5602_(shooter);
/* 43 */     crystalbowEntity.m_36781_(damage);
/* 44 */     crystalbowEntity.m_36735_(knockback);
/* 45 */     crystalbowEntity.m_20225_(true);
/* 46 */     return (Projectile)crystalbowEntity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DT11ShotgunRangedItemUsedProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */