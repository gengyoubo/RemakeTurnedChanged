/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.AllydroppodEntity;
/*     */ import net.ltxprogrammer.turned.entity.DROPPODEntity;
/*     */ import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModGameRules;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraftforge.common.MinecraftForge;
/*     */ import net.minecraftforge.event.TickEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */ {
/*  62 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/*  67 */     this.waitTicks = waitTicks;
/*  68 */     MinecraftForge.EVENT_BUS.register(this);
/*  69 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/*  74 */     if (event.phase == TickEvent.Phase.END) {
/*  75 */       this.ticks++;
/*  76 */       if (this.ticks >= this.waitTicks)
/*  77 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/*  82 */     if (Math.random() < 0.0075D * (this.world.m_6106_().m_5470_().m_46215_(LatexModGameRules.BEACONDROPMULTIPLIER) / 10)) {
/*  83 */       LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/*  84 */         if (!_level.m_5776_()) {
/*  85 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  86 */               .getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*  88 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  92 */       levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  93 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123810_, x, y, z, 5, 3.0D, 1.0D, 3.0D, 1.0D); }
/*  94 */        levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  95 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123760_, x, y + 48.0D, z, 8, 3.0D, 1.0D, 3.0D, 1.0D); }
/*  96 */        if (Math.random() < 0.6D) {
/*  97 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  98 */           AllydroppodEntity allydroppodEntity = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), (Level)_level);
/*  99 */           allydroppodEntity.m_7678_(x, y + 48.0D, z, 0.0F, 0.0F);
/* 100 */           allydroppodEntity.m_5618_(0.0F);
/* 101 */           allydroppodEntity.m_5616_(0.0F);
/* 102 */           allydroppodEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 103 */           if (allydroppodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)allydroppodEntity;
/* 104 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(allydroppodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 106 */           this.world.m_7967_((Entity)allydroppodEntity); }
/*     */       
/* 108 */       } else if (Math.random() < 0.1D) {
/* 109 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 110 */           AllydroppodEntity allydroppodEntity = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), (Level)_level);
/* 111 */           allydroppodEntity.m_7678_(x + 6.0D, y + 48.0D, z + 6.0D, 0.0F, 0.0F);
/* 112 */           allydroppodEntity.m_5618_(0.0F);
/* 113 */           allydroppodEntity.m_5616_(0.0F);
/* 114 */           allydroppodEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 115 */           if (allydroppodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)allydroppodEntity;
/* 116 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(allydroppodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 118 */           this.world.m_7967_((Entity)allydroppodEntity); }
/*     */         
/* 120 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 121 */           AllydroppodEntity allydroppodEntity = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), (Level)_level);
/* 122 */           allydroppodEntity.m_7678_(x - 6.0D, y + 48.0D, z - 6.0D, 0.0F, 0.0F);
/* 123 */           allydroppodEntity.m_5618_(0.0F);
/* 124 */           allydroppodEntity.m_5616_(0.0F);
/* 125 */           allydroppodEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 126 */           if (allydroppodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)allydroppodEntity;
/* 127 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(allydroppodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 129 */           this.world.m_7967_((Entity)allydroppodEntity); }
/*     */       
/* 131 */       } else if (Math.random() < 0.5D) {
/* 132 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 133 */           LatexDropPodEntity latexDropPodEntity = new LatexDropPodEntity((EntityType)LatexModEntities.LATEX_DROP_POD.get(), (Level)_level);
/* 134 */           latexDropPodEntity.m_7678_(x, y + 48.0D, z, 0.0F, 0.0F);
/* 135 */           latexDropPodEntity.m_5618_(0.0F);
/* 136 */           latexDropPodEntity.m_5616_(0.0F);
/* 137 */           latexDropPodEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 138 */           if (latexDropPodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)latexDropPodEntity;
/* 139 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(latexDropPodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 141 */           this.world.m_7967_((Entity)latexDropPodEntity); }
/*     */ 
/*     */       
/* 144 */       } else if (this.world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DOEVILSRAID)) {
/* 145 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 146 */           DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 147 */           dROPPODEntity.m_7678_(x, y + 48.0D, z, 0.0F, 0.0F);
/* 148 */           dROPPODEntity.m_5618_(0.0F);
/* 149 */           dROPPODEntity.m_5616_(0.0F);
/* 150 */           dROPPODEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 151 */           if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 152 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 154 */           this.world.m_7967_((Entity)dROPPODEntity); }
/*     */       
/*     */       } else {
/* 157 */         levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 158 */           LatexDropPodEntity latexDropPodEntity = new LatexDropPodEntity((EntityType)LatexModEntities.LATEX_DROP_POD.get(), (Level)_level);
/* 159 */           latexDropPodEntity.m_7678_(x, y + 48.0D, z, 0.0F, 0.0F);
/* 160 */           latexDropPodEntity.m_5618_(0.0F);
/* 161 */           latexDropPodEntity.m_5616_(0.0F);
/* 162 */           latexDropPodEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 163 */           if (latexDropPodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)latexDropPodEntity;
/* 164 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(latexDropPodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 166 */           this.world.m_7967_((Entity)latexDropPodEntity); }
/*     */       
/*     */       } 
/*     */       
/* 170 */       this.world.m_7731_(new BlockPos(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*     */     } 
/* 172 */     MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\MakeshiftBeaconOnUpdateTickProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */