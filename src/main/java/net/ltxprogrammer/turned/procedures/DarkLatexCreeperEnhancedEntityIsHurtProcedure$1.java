/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.ExplosivegooEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
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
/*    */ class null
/*    */ {
/*    */   public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
/* 21 */     ExplosivegooEntity explosivegooEntity = new ExplosivegooEntity((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), level);
/* 22 */     explosivegooEntity.m_36781_(damage);
/* 23 */     explosivegooEntity.m_36735_(knockback);
/* 24 */     explosivegooEntity.m_20225_(true);
/* 25 */     explosivegooEntity.m_36767_(piercing);
/* 26 */     return (Projectile)explosivegooEntity;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperEnhancedEntityIsHurtProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */