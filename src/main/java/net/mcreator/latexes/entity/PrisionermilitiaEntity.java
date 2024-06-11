/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.PrisionermilitiaOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class PrisionermilitiaEntity
/*     */   extends PathfinderMob implements RangedAttackMob {
/*     */   public PrisionermilitiaEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<PrisionermilitiaEntity>)LatexModEntities.PRISIONERMILITIA.get(), world);
/*     */   }
/*     */   
/*     */   public PrisionermilitiaEntity(EntityType<PrisionermilitiaEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.xpReward = 0;
/*  61 */     setNoAi(false);
/*  62 */     setPersistenceRequired();
/*  63 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.SCRAP_M_16_RIFLE.get()));
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
/*  74 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  75 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  78 */             double x = PrisionermilitiaEntity.this.getX();
/*  79 */             double y = PrisionermilitiaEntity.this.getY();
/*  80 */             double z = PrisionermilitiaEntity.this.getZ();
/*  81 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/*  82 */             Level world = PrisionermilitiaEntity.this.level;
/*  83 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  88 */             double x = PrisionermilitiaEntity.this.getX();
/*  89 */             double y = PrisionermilitiaEntity.this.getY();
/*  90 */             double z = PrisionermilitiaEntity.this.getZ();
/*  91 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/*  92 */             Level world = PrisionermilitiaEntity.this.level;
/*  93 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */         });
/*  96 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  99 */             double x = PrisionermilitiaEntity.this.getX();
/* 100 */             double y = PrisionermilitiaEntity.this.getY();
/* 101 */             double z = PrisionermilitiaEntity.this.getZ();
/* 102 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/* 103 */             Level world = PrisionermilitiaEntity.this.level;
/* 104 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 109 */             double x = PrisionermilitiaEntity.this.getX();
/* 110 */             double y = PrisionermilitiaEntity.this.getY();
/* 111 */             double z = PrisionermilitiaEntity.this.getZ();
/* 112 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/* 113 */             Level world = PrisionermilitiaEntity.this.level;
/* 114 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */         });
/* 117 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/* 118 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/* 119 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/* 120 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/* 121 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/* 122 */     this.targetSelector.addGoal(9, (Goal)new HurtByTargetGoal(this, new Class[0])
/*     */         {
/*     */           public boolean canUse() {
/* 125 */             double x = PrisionermilitiaEntity.this.getX();
/* 126 */             double y = PrisionermilitiaEntity.this.getY();
/* 127 */             double z = PrisionermilitiaEntity.this.getZ();
/* 128 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/* 129 */             Level world = PrisionermilitiaEntity.this.level;
/* 130 */             return (super.canUse() && TargethasabatonProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */         });
/* 133 */     this.goalSelector.addGoal(10, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 136 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 139 */     this.goalSelector.addGoal(11, (Goal)new OpenDoorGoal((Mob)this, true));
/* 140 */     this.goalSelector.addGoal(12, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 141 */     this.goalSelector.addGoal(13, (Goal)new AvoidEntityGoal(this, Monster.class, 7.0F, 1.5D, 0.8D));
/* 142 */     this.goalSelector.addGoal(14, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/* 143 */     this.goalSelector.addGoal(15, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 144 */     this.goalSelector.addGoal(16, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/* 145 */     this.goalSelector.addGoal(17, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F));
/* 146 */     this.goalSelector.addGoal(18, (Goal)new RandomStrollGoal(this, 0.6D));
/* 147 */     this.goalSelector.addGoal(19, (Goal)new OpenDoorGoal((Mob)this, false));
/* 148 */     this.goalSelector.addGoal(20, (Goal)new RandomLookAroundGoal((Mob)this));
/* 149 */     this.goalSelector.addGoal(21, (Goal)new FloatGoal((Mob)this));
/* 150 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 153 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 160 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 165 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 170 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 175 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 180 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 186 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 187 */     PrisionermilitiaOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 188 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 193 */     ScrapM16RifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 200 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 201 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 202 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 203 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 204 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 205 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 206 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\PrisionermilitiaEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */