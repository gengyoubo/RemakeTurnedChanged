/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxFBSitRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
/*     */ public class HertxFBSitEntity
/*     */   extends TamableAnimal {
/*     */   public HertxFBSitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  61 */     this((EntityType<HertxFBSitEntity>)LatexModEntities.HERTX_FB_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxFBSitEntity(EntityType<HertxFBSitEntity> type, Level world) {
/*  65 */     super(type, world);
/*  66 */     this.f_21364_ = 4;
/*  67 */     m_21557_(false);
/*  68 */     m_6593_((Component)new TextComponent("§3[Idle]"));
/*  69 */     m_20340_(true);
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
/*  90 */             double x = HertxFBSitEntity.this.m_20185_();
/*  91 */             double y = HertxFBSitEntity.this.m_20186_();
/*  92 */             double z = HertxFBSitEntity.this.m_20189_();
/*  93 */             HertxFBSitEntity hertxFBSitEntity = HertxFBSitEntity.this;
/*  94 */             Level world = HertxFBSitEntity.this.f_19853_;
/*  95 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFBSitEntity));
/*     */           }
/*     */         });
/*  98 */     this.f_21345_.m_25352_(3, (Goal)new LookAtPlayerGoal((Mob)this, LatexEntity.class, 3.0F));
/*  99 */     this.f_21345_.m_25352_(4, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/* 100 */     this.f_21346_.m_25352_(5, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 101 */     this.f_21345_.m_25352_(6, (Goal)new RandomLookAroundGoal((Mob)this));
/* 102 */     this.f_21345_.m_25352_(7, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 107 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 117 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 122 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 127 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 132 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 137 */     if (source == DamageSource.f_19315_)
/* 138 */       return false; 
/* 139 */     if (source == DamageSource.f_19314_)
/* 140 */       return false; 
/* 141 */     if (source == DamageSource.f_19312_)
/* 142 */       return false; 
/* 143 */     if (source == DamageSource.f_19320_)
/* 144 */       return false; 
/* 145 */     if (source.m_19385_().equals("witherSkull"))
/* 146 */       return false; 
/* 147 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 152 */     super.m_6667_(source);
/* 153 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 159 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 160 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 161 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 166 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 167 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 168 */     Item item = itemstack.m_41720_();
/* 169 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 170 */       retval = super.m_6071_(sourceentity, hand);
/* 171 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 174 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 176 */     else if (m_21824_()) {
/* 177 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 178 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 179 */           m_142075_(sourceentity, hand, itemstack);
/* 180 */           m_5634_(item.m_41473_().m_38744_());
/* 181 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 182 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 183 */           m_142075_(sourceentity, hand, itemstack);
/* 184 */           m_5634_(4.0F);
/* 185 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 187 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 190 */     } else if (m_6898_(itemstack)) {
/* 191 */       m_142075_(sourceentity, hand, itemstack);
/* 192 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 193 */         m_21828_(sourceentity);
/* 194 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 196 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 198 */       m_21530_();
/* 199 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 201 */       retval = super.m_6071_(sourceentity, hand);
/* 202 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 203 */         m_21530_();
/*     */       }
/*     */     } 
/* 206 */     double x = m_20185_();
/* 207 */     double y = m_20186_();
/* 208 */     double z = m_20189_();
/* 209 */     HertxFBSitEntity hertxFBSitEntity = this;
/* 210 */     Level world = this.f_19853_;
/*     */     
/* 212 */     HertxFBSitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFBSitEntity, (Entity)sourceentity);
/* 213 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 218 */     super.m_6123_(sourceentity);
/* 219 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 224 */     HertxFBSitEntity retval = (HertxFBSitEntity)((EntityType)LatexModEntities.HERTX_FB_SIT.get()).m_20615_((Level)serverWorld);
/* 225 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 226 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 231 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 238 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 239 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 240 */     builder = builder.m_22268_(Attributes.f_22276_, 30.0D);
/* 241 */     builder = builder.m_22268_(Attributes.f_22284_, 5.0D);
/* 242 */     builder = builder.m_22268_(Attributes.f_22281_, 0.0D);
/* 243 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 244 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 245 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxFBSitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */