/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckforskyProcedure;
/*     */ import net.mcreator.latexes.procedures.DLbeeThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.mcreator.latexes.procedures.YufengEntityDiesProcedure;
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
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Skeleton;
/*     */ import net.minecraft.world.entity.monster.Spider;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zoglin;
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
/*     */ public class DLbeeEntity extends Monster {
/*     */   public DLbeeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  68 */     this((EntityType<DLbeeEntity>)LatexModEntities.D_LBEE.get(), world);
/*     */   }
/*     */   
/*     */   public DLbeeEntity(EntityType<DLbeeEntity> type, Level world) {
/*  72 */     super(type, world);
/*  73 */     this.xpReward = 6;
/*  74 */     setNoAi(false);
/*  75 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  80 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation createNavigation(Level world) {
/*  85 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  90 */     super.registerGoals();
/*  91 */     this.goalSelector.addGoal(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean canUse()
/*     */           {
/*  97 */             if (DLbeeEntity.this.getTarget() != null && !DLbeeEntity.this.getMoveControl().hasWanted()) {
/*  98 */               double x = DLbeeEntity.this.getX();
/*  99 */               double y = DLbeeEntity.this.getY();
/* 100 */               double z = DLbeeEntity.this.getZ();
/* 101 */               DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 102 */               return TargetwearingmaskProcedure.execute((Entity)dLbeeEntity);
/*     */             } 
/* 104 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 110 */             return (DLbeeEntity.this.getMoveControl().hasWanted() && DLbeeEntity.this.getTarget() != null && DLbeeEntity.this
/* 111 */               .getTarget().isAlive());
/*     */           }
/*     */ 
/*     */           
/*     */           public void start() {
/* 116 */             LivingEntity livingentity = DLbeeEntity.this.getTarget();
/* 117 */             Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 118 */             DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void tick() {
/* 123 */             LivingEntity livingentity = DLbeeEntity.this.getTarget();
/* 124 */             if (DLbeeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
/* 125 */               DLbeeEntity.this.doHurtTarget((Entity)livingentity);
/*     */             } else {
/* 127 */               double d0 = DLbeeEntity.this.distanceToSqr((Entity)livingentity);
/* 128 */               if (d0 < 16.0D) {
/* 129 */                 Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 130 */                 DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 135 */     this.goalSelector.addGoal(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.0D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 138 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/* 143 */             double x = DLbeeEntity.this.getX();
/* 144 */             double y = DLbeeEntity.this.getY();
/* 145 */             double z = DLbeeEntity.this.getZ();
/* 146 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 147 */             Level world = DLbeeEntity.this.level;
/* 148 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)dLbeeEntity));
/*     */           }
/*     */         });
/*     */     
/* 152 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Spider.class, true, false));
/* 153 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderQueenEntity.class, true, false));
/* 154 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderEntity.class, true, false));
/* 155 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 158 */             double x = DLbeeEntity.this.getX();
/* 159 */             double y = DLbeeEntity.this.getY();
/* 160 */             double z = DLbeeEntity.this.getZ();
/* 161 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 162 */             Level world = DLbeeEntity.this.level;
/* 163 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)dLbeeEntity));
/*     */           }
/*     */         });
/* 166 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 169 */             double x = DLbeeEntity.this.getX();
/* 170 */             double y = DLbeeEntity.this.getY();
/* 171 */             double z = DLbeeEntity.this.getZ();
/* 172 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 173 */             Level world = DLbeeEntity.this.level;
/* 174 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)dLbeeEntity));
/*     */           }
/*     */         });
/* 177 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 180 */             double x = DLbeeEntity.this.getX();
/* 181 */             double y = DLbeeEntity.this.getY();
/* 182 */             double z = DLbeeEntity.this.getZ();
/* 183 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 184 */             Level world = DLbeeEntity.this.level;
/* 185 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)dLbeeEntity));
/*     */           }
/*     */         });
/* 188 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 189 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 190 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 191 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 192 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 193 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 194 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 195 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 196 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 197 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Skeleton.class, true, false));
/* 198 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 199 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 200 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 201 */     this.targetSelector.addGoal(22, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 202 */     this.targetSelector.addGoal(23, (Goal)new NearestAttackableTargetGoal((Mob)this, Zoglin.class, true, false));
/* 203 */     this.goalSelector.addGoal(24, (Goal)new WaterAvoidingRandomStrollGoal((PathfinderMob)this, 0.8D));
/* 204 */     this.goalSelector.addGoal(25, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 getPosition() {
/* 207 */             Random random = DLbeeEntity.this.getRandom();
/* 208 */             double dir_x = DLbeeEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 209 */             double dir_y = DLbeeEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 210 */             double dir_z = DLbeeEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 211 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/* 216 */             double x = DLbeeEntity.this.getX();
/* 217 */             double y = DLbeeEntity.this.getY();
/* 218 */             double z = DLbeeEntity.this.getZ();
/* 219 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 220 */             Level world = DLbeeEntity.this.level;
/* 221 */             return (super.canUse() && CheckforskyProcedure.execute((LevelAccessor)world, x, y, z));
/*     */           }
/*     */         });
/*     */     
/* 225 */     this.targetSelector.addGoal(26, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 226 */     this.goalSelector.addGoal(27, (Goal)new RandomLookAroundGoal((Mob)this));
/* 227 */     this.goalSelector.addGoal(28, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 232 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 236 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 237 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 242 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 247 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 252 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 257 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, DamageSource source) {
/* 262 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 267 */     if (source == DamageSource.FALL)
/* 268 */       return false; 
/* 269 */     if (source == DamageSource.CACTUS)
/* 270 */       return false; 
/* 271 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 276 */     super.die(source);
/* 277 */     YufengEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 282 */     super.awardKillScore(entity, score, damageSource);
/* 283 */     DLbeeThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void setNoGravity(boolean ignored) {
/* 292 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 296 */     super.aiStep();
/* 297 */     setNoGravity(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 304 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 305 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5D);
/* 306 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 307 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 308 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 309 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 310 */     builder = builder.add(Attributes.FLYING_SPEED, 0.5D);
/* 311 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DLbeeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */