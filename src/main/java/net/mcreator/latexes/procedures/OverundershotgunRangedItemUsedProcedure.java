/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.OverundershotgunEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.projectile.Projectile;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class OverundershotgunRangedItemUsedProcedure
/*     */ {
/*     */   public static void execute(Entity entity, ItemStack itemstack) {
/*  14 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  17 */     Entity _shootFrom = entity;
/*  18 */     Level projectileLevel = _shootFrom.level;
/*  19 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  29 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  30 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  31 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/*  32 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  36 */     _shootFrom = entity;
/*  37 */     projectileLevel = _shootFrom.level;
/*  38 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  48 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  49 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  50 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/*  51 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  55 */     _shootFrom = entity;
/*  56 */     projectileLevel = _shootFrom.level;
/*  57 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  67 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  68 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  69 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/*  70 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  74 */     _shootFrom = entity;
/*  75 */     projectileLevel = _shootFrom.level;
/*  76 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  86 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  87 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  88 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/*  89 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  93 */     _shootFrom = entity;
/*  94 */     projectileLevel = _shootFrom.level;
/*  95 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 106 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 107 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/* 108 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 112 */     _shootFrom = entity;
/* 113 */     projectileLevel = _shootFrom.level;
/* 114 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 124 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 125 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 126 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/* 127 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 131 */     _shootFrom = entity;
/* 132 */     projectileLevel = _shootFrom.level;
/* 133 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 143 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.setOwner(shooter); overundershotgunEntity.setBaseDamage(damage); overundershotgunEntity.setKnockback(knockback); overundershotgunEntity.setSilent(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 144 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 145 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 2.0F);
/* 146 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */     
/* 149 */     if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0D)
/* 150 */       itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0D); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\OverundershotgunRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */