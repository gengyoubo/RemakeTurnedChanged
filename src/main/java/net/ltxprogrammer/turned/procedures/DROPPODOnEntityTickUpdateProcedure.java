/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
/*     */ import net.ltxprogrammer.turned.entity.EvilSniperEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCBerserkEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCHunterEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCOutsiderEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCOutsiderGunnerEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCdroneEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ 
/*     */ public class DROPPODOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  28 */     if (entity == null)
/*     */       return; 
/*  30 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  31 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  32 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  33 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  34 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  35 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  36 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  37 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  38 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  39 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  40 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  41 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50016_ || world
/*  42 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  43 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  44 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50016_) ? true : false) != true) {
/*  45 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/*  46 */           _level.m_46511_(null, x, y, z, 4.0F, Explosion.BlockInteraction.DESTROY);  }
/*  47 */        if (Math.random() < 0.2D) {
/*  48 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  49 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  50 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  51 */           tSCOutsiderEntity.m_5618_(0.0F);
/*  52 */           tSCOutsiderEntity.m_5616_(0.0F);
/*  53 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  54 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  56 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/*  58 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  59 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  60 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  61 */           tSCOutsiderEntity.m_5618_(0.0F);
/*  62 */           tSCOutsiderEntity.m_5616_(0.0F);
/*  63 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  64 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  66 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/*  68 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/*  70 */           tSCOutsiderGunnerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  71 */           tSCOutsiderGunnerEntity.m_5618_(0.0F);
/*  72 */           tSCOutsiderGunnerEntity.m_5616_(0.0F);
/*  73 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/*  74 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderGunnerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  76 */           world.m_7967_((Entity)tSCOutsiderGunnerEntity); }
/*     */       
/*  78 */       } else if (Math.random() < 0.15D) {
/*  79 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  80 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  81 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  82 */           tSCOutsiderEntity.m_5618_(0.0F);
/*  83 */           tSCOutsiderEntity.m_5616_(0.0F);
/*  84 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  85 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  87 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/*  89 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  90 */           EvilSniperEntity evilSniperEntity = new EvilSniperEntity((EntityType)LatexModEntities.EVIL_SNIPER.get(), (Level)_level);
/*  91 */           evilSniperEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  92 */           evilSniperEntity.m_5618_(0.0F);
/*  93 */           evilSniperEntity.m_5616_(0.0F);
/*  94 */           if (evilSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilSniperEntity;
/*  95 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilSniperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  97 */           world.m_7967_((Entity)evilSniperEntity); }
/*     */         
/*  99 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 100 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 101 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 102 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 103 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 104 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 105 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 107 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */       
/* 109 */       } else if (Math.random() < 0.15D) {
/* 110 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 111 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 112 */           tSCHunterEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 113 */           tSCHunterEntity.m_5618_(0.0F);
/* 114 */           tSCHunterEntity.m_5616_(0.0F);
/* 115 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 116 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCHunterEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 118 */           world.m_7967_((Entity)tSCHunterEntity); }
/*     */         
/* 120 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 121 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 122 */           tSCdroneEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 123 */           tSCdroneEntity.m_5618_(0.0F);
/* 124 */           tSCdroneEntity.m_5616_(0.0F);
/* 125 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 126 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCdroneEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 128 */           world.m_7967_((Entity)tSCdroneEntity); }
/*     */         
/* 130 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 131 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 132 */           tSCdroneEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 133 */           tSCdroneEntity.m_5618_(0.0F);
/* 134 */           tSCdroneEntity.m_5616_(0.0F);
/* 135 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 136 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCdroneEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 138 */           world.m_7967_((Entity)tSCdroneEntity); }
/*     */       
/* 140 */       } else if (Math.random() < 0.15D) {
/* 141 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 142 */           Evoker evoker = new Evoker(EntityType.f_20568_, (Level)_level);
/* 143 */           evoker.m_7678_(x, y, z, 0.0F, 0.0F);
/* 144 */           evoker.m_5618_(0.0F);
/* 145 */           evoker.m_5616_(0.0F);
/* 146 */           if (evoker instanceof Mob) { Mob _mobToSpawn = (Mob)evoker;
/* 147 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evoker.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 149 */           world.m_7967_((Entity)evoker); }
/*     */         
/* 151 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 152 */           Pillager pillager = new Pillager(EntityType.f_20513_, (Level)_level);
/* 153 */           pillager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 154 */           pillager.m_5618_(0.0F);
/* 155 */           pillager.m_5616_(0.0F);
/* 156 */           if (pillager instanceof Mob) { Mob _mobToSpawn = (Mob)pillager;
/* 157 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(pillager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 159 */           world.m_7967_((Entity)pillager); }
/*     */         
/* 161 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 162 */           Vindicator vindicator = new Vindicator(EntityType.f_20493_, (Level)_level);
/* 163 */           vindicator.m_7678_(x, y, z, 0.0F, 0.0F);
/* 164 */           vindicator.m_5618_(0.0F);
/* 165 */           vindicator.m_5616_(0.0F);
/* 166 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 167 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(vindicator.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 169 */           world.m_7967_((Entity)vindicator); }
/*     */         
/* 171 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 172 */           Vindicator vindicator = new Vindicator(EntityType.f_20493_, (Level)_level);
/* 173 */           vindicator.m_7678_(x, y, z, 0.0F, 0.0F);
/* 174 */           vindicator.m_5618_(0.0F);
/* 175 */           vindicator.m_5616_(0.0F);
/* 176 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 177 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(vindicator.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 179 */           world.m_7967_((Entity)vindicator); }
/*     */       
/* 181 */       } else if (Math.random() < 0.15D) {
/* 182 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 183 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 184 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 185 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 186 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 187 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 188 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 190 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 192 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 193 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 194 */           tSCHunterEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 195 */           tSCHunterEntity.m_5618_(0.0F);
/* 196 */           tSCHunterEntity.m_5616_(0.0F);
/* 197 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 198 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCHunterEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 200 */           world.m_7967_((Entity)tSCHunterEntity); }
/*     */         
/* 202 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 203 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/* 204 */           tSCOutsiderGunnerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 205 */           tSCOutsiderGunnerEntity.m_5618_(0.0F);
/* 206 */           tSCOutsiderGunnerEntity.m_5616_(0.0F);
/* 207 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/* 208 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderGunnerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 210 */           world.m_7967_((Entity)tSCOutsiderGunnerEntity); }
/*     */         
/* 212 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 213 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 214 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 215 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 216 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 217 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 218 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 220 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */       
/* 222 */       } else if (Math.random() < 0.15D) {
/* 223 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 224 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 225 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 226 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 227 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 228 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 229 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 231 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 233 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 234 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 235 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 236 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 237 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 238 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 239 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 241 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 243 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 244 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 245 */           evilMilitaryEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 246 */           evilMilitaryEntity.m_5618_(0.0F);
/* 247 */           evilMilitaryEntity.m_5616_(0.0F);
/* 248 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 249 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilMilitaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 251 */           world.m_7967_((Entity)evilMilitaryEntity); }
/*     */         
/* 253 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 254 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 255 */           evilMilitaryEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 256 */           evilMilitaryEntity.m_5618_(0.0F);
/* 257 */           evilMilitaryEntity.m_5616_(0.0F);
/* 258 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 259 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilMilitaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 261 */           world.m_7967_((Entity)evilMilitaryEntity); }
/*     */       
/* 263 */       } else if (Math.random() < 0.15D) {
/* 264 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 265 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 266 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 267 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 268 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 269 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 270 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 272 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 274 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 275 */           Vindicator vindicator = new Vindicator(EntityType.f_20493_, (Level)_level);
/* 276 */           vindicator.m_7678_(x, y, z, 0.0F, 0.0F);
/* 277 */           vindicator.m_5618_(0.0F);
/* 278 */           vindicator.m_5616_(0.0F);
/* 279 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 280 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(vindicator.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 282 */           world.m_7967_((Entity)vindicator); }
/*     */         
/* 284 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 285 */           Pillager pillager = new Pillager(EntityType.f_20513_, (Level)_level);
/* 286 */           pillager.m_7678_(x, y, z, 0.0F, 0.0F);
/* 287 */           pillager.m_5618_(0.0F);
/* 288 */           pillager.m_5616_(0.0F);
/* 289 */           if (pillager instanceof Mob) { Mob _mobToSpawn = (Mob)pillager;
/* 290 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(pillager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 292 */           world.m_7967_((Entity)pillager); }
/*     */         
/* 294 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 295 */           Vindicator vindicator = new Vindicator(EntityType.f_20493_, (Level)_level);
/* 296 */           vindicator.m_7678_(x, y, z, 0.0F, 0.0F);
/* 297 */           vindicator.m_5618_(0.0F);
/* 298 */           vindicator.m_5616_(0.0F);
/* 299 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 300 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(vindicator.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 302 */           world.m_7967_((Entity)vindicator); }
/*     */       
/* 304 */       } else if (Math.random() < 0.15D) {
/* 305 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 306 */           Evoker evoker = new Evoker(EntityType.f_20568_, (Level)_level);
/* 307 */           evoker.m_7678_(x, y, z, 0.0F, 0.0F);
/* 308 */           evoker.m_5618_(0.0F);
/* 309 */           evoker.m_5616_(0.0F);
/* 310 */           if (evoker instanceof Mob) { Mob _mobToSpawn = (Mob)evoker;
/* 311 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evoker.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 313 */           world.m_7967_((Entity)evoker); }
/*     */         
/* 315 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 316 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 317 */           evilMilitaryEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 318 */           evilMilitaryEntity.m_5618_(0.0F);
/* 319 */           evilMilitaryEntity.m_5616_(0.0F);
/* 320 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 321 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilMilitaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 323 */           world.m_7967_((Entity)evilMilitaryEntity); }
/*     */         
/* 325 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 326 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/* 327 */           tSCOutsiderGunnerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 328 */           tSCOutsiderGunnerEntity.m_5618_(0.0F);
/* 329 */           tSCOutsiderGunnerEntity.m_5616_(0.0F);
/* 330 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/* 331 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderGunnerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 333 */           world.m_7967_((Entity)tSCOutsiderGunnerEntity); }
/*     */       
/* 335 */       } else if (Math.random() < 0.3D) {
/* 336 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 337 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 338 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 339 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 340 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 341 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 342 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 344 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 346 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 347 */           TSCBerserkEntity tSCBerserkEntity = new TSCBerserkEntity((EntityType)LatexModEntities.TSC_BERSERK.get(), (Level)_level);
/* 348 */           tSCBerserkEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 349 */           tSCBerserkEntity.m_5618_(0.0F);
/* 350 */           tSCBerserkEntity.m_5616_(0.0F);
/* 351 */           if (tSCBerserkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCBerserkEntity;
/* 352 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCBerserkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 354 */           world.m_7967_((Entity)tSCBerserkEntity); }
/*     */         
/* 356 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 357 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 358 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 359 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 360 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 361 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 362 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 364 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */       
/* 366 */       } else if (Math.random() < 0.1D) {
/* 367 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 368 */           TSCBerserkEntity tSCBerserkEntity = new TSCBerserkEntity((EntityType)LatexModEntities.TSC_BERSERK.get(), (Level)_level);
/* 369 */           tSCBerserkEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 370 */           tSCBerserkEntity.m_5618_(0.0F);
/* 371 */           tSCBerserkEntity.m_5616_(0.0F);
/* 372 */           if (tSCBerserkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCBerserkEntity;
/* 373 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCBerserkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 375 */           world.m_7967_((Entity)tSCBerserkEntity); }
/*     */         
/* 377 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 378 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 379 */           tSCHunterEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 380 */           tSCHunterEntity.m_5618_(0.0F);
/* 381 */           tSCHunterEntity.m_5616_(0.0F);
/* 382 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 383 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCHunterEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 385 */           world.m_7967_((Entity)tSCHunterEntity); }
/*     */       
/*     */       } else {
/* 388 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 389 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 390 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 391 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 392 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 393 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 394 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 396 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */         
/* 398 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 399 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 400 */           tSCOutsiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 401 */           tSCOutsiderEntity.m_5618_(0.0F);
/* 402 */           tSCOutsiderEntity.m_5616_(0.0F);
/* 403 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 404 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCOutsiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 406 */           world.m_7967_((Entity)tSCOutsiderEntity); }
/*     */       
/*     */       } 
/* 409 */       if (!entity.f_19853_.m_5776_())
/* 410 */         entity.m_146870_(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DROPPODOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */