/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class La4tankmorphmEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public La4tankmorphmEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<La4tankmorphmEntity>)LatexModEntities.LA_4TANKMORPHM.get(), world);
/*     */   }
/*     */   
/*     */   public La4tankmorphmEntity(EntityType<La4tankmorphmEntity> type, Level world) {
/*  55 */     super(type, world);
/*  56 */     this.xpReward = 0;
/*  57 */     setNoAi(false);
/*  58 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  63 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  68 */     super.registerGoals();
/*  69 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal(this, 1.0D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  72 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  75 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/*  76 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  79 */             double x = La4tankmorphmEntity.this.getX();
/*  80 */             double y = La4tankmorphmEntity.this.getY();
/*  81 */             double z = La4tankmorphmEntity.this.getZ();
/*  82 */             La4tankmorphmEntity la4tankmorphmEntity = La4tankmorphmEntity.this;
/*  83 */             Level world = La4tankmorphmEntity.this.level;
/*  84 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)la4tankmorphmEntity));
/*     */           }
/*     */         });
/*  87 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  90 */             double x = La4tankmorphmEntity.this.getX();
/*  91 */             double y = La4tankmorphmEntity.this.getY();
/*  92 */             double z = La4tankmorphmEntity.this.getZ();
/*  93 */             La4tankmorphmEntity la4tankmorphmEntity = La4tankmorphmEntity.this;
/*  94 */             Level world = La4tankmorphmEntity.this.level;
/*  95 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)la4tankmorphmEntity));
/*     */           }
/*     */         });
/*  98 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  99 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 100 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/* 101 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 102 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 103 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 104 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, false));
/* 105 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/* 106 */     this.goalSelector.addGoal(13, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 107 */     this.goalSelector.addGoal(14, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/* 108 */     this.goalSelector.addGoal(15, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.goalSelector.addGoal(16, (Goal)new FloatGoal((Mob)this));
/* 110 */     this.goalSelector.addGoal(17, (Goal)new RandomStrollGoal(this, 1.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 115 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 120 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 124 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 125 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.TANK_CANNON.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 130 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 135 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 140 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 145 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 150 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 151 */       return false; 
/* 152 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 153 */       return false; 
/* 154 */     if (source == DamageSource.CACTUS)
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
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 169 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 170 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
/* 171 */     builder = builder.add(Attributes.MAX_HEALTH, 500.0D);
/* 172 */     builder = builder.add(Attributes.ARMOR, 15.0D);
/* 173 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 16.0D);
/* 174 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 175 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
/* 176 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2.0D);
/* 177 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\La4tankmorphmEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */