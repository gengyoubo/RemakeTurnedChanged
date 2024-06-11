/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.HertxFSitRightClickedOnEntityProcedure;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class HertxFSitEntity
/*     */   extends TamableAnimal {
/*     */   public HertxFSitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  57 */     this((EntityType<HertxFSitEntity>)LatexModEntities.HERTX_F_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxFSitEntity(EntityType<HertxFSitEntity> type, Level world) {
/*  61 */     super(type, world);
/*  62 */     this.xpReward = 4;
/*  63 */     setNoAi(false);
/*  64 */     setCustomName((Component)new TextComponent("§b[Idle]"));
/*  65 */     setCustomNameVisible(true);
/*  66 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  71 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  76 */     super.registerGoals();
/*  77 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  83 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, DarklatexEntity.class, 3.0F));
/*  84 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  85 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  86 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  87 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  92 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 107 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 112 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 117 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 122 */     if (source == DamageSource.FALL)
/* 123 */       return false; 
/* 124 */     if (source == DamageSource.CACTUS)
/* 125 */       return false; 
/* 126 */     if (source == DamageSource.DROWN)
/* 127 */       return false; 
/* 128 */     if (source == DamageSource.WITHER)
/* 129 */       return false; 
/* 130 */     if (source.getMsgId().equals("witherSkull"))
/* 131 */       return false; 
/* 132 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 137 */     super.die(source);
/* 138 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 144 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 145 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 146 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 151 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 152 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 153 */     Item item = itemstack.getItem();
/* 154 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 155 */       retval = super.mobInteract(sourceentity, hand);
/* 156 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 159 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 161 */     else if (isTame()) {
/* 162 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 163 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 164 */           usePlayerItem(sourceentity, hand, itemstack);
/* 165 */           heal(item.getFoodProperties().getNutrition());
/* 166 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 167 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 168 */           usePlayerItem(sourceentity, hand, itemstack);
/* 169 */           heal(4.0F);
/* 170 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 172 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 175 */     } else if (isFood(itemstack)) {
/* 176 */       usePlayerItem(sourceentity, hand, itemstack);
/* 177 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 178 */         tame(sourceentity);
/* 179 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 181 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 183 */       setPersistenceRequired();
/* 184 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 186 */       retval = super.mobInteract(sourceentity, hand);
/* 187 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 188 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 191 */     double x = getX();
/* 192 */     double y = getY();
/* 193 */     double z = getZ();
/* 194 */     HertxFSitEntity hertxFSitEntity = this;
/* 195 */     Level world = this.level;
/*     */     
/* 197 */     HertxFSitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFSitEntity, (Entity)sourceentity);
/* 198 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 203 */     super.playerTouch(sourceentity);
/* 204 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 209 */     HertxFSitEntity retval = (HertxFSitEntity)((EntityType)LatexModEntities.HERTX_F_SIT.get()).create((Level)serverWorld);
/* 210 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 211 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 216 */     return List.<Item>of((Item)LatexModItems.DARKLATEXGOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 223 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 224 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 225 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 226 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 227 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 228 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 229 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 230 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\HertxFSitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */