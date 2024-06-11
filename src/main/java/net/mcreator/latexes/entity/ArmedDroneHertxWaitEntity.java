/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.ArmedDroneHertxDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.ArmedDroneHertxWaitEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.ArmedDroneHertxWaitRightClickedOnEntityProcedure;
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
/*     */ public class ArmedDroneHertxWaitEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public ArmedDroneHertxWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<ArmedDroneHertxWaitEntity>)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public ArmedDroneHertxWaitEntity(EntityType<ArmedDroneHertxWaitEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.xpReward = 16;
/*  61 */     setNoAi(false);
/*  62 */     setCustomName((Component)new TextComponent("§6[Idle]"));
/*  63 */     setCustomNameVisible(true);
/*  64 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  69 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  74 */     super.registerGoals();
/*  75 */     this.goalSelector.addGoal(1, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  76 */     this.goalSelector.addGoal(2, (Goal)new RandomLookAroundGoal((Mob)this));
/*  77 */     this.goalSelector.addGoal(3, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  82 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/*  92 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/*  97 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 107 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 112 */     ArmedDroneHertxWaitEntityIsHurtProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/* 113 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 114 */       return false; 
/* 115 */     if (source == DamageSource.CACTUS)
/* 116 */       return false; 
/* 117 */     if (source == DamageSource.DROWN)
/* 118 */       return false; 
/* 119 */     if (source == DamageSource.WITHER)
/* 120 */       return false; 
/* 121 */     if (source.getMsgId().equals("witherSkull"))
/* 122 */       return false; 
/* 123 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 128 */     super.die(source);
/* 129 */     ArmedDroneHertxDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 135 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 136 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 137 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 142 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 143 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 144 */     Item item = itemstack.getItem();
/* 145 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 146 */       retval = super.mobInteract(sourceentity, hand);
/* 147 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 150 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 152 */     else if (isTame()) {
/* 153 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 154 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 155 */           usePlayerItem(sourceentity, hand, itemstack);
/* 156 */           heal(item.getFoodProperties().getNutrition());
/* 157 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 158 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 159 */           usePlayerItem(sourceentity, hand, itemstack);
/* 160 */           heal(4.0F);
/* 161 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 163 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 166 */     } else if (isFood(itemstack)) {
/* 167 */       usePlayerItem(sourceentity, hand, itemstack);
/* 168 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 169 */         tame(sourceentity);
/* 170 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 172 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 174 */       setPersistenceRequired();
/* 175 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 177 */       retval = super.mobInteract(sourceentity, hand);
/* 178 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 179 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 182 */     double x = getX();
/* 183 */     double y = getY();
/* 184 */     double z = getZ();
/* 185 */     ArmedDroneHertxWaitEntity armedDroneHertxWaitEntity = this;
/* 186 */     Level world = this.level;
/*     */     
/* 188 */     ArmedDroneHertxWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxWaitEntity, (Entity)sourceentity);
/* 189 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 194 */     ArmedDroneHertxWaitEntity retval = (ArmedDroneHertxWaitEntity)((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get()).create((Level)serverWorld);
/* 195 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 196 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 201 */     return List.<Item>of(Items.IRON_NUGGET, Items.IRON_INGOT).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 208 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 209 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 210 */     builder = builder.add(Attributes.MAX_HEALTH, 42.0D);
/* 211 */     builder = builder.add(Attributes.ARMOR, 7.5D);
/* 212 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 213 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 214 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4D);
/* 215 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 216 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\ArmedDroneHertxWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */