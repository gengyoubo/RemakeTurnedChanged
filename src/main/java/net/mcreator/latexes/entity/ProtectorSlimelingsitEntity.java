/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.mcreator.latexes.procedures.ProtectorSlimelingsitRightClickedOnEntityProcedure;
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
/*     */ public class ProtectorSlimelingsitEntity
/*     */   extends TamableAnimal {
/*     */   public ProtectorSlimelingsitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<ProtectorSlimelingsitEntity>)LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), world);
/*     */   }
/*     */   
/*     */   public ProtectorSlimelingsitEntity(EntityType<ProtectorSlimelingsitEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.xpReward = 6;
/*  61 */     setNoAi(false);
/*  62 */     setCustomName((Component)new TextComponent("§d[Idle]"));
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
/*  75 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  78 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  81 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, DarklatexEntity.class, 3.0F));
/*  82 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  83 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  84 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  85 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  90 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  95 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 100 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 105 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 110 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 115 */     if (source == DamageSource.FALL)
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
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 131 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 132 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 133 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 138 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 139 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 140 */     Item item = itemstack.getItem();
/* 141 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 142 */       retval = super.mobInteract(sourceentity, hand);
/* 143 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 146 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 148 */     else if (isTame()) {
/* 149 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 150 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 151 */           usePlayerItem(sourceentity, hand, itemstack);
/* 152 */           heal(item.getFoodProperties().getNutrition());
/* 153 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 154 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 155 */           usePlayerItem(sourceentity, hand, itemstack);
/* 156 */           heal(4.0F);
/* 157 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 159 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 162 */     } else if (isFood(itemstack)) {
/* 163 */       usePlayerItem(sourceentity, hand, itemstack);
/* 164 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 165 */         tame(sourceentity);
/* 166 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 168 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 170 */       setPersistenceRequired();
/* 171 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 173 */       retval = super.mobInteract(sourceentity, hand);
/* 174 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 175 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 178 */     double x = getX();
/* 179 */     double y = getY();
/* 180 */     double z = getZ();
/* 181 */     ProtectorSlimelingsitEntity protectorSlimelingsitEntity = this;
/* 182 */     Level world = this.level;
/*     */     
/* 184 */     ProtectorSlimelingsitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingsitEntity, (Entity)sourceentity);
/* 185 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 190 */     ProtectorSlimelingsitEntity retval = (ProtectorSlimelingsitEntity)((EntityType)LatexModEntities.PROTECTOR_SLIMELINGSIT.get()).create((Level)serverWorld);
/* 191 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 192 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 197 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 204 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 205 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 206 */     builder = builder.add(Attributes.MAX_HEALTH, 50.0D);
/* 207 */     builder = builder.add(Attributes.ARMOR, 5.5D);
/* 208 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 209 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 210 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.6D);
/* 211 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\ProtectorSlimelingsitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */