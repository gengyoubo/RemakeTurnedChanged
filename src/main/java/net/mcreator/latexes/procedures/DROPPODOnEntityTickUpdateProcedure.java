/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.EvilMilitaryEntity;
/*     */ import net.mcreator.latexes.entity.EvilSniperEntity;
/*     */ import net.mcreator.latexes.entity.TSCBerserkEntity;
/*     */ import net.mcreator.latexes.entity.TSCHunterEntity;
/*     */ import net.mcreator.latexes.entity.TSCOutsiderEntity;
/*     */ import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
/*     */ import net.mcreator.latexes.entity.TSCdroneEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
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
/*  30 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  31 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  32 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  33 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  34 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  35 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  36 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  37 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  38 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  39 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  40 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  41 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.AIR || world
/*  42 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  43 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  44 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.AIR) ? true : false) != true) {
/*  45 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/*  46 */           _level.explode(null, x, y, z, 4.0F, Explosion.BlockInteraction.DESTROY);  }
/*  47 */        if (Math.random() < 0.2D) {
/*  48 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  49 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  50 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  51 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/*  52 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/*  53 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  54 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  56 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/*  58 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  59 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  60 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  61 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/*  62 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/*  63 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  64 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  66 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/*  68 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/*  70 */           tSCOutsiderGunnerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  71 */           tSCOutsiderGunnerEntity.setYBodyRot(0.0F);
/*  72 */           tSCOutsiderGunnerEntity.setYHeadRot(0.0F);
/*  73 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/*  74 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderGunnerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  76 */           world.addFreshEntity((Entity)tSCOutsiderGunnerEntity); }
/*     */       
/*  78 */       } else if (Math.random() < 0.15D) {
/*  79 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  80 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/*  81 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  82 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/*  83 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/*  84 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/*  85 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  87 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/*  89 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  90 */           EvilSniperEntity evilSniperEntity = new EvilSniperEntity((EntityType)LatexModEntities.EVIL_SNIPER.get(), (Level)_level);
/*  91 */           evilSniperEntity.moveTo(x, y, z, 0.0F, 0.0F);
/*  92 */           evilSniperEntity.setYBodyRot(0.0F);
/*  93 */           evilSniperEntity.setYHeadRot(0.0F);
/*  94 */           if (evilSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilSniperEntity;
/*  95 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilSniperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  97 */           world.addFreshEntity((Entity)evilSniperEntity); }
/*     */         
/*  99 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 100 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 101 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 102 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 103 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 104 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 105 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 107 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */       
/* 109 */       } else if (Math.random() < 0.15D) {
/* 110 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 111 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 112 */           tSCHunterEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 113 */           tSCHunterEntity.setYBodyRot(0.0F);
/* 114 */           tSCHunterEntity.setYHeadRot(0.0F);
/* 115 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 116 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCHunterEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 118 */           world.addFreshEntity((Entity)tSCHunterEntity); }
/*     */         
/* 120 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 121 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 122 */           tSCdroneEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 123 */           tSCdroneEntity.setYBodyRot(0.0F);
/* 124 */           tSCdroneEntity.setYHeadRot(0.0F);
/* 125 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 126 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCdroneEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 128 */           world.addFreshEntity((Entity)tSCdroneEntity); }
/*     */         
/* 130 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 131 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 132 */           tSCdroneEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 133 */           tSCdroneEntity.setYBodyRot(0.0F);
/* 134 */           tSCdroneEntity.setYHeadRot(0.0F);
/* 135 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 136 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCdroneEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 138 */           world.addFreshEntity((Entity)tSCdroneEntity); }
/*     */       
/* 140 */       } else if (Math.random() < 0.15D) {
/* 141 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 142 */           Evoker evoker = new Evoker(EntityType.EVOKER, (Level)_level);
/* 143 */           evoker.moveTo(x, y, z, 0.0F, 0.0F);
/* 144 */           evoker.setYBodyRot(0.0F);
/* 145 */           evoker.setYHeadRot(0.0F);
/* 146 */           if (evoker instanceof Mob) { Mob _mobToSpawn = (Mob)evoker;
/* 147 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evoker.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 149 */           world.addFreshEntity((Entity)evoker); }
/*     */         
/* 151 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 152 */           Pillager pillager = new Pillager(EntityType.PILLAGER, (Level)_level);
/* 153 */           pillager.moveTo(x, y, z, 0.0F, 0.0F);
/* 154 */           pillager.setYBodyRot(0.0F);
/* 155 */           pillager.setYHeadRot(0.0F);
/* 156 */           if (pillager instanceof Mob) { Mob _mobToSpawn = (Mob)pillager;
/* 157 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(pillager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 159 */           world.addFreshEntity((Entity)pillager); }
/*     */         
/* 161 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 162 */           Vindicator vindicator = new Vindicator(EntityType.VINDICATOR, (Level)_level);
/* 163 */           vindicator.moveTo(x, y, z, 0.0F, 0.0F);
/* 164 */           vindicator.setYBodyRot(0.0F);
/* 165 */           vindicator.setYHeadRot(0.0F);
/* 166 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 167 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(vindicator.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 169 */           world.addFreshEntity((Entity)vindicator); }
/*     */         
/* 171 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 172 */           Vindicator vindicator = new Vindicator(EntityType.VINDICATOR, (Level)_level);
/* 173 */           vindicator.moveTo(x, y, z, 0.0F, 0.0F);
/* 174 */           vindicator.setYBodyRot(0.0F);
/* 175 */           vindicator.setYHeadRot(0.0F);
/* 176 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 177 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(vindicator.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 179 */           world.addFreshEntity((Entity)vindicator); }
/*     */       
/* 181 */       } else if (Math.random() < 0.15D) {
/* 182 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 183 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 184 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 185 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 186 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 187 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 188 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 190 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 192 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 193 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 194 */           tSCHunterEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 195 */           tSCHunterEntity.setYBodyRot(0.0F);
/* 196 */           tSCHunterEntity.setYHeadRot(0.0F);
/* 197 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 198 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCHunterEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 200 */           world.addFreshEntity((Entity)tSCHunterEntity); }
/*     */         
/* 202 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 203 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/* 204 */           tSCOutsiderGunnerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 205 */           tSCOutsiderGunnerEntity.setYBodyRot(0.0F);
/* 206 */           tSCOutsiderGunnerEntity.setYHeadRot(0.0F);
/* 207 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/* 208 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderGunnerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 210 */           world.addFreshEntity((Entity)tSCOutsiderGunnerEntity); }
/*     */         
/* 212 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 213 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 214 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 215 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 216 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 217 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 218 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 220 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */       
/* 222 */       } else if (Math.random() < 0.15D) {
/* 223 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 224 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 225 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 226 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 227 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 228 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 229 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 231 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 233 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 234 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 235 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 236 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 237 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 238 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 239 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 241 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 243 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 244 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 245 */           evilMilitaryEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 246 */           evilMilitaryEntity.setYBodyRot(0.0F);
/* 247 */           evilMilitaryEntity.setYHeadRot(0.0F);
/* 248 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 249 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilMilitaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 251 */           world.addFreshEntity((Entity)evilMilitaryEntity); }
/*     */         
/* 253 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 254 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 255 */           evilMilitaryEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 256 */           evilMilitaryEntity.setYBodyRot(0.0F);
/* 257 */           evilMilitaryEntity.setYHeadRot(0.0F);
/* 258 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 259 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilMilitaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 261 */           world.addFreshEntity((Entity)evilMilitaryEntity); }
/*     */       
/* 263 */       } else if (Math.random() < 0.15D) {
/* 264 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 265 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 266 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 267 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 268 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 269 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 270 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 272 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 274 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 275 */           Vindicator vindicator = new Vindicator(EntityType.VINDICATOR, (Level)_level);
/* 276 */           vindicator.moveTo(x, y, z, 0.0F, 0.0F);
/* 277 */           vindicator.setYBodyRot(0.0F);
/* 278 */           vindicator.setYHeadRot(0.0F);
/* 279 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 280 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(vindicator.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 282 */           world.addFreshEntity((Entity)vindicator); }
/*     */         
/* 284 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 285 */           Pillager pillager = new Pillager(EntityType.PILLAGER, (Level)_level);
/* 286 */           pillager.moveTo(x, y, z, 0.0F, 0.0F);
/* 287 */           pillager.setYBodyRot(0.0F);
/* 288 */           pillager.setYHeadRot(0.0F);
/* 289 */           if (pillager instanceof Mob) { Mob _mobToSpawn = (Mob)pillager;
/* 290 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(pillager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 292 */           world.addFreshEntity((Entity)pillager); }
/*     */         
/* 294 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 295 */           Vindicator vindicator = new Vindicator(EntityType.VINDICATOR, (Level)_level);
/* 296 */           vindicator.moveTo(x, y, z, 0.0F, 0.0F);
/* 297 */           vindicator.setYBodyRot(0.0F);
/* 298 */           vindicator.setYHeadRot(0.0F);
/* 299 */           if (vindicator instanceof Mob) { Mob _mobToSpawn = (Mob)vindicator;
/* 300 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(vindicator.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 302 */           world.addFreshEntity((Entity)vindicator); }
/*     */       
/* 304 */       } else if (Math.random() < 0.15D) {
/* 305 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 306 */           Evoker evoker = new Evoker(EntityType.EVOKER, (Level)_level);
/* 307 */           evoker.moveTo(x, y, z, 0.0F, 0.0F);
/* 308 */           evoker.setYBodyRot(0.0F);
/* 309 */           evoker.setYHeadRot(0.0F);
/* 310 */           if (evoker instanceof Mob) { Mob _mobToSpawn = (Mob)evoker;
/* 311 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evoker.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 313 */           world.addFreshEntity((Entity)evoker); }
/*     */         
/* 315 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 316 */           EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 317 */           evilMilitaryEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 318 */           evilMilitaryEntity.setYBodyRot(0.0F);
/* 319 */           evilMilitaryEntity.setYHeadRot(0.0F);
/* 320 */           if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 321 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilMilitaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 323 */           world.addFreshEntity((Entity)evilMilitaryEntity); }
/*     */         
/* 325 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 326 */           TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = new TSCOutsiderGunnerEntity((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), (Level)_level);
/* 327 */           tSCOutsiderGunnerEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 328 */           tSCOutsiderGunnerEntity.setYBodyRot(0.0F);
/* 329 */           tSCOutsiderGunnerEntity.setYHeadRot(0.0F);
/* 330 */           if (tSCOutsiderGunnerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderGunnerEntity;
/* 331 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderGunnerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 333 */           world.addFreshEntity((Entity)tSCOutsiderGunnerEntity); }
/*     */       
/* 335 */       } else if (Math.random() < 0.3D) {
/* 336 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 337 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 338 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 339 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 340 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 341 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 342 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 344 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 346 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 347 */           TSCBerserkEntity tSCBerserkEntity = new TSCBerserkEntity((EntityType)LatexModEntities.TSC_BERSERK.get(), (Level)_level);
/* 348 */           tSCBerserkEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 349 */           tSCBerserkEntity.setYBodyRot(0.0F);
/* 350 */           tSCBerserkEntity.setYHeadRot(0.0F);
/* 351 */           if (tSCBerserkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCBerserkEntity;
/* 352 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCBerserkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 354 */           world.addFreshEntity((Entity)tSCBerserkEntity); }
/*     */         
/* 356 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 357 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 358 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 359 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 360 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 361 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 362 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 364 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */       
/* 366 */       } else if (Math.random() < 0.1D) {
/* 367 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 368 */           TSCBerserkEntity tSCBerserkEntity = new TSCBerserkEntity((EntityType)LatexModEntities.TSC_BERSERK.get(), (Level)_level);
/* 369 */           tSCBerserkEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 370 */           tSCBerserkEntity.setYBodyRot(0.0F);
/* 371 */           tSCBerserkEntity.setYHeadRot(0.0F);
/* 372 */           if (tSCBerserkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCBerserkEntity;
/* 373 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCBerserkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 375 */           world.addFreshEntity((Entity)tSCBerserkEntity); }
/*     */         
/* 377 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 378 */           TSCHunterEntity tSCHunterEntity = new TSCHunterEntity((EntityType)LatexModEntities.TSC_HUNTER.get(), (Level)_level);
/* 379 */           tSCHunterEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 380 */           tSCHunterEntity.setYBodyRot(0.0F);
/* 381 */           tSCHunterEntity.setYHeadRot(0.0F);
/* 382 */           if (tSCHunterEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCHunterEntity;
/* 383 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCHunterEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 385 */           world.addFreshEntity((Entity)tSCHunterEntity); }
/*     */       
/*     */       } else {
/* 388 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 389 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 390 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 391 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 392 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 393 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 394 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 396 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */         
/* 398 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 399 */           TSCOutsiderEntity tSCOutsiderEntity = new TSCOutsiderEntity((EntityType)LatexModEntities.TSC_OUTSIDER.get(), (Level)_level);
/* 400 */           tSCOutsiderEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 401 */           tSCOutsiderEntity.setYBodyRot(0.0F);
/* 402 */           tSCOutsiderEntity.setYHeadRot(0.0F);
/* 403 */           if (tSCOutsiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCOutsiderEntity;
/* 404 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCOutsiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 406 */           world.addFreshEntity((Entity)tSCOutsiderEntity); }
/*     */       
/*     */       } 
/* 409 */       if (!entity.level.isClientSide())
/* 410 */         entity.discard(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DROPPODOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */