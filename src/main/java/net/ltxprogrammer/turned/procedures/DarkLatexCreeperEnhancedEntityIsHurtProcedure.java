/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.ExplosivegooEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.projectile.Projectile;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class DarkLatexCreeperEnhancedEntityIsHurtProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (Math.random() < 0.01D) {
/*    */       
/* 16 */       Entity _shootFrom = entity;
/* 17 */       Level projectileLevel = _shootFrom.f_19853_;
/* 18 */       if (!projectileLevel.m_5776_()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 28 */         Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, float damage, int knockback, byte piercing) { ExplosivegooEntity explosivegooEntity = new ExplosivegooEntity((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), level); explosivegooEntity.m_36781_(damage); explosivegooEntity.m_36735_(knockback); explosivegooEntity.m_20225_(true); explosivegooEntity.m_36767_(piercing); return (Projectile)explosivegooEntity; } }).getArrow(projectileLevel, 2.0F, 2, (byte)4);
/* 29 */         _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 30 */         _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 8.0F);
/* 31 */         projectileLevel.m_7967_((Entity)_entityToSpawn);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperEnhancedEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */