/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDroneHertxDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDroneHertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDronehertxrightclickProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
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
/*     */ public class ArmedDroneHertxEntity
/*     */   extends TamableAnimal
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public ArmedDroneHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  67 */     this((EntityType<ArmedDroneHertxEntity>)LatexModEntities.ARMED_DRONE_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public ArmedDroneHertxEntity(EntityType<ArmedDroneHertxEntity> type, Level world) {
/*  71 */     super(type, world);
/*  72 */     this.f_21364_ = 14;
/*  73 */     m_21557_(false);
/*  74 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  79 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  84 */     super.m_8099_();
/*  85 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  88 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  91 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, true)
/*     */         {
/*     */           public boolean m_8036_() {
/*  94 */             double x = ArmedDroneHertxEntity.this.m_20185_();
/*  95 */             double y = ArmedDroneHertxEntity.this.m_20186_();
/*  96 */             double z = ArmedDroneHertxEntity.this.m_20189_();
/*  97 */             ArmedDroneHertxEntity armedDroneHertxEntity = ArmedDroneHertxEntity.this;
/*  98 */             Level world = ArmedDroneHertxEntity.this.f_19853_;
/*  99 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxEntity));
/*     */           }
/*     */         });
/* 102 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, 10, true, false, TargetCheck.IS_EVIL));
/* 103 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, 10, false, false, TargetCheck.IS_LATEX));
/* 104 */     this.f_21345_.m_25352_(5, (Goal)new OwnerHurtByTargetGoal(this));
/* 105 */     this.f_21346_.m_25352_(6, (Goal)new OwnerHurtTargetGoal(this));
/* 106 */     this.f_21345_.m_25352_(7, (Goal)new FollowOwnerGoal(this, 0.9D, 4.0F, 36.0F, false));
/* 107 */     this.f_21345_.m_25352_(8, (Goal)new OpenDoorGoal((Mob)this, true));
/* 108 */     this.f_21345_.m_25352_(9, (Goal)new OpenDoorGoal((Mob)this, false));
/* 109 */     this.f_21345_.m_25352_(10, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 110 */     this.f_21345_.m_25352_(11, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.7D));
/* 111 */     this.f_21346_.m_25352_(12, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 112 */     this.f_21345_.m_25352_(13, (Goal)new RandomLookAroundGoal((Mob)this));
/* 113 */     this.f_21345_.m_25352_(14, (Goal)new FloatGoal((Mob)this));
/* 114 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 117 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 124 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 134 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 139 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 144 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 149 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 154 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 155 */       return false; 
/* 156 */     if (source == DamageSource.f_19314_)
/* 157 */       return false; 
/* 158 */     if (source == DamageSource.f_19312_)
/* 159 */       return false; 
/* 160 */     if (source == DamageSource.f_19323_)
/* 161 */       return false; 
/* 162 */     if (source == DamageSource.f_19320_)
/* 163 */       return false; 
/* 164 */     if (source.m_19385_().equals("witherSkull"))
/* 165 */       return false; 
/* 166 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 171 */     super.m_6667_(source);
/* 172 */     ArmedDroneHertxDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 178 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 179 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 180 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 185 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 186 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 187 */     Item item = itemstack.m_41720_();
/* 188 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 189 */       retval = super.m_6071_(sourceentity, hand);
/* 190 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 193 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 195 */     else if (m_21824_()) {
/* 196 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 197 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 198 */           m_142075_(sourceentity, hand, itemstack);
/* 199 */           m_5634_(item.m_41473_().m_38744_());
/* 200 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 201 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 202 */           m_142075_(sourceentity, hand, itemstack);
/* 203 */           m_5634_(4.0F);
/* 204 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 206 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 209 */     } else if (m_6898_(itemstack)) {
/* 210 */       m_142075_(sourceentity, hand, itemstack);
/* 211 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 212 */         m_21828_(sourceentity);
/* 213 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 215 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 217 */       m_21530_();
/* 218 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 220 */       retval = super.m_6071_(sourceentity, hand);
/* 221 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 222 */         m_21530_();
/*     */       }
/*     */     } 
/* 225 */     double x = m_20185_();
/* 226 */     double y = m_20186_();
/* 227 */     double z = m_20189_();
/* 228 */     ArmedDroneHertxEntity armedDroneHertxEntity = this;
/* 229 */     Level world = this.f_19853_;
/*     */     
/* 231 */     ArmedDronehertxrightclickProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxEntity, (Entity)sourceentity);
/* 232 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 237 */     super.m_6123_(sourceentity);
/* 238 */     ArmedDroneHertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 243 */     M4AssaultRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 248 */     ArmedDroneHertxEntity retval = (ArmedDroneHertxEntity)((EntityType)LatexModEntities.ARMED_DRONE_HERTX.get()).m_20615_((Level)serverWorld);
/* 249 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 250 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 255 */     return List.<Item>of(Items.f_42416_, Items.f_42749_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 262 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 263 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 264 */     builder = builder.m_22268_(Attributes.f_22276_, 58.0D);
/* 265 */     builder = builder.m_22268_(Attributes.f_22284_, 9.0D);
/* 266 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 267 */     builder = builder.m_22268_(Attributes.f_22277_, 24.0D);
/* 268 */     builder = builder.m_22268_(Attributes.f_22278_, 0.6D);
/* 269 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 270 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ArmedDroneHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */