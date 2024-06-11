/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.CrystalbowEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.projectile.Projectile;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class DT11ShotgunRangedItemUsedProcedure
/*     */ {
/*     */   public static void execute(Entity entity, ItemStack itemstack) {
/*  15 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  18 */     Entity _shootFrom = entity;
/*  19 */     Level projectileLevel = _shootFrom.level;
/*  20 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  30 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  31 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  32 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/*  33 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  37 */     _shootFrom = entity;
/*  38 */     projectileLevel = _shootFrom.level;
/*  39 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  49 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  50 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  51 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/*  52 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  56 */     _shootFrom = entity;
/*  57 */     projectileLevel = _shootFrom.level;
/*  58 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  68 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  69 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  70 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/*  71 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  75 */     _shootFrom = entity;
/*  76 */     projectileLevel = _shootFrom.level;
/*  77 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  87 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  88 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/*  89 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/*  90 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  94 */     _shootFrom = entity;
/*  95 */     projectileLevel = _shootFrom.level;
/*  96 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 107 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 108 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/* 109 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 113 */     _shootFrom = entity;
/* 114 */     projectileLevel = _shootFrom.level;
/* 115 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 126 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 127 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/* 128 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 132 */     _shootFrom = entity;
/* 133 */     projectileLevel = _shootFrom.level;
/* 134 */     if (!projectileLevel.isClientSide()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.setOwner(shooter); crystalbowEntity.setBaseDamage(damage); crystalbowEntity.setKnockback(knockback); crystalbowEntity.setSilent(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 145 */       _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1D, _shootFrom.getZ());
/* 146 */       _entityToSpawn.shoot((_shootFrom.getLookAngle()).x, (_shootFrom.getLookAngle()).y, (_shootFrom.getLookAngle()).z, 1.0F, 0.0F);
/* 147 */       projectileLevel.addFreshEntity((Entity)_entityToSpawn);
/*     */     } 
/*     */     
/* 150 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 151 */       _player.getCooldowns().addCooldown(itemstack.getItem(), 18); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DT11ShotgunRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */