/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.TSCdroneEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
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
/*     */ import net.minecraft.world.entity.LivingEntity;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TSCHunterThisEntityKillsAnotherOneProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, final Entity sourceentity) {
/*  39 */     if (entity == null || sourceentity == null)
/*     */       return; 
/*  41 */     if (((entity instanceof net.mcreator.latexes.entity.MilitaryEntity || entity instanceof net.mcreator.latexes.entity.ScientistEntity || entity instanceof net.mcreator.latexes.entity.MilitaryflameunitEntity || entity instanceof net.minecraft.world.entity.npc.Villager || entity instanceof net.minecraft.world.entity.npc.WanderingTrader || entity instanceof net.minecraft.world.entity.monster.Witch || entity instanceof net.mcreator.latexes.entity.EvilMilitaryEntity || entity instanceof net.mcreator.latexes.entity.EvilSniperEntity || entity instanceof net.mcreator.latexes.entity.EvilScientistEntity || entity instanceof net.minecraft.world.entity.monster.Pillager || entity instanceof net.minecraft.world.entity.monster.Vindicator || entity instanceof net.minecraft.world.entity.monster.Evoker) ? true : false) == true)
/*     */     {
/*     */ 
/*     */       
/*  45 */       if (Math.random() < 0.2D) {
/*  46 */         if (!entity.level.isClientSide())
/*  47 */           entity.discard(); 
/*  48 */         if (world instanceof Level) { Level _level = (Level)world;
/*  49 */           if (!_level.isClientSide()) {
/*  50 */             _level.playSound(null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  51 */                 .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*  53 */             _level.playLocalSound(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  54 */                 .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  58 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  59 */           _level.sendParticles((ParticleOptions)ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/*  60 */          if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  61 */           TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/*  62 */           tSCdroneEntity.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0F, 0.0F);
/*  63 */           tSCdroneEntity.setYBodyRot(0.0F);
/*  64 */           tSCdroneEntity.setYHeadRot(0.0F);
/*  65 */           if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/*  66 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(tSCdroneEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  68 */           world.addFreshEntity((Entity)tSCdroneEntity); }
/*     */       
/*  70 */       } else if (Math.random() < 0.35D) {
/*  71 */         if (!entity.level.isClientSide())
/*  72 */           entity.discard(); 
/*  73 */         if (world instanceof Level) { Level _level = (Level)world;
/*  74 */           if (!_level.isClientSide()) {
/*  75 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*     */           } else {
/*     */             
/*  78 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*  82 */         if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/*  83 */           _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false)); }
/*  84 */          if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/*  85 */           _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false)); }
/*  86 */          (new Object() {
/*  87 */             private int ticks = 0;
/*     */             private float waitTicks;
/*     */             private LevelAccessor world;
/*     */             
/*     */             public void start(LevelAccessor world, int waitTicks) {
/*  92 */               this.waitTicks = waitTicks;
/*  93 */               MinecraftForge.EVENT_BUS.register(this);
/*  94 */               this.world = world;
/*     */             }
/*     */             
/*     */             @SubscribeEvent
/*     */             public void tick(TickEvent.ServerTickEvent event) {
/*  99 */               if (event.phase == TickEvent.Phase.END) {
/* 100 */                 this.ticks++;
/* 101 */                 if (this.ticks >= this.waitTicks)
/* 102 */                   run(); 
/*     */               } 
/*     */             }
/*     */             
/*     */             private void run() {
/* 107 */               LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 108 */                 TSCdroneEntity tSCdroneEntity = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), (Level)_level);
/* 109 */                 tSCdroneEntity.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0F, 0.0F);
/* 110 */                 tSCdroneEntity.setYBodyRot(0.0F);
/* 111 */                 tSCdroneEntity.setYHeadRot(0.0F);
/* 112 */                 if (tSCdroneEntity instanceof Mob) { Mob _mobToSpawn = (Mob)tSCdroneEntity;
/* 113 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(tSCdroneEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */                 
/* 115 */                 this.world.addFreshEntity((Entity)tSCdroneEntity); }
/*     */               
/* 117 */               levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 118 */                 if (!_level.isClientSide()) {
/* 119 */                   _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 120 */                       .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */                 } else {
/*     */                   
/* 123 */                   _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 124 */                       .getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */                 }  }
/*     */ 
/*     */               
/* 128 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 129 */                 _level.sendParticles((ParticleOptions)ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0D, 2.0D, 1.0D, 1.0D); }
/*     */               
/* 131 */               MinecraftForge.EVENT_BUS.unregister(this);
/*     */             }
/* 133 */           }).start(world, 200);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCHunterThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */