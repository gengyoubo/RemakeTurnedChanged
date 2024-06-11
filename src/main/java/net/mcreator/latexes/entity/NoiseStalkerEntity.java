/*     */ package net.mcreator.latexes.entity;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.NoiseStalkerDetectGameruleProcedure;
/*     */ import net.mcreator.latexes.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zoglin;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.ZombifiedPiglin;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NoiseStalkerEntity extends Monster {
/*     */   public NoiseStalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  68 */     this((EntityType<NoiseStalkerEntity>)LatexModEntities.NOISE_STALKER.get(), world);
/*     */   }
/*     */   
/*     */   public NoiseStalkerEntity(EntityType<NoiseStalkerEntity> type, Level world) {
/*  72 */     super(type, world);
/*  73 */     this.xpReward = 10;
/*  74 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  79 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  84 */     super.registerGoals();
/*  85 */     this.goalSelector.addGoal(1, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/*  86 */     this.goalSelector.addGoal(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  89 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  94 */             double x = NoiseStalkerEntity.this.getX();
/*  95 */             double y = NoiseStalkerEntity.this.getY();
/*  96 */             double z = NoiseStalkerEntity.this.getZ();
/*  97 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/*  98 */             Level world = NoiseStalkerEntity.this.level;
/*  99 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)noiseStalkerEntity));
/*     */           }
/*     */         });
/*     */     
/* 103 */     this.targetSelector.addGoal(3, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 104 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 107 */             double x = NoiseStalkerEntity.this.getX();
/* 108 */             double y = NoiseStalkerEntity.this.getY();
/* 109 */             double z = NoiseStalkerEntity.this.getZ();
/* 110 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 111 */             Level world = NoiseStalkerEntity.this.level;
/* 112 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)noiseStalkerEntity));
/*     */           }
/*     */         });
/* 115 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, false, true));
/* 116 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, ScientistEntity.class, false, true));
/* 117 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, false, true));
/* 118 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilScientistEntity.class, false, true));
/* 119 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, false, true));
/* 120 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, false, true));
/* 121 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, true));
/* 122 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, false, true));
/* 123 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, false, true));
/* 124 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, false, true));
/* 125 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, false, true));
/* 126 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, false, true));
/* 127 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, false, true));
/* 128 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, false, true));
/* 129 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, false, true));
/* 130 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, false, true));
/* 131 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, false, true));
/* 132 */     this.targetSelector.addGoal(22, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombifiedPiglin.class, false, true));
/* 133 */     this.targetSelector.addGoal(23, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, false, true));
/* 134 */     this.targetSelector.addGoal(24, (Goal)new NearestAttackableTargetGoal((Mob)this, Zoglin.class, false, true));
/* 135 */     this.goalSelector.addGoal(25, (Goal)new RemoveBlockGoal(Blocks.SMOOTH_STONE, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 138 */             double x = NoiseStalkerEntity.this.getX();
/* 139 */             double y = NoiseStalkerEntity.this.getY();
/* 140 */             double z = NoiseStalkerEntity.this.getZ();
/* 141 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 142 */             Level world = NoiseStalkerEntity.this.level;
/* 143 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 146 */     this.goalSelector.addGoal(26, (Goal)new RemoveBlockGoal(Blocks.SMOOTH_SANDSTONE, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 149 */             double x = NoiseStalkerEntity.this.getX();
/* 150 */             double y = NoiseStalkerEntity.this.getY();
/* 151 */             double z = NoiseStalkerEntity.this.getZ();
/* 152 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 153 */             Level world = NoiseStalkerEntity.this.level;
/* 154 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 157 */     this.goalSelector.addGoal(27, (Goal)new RemoveBlockGoal(Blocks.SMOOTH_RED_SANDSTONE, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 160 */             double x = NoiseStalkerEntity.this.getX();
/* 161 */             double y = NoiseStalkerEntity.this.getY();
/* 162 */             double z = NoiseStalkerEntity.this.getZ();
/* 163 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 164 */             Level world = NoiseStalkerEntity.this.level;
/* 165 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 168 */     this.goalSelector.addGoal(28, (Goal)new RemoveBlockGoal(Blocks.BIRCH_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 171 */             double x = NoiseStalkerEntity.this.getX();
/* 172 */             double y = NoiseStalkerEntity.this.getY();
/* 173 */             double z = NoiseStalkerEntity.this.getZ();
/* 174 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 175 */             Level world = NoiseStalkerEntity.this.level;
/* 176 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 179 */     this.goalSelector.addGoal(29, (Goal)new RemoveBlockGoal(Blocks.SPRUCE_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 182 */             double x = NoiseStalkerEntity.this.getX();
/* 183 */             double y = NoiseStalkerEntity.this.getY();
/* 184 */             double z = NoiseStalkerEntity.this.getZ();
/* 185 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 186 */             Level world = NoiseStalkerEntity.this.level;
/* 187 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 190 */     this.goalSelector.addGoal(30, (Goal)new RemoveBlockGoal(Blocks.OAK_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 193 */             double x = NoiseStalkerEntity.this.getX();
/* 194 */             double y = NoiseStalkerEntity.this.getY();
/* 195 */             double z = NoiseStalkerEntity.this.getZ();
/* 196 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 197 */             Level world = NoiseStalkerEntity.this.level;
/* 198 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 201 */     this.goalSelector.addGoal(31, (Goal)new RemoveBlockGoal(Blocks.JUNGLE_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 204 */             double x = NoiseStalkerEntity.this.getX();
/* 205 */             double y = NoiseStalkerEntity.this.getY();
/* 206 */             double z = NoiseStalkerEntity.this.getZ();
/* 207 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 208 */             Level world = NoiseStalkerEntity.this.level;
/* 209 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 212 */     this.goalSelector.addGoal(32, (Goal)new RemoveBlockGoal(Blocks.ACACIA_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 215 */             double x = NoiseStalkerEntity.this.getX();
/* 216 */             double y = NoiseStalkerEntity.this.getY();
/* 217 */             double z = NoiseStalkerEntity.this.getZ();
/* 218 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 219 */             Level world = NoiseStalkerEntity.this.level;
/* 220 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 223 */     this.goalSelector.addGoal(33, (Goal)new RemoveBlockGoal(Blocks.DARK_OAK_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 226 */             double x = NoiseStalkerEntity.this.getX();
/* 227 */             double y = NoiseStalkerEntity.this.getY();
/* 228 */             double z = NoiseStalkerEntity.this.getZ();
/* 229 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 230 */             Level world = NoiseStalkerEntity.this.level;
/* 231 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 234 */     this.goalSelector.addGoal(34, (Goal)new RemoveBlockGoal(Blocks.CRIMSON_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 237 */             double x = NoiseStalkerEntity.this.getX();
/* 238 */             double y = NoiseStalkerEntity.this.getY();
/* 239 */             double z = NoiseStalkerEntity.this.getZ();
/* 240 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 241 */             Level world = NoiseStalkerEntity.this.level;
/* 242 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 245 */     this.goalSelector.addGoal(35, (Goal)new RemoveBlockGoal(Blocks.WARPED_DOOR, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean canUse() {
/* 248 */             double x = NoiseStalkerEntity.this.getX();
/* 249 */             double y = NoiseStalkerEntity.this.getY();
/* 250 */             double z = NoiseStalkerEntity.this.getZ();
/* 251 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 252 */             Level world = NoiseStalkerEntity.this.level;
/* 253 */             return (super.canUse() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 256 */     this.goalSelector.addGoal(36, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 257 */     this.goalSelector.addGoal(37, (Goal)new RandomLookAroundGoal((Mob)this));
/* 258 */     this.goalSelector.addGoal(38, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 263 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 267 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 268 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 273 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 278 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 283 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 288 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 293 */     if (source == DamageSource.FALL)
/* 294 */       return false; 
/* 295 */     if (source == DamageSource.CACTUS)
/* 296 */       return false; 
/* 297 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 302 */     super.die(source);
/* 303 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 309 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 310 */     NoiseStalkerOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 311 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 316 */     super.awardKillScore(entity, score, damageSource);
/* 317 */     NoiseStalkerThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 322 */     super.playerTouch(sourceentity);
/* 323 */     NightstalkertestPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 330 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 331 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.28D);
/* 332 */     builder = builder.add(Attributes.MAX_HEALTH, 48.0D);
/* 333 */     builder = builder.add(Attributes.ARMOR, 4.0D);
/* 334 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0D);
/* 335 */     builder = builder.add(Attributes.FOLLOW_RANGE, 24.0D);
/* 336 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 337 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 338 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\NoiseStalkerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */