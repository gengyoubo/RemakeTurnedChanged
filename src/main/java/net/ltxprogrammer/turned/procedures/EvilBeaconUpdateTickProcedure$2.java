/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.DROPPODEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.server.level.ServerLevel;
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
/*  65 */   private int ticks = 0;
/*     */   private float waitTicks;
/*     */   private LevelAccessor world;
/*     */   
/*     */   public void start(LevelAccessor world, int waitTicks) {
/*  70 */     this.waitTicks = waitTicks;
/*  71 */     MinecraftForge.EVENT_BUS.register(this);
/*  72 */     this.world = world;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public void tick(TickEvent.ServerTickEvent event) {
/*  77 */     if (event.phase == TickEvent.Phase.END) {
/*  78 */       this.ticks++;
/*  79 */       if (this.ticks >= this.waitTicks)
/*  80 */         run(); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void run() {
/*  85 */     if (Math.random() < 0.005D * (this.world.m_6106_().m_5470_().m_46215_(LatexModGameRules.BEACONDROPMULTIPLIER) / 10)) {
/*  86 */       LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  87 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123808_, x, y, z, 8, 3.0D, 2.0D, 3.0D, 1.0D); }
/*  88 */        levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/*  89 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123760_, x, y + 48.0D, z, 8, 3.0D, 2.0D, 3.0D, 1.0D); }
/*  90 */        this.world.m_7731_(new BlockPos(x, y, z), Blocks.f_50016_.m_49966_(), 3);
/*  91 */       (new Object() {
/*  92 */           private int ticks = 0;
/*     */           private float waitTicks;
/*     */           private LevelAccessor world;
/*     */           
/*     */           public void start(LevelAccessor world, int waitTicks) {
/*  97 */             this.waitTicks = waitTicks;
/*  98 */             MinecraftForge.EVENT_BUS.register(this);
/*  99 */             this.world = world;
/*     */           }
/*     */           
/*     */           @SubscribeEvent
/*     */           public void tick(TickEvent.ServerTickEvent event) {
/* 104 */             if (event.phase == TickEvent.Phase.END) {
/* 105 */               this.ticks++;
/* 106 */               if (this.ticks >= this.waitTicks)
/* 107 */                 run(); 
/*     */             } 
/*     */           }
/*     */           
/*     */           private void run() {
/* 112 */             if (Math.random() < 0.1D) {
/* 113 */               LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 114 */                 DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 115 */                 dROPPODEntity.m_7678_(x, y + 36.0D, z + 8.0D, this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 116 */                 if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 117 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 119 */                 this.world.m_7967_((Entity)dROPPODEntity); }
/*     */               
/* 121 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 122 */                 DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 123 */                 dROPPODEntity.m_7678_(x, y + 36.0D, z - 8.0D, this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 124 */                 if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 125 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 127 */                 this.world.m_7967_((Entity)dROPPODEntity); }
/*     */               
/* 129 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 130 */                 DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 131 */                 dROPPODEntity.m_7678_(x + 8.0D, y + 36.0D, z, this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 132 */                 if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 133 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 135 */                 this.world.m_7967_((Entity)dROPPODEntity); }
/*     */               
/* 137 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 138 */                 DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 139 */                 dROPPODEntity.m_7678_(x - 8.0D, y + 36.0D, z, this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 140 */                 if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 141 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 143 */                 this.world.m_7967_((Entity)dROPPODEntity); }
/*     */             
/*     */             } else {
/* 146 */               LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 147 */                 DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 148 */                 dROPPODEntity.m_7678_(x, y + 48.0D, z, this.world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 149 */                 if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 150 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 152 */                 this.world.m_7967_((Entity)dROPPODEntity); }
/*     */             
/*     */             } 
/* 155 */             MinecraftForge.EVENT_BUS.unregister(this);
/*     */           }
/* 157 */         }).start(this.world, 50);
/*     */     } 
/* 159 */     MinecraftForge.EVENT_BUS.unregister(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\EvilBeaconUpdateTickProcedure$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */