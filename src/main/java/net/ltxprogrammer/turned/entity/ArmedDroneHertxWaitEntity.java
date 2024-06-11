/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDroneHertxDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDroneHertxWaitEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ArmedDroneHertxWaitRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.TamableAnimal;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
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
/*     */ public class ArmedDroneHertxWaitEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public ArmedDroneHertxWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<ArmedDroneHertxWaitEntity>)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public ArmedDroneHertxWaitEntity(EntityType<ArmedDroneHertxWaitEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.f_21364_ = 16;
/*  61 */     m_21557_(false);
/*  62 */     m_6593_((Component)new TextComponent("§6[Idle]"));
/*  63 */     m_20340_(true);
/*  64 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  69 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  74 */     super.m_8099_();
/*  75 */     this.f_21345_.m_25352_(1, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  76 */     this.f_21345_.m_25352_(2, (Goal)new RandomLookAroundGoal((Mob)this));
/*  77 */     this.f_21345_.m_25352_(3, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  82 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  87 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  92 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  97 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 107 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 112 */     ArmedDroneHertxWaitEntityIsHurtProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 113 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 114 */       return false; 
/* 115 */     if (source == DamageSource.f_19314_)
/* 116 */       return false; 
/* 117 */     if (source == DamageSource.f_19312_)
/* 118 */       return false; 
/* 119 */     if (source == DamageSource.f_19320_)
/* 120 */       return false; 
/* 121 */     if (source.m_19385_().equals("witherSkull"))
/* 122 */       return false; 
/* 123 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 128 */     super.m_6667_(source);
/* 129 */     ArmedDroneHertxDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 135 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 136 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 137 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 142 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 143 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 144 */     Item item = itemstack.m_41720_();
/* 145 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 146 */       retval = super.m_6071_(sourceentity, hand);
/* 147 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 150 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 152 */     else if (m_21824_()) {
/* 153 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 154 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 155 */           m_142075_(sourceentity, hand, itemstack);
/* 156 */           m_5634_(item.m_41473_().m_38744_());
/* 157 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 158 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 159 */           m_142075_(sourceentity, hand, itemstack);
/* 160 */           m_5634_(4.0F);
/* 161 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 163 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 166 */     } else if (m_6898_(itemstack)) {
/* 167 */       m_142075_(sourceentity, hand, itemstack);
/* 168 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 169 */         m_21828_(sourceentity);
/* 170 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 172 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 174 */       m_21530_();
/* 175 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 177 */       retval = super.m_6071_(sourceentity, hand);
/* 178 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 179 */         m_21530_();
/*     */       }
/*     */     } 
/* 182 */     double x = m_20185_();
/* 183 */     double y = m_20186_();
/* 184 */     double z = m_20189_();
/* 185 */     ArmedDroneHertxWaitEntity armedDroneHertxWaitEntity = this;
/* 186 */     Level world = this.f_19853_;
/*     */     
/* 188 */     ArmedDroneHertxWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)armedDroneHertxWaitEntity, (Entity)sourceentity);
/* 189 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 194 */     ArmedDroneHertxWaitEntity retval = (ArmedDroneHertxWaitEntity)((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get()).m_20615_((Level)serverWorld);
/* 195 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 196 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 201 */     return List.<Item>of(Items.f_42749_, Items.f_42416_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 208 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 209 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 210 */     builder = builder.m_22268_(Attributes.f_22276_, 42.0D);
/* 211 */     builder = builder.m_22268_(Attributes.f_22284_, 7.5D);
/* 212 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 213 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 214 */     builder = builder.m_22268_(Attributes.f_22278_, 0.4D);
/* 215 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 216 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ArmedDroneHertxWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */