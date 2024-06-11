/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.TSCdroneEntityDiesProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
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
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class TSCdroneEntity extends Monster {
/*     */   public TSCdroneEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  48 */     this((EntityType<TSCdroneEntity>)LatexModEntities.TS_CDRONE.get(), world);
/*     */   }
/*     */   
/*     */   public TSCdroneEntity(EntityType<TSCdroneEntity> type, Level world) {
/*  52 */     super(type, world);
/*  53 */     this.xpReward = 0;
/*  54 */     setNoAi(false);
/*  55 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  60 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  65 */     super.registerGoals();
/*  66 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  69 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  72 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  75 */             double x = TSCdroneEntity.this.getX();
/*  76 */             double y = TSCdroneEntity.this.getY();
/*  77 */             double z = TSCdroneEntity.this.getZ();
/*  78 */             TSCdroneEntity tSCdroneEntity = TSCdroneEntity.this;
/*  79 */             Level world = TSCdroneEntity.this.level;
/*  80 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCdroneEntity));
/*     */           }
/*     */         });
/*  83 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  86 */             double x = TSCdroneEntity.this.getX();
/*  87 */             double y = TSCdroneEntity.this.getY();
/*  88 */             double z = TSCdroneEntity.this.getZ();
/*  89 */             TSCdroneEntity tSCdroneEntity = TSCdroneEntity.this;
/*  90 */             Level world = TSCdroneEntity.this.level;
/*  91 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCdroneEntity));
/*     */           }
/*     */         });
/*  94 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  95 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  96 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  97 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  98 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, TSCHunterEntity.class, 9.0F));
/*  99 */     this.goalSelector.addGoal(9, (Goal)new OpenDoorGoal((Mob)this, true));
/* 100 */     this.goalSelector.addGoal(10, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 101 */     this.goalSelector.addGoal(11, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 102 */     this.goalSelector.addGoal(12, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), (PathfinderMob)this, 1.0D, 3));
/* 103 */     this.goalSelector.addGoal(13, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), (PathfinderMob)this, 1.0D, 3));
/* 104 */     this.goalSelector.addGoal(14, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 105 */     this.targetSelector.addGoal(15, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 106 */     this.goalSelector.addGoal(16, (Goal)new RandomLookAroundGoal((Mob)this));
/* 107 */     this.goalSelector.addGoal(17, (Goal)new FloatGoal((Mob)this));
/* 108 */     this.goalSelector.addGoal(18, (Goal)new OpenDoorGoal((Mob)this, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 113 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 118 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 122 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 123 */     spawnAtLocation(new ItemStack((ItemLike)Items.IRON_INGOT));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 128 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 133 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 143 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 144 */       return false; 
/* 145 */     if (source == DamageSource.DROWN)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.DRAGON_BREATH)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.WITHER)
/* 150 */       return false; 
/* 151 */     if (source.getMsgId().equals("witherSkull"))
/* 152 */       return false; 
/* 153 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 158 */     super.die(source);
/* 159 */     TSCdroneEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 166 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 167 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.31D);
/* 168 */     builder = builder.add(Attributes.MAX_HEALTH, 25.0D);
/* 169 */     builder = builder.add(Attributes.ARMOR, 2.5D);
/* 170 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0D);
/* 171 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 172 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 173 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TSCdroneEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */