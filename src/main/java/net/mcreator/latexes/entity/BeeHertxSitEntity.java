/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.BeeHertxSitRightClickedOnEntityProcedure;
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
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class BeeHertxSitEntity
/*     */   extends TamableAnimal {
/*     */   public BeeHertxSitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  59 */     this((EntityType<BeeHertxSitEntity>)LatexModEntities.BEE_HERTX_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public BeeHertxSitEntity(EntityType<BeeHertxSitEntity> type, Level world) {
/*  63 */     super(type, world);
/*  64 */     this.xpReward = 4;
/*  65 */     setNoAi(false);
/*  66 */     setCustomName((Component)new TextComponent("§e[Idle]"));
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
/*  85 */     this.goalSelector.addGoal(2, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 3.0F));
/*  86 */     this.goalSelector.addGoal(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 6.0F));
/*  87 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  88 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  89 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  94 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  99 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 104 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 109 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 114 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 119 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 124 */     if (source == DamageSource.FALL)
/* 125 */       return false; 
/* 126 */     if (source == DamageSource.CACTUS)
/* 127 */       return false; 
/* 128 */     if (source == DamageSource.DROWN)
/* 129 */       return false; 
/* 130 */     if (source == DamageSource.WITHER)
/* 131 */       return false; 
/* 132 */     if (source.getMsgId().equals("witherSkull"))
/* 133 */       return false; 
/* 134 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 139 */     super.die(source);
/* 140 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 146 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 147 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 148 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 153 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 154 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 155 */     Item item = itemstack.getItem();
/* 156 */     if (itemstack.getItem() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 157 */       retval = super.mobInteract(sourceentity, hand);
/* 158 */     } else if (this.level.isClientSide()) {
/*     */ 
/*     */       
/* 161 */       retval = ((isTame() && isOwnedBy((LivingEntity)sourceentity)) || isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
/*     */     }
/* 163 */     else if (isTame()) {
/* 164 */       if (isOwnedBy((LivingEntity)sourceentity)) {
/* 165 */         if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 166 */           usePlayerItem(sourceentity, hand, itemstack);
/* 167 */           heal(item.getFoodProperties().getNutrition());
/* 168 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 169 */         } else if (isFood(itemstack) && getHealth() < getMaxHealth()) {
/* 170 */           usePlayerItem(sourceentity, hand, itemstack);
/* 171 */           heal(4.0F);
/* 172 */           retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */         } else {
/* 174 */           retval = super.mobInteract(sourceentity, hand);
/*     */         } 
/*     */       }
/* 177 */     } else if (isFood(itemstack)) {
/* 178 */       usePlayerItem(sourceentity, hand, itemstack);
/* 179 */       if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 180 */         tame(sourceentity);
/* 181 */         this.level.broadcastEntityEvent((Entity)this, (byte)7);
/*     */       } else {
/* 183 */         this.level.broadcastEntityEvent((Entity)this, (byte)6);
/*     */       } 
/* 185 */       setPersistenceRequired();
/* 186 */       retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/*     */     } else {
/* 188 */       retval = super.mobInteract(sourceentity, hand);
/* 189 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 190 */         setPersistenceRequired();
/*     */       }
/*     */     } 
/* 193 */     double x = getX();
/* 194 */     double y = getY();
/* 195 */     double z = getZ();
/* 196 */     BeeHertxSitEntity beeHertxSitEntity = this;
/* 197 */     Level world = this.level;
/*     */     
/* 199 */     BeeHertxSitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)beeHertxSitEntity, (Entity)sourceentity);
/* 200 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 205 */     super.playerTouch(sourceentity);
/* 206 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
/* 211 */     BeeHertxSitEntity retval = (BeeHertxSitEntity)((EntityType)LatexModEntities.BEE_HERTX_SIT.get()).create((Level)serverWorld);
/* 212 */     retval.finalizeSpawn((ServerLevelAccessor)serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 213 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFood(ItemStack stack) {
/* 218 */     return List.<Item>of(new Item[] { Items.HONEYCOMB, Items.HONEY_BOTTLE, (Item)LatexModItems.DARKLATEXGOO.get(), Blocks.DANDELION.asItem(), Blocks.POPPY.asItem(), Blocks.BLUE_ORCHID
/* 219 */           .asItem(), Blocks.ALLIUM.asItem(), Blocks.AZURE_BLUET.asItem(), Blocks.RED_TULIP.asItem(), Blocks.ORANGE_TULIP
/* 220 */           .asItem(), Blocks.WHITE_TULIP.asItem(), Blocks.PINK_TULIP.asItem(), Blocks.OXEYE_DAISY.asItem(), Blocks.CORNFLOWER
/* 221 */           .asItem(), Blocks.SUNFLOWER.asItem() }).contains(stack.getItem());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 228 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 229 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 230 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 231 */     builder = builder.add(Attributes.ARMOR, 5.0D);
/* 232 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 0.0D);
/* 233 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 234 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 235 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\BeeHertxSitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */