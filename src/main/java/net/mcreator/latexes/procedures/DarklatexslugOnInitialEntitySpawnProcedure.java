/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.entity.DLbeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexMothEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
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
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarklatexslugOnInitialEntitySpawnProcedure {
/*     */   public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
/*  33 */     if (entity == null)
/*     */       return; 
/*  35 */     (new Object() {
/*  36 */         private int ticks = 0;
/*     */         private float waitTicks;
/*     */         private LevelAccessor world;
/*     */         
/*     */         public void start(LevelAccessor world, int waitTicks) {
/*  41 */           this.waitTicks = waitTicks;
/*  42 */           MinecraftForge.EVENT_BUS.register(this);
/*  43 */           this.world = world;
/*     */         }
/*     */         
/*     */         @SubscribeEvent
/*     */         public void tick(TickEvent.ServerTickEvent event) {
/*  48 */           if (event.phase == TickEvent.Phase.END) {
/*  49 */             this.ticks++;
/*  50 */             if (this.ticks >= this.waitTicks)
/*  51 */               run(); 
/*     */           } 
/*     */         }
/*     */         
/*     */         private void run() {
/*  56 */           if (entity.isAlive()) {
/*  57 */             if (!entity.level.isClientSide())
/*  58 */               entity.discard(); 
/*  59 */             LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/*  60 */               if (!_level.isClientSide()) {
/*  61 */                 _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  62 */                     .getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */               } else {
/*  64 */                 _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */               }  }
/*     */ 
/*     */             
/*  68 */             if (Math.random() < 0.175D) {
/*  69 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  70 */                 YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/*  71 */                 yufengEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  72 */                 if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/*  73 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  75 */                 this.world.addFreshEntity((Entity)yufengEntity); }
/*     */             
/*  77 */             } else if (Math.random() < 0.15D) {
/*  78 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  79 */                 DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/*  80 */                 dlsharkEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  81 */                 if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/*  82 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  84 */                 this.world.addFreshEntity((Entity)dlsharkEntity); }
/*     */             
/*  86 */             } else if (Math.random() < 0.175D) {
/*  87 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  88 */                 DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/*  89 */                 darkLatexFoxEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  90 */                 if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/*  91 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darkLatexFoxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  93 */                 this.world.addFreshEntity((Entity)darkLatexFoxEntity); }
/*     */             
/*  95 */             } else if (Math.random() < 0.15D) {
/*  96 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  97 */                 DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/*  98 */                 dLbeeEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  99 */                 if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 100 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 102 */                 this.world.addFreshEntity((Entity)dLbeeEntity); }
/*     */             
/* 104 */             } else if (Math.random() < 0.125D) {
/* 105 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 106 */                 NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 107 */                 noiseStalkerEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 108 */                 if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 109 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 111 */                 this.world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */             
/* 113 */             } else if (Math.random() < 0.125D) {
/* 114 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 115 */                 DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 116 */                 darkLatexSnakeEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 117 */                 if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 118 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 120 */                 this.world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*     */             
/* 122 */             } else if (Math.random() < 0.125D) {
/* 123 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 124 */                 DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 125 */                 darkLatexSpiderEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 126 */                 if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 127 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 129 */                 this.world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */             
/* 131 */             } else if (Math.random() < 0.125D) {
/* 132 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 133 */                 DarkLatexMothEntity darkLatexMothEntity = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), (Level)_level);
/* 134 */                 darkLatexMothEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 135 */                 if (darkLatexMothEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexMothEntity;
/* 136 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darkLatexMothEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 138 */                 this.world.addFreshEntity((Entity)darkLatexMothEntity); }
/*     */             
/* 140 */             } else if (Math.random() < 0.075D) {
/* 141 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 142 */                 DarkLatexCentaurEntity darkLatexCentaurEntity = new DarkLatexCentaurEntity((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), (Level)_level);
/* 143 */                 darkLatexCentaurEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 144 */                 if (darkLatexCentaurEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexCentaurEntity;
/* 145 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darkLatexCentaurEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 147 */                 this.world.addFreshEntity((Entity)darkLatexCentaurEntity); }
/*     */             
/*     */             } else {
/* 150 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 151 */                 DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 152 */                 darklatexEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 153 */                 if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 154 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 156 */                 this.world.addFreshEntity((Entity)darklatexEntity); }
/*     */             
/*     */             } 
/*     */           } 
/* 160 */           MinecraftForge.EVENT_BUS.unregister(this);
/*     */         }
/* 162 */       }).start(world, 30 + world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSLUGGROWTIME));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexslugOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */