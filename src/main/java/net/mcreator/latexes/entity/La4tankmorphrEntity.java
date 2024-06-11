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
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
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
/*     */ public class La4tankmorphrEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public La4tankmorphrEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  53 */     this((EntityType<La4tankmorphrEntity>)LatexModEntities.LA_4TANKMORPHR.get(), world);
/*     */   }
/*     */   
/*     */   public La4tankmorphrEntity(EntityType<La4tankmorphrEntity> type, Level world) {
/*  57 */     super(type, world);
/*  58 */     this.xpReward = 0;
/*  59 */     setNoAi(false);
/*  60 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  65 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  70 */     super.registerGoals();
/*  71 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal(this, 1.0D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  74 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  77 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/*  78 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  81 */             double x = La4tankmorphrEntity.this.getX();
/*  82 */             double y = La4tankmorphrEntity.this.getY();
/*  83 */             double z = La4tankmorphrEntity.this.getZ();
/*  84 */             La4tankmorphrEntity la4tankmorphrEntity = La4tankmorphrEntity.this;
/*  85 */             Level world = La4tankmorphrEntity.this.level;
/*  86 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)la4tankmorphrEntity));
/*     */           }
/*     */         });
/*  89 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  92 */             double x = La4tankmorphrEntity.this.getX();
/*  93 */             double y = La4tankmorphrEntity.this.getY();
/*  94 */             double z = La4tankmorphrEntity.this.getZ();
/*  95 */             La4tankmorphrEntity la4tankmorphrEntity = La4tankmorphrEntity.this;
/*  96 */             Level world = La4tankmorphrEntity.this.level;
/*  97 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)la4tankmorphrEntity));
/*     */           }
/*     */         });
/* 100 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/* 101 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 102 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/* 103 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 104 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 105 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 106 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/* 107 */     this.goalSelector.addGoal(12, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/* 108 */     this.goalSelector.addGoal(13, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.goalSelector.addGoal(14, (Goal)new FloatGoal((Mob)this));
/* 110 */     this.goalSelector.addGoal(15, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 111 */     this.goalSelector.addGoal(16, (Goal)new LookAtPlayerGoal((Mob)this, AHVHertxEntity.class, 6.0F));
/* 112 */     this.goalSelector.addGoal(17, (Goal)new RandomStrollGoal(this, 1.0D));
/* 113 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 116 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 123 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 128 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 132 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 133 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.TANK_CANNON.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 143 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 148 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 153 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 158 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 159 */       return false; 
/* 160 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 161 */       return false; 
/* 162 */     if (source == DamageSource.CACTUS)
/* 163 */       return false; 
/* 164 */     if (source == DamageSource.DRAGON_BREATH)
/* 165 */       return false; 
/* 166 */     if (source == DamageSource.WITHER)
/* 167 */       return false; 
/* 168 */     if (source.getMsgId().equals("witherSkull"))
/* 169 */       return false; 
/* 170 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 175 */     TankCannonEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPushable() {
/* 180 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void doPush(Entity entityIn) {}
/*     */ 
/*     */   
/*     */   protected void pushEntities() {}
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */ 
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 195 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 196 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.15D);
/* 197 */     builder = builder.add(Attributes.MAX_HEALTH, 500.0D);
/* 198 */     builder = builder.add(Attributes.ARMOR, 15.0D);
/* 199 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 8.0D);
/* 200 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 201 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\La4tankmorphrEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */