/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexQueenBeeEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexQueenBeeEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.CaveSpider;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Spider;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexQueenBeeEntity
/*     */   extends Monster {
/*  69 */   private final ServerBossEvent bossInfo = new ServerBossEvent(getDisplayName(), BossEvent.BossBarColor.YELLOW, BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */   
/*     */   public DarkLatexQueenBeeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  73 */     this((EntityType<DarkLatexQueenBeeEntity>)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexQueenBeeEntity(EntityType<DarkLatexQueenBeeEntity> type, Level world) {
/*  77 */     super(type, world);
/*  78 */     this.xpReward = 15;
/*  79 */     setNoAi(false);
/*  80 */     setPersistenceRequired();
/*  81 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  86 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation createNavigation(Level world) {
/*  91 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  96 */     super.registerGoals();
/*  97 */     this.goalSelector.addGoal(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean canUse()
/*     */           {
/* 103 */             if (DarkLatexQueenBeeEntity.this.getTarget() != null && !DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted()) {
/* 104 */               return true;
/*     */             }
/* 106 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 112 */             return (DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted() && DarkLatexQueenBeeEntity.this.getTarget() != null && DarkLatexQueenBeeEntity.this
/* 113 */               .getTarget().isAlive());
/*     */           }
/*     */ 
/*     */           
/*     */           public void start() {
/* 118 */             LivingEntity livingentity = DarkLatexQueenBeeEntity.this.getTarget();
/* 119 */             Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 120 */             DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void tick() {
/* 125 */             LivingEntity livingentity = DarkLatexQueenBeeEntity.this.getTarget();
/* 126 */             if (DarkLatexQueenBeeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
/* 127 */               DarkLatexQueenBeeEntity.this.doHurtTarget((Entity)livingentity);
/*     */             } else {
/* 129 */               double d0 = DarkLatexQueenBeeEntity.this.distanceToSqr((Entity)livingentity);
/* 130 */               if (d0 < 12.0D) {
/* 131 */                 Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 132 */                 DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 137 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 138 */     this.goalSelector.addGoal(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 141 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/* 146 */             double x = DarkLatexQueenBeeEntity.this.getX();
/* 147 */             double y = DarkLatexQueenBeeEntity.this.getY();
/* 148 */             double z = DarkLatexQueenBeeEntity.this.getZ();
/* 149 */             DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = DarkLatexQueenBeeEntity.this;
/* 150 */             Level world = DarkLatexQueenBeeEntity.this.level;
/* 151 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexQueenBeeEntity));
/*     */           }
/*     */         });
/*     */     
/* 155 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderQueenEntity.class, true, false));
/* 156 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderEntity.class, true, false));
/* 157 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, CaveSpider.class, true, false));
/* 158 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Spider.class, true, false));
/* 159 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexQueenBeeEntity.class, true, false));
/* 160 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 163 */             double x = DarkLatexQueenBeeEntity.this.getX();
/* 164 */             double y = DarkLatexQueenBeeEntity.this.getY();
/* 165 */             double z = DarkLatexQueenBeeEntity.this.getZ();
/* 166 */             DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = DarkLatexQueenBeeEntity.this;
/* 167 */             Level world = DarkLatexQueenBeeEntity.this.level;
/* 168 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexQueenBeeEntity));
/*     */           }
/*     */         });
/* 171 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 174 */             double x = DarkLatexQueenBeeEntity.this.getX();
/* 175 */             double y = DarkLatexQueenBeeEntity.this.getY();
/* 176 */             double z = DarkLatexQueenBeeEntity.this.getZ();
/* 177 */             DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = DarkLatexQueenBeeEntity.this;
/* 178 */             Level world = DarkLatexQueenBeeEntity.this.level;
/* 179 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexQueenBeeEntity));
/*     */           }
/*     */         });
/* 182 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 185 */             double x = DarkLatexQueenBeeEntity.this.getX();
/* 186 */             double y = DarkLatexQueenBeeEntity.this.getY();
/* 187 */             double z = DarkLatexQueenBeeEntity.this.getZ();
/* 188 */             DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = DarkLatexQueenBeeEntity.this;
/* 189 */             Level world = DarkLatexQueenBeeEntity.this.level;
/* 190 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexQueenBeeEntity));
/*     */           }
/*     */         });
/* 193 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 194 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 195 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 196 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 197 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 198 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 199 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 200 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 201 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 202 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 203 */     this.targetSelector.addGoal(22, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 204 */     this.targetSelector.addGoal(23, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 205 */     this.goalSelector.addGoal(24, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.2D, 20)
/*     */         {
/*     */           protected Vec3 getPosition() {
/* 208 */             Random random = DarkLatexQueenBeeEntity.this.getRandom();
/* 209 */             double dir_x = DarkLatexQueenBeeEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 210 */             double dir_y = DarkLatexQueenBeeEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 211 */             double dir_z = DarkLatexQueenBeeEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 212 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 215 */     this.goalSelector.addGoal(25, (Goal)new RandomLookAroundGoal((Mob)this));
/* 216 */     this.goalSelector.addGoal(26, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 221 */     return MobType.ARTHROPOD;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 226 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getPassengersRidingOffset() {
/* 231 */     return super.getPassengersRidingOffset() + 0.2D;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 235 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 236 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 241 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 246 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 251 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 256 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, DamageSource source) {
/* 261 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 266 */     DarkLatexQueenBeeEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 267 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 268 */       return false; 
/* 269 */     if (source == DamageSource.FALL)
/* 270 */       return false; 
/* 271 */     if (source == DamageSource.CACTUS)
/* 272 */       return false; 
/* 273 */     if (source == DamageSource.LIGHTNING_BOLT)
/* 274 */       return false; 
/* 275 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 280 */     super.die(source);
/* 281 */     DarkLatexQueenBeeEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 286 */     super.awardKillScore(entity, score, damageSource);
/* 287 */     DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 292 */     super.playerTouch(sourceentity);
/* 293 */     DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canChangeDimensions() {
/* 298 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void startSeenByPlayer(ServerPlayer player) {
/* 303 */     super.startSeenByPlayer(player);
/* 304 */     this.bossInfo.addPlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stopSeenByPlayer(ServerPlayer player) {
/* 309 */     super.stopSeenByPlayer(player);
/* 310 */     this.bossInfo.removePlayer(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void customServerAiStep() {
/* 315 */     super.customServerAiStep();
/* 316 */     this.bossInfo.setProgress(getHealth() / getMaxHealth());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void setNoGravity(boolean ignored) {
/* 325 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 329 */     super.aiStep();
/* 330 */     setNoGravity(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 337 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 338 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 339 */     builder = builder.add(Attributes.MAX_HEALTH, 80.0D);
/* 340 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 341 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 7.0D);
/* 342 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 343 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2D);
/* 344 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1D);
/* 345 */     builder = builder.add(Attributes.FLYING_SPEED, 0.4D);
/* 346 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexQueenBeeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */