/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.entity.AHVHertxEntity;
/*     */ import net.mcreator.latexes.entity.AshburyHertxEntity;
/*     */ import net.mcreator.latexes.entity.BeeHertxEntity;
/*     */ import net.mcreator.latexes.entity.HertxEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarFBEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarFEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarSolEntity;
/*     */ import net.mcreator.latexes.entity.MilitaryEntity;
/*     */ import net.mcreator.latexes.entity.NXTHertxEntity;
/*     */ import net.mcreator.latexes.entity.ScientistEntity;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class AllydroppodOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  35 */     if (entity == null)
/*     */       return; 
/*  37 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  38 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  39 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  40 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  41 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  42 */       .getBlockState(new BlockPos(x + 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  43 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  44 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  45 */       .getBlockState(new BlockPos(x - 1.0D, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  46 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  47 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  48 */       .getBlockState(new BlockPos(x, y - 1.0D, z + 1.0D)).getBlock() == Blocks.AIR || world
/*  49 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  50 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.VOID_AIR || world
/*  51 */       .getBlockState(new BlockPos(x, y - 1.0D, z - 1.0D)).getBlock() == Blocks.AIR) ? true : false) != true) {
/*  52 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  53 */         _level.sendParticles((ParticleOptions)ParticleTypes.SPLASH, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/*  54 */        if (world instanceof Level) { Level _level = (Level)world;
/*  55 */         if (!_level.isClientSide()) {
/*  56 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  57 */               .getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0F, 1.0F);
/*     */         } else {
/*  59 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.BLOCKS, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  63 */       if (Math.random() < 0.7D)
/*  64 */       { world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.SUPPLY_CRATE.get()).defaultBlockState(), 3); }
/*     */       
/*  66 */       else if (Math.random() < 0.2D)
/*  67 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  68 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/*  69 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/*  70 */           villager.setYBodyRot(0.0F);
/*  71 */           villager.setYHeadRot(0.0F);
/*  72 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/*  73 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  75 */           world.addFreshEntity((Entity)villager); }
/*     */         
/*  77 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  78 */           IronGolem ironGolem = new IronGolem(EntityType.IRON_GOLEM, (Level)_level);
/*  79 */           ironGolem.moveTo(x, y, z, 0.0F, 0.0F);
/*  80 */           ironGolem.setYBodyRot(0.0F);
/*  81 */           ironGolem.setYHeadRot(0.0F);
/*  82 */           if (ironGolem instanceof Mob) { Mob _mobToSpawn = (Mob)ironGolem;
/*  83 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(ironGolem.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  85 */           world.addFreshEntity((Entity)ironGolem); }
/*     */         
/*  87 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  88 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/*  89 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/*  90 */           villager.setYBodyRot(0.0F);
/*  91 */           villager.setYHeadRot(0.0F);
/*  92 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/*  93 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  95 */           world.addFreshEntity((Entity)villager); }
/*     */         
/*  97 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  98 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/*  99 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 100 */           villager.setYBodyRot(0.0F);
/* 101 */           villager.setYHeadRot(0.0F);
/* 102 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 103 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 105 */           world.addFreshEntity((Entity)villager); }
/*     */          }
/* 107 */       else if (Math.random() < 0.2D)
/* 108 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 109 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 110 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 111 */           villager.setYBodyRot(0.0F);
/* 112 */           villager.setYHeadRot(0.0F);
/* 113 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 114 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 116 */           world.addFreshEntity((Entity)villager); }
/*     */         
/* 118 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 119 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 120 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 121 */           villager.setYBodyRot(0.0F);
/* 122 */           villager.setYHeadRot(0.0F);
/* 123 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 124 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 126 */           world.addFreshEntity((Entity)villager); }
/*     */         
/* 128 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 129 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 130 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 131 */           villager.setYBodyRot(0.0F);
/* 132 */           villager.setYHeadRot(0.0F);
/* 133 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 134 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 136 */           world.addFreshEntity((Entity)villager); }
/*     */         
/* 138 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 139 */           MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 140 */           militaryEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 141 */           militaryEntity.setYBodyRot(0.0F);
/* 142 */           militaryEntity.setYHeadRot(0.0F);
/* 143 */           if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 144 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(militaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 146 */           world.addFreshEntity((Entity)militaryEntity); }
/*     */          }
/* 148 */       else if (Math.random() < 0.2D)
/* 149 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 150 */           MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 151 */           militaryEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 152 */           militaryEntity.setYBodyRot(0.0F);
/* 153 */           militaryEntity.setYHeadRot(0.0F);
/* 154 */           if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 155 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(militaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 157 */           world.addFreshEntity((Entity)militaryEntity); }
/*     */         
/* 159 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 161 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 162 */           scientistEntity.setYBodyRot(0.0F);
/* 163 */           scientistEntity.setYHeadRot(0.0F);
/* 164 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 165 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 167 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 169 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 170 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 171 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 172 */           scientistEntity.setYBodyRot(0.0F);
/* 173 */           scientistEntity.setYHeadRot(0.0F);
/* 174 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 175 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 177 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */          }
/* 179 */       else if (Math.random() < 0.2D)
/* 180 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 181 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 182 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 183 */           scientistEntity.setYBodyRot(0.0F);
/* 184 */           scientistEntity.setYHeadRot(0.0F);
/* 185 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 186 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 188 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 190 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 191 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 192 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 193 */           scientistEntity.setYBodyRot(0.0F);
/* 194 */           scientistEntity.setYHeadRot(0.0F);
/* 195 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 196 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 198 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 200 */         if (Math.random() < 0.05D)
/* 201 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 202 */             AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/* 203 */             aHVHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 204 */             aHVHertxEntity.setYBodyRot(0.0F);
/* 205 */             aHVHertxEntity.setYHeadRot(0.0F);
/* 206 */             if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/* 207 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(aHVHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 209 */             world.addFreshEntity((Entity)aHVHertxEntity); }
/*     */            }
/* 211 */         else if (Math.random() < 0.05D)
/* 212 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 213 */             NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/* 214 */             nXTHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 215 */             nXTHertxEntity.setYBodyRot(0.0F);
/* 216 */             nXTHertxEntity.setYHeadRot(0.0F);
/* 217 */             if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/* 218 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(nXTHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 220 */             world.addFreshEntity((Entity)nXTHertxEntity); }
/*     */            }
/* 222 */         else if (Math.random() < 0.05D)
/* 223 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 224 */             AshburyHertxEntity ashburyHertxEntity = new AshburyHertxEntity((EntityType)LatexModEntities.ASHBURY_HERTX.get(), (Level)_level);
/* 225 */             ashburyHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 226 */             ashburyHertxEntity.setYBodyRot(0.0F);
/* 227 */             ashburyHertxEntity.setYHeadRot(0.0F);
/* 228 */             if (ashburyHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)ashburyHertxEntity;
/* 229 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(ashburyHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 231 */             world.addFreshEntity((Entity)ashburyHertxEntity); }
/*     */            }
/* 233 */         else if (Math.random() < 0.075D)
/* 234 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 235 */             BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 236 */             beeHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 237 */             beeHertxEntity.setYBodyRot(0.0F);
/* 238 */             beeHertxEntity.setYHeadRot(0.0F);
/* 239 */             if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 240 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(beeHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 242 */             world.addFreshEntity((Entity)beeHertxEntity); }
/*     */            }
/* 244 */         else if (Math.random() < 0.1D)
/* 245 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 246 */             HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/* 247 */             hertxvarFEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 248 */             hertxvarFEntity.setYBodyRot(0.0F);
/* 249 */             hertxvarFEntity.setYHeadRot(0.0F);
/* 250 */             if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/* 251 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 253 */             world.addFreshEntity((Entity)hertxvarFEntity); }
/*     */            }
/* 255 */         else if (Math.random() < 0.1D)
/* 256 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 257 */             HertxvarFBEntity hertxvarFBEntity = new HertxvarFBEntity((EntityType)LatexModEntities.HERTXVAR_FB.get(), (Level)_level);
/* 258 */             hertxvarFBEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 259 */             hertxvarFBEntity.setYBodyRot(0.0F);
/* 260 */             hertxvarFBEntity.setYHeadRot(0.0F);
/* 261 */             if (hertxvarFBEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFBEntity;
/* 262 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFBEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 264 */             world.addFreshEntity((Entity)hertxvarFBEntity); }
/*     */            }
/* 266 */         else if (Math.random() < 0.1D)
/* 267 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 268 */             HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/* 269 */             hertxvarSolEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 270 */             hertxvarSolEntity.setYBodyRot(0.0F);
/* 271 */             hertxvarSolEntity.setYHeadRot(0.0F);
/* 272 */             if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/* 273 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarSolEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 275 */             world.addFreshEntity((Entity)hertxvarSolEntity); }
/*     */           
/*     */            }
/* 278 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 279 */           HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/* 280 */           hertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 281 */           hertxEntity.setYBodyRot(0.0F);
/* 282 */           hertxEntity.setYHeadRot(0.0F);
/* 283 */           if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/* 284 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 286 */           world.addFreshEntity((Entity)hertxEntity); }
/*     */         
/*     */          }
/* 289 */       else if (Math.random() < 0.2D)
/* 290 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 291 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 292 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 293 */           villager.setYBodyRot(0.0F);
/* 294 */           villager.setYHeadRot(0.0F);
/* 295 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 296 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 298 */           world.addFreshEntity((Entity)villager); }
/*     */         
/* 300 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 301 */           Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 302 */           villager.moveTo(x, y, z, 0.0F, 0.0F);
/* 303 */           villager.setYBodyRot(0.0F);
/* 304 */           villager.setYHeadRot(0.0F);
/* 305 */           if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 306 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 308 */           world.addFreshEntity((Entity)villager); }
/*     */         
/* 310 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 311 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 312 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 313 */           scientistEntity.setYBodyRot(0.0F);
/* 314 */           scientistEntity.setYHeadRot(0.0F);
/* 315 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 316 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 318 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/* 320 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 321 */           ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 322 */           scientistEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 323 */           scientistEntity.setYBodyRot(0.0F);
/* 324 */           scientistEntity.setYHeadRot(0.0F);
/* 325 */           if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 326 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 328 */           world.addFreshEntity((Entity)scientistEntity); }
/*     */         
/*     */          }
/* 331 */       else if (Math.random() < 0.05D)
/* 332 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 333 */           AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/* 334 */           aHVHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 335 */           aHVHertxEntity.setYBodyRot(0.0F);
/* 336 */           aHVHertxEntity.setYHeadRot(0.0F);
/* 337 */           if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/* 338 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(aHVHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 340 */           world.addFreshEntity((Entity)aHVHertxEntity); }
/*     */          }
/* 342 */       else if (Math.random() < 0.05D)
/* 343 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 344 */           NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/* 345 */           nXTHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 346 */           nXTHertxEntity.setYBodyRot(0.0F);
/* 347 */           nXTHertxEntity.setYHeadRot(0.0F);
/* 348 */           if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/* 349 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(nXTHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 351 */           world.addFreshEntity((Entity)nXTHertxEntity); }
/*     */          }
/* 353 */       else if (Math.random() < 0.05D)
/* 354 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 355 */           AshburyHertxEntity ashburyHertxEntity = new AshburyHertxEntity((EntityType)LatexModEntities.ASHBURY_HERTX.get(), (Level)_level);
/* 356 */           ashburyHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 357 */           ashburyHertxEntity.setYBodyRot(0.0F);
/* 358 */           ashburyHertxEntity.setYHeadRot(0.0F);
/* 359 */           if (ashburyHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)ashburyHertxEntity;
/* 360 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(ashburyHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 362 */           world.addFreshEntity((Entity)ashburyHertxEntity); }
/*     */          }
/* 364 */       else if (Math.random() < 0.075D)
/* 365 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 366 */           BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 367 */           beeHertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 368 */           beeHertxEntity.setYBodyRot(0.0F);
/* 369 */           beeHertxEntity.setYHeadRot(0.0F);
/* 370 */           if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 371 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(beeHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 373 */           world.addFreshEntity((Entity)beeHertxEntity); }
/*     */          }
/* 375 */       else if (Math.random() < 0.1D)
/* 376 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 377 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/* 378 */           hertxvarFEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 379 */           hertxvarFEntity.setYBodyRot(0.0F);
/* 380 */           hertxvarFEntity.setYHeadRot(0.0F);
/* 381 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/* 382 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 384 */           world.addFreshEntity((Entity)hertxvarFEntity); }
/*     */          }
/* 386 */       else if (Math.random() < 0.1D)
/* 387 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 388 */           HertxvarFBEntity hertxvarFBEntity = new HertxvarFBEntity((EntityType)LatexModEntities.HERTXVAR_FB.get(), (Level)_level);
/* 389 */           hertxvarFBEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 390 */           hertxvarFBEntity.setYBodyRot(0.0F);
/* 391 */           hertxvarFBEntity.setYHeadRot(0.0F);
/* 392 */           if (hertxvarFBEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFBEntity;
/* 393 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFBEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 395 */           world.addFreshEntity((Entity)hertxvarFBEntity); }
/*     */          }
/* 397 */       else if (Math.random() < 0.1D)
/* 398 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 399 */           HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/* 400 */           hertxvarSolEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 401 */           hertxvarSolEntity.setYBodyRot(0.0F);
/* 402 */           hertxvarSolEntity.setYHeadRot(0.0F);
/* 403 */           if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/* 404 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarSolEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 406 */           world.addFreshEntity((Entity)hertxvarSolEntity); }
/*     */         
/*     */          }
/* 409 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 410 */         HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/* 411 */         hertxEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 412 */         hertxEntity.setYBodyRot(0.0F);
/* 413 */         hertxEntity.setYHeadRot(0.0F);
/* 414 */         if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/* 415 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/* 417 */         world.addFreshEntity((Entity)hertxEntity); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 422 */       if (!entity.level.isClientSide())
/* 423 */         entity.discard(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\AllydroppodOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */