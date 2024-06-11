/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckiftamedProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxFBSitRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
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
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
/*     */ public class HertxFBSitEntity
/*     */   extends TamableAnimal {
/*     */   public HertxFBSitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  59 */     this((EntityType<HertxFBSitEntity>)LatexModEntities.HERTX_FB_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxFBSitEntity(EntityType<HertxFBSitEntity> type, Level world) {
/*  63 */     super(type, world);
/*  64 */     this.xpReward = 4;
/*  65 */     setNoAi(false);
/*  66 */     setCustomName((Component)new TextComponent("§3[Idle]"));
/*  67 */     setCustomNameVisible(true);
/*  68 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  73 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  78 */     super.registerGoals();
/*  79 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  82 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  85 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  88 */             double x = HertxFBSitEntity.this.getX();
/*  89 */             double y = HertxFBSitEntity.this.getY();
/*  90 */             double z = HertxFBSitEntity.this.getZ();
/*  91 */             HertxFBSitEntity hertxFBSitEntity = HertxFBSitEntity.this;
/*  92 */             Level world = HertxFBSitEntity.this.level;
/*  93 */             return (super.canUse() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFBSitEntity));
/*     */           }
/*     */         });
/*  96 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, DarklatexEntity.class, 3.0F));
/*  97 */     this.goalSelector.addGoal(4, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  98 */     this.targetSelector.addGoal(5, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  99 */     this.goalSelector.addGoal(6, (Goal)new RandomLookAroundGoal((Mob)this));
/* 100 */     this.goalSelector.addGoal(7, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 105 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 110 */     return false;
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
/* 141 */     if (source == DamageSource.WITHER)
/* 142 */       return false; 
/* 143 */     if (source.getMsgId().equals("witherSkull"))
/* 144 */       return false; 
/* 145 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 150 */     super.die(source);
/* 151 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 157 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 158 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 159 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 164 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 165 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 166 */     Item item = itemstack.getItem();
/* 167 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 168 */       retval = super.mobInteract(sourceentity, hand);
/* 169 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 172 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 174 */     else if (isTame()) {
/* 175 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 176 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 177 */           usePlayerItem(sourceentity, hand, itemstack);
/* 178 */           heal(item.getFoodProperties().getNutrition());
/* 179 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 180 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 181 */           usePlayerItem(sourceentity, hand, itemstack);
/* 182 */           heal(4.0F);
/* 183 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 185 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 188 */     } else if (isFood(itemstack)) {
/* 189 */       usePlayerItem(sourceentity, hand, itemstack);
/* 190 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 191 */         tame(sourceentity);
/* 192 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 194 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 196 */       setPersistenceRequired();
/* 197 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 199 */       retval = super.mobInteract(sourceentity, hand);
/* 200 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 201 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 204 */     double x = getX();
/* 205 */     double y = getY();
/* 206 */     double z = getZ();
/* 207 */     HertxFBSitEntity hertxFBSitEntity = this;
/* 208 */     Level world = this.level;
/*     */     
/* 210 */     HertxFBSitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFBSitEntity, (Entity)sourceentity);
/* 211 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 216 */     super.playerTouch(sourceentity);
/* 217 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 222 */     HertxFBSitEntity retval = (HertxFBSitEntity)((EntityType)LatexModEntities.HERTX_FB_SIT.get()).create((Level)serverWorld);
/* 223 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 224 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 229 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 236 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 237 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 238 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 239 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 240 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 241 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 242 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 243 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\HertxFBSitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */