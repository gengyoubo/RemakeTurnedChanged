/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.DroneHertxDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DroneHertxWaitEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DroneHertxWaitRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
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
/*     */ public class DroneHertxWaitEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public DroneHertxWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<DroneHertxWaitEntity>)LatexModEntities.DRONE_HERTX_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public DroneHertxWaitEntity(EntityType<DroneHertxWaitEntity> type, Level world) {
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
/*  77 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 8.0F));
/*  78 */     this.goalSelector.addGoal(3, (Goal)new RandomLookAroundGoal((Mob)this));
/*  79 */     this.goalSelector.addGoal(4, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  84 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  89 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/*  94 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/*  99 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 104 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 109 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 114 */     DroneHertxWaitEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 115 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 116 */       return false; 
/* 117 */     if (source == DamageSource.CACTUS)
/* 118 */       return false; 
/* 119 */     if (source == DamageSource.DROWN)
/* 120 */       return false; 
/* 121 */     if (source == DamageSource.WITHER)
/* 122 */       return false; 
/* 123 */     if (source.getMsgId().equals("witherSkull"))
/* 124 */       return false; 
/* 125 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 130 */     super.die(source);
/* 131 */     DroneHertxDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 137 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 138 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 139 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 144 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 145 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 146 */     Item item = itemstack.getItem();
/* 147 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 148 */       retval = super.mobInteract(sourceentity, hand);
/* 149 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 152 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 154 */     else if (isTame()) {
/* 155 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 156 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 157 */           usePlayerItem(sourceentity, hand, itemstack);
/* 158 */           heal(item.getFoodProperties().getNutrition());
/* 159 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 160 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 161 */           usePlayerItem(sourceentity, hand, itemstack);
/* 162 */           heal(4.0F);
/* 163 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 165 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 168 */     } else if (isFood(itemstack)) {
/* 169 */       usePlayerItem(sourceentity, hand, itemstack);
/* 170 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 171 */         tame(sourceentity);
/* 172 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 174 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 176 */       setPersistenceRequired();
/* 177 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 179 */       retval = super.mobInteract(sourceentity, hand);
/* 180 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 181 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 184 */     double x = getX();
/* 185 */     double y = getY();
/* 186 */     double z = getZ();
/* 187 */     DroneHertxWaitEntity droneHertxWaitEntity = this;
/* 188 */     Level world = this.level;
/*     */     
/* 190 */     DroneHertxWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)droneHertxWaitEntity, (Entity)sourceentity);
/* 191 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 196 */     DroneHertxWaitEntity retval = (DroneHertxWaitEntity)((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get()).create((Level)serverWorld);
/* 197 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 198 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 203 */     return List.<Item>of(Items.IRON_NUGGET, Items.IRON_INGOT).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 210 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 211 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 212 */     builder = builder.add(Attributes.MAX_HEALTH, 40.0D);
/* 213 */     builder = builder.add(Attributes.ARMOR, 7.5D);
/* 214 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 215 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 216 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4D);
/* 217 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 218 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DroneHertxWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */