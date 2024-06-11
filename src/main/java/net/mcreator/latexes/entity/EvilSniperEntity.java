/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.ScientistOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
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
/*     */ public class EvilSniperEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob {
/*     */   public EvilSniperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<EvilSniperEntity>)LatexModEntities.EVIL_SNIPER.get(), world);
/*     */   }
/*     */   
/*     */   public EvilSniperEntity(EntityType<EvilSniperEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.xpReward = 0;
/*  61 */     setNoAi(false);
/*  62 */     setPersistenceRequired();
/*  63 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  68 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  73 */     super.registerGoals();
/*  74 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  75 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  78 */             double x = EvilSniperEntity.this.getX();
/*  79 */             double y = EvilSniperEntity.this.getY();
/*  80 */             double z = EvilSniperEntity.this.getZ();
/*  81 */             EvilSniperEntity evilSniperEntity = EvilSniperEntity.this;
/*  82 */             Level world = EvilSniperEntity.this.level;
/*  83 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)evilSniperEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  88 */             double x = EvilSniperEntity.this.getX();
/*  89 */             double y = EvilSniperEntity.this.getY();
/*  90 */             double z = EvilSniperEntity.this.getZ();
/*  91 */             EvilSniperEntity evilSniperEntity = EvilSniperEntity.this;
/*  92 */             Level world = EvilSniperEntity.this.level;
/*  93 */             return (super.canContinueToUse() && CheckentityislatexProcedure.execute((Entity)evilSniperEntity));
/*     */           }
/*     */         });
/*  96 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  99 */             double x = EvilSniperEntity.this.getX();
/* 100 */             double y = EvilSniperEntity.this.getY();
/* 101 */             double z = EvilSniperEntity.this.getZ();
/* 102 */             EvilSniperEntity evilSniperEntity = EvilSniperEntity.this;
/* 103 */             Level world = EvilSniperEntity.this.level;
/* 104 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)evilSniperEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 109 */             double x = EvilSniperEntity.this.getX();
/* 110 */             double y = EvilSniperEntity.this.getY();
/* 111 */             double z = EvilSniperEntity.this.getZ();
/* 112 */             EvilSniperEntity evilSniperEntity = EvilSniperEntity.this;
/* 113 */             Level world = EvilSniperEntity.this.level;
/* 114 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)evilSniperEntity));
/*     */           }
/*     */         });
/* 117 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 120 */             double x = EvilSniperEntity.this.getX();
/* 121 */             double y = EvilSniperEntity.this.getY();
/* 122 */             double z = EvilSniperEntity.this.getZ();
/* 123 */             EvilSniperEntity evilSniperEntity = EvilSniperEntity.this;
/* 124 */             Level world = EvilSniperEntity.this.level;
/* 125 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)evilSniperEntity));
/*     */           }
/*     */         });
/* 128 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/* 129 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/* 130 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/* 131 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/* 132 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/* 133 */     this.goalSelector.addGoal(10, (Goal)new MeleeAttackGoal(this, 0.9D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 136 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 139 */     this.targetSelector.addGoal(11, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/* 140 */     this.goalSelector.addGoal(12, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 141 */     this.goalSelector.addGoal(13, (Goal)new RandomStrollGoal(this, 1.0D));
/* 142 */     this.goalSelector.addGoal(14, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 143 */     this.goalSelector.addGoal(15, (Goal)new LookAtPlayerGoal((Mob)this, EvilSniperEntity.class, 6.0F));
/* 144 */     this.goalSelector.addGoal(16, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/* 145 */     this.goalSelector.addGoal(17, (Goal)new LookAtPlayerGoal((Mob)this, TSCOutsiderGunnerEntity.class, 6.0F));
/* 146 */     this.goalSelector.addGoal(18, (Goal)new LookAtPlayerGoal((Mob)this, TSCHunterEntity.class, 6.0F));
/* 147 */     this.goalSelector.addGoal(19, (Goal)new OpenDoorGoal((Mob)this, true));
/* 148 */     this.goalSelector.addGoal(20, (Goal)new OpenDoorGoal((Mob)this, false));
/* 149 */     this.goalSelector.addGoal(21, (Goal)new RandomLookAroundGoal((Mob)this));
/* 150 */     this.goalSelector.addGoal(22, (Goal)new FloatGoal((Mob)this));
/* 151 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 154 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 161 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 166 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 171 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 176 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 181 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 187 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 188 */     ScientistOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 189 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 194 */     DartrifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 201 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 202 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 203 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 204 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 205 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 206 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 207 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\EvilSniperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */