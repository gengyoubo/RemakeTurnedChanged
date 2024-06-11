/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.entity.DLbeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexDragonEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexMothEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnepEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*     */ import net.mcreator.latexes.entity.DlsharkEntity;
/*     */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*     */ import net.mcreator.latexes.entity.ScientistEntity;
/*     */ import net.mcreator.latexes.entity.YufengEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ 
/*     */ public class LatexDropPodOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  35 */     if (entity == null)
/*     */       return; 
/*  37 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  38 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  39 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  40 */       .getBlockState(new BlockPos(x, y - 2.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  41 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  42 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  43 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  44 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  45 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  46 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  47 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  48 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  49 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  50 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  51 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.AIR || world
/*  52 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  53 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  54 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.AIR) ? true : false) != true) {
/*  55 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/*  56 */           _level.explode(null, x, y, z, 3.0F, Explosion.BlockInteraction.DESTROY);  }
/*  57 */        if (Math.random() < 0.4D) {
/*  58 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  59 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  60 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  61 */           darklatexslugEntity.setYBodyRot(0.0F);
/*  62 */           darklatexslugEntity.setYHeadRot(0.0F);
/*  63 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  64 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  66 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/*  68 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  70 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  71 */           darklatexslugEntity.setYBodyRot(0.0F);
/*  72 */           darklatexslugEntity.setYHeadRot(0.0F);
/*  73 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  74 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  76 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/*  78 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  79 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  80 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  81 */           darklatexslugEntity.setYBodyRot(0.0F);
/*  82 */           darklatexslugEntity.setYHeadRot(0.0F);
/*  83 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  84 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  86 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/*  88 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  89 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  90 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  91 */           darklatexslugEntity.setYBodyRot(0.0F);
/*  92 */           darklatexslugEntity.setYHeadRot(0.0F);
/*  93 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  94 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  96 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/*  98 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  99 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 100 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 101 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 102 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 103 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 104 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 106 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 108 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 109 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 110 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 111 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 112 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 113 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 114 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 116 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 118 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 119 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 120 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 121 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 122 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 123 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 124 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 126 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 128 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 130 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 131 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 132 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 133 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 134 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 136 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */       
/* 138 */       } else if (Math.random() < 0.2D) {
/* 139 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 140 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 141 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 142 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 143 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 144 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 145 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 147 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 149 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 150 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 151 */           darkLatexFoxSniperEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 152 */           darkLatexFoxSniperEntity.setYBodyRot(0.0F);
/* 153 */           darkLatexFoxSniperEntity.setYHeadRot(0.0F);
/* 154 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 155 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxSniperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 157 */           world.addFreshEntity((Entity)darkLatexFoxSniperEntity); }
/*     */         
/* 159 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 161 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 162 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 163 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 164 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 165 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 167 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 169 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 170 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 171 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 172 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 173 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 174 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 175 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 177 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */       
/* 179 */       } else if (Math.random() < 0.2D) {
/* 180 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 181 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 182 */           dlsharkEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 183 */           dlsharkEntity.setYBodyRot(0.0F);
/* 184 */           dlsharkEntity.setYHeadRot(0.0F);
/* 185 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 186 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 188 */           world.addFreshEntity((Entity)dlsharkEntity); }
/*     */         
/* 190 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 191 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 192 */           dlsharkEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 193 */           dlsharkEntity.setYBodyRot(0.0F);
/* 194 */           dlsharkEntity.setYHeadRot(0.0F);
/* 195 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 196 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 198 */           world.addFreshEntity((Entity)dlsharkEntity); }
/*     */         
/* 200 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 201 */           DarkLatexMothEntity darkLatexMothEntity = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), (Level)_level);
/* 202 */           darkLatexMothEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 203 */           darkLatexMothEntity.setYBodyRot(0.0F);
/* 204 */           darkLatexMothEntity.setYHeadRot(0.0F);
/* 205 */           if (darkLatexMothEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexMothEntity;
/* 206 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexMothEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 208 */           world.addFreshEntity((Entity)darkLatexMothEntity); }
/*     */         
/* 210 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 211 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 212 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 213 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 214 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 215 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 216 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 218 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */       
/* 220 */       } else if (Math.random() < 0.2D) {
/* 221 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 222 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 223 */           darkLatexSnakeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 224 */           darkLatexSnakeEntity.setYBodyRot(0.0F);
/* 225 */           darkLatexSnakeEntity.setYHeadRot(0.0F);
/* 226 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 227 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 229 */           world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*     */         
/* 231 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 232 */           DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 233 */           darkLatexSnepEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 234 */           darkLatexSnepEntity.setYBodyRot(0.0F);
/* 235 */           darkLatexSnepEntity.setYHeadRot(0.0F);
/* 236 */           if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 237 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnepEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 239 */           world.addFreshEntity((Entity)darkLatexSnepEntity); }
/*     */         
/* 241 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 242 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 243 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 244 */           darklatexEntity.setYBodyRot(0.0F);
/* 245 */           darklatexEntity.setYHeadRot(0.0F);
/* 246 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 247 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 249 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */       
/* 251 */       } else if (Math.random() < 0.1D) {
/* 252 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 253 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 254 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 255 */           scientistEntity.setYBodyRot(0.0F);
/* 256 */           scientistEntity.setYHeadRot(0.0F);
/* 257 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 258 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 260 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 262 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 263 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 264 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 265 */           scientistEntity.setYBodyRot(0.0F);
/* 266 */           scientistEntity.setYHeadRot(0.0F);
/* 267 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 268 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 270 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 272 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 273 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 274 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 275 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 276 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 277 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 278 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 280 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 282 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 283 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 284 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 285 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 286 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 287 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 288 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 290 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 292 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 293 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 294 */           darkLatexFoxSniperEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 295 */           darkLatexFoxSniperEntity.setYBodyRot(0.0F);
/* 296 */           darkLatexFoxSniperEntity.setYHeadRot(0.0F);
/* 297 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 298 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxSniperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 300 */           world.addFreshEntity((Entity)darkLatexFoxSniperEntity); }
/*     */         
/* 302 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 303 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 304 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 305 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 306 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 307 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 308 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 310 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 312 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 313 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/* 314 */           darkLatexFoxScientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 315 */           darkLatexFoxScientistEntity.setYBodyRot(0.0F);
/* 316 */           darkLatexFoxScientistEntity.setYHeadRot(0.0F);
/* 317 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/* 318 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 320 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */         
/* 322 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 323 */           DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/* 324 */           darkLatexFoxSniperEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 325 */           darkLatexFoxSniperEntity.setYBodyRot(0.0F);
/* 326 */           darkLatexFoxSniperEntity.setYHeadRot(0.0F);
/* 327 */           if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/* 328 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxSniperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 330 */           world.addFreshEntity((Entity)darkLatexFoxSniperEntity); }
/*     */       
/* 332 */       } else if (Math.random() < 0.2D) {
/* 333 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 334 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 335 */           noiseStalkerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 336 */           noiseStalkerEntity.setYBodyRot(0.0F);
/* 337 */           noiseStalkerEntity.setYHeadRot(0.0F);
/* 338 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 339 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 341 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/* 343 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 344 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 345 */           noiseStalkerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 346 */           noiseStalkerEntity.setYBodyRot(0.0F);
/* 347 */           noiseStalkerEntity.setYHeadRot(0.0F);
/* 348 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 349 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 351 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/* 353 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 354 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 355 */           noiseStalkerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 356 */           noiseStalkerEntity.setYBodyRot(0.0F);
/* 357 */           noiseStalkerEntity.setYHeadRot(0.0F);
/* 358 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 359 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 361 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/* 363 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 364 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 365 */           noiseStalkerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 366 */           noiseStalkerEntity.setYBodyRot(0.0F);
/* 367 */           noiseStalkerEntity.setYHeadRot(0.0F);
/* 368 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 369 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 371 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */       
/* 373 */       } else if (Math.random() < 0.2D) {
/* 374 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 375 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 376 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 377 */           darklatexEntity.setYBodyRot(0.0F);
/* 378 */           darklatexEntity.setYHeadRot(0.0F);
/* 379 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 380 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 382 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 384 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 385 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 386 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 387 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 388 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 389 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 390 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 392 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 394 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 395 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 396 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 397 */           darklatexEntity.setYBodyRot(0.0F);
/* 398 */           darklatexEntity.setYHeadRot(0.0F);
/* 399 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 400 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 402 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 404 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 405 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 406 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 407 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 408 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 409 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 410 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 412 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 414 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 415 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 416 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 417 */           darklatexEntity.setYBodyRot(0.0F);
/* 418 */           darklatexEntity.setYHeadRot(0.0F);
/* 419 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 420 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 422 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */       
/* 424 */       } else if (Math.random() < 0.2D) {
/* 425 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 426 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 427 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 428 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 429 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 430 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 431 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 433 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */         
/* 435 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 436 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 437 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 438 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 439 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 440 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 441 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 443 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */         
/* 445 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 446 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 447 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 448 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 449 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 450 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 451 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 453 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */         
/* 455 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 456 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 457 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 458 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 459 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 460 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 461 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 463 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */       
/* 465 */       } else if (Math.random() < 0.1D) {
/* 466 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 467 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 468 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 469 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 470 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 471 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 472 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 474 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 476 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 477 */           DarkLatexDragonEntity darkLatexDragonEntity = new DarkLatexDragonEntity((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), (Level)_level);
/* 478 */           darkLatexDragonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 479 */           darkLatexDragonEntity.setYBodyRot(0.0F);
/* 480 */           darkLatexDragonEntity.setYHeadRot(0.0F);
/* 481 */           if (darkLatexDragonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexDragonEntity;
/* 482 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexDragonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 484 */           world.addFreshEntity((Entity)darkLatexDragonEntity); }
/*     */         
/* 486 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 487 */           YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/* 488 */           yufengEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 489 */           yufengEntity.setYBodyRot(0.0F);
/* 490 */           yufengEntity.setYHeadRot(0.0F);
/* 491 */           if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/* 492 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 494 */           world.addFreshEntity((Entity)yufengEntity); }
/*     */       
/* 496 */       } else if (Math.random() < 0.1D) {
/* 497 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 498 */           DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = new DarkLatexSpiderQueenEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), (Level)_level);
/* 499 */           darkLatexSpiderQueenEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 500 */           darkLatexSpiderQueenEntity.setYBodyRot(0.0F);
/* 501 */           darkLatexSpiderQueenEntity.setYHeadRot(0.0F);
/* 502 */           if (darkLatexSpiderQueenEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderQueenEntity;
/* 503 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderQueenEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 505 */           world.addFreshEntity((Entity)darkLatexSpiderQueenEntity); }
/*     */         
/* 507 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 508 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 509 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 510 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 511 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 512 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 513 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 515 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */         
/* 517 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 518 */           DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 519 */           darkLatexSpiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 520 */           darkLatexSpiderEntity.setYBodyRot(0.0F);
/* 521 */           darkLatexSpiderEntity.setYHeadRot(0.0F);
/* 522 */           if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 523 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 525 */           world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */       
/* 527 */       } else if (Math.random() < 0.1D) {
/* 528 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 529 */           DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = new DarkLatexQueenBeeEntity((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), (Level)_level);
/* 530 */           darkLatexQueenBeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 531 */           darkLatexQueenBeeEntity.setYBodyRot(0.0F);
/* 532 */           darkLatexQueenBeeEntity.setYHeadRot(0.0F);
/* 533 */           if (darkLatexQueenBeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexQueenBeeEntity;
/* 534 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexQueenBeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 536 */           world.addFreshEntity((Entity)darkLatexQueenBeeEntity); }
/*     */         
/* 538 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 539 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 540 */           dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 541 */           dLbeeEntity.setYBodyRot(0.0F);
/* 542 */           dLbeeEntity.setYHeadRot(0.0F);
/* 543 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 544 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 546 */           world.addFreshEntity((Entity)dLbeeEntity); }
/*     */         
/* 548 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 549 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 550 */           dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 551 */           dLbeeEntity.setYBodyRot(0.0F);
/* 552 */           dLbeeEntity.setYHeadRot(0.0F);
/* 553 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 554 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 556 */           world.addFreshEntity((Entity)dLbeeEntity); }
/*     */       
/* 558 */       } else if (Math.random() < 0.25D) {
/* 559 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 560 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 561 */           darkLatexSnakeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 562 */           darkLatexSnakeEntity.setYBodyRot(0.0F);
/* 563 */           darkLatexSnakeEntity.setYHeadRot(0.0F);
/* 564 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 565 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 567 */           world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*     */         
/* 569 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 570 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 571 */           noiseStalkerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 572 */           noiseStalkerEntity.setYBodyRot(0.0F);
/* 573 */           noiseStalkerEntity.setYHeadRot(0.0F);
/* 574 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 575 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 577 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/* 579 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 580 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 581 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 582 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 583 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 584 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 585 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 587 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 589 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 590 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 591 */           darkLatexSkeletonEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 592 */           darkLatexSkeletonEntity.setYBodyRot(0.0F);
/* 593 */           darkLatexSkeletonEntity.setYHeadRot(0.0F);
/* 594 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 595 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 597 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */       
/* 599 */       } else if (Math.random() < 0.25D) {
/* 600 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 601 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 602 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 603 */           darklatexEntity.setYBodyRot(0.0F);
/* 604 */           darklatexEntity.setYHeadRot(0.0F);
/* 605 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 606 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 608 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 610 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 611 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 612 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 613 */           darklatexEntity.setYBodyRot(0.0F);
/* 614 */           darklatexEntity.setYHeadRot(0.0F);
/* 615 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 616 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 618 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 620 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 621 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 622 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 623 */           darklatexEntity.setYBodyRot(0.0F);
/* 624 */           darklatexEntity.setYHeadRot(0.0F);
/* 625 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 626 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 628 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 630 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 631 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 632 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 633 */           darklatexEntity.setYBodyRot(0.0F);
/* 634 */           darklatexEntity.setYHeadRot(0.0F);
/* 635 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 636 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 638 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 640 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 641 */           DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/* 642 */           darkLatexFoxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 643 */           darkLatexFoxEntity.setYBodyRot(0.0F);
/* 644 */           darkLatexFoxEntity.setYHeadRot(0.0F);
/* 645 */           if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/* 646 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 648 */           world.addFreshEntity((Entity)darkLatexFoxEntity); }
/*     */         
/* 650 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 651 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 652 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 653 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 654 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 655 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 656 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 658 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 660 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 661 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 662 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 663 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 664 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 665 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 666 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 668 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 670 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 671 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 672 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 673 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 674 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 675 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 676 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 678 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/* 680 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 681 */           DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 682 */           darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 683 */           darklatexslugEntity.setYBodyRot(0.0F);
/* 684 */           darklatexslugEntity.setYHeadRot(0.0F);
/* 685 */           if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 686 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 688 */           world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */       
/*     */       } else {
/* 691 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 692 */           YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/* 693 */           yufengEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 694 */           yufengEntity.setYBodyRot(0.0F);
/* 695 */           yufengEntity.setYHeadRot(0.0F);
/* 696 */           if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/* 697 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 699 */           world.addFreshEntity((Entity)yufengEntity); }
/*     */         
/* 701 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 702 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 703 */           darklatexEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 704 */           darklatexEntity.setYBodyRot(0.0F);
/* 705 */           darklatexEntity.setYHeadRot(0.0F);
/* 706 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 707 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 709 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */       
/*     */       } 
/* 712 */       if (!entity.level.isClientSide())
/* 713 */         entity.discard(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexDropPodOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */