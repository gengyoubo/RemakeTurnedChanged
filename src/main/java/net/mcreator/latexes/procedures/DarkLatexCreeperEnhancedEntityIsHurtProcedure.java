/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.entity.ExplosivegooEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.projectile.Projectile;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class DarkLatexCreeperEnhancedEntityIsHurtProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.01D) {
/*    */       
/* 17 */       Entity _shootFrom = entity;
/* 18 */       Level projectileLevel = _shootFrom.level;
/* 19 */       if (!projectileLevel.isClientSide()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 29 */         Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, float damage, int knockback, byte piercing) { ExplosivegooEntity explosivegooEntity = new ExplosivegooEntity((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), level); explosivegooEntity.setBaseDamage(damage); explosivegooEntity.setKnockback(knockback); explosivegooEntity.setSilent(true); explosivegooEntity.setPierceLevel(piercing); return (Projectile)explosivegooEntity; } }).getArrow(projectileLevel, 2.0F, 2, (byte)4);
/* 30 */         _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 31 */         _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 8.0F);
/* 32 */         projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCreeperEnhancedEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */