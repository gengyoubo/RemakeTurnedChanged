/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CivilianMilitiaMeleeOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.TargethasabatonProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
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
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class PrisionerMilitiaMeleeEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public PrisionerMilitiaMeleeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  53 */     this((EntityType<PrisionerMilitiaMeleeEntity>)LatexModEntities.PRISIONER_MILITIA_MELEE.get(), world);
/*     */   }
/*     */   
/*     */   public PrisionerMilitiaMeleeEntity(EntityType<PrisionerMilitiaMeleeEntity> type, Level world) {
/*  57 */     super(type, world);
/*  58 */     this.xpReward = 0;
/*  59 */     setNoAi(false);
/*  60 */     setPersistenceRequired();
/*  61 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.MATCH_LOCK_MUSKET.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  71 */     super.registerGoals();
/*  72 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  73 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  76 */             double x = PrisionerMilitiaMeleeEntity.this.getX();
/*  77 */             double y = PrisionerMilitiaMeleeEntity.this.getY();
/*  78 */             double z = PrisionerMilitiaMeleeEntity.this.getZ();
/*  79 */             PrisionerMilitiaMeleeEntity prisionerMilitiaMeleeEntity = PrisionerMilitiaMeleeEntity.this;
/*  80 */             Level world = PrisionerMilitiaMeleeEntity.this.level;
/*  81 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)prisionerMilitiaMeleeEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  86 */             double x = PrisionerMilitiaMeleeEntity.this.getX();
/*  87 */             double y = PrisionerMilitiaMeleeEntity.this.getY();
/*  88 */             double z = PrisionerMilitiaMeleeEntity.this.getZ();
/*  89 */             PrisionerMilitiaMeleeEntity prisionerMilitiaMeleeEntity = PrisionerMilitiaMeleeEntity.this;
/*  90 */             Level world = PrisionerMilitiaMeleeEntity.this.level;
/*  91 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)prisionerMilitiaMeleeEntity));
/*     */           }
/*     */         });
/*  94 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/*  95 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/*  96 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/*  97 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/*  98 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/*  99 */     this.targetSelector.addGoal(8, (Goal)new HurtByTargetGoal(this, new Class[0])
/*     */         {
/*     */           public boolean canUse() {
/* 102 */             double x = PrisionerMilitiaMeleeEntity.this.getX();
/* 103 */             double y = PrisionerMilitiaMeleeEntity.this.getY();
/* 104 */             double z = PrisionerMilitiaMeleeEntity.this.getZ();
/* 105 */             PrisionerMilitiaMeleeEntity prisionerMilitiaMeleeEntity = PrisionerMilitiaMeleeEntity.this;
/* 106 */             Level world = PrisionerMilitiaMeleeEntity.this.level;
/* 107 */             return (super.canUse() && TargethasabatonProcedure.execute((Entity)prisionerMilitiaMeleeEntity));
/*     */           }
/*     */         });
/* 110 */     this.goalSelector.addGoal(9, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 113 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 116 */     this.goalSelector.addGoal(10, (Goal)new OpenDoorGoal((Mob)this, true));
/* 117 */     this.goalSelector.addGoal(11, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 118 */     this.goalSelector.addGoal(12, (Goal)new AvoidEntityGoal(this, Monster.class, 7.0F, 1.5D, 0.8D));
/* 119 */     this.goalSelector.addGoal(13, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/* 120 */     this.goalSelector.addGoal(14, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 121 */     this.goalSelector.addGoal(15, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/* 122 */     this.goalSelector.addGoal(16, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F));
/* 123 */     this.goalSelector.addGoal(17, (Goal)new RandomStrollGoal(this, 0.6D));
/* 124 */     this.goalSelector.addGoal(18, (Goal)new OpenDoorGoal((Mob)this, false));
/* 125 */     this.goalSelector.addGoal(19, (Goal)new RandomLookAroundGoal((Mob)this));
/* 126 */     this.goalSelector.addGoal(20, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 131 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 141 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 146 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 151 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 157 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 158 */     CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 159 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 166 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 167 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 168 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 169 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 170 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 171 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 172 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\PrisionerMilitiaMeleeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */