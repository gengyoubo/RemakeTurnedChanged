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
/*     */ import net.mcreator.latexes.procedures.NXTHertxRightClickedOnEntityProcedure;
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
/*     */ public class NXTHertxEntity
/*     */   extends TamableAnimal {
/*     */   public NXTHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  64 */     this((EntityType<NXTHertxEntity>)LatexModEntities.NXT_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public NXTHertxEntity(EntityType<NXTHertxEntity> type, Level world) {
/*  68 */     super(type, world);
/*  69 */     this.xpReward = 15;
/*  70 */     setNoAi(false);
/*  71 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  76 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  81 */     super.registerGoals();
/*  82 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  85 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  88 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  91 */             double x = NXTHertxEntity.this.getX();
/*  92 */             double y = NXTHertxEntity.this.getY();
/*  93 */             double z = NXTHertxEntity.this.getZ();
/*  94 */             NXTHertxEntity nXTHertxEntity = NXTHertxEntity.this;
/*  95 */             Level world = NXTHertxEntity.this.level;
/*  96 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)nXTHertxEntity));
/*     */           }
/*     */         });
/*  99 */     this.goalSelector.addGoal(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 100 */     this.targetSelector.addGoal(4, (Goal)new OwnerHurtTargetGoal(this));
/* 101 */     this.goalSelector.addGoal(5, (Goal)new FollowOwnerGoal(this, 1.0D, 2.0F, 48.0F, false));
/* 102 */     this.goalSelector.addGoal(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 103 */     this.goalSelector.addGoal(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 104 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, DarklatexEntity.class, 6.0F));
/* 105 */     this.goalSelector.addGoal(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 106 */     this.targetSelector.addGoal(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 107 */     this.goalSelector.addGoal(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 108 */     this.goalSelector.addGoal(12, (Goal)new FloatGoal((Mob)this));
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
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 123 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 128 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 133 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 143 */     if (source == DamageSource.FALL)
/* 144 */       return false; 
/* 145 */     if (source == DamageSource.CACTUS)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.DROWN)
/* 148 */       return false; 
/* 149 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 154 */     super.die(source);
/* 155 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 161 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 162 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 163 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 168 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 169 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 170 */     Item item = itemstack.getItem();
/* 171 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 172 */       retval = super.mobInteract(sourceentity, hand);
/* 173 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 176 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 178 */     else if (isTame()) {
/* 179 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 180 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 181 */           usePlayerItem(sourceentity, hand, itemstack);
/* 182 */           heal(item.getFoodProperties().getNutrition());
/* 183 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 184 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 185 */           usePlayerItem(sourceentity, hand, itemstack);
/* 186 */           heal(4.0F);
/* 187 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 189 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 192 */     } else if (isFood(itemstack)) {
/* 193 */       usePlayerItem(sourceentity, hand, itemstack);
/* 194 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 195 */         tame(sourceentity);
/* 196 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 198 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 200 */       setPersistenceRequired();
/* 201 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 203 */       retval = super.mobInteract(sourceentity, hand);
/* 204 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 205 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 208 */     double x = getX();
/* 209 */     double y = getY();
/* 210 */     double z = getZ();
/* 211 */     NXTHertxEntity nXTHertxEntity = this;
/* 212 */     Level world = this.level;
/*     */     
/* 214 */     NXTHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)nXTHertxEntity, (Entity)sourceentity);
/* 215 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 220 */     super.awardKillScore(entity, score, damageSource);
/* 221 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 226 */     super.playerTouch(sourceentity);
/* 227 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 232 */     NXTHertxEntity retval = (NXTHertxEntity)((EntityType)LatexModEntities.NXT_HERTX.get()).create((Level)serverWorld);
/* 233 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 234 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 239 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), Items.REDSTONE, (Item)LatexModItems.BATTERY.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 246 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 247 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 248 */     builder = builder.add(Attributes.MAX_HEALTH, 50.0D);
/* 249 */     builder = builder.add(Attributes.ARMOR, 8.0D);
/* 250 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0D);
/* 251 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 252 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
/* 253 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\NXTHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */