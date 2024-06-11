/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.AshburyHertxRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckiftamedProcedure;
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
/*     */ public class AshburyHertxEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public AshburyHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<AshburyHertxEntity>)LatexModEntities.ASHBURY_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public AshburyHertxEntity(EntityType<AshburyHertxEntity> type, Level world) {
/*  69 */     super(type, world);
/*  70 */     this.xpReward = 15;
/*  71 */     setNoAi(false);
/*  72 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  77 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  82 */     super.registerGoals();
/*  83 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  86 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  89 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  92 */             double x = AshburyHertxEntity.this.getX();
/*  93 */             double y = AshburyHertxEntity.this.getY();
/*  94 */             double z = AshburyHertxEntity.this.getZ();
/*  95 */             AshburyHertxEntity ashburyHertxEntity = AshburyHertxEntity.this;
/*  96 */             Level world = AshburyHertxEntity.this.level;
/*  97 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)ashburyHertxEntity));
/*     */           }
/*     */         });
/* 100 */     this.goalSelector.addGoal(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 101 */     this.targetSelector.addGoal(4, (Goal)new OwnerHurtTargetGoal(this));
/* 102 */     this.goalSelector.addGoal(5, (Goal)new FollowOwnerGoal(this, 1.0D, 2.0F, 64.0F, false));
/* 103 */     this.goalSelector.addGoal(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 104 */     this.goalSelector.addGoal(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 105 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 8.0F));
/* 106 */     this.goalSelector.addGoal(9, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 6.0F));
/* 107 */     this.goalSelector.addGoal(10, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 108 */     this.targetSelector.addGoal(11, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 109 */     this.goalSelector.addGoal(12, (Goal)new RandomLookAroundGoal((Mob)this));
/* 110 */     this.goalSelector.addGoal(13, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 115 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 120 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 125 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 130 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 135 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 140 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 145 */     if (source == DamageSource.FALL)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.CACTUS)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.DROWN)
/* 150 */       return false; 
/* 151 */     if (source == DamageSource.WITHER)
/* 152 */       return false; 
/* 153 */     if (source.getMsgId().equals("witherSkull"))
/* 154 */       return false; 
/* 155 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 160 */     super.die(source);
/* 161 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 167 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 168 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 169 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 174 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 175 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 176 */     Item item = itemstack.getItem();
/* 177 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 178 */       retval = super.mobInteract(sourceentity, hand);
/* 179 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 182 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 184 */     else if (isTame()) {
/* 185 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 186 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 187 */           usePlayerItem(sourceentity, hand, itemstack);
/* 188 */           heal(item.getFoodProperties().getNutrition());
/* 189 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 190 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 191 */           usePlayerItem(sourceentity, hand, itemstack);
/* 192 */           heal(4.0F);
/* 193 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 195 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 198 */     } else if (isFood(itemstack)) {
/* 199 */       usePlayerItem(sourceentity, hand, itemstack);
/* 200 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 201 */         tame(sourceentity);
/* 202 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 204 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 206 */       setPersistenceRequired();
/* 207 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 209 */       retval = super.mobInteract(sourceentity, hand);
/* 210 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 211 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 214 */     double x = getX();
/* 215 */     double y = getY();
/* 216 */     double z = getZ();
/* 217 */     AshburyHertxEntity ashburyHertxEntity = this;
/* 218 */     Level world = this.level;
/*     */     
/* 220 */     AshburyHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)ashburyHertxEntity, (Entity)sourceentity);
/* 221 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 226 */     super.awardKillScore(entity, score, damageSource);
/* 227 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 232 */     super.playerTouch(sourceentity);
/* 233 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 238 */     AshburyHertxEntity retval = (AshburyHertxEntity)((EntityType)LatexModEntities.ASHBURY_HERTX.get()).create((Level)serverWorld);
/* 239 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 240 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 245 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), Items.ORANGE_DYE).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 252 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 253 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.35D);
/* 254 */     builder = builder.add(Attributes.MAX_HEALTH, 52.0D);
/* 255 */     builder = builder.add(Attributes.ARMOR, 4.5D);
/* 256 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 257 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 258 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1D);
/* 259 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\AshburyHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */