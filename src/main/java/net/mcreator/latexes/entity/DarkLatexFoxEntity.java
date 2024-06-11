/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexFoxThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Guardian;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexFoxEntity extends Monster {
/*     */   public DarkLatexFoxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  60 */     this((EntityType<DarkLatexFoxEntity>)LatexModEntities.DARK_LATEX_FOX.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexFoxEntity(EntityType<DarkLatexFoxEntity> type, Level world) {
/*  64 */     super(type, world);
/*  65 */     this.xpReward = 6;
/*  66 */     setNoAi(false);
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
/*  77 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  85 */             double x = DarkLatexFoxEntity.this.getX();
/*  86 */             double y = DarkLatexFoxEntity.this.getY();
/*  87 */             double z = DarkLatexFoxEntity.this.getZ();
/*  88 */             DarkLatexFoxEntity darkLatexFoxEntity = DarkLatexFoxEntity.this;
/*  89 */             Level world = DarkLatexFoxEntity.this.level;
/*  90 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexFoxEntity));
/*     */           }
/*     */         });
/*     */     
/*  94 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  95 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  98 */             double x = DarkLatexFoxEntity.this.getX();
/*  99 */             double y = DarkLatexFoxEntity.this.getY();
/* 100 */             double z = DarkLatexFoxEntity.this.getZ();
/* 101 */             DarkLatexFoxEntity darkLatexFoxEntity = DarkLatexFoxEntity.this;
/* 102 */             Level world = DarkLatexFoxEntity.this.level;
/* 103 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexFoxEntity));
/*     */           }
/*     */         });
/* 106 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 109 */             double x = DarkLatexFoxEntity.this.getX();
/* 110 */             double y = DarkLatexFoxEntity.this.getY();
/* 111 */             double z = DarkLatexFoxEntity.this.getZ();
/* 112 */             DarkLatexFoxEntity darkLatexFoxEntity = DarkLatexFoxEntity.this;
/* 113 */             Level world = DarkLatexFoxEntity.this.level;
/* 114 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexFoxEntity));
/*     */           }
/*     */         });
/* 117 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 120 */             double x = DarkLatexFoxEntity.this.getX();
/* 121 */             double y = DarkLatexFoxEntity.this.getY();
/* 122 */             double z = DarkLatexFoxEntity.this.getZ();
/* 123 */             DarkLatexFoxEntity darkLatexFoxEntity = DarkLatexFoxEntity.this;
/* 124 */             Level world = DarkLatexFoxEntity.this.level;
/* 125 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexFoxEntity));
/*     */           }
/*     */         });
/* 128 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 129 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 130 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 131 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, false, false));
/* 132 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 133 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 134 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 135 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 136 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 137 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 138 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 139 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 140 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 141 */     this.goalSelector.addGoal(19, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 142 */     this.goalSelector.addGoal(20, (Goal)new MoveBackToVillageGoal((PathfinderMob)this, 0.6D, false));
/* 143 */     this.goalSelector.addGoal(21, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 146 */             double x = DarkLatexFoxEntity.this.getX();
/* 147 */             double y = DarkLatexFoxEntity.this.getY();
/* 148 */             double z = DarkLatexFoxEntity.this.getZ();
/* 149 */             DarkLatexFoxEntity darkLatexFoxEntity = DarkLatexFoxEntity.this;
/* 150 */             Level world = DarkLatexFoxEntity.this.level;
/* 151 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darkLatexFoxEntity));
/*     */           }
/*     */         });
/* 154 */     this.goalSelector.addGoal(22, (Goal)new LeapAtTargetGoal((Mob)this, 0.6F));
/* 155 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.75D));
/* 156 */     this.goalSelector.addGoal(24, (Goal)new RandomLookAroundGoal((Mob)this));
/* 157 */     this.goalSelector.addGoal(25, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 162 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 166 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 167 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 172 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 177 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 182 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 187 */     if (source == DamageSource.FALL)
/* 188 */       return false; 
/* 189 */     if (source == DamageSource.CACTUS)
/* 190 */       return false; 
/* 191 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 196 */     super.die(source);
/* 197 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 202 */     super.awardKillScore(entity, score, damageSource);
/* 203 */     DarkLatexFoxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 210 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 211 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 212 */     builder = builder.add(Attributes.MAX_HEALTH, 16.0D);
/* 213 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 214 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 215 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 216 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3D);
/* 217 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexFoxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */