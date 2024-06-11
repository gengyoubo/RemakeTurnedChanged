/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.MilitaryRiotOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Ravager;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class MilitaryRiotEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public MilitaryRiotEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<MilitaryRiotEntity>)LatexModEntities.MILITARY_RIOT.get(), world);
/*     */   }
/*     */   
/*     */   public MilitaryRiotEntity(EntityType<MilitaryRiotEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.xpReward = 6;
/*  62 */     setNoAi(false);
/*  63 */     setPersistenceRequired();
/*  64 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.BATON.get()));
/*  65 */     setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_HELMET.get()));
/*  66 */     setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_CHESTPLATE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  71 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  76 */     super.registerGoals();
/*  77 */     this.targetSelector.addGoal(1, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/*  78 */     this.goalSelector.addGoal(2, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  81 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  84 */     this.goalSelector.addGoal(3, (Goal)new OpenDoorGoal((Mob)this, true));
/*  85 */     this.goalSelector.addGoal(4, (Goal)new RandomStrollGoal(this, 0.6D));
/*  86 */     this.goalSelector.addGoal(5, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/*  89 */             double x = MilitaryRiotEntity.this.getX();
/*  90 */             double y = MilitaryRiotEntity.this.getY();
/*  91 */             double z = MilitaryRiotEntity.this.getZ();
/*  92 */             MilitaryRiotEntity militaryRiotEntity = MilitaryRiotEntity.this;
/*  93 */             Level world = MilitaryRiotEntity.this.level;
/*  94 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)militaryRiotEntity));
/*     */           }
/*     */         });
/*  97 */     this.goalSelector.addGoal(6, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/*  98 */     this.goalSelector.addGoal(7, (Goal)new OpenDoorGoal((Mob)this, false));
/*  99 */     this.goalSelector.addGoal(8, (Goal)new RandomLookAroundGoal((Mob)this));
/* 100 */     this.goalSelector.addGoal(9, (Goal)new FloatGoal((Mob)this));
/* 101 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/* 102 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 105 */             double x = MilitaryRiotEntity.this.getX();
/* 106 */             double y = MilitaryRiotEntity.this.getY();
/* 107 */             double z = MilitaryRiotEntity.this.getZ();
/* 108 */             MilitaryRiotEntity militaryRiotEntity = MilitaryRiotEntity.this;
/* 109 */             Level world = MilitaryRiotEntity.this.level;
/* 110 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)militaryRiotEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 115 */             double x = MilitaryRiotEntity.this.getX();
/* 116 */             double y = MilitaryRiotEntity.this.getY();
/* 117 */             double z = MilitaryRiotEntity.this.getZ();
/* 118 */             MilitaryRiotEntity militaryRiotEntity = MilitaryRiotEntity.this;
/* 119 */             Level world = MilitaryRiotEntity.this.level;
/* 120 */             return (super.canContinueToUse() && CheckEvilProcedure.execute((Entity)militaryRiotEntity));
/*     */           }
/*     */         });
/* 123 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, false));
/* 124 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 127 */             double x = MilitaryRiotEntity.this.getX();
/* 128 */             double y = MilitaryRiotEntity.this.getY();
/* 129 */             double z = MilitaryRiotEntity.this.getZ();
/* 130 */             MilitaryRiotEntity militaryRiotEntity = MilitaryRiotEntity.this;
/* 131 */             Level world = MilitaryRiotEntity.this.level;
/* 132 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)militaryRiotEntity));
/*     */           }
/*     */         });
/* 135 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/* 136 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 137 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Ravager.class, true, false));
/* 138 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/* 139 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 140 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 141 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 142 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
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
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 157 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 162 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 168 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 169 */     MilitaryRiotOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 170 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 177 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 178 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 179 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 180 */     builder = builder.add(Attributes.ARMOR, 1.5D);
/* 181 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 182 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 183 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.6D);
/* 184 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 185 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\MilitaryRiotEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */