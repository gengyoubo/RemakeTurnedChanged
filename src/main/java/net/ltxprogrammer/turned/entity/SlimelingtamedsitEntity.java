/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingtamedsitRightClickedOnEntityProcedure;
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
/*     */ public class SlimelingtamedsitEntity
/*     */   extends TamableAnimal {
/*     */   public SlimelingtamedsitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  58 */     this((EntityType<SlimelingtamedsitEntity>)LatexModEntities.SLIMELINGTAMEDSIT.get(), world);
/*     */   }
/*     */   
/*     */   public SlimelingtamedsitEntity(EntityType<SlimelingtamedsitEntity> type, Level world) {
/*  62 */     super(type, world);
/*  63 */     this.f_21364_ = 4;
/*  64 */     m_21557_(false);
/*  65 */     m_6593_((Component)new TextComponent("§a[Idle]"));
/*  66 */     m_20340_(true);
/*  67 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  72 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  77 */     super.m_8099_();
/*  78 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  81 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  84 */     this.f_21345_.m_25352_(2, (Goal)new LookAtPlayerGoal((Mob)this, LatexEntity.class, 3.0F));
/*  85 */     this.f_21345_.m_25352_(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  86 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  87 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  88 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  93 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  98 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 103 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 108 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 113 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 118 */     if (source == DamageSource.f_19315_)
/* 119 */       return false; 
/* 120 */     if (source == DamageSource.f_19314_)
/* 121 */       return false; 
/* 122 */     if (source == DamageSource.f_19312_)
/* 123 */       return false; 
/* 124 */     if (source == DamageSource.f_19320_)
/* 125 */       return false; 
/* 126 */     if (source.m_19385_().equals("witherSkull"))
/* 127 */       return false; 
/* 128 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 133 */     super.m_6667_(source);
/* 134 */     SlimelingEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 140 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 141 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 142 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 147 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 148 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 149 */     Item item = itemstack.m_41720_();
/* 150 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 151 */       retval = super.m_6071_(sourceentity, hand);
/* 152 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 155 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 157 */     else if (m_21824_()) {
/* 158 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 159 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 160 */           m_142075_(sourceentity, hand, itemstack);
/* 161 */           m_5634_(item.m_41473_().m_38744_());
/* 162 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 163 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 164 */           m_142075_(sourceentity, hand, itemstack);
/* 165 */           m_5634_(4.0F);
/* 166 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 168 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 171 */     } else if (m_6898_(itemstack)) {
/* 172 */       m_142075_(sourceentity, hand, itemstack);
/* 173 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 174 */         m_21828_(sourceentity);
/* 175 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 177 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 179 */       m_21530_();
/* 180 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 182 */       retval = super.m_6071_(sourceentity, hand);
/* 183 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 184 */         m_21530_();
/*     */       }
/*     */     } 
/* 187 */     double x = m_20185_();
/* 188 */     double y = m_20186_();
/* 189 */     double z = m_20189_();
/* 190 */     SlimelingtamedsitEntity slimelingtamedsitEntity = this;
/* 191 */     Level world = this.f_19853_;
/*     */     
/* 193 */     SlimelingtamedsitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingtamedsitEntity, (Entity)sourceentity);
/* 194 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 199 */     SlimelingtamedsitEntity retval = (SlimelingtamedsitEntity)((EntityType)LatexModEntities.SLIMELINGTAMEDSIT.get()).m_20615_((Level)serverWorld);
/* 200 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 201 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 206 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 213 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 214 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 215 */     builder = builder.m_22268_(Attributes.f_22276_, 30.0D);
/* 216 */     builder = builder.m_22268_(Attributes.f_22284_, 5.0D);
/* 217 */     builder = builder.m_22268_(Attributes.f_22281_, 0.0D);
/* 218 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 219 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 220 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\SlimelingtamedsitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */