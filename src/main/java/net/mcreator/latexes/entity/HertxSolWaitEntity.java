/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxSolWaitEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxSolWaitRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.TamableAnimal;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
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
/*     */ public class HertxSolWaitEntity extends TamableAnimal {
/*     */   public HertxSolWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<HertxSolWaitEntity>)LatexModEntities.HERTX_SOL_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxSolWaitEntity(EntityType<HertxSolWaitEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.xpReward = 16;
/*  62 */     setNoAi(false);
/*  63 */     setCustomName((Component)new TextComponent("§6[Idle]"));
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
/*  76 */     this.goalSelector.addGoal(1, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  77 */     this.goalSelector.addGoal(2, (Goal)new RandomLookAroundGoal((Mob)this));
/*  78 */     this.goalSelector.addGoal(3, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  83 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  88 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/*  93 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/*  98 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 103 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 108 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 113 */     HertxSolWaitEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 114 */     if (source == DamageSource.FALL)
/* 115 */       return false; 
/* 116 */     if (source == DamageSource.CACTUS)
/* 117 */       return false; 
/* 118 */     if (source == DamageSource.DROWN)
/* 119 */       return false; 
/* 120 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 125 */     super.die(source);
/* 126 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 132 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 133 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 134 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 139 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 140 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 141 */     Item item = itemstack.getItem();
/* 142 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 143 */       retval = super.mobInteract(sourceentity, hand);
/* 144 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 147 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 149 */     else if (isTame()) {
/* 150 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 151 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 152 */           usePlayerItem(sourceentity, hand, itemstack);
/* 153 */           heal(item.getFoodProperties().getNutrition());
/* 154 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 155 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 156 */           usePlayerItem(sourceentity, hand, itemstack);
/* 157 */           heal(4.0F);
/* 158 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 160 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 163 */     } else if (isFood(itemstack)) {
/* 164 */       usePlayerItem(sourceentity, hand, itemstack);
/* 165 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 166 */         tame(sourceentity);
/* 167 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 169 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 171 */       setPersistenceRequired();
/* 172 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 174 */       retval = super.mobInteract(sourceentity, hand);
/* 175 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 176 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 179 */     double x = getX();
/* 180 */     double y = getY();
/* 181 */     double z = getZ();
/* 182 */     HertxSolWaitEntity hertxSolWaitEntity = this;
/* 183 */     Level world = this.level;
/*     */     
/* 185 */     HertxSolWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxSolWaitEntity, (Entity)sourceentity);
/* 186 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 191 */     super.awardKillScore(entity, score, damageSource);
/* 192 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 197 */     super.playerTouch(sourceentity);
/* 198 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 203 */     HertxSolWaitEntity retval = (HertxSolWaitEntity)((EntityType)LatexModEntities.HERTX_SOL_WAIT.get()).create((Level)serverWorld);
/* 204 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 205 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 210 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), Items.IRON_NUGGET, Items.IRON_INGOT).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 217 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 218 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 219 */     builder = builder.add(Attributes.MAX_HEALTH, 40.0D);
/* 220 */     builder = builder.add(Attributes.ARMOR, 7.5D);
/* 221 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 222 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 223 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4D);
/* 224 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 225 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\HertxSolWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */