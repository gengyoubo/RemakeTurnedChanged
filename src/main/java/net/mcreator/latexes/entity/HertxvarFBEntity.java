/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckiftamedProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxvarFBRightClickedOnEntityProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class HertxvarFBEntity
/*     */   extends TamableAnimal {
/*     */   public HertxvarFBEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  63 */     this((EntityType<HertxvarFBEntity>)LatexModEntities.HERTXVAR_FB.get(), world);
/*     */   }
/*     */   
/*     */   public HertxvarFBEntity(EntityType<HertxvarFBEntity> type, Level world) {
/*  67 */     super(type, world);
/*  68 */     this.xpReward = 12;
/*  69 */     setNoAi(false);
/*  70 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  75 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  80 */     super.registerGoals();
/*  81 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  84 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  87 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  90 */             double x = HertxvarFBEntity.this.getX();
/*  91 */             double y = HertxvarFBEntity.this.getY();
/*  92 */             double z = HertxvarFBEntity.this.getZ();
/*  93 */             HertxvarFBEntity hertxvarFBEntity = HertxvarFBEntity.this;
/*  94 */             Level world = HertxvarFBEntity.this.level;
/*  95 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxvarFBEntity));
/*     */           }
/*     */         });
/*  98 */     this.goalSelector.addGoal(3, (Goal)new OwnerHurtByTargetGoal(this));
/*  99 */     this.targetSelector.addGoal(4, (Goal)new OwnerHurtTargetGoal(this));
/* 100 */     this.goalSelector.addGoal(5, (Goal)new FollowOwnerGoal(this, 1.0D, 3.0F, 64.0F, false));
/* 101 */     this.goalSelector.addGoal(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 102 */     this.goalSelector.addGoal(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 103 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 104 */     this.goalSelector.addGoal(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 105 */     this.targetSelector.addGoal(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 106 */     this.goalSelector.addGoal(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 107 */     this.goalSelector.addGoal(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 112 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 122 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 127 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 132 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 137 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 142 */     if (source == DamageSource.FALL)
/* 143 */       return false; 
/* 144 */     if (source == DamageSource.CACTUS)
/* 145 */       return false; 
/* 146 */     if (source == DamageSource.DROWN)
/* 147 */       return false; 
/* 148 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 153 */     super.die(source);
/* 154 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 160 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 161 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 162 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 167 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 168 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 169 */     Item item = itemstack.getItem();
/* 170 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 171 */       retval = super.mobInteract(sourceentity, hand);
/* 172 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 175 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 177 */     else if (isTame()) {
/* 178 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 179 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 180 */           usePlayerItem(sourceentity, hand, itemstack);
/* 181 */           heal(item.getFoodProperties().getNutrition());
/* 182 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 183 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 184 */           usePlayerItem(sourceentity, hand, itemstack);
/* 185 */           heal(4.0F);
/* 186 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 188 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 191 */     } else if (isFood(itemstack)) {
/* 192 */       usePlayerItem(sourceentity, hand, itemstack);
/* 193 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 194 */         tame(sourceentity);
/* 195 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 197 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 199 */       setPersistenceRequired();
/* 200 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 202 */       retval = super.mobInteract(sourceentity, hand);
/* 203 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 204 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 207 */     double x = getX();
/* 208 */     double y = getY();
/* 209 */     double z = getZ();
/* 210 */     HertxvarFBEntity hertxvarFBEntity = this;
/* 211 */     Level world = this.level;
/*     */     
/* 213 */     HertxvarFBRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxvarFBEntity, (Entity)sourceentity);
/* 214 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 219 */     super.awardKillScore(entity, score, damageSource);
/* 220 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 225 */     super.playerTouch(sourceentity);
/* 226 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 231 */     HertxvarFBEntity retval = (HertxvarFBEntity)((EntityType)LatexModEntities.HERTXVAR_FB.get()).create((Level)serverWorld);
/* 232 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 233 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 238 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 245 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 246 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.32D);
/* 247 */     builder = builder.add(Attributes.MAX_HEALTH, 45.0D);
/* 248 */     builder = builder.add(Attributes.ARMOR, 6.0D);
/* 249 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 250 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 251 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2D);
/* 252 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\HertxvarFBEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */