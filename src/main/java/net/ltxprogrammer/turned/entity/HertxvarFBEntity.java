/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Objects;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxvarFBRightClickedOnEntityProcedure;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class HertxvarFBEntity
/*     */   extends TamableAnimal {
/*     */   public HertxvarFBEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  63 */     this((EntityType<HertxvarFBEntity>)LatexModEntities.HERTXVAR_FB.get(), world);
/*     */   }
/*     */   
/*     */   public HertxvarFBEntity(EntityType<HertxvarFBEntity> type, Level world) {
/*  67 */     super(type, world);
/*  68 */     this.f_21364_ = 12;
/*  69 */     m_21557_(false);
/*  70 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  75 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  80 */     super.m_8099_();
/*  81 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  84 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  87 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean m_8036_() {
/*  90 */             double x = HertxvarFBEntity.this.m_20185_();
/*  91 */             double y = HertxvarFBEntity.this.m_20186_();
/*  92 */             double z = HertxvarFBEntity.this.m_20189_();
/*  93 */             HertxvarFBEntity hertxvarFBEntity = HertxvarFBEntity.this;
/*  94 */             Level world = HertxvarFBEntity.this.f_19853_;
/*  95 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxvarFBEntity));
/*     */           }
/*     */         });
/*  98 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/*  99 */     this.f_21346_.m_25352_(4, (Goal)new OwnerHurtTargetGoal(this));
/* 100 */     this.f_21345_.m_25352_(5, (Goal)new FollowOwnerGoal(this, 1.0D, 3.0F, 64.0F, false));
/* 101 */     this.f_21345_.m_25352_(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 102 */     this.f_21345_.m_25352_(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 103 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 104 */     this.f_21345_.m_25352_(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 105 */     this.f_21346_.m_25352_(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 106 */     this.f_21345_.m_25352_(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 107 */     this.f_21345_.m_25352_(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 112 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 117 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 122 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 127 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 132 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 137 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 142 */     if (source == DamageSource.f_19315_)
/* 143 */       return false; 
/* 144 */     if (source == DamageSource.f_19314_)
/* 145 */       return false; 
/* 146 */     if (source == DamageSource.f_19312_)
/* 147 */       return false; 
/* 148 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 153 */     super.m_6667_(source);
/* 154 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 160 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 161 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 162 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 167 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 168 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 169 */     Item item = itemstack.m_41720_();
/* 170 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 171 */       retval = super.m_6071_(sourceentity, hand);
/* 172 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 175 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 177 */     else if (m_21824_()) {
/* 178 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 179 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 180 */           m_142075_(sourceentity, hand, itemstack);
/* 181 */           m_5634_(item.m_41473_().m_38744_());
/* 182 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 183 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 184 */           m_142075_(sourceentity, hand, itemstack);
/* 185 */           m_5634_(4.0F);
/* 186 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 188 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 191 */     } else if (m_6898_(itemstack)) {
/* 192 */       m_142075_(sourceentity, hand, itemstack);
/* 193 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 194 */         m_21828_(sourceentity);
/* 195 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 197 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 199 */       m_21530_();
/* 200 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 202 */       retval = super.m_6071_(sourceentity, hand);
/* 203 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 204 */         m_21530_();
/*     */       }
/*     */     } 
/* 207 */     double x = m_20185_();
/* 208 */     double y = m_20186_();
/* 209 */     double z = m_20189_();
/* 210 */     HertxvarFBEntity hertxvarFBEntity = this;
/* 211 */     Level world = this.f_19853_;
/*     */     
/* 213 */     HertxvarFBRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxvarFBEntity, (Entity)sourceentity);
/* 214 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 219 */     super.m_5993_(entity, score, damageSource);
/* 220 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 225 */     super.m_6123_(sourceentity);
/* 226 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 231 */     HertxvarFBEntity retval = (HertxvarFBEntity)((EntityType)LatexModEntities.HERTXVAR_FB.get()).m_20615_((Level)serverWorld);
/* 232 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 233 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 238 */     return Objects.equals(ChangedItems.DARK_LATEX_GOO.get(), stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 245 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 246 */     builder = builder.m_22268_(Attributes.f_22279_, 0.32D);
/* 247 */     builder = builder.m_22268_(Attributes.f_22276_, 45.0D);
/* 248 */     builder = builder.m_22268_(Attributes.f_22284_, 6.0D);
/* 249 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 250 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 251 */     builder = builder.m_22268_(Attributes.f_22278_, 0.2D);
/* 252 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxvarFBEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */