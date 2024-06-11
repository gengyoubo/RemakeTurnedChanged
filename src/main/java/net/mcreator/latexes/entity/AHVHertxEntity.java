/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.AHVHertxRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class AHVHertxEntity extends TamableAnimal {
/*     */   public AHVHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  62 */     this((EntityType<AHVHertxEntity>)LatexModEntities.AHV_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public AHVHertxEntity(EntityType<AHVHertxEntity> type, Level world) {
/*  66 */     super(type, world);
/*  67 */     this.xpReward = 15;
/*  68 */     setNoAi(false);
/*  69 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  74 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  79 */     super.registerGoals();
/*  80 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  83 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  86 */     this.goalSelector.addGoal(2, (Goal)new OwnerHurtByTargetGoal(this));
/*  87 */     this.targetSelector.addGoal(3, (Goal)new OwnerHurtTargetGoal(this));
/*  88 */     this.goalSelector.addGoal(4, (Goal)new FollowOwnerGoal(this, 1.0D, 2.0F, 48.0F, false));
/*  89 */     this.goalSelector.addGoal(5, (Goal)new OpenDoorGoal((Mob)this, true));
/*  90 */     this.goalSelector.addGoal(6, (Goal)new OpenDoorGoal((Mob)this, false));
/*  91 */     this.goalSelector.addGoal(7, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  92 */     this.goalSelector.addGoal(8, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  93 */     this.targetSelector.addGoal(9, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  94 */     this.goalSelector.addGoal(10, (Goal)new RandomLookAroundGoal((Mob)this));
/*  95 */     this.goalSelector.addGoal(11, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 100 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 105 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 109 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 110 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 115 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 120 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 125 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 130 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 135 */     if (source == DamageSource.FALL)
/* 136 */       return false; 
/* 137 */     if (source == DamageSource.CACTUS)
/* 138 */       return false; 
/* 139 */     if (source == DamageSource.DROWN)
/* 140 */       return false; 
/* 141 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 146 */     super.die(source);
/* 147 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 153 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 154 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 155 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 160 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 161 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 162 */     Item item = itemstack.getItem();
/* 163 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 164 */       retval = super.mobInteract(sourceentity, hand);
/* 165 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 168 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 170 */     else if (isTame()) {
/* 171 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 172 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 173 */           usePlayerItem(sourceentity, hand, itemstack);
/* 174 */           heal(item.getFoodProperties().getNutrition());
/* 175 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 176 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 177 */           usePlayerItem(sourceentity, hand, itemstack);
/* 178 */           heal(4.0F);
/* 179 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 181 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 184 */     } else if (isFood(itemstack)) {
/* 185 */       usePlayerItem(sourceentity, hand, itemstack);
/* 186 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 187 */         tame(sourceentity);
/* 188 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 190 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 192 */       setPersistenceRequired();
/* 193 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 195 */       retval = super.mobInteract(sourceentity, hand);
/* 196 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 197 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 200 */     double x = getX();
/* 201 */     double y = getY();
/* 202 */     double z = getZ();
/* 203 */     AHVHertxEntity aHVHertxEntity = this;
/* 204 */     Level world = this.level;
/*     */     
/* 206 */     AHVHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)aHVHertxEntity, (Entity)sourceentity);
/* 207 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 212 */     super.awardKillScore(entity, score, damageSource);
/* 213 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 218 */     super.playerTouch(sourceentity);
/* 219 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 224 */     AHVHertxEntity retval = (AHVHertxEntity)((EntityType)LatexModEntities.AHV_HERTX.get()).create((Level)serverWorld);
/* 225 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 226 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 231 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), Items.SLIME_BALL).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 238 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 239 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 240 */     builder = builder.add(Attributes.MAX_HEALTH, 50.0D);
/* 241 */     builder = builder.add(Attributes.ARMOR, 6.0D);
/* 242 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0D);
/* 243 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 244 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 245 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
/* 246 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\AHVHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */