/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
/*     */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DlsharkEntity;
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
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ 
/*     */ public class DarklatexslugOnInitialEntitySpawnProcedure {
/*     */   public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
/*  26 */     if (entity == null)
/*     */       return; 
/*  28 */     (new Object() {
/*  29 */         private int ticks = 0;
/*     */         private float waitTicks;
/*     */         private LevelAccessor world;
/*     */         
/*     */         public void start(LevelAccessor world, int waitTicks) {
/*  34 */           this.waitTicks = waitTicks;
/*  35 */           MinecraftForge.EVENT_BUS.register(this);
/*  36 */           this.world = world;
/*     */         }
/*     */         
/*     */         @SubscribeEvent
/*     */         public void tick(TickEvent.ServerTickEvent event) {
/*  41 */           if (event.phase == TickEvent.Phase.END) {
/*  42 */             this.ticks++;
/*  43 */             if (this.ticks >= this.waitTicks)
/*  44 */               run(); 
/*     */           } 
/*     */         }
/*     */         
/*     */         private void run() {
/*  49 */           if (entity.m_6084_()) {
/*  50 */             if (!entity.f_19853_.m_5776_())
/*  51 */               entity.m_146870_(); 
/*  52 */             LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/*  53 */               if (!_level.m_5776_()) {
/*  54 */                 _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  55 */                     .getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */               } else {
/*  57 */                 _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */               }  }
/*     */ 
/*     */             
/*  61 */             if (Math.random() < 0.175D) {
/*  62 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  63 */                 DarkLatexYufeng darkLatexYufeng = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), (Level)_level);
/*  64 */                 darkLatexYufeng.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  65 */                 if (darkLatexYufeng instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexYufeng;
/*  66 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexYufeng.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  68 */                 this.world.m_7967_((Entity)darkLatexYufeng); }
/*     */             
/*  70 */             } else if (Math.random() < 0.15D) {
/*  71 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  72 */                 DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/*  73 */                 dlsharkEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  74 */                 if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/*  75 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dlsharkEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  77 */                 this.world.m_7967_((Entity)dlsharkEntity); }
/*     */             
/*  79 */             } else if (Math.random() < 0.175D) {
/*  80 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  81 */                 DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/*  82 */                 darkLatexFoxEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  83 */                 if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/*  84 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexFoxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  86 */                 this.world.m_7967_((Entity)darkLatexFoxEntity); }
/*     */             
/*  88 */             } else if (Math.random() < 0.15D) {
/*  89 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  90 */                 DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/*  91 */                 dLbeeEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  92 */                 if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/*  93 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/*  95 */                 this.world.m_7967_((Entity)dLbeeEntity); }
/*     */             
/*  97 */             } else if (Math.random() < 0.125D) {
/*  98 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  99 */                 NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 100 */                 noiseStalkerEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 101 */                 if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 102 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(noiseStalkerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 104 */                 this.world.m_7967_((Entity)noiseStalkerEntity); }
/*     */             
/* 106 */             } else if (Math.random() < 0.125D) {
/* 107 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 108 */                 DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 109 */                 darkLatexSnakeEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 110 */                 if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 111 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexSnakeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 113 */                 this.world.m_7967_((Entity)darkLatexSnakeEntity); }
/*     */             
/* 115 */             } else if (Math.random() < 0.125D) {
/* 116 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 117 */                 DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 118 */                 darkLatexSpiderEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 119 */                 if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 120 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 122 */                 this.world.m_7967_((Entity)darkLatexSpiderEntity); }
/*     */             
/* 124 */             } else if (Math.random() < 0.125D) {
/* 125 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 126 */                 DarkLatexMothEntity darkLatexMothEntity = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), (Level)_level);
/* 127 */                 darkLatexMothEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 128 */                 if (darkLatexMothEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexMothEntity;
/* 129 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexMothEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 131 */                 this.world.m_7967_((Entity)darkLatexMothEntity); }
/*     */             
/* 133 */             } else if (Math.random() < 0.075D) {
/* 134 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 135 */                 DarkLatexCentaurEntity darkLatexCentaurEntity = new DarkLatexCentaurEntity((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), (Level)_level);
/* 136 */                 darkLatexCentaurEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 137 */                 if (darkLatexCentaurEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexCentaurEntity;
/* 138 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darkLatexCentaurEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 140 */                 this.world.m_7967_((Entity)darkLatexCentaurEntity); }
/*     */             
/*     */             } else {
/* 143 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 144 */                 DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 145 */                 darklatexEntity.m_7678_(entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 146 */                 if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 147 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 149 */                 this.world.m_7967_((Entity)darklatexEntity); }
/*     */             
/*     */             } 
/*     */           } 
/* 153 */           MinecraftForge.EVENT_BUS.unregister(this);
/*     */         }
/* 155 */       }).start(world, 30 + world.m_6106_().m_5470_().m_46215_(LatexModGameRules.DARKLATEXSLUGGROWTIME));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexslugOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */