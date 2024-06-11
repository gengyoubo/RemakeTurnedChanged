/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CivilianMilitiaMeleeOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
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
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class CivilianMilitiaMeleeEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public CivilianMilitiaMeleeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  49 */     this((EntityType<CivilianMilitiaMeleeEntity>)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), world);
/*     */   }
/*     */   
/*     */   public CivilianMilitiaMeleeEntity(EntityType<CivilianMilitiaMeleeEntity> type, Level world) {
/*  53 */     super(type, world);
/*  54 */     this.xpReward = 0;
/*  55 */     setNoAi(false);
/*  56 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  61 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  66 */     super.registerGoals();
/*  67 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  68 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  71 */             double x = CivilianMilitiaMeleeEntity.this.getX();
/*  72 */             double y = CivilianMilitiaMeleeEntity.this.getY();
/*  73 */             double z = CivilianMilitiaMeleeEntity.this.getZ();
/*  74 */             CivilianMilitiaMeleeEntity civilianMilitiaMeleeEntity = CivilianMilitiaMeleeEntity.this;
/*  75 */             Level world = CivilianMilitiaMeleeEntity.this.level;
/*  76 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)civilianMilitiaMeleeEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  81 */             double x = CivilianMilitiaMeleeEntity.this.getX();
/*  82 */             double y = CivilianMilitiaMeleeEntity.this.getY();
/*  83 */             double z = CivilianMilitiaMeleeEntity.this.getZ();
/*  84 */             CivilianMilitiaMeleeEntity civilianMilitiaMeleeEntity = CivilianMilitiaMeleeEntity.this;
/*  85 */             Level world = CivilianMilitiaMeleeEntity.this.level;
/*  86 */             return (super.canContinueToUse() && CheckEvilProcedure.execute((Entity)civilianMilitiaMeleeEntity));
/*     */           }
/*     */         });
/*  89 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false));
/*  90 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false));
/*  91 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionermilitiaEntity.class, true, false));
/*  92 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionerMilitiaMeleeEntity.class, true, false));
/*  93 */     this.goalSelector.addGoal(7, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  96 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  99 */     this.targetSelector.addGoal(8, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/* 100 */     this.goalSelector.addGoal(9, (Goal)new OpenDoorGoal((Mob)this, true));
/* 101 */     this.goalSelector.addGoal(10, (Goal)new AvoidEntityGoal(this, Monster.class, 9.0F, 1.2D, 0.8D));
/* 102 */     this.goalSelector.addGoal(11, (Goal)new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0F, 1.2D, 0.8D));
/* 103 */     this.goalSelector.addGoal(12, (Goal)new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0F, 1.2D, 0.8D));
/* 104 */     this.goalSelector.addGoal(13, (Goal)new AvoidEntityGoal(this, PrisionermilitiaEntity.class, 8.0F, 1.2D, 0.8D));
/* 105 */     this.goalSelector.addGoal(14, (Goal)new AvoidEntityGoal(this, PrisionerMilitiaMeleeEntity.class, 8.0F, 1.2D, 0.8D));
/* 106 */     this.goalSelector.addGoal(15, (Goal)new AvoidEntityGoal(this, SlimelingEntity.class, 9.0F, 1.2D, 0.8D));
/* 107 */     this.goalSelector.addGoal(16, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 108 */     this.goalSelector.addGoal(17, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 109 */     this.goalSelector.addGoal(18, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryEntity.class, 6.0F));
/* 110 */     this.goalSelector.addGoal(19, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/* 111 */     this.goalSelector.addGoal(20, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 112 */     this.goalSelector.addGoal(21, (Goal)new RandomStrollGoal(this, 0.6D));
/* 113 */     this.goalSelector.addGoal(22, (Goal)new OpenDoorGoal((Mob)this, false));
/* 114 */     this.goalSelector.addGoal(23, (Goal)new RandomLookAroundGoal((Mob)this));
/* 115 */     this.goalSelector.addGoal(24, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 120 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 130 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 135 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 140 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 146 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 147 */     CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 148 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 155 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 156 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 157 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 158 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 159 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0D);
/* 160 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 161 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\CivilianMilitiaMeleeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */