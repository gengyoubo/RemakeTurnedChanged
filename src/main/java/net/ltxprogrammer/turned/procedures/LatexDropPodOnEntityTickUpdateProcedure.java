/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxSniperEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*     */ import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ 
/*     */ public class LatexDropPodOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  21 */     if (entity == null)
/*     */       return; 
/*  23 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  24 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  25 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  26 */       .m_8055_(new BlockPos(x, y - 2.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  27 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  28 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  29 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  30 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  31 */       .m_8055_(new BlockPos(x + 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  32 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50627_ || world
/*  33 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/*  34 */       .m_8055_(new BlockPos(x - 1.0D, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/*  35 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  36 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  37 */       .m_8055_(new BlockPos(x, y - 1.0D, z + 1.0D)).m_60734_() == Blocks.f_50016_ || world
/*  38 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50627_ || world
/*  39 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50626_ || world
/*  40 */       .m_8055_(new BlockPos(x, y - 1.0D, z - 1.0D)).m_60734_() == Blocks.f_50016_) ? true : false) != true) {
/*  41 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/*  42 */           _level.m_46511_(null, x, y, z, 3.0F, Explosion.BlockInteraction.DESTROY);  }
/*  43 */        if (Math.random() < 0.4D) {
/*  44 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  45 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  46 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  47 */           darklatexslugEntity.m_5618_(0.0F);
/*  48 */           darklatexslugEntity.m_5616_(0.0F);
/*  49 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  50 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  52 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/*  54 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  55 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  56 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  57 */           darklatexslugEntity.m_5618_(0.0F);
/*  58 */           darklatexslugEntity.m_5616_(0.0F);
/*  59 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  60 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  62 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/*  64 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  65 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  66 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  67 */           darklatexslugEntity.m_5618_(0.0F);
/*  68 */           darklatexslugEntity.m_5616_(0.0F);
/*  69 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  70 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  72 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/*  74 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  75 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  76 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  77 */           darklatexslugEntity.m_5618_(0.0F);
/*  78 */           darklatexslugEntity.m_5616_(0.0F);
/*  79 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  80 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  82 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/*  84 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  85 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  86 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  87 */           darklatexslugEntity.m_5618_(0.0F);
/*  88 */           darklatexslugEntity.m_5616_(0.0F);
/*  89 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  90 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  92 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/*  94 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  95 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  96 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/*  97 */           darklatexslugEntity.m_5618_(0.0F);
/*  98 */           darklatexslugEntity.m_5616_(0.0F);
/*  99 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 100 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 102 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/* 104 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 105 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 106 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 107 */           darklatexslugEntity.m_5618_(0.0F);
/* 108 */           darklatexslugEntity.m_5616_(0.0F);
/* 109 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 110 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 112 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/* 114 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 115 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 116 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 117 */           darklatexslugEntity.m_5618_(0.0F);
/* 118 */           darklatexslugEntity.m_5616_(0.0F);
/* 119 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 120 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 122 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */       
/* 124 */       } else if (Math.random() < 0.2D) {
/* 125 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 126 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 127 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 128 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 129 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 130 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 131 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 133 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 135 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 136 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 137 */           darkLatexFoxSniperEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 138 */           darkLatexFoxSniperEntity.m_5618_(0.0F);
/* 139 */           darkLatexFoxSniperEntity.m_5616_(0.0F);
/* 140 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 141 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxSniperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 143 */           world.m_7967_((Entity)darkLatexFoxSniperEntity); }
/*     */         
/* 145 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 146 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 147 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 148 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 149 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 150 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 151 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 153 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 155 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 156 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 157 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 158 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 159 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 160 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 161 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 163 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */       
/* 165 */       } else if (Math.random() < 0.2D) {
/* 166 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 167 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 168 */           dlsharkEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 169 */           dlsharkEntity.m_5618_(0.0F);
/* 170 */           dlsharkEntity.m_5616_(0.0F);
/* 171 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 172 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dlsharkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 174 */           world.m_7967_((Entity)dlsharkEntity); }
/*     */         
/* 176 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 177 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 178 */           dlsharkEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 179 */           dlsharkEntity.m_5618_(0.0F);
/* 180 */           dlsharkEntity.m_5616_(0.0F);
/* 181 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 182 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dlsharkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 184 */           world.m_7967_((Entity)dlsharkEntity); }
/*     */         
/* 186 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 187 */           DarkLatexMothEntity darkLatexMothEntity = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), (Level)_level);
/* 188 */           darkLatexMothEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 189 */           darkLatexMothEntity.m_5618_(0.0F);
/* 190 */           darkLatexMothEntity.m_5616_(0.0F);
/* 191 */           if (darkLatexMothEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexMothEntity;
/* 192 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexMothEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 194 */           world.m_7967_((Entity)darkLatexMothEntity); }
/*     */         
/* 196 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 197 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 198 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 199 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 200 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 201 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 202 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 204 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */       
/* 206 */       } else if (Math.random() < 0.2D) {
/* 207 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 208 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 209 */           darkLatexSnakeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 210 */           darkLatexSnakeEntity.m_5618_(0.0F);
/* 211 */           darkLatexSnakeEntity.m_5616_(0.0F);
/* 212 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 213 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnakeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 215 */           world.m_7967_((Entity)darkLatexSnakeEntity); }
/*     */         
/* 217 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 218 */           DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 219 */           darkLatexSnepEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 220 */           darkLatexSnepEntity.m_5618_(0.0F);
/* 221 */           darkLatexSnepEntity.m_5616_(0.0F);
/* 222 */           if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 223 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnepEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 225 */           world.m_7967_((Entity)darkLatexSnepEntity); }
/*     */         
/* 227 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 228 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 229 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 230 */           darklatexEntity.m_5618_(0.0F);
/* 231 */           darklatexEntity.m_5616_(0.0F);
/* 232 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 233 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 235 */           world.m_7967_((Entity)darklatexEntity); }
/*     */       
/* 237 */       } else if (Math.random() < 0.1D) {
/* 238 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 239 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 240 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 241 */           scientistEntity.m_5618_(0.0F);
/* 242 */           scientistEntity.m_5616_(0.0F);
/* 243 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 244 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 246 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 248 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 249 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 250 */           scientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 251 */           scientistEntity.m_5618_(0.0F);
/* 252 */           scientistEntity.m_5616_(0.0F);
/* 253 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 254 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 256 */           world.m_7967_((Entity)scientistEntity); }
/*     */         
/* 258 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 259 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 260 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 261 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 262 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 263 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 264 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 266 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 268 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 269 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 270 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 271 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 272 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 273 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 274 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 276 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 278 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 279 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 280 */           darkLatexFoxSniperEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 281 */           darkLatexFoxSniperEntity.m_5618_(0.0F);
/* 282 */           darkLatexFoxSniperEntity.m_5616_(0.0F);
/* 283 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 284 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxSniperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 286 */           world.m_7967_((Entity)darkLatexFoxSniperEntity); }
/*     */         
/* 288 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 289 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 290 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 291 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 292 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 293 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 294 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 296 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 298 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 299 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 300 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 301 */           darkLatexFoxScientistEntity.m_5618_(0.0F);
/* 302 */           darkLatexFoxScientistEntity.m_5616_(0.0F);
/* 303 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 304 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 306 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 308 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 309 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 310 */           darkLatexFoxSniperEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 311 */           darkLatexFoxSniperEntity.m_5618_(0.0F);
/* 312 */           darkLatexFoxSniperEntity.m_5616_(0.0F);
/* 313 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 314 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxSniperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 316 */           world.m_7967_((Entity)darkLatexFoxSniperEntity); }
/*     */       
/* 318 */       } else if (Math.random() < 0.2D) {
/* 319 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 320 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 321 */           noiseStalkerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 322 */           noiseStalkerEntity.m_5618_(0.0F);
/* 323 */           noiseStalkerEntity.m_5616_(0.0F);
/* 324 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 325 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 327 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */         
/* 329 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 330 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 331 */           noiseStalkerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 332 */           noiseStalkerEntity.m_5618_(0.0F);
/* 333 */           noiseStalkerEntity.m_5616_(0.0F);
/* 334 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 335 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 337 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */         
/* 339 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 340 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 341 */           noiseStalkerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 342 */           noiseStalkerEntity.m_5618_(0.0F);
/* 343 */           noiseStalkerEntity.m_5616_(0.0F);
/* 344 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 345 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 347 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */         
/* 349 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 350 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 351 */           noiseStalkerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 352 */           noiseStalkerEntity.m_5618_(0.0F);
/* 353 */           noiseStalkerEntity.m_5616_(0.0F);
/* 354 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 355 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 357 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */       
/* 359 */       } else if (Math.random() < 0.2D) {
/* 360 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 361 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 362 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 363 */           darklatexEntity.m_5618_(0.0F);
/* 364 */           darklatexEntity.m_5616_(0.0F);
/* 365 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 366 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 368 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 370 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 371 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 372 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 373 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 374 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 375 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 376 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 378 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 380 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 381 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 382 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 383 */           darklatexEntity.m_5618_(0.0F);
/* 384 */           darklatexEntity.m_5616_(0.0F);
/* 385 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 386 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 388 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 390 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 391 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 392 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 393 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 394 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 395 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 396 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 398 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 400 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 401 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 402 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 403 */           darklatexEntity.m_5618_(0.0F);
/* 404 */           darklatexEntity.m_5616_(0.0F);
/* 405 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 406 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 408 */           world.m_7967_((Entity)darklatexEntity); }
/*     */       
/* 410 */       } else if (Math.random() < 0.2D) {
/* 411 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 412 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 413 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 414 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 415 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 416 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 417 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 419 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */         
/* 421 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 422 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 423 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 424 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 425 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 426 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 427 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 429 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */         
/* 431 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 432 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 433 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 434 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 435 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 436 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 437 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 439 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */         
/* 441 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 442 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 443 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 444 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 445 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 446 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 447 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 449 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */       
/* 451 */       } else if (Math.random() < 0.1D) {
/* 452 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 453 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 454 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 455 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 456 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 457 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 458 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 460 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 462 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 463 */           DarkLatexDragon darkLatexDragon = new DarkLatexDragon((EntityType)ChangedEntities.DARK_LATEX_DRAGON.get(), (Level)_level);
/* 464 */           darkLatexDragon.m_7678_(x, y, z, 0.0F, 0.0F);
/* 465 */           darkLatexDragon.m_5618_(0.0F);
/* 466 */           darkLatexDragon.m_5616_(0.0F);
/* 467 */           if (darkLatexDragon instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexDragon;
/* 468 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexDragon.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 470 */           world.m_7967_((Entity)darkLatexDragon); }
/*     */         
/* 472 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 473 */           DarkLatexYufeng darkLatexYufeng = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), (Level)_level);
/* 474 */           darkLatexYufeng.m_7678_(x, y, z, 0.0F, 0.0F);
/* 475 */           darkLatexYufeng.m_5618_(0.0F);
/* 476 */           darkLatexYufeng.m_5616_(0.0F);
/* 477 */           if (darkLatexYufeng instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexYufeng;
/* 478 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexYufeng.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 480 */           world.m_7967_((Entity)darkLatexYufeng); }
/*     */       
/* 482 */       } else if (Math.random() < 0.1D) {
/* 483 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 484 */           DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = new DarkLatexSpiderQueenEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), (Level)_level);
/* 485 */           darkLatexSpiderQueenEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 486 */           darkLatexSpiderQueenEntity.m_5618_(0.0F);
/* 487 */           darkLatexSpiderQueenEntity.m_5616_(0.0F);
/* 488 */           if (darkLatexSpiderQueenEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderQueenEntity;
/* 489 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderQueenEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 491 */           world.m_7967_((Entity)darkLatexSpiderQueenEntity); }
/*     */         
/* 493 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 494 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 495 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 496 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 497 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 498 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 499 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 501 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */         
/* 503 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 504 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 505 */           darkLatexSpiderEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 506 */           darkLatexSpiderEntity.m_5618_(0.0F);
/* 507 */           darkLatexSpiderEntity.m_5616_(0.0F);
/* 508 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 509 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 511 */           world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */       
/* 513 */       } else if (Math.random() < 0.1D) {
/* 514 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 515 */           DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = new DarkLatexQueenBeeEntity((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), (Level)_level);
/* 516 */           darkLatexQueenBeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 517 */           darkLatexQueenBeeEntity.m_5618_(0.0F);
/* 518 */           darkLatexQueenBeeEntity.m_5616_(0.0F);
/* 519 */           if (darkLatexQueenBeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexQueenBeeEntity;
/* 520 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexQueenBeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 522 */           world.m_7967_((Entity)darkLatexQueenBeeEntity); }
/*     */         
/* 524 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 525 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 526 */           dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 527 */           dLbeeEntity.m_5618_(0.0F);
/* 528 */           dLbeeEntity.m_5616_(0.0F);
/* 529 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 530 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 532 */           world.m_7967_((Entity)dLbeeEntity); }
/*     */         
/* 534 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 535 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 536 */           dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 537 */           dLbeeEntity.m_5618_(0.0F);
/* 538 */           dLbeeEntity.m_5616_(0.0F);
/* 539 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 540 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 542 */           world.m_7967_((Entity)dLbeeEntity); }
/*     */       
/* 544 */       } else if (Math.random() < 0.25D) {
/* 545 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 546 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 547 */           darkLatexSnakeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 548 */           darkLatexSnakeEntity.m_5618_(0.0F);
/* 549 */           darkLatexSnakeEntity.m_5616_(0.0F);
/* 550 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 551 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnakeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 553 */           world.m_7967_((Entity)darkLatexSnakeEntity); }
/*     */         
/* 555 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 556 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 557 */           noiseStalkerEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 558 */           noiseStalkerEntity.m_5618_(0.0F);
/* 559 */           noiseStalkerEntity.m_5616_(0.0F);
/* 560 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 561 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 563 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */         
/* 565 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 566 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 567 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 568 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 569 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 570 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 571 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 573 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 575 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 576 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 577 */           darkLatexSkeletonEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 578 */           darkLatexSkeletonEntity.m_5618_(0.0F);
/* 579 */           darkLatexSkeletonEntity.m_5616_(0.0F);
/* 580 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 581 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSkeletonEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 583 */           world.m_7967_((Entity)darkLatexSkeletonEntity); }
/*     */       
/* 585 */       } else if (Math.random() < 0.25D) {
/* 586 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 587 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 588 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 589 */           darklatexEntity.m_5618_(0.0F);
/* 590 */           darklatexEntity.m_5616_(0.0F);
/* 591 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 592 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 594 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 596 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 597 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 598 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 599 */           darklatexEntity.m_5618_(0.0F);
/* 600 */           darklatexEntity.m_5616_(0.0F);
/* 601 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 602 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 604 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 606 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 607 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 608 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 609 */           darklatexEntity.m_5618_(0.0F);
/* 610 */           darklatexEntity.m_5616_(0.0F);
/* 611 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 612 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 614 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 616 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 617 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 618 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 619 */           darklatexEntity.m_5618_(0.0F);
/* 620 */           darklatexEntity.m_5616_(0.0F);
/* 621 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 622 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 624 */           world.m_7967_((Entity)darklatexEntity); }
/*     */         
/* 626 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 627 */           DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/* 628 */           darkLatexFoxEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 629 */           darkLatexFoxEntity.m_5618_(0.0F);
/* 630 */           darkLatexFoxEntity.m_5616_(0.0F);
/* 631 */           if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/* 632 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 634 */           world.m_7967_((Entity)darkLatexFoxEntity); }
/*     */         
/* 636 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 637 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 638 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 639 */           darklatexslugEntity.m_5618_(0.0F);
/* 640 */           darklatexslugEntity.m_5616_(0.0F);
/* 641 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 642 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 644 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/* 646 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 647 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 648 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 649 */           darklatexslugEntity.m_5618_(0.0F);
/* 650 */           darklatexslugEntity.m_5616_(0.0F);
/* 651 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 652 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 654 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/* 656 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 657 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 658 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 659 */           darklatexslugEntity.m_5618_(0.0F);
/* 660 */           darklatexslugEntity.m_5616_(0.0F);
/* 661 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 662 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 664 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */         
/* 666 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 667 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 668 */           darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 669 */           darklatexslugEntity.m_5618_(0.0F);
/* 670 */           darklatexslugEntity.m_5616_(0.0F);
/* 671 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 672 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 674 */           world.m_7967_((Entity)darklatexslugEntity); }
/*     */       
/*     */       } else {
/* 677 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 678 */           DarkLatexYufeng darkLatexYufeng = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), (Level)_level);
/* 679 */           darkLatexYufeng.m_7678_(x, y, z, 0.0F, 0.0F);
/* 680 */           darkLatexYufeng.m_5618_(0.0F);
/* 681 */           darkLatexYufeng.m_5616_(0.0F);
/* 682 */           if (darkLatexYufeng instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexYufeng;
/* 683 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexYufeng.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 685 */           world.m_7967_((Entity)darkLatexYufeng); }
/*     */         
/* 687 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 688 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 689 */           darklatexEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 690 */           darklatexEntity.m_5618_(0.0F);
/* 691 */           darklatexEntity.m_5616_(0.0F);
/* 692 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 693 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 695 */           world.m_7967_((Entity)darklatexEntity); }
/*     */       
/*     */       } 
/* 698 */       if (!entity.f_19853_.m_5776_())
/* 699 */         entity.m_146870_(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexDropPodOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */