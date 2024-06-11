/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSpiderOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSpiderQueenEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSpiderQueenThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.entity.animal.Fox;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Guardian;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexSpiderQueenEntity extends Monster {
/*  63 */   private final ServerBossEvent bossInfo = new ServerBossEvent(getDisplayName(), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */   
/*     */   public DarkLatexSpiderQueenEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  67 */     this((EntityType<DarkLatexSpiderQueenEntity>)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSpiderQueenEntity(EntityType<DarkLatexSpiderQueenEntity> type, Level world) {
/*  71 */     super(type, world);
/*  72 */     this.xpReward = 12;
/*  73 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  78 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  83 */     super.registerGoals();
/*  84 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  87 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  92 */             double x = DarkLatexSpiderQueenEntity.this.getX();
/*  93 */             double y = DarkLatexSpiderQueenEntity.this.getY();
/*  94 */             double z = DarkLatexSpiderQueenEntity.this.getZ();
/*  95 */             DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = DarkLatexSpiderQueenEntity.this;
/*  96 */             Level world = DarkLatexSpiderQueenEntity.this.level;
/*  97 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexSpiderQueenEntity));
/*     */           }
/*     */         });
/*     */     
/* 101 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 104 */             double x = DarkLatexSpiderQueenEntity.this.getX();
/* 105 */             double y = DarkLatexSpiderQueenEntity.this.getY();
/* 106 */             double z = DarkLatexSpiderQueenEntity.this.getZ();
/* 107 */             DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = DarkLatexSpiderQueenEntity.this;
/* 108 */             Level world = DarkLatexSpiderQueenEntity.this.level;
/* 109 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexSpiderQueenEntity));
/*     */           }
/*     */         });
/* 112 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 115 */             double x = DarkLatexSpiderQueenEntity.this.getX();
/* 116 */             double y = DarkLatexSpiderQueenEntity.this.getY();
/* 117 */             double z = DarkLatexSpiderQueenEntity.this.getZ();
/* 118 */             DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = DarkLatexSpiderQueenEntity.this;
/* 119 */             Level world = DarkLatexSpiderQueenEntity.this.level;
/* 120 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexSpiderQueenEntity));
/*     */           }
/*     */         });
/* 123 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 126 */             double x = DarkLatexSpiderQueenEntity.this.getX();
/* 127 */             double y = DarkLatexSpiderQueenEntity.this.getY();
/* 128 */             double z = DarkLatexSpiderQueenEntity.this.getZ();
/* 129 */             DarkLatexSpiderQueenEntity darkLatexSpiderQueenEntity = DarkLatexSpiderQueenEntity.this;
/* 130 */             Level world = DarkLatexSpiderQueenEntity.this.level;
/* 131 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexSpiderQueenEntity));
/*     */           }
/*     */         });
/* 134 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 135 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 136 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 137 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 138 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 139 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 140 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 141 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 142 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 143 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 144 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, DLbeeEntity.class, true, false));
/* 145 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexQueenBeeEntity.class, true, false));
/* 146 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 147 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 148 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 149 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 150 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 151 */     this.goalSelector.addGoal(22, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 152 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 153 */     this.targetSelector.addGoal(24, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 154 */     this.goalSelector.addGoal(25, (Goal)new RandomLookAroundGoal((Mob)this));
/* 155 */     this.goalSelector.addGoal(26, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 160 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 164 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 165 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 170 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 175 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 180 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 185 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 190 */     DarkLatexSpiderQueenEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 191 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 192 */       return false; 
/* 193 */     if (source == DamageSource.FALL)
/* 194 */       return false; 
/* 195 */     if (source == DamageSource.CACTUS)
/* 196 */       return false; 
/* 197 */     if (source == DamageSource.WITHER)
/* 198 */       return false; 
/* 199 */     if (source.getMsgId().equals("witherSkull"))
/* 200 */       return false; 
/* 201 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 206 */     super.die(source);
/* 207 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 212 */     super.awardKillScore(entity, score, damageSource);
/* 213 */     DarkLatexSpiderQueenThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void baseTick() {
/* 218 */     super.baseTick();
/* 219 */     DarkLatexSpiderOnEntityTickUpdateProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canChangeDimensions() {
/* 224 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void startSeenByPlayer(ServerPlayer player) {
/* 229 */     super.startSeenByPlayer(player);
/* 230 */     this.bossInfo.addPlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stopSeenByPlayer(ServerPlayer player) {
/* 235 */     super.stopSeenByPlayer(player);
/* 236 */     this.bossInfo.removePlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void customServerAiStep() {
/* 241 */     super.customServerAiStep();
/* 242 */     this.bossInfo.setProgress(getHealth() / getMaxHealth());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 249 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 250 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
/* 251 */     builder = builder.add(Attributes.MAX_HEALTH, 150.0D);
/* 252 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 253 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 8.0D);
/* 254 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 255 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.5D);
/* 256 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.0D);
/* 257 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexSpiderQueenEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */