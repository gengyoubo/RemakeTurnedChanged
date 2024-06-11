/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.SlimelingEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.SlimelingtamedsitRightClickedOnEntityProcedure;
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
/*     */ public class SlimelingtamedsitEntity
/*     */   extends TamableAnimal {
/*     */   public SlimelingtamedsitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<SlimelingtamedsitEntity>)LatexModEntities.SLIMELINGTAMEDSIT.get(), world);
/*     */   }
/*     */   
/*     */   public SlimelingtamedsitEntity(EntityType<SlimelingtamedsitEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.xpReward = 4;
/*  62 */     setNoAi(false);
/*  63 */     setCustomName((Component)new TextComponent("§a[Idle]"));
/*  64 */     setCustomNameVisible(true);
/*  65 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  70 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  75 */     super.registerGoals();
/*  76 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  79 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  82 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, DarklatexEntity.class, 3.0F));
/*  83 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  84 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  85 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  86 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  91 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  96 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 101 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 106 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 111 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 116 */     if (source == DamageSource.FALL)
/* 117 */       return false; 
/* 118 */     if (source == DamageSource.CACTUS)
/* 119 */       return false; 
/* 120 */     if (source == DamageSource.DROWN)
/* 121 */       return false; 
/* 122 */     if (source == DamageSource.WITHER)
/* 123 */       return false; 
/* 124 */     if (source.getMsgId().equals("witherSkull"))
/* 125 */       return false; 
/* 126 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 131 */     super.die(source);
/* 132 */     SlimelingEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 138 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 139 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 140 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 145 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 146 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 147 */     Item item = itemstack.getItem();
/* 148 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 149 */       retval = super.mobInteract(sourceentity, hand);
/* 150 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 153 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 155 */     else if (isTame()) {
/* 156 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 157 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 158 */           usePlayerItem(sourceentity, hand, itemstack);
/* 159 */           heal(item.getFoodProperties().getNutrition());
/* 160 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 161 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 162 */           usePlayerItem(sourceentity, hand, itemstack);
/* 163 */           heal(4.0F);
/* 164 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 166 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 169 */     } else if (isFood(itemstack)) {
/* 170 */       usePlayerItem(sourceentity, hand, itemstack);
/* 171 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 172 */         tame(sourceentity);
/* 173 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 175 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 177 */       setPersistenceRequired();
/* 178 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 180 */       retval = super.mobInteract(sourceentity, hand);
/* 181 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 182 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 185 */     double x = getX();
/* 186 */     double y = getY();
/* 187 */     double z = getZ();
/* 188 */     SlimelingtamedsitEntity slimelingtamedsitEntity = this;
/* 189 */     Level world = this.level;
/*     */     
/* 191 */     SlimelingtamedsitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingtamedsitEntity, (Entity)sourceentity);
/* 192 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 197 */     SlimelingtamedsitEntity retval = (SlimelingtamedsitEntity)((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get()).create((Level)serverWorld);
/* 198 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 199 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 204 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 211 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 212 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 213 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 214 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 215 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 216 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 217 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 218 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\SlimelingtamedsitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */