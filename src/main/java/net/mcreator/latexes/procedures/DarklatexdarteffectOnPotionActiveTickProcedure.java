/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
/*     */ import net.mcreator.latexes.entity.DlsharkEntity;
/*     */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*     */ import net.mcreator.latexes.entity.YufengEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Registry;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.TagKey;
/*     */ import net.minecraft.world.damagesource.DamageSource;
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
/*     */ public class DarklatexdarteffectOnPotionActiveTickProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, final Entity entity) {
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
/*  56 */           entity.hurt(DamageSource.WITHER, 3.0F);
/*  57 */           MinecraftForge.EVENT_BUS.unregister(this);
/*     */         }
/*  59 */       }).start(world, 15);
/*  60 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) <= 1.0F && (
/*  61 */       (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity
/*  62 */       .getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) ? true : false) != true && 
/*  63 */       entity instanceof net.minecraft.world.entity.player.Player != true)
/*  64 */       if (entity.isInWaterOrBubble()) {
/*  65 */         if (!entity.level.isClientSide())
/*  66 */           entity.discard(); 
/*  67 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  68 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/*  69 */           dlsharkEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  70 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/*  71 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  73 */           world.addFreshEntity((Entity)dlsharkEntity); }
/*     */         
/*  75 */         if (world instanceof Level) { Level _level = (Level)world;
/*  76 */           if (!_level.isClientSide()) {
/*  77 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  78 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/*  80 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  81 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }
/*     */            }
/*     */       
/*  85 */       } else if (entity instanceof net.minecraft.world.entity.monster.Skeleton) {
/*  86 */         if (!entity.level.isClientSide())
/*  87 */           entity.discard(); 
/*  88 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  89 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/*  90 */           darkLatexSkeletonEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  91 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/*  92 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  94 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/*  96 */         if (world instanceof Level) { Level _level = (Level)world;
/*  97 */           if (!_level.isClientSide()) {
/*  98 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  99 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 101 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 102 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }
/*     */            }
/*     */ 
/*     */       
/* 107 */       } else if (Math.random() < 0.075D) {
/* 108 */         if (!entity.level.isClientSide())
/* 109 */           entity.discard(); 
/* 110 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 111 */           DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 112 */           dlsharkEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 113 */           if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 114 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 116 */           world.addFreshEntity((Entity)dlsharkEntity); }
/*     */         
/* 118 */         if (world instanceof Level) { Level _level = (Level)world;
/* 119 */           if (!_level.isClientSide()) {
/* 120 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 121 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 123 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 124 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }
/*     */            }
/*     */       
/* 128 */       } else if (Math.random() < 0.075D) {
/* 129 */         if (!entity.level.isClientSide())
/* 130 */           entity.discard(); 
/* 131 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 132 */           YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/* 133 */           yufengEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 134 */           if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/* 135 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 137 */           world.addFreshEntity((Entity)yufengEntity); }
/*     */         
/* 139 */         if (world instanceof Level) { Level _level = (Level)world;
/* 140 */           if (!_level.isClientSide()) {
/* 141 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 142 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 144 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 145 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }
/*     */            }
/*     */       
/* 149 */       } else if (Math.random() < 0.025D) {
/* 150 */         if (!entity.level.isClientSide())
/* 151 */           entity.discard(); 
/* 152 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 153 */           NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/* 154 */           noiseStalkerEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 155 */           if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/* 156 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 158 */           world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/* 160 */         if (world instanceof Level) { Level _level = (Level)world;
/* 161 */           if (!_level.isClientSide()) {
/* 162 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 163 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 165 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 166 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }
/*     */            }
/*     */       
/* 170 */       } else if (entity instanceof DarklatexEntity) {
/* 171 */         if (!entity.level.isClientSide())
/* 172 */           entity.discard(); 
/* 173 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 174 */           DarkLatexSkeletonEntity darkLatexSkeletonEntity = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), (Level)_level);
/* 175 */           darkLatexSkeletonEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 176 */           if (darkLatexSkeletonEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSkeletonEntity;
/* 177 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSkeletonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 179 */           world.addFreshEntity((Entity)darkLatexSkeletonEntity); }
/*     */         
/* 181 */         if (world instanceof Level) { Level _level = (Level)world;
/* 182 */           if (!_level.isClientSide()) {
/* 183 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 184 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 186 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 187 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */       
/*     */       } else {
/*     */         
/* 192 */         if (!entity.level.isClientSide())
/* 193 */           entity.discard(); 
/* 194 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 195 */           DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 196 */           darklatexEntity.moveTo(entity.getX(), entity.getY(), entity.getZ(), world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 197 */           if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 198 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 200 */           world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/* 202 */         if (world instanceof Level) { Level _level = (Level)world;
/* 203 */           if (!_level.isClientSide()) {
/* 204 */             _level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 205 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           } else {
/* 207 */             _level.playLocalSound(entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 208 */                 .getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */       
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexdarteffectOnPotionActiveTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */