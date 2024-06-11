/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*     */ import net.ltxprogrammer.turned.entity.TSCHunterEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCdroneEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
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
/*     */ public class TSCHunterThisEntityKillsAnotherOneProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, final TSCHunterEntity sourceentity) {
/*  31 */     if (entity == null || sourceentity == null)
/*     */       return; 
/*  33 */     if (entity instanceof net.ltxprogrammer.turned.entity.MilitaryEntity || entity instanceof net.ltxprogrammer.turned.entity.ScientistEntity || entity instanceof net.ltxprogrammer.turned.entity.MilitaryflameunitEntity || entity instanceof net.minecraft.world.entity.npc.Villager || entity instanceof net.minecraft.world.entity.npc.WanderingTrader || entity instanceof net.minecraft.world.entity.monster.Witch || entity instanceof net.ltxprogrammer.turned.entity.EvilMilitaryEntity || entity instanceof net.ltxprogrammer.turned.entity.EvilSniperEntity || entity instanceof net.ltxprogrammer.turned.entity.EvilScientistEntity || entity instanceof net.minecraft.world.entity.monster.Pillager || entity instanceof net.minecraft.world.entity.monster.Vindicator || entity instanceof net.minecraft.world.entity.monster.Evoker || entity instanceof net.minecraft.world.entity.player.Player)
/*     */     {
/*     */ 
/*     */       
/*  37 */       if (Math.random() < 0.2D) {
/*  38 */         if (!entity.f_19853_.m_5776_())
/*  39 */           if (entity instanceof net.minecraft.world.entity.player.Player) {
/*  40 */             entity.m_6074_();
/*     */           } else {
/*  42 */             entity.m_146870_();
/*     */           }  
/*  44 */         if (world instanceof Level) { Level _level = (Level)world;
/*  45 */           if (!_level.m_5776_()) {
/*  46 */             _level.m_5594_(null, new BlockPos(sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  47 */                 .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*  49 */             _level.m_7785_(sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  50 */                 .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  54 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  55 */           _level.m_8767_((ParticleOptions)ParticleTypes.f_123810_, sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_(), 5, 1.0D, 2.0D, 1.0D, 1.0D);
/*  56 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/*  57 */           tSCdroneEntity.m_7678_(sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_(), 0.0F, 0.0F);
/*  58 */           tSCdroneEntity.m_5618_(0.0F);
/*  59 */           tSCdroneEntity.m_5616_(0.0F);
/*  60 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/*  61 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(tSCdroneEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  63 */           world.m_7967_((Entity)tSCdroneEntity); }
/*     */       
/*  65 */       } else if (Math.random() < 0.35D) {
/*  66 */         if (!entity.f_19853_.m_5776_())
/*  67 */           entity.m_146870_(); 
/*  68 */         if (world instanceof Level) { Level _level = (Level)world;
/*  69 */           if (!_level.m_5776_()) {
/*  70 */             _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F);
/*     */           } else {
/*     */             
/*  73 */             _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  77 */         sourceentity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 200, 1, false, false));
/*  78 */         sourceentity.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 200, 1, false, false));
/*  79 */         (new Object() {
/*  80 */             private int ticks = 0;
/*     */             private float waitTicks;
/*     */             private LevelAccessor world;
/*     */             
/*     */             public void start(LevelAccessor world, int waitTicks) {
/*  85 */               this.waitTicks = waitTicks;
/*  86 */               MinecraftForge.EVENT_BUS.register(this);
/*  87 */               this.world = world;
/*     */             }
/*     */             
/*     */             @SubscribeEvent
/*     */             public void tick(TickEvent.ServerTickEvent event) {
/*  92 */               if (event.phase == TickEvent.Phase.END) {
/*  93 */                 this.ticks++;
/*  94 */                 if (this.ticks >= this.waitTicks)
/*  95 */                   run(); 
/*     */               } 
/*     */             }
/*     */             
/*     */             private void run() {
/* 100 */               LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 101 */                 TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 102 */                 tSCdroneEntity.m_7678_(sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_(), 0.0F, 0.0F);
/* 103 */                 tSCdroneEntity.m_5618_(0.0F);
/* 104 */                 tSCdroneEntity.m_5616_(0.0F);
/* 105 */                 if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 106 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(tSCdroneEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 108 */                 this.world.m_7967_((Entity)tSCdroneEntity); }
/*     */               
/* 110 */               levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 111 */                 if (!_level.m_5776_()) {
/* 112 */                   _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 113 */                       .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */                 } else {
/*     */                   
/* 116 */                   _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 117 */                       .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */                 }  }
/*     */ 
/*     */               
/* 121 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 122 */                 _level.m_8767_((ParticleOptions)ParticleTypes.f_123810_, sourceentity.m_20185_(), sourceentity.m_20186_(), sourceentity.m_20189_(), 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/*     */               
/* 124 */               MinecraftForge.EVENT_BUS.unregister(this);
/*     */             }
/* 126 */           }).start(world, 200);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TSCHunterThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */