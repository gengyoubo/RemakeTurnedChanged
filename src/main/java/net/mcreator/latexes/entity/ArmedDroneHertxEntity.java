/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.ArmedDroneHertxDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.ArmedDroneHertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.ArmedDronehertxrightclickProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckiftamedProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.AgeableMob;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.TamableAnimal;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ArmedDroneHertxEntity
/*     */   extends TamableAnimal
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public ArmedDroneHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  68 */     this((EntityType<ArmedDroneHertxEntity>)LatexModEntities.ARMED_DRONE_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public ArmedDroneHertxEntity(EntityType<ArmedDroneHertxEntity> type, Level world) {
/*  72 */     super(type, world);
/*  73 */     this.xpReward = 14;
/*  74 */     setNoAi(false);
/*  75 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  80 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  85 */     super.registerGoals();
/*  86 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  89 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  92 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, true)
/*     */         {
/*     */           public boolean canUse() {
/*  95 */             double x = ArmedDroneHertxEntity.this.getX();
/*  96 */             double y = ArmedDroneHertxEntity.this.getY();
/*  97 */             double z = ArmedDroneHertxEntity.this.getZ();
/*  98 */             ArmedDroneHertxEntity armedDroneHertxEntity = ArmedDroneHertxEntity.this;
/*  99 */             Level world = ArmedDroneHertxEntity.this.level;
/* 100 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxEntity));
/*     */           }
/*     */         });
/* 103 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = ArmedDroneHertxEntity.this.getX();
/* 107 */             double y = ArmedDroneHertxEntity.this.getY();
/* 108 */             double z = ArmedDroneHertxEntity.this.getZ();
/* 109 */             ArmedDroneHertxEntity armedDroneHertxEntity = ArmedDroneHertxEntity.this;
/* 110 */             Level world = ArmedDroneHertxEntity.this.level;
/* 111 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)armedDroneHertxEntity));
/*     */           }
/*     */         });
/* 114 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 117 */             double x = ArmedDroneHertxEntity.this.getX();
/* 118 */             double y = ArmedDroneHertxEntity.this.getY();
/* 119 */             double z = ArmedDroneHertxEntity.this.getZ();
/* 120 */             ArmedDroneHertxEntity armedDroneHertxEntity = ArmedDroneHertxEntity.this;
/* 121 */             Level world = ArmedDroneHertxEntity.this.level;
/* 122 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)armedDroneHertxEntity));
/*     */           }
/*     */         });
/* 125 */     this.goalSelector.addGoal(5, (Goal)new OwnerHurtByTargetGoal(this));
/* 126 */     this.targetSelector.addGoal(6, (Goal)new OwnerHurtTargetGoal(this));
/* 127 */     this.goalSelector.addGoal(7, (Goal)new FollowOwnerGoal(this, 0.9D, 4.0F, 36.0F, false));
/* 128 */     this.goalSelector.addGoal(8, (Goal)new OpenDoorGoal((Mob)this, true));
/* 129 */     this.goalSelector.addGoal(9, (Goal)new OpenDoorGoal((Mob)this, false));
/* 130 */     this.goalSelector.addGoal(10, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 131 */     this.goalSelector.addGoal(11, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.7D));
/* 132 */     this.targetSelector.addGoal(12, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 133 */     this.goalSelector.addGoal(13, (Goal)new RandomLookAroundGoal((Mob)this));
/* 134 */     this.goalSelector.addGoal(14, (Goal)new FloatGoal((Mob)this));
/* 135 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 138 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 145 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 150 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 155 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 160 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 165 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 170 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 175 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 176 */       return false; 
/* 177 */     if (source == DamageSource.CACTUS)
/* 178 */       return false; 
/* 179 */     if (source == DamageSource.DROWN)
/* 180 */       return false; 
/* 181 */     if (source == DamageSource.DRAGON_BREATH)
/* 182 */       return false; 
/* 183 */     if (source == DamageSource.WITHER)
/* 184 */       return false; 
/* 185 */     if (source.getMsgId().equals("witherSkull"))
/* 186 */       return false; 
/* 187 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 192 */     super.die(source);
/* 193 */     ArmedDroneHertxDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 199 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 200 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 201 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 206 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 207 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 208 */     Item item = itemstack.getItem();
/* 209 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 210 */       retval = super.mobInteract(sourceentity, hand);
/* 211 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 214 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 216 */     else if (isTame()) {
/* 217 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 218 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 219 */           usePlayerItem(sourceentity, hand, itemstack);
/* 220 */           heal(item.getFoodProperties().getNutrition());
/* 221 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 222 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 223 */           usePlayerItem(sourceentity, hand, itemstack);
/* 224 */           heal(4.0F);
/* 225 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 227 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 230 */     } else if (isFood(itemstack)) {
/* 231 */       usePlayerItem(sourceentity, hand, itemstack);
/* 232 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 233 */         tame(sourceentity);
/* 234 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 236 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 238 */       setPersistenceRequired();
/* 239 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 241 */       retval = super.mobInteract(sourceentity, hand);
/* 242 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 243 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 246 */     double x = getX();
/* 247 */     double y = getY();
/* 248 */     double z = getZ();
/* 249 */     ArmedDroneHertxEntity armedDroneHertxEntity = this;
/* 250 */     Level world = this.level;
/*     */     
/* 252 */     ArmedDronehertxrightclickProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxEntity, (Entity)sourceentity);
/* 253 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 258 */     super.playerTouch(sourceentity);
/* 259 */     ArmedDroneHertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 264 */     M4AssaultRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 269 */     ArmedDroneHertxEntity retval = (ArmedDroneHertxEntity)((EntityType)LatexModEntities.ARMED_DRONE_HERTX.get()).create((Level)serverWorld);
/* 270 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 271 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 276 */     return List.<Item>of(Items.IRON_INGOT, Items.IRON_NUGGET).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 283 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 284 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 285 */     builder = builder.add(Attributes.MAX_HEALTH, 58.0D);
/* 286 */     builder = builder.add(Attributes.ARMOR, 9.0D);
/* 287 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 288 */     builder = builder.add(Attributes.FOLLOW_RANGE, 24.0D);
/* 289 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.6D);
/* 290 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 291 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\ArmedDroneHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */