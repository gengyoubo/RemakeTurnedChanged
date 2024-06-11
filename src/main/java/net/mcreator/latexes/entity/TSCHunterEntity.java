/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.TSCHunterEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TSCHunterThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.monster.Witch;
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
/*     */ public class TSCHunterEntity extends Monster {
/*     */   public TSCHunterEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  52 */     this((EntityType<TSCHunterEntity>)LatexModEntities.TSC_HUNTER.get(), world);
/*     */   }
/*     */   
/*     */   public TSCHunterEntity(EntityType<TSCHunterEntity> type, Level world) {
/*  56 */     super(type, world);
/*  57 */     this.xpReward = 0;
/*  58 */     setNoAi(false);
/*  59 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  64 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  69 */     super.registerGoals();
/*  70 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  73 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  76 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  77 */     this.goalSelector.addGoal(3, (Goal)new OpenDoorGoal((Mob)this, true));
/*  78 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  79 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  82 */             double x = TSCHunterEntity.this.getX();
/*  83 */             double y = TSCHunterEntity.this.getY();
/*  84 */             double z = TSCHunterEntity.this.getZ();
/*  85 */             TSCHunterEntity tSCHunterEntity = TSCHunterEntity.this;
/*  86 */             Level world = TSCHunterEntity.this.level;
/*  87 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCHunterEntity));
/*     */           }
/*     */         });
/*  90 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  93 */             double x = TSCHunterEntity.this.getX();
/*  94 */             double y = TSCHunterEntity.this.getY();
/*  95 */             double z = TSCHunterEntity.this.getZ();
/*  96 */             TSCHunterEntity tSCHunterEntity = TSCHunterEntity.this;
/*  97 */             Level world = TSCHunterEntity.this.level;
/*  98 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)tSCHunterEntity));
/*     */           }
/*     */         });
/* 101 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 102 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 103 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 104 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 105 */     this.goalSelector.addGoal(11, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 106 */     this.goalSelector.addGoal(12, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 107 */     this.goalSelector.addGoal(13, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), (PathfinderMob)this, 1.0D, 3));
/* 108 */     this.goalSelector.addGoal(14, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), (PathfinderMob)this, 1.0D, 3));
/* 109 */     this.goalSelector.addGoal(15, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 110 */     this.goalSelector.addGoal(16, (Goal)new OpenDoorGoal((Mob)this, false));
/* 111 */     this.goalSelector.addGoal(17, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 114 */             double x = TSCHunterEntity.this.getX();
/* 115 */             double y = TSCHunterEntity.this.getY();
/* 116 */             double z = TSCHunterEntity.this.getZ();
/* 117 */             TSCHunterEntity tSCHunterEntity = TSCHunterEntity.this;
/* 118 */             Level world = TSCHunterEntity.this.level;
/* 119 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)tSCHunterEntity));
/*     */           }
/*     */         });
/* 122 */     this.goalSelector.addGoal(18, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F));
/* 123 */     this.goalSelector.addGoal(19, (Goal)new RandomLookAroundGoal((Mob)this));
/* 124 */     this.goalSelector.addGoal(20, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 129 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 134 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 138 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 139 */     spawnAtLocation(new ItemStack((ItemLike)Items.IRON_INGOT));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 144 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 149 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 154 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 159 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 160 */       return false; 
/* 161 */     if (source == DamageSource.DROWN)
/* 162 */       return false; 
/* 163 */     if (source == DamageSource.DRAGON_BREATH)
/* 164 */       return false; 
/* 165 */     if (source == DamageSource.WITHER)
/* 166 */       return false; 
/* 167 */     if (source.getMsgId().equals("witherSkull"))
/* 168 */       return false; 
/* 169 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 174 */     super.die(source);
/* 175 */     TSCHunterEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 180 */     super.awardKillScore(entity, score, damageSource);
/* 181 */     TSCHunterThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 188 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 189 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 190 */     builder = builder.add(Attributes.MAX_HEALTH, 85.0D);
/* 191 */     builder = builder.add(Attributes.ARMOR, 8.0D);
/* 192 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 193 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 194 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.7999999999999999D);
/* 195 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TSCHunterEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */