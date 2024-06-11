/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.CrystalbowEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.projectile.Projectile;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class DT11ShotgunRangedItemUsedProcedure {
/*     */   public static void execute(Entity entity, ItemStack itemstack) {
/*  14 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  17 */     Entity _shootFrom = entity;
/*  18 */     Level projectileLevel = _shootFrom.f_19853_;
/*  19 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  29 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  30 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  31 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/*  32 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  36 */     _shootFrom = entity;
/*  37 */     projectileLevel = _shootFrom.f_19853_;
/*  38 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  48 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  49 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  50 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/*  51 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  55 */     _shootFrom = entity;
/*  56 */     projectileLevel = _shootFrom.f_19853_;
/*  57 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  67 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  68 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  69 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/*  70 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  74 */     _shootFrom = entity;
/*  75 */     projectileLevel = _shootFrom.f_19853_;
/*  76 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  86 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/*  87 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/*  88 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/*  89 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/*  93 */     _shootFrom = entity;
/*  94 */     projectileLevel = _shootFrom.f_19853_;
/*  95 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 106 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 107 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/* 108 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 112 */     _shootFrom = entity;
/* 113 */     projectileLevel = _shootFrom.f_19853_;
/* 114 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 124 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 125 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 126 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/* 127 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */ 
/*     */     
/* 131 */     _shootFrom = entity;
/* 132 */     projectileLevel = _shootFrom.f_19853_;
/* 133 */     if (!projectileLevel.m_5776_()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 143 */       Projectile _entityToSpawn = (new Object() { public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) { CrystalbowEntity crystalbowEntity = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level); crystalbowEntity.m_5602_(shooter); crystalbowEntity.m_36781_(damage); crystalbowEntity.m_36735_(knockback); crystalbowEntity.m_20225_(true); return (Projectile)crystalbowEntity; } }).getArrow(projectileLevel, entity, 4.0F, 1);
/* 144 */       _entityToSpawn.m_6034_(_shootFrom.m_20185_(), _shootFrom.m_20188_() - 0.1D, _shootFrom.m_20189_());
/* 145 */       _entityToSpawn.m_6686_((_shootFrom.m_20154_()).f_82479_, (_shootFrom.m_20154_()).f_82480_, (_shootFrom.m_20154_()).f_82481_, 1.0F, 0.0F);
/* 146 */       projectileLevel.m_7967_((Entity)_entityToSpawn);
/*     */     } 
/*     */     
/* 149 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 150 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 18); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DT11ShotgunRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */