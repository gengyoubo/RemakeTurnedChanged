/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSkeletonThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
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
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
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
/*     */ import net.minecraft.world.entity.monster.Skeleton;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.WitherSkeleton;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexSkeletonEntity extends Monster {
/*     */   public DarkLatexSkeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  62 */     this((EntityType<DarkLatexSkeletonEntity>)LatexModEntities.DARK_LATEX_SKELETON.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSkeletonEntity(EntityType<DarkLatexSkeletonEntity> type, Level world) {
/*  66 */     super(type, world);
/*  67 */     this.xpReward = 8;
/*  68 */     setNoAi(false);
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
/*  87 */             double x = DarkLatexSkeletonEntity.this.getX();
/*  88 */             double y = DarkLatexSkeletonEntity.this.getY();
/*  89 */             double z = DarkLatexSkeletonEntity.this.getZ();
/*  90 */             DarkLatexSkeletonEntity darkLatexSkeletonEntity = DarkLatexSkeletonEntity.this;
/*  91 */             Level world = DarkLatexSkeletonEntity.this.level;
/*  92 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexSkeletonEntity));
/*     */           }
/*     */         });
/*     */     
/*  96 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  97 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 100 */             double x = DarkLatexSkeletonEntity.this.getX();
/* 101 */             double y = DarkLatexSkeletonEntity.this.getY();
/* 102 */             double z = DarkLatexSkeletonEntity.this.getZ();
/* 103 */             DarkLatexSkeletonEntity darkLatexSkeletonEntity = DarkLatexSkeletonEntity.this;
/* 104 */             Level world = DarkLatexSkeletonEntity.this.level;
/* 105 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexSkeletonEntity));
/*     */           }
/*     */         });
/* 108 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 111 */             double x = DarkLatexSkeletonEntity.this.getX();
/* 112 */             double y = DarkLatexSkeletonEntity.this.getY();
/* 113 */             double z = DarkLatexSkeletonEntity.this.getZ();
/* 114 */             DarkLatexSkeletonEntity darkLatexSkeletonEntity = DarkLatexSkeletonEntity.this;
/* 115 */             Level world = DarkLatexSkeletonEntity.this.level;
/* 116 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexSkeletonEntity));
/*     */           }
/*     */         });
/* 119 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 122 */             double x = DarkLatexSkeletonEntity.this.getX();
/* 123 */             double y = DarkLatexSkeletonEntity.this.getY();
/* 124 */             double z = DarkLatexSkeletonEntity.this.getZ();
/* 125 */             DarkLatexSkeletonEntity darkLatexSkeletonEntity = DarkLatexSkeletonEntity.this;
/* 126 */             Level world = DarkLatexSkeletonEntity.this.level;
/* 127 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexSkeletonEntity));
/*     */           }
/*     */         });
/* 130 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Skeleton.class, false, true));
/* 131 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WitherSkeleton.class, false, true));
/* 132 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 133 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 134 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 135 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 136 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 137 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 138 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 139 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 140 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 141 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 142 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 143 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 144 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 145 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 146 */     this.goalSelector.addGoal(22, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 147 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 148 */     this.goalSelector.addGoal(24, (Goal)new LookAtPlayerGoal((Mob)this, DarkLatexDragonEntity.class, 7.0F));
/* 149 */     this.goalSelector.addGoal(25, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/* 150 */     this.goalSelector.addGoal(26, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 153 */             double x = DarkLatexSkeletonEntity.this.getX();
/* 154 */             double y = DarkLatexSkeletonEntity.this.getY();
/* 155 */             double z = DarkLatexSkeletonEntity.this.getZ();
/* 156 */             DarkLatexSkeletonEntity darkLatexSkeletonEntity = DarkLatexSkeletonEntity.this;
/* 157 */             Level world = DarkLatexSkeletonEntity.this.level;
/* 158 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darkLatexSkeletonEntity));
/*     */           }
/*     */         });
/* 161 */     this.goalSelector.addGoal(27, (Goal)new RandomLookAroundGoal((Mob)this));
/* 162 */     this.goalSelector.addGoal(28, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 167 */     return MobType.UNDEAD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 171 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 172 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 177 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 182 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 187 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 192 */     if (source == DamageSource.FALL)
/* 193 */       return false; 
/* 194 */     if (source == DamageSource.CACTUS)
/* 195 */       return false; 
/* 196 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 201 */     super.die(source);
/* 202 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 207 */     super.awardKillScore(entity, score, damageSource);
/* 208 */     DarkLatexSkeletonThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 215 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 216 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 217 */     builder = builder.add(Attributes.MAX_HEALTH, 24.0D);
/* 218 */     builder = builder.add(Attributes.ARMOR, 2.5D);
/* 219 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 220 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 221 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4D);
/* 222 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1D);
/* 223 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexSkeletonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */