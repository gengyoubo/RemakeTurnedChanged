/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.PanicGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
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
/*     */ public class EvilScientistEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public EvilScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  47 */     this((EntityType<EvilScientistEntity>)LatexModEntities.EVIL_SCIENTIST.get(), world);
/*     */   }
/*     */   
/*     */   public EvilScientistEntity(EntityType<EvilScientistEntity> type, Level world) {
/*  51 */     super(type, world);
/*  52 */     this.xpReward = 0;
/*  53 */     setNoAi(false);
/*  54 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  59 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  64 */     super.registerGoals();
/*  65 */     this.goalSelector.addGoal(1, (Goal)new AvoidEntityGoal(this, Monster.class, 6.0F, 1.2D, 0.9D));
/*  66 */     this.goalSelector.addGoal(2, (Goal)new AvoidEntityGoal<PathfinderMob>(this, PathfinderMob.class, 8.0F, 1.5D, 0.8D)
/*     */         {
/*     */           public boolean canUse() {
/*  69 */             double x = EvilScientistEntity.this.getX();
/*  70 */             double y = EvilScientistEntity.this.getY();
/*  71 */             double z = EvilScientistEntity.this.getZ();
/*  72 */             EvilScientistEntity evilScientistEntity = EvilScientistEntity.this;
/*  73 */             Level world = EvilScientistEntity.this.level;
/*  74 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)evilScientistEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  79 */             double x = EvilScientistEntity.this.getX();
/*  80 */             double y = EvilScientistEntity.this.getY();
/*  81 */             double z = EvilScientistEntity.this.getZ();
/*  82 */             EvilScientistEntity evilScientistEntity = EvilScientistEntity.this;
/*  83 */             Level world = EvilScientistEntity.this.level;
/*  84 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)evilScientistEntity));
/*     */           }
/*     */         });
/*  87 */     this.goalSelector.addGoal(3, (Goal)new PanicGoal(this, 1.2D));
/*  88 */     this.targetSelector.addGoal(4, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/*  89 */     this.goalSelector.addGoal(5, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  90 */     this.goalSelector.addGoal(6, (Goal)new RandomStrollGoal(this, 1.0D));
/*  91 */     this.goalSelector.addGoal(7, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 6.0F));
/*  92 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  93 */     this.goalSelector.addGoal(9, (Goal)new OpenDoorGoal((Mob)this, true));
/*  94 */     this.goalSelector.addGoal(10, (Goal)new OpenDoorGoal((Mob)this, false));
/*  95 */     this.goalSelector.addGoal(11, (Goal)new RandomLookAroundGoal((Mob)this));
/*  96 */     this.goalSelector.addGoal(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 101 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 106 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 111 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 116 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 121 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 127 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 128 */     ScientistOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 129 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 136 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 137 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 138 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 139 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 140 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 141 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 142 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\EvilScientistEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */