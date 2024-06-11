/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexDragonEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexDragonEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexDragonThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexDragonEntity
/*     */   extends Monster {
/*  57 */   private final ServerBossEvent bossInfo = new ServerBossEvent(getDisplayName(), BossEvent.BossBarColor.WHITE, BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */   
/*     */   public DarkLatexDragonEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  61 */     this((EntityType<DarkLatexDragonEntity>)LatexModEntities.DARK_LATEX_DRAGON.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexDragonEntity(EntityType<DarkLatexDragonEntity> type, Level world) {
/*  65 */     super(type, world);
/*  66 */     this.xpReward = 32;
/*  67 */     setNoAi(false);
/*  68 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  73 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  78 */     super.registerGoals();
/*  79 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  82 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  87 */             double x = DarkLatexDragonEntity.this.getX();
/*  88 */             double y = DarkLatexDragonEntity.this.getY();
/*  89 */             double z = DarkLatexDragonEntity.this.getZ();
/*  90 */             DarkLatexDragonEntity darkLatexDragonEntity = DarkLatexDragonEntity.this;
/*  91 */             Level world = DarkLatexDragonEntity.this.level;
/*  92 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexDragonEntity));
/*     */           }
/*     */         });
/*     */     
/*  96 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  97 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 100 */             double x = DarkLatexDragonEntity.this.getX();
/* 101 */             double y = DarkLatexDragonEntity.this.getY();
/* 102 */             double z = DarkLatexDragonEntity.this.getZ();
/* 103 */             DarkLatexDragonEntity darkLatexDragonEntity = DarkLatexDragonEntity.this;
/* 104 */             Level world = DarkLatexDragonEntity.this.level;
/* 105 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexDragonEntity));
/*     */           }
/*     */         });
/* 108 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 111 */             double x = DarkLatexDragonEntity.this.getX();
/* 112 */             double y = DarkLatexDragonEntity.this.getY();
/* 113 */             double z = DarkLatexDragonEntity.this.getZ();
/* 114 */             DarkLatexDragonEntity darkLatexDragonEntity = DarkLatexDragonEntity.this;
/* 115 */             Level world = DarkLatexDragonEntity.this.level;
/* 116 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexDragonEntity));
/*     */           }
/*     */         });
/* 119 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 122 */             double x = DarkLatexDragonEntity.this.getX();
/* 123 */             double y = DarkLatexDragonEntity.this.getY();
/* 124 */             double z = DarkLatexDragonEntity.this.getZ();
/* 125 */             DarkLatexDragonEntity darkLatexDragonEntity = DarkLatexDragonEntity.this;
/* 126 */             Level world = DarkLatexDragonEntity.this.level;
/* 127 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexDragonEntity));
/*     */           }
/*     */         });
/* 130 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 131 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 132 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 133 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 134 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 135 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 136 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 137 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 138 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 139 */     this.goalSelector.addGoal(15, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 140 */     this.goalSelector.addGoal(16, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 5.0F));
/* 141 */     this.goalSelector.addGoal(17, (Goal)new RandomLookAroundGoal((Mob)this));
/* 142 */     this.goalSelector.addGoal(18, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 147 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 152 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 156 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 157 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 162 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 167 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 172 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 177 */     DarkLatexDragonEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 178 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 179 */       return false; 
/* 180 */     if (source == DamageSource.FALL)
/* 181 */       return false; 
/* 182 */     if (source == DamageSource.CACTUS)
/* 183 */       return false; 
/* 184 */     if (source == DamageSource.DROWN)
/* 185 */       return false; 
/* 186 */     if (source == DamageSource.WITHER)
/* 187 */       return false; 
/* 188 */     if (source.getMsgId().equals("witherSkull"))
/* 189 */       return false; 
/* 190 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 195 */     super.die(source);
/* 196 */     DarkLatexDragonEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 201 */     super.awardKillScore(entity, score, damageSource);
/* 202 */     DarkLatexDragonThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canChangeDimensions() {
/* 207 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void startSeenByPlayer(ServerPlayer player) {
/* 212 */     super.startSeenByPlayer(player);
/* 213 */     this.bossInfo.addPlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stopSeenByPlayer(ServerPlayer player) {
/* 218 */     super.stopSeenByPlayer(player);
/* 219 */     this.bossInfo.removePlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void customServerAiStep() {
/* 224 */     super.customServerAiStep();
/* 225 */     this.bossInfo.setProgress(getHealth() / getMaxHealth());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 232 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 233 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.28D);
/* 234 */     builder = builder.add(Attributes.MAX_HEALTH, 150.0D);
/* 235 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 236 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0D);
/* 237 */     builder = builder.add(Attributes.FOLLOW_RANGE, 32.0D);
/* 238 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2.0D);
/* 239 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.7999999999999999D);
/* 240 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexDragonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */