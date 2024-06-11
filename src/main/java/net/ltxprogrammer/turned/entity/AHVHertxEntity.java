/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.AHVHertxRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class AHVHertxEntity extends TamableAnimal {
/*     */   public AHVHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  63 */     this((EntityType<AHVHertxEntity>)LatexModEntities.AHV_HERTX.get(), world);
/*     */   }
/*     */   
/*     */   public AHVHertxEntity(EntityType<AHVHertxEntity> type, Level world) {
/*  67 */     super(type, world);
/*  68 */     this.f_21364_ = 15;
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
/*  87 */     this.f_21345_.m_25352_(2, (Goal)new OwnerHurtByTargetGoal(this));
/*  88 */     this.f_21346_.m_25352_(3, (Goal)new OwnerHurtTargetGoal(this));
/*  89 */     this.f_21345_.m_25352_(4, (Goal)new FollowOwnerGoal(this, 1.0D, 2.0F, 48.0F, false));
/*  90 */     this.f_21345_.m_25352_(5, (Goal)new OpenDoorGoal((Mob)this, true));
/*  91 */     this.f_21345_.m_25352_(6, (Goal)new OpenDoorGoal((Mob)this, false));
/*  92 */     this.f_21345_.m_25352_(7, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  93 */     this.f_21345_.m_25352_(8, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  94 */     this.f_21346_.m_25352_(9, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  95 */     this.f_21345_.m_25352_(10, (Goal)new RandomLookAroundGoal((Mob)this));
/*  96 */     this.f_21345_.m_25352_(11, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 101 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 110 */     super.m_7472_(source, looting, recentlyHitIn);
/* 111 */     m_19983_(new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 116 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 121 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 126 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 131 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 136 */     if (source == DamageSource.f_19315_)
/* 137 */       return false; 
/* 138 */     if (source == DamageSource.f_19314_)
/* 139 */       return false; 
/* 140 */     if (source == DamageSource.f_19312_)
/* 141 */       return false; 
/* 142 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 147 */     super.m_6667_(source);
/* 148 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 154 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 155 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 156 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 161 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 162 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 163 */     Item item = itemstack.m_41720_();
/* 164 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 165 */       retval = super.m_6071_(sourceentity, hand);
/* 166 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 169 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 171 */     else if (m_21824_()) {
/* 172 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 173 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 174 */           m_142075_(sourceentity, hand, itemstack);
/* 175 */           m_5634_(item.m_41473_().m_38744_());
/* 176 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 177 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 178 */           m_142075_(sourceentity, hand, itemstack);
/* 179 */           m_5634_(4.0F);
/* 180 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 182 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 185 */     } else if (m_6898_(itemstack)) {
/* 186 */       m_142075_(sourceentity, hand, itemstack);
/* 187 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 188 */         m_21828_(sourceentity);
/* 189 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 191 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 193 */       m_21530_();
/* 194 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 196 */       retval = super.m_6071_(sourceentity, hand);
/* 197 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 198 */         m_21530_();
/*     */       }
/*     */     } 
/* 201 */     double x = m_20185_();
/* 202 */     double y = m_20186_();
/* 203 */     double z = m_20189_();
/* 204 */     AHVHertxEntity aHVHertxEntity = this;
/* 205 */     Level world = this.f_19853_;
/*     */     
/* 207 */     AHVHertxRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)aHVHertxEntity, (Entity)sourceentity);
/* 208 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 213 */     super.m_5993_(entity, score, damageSource);
/* 214 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 219 */     super.m_6123_(sourceentity);
/* 220 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 225 */     AHVHertxEntity retval = (AHVHertxEntity)((EntityType)LatexModEntities.AHV_HERTX.get()).m_20615_((Level)serverWorld);
/* 226 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 227 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 232 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), Items.f_42518_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 239 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 240 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 241 */     builder = builder.m_22268_(Attributes.f_22276_, 50.0D);
/* 242 */     builder = builder.m_22268_(Attributes.f_22284_, 6.0D);
/* 243 */     builder = builder.m_22268_(Attributes.f_22281_, 6.0D);
/* 244 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 245 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 246 */     builder = builder.m_22268_(Attributes.f_22282_, 0.5D);
/* 247 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\AHVHertxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */