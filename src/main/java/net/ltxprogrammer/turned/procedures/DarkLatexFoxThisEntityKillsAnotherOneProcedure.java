/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
/*     */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*     */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxScientistEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
/*     */ import net.ltxprogrammer.turned.entity.DlsharkEntity;
/*     */ import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ 
/*     */ public class DarkLatexFoxThisEntityKillsAnotherOneProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  26 */     if (entity == null)
/*     */       return; 
/*  28 */     if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXTRANSFUR) && (
/*  29 */       (entity instanceof DarklatexEntity || entity instanceof net.ltxprogrammer.turned.entity.HertxEntity || entity instanceof net.minecraft.world.entity.animal.IronGolem || entity instanceof net.minecraft.world.entity.player.Player) ? true : false) != true)
/*     */     {
/*  31 */       if (entity instanceof net.ltxprogrammer.turned.entity.ScientistEntity || entity instanceof net.ltxprogrammer.turned.entity.EvilScientistEntity || entity instanceof net.ltxprogrammer.turned.entity.EvilSniperEntity) {
/*  32 */         if (!entity.f_19853_.m_5776_())
/*  33 */           entity.m_146870_(); 
/*  34 */         if (world instanceof Level) { Level _level = (Level)world;
/*  35 */           if (!_level.m_5776_()) {
/*  36 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/*  39 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  43 */         if (Math.random() < 0.2D)
/*  44 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  45 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), (Level)_level);
/*  46 */             darkLatexFoxSniperEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  47 */             if (darkLatexFoxSniperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxSniperEntity;
/*  48 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxSniperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  50 */             world.m_7967_((Entity)darkLatexFoxSniperEntity); }
/*     */           
/*     */            }
/*  53 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  54 */           DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), (Level)_level);
/*  55 */           darkLatexFoxScientistEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  56 */           if (darkLatexFoxScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxScientistEntity;
/*  57 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  59 */           world.m_7967_((Entity)darkLatexFoxScientistEntity); }
/*     */ 
/*     */       
/*  62 */       } else if (Math.random() < 0.4D) {
/*  63 */         if (!entity.f_19853_.m_5776_())
/*  64 */           entity.m_146870_(); 
/*  65 */         if (world instanceof Level) { Level _level = (Level)world;
/*  66 */           if (!_level.m_5776_()) {
/*  67 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/*  70 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  74 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  75 */           DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/*  76 */           darkLatexFoxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  77 */           if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/*  78 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexFoxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  80 */           world.m_7967_((Entity)darkLatexFoxEntity); }
/*     */       
/*  82 */       } else if (Math.random() < 0.1D) {
/*  83 */         if (!entity.f_19853_.m_5776_())
/*  84 */           entity.m_146870_(); 
/*  85 */         if (world instanceof Level) { Level _level = (Level)world;
/*  86 */           if (!_level.m_5776_()) {
/*  87 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/*  90 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  94 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  95 */           DarkLatexYufeng darkLatexYufeng = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), (Level)_level);
/*  96 */           darkLatexYufeng.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  97 */           if (darkLatexYufeng instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexYufeng;
/*  98 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexYufeng.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 100 */           world.m_7967_((Entity)darkLatexYufeng); }
/*     */       
/* 102 */       } else if (Math.random() < 0.1D) {
/* 103 */         if (!entity.f_19853_.m_5776_())
/* 104 */           entity.m_146870_(); 
/* 105 */         if (world instanceof Level) { Level _level = (Level)world;
/* 106 */           if (!_level.m_5776_()) {
/* 107 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 110 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 114 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 115 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 116 */           noiseStalkerEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 117 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 118 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 120 */           world.m_7967_((Entity)noiseStalkerEntity); }
/*     */       
/* 122 */       } else if (Math.random() < 0.1D) {
/* 123 */         if (!entity.f_19853_.m_5776_())
/* 124 */           entity.m_146870_(); 
/* 125 */         if (world instanceof Level) { Level _level = (Level)world;
/* 126 */           if (!_level.m_5776_()) {
/* 127 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 130 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 134 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 135 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 136 */           dlsharkEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 137 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 138 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dlsharkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 140 */           world.m_7967_((Entity)dlsharkEntity); }
/*     */       
/* 142 */       } else if (Math.random() < 0.1D) {
/* 143 */         if (!entity.f_19853_.m_5776_())
/* 144 */           entity.m_146870_(); 
/* 145 */         if (world instanceof Level) { Level _level = (Level)world;
/* 146 */           if (!_level.m_5776_()) {
/* 147 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 150 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 154 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 155 */           DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 156 */           darkLatexSnakeEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 157 */           if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 158 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnakeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 160 */           world.m_7967_((Entity)darkLatexSnakeEntity); }
/*     */       
/* 162 */       } else if (Math.random() < 0.1D) {
/* 163 */         if (!entity.f_19853_.m_5776_())
/* 164 */           entity.m_146870_(); 
/* 165 */         if (world instanceof Level) { Level _level = (Level)world;
/* 166 */           if (!_level.m_5776_()) {
/* 167 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 170 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 174 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 175 */           DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 176 */           dLbeeEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 177 */           if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 178 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 180 */           world.m_7967_((Entity)dLbeeEntity); }
/*     */       
/* 182 */       } else if (Math.random() < 0.1D) {
/* 183 */         if (!entity.f_19853_.m_5776_())
/* 184 */           entity.m_146870_(); 
/* 185 */         if (world instanceof Level) { Level _level = (Level)world;
/* 186 */           if (!_level.m_5776_()) {
/* 187 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 190 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 194 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 195 */           DlSquidDogEntity dlSquidDogEntity = new DlSquidDogEntity((EntityType)LatexModEntities.DL_SQUID_DOG.get(), (Level)_level);
/* 196 */           dlSquidDogEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 197 */           if (dlSquidDogEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlSquidDogEntity;
/* 198 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dlSquidDogEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 200 */           world.m_7967_((Entity)dlSquidDogEntity); }
/*     */       
/*     */       } else {
/* 203 */         if (!entity.f_19853_.m_5776_())
/* 204 */           entity.m_146870_(); 
/* 205 */         if (world instanceof Level) { Level _level = (Level)world;
/* 206 */           if (!_level.m_5776_()) {
/* 207 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*     */             
/* 210 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/* 214 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 215 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 216 */           darklatexEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 217 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 218 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 220 */           world.m_7967_((Entity)darklatexEntity); }
/*     */       
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexFoxThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */