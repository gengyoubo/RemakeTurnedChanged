/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.entity.animal.Fox;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexMothEntity
/*     */   extends Monster {
/*     */   public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  73 */     this((EntityType<DarkLatexMothEntity>)LatexModEntities.DARK_LATEX_MOTH.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
/*  77 */     super(type, world);
/*  78 */     this.xpReward = 5;
/*  79 */     setNoAi(false);
/*  80 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  85 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation createNavigation(Level world) {
/*  90 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  95 */     super.registerGoals();
/*  96 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  99 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 102 */     this.goalSelector.addGoal(2, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean canUse()
/*     */           {
/* 108 */             if (DarkLatexMothEntity.this.getTarget() != null && !DarkLatexMothEntity.this.getMoveControl().hasWanted()) {
/* 109 */               return true;
/*     */             }
/* 111 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 117 */             return (DarkLatexMothEntity.this.getMoveControl().hasWanted() && DarkLatexMothEntity.this.getTarget() != null && DarkLatexMothEntity.this
/* 118 */               .getTarget().isAlive());
/*     */           }
/*     */ 
/*     */           
/*     */           public void start() {
/* 123 */             LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
/* 124 */             Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 125 */             DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void tick() {
/* 130 */             LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
/* 131 */             if (DarkLatexMothEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
/* 132 */               DarkLatexMothEntity.this.doHurtTarget((Entity)livingentity);
/*     */             } else {
/* 134 */               double d0 = DarkLatexMothEntity.this.distanceToSqr((Entity)livingentity);
/* 135 */               if (d0 < 9.0D) {
/* 136 */                 Vec3 vec3d = livingentity.getEyePosition(1.0F);
/* 137 */                 DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 142 */     this.targetSelector.addGoal(3, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 143 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 146 */             double x = DarkLatexMothEntity.this.getX();
/* 147 */             double y = DarkLatexMothEntity.this.getY();
/* 148 */             double z = DarkLatexMothEntity.this.getZ();
/* 149 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 150 */             Level world = DarkLatexMothEntity.this.level;
/* 151 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 154 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 157 */             double x = DarkLatexMothEntity.this.getX();
/* 158 */             double y = DarkLatexMothEntity.this.getY();
/* 159 */             double z = DarkLatexMothEntity.this.getZ();
/* 160 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 161 */             Level world = DarkLatexMothEntity.this.level;
/* 162 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 165 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, ScientistEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 168 */             double x = DarkLatexMothEntity.this.getX();
/* 169 */             double y = DarkLatexMothEntity.this.getY();
/* 170 */             double z = DarkLatexMothEntity.this.getZ();
/* 171 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 172 */             Level world = DarkLatexMothEntity.this.level;
/* 173 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 176 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 179 */             double x = DarkLatexMothEntity.this.getX();
/* 180 */             double y = DarkLatexMothEntity.this.getY();
/* 181 */             double z = DarkLatexMothEntity.this.getZ();
/* 182 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 183 */             Level world = DarkLatexMothEntity.this.level;
/* 184 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 187 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilScientistEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 190 */             double x = DarkLatexMothEntity.this.getX();
/* 191 */             double y = DarkLatexMothEntity.this.getY();
/* 192 */             double z = DarkLatexMothEntity.this.getZ();
/* 193 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 194 */             Level world = DarkLatexMothEntity.this.level;
/* 195 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 198 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 201 */             double x = DarkLatexMothEntity.this.getX();
/* 202 */             double y = DarkLatexMothEntity.this.getY();
/* 203 */             double z = DarkLatexMothEntity.this.getZ();
/* 204 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 205 */             Level world = DarkLatexMothEntity.this.level;
/* 206 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 209 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 212 */             double x = DarkLatexMothEntity.this.getX();
/* 213 */             double y = DarkLatexMothEntity.this.getY();
/* 214 */             double z = DarkLatexMothEntity.this.getZ();
/* 215 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 216 */             Level world = DarkLatexMothEntity.this.level;
/* 217 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 220 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 223 */             double x = DarkLatexMothEntity.this.getX();
/* 224 */             double y = DarkLatexMothEntity.this.getY();
/* 225 */             double z = DarkLatexMothEntity.this.getZ();
/* 226 */             DarkLatexMothEntity darkLatexMothEntity = DarkLatexMothEntity.this;
/* 227 */             Level world = DarkLatexMothEntity.this.level;
/* 228 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexMothEntity));
/*     */           }
/*     */         });
/* 231 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 232 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 233 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 234 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 235 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 236 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 237 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 238 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 239 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 240 */     this.targetSelector.addGoal(22, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 241 */     this.targetSelector.addGoal(23, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 242 */     this.targetSelector.addGoal(24, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 243 */     this.targetSelector.addGoal(25, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 244 */     this.targetSelector.addGoal(26, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 245 */     this.goalSelector.addGoal(27, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 getPosition() {
/* 248 */             Random random = DarkLatexMothEntity.this.getRandom();
/* 249 */             double dir_x = DarkLatexMothEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 250 */             double dir_y = DarkLatexMothEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 251 */             double dir_z = DarkLatexMothEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 252 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 255 */     this.goalSelector.addGoal(28, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 256 */     this.goalSelector.addGoal(29, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 5.0F));
/* 257 */     this.goalSelector.addGoal(30, (Goal)new RandomLookAroundGoal((Mob)this));
/* 258 */     this.goalSelector.addGoal(31, (Goal)new FloatGoal((Mob)this));
/* 259 */     this.goalSelector.addGoal(32, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 264 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 268 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 269 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 274 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 279 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 284 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, DamageSource source) {
/* 289 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 294 */     if (source == DamageSource.FALL)
/* 295 */       return false; 
/* 296 */     if (source == DamageSource.CACTUS)
/* 297 */       return false; 
/* 298 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 303 */     super.die(source);
/* 304 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 310 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 311 */     DarklatexOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 312 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 317 */     super.awardKillScore(entity, score, damageSource);
/* 318 */     DarklatexThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void setNoGravity(boolean ignored) {
/* 327 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 331 */     super.aiStep();
/* 332 */     setNoGravity(true);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 336 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 340 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 341 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.225D);
/* 342 */     builder = builder.add(Attributes.MAX_HEALTH, 18.0D);
/* 343 */     builder = builder.add(Attributes.ARMOR, 1.5D);
/* 344 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 345 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 346 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3D);
/* 347 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
/* 348 */     builder = builder.add(Attributes.FLYING_SPEED, 0.225D);
/* 349 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexMothEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */