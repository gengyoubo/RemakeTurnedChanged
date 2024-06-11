/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.BeeHertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.BeeHertxRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.BeeHertxThisEntityKillsAnotherOneProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
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
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class BeeHertxEntity
/*     */   extends TamableAnimal {
/*     */   public BeeHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<BeeHertxEntity>)LatexModEntities.BEE_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public BeeHertxEntity(EntityType<BeeHertxEntity> type, Level world) {
/*  69 */     super(type, world);
/*  70 */     this.f_21364_ = 15;
/*  71 */     m_21557_(false);
/*  72 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  77 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  82 */     super.m_8099_();
/*  83 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  86 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  89 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, false, false)
/*     */         {
/*     */           public boolean m_8036_() {
/*  92 */             double x = BeeHertxEntity.this.m_20185_();
/*  93 */             double y = BeeHertxEntity.this.m_20186_();
/*  94 */             double z = BeeHertxEntity.this.m_20189_();
/*  95 */             BeeHertxEntity beeHertxEntity = BeeHertxEntity.this;
/*  96 */             Level world = BeeHertxEntity.this.f_19853_;
/*  97 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)beeHertxEntity));
/*     */           }
/*     */         });
/* 100 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 101 */     this.f_21346_.m_25352_(4, (Goal)new OwnerHurtTargetGoal(this));
/* 102 */     this.f_21345_.m_25352_(5, (Goal)new FollowOwnerGoal(this, 1.0D, 1.0F, 36.0F, false));
/* 103 */     this.f_21345_.m_25352_(6, (Goal)new OpenDoorGoal((Mob)this, true));
/* 104 */     this.f_21345_.m_25352_(7, (Goal)new OpenDoorGoal((Mob)this, false));
/* 105 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 106 */     this.f_21345_.m_25352_(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 107 */     this.f_21346_.m_25352_(10, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 108 */     this.f_21345_.m_25352_(11, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.f_21345_.m_25352_(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 114 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 119 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 129 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 134 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 139 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 144 */     if (source == DamageSource.f_19315_)
/* 145 */       return false; 
/* 146 */     if (source == DamageSource.f_19314_)
/* 147 */       return false; 
/* 148 */     if (source == DamageSource.f_19312_)
/* 149 */       return false; 
/* 150 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 155 */     super.m_6667_(source);
/* 156 */     BeeHertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 162 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 163 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 164 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 169 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 170 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 171 */     Item item = itemstack.m_41720_();
/* 172 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 173 */       retval = super.m_6071_(sourceentity, hand);
/* 174 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 177 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 179 */     else if (m_21824_()) {
/* 180 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 181 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 182 */           m_142075_(sourceentity, hand, itemstack);
/* 183 */           m_5634_(item.m_41473_().m_38744_());
/* 184 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 185 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 186 */           m_142075_(sourceentity, hand, itemstack);
/* 187 */           m_5634_(4.0F);
/* 188 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 190 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 193 */     } else if (m_6898_(itemstack)) {
/* 194 */       m_142075_(sourceentity, hand, itemstack);
/* 195 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 196 */         m_21828_(sourceentity);
/* 197 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 199 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 201 */       m_21530_();
/* 202 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 204 */       retval = super.m_6071_(sourceentity, hand);
/* 205 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 206 */         m_21530_();
/*     */       }
/*     */     } 
/* 209 */     double x = m_20185_();
/* 210 */     double y = m_20186_();
/* 211 */     double z = m_20189_();
/* 212 */     BeeHertxEntity beeHertxEntity = this;
/* 213 */     Level world = this.f_19853_;
/*     */     
/* 215 */     BeeHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)beeHertxEntity, (Entity)sourceentity);
/* 216 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 221 */     super.m_5993_(entity, score, damageSource);
/* 222 */     BeeHertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 227 */     super.m_6123_(sourceentity);
/* 228 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 233 */     BeeHertxEntity retval = (BeeHertxEntity)((EntityType)LatexModEntities.BEE_HERTX.get()).m_20615_((Level)serverWorld);
/* 234 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 235 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 240 */     return List.<Item>of(new Item[] { (Item)ChangedItems.DARK_LATEX_GOO.get(), Items.f_42784_, Items.f_42787_, Blocks.f_50111_.m_5456_(), Blocks.f_50112_.m_5456_(), Blocks.f_50113_
/* 241 */           .m_5456_(), Blocks.f_50114_.m_5456_(), Blocks.f_50115_.m_5456_(), Blocks.f_50116_.m_5456_(), Blocks.f_50117_
/* 242 */           .m_5456_(), Blocks.f_50118_.m_5456_(), Blocks.f_50119_.m_5456_(), Blocks.f_50120_.m_5456_(), Blocks.f_50121_
/* 243 */           .m_5456_() }).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 250 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 251 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 252 */     builder = builder.m_22268_(Attributes.f_22276_, 50.0D);
/* 253 */     builder = builder.m_22268_(Attributes.f_22284_, 4.0D);
/* 254 */     builder = builder.m_22268_(Attributes.f_22281_, 6.0D);
/* 255 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 256 */     builder = builder.m_22268_(Attributes.f_22278_, 0.1D);
/* 257 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\BeeHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */