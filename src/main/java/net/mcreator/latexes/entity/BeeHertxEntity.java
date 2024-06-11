/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.BeeHertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.BeeHertxRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.BeeHertxThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckiftamedProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
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
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class BeeHertxEntity
/*     */   extends TamableAnimal {
/*     */   public BeeHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<BeeHertxEntity>)LatexModEntities.BEE_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public BeeHertxEntity(EntityType<BeeHertxEntity> type, Level world) {
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
/*  92 */             double x = BeeHertxEntity.this.getX();
/*  93 */             double y = BeeHertxEntity.this.getY();
/*  94 */             double z = BeeHertxEntity.this.getZ();
/*  95 */             BeeHertxEntity beeHertxEntity = BeeHertxEntity.this;
/*  96 */             Level world = BeeHertxEntity.this.level;
/*  97 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)beeHertxEntity));
/*     */           }
/*     */         });
/* 100 */     this.goalSelector.addGoal(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 101 */     this.targetSelector.addGoal(4, (Goal)new OwnerHurtTargetGoal(this));
/* 102 */     this.goalSelector.addGoal(5, (Goal)new FollowOwnerGoal(this, 1.0D, 1.0F, 36.0F, false));
/* 103 */     this.goalSelector.addGoal(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 104 */     this.goalSelector.addGoal(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 105 */     this.goalSelector.addGoal(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 106 */     this.goalSelector.addGoal(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 107 */     this.targetSelector.addGoal(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 108 */     this.goalSelector.addGoal(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.goalSelector.addGoal(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 114 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 129 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 134 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 139 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 144 */     if (source == DamageSource.FALL)
/* 145 */       return false; 
/* 146 */     if (source == DamageSource.CACTUS)
/* 147 */       return false; 
/* 148 */     if (source == DamageSource.DROWN)
/* 149 */       return false; 
/* 150 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 155 */     super.die(source);
/* 156 */     BeeHertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 162 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 163 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 164 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 169 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 170 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 171 */     Item item = itemstack.getItem();
/* 172 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 173 */       retval = super.mobInteract(sourceentity, hand);
/* 174 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 177 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 179 */     else if (isTame()) {
/* 180 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 181 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 182 */           usePlayerItem(sourceentity, hand, itemstack);
/* 183 */           heal(item.getFoodProperties().getNutrition());
/* 184 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 185 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 186 */           usePlayerItem(sourceentity, hand, itemstack);
/* 187 */           heal(4.0F);
/* 188 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 190 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 193 */     } else if (isFood(itemstack)) {
/* 194 */       usePlayerItem(sourceentity, hand, itemstack);
/* 195 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 196 */         tame(sourceentity);
/* 197 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 199 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 201 */       setPersistenceRequired();
/* 202 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 204 */       retval = super.mobInteract(sourceentity, hand);
/* 205 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 206 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 209 */     double x = getX();
/* 210 */     double y = getY();
/* 211 */     double z = getZ();
/* 212 */     BeeHertxEntity beeHertxEntity = this;
/* 213 */     Level world = this.level;
/*     */     
/* 215 */     BeeHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)beeHertxEntity, (Entity)sourceentity);
/* 216 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 221 */     super.awardKillScore(entity, score, damageSource);
/* 222 */     BeeHertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 227 */     super.playerTouch(sourceentity);
/* 228 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 233 */     BeeHertxEntity retval = (BeeHertxEntity)((EntityType)LatexModEntities.BEE_HERTX.get()).create((Level)serverWorld);
/* 234 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 235 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 240 */     return List.<Item>of(new Item[] { (Item)LatexModItems.DARKLATEXGOO.get(), Items.HONEYCOMB, Items.HONEY_BOTTLE, Blocks.DANDELION.asItem(), Blocks.POPPY.asItem(), Blocks.BLUE_ORCHID
/* 241 */           .asItem(), Blocks.ALLIUM.asItem(), Blocks.AZURE_BLUET.asItem(), Blocks.RED_TULIP.asItem(), Blocks.ORANGE_TULIP
/* 242 */           .asItem(), Blocks.WHITE_TULIP.asItem(), Blocks.PINK_TULIP.asItem(), Blocks.OXEYE_DAISY.asItem(), Blocks.CORNFLOWER
/* 243 */           .asItem() }).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 250 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 251 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 252 */     builder = builder.add(Attributes.MAX_HEALTH, 50.0D);
/* 253 */     builder = builder.add(Attributes.ARMOR, 4.0D);
/* 254 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0D);
/* 255 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 256 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1D);
/* 257 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\BeeHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */