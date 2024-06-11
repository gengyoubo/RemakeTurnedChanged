/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxFSitRightClickedOnEntityProcedure;
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
/*  59 */     this((EntityType<HertxFSitEntity>)LatexModEntities.HERTX_F_SIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxFSitEntity(EntityType<HertxFSitEntity> type, Level world) {
/*  63 */     super(type, world);
/*  64 */     this.f_21364_ = 4;
/*  65 */     m_21557_(false);
/*  66 */     m_6593_((Component)new TextComponent("§b[Idle]"));
/*  67 */     m_20340_(true);
/*  68 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  73 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  78 */     super.m_8099_();
/*  79 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  82 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  85 */     this.f_21345_.m_25352_(2, (Goal)new LookAtPlayerGoal((Mob)this, LatexEntity.class, 3.0F));
/*  86 */     this.f_21345_.m_25352_(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  87 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  88 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  89 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  94 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  99 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 104 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 109 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 114 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 119 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 124 */     if (source == DamageSource.f_19315_)
/* 125 */       return false; 
/* 126 */     if (source == DamageSource.f_19314_)
/* 127 */       return false; 
/* 128 */     if (source == DamageSource.f_19312_)
/* 129 */       return false; 
/* 130 */     if (source == DamageSource.f_19320_)
/* 131 */       return false; 
/* 132 */     if (source.m_19385_().equals("witherSkull"))
/* 133 */       return false; 
/* 134 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 139 */     super.m_6667_(source);
/* 140 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 146 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 147 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 148 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 153 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 154 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 155 */     Item item = itemstack.m_41720_();
/* 156 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 157 */       retval = super.m_6071_(sourceentity, hand);
/* 158 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 161 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 163 */     else if (m_21824_()) {
/* 164 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 165 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 166 */           m_142075_(sourceentity, hand, itemstack);
/* 167 */           m_5634_(item.m_41473_().m_38744_());
/* 168 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 169 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 170 */           m_142075_(sourceentity, hand, itemstack);
/* 171 */           m_5634_(4.0F);
/* 172 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 174 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 177 */     } else if (m_6898_(itemstack)) {
/* 178 */       m_142075_(sourceentity, hand, itemstack);
/* 179 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 180 */         m_21828_(sourceentity);
/* 181 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 183 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 185 */       m_21530_();
/* 186 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 188 */       retval = super.m_6071_(sourceentity, hand);
/* 189 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 190 */         m_21530_();
/*     */       }
/*     */     } 
/* 193 */     double x = m_20185_();
/* 194 */     double y = m_20186_();
/* 195 */     double z = m_20189_();
/* 196 */     HertxFSitEntity hertxFSitEntity = this;
/* 197 */     Level world = this.f_19853_;
/*     */     
/* 199 */     HertxFSitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFSitEntity, (Entity)sourceentity);
/* 200 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 205 */     super.m_6123_(sourceentity);
/* 206 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 211 */     HertxFSitEntity retval = (HertxFSitEntity)((EntityType)LatexModEntities.HERTX_F_SIT.get()).m_20615_((Level)serverWorld);
/* 212 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 213 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 218 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 225 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 226 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 227 */     builder = builder.m_22268_(Attributes.f_22276_, 30.0D);
/* 228 */     builder = builder.m_22268_(Attributes.f_22284_, 5.0D);
/* 229 */     builder = builder.m_22268_(Attributes.f_22281_, 0.0D);
/* 230 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 231 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 232 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxFSitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */