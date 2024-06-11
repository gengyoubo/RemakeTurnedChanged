/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.AshburySitRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
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
/*     */ public class AshburySitEntity
/*     */   extends TamableAnimal {
/*     */   public AshburySitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  58 */     this((EntityType<AshburySitEntity>)LatexModEntities.ASHBURY_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public AshburySitEntity(EntityType<AshburySitEntity> type, Level world) {
/*  62 */     super(type, world);
/*  63 */     this.xpReward = 4;
/*  64 */     setNoAi(false);
/*  65 */     setCustomName((Component)new TextComponent("§6[Idle]"));
/*  66 */     setCustomNameVisible(true);
/*  67 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  72 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  77 */     super.registerGoals();
/*  78 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  81 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  84 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/*  85 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  86 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  87 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  88 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  93 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 103 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 108 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 113 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 118 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 123 */     if (source == DamageSource.FALL)
/* 124 */       return false; 
/* 125 */     if (source == DamageSource.CACTUS)
/* 126 */       return false; 
/* 127 */     if (source == DamageSource.DROWN)
/* 128 */       return false; 
/* 129 */     if (source == DamageSource.WITHER)
/* 130 */       return false; 
/* 131 */     if (source.getMsgId().equals("witherSkull"))
/* 132 */       return false; 
/* 133 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 138 */     super.die(source);
/* 139 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 145 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 146 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 147 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 152 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 153 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 154 */     Item item = itemstack.getItem();
/* 155 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 156 */       retval = super.mobInteract(sourceentity, hand);
/* 157 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 160 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 162 */     else if (isTame()) {
/* 163 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 164 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 165 */           usePlayerItem(sourceentity, hand, itemstack);
/* 166 */           heal(item.getFoodProperties().getNutrition());
/* 167 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 168 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 169 */           usePlayerItem(sourceentity, hand, itemstack);
/* 170 */           heal(4.0F);
/* 171 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 173 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 176 */     } else if (isFood(itemstack)) {
/* 177 */       usePlayerItem(sourceentity, hand, itemstack);
/* 178 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 179 */         tame(sourceentity);
/* 180 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 182 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 184 */       setPersistenceRequired();
/* 185 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 187 */       retval = super.mobInteract(sourceentity, hand);
/* 188 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 189 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 192 */     double x = getX();
/* 193 */     double y = getY();
/* 194 */     double z = getZ();
/* 195 */     AshburySitEntity ashburySitEntity = this;
/* 196 */     Level world = this.level;
/*     */     
/* 198 */     AshburySitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)ashburySitEntity, (Entity)sourceentity);
/* 199 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 204 */     super.playerTouch(sourceentity);
/* 205 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 210 */     AshburySitEntity retval = (AshburySitEntity)((EntityType)LatexModEntities.ASHBURY_SIT.get()).create((Level)serverWorld);
/* 211 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 212 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 217 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), (Item)LatexModItems.LATEX_SOUP.get(), Items.ORANGE_DYE).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 224 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 225 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 226 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 227 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 228 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 229 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 230 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 231 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\AshburySitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */