/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CivlianMilitiaOnInitialEntitySpawnProcedure;
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
/*     */ public class CivlianMilitiaEntity
/*     */   extends PathfinderMob implements RangedAttackMob {
/*     */   public CivlianMilitiaEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  54 */     this((EntityType<CivlianMilitiaEntity>)LatexModEntities.CIVLIAN_MILITIA.get(), world);
/*     */   }
/*     */   
/*     */   public CivlianMilitiaEntity(EntityType<CivlianMilitiaEntity> type, Level world) {
/*  58 */     super(type, world);
/*  59 */     this.xpReward = 0;
/*  60 */     setNoAi(false);
/*  61 */     setPersistenceRequired();
/*  62 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.SCRAP_M_16_RIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  67 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  72 */     super.registerGoals();
/*  73 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  74 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  77 */             double x = CivlianMilitiaEntity.this.getX();
/*  78 */             double y = CivlianMilitiaEntity.this.getY();
/*  79 */             double z = CivlianMilitiaEntity.this.getZ();
/*  80 */             CivlianMilitiaEntity civlianMilitiaEntity = CivlianMilitiaEntity.this;
/*  81 */             Level world = CivlianMilitiaEntity.this.level;
/*  82 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)civlianMilitiaEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  87 */             double x = CivlianMilitiaEntity.this.getX();
/*  88 */             double y = CivlianMilitiaEntity.this.getY();
/*  89 */             double z = CivlianMilitiaEntity.this.getZ();
/*  90 */             CivlianMilitiaEntity civlianMilitiaEntity = CivlianMilitiaEntity.this;
/*  91 */             Level world = CivlianMilitiaEntity.this.level;
/*  92 */             return (super.canContinueToUse() && CheckEvilProcedure.execute((Entity)civlianMilitiaEntity));
/*     */           }
/*     */         });
/*  95 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false));
/*  96 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false));
/*  97 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionermilitiaEntity.class, true, false));
/*  98 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionerMilitiaMeleeEntity.class, true, false));
/*  99 */     this.goalSelector.addGoal(7, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 102 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 105 */     this.targetSelector.addGoal(8, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/* 106 */     this.goalSelector.addGoal(9, (Goal)new OpenDoorGoal((Mob)this, true));
/* 107 */     this.goalSelector.addGoal(10, (Goal)new AvoidEntityGoal(this, Monster.class, 9.0F, 1.2D, 0.8D));
/* 108 */     this.goalSelector.addGoal(11, (Goal)new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0F, 1.2D, 0.8D));
/* 109 */     this.goalSelector.addGoal(12, (Goal)new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0F, 1.2D, 0.8D));
/* 110 */     this.goalSelector.addGoal(13, (Goal)new AvoidEntityGoal(this, PrisionermilitiaEntity.class, 8.0F, 1.2D, 0.8D));
/* 111 */     this.goalSelector.addGoal(14, (Goal)new AvoidEntityGoal(this, PrisionerMilitiaMeleeEntity.class, 8.0F, 1.2D, 0.8D));
/* 112 */     this.goalSelector.addGoal(15, (Goal)new AvoidEntityGoal(this, SlimelingEntity.class, 9.0F, 1.2D, 0.8D));
/* 113 */     this.goalSelector.addGoal(16, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 114 */     this.goalSelector.addGoal(17, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 115 */     this.goalSelector.addGoal(18, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryEntity.class, 6.0F));
/* 116 */     this.goalSelector.addGoal(19, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/* 117 */     this.goalSelector.addGoal(20, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 118 */     this.goalSelector.addGoal(21, (Goal)new RandomStrollGoal(this, 0.6D));
/* 119 */     this.goalSelector.addGoal(22, (Goal)new OpenDoorGoal((Mob)this, false));
/* 120 */     this.goalSelector.addGoal(23, (Goal)new RandomLookAroundGoal((Mob)this));
/* 121 */     this.goalSelector.addGoal(24, (Goal)new FloatGoal((Mob)this));
/* 122 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 125 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 132 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 137 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 142 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 147 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 152 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 158 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 159 */     CivlianMilitiaOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 160 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 165 */     ScrapM16RifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 172 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 173 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 174 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 175 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 176 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 177 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 178 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\CivlianMilitiaEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */