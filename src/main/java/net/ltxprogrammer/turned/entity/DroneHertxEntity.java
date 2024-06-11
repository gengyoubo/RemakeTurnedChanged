/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxKillsEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class DroneHertxEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public DroneHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  64 */     this((EntityType<DroneHertxEntity>)LatexModEntities.DRONE_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public DroneHertxEntity(EntityType<DroneHertxEntity> type, Level world) {
/*  68 */     super(type, world);
/*  69 */     this.f_21364_ = 12;
/*  70 */     m_21557_(false);
/*  71 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  76 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  81 */     super.m_8099_();
/*  82 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  85 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  88 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean m_8036_() {
/*  91 */             double x = DroneHertxEntity.this.m_20185_();
/*  92 */             double y = DroneHertxEntity.this.m_20186_();
/*  93 */             double z = DroneHertxEntity.this.m_20189_();
/*  94 */             DroneHertxEntity droneHertxEntity = DroneHertxEntity.this;
/*  95 */             Level world = DroneHertxEntity.this.f_19853_;
/*  96 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)droneHertxEntity));
/*     */           }
/*     */         });
/*  99 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 100 */     this.f_21346_.m_25352_(4, (Goal)new OwnerHurtTargetGoal(this));
/* 101 */     this.f_21345_.m_25352_(5, (Goal)new FollowOwnerGoal(this, 0.9D, 4.0F, 48.0F, false));
/* 102 */     this.f_21345_.m_25352_(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 103 */     this.f_21345_.m_25352_(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 104 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 105 */     this.f_21345_.m_25352_(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 106 */     this.f_21346_.m_25352_(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 107 */     this.f_21345_.m_25352_(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 108 */     this.f_21345_.m_25352_(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 113 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 123 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 128 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 133 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 143 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 144 */       return false; 
/* 145 */     if (source == DamageSource.f_19314_)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.f_19312_)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.f_19323_)
/* 150 */       return false; 
/* 151 */     if (source == DamageSource.f_19320_)
/* 152 */       return false; 
/* 153 */     if (source.m_19385_().equals("witherSkull"))
/* 154 */       return false; 
/* 155 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 160 */     super.m_6667_(source);
/* 161 */     DroneHertxDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 167 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 168 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 169 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 174 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 175 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 176 */     Item item = itemstack.m_41720_();
/* 177 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 178 */       retval = super.m_6071_(sourceentity, hand);
/* 179 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 182 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 184 */     else if (m_21824_()) {
/* 185 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 186 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 187 */           m_142075_(sourceentity, hand, itemstack);
/* 188 */           m_5634_(item.m_41473_().m_38744_());
/* 189 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 190 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 191 */           m_142075_(sourceentity, hand, itemstack);
/* 192 */           m_5634_(4.0F);
/* 193 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 195 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 198 */     } else if (m_6898_(itemstack)) {
/* 199 */       m_142075_(sourceentity, hand, itemstack);
/* 200 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 201 */         m_21828_(sourceentity);
/* 202 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 204 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 206 */       m_21530_();
/* 207 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 209 */       retval = super.m_6071_(sourceentity, hand);
/* 210 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 211 */         m_21530_();
/*     */       }
/*     */     } 
/* 214 */     double x = m_20185_();
/* 215 */     double y = m_20186_();
/* 216 */     double z = m_20189_();
/* 217 */     DroneHertxEntity droneHertxEntity = this;
/* 218 */     Level world = this.f_19853_;
/*     */     
/* 220 */     DroneHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)droneHertxEntity, (Entity)sourceentity);
/* 221 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 226 */     super.m_5993_(entity, score, damageSource);
/* 227 */     DroneHertxKillsEntityProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 232 */     DroneHertxEntity retval = (DroneHertxEntity)((EntityType)LatexModEntities.DRONE_HERTX.get()).m_20615_((Level)serverWorld);
/* 233 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 234 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 239 */     return List.<Item>of(Items.f_42416_, Items.f_42749_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 246 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 247 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 248 */     builder = builder.m_22268_(Attributes.f_22276_, 48.0D);
/* 249 */     builder = builder.m_22268_(Attributes.f_22284_, 9.0D);
/* 250 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 251 */     builder = builder.m_22268_(Attributes.f_22277_, 24.0D);
/* 252 */     builder = builder.m_22268_(Attributes.f_22278_, 0.4D);
/* 253 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DroneHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */