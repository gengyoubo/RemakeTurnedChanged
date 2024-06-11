/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.DLbeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
/*     */ import net.mcreator.latexes.entity.DlSquidDogEntity;
/*     */ import net.mcreator.latexes.entity.DlsharkEntity;
/*     */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*     */ import net.mcreator.latexes.entity.YufengEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModGameRules;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DarkLatexFoxThisEntityKillsAnotherOneProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  36 */     if (entity == null)
/*     */       return; 
/*  38 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && (
/*  39 */       (entity instanceof DarklatexEntity || entity instanceof net.mcreator.latexes.entity.HertxEntity || entity instanceof net.minecraft.world.entity.animal.IronGolem || entity instanceof net.minecraft.world.entity.player.Player) ? true : false) != true)
/*     */     {
/*  41 */       if (entity instanceof net.mcreator.latexes.entity.ScientistEntity || entity instanceof net.mcreator.latexes.entity.EvilScientistEntity || entity instanceof net.mcreator.latexes.entity.EvilSniperEntity) {
/*  42 */         if (!entity.level.isClientSide())
/*  43 */           entity.discard(); 
/*  44 */         if (world instanceof Level) { Level _level = (Level)world;
/*  45 */           if (!_level.isClientSide()) {
/*  46 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  47 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*  49 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  53 */         if (Math.random() < 0.2D)
/*  54 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  55 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/*  56 */             darkLatexFoxSniperEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  57 */             if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/*  58 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxSniperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  60 */             world.addFreshEntity((Entity)darkLatexFoxSniperEntity); }
/*     */           
/*     */            }
/*  63 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  64 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/*  65 */           darkLatexFoxScientistEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  66 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/*  67 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  69 */           world.addFreshEntity((Entity)darkLatexFoxScientistEntity); }
/*     */ 
/*     */       
/*  72 */       } else if (Math.random() < 0.4D) {
/*  73 */         if (!entity.level.isClientSide())
/*  74 */           entity.discard(); 
/*  75 */         if (world instanceof Level) { Level _level = (Level)world;
/*  76 */           if (!_level.isClientSide()) {
/*  77 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  78 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*  80 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  84 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  85 */           DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/*  86 */           darkLatexFoxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  87 */           if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/*  88 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  90 */           world.addFreshEntity((Entity)darkLatexFoxEntity); }
/*     */       
/*  92 */       } else if (Math.random() < 0.1D) {
/*  93 */         if (!entity.level.isClientSide())
/*  94 */           entity.discard(); 
/*  95 */         if (world instanceof Level) { Level _level = (Level)world;
/*  96 */           if (!_level.isClientSide()) {
/*  97 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  98 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 100 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 104 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 105 */           YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/* 106 */           yufengEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 107 */           if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/* 108 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 110 */           world.addFreshEntity((Entity)yufengEntity); }
/*     */       
/* 112 */       } else if (Math.random() < 0.1D) {
/* 113 */         if (!entity.level.isClientSide())
/* 114 */           entity.discard(); 
/* 115 */         if (world instanceof Level) { Level _level = (Level)world;
/* 116 */           if (!_level.isClientSide()) {
/* 117 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 118 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 120 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 124 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 125 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 126 */           noiseStalkerEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 127 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 128 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 130 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */       
/* 132 */       } else if (Math.random() < 0.1D) {
/* 133 */         if (!entity.level.isClientSide())
/* 134 */           entity.discard(); 
/* 135 */         if (world instanceof Level) { Level _level = (Level)world;
/* 136 */           if (!_level.isClientSide()) {
/* 137 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 138 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 140 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 144 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 145 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 146 */           dlsharkEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 147 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 148 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 150 */           world.addFreshEntity((Entity)dlsharkEntity); }
/*     */       
/* 152 */       } else if (Math.random() < 0.1D) {
/* 153 */         if (!entity.level.isClientSide())
/* 154 */           entity.discard(); 
/* 155 */         if (world instanceof Level) { Level _level = (Level)world;
/* 156 */           if (!_level.isClientSide()) {
/* 157 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 158 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 160 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 164 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 165 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 166 */           darkLatexSnakeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 167 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 168 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 170 */           world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*     */       
/* 172 */       } else if (Math.random() < 0.1D) {
/* 173 */         if (!entity.level.isClientSide())
/* 174 */           entity.discard(); 
/* 175 */         if (world instanceof Level) { Level _level = (Level)world;
/* 176 */           if (!_level.isClientSide()) {
/* 177 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 178 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 180 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 184 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 185 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 186 */           dLbeeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 187 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 188 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 190 */           world.addFreshEntity((Entity)dLbeeEntity); }
/*     */       
/* 192 */       } else if (Math.random() < 0.1D) {
/* 193 */         if (!entity.level.isClientSide())
/* 194 */           entity.discard(); 
/* 195 */         if (world instanceof Level) { Level _level = (Level)world;
/* 196 */           if (!_level.isClientSide()) {
/* 197 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 198 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 200 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 204 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 205 */           DlSquidDogEntity dlSquidDogEntity = new DlSquidDogEntity((EntityType)LatexModEntities.DL_SQUID_DOG.get(), (Level)_level);
/* 206 */           dlSquidDogEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 207 */           if (dlSquidDogEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlSquidDogEntity;
/* 208 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlSquidDogEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 210 */           world.addFreshEntity((Entity)dlSquidDogEntity); }
/*     */       
/*     */       } else {
/* 213 */         if (!entity.level.isClientSide())
/* 214 */           entity.discard(); 
/* 215 */         if (world instanceof Level) { Level _level = (Level)world;
/* 216 */           if (!_level.isClientSide()) {
/* 217 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 218 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 220 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 224 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 225 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 226 */           darklatexEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 227 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 228 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 230 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */       
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexFoxThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */