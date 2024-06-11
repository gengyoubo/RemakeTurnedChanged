/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.mcreator.latexes.procedures.YufengEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.YufengThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Skeleton;
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
/*     */ public class YufengEntity extends Monster {
/*     */   public YufengEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<YufengEntity>)LatexModEntities.YUFENG.get(), world);
/*     */   }
/*     */   
/*     */   public YufengEntity(EntityType<YufengEntity> type, Level world) {
/*  69 */     super(type, world);
/*  70 */     this.xpReward = 8;
/*  71 */     setNoAi(false);
/*  72 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  77 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation createNavigation(Level world) {
/*  82 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  87 */     super.registerGoals();
/*  88 */     this.goalSelector.addGoal(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean canUse()
/*     */           {
/*  94 */             if (YufengEntity.this.getTarget() != null && !YufengEntity.this.getMoveControl().hasWanted()) {
/*  95 */               double x = YufengEntity.this.getX();
/*  96 */               double y = YufengEntity.this.getY();
/*  97 */               double z = YufengEntity.this.getZ();
/*  98 */               YufengEntity yufengEntity = YufengEntity.this;
/*  99 */               return TargetwearingmaskProcedure.execute((Entity)yufengEntity);
/*     */             } 
/* 101 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 107 */             return (YufengEntity.this.getMoveControl().hasWanted() && YufengEntity.this.getTarget() != null && YufengEntity.this
/* 108 */               .getTarget().isAlive());
/*     */           }
/*     */ 
/*     */           
/*     */           public void start() {
/* 113 */             LivingEntity livingentity = YufengEntity.this.getTarget();
/* 114 */             Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 115 */             YufengEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void tick() {
/* 120 */             LivingEntity livingentity = YufengEntity.this.getTarget();
/* 121 */             if (YufengEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
/* 122 */               YufengEntity.this.doHurtTarget((Entity)livingentity);
/*     */             } else {
/* 124 */               double d0 = YufengEntity.this.distanceToSqr((Entity)livingentity);
/* 125 */               if (d0 < 16.0D) {
/* 126 */                 Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 127 */                 YufengEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 132 */     this.goalSelector.addGoal(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.0D, true)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 135 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/* 140 */             double x = YufengEntity.this.getX();
/* 141 */             double y = YufengEntity.this.getY();
/* 142 */             double z = YufengEntity.this.getZ();
/* 143 */             YufengEntity yufengEntity = YufengEntity.this;
/* 144 */             Level world = YufengEntity.this.level;
/* 145 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)yufengEntity));
/*     */           }
/*     */         });
/*     */     
/* 149 */     this.targetSelector.addGoal(3, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 150 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 153 */             double x = YufengEntity.this.getX();
/* 154 */             double y = YufengEntity.this.getY();
/* 155 */             double z = YufengEntity.this.getZ();
/* 156 */             YufengEntity yufengEntity = YufengEntity.this;
/* 157 */             Level world = YufengEntity.this.level;
/* 158 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)yufengEntity));
/*     */           }
/*     */         });
/* 161 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 164 */             double x = YufengEntity.this.getX();
/* 165 */             double y = YufengEntity.this.getY();
/* 166 */             double z = YufengEntity.this.getZ();
/* 167 */             YufengEntity yufengEntity = YufengEntity.this;
/* 168 */             Level world = YufengEntity.this.level;
/* 169 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)yufengEntity));
/*     */           }
/*     */         });
/* 172 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 175 */             double x = YufengEntity.this.getX();
/* 176 */             double y = YufengEntity.this.getY();
/* 177 */             double z = YufengEntity.this.getZ();
/* 178 */             YufengEntity yufengEntity = YufengEntity.this;
/* 179 */             Level world = YufengEntity.this.level;
/* 180 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)yufengEntity));
/*     */           }
/*     */         });
/* 183 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 184 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 185 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 186 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 187 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 188 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 189 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 190 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 191 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Skeleton.class, true, false));
/* 192 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 193 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 194 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 195 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 196 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Zoglin.class, true, false));
/* 197 */     this.goalSelector.addGoal(21, (Goal)new WaterAvoidingRandomStrollGoal((PathfinderMob)this, 0.8D));
/* 198 */     this.goalSelector.addGoal(22, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 getPosition() {
/* 201 */             Random random = YufengEntity.this.getRandom();
/* 202 */             double dir_x = YufengEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 203 */             double dir_y = YufengEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 204 */             double dir_z = YufengEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 205 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 208 */     this.goalSelector.addGoal(23, (Goal)new RandomLookAroundGoal((Mob)this));
/* 209 */     this.goalSelector.addGoal(24, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 214 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 218 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 219 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 224 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 229 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 234 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, DamageSource source) {
/* 239 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 244 */     if (source == DamageSource.FALL)
/* 245 */       return false; 
/* 246 */     if (source == DamageSource.CACTUS)
/* 247 */       return false; 
/* 248 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 253 */     super.die(source);
/* 254 */     YufengEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 259 */     super.awardKillScore(entity, score, damageSource);
/* 260 */     YufengThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void setNoGravity(boolean ignored) {
/* 269 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 273 */     super.aiStep();
/* 274 */     setNoGravity(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 281 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 282 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.6D);
/* 283 */     builder = builder.add(Attributes.MAX_HEALTH, 18.0D);
/* 284 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 285 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0D);
/* 286 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 287 */     builder = builder.add(Attributes.FLYING_SPEED, 0.6D);
/* 288 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\YufengEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */