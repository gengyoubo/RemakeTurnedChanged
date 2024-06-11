/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.OverundershotgunEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.projectile.Projectile;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class OverundershotgunRangedItemUsedProcedure {
/*     */   public static void execute(Entity entity, ItemStack itemstack) {
/*  13 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  16 */     Entity _shootFrom = entity;
/*  17 */     Level projectileLevel = _shootFrom.f_19853_;
/*  18 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  28 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  29 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  30 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/*  31 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  35 */     _shootFrom = entity;
/*  36 */     projectileLevel = _shootFrom.f_19853_;
/*  37 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  47 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  48 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  49 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/*  50 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  54 */     _shootFrom = entity;
/*  55 */     projectileLevel = _shootFrom.f_19853_;
/*  56 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  66 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  67 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  68 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/*  69 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  73 */     _shootFrom = entity;
/*  74 */     projectileLevel = _shootFrom.f_19853_;
/*  75 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/*  86 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  87 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/*  88 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  92 */     _shootFrom = entity;
/*  93 */     projectileLevel = _shootFrom.f_19853_;
/*  94 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 104 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 105 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 106 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/* 107 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 111 */     _shootFrom = entity;
/* 112 */     projectileLevel = _shootFrom.f_19853_;
/* 113 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 124 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 125 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/* 126 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 130 */     _shootFrom = entity;
/* 131 */     projectileLevel = _shootFrom.f_19853_;
/* 132 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 142 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { OverundershotgunEntity overundershotgunEntity = new OverundershotgunEntity((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), level); overundershotgunEntity.m_5602_(shooter); overundershotgunEntity.m_36781_(damage); overundershotgunEntity.m_36735_(knockback); overundershotgunEntity.m_20225_(true); return (Projectile)overundershotgunEntity; } }).getArrow(projectileLevel, entity, 3.0F, 2);
/* 143 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 144 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 2.0F);
/* 145 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */     
/* 148 */     if (itemstack.m_41784_().m_128459_("ammo") >= 1.0D)
/* 149 */       itemstack.m_41784_().m_128347_("ammo", itemstack.m_41784_().m_128459_("ammo") - 1.0D); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\OverundershotgunRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */