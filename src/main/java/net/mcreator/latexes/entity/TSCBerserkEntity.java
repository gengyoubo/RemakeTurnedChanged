/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.TSCOutsiderEntityDiesProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
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
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class TSCBerserkEntity
/*     */   extends Monster {
/*     */   public TSCBerserkEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  47 */     this((EntityType<TSCBerserkEntity>)LatexModEntities.TSC_BERSERK.get(), world);
/*     */   }
/*     */   
/*     */   public TSCBerserkEntity(EntityType<TSCBerserkEntity> type, Level world) {
/*  51 */     super(type, world);
/*  52 */     this.xpReward = 16;
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
/*  65 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.25D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  68 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  71 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  72 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  75 */             double x = TSCBerserkEntity.this.getX();
/*  76 */             double y = TSCBerserkEntity.this.getY();
/*  77 */             double z = TSCBerserkEntity.this.getZ();
/*  78 */             TSCBerserkEntity tSCBerserkEntity = TSCBerserkEntity.this;
/*  79 */             Level world = TSCBerserkEntity.this.level;
/*  80 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCBerserkEntity));
/*     */           }
/*     */         });
/*  83 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  86 */             double x = TSCBerserkEntity.this.getX();
/*  87 */             double y = TSCBerserkEntity.this.getY();
/*  88 */             double z = TSCBerserkEntity.this.getZ();
/*  89 */             TSCBerserkEntity tSCBerserkEntity = TSCBerserkEntity.this;
/*  90 */             Level world = TSCBerserkEntity.this.level;
/*  91 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCBerserkEntity));
/*     */           }
/*     */         });
/*  94 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  95 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  96 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  97 */     this.goalSelector.addGoal(8, (Goal)new OpenDoorGoal((Mob)this, true));
/*  98 */     this.goalSelector.addGoal(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.75D));
/*  99 */     this.goalSelector.addGoal(10, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 102 */             double x = TSCBerserkEntity.this.getX();
/* 103 */             double y = TSCBerserkEntity.this.getY();
/* 104 */             double z = TSCBerserkEntity.this.getZ();
/* 105 */             TSCBerserkEntity tSCBerserkEntity = TSCBerserkEntity.this;
/* 106 */             Level world = TSCBerserkEntity.this.level;
/* 107 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)tSCBerserkEntity));
/*     */           }
/*     */         });
/* 110 */     this.goalSelector.addGoal(11, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F));
/* 111 */     this.goalSelector.addGoal(12, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/* 112 */     this.targetSelector.addGoal(13, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 113 */     this.goalSelector.addGoal(14, (Goal)new OpenDoorGoal((Mob)this, false));
/* 114 */     this.goalSelector.addGoal(15, (Goal)new RandomLookAroundGoal((Mob)this));
/* 115 */     this.goalSelector.addGoal(16, (Goal)new FloatGoal((Mob)this));
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
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 129 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 130 */     spawnAtLocation(new ItemStack((ItemLike)Items.IRON_INGOT));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 135 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 140 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 145 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 150 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 151 */       return false; 
/* 152 */     if (source == DamageSource.CACTUS)
/* 153 */       return false; 
/* 154 */     if (source == DamageSource.DROWN)
/* 155 */       return false; 
/* 156 */     if (source == DamageSource.DRAGON_BREATH)
/* 157 */       return false; 
/* 158 */     if (source == DamageSource.WITHER)
/* 159 */       return false; 
/* 160 */     if (source.getMsgId().equals("witherSkull"))
/* 161 */       return false; 
/* 162 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 167 */     super.die(source);
/* 168 */     TSCOutsiderEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 175 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 176 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 177 */     builder = builder.add(Attributes.MAX_HEALTH, 72.0D);
/* 178 */     builder = builder.add(Attributes.ARMOR, 7.199999999999999D);
/* 179 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 8.0D);
/* 180 */     builder = builder.add(Attributes.FOLLOW_RANGE, 32.0D);
/* 181 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
/* 182 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
/* 183 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TSCBerserkEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */