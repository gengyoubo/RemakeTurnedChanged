/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure;
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
/*     */ public class HertxEntity
/*     */   extends TamableAnimal {
/*     */   public HertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  64 */     this((EntityType<HertxEntity>)LatexModEntities.HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public HertxEntity(EntityType<HertxEntity> type, Level world) {
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
/*  91 */             double x = HertxEntity.this.m_20185_();
/*  92 */             double y = HertxEntity.this.m_20186_();
/*  93 */             double z = HertxEntity.this.m_20189_();
/*  94 */             HertxEntity hertxEntity = HertxEntity.this;
/*  95 */             Level world = HertxEntity.this.f_19853_;
/*  96 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxEntity));
/*     */           }
/*     */         });
/*  99 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 100 */     this.f_21346_.m_25352_(4, (Goal)new OwnerHurtTargetGoal(this));
/* 101 */     this.f_21345_.m_25352_(5, (Goal)new FollowOwnerGoal(this, 1.0D, 3.0F, 48.0F, false));
/* 102 */     this.f_21345_.m_25352_(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 103 */     this.f_21345_.m_25352_(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 104 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 105 */     this.f_21345_.m_25352_(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
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
/* 128 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 133 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 143 */     if (source == DamageSource.f_19315_)
/* 144 */       return false; 
/* 145 */     if (source == DamageSource.f_19314_)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.f_19312_)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.f_19320_)
/* 150 */       return false; 
/* 151 */     if (source.m_19385_().equals("witherSkull"))
/* 152 */       return false; 
/* 153 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 158 */     super.m_6667_(source);
/* 159 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 165 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 166 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 167 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 172 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 173 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 174 */     Item item = itemstack.m_41720_();
/* 175 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 176 */       retval = super.m_6071_(sourceentity, hand);
/* 177 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 180 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 182 */     else if (m_21824_()) {
/* 183 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 184 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 185 */           m_142075_(sourceentity, hand, itemstack);
/* 186 */           m_5634_(item.m_41473_().m_38744_());
/* 187 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 188 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 189 */           m_142075_(sourceentity, hand, itemstack);
/* 190 */           m_5634_(4.0F);
/* 191 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 193 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 196 */     } else if (m_6898_(itemstack)) {
/* 197 */       m_142075_(sourceentity, hand, itemstack);
/* 198 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 199 */         m_21828_(sourceentity);
/* 200 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 202 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 204 */       m_21530_();
/* 205 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 207 */       retval = super.m_6071_(sourceentity, hand);
/* 208 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 209 */         m_21530_();
/*     */       }
/*     */     } 
/* 212 */     double x = m_20185_();
/* 213 */     double y = m_20186_();
/* 214 */     double z = m_20189_();
/* 215 */     HertxEntity hertxEntity = this;
/* 216 */     Level world = this.f_19853_;
/*     */     
/* 218 */     HertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxEntity, (Entity)sourceentity);
/* 219 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 224 */     super.m_5993_(entity, score, damageSource);
/* 225 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 230 */     super.m_6123_(sourceentity);
/* 231 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 236 */     HertxEntity retval = (HertxEntity)((EntityType)LatexModEntities.HERTX.get()).m_20615_((Level)serverWorld);
/* 237 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 238 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 243 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 250 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 251 */     builder = builder.m_22268_(Attributes.f_22279_, 0.32D);
/* 252 */     builder = builder.m_22268_(Attributes.f_22276_, 36.0D);
/* 253 */     builder = builder.m_22268_(Attributes.f_22284_, 4.0D);
/* 254 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 255 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 256 */     builder = builder.m_22268_(Attributes.f_22278_, 0.2D);
/* 257 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */