/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckRobotProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.EvilMilitaryOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingbadberetProcedure;
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
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class EvilMilitaryEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public EvilMilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  59 */     this((EntityType<EvilMilitaryEntity>)LatexModEntities.EVIL_MILITARY.get(), world);
/*     */   }
/*     */   
/*     */   public EvilMilitaryEntity(EntityType<EvilMilitaryEntity> type, Level world) {
/*  63 */     super(type, world);
/*  64 */     this.xpReward = 0;
/*  65 */     setNoAi(false);
/*  66 */     setPersistenceRequired();
/*  67 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.AR_70_ASSAULT_RIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  72 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  77 */     super.registerGoals();
/*  78 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  81 */             double x = EvilMilitaryEntity.this.getX();
/*  82 */             double y = EvilMilitaryEntity.this.getY();
/*  83 */             double z = EvilMilitaryEntity.this.getZ();
/*  84 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/*  85 */             Level world = EvilMilitaryEntity.this.level;
/*  86 */             return (super.canUse() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  91 */             double x = EvilMilitaryEntity.this.getX();
/*  92 */             double y = EvilMilitaryEntity.this.getY();
/*  93 */             double z = EvilMilitaryEntity.this.getZ();
/*  94 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/*  95 */             Level world = EvilMilitaryEntity.this.level;
/*  96 */             return (super.canContinueToUse() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/*  99 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 102 */             double x = EvilMilitaryEntity.this.getX();
/* 103 */             double y = EvilMilitaryEntity.this.getY();
/* 104 */             double z = EvilMilitaryEntity.this.getZ();
/* 105 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 106 */             Level world = EvilMilitaryEntity.this.level;
/* 107 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 112 */             double x = EvilMilitaryEntity.this.getX();
/* 113 */             double y = EvilMilitaryEntity.this.getY();
/* 114 */             double z = EvilMilitaryEntity.this.getZ();
/* 115 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 116 */             Level world = EvilMilitaryEntity.this.level;
/* 117 */             return (super.canContinueToUse() && CheckentityislatexProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/* 120 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 123 */             double x = EvilMilitaryEntity.this.getX();
/* 124 */             double y = EvilMilitaryEntity.this.getY();
/* 125 */             double z = EvilMilitaryEntity.this.getZ();
/* 126 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 127 */             Level world = EvilMilitaryEntity.this.level;
/* 128 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 133 */             double x = EvilMilitaryEntity.this.getX();
/* 134 */             double y = EvilMilitaryEntity.this.getY();
/* 135 */             double z = EvilMilitaryEntity.this.getZ();
/* 136 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 137 */             Level world = EvilMilitaryEntity.this.level;
/* 138 */             return (super.canContinueToUse() && CheckGoodProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/* 141 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/* 142 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/* 143 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/* 144 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianEntity.class, true, false));
/* 145 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/* 146 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/* 147 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 148 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 149 */     this.goalSelector.addGoal(12, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 152 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/* 157 */             double x = EvilMilitaryEntity.this.getX();
/* 158 */             double y = EvilMilitaryEntity.this.getY();
/* 159 */             double z = EvilMilitaryEntity.this.getZ();
/* 160 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 161 */             Level world = EvilMilitaryEntity.this.level;
/* 162 */             return (super.canUse() && CheckRobotProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/*     */     
/* 166 */     this.targetSelector.addGoal(13, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/* 167 */     this.goalSelector.addGoal(14, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 168 */     this.goalSelector.addGoal(15, (Goal)new RandomStrollGoal(this, 1.0D));
/* 169 */     this.goalSelector.addGoal(16, (Goal)new OpenDoorGoal((Mob)this, true));
/* 170 */     this.goalSelector.addGoal(17, (Goal)new OpenDoorGoal((Mob)this, false));
/* 171 */     this.goalSelector.addGoal(18, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 174 */             double x = EvilMilitaryEntity.this.getX();
/* 175 */             double y = EvilMilitaryEntity.this.getY();
/* 176 */             double z = EvilMilitaryEntity.this.getZ();
/* 177 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 178 */             Level world = EvilMilitaryEntity.this.level;
/* 179 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/* 182 */     this.goalSelector.addGoal(19, (Goal)new LookAtPlayerGoal((Mob)this, PrisionerEntity.class, 5.0F));
/* 183 */     this.goalSelector.addGoal(20, (Goal)new RandomLookAroundGoal((Mob)this));
/* 184 */     this.goalSelector.addGoal(21, (Goal)new FloatGoal((Mob)this));
/* 185 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 188 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 195 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 200 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 205 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 210 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 215 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 216 */       return false; 
/* 217 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 223 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 224 */     EvilMilitaryOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 225 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 230 */     AR70AssaultRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 237 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 238 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 239 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 240 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 241 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 242 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 243 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\EvilMilitaryEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */