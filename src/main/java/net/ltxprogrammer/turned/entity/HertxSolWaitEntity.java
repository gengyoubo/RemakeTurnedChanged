/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxSolWaitEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxSolWaitRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure;
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
/*     */ public class HertxSolWaitEntity extends TamableAnimal {
/*     */   public HertxSolWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<HertxSolWaitEntity>)LatexModEntities.HERTX_SOL_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public HertxSolWaitEntity(EntityType<HertxSolWaitEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.f_21364_ = 16;
/*  62 */     m_21557_(false);
/*  63 */     m_6593_((Component)new TextComponent("§6[Idle]"));
/*  64 */     m_20340_(true);
/*  65 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  70 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  75 */     super.m_8099_();
/*  76 */     this.f_21345_.m_25352_(1, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  77 */     this.f_21345_.m_25352_(2, (Goal)new RandomLookAroundGoal((Mob)this));
/*  78 */     this.f_21345_.m_25352_(3, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  83 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  88 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  93 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  98 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 103 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 108 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 113 */     HertxSolWaitEntityIsHurtProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 114 */     if (source == DamageSource.f_19315_)
/* 115 */       return false; 
/* 116 */     if (source == DamageSource.f_19314_)
/* 117 */       return false; 
/* 118 */     if (source == DamageSource.f_19312_)
/* 119 */       return false; 
/* 120 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 125 */     super.m_6667_(source);
/* 126 */     HertxEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 132 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 133 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 134 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 139 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 140 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 141 */     Item item = itemstack.m_41720_();
/* 142 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 143 */       retval = super.m_6071_(sourceentity, hand);
/* 144 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 147 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 149 */     else if (m_21824_()) {
/* 150 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 151 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 152 */           m_142075_(sourceentity, hand, itemstack);
/* 153 */           m_5634_(item.m_41473_().m_38744_());
/* 154 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 155 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 156 */           m_142075_(sourceentity, hand, itemstack);
/* 157 */           m_5634_(4.0F);
/* 158 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 160 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 163 */     } else if (m_6898_(itemstack)) {
/* 164 */       m_142075_(sourceentity, hand, itemstack);
/* 165 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 166 */         m_21828_(sourceentity);
/* 167 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 169 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 171 */       m_21530_();
/* 172 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 174 */       retval = super.m_6071_(sourceentity, hand);
/* 175 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 176 */         m_21530_();
/*     */       }
/*     */     } 
/* 179 */     double x = m_20185_();
/* 180 */     double y = m_20186_();
/* 181 */     double z = m_20189_();
/* 182 */     HertxSolWaitEntity hertxSolWaitEntity = this;
/* 183 */     Level world = this.f_19853_;
/*     */     
/* 185 */     HertxSolWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxSolWaitEntity, (Entity)sourceentity);
/* 186 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 191 */     super.m_5993_(entity, score, damageSource);
/* 192 */     HertxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 197 */     super.m_6123_(sourceentity);
/* 198 */     HertxPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 203 */     HertxSolWaitEntity retval = (HertxSolWaitEntity)((EntityType)LatexModEntities.HERTX_SOL_WAIT.get()).m_20615_((Level)serverWorld);
/* 204 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 205 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 210 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), Items.f_42749_, Items.f_42416_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 217 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 218 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 219 */     builder = builder.m_22268_(Attributes.f_22276_, 40.0D);
/* 220 */     builder = builder.m_22268_(Attributes.f_22284_, 7.5D);
/* 221 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 222 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 223 */     builder = builder.m_22268_(Attributes.f_22278_, 0.4D);
/* 224 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 225 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxSolWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */