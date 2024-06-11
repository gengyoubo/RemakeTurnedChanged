/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.TSCHunterEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.TSCHunterThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TSCHunterEntity
/*     */   extends AbstractTSCEntity
/*     */ {
/*     */   public TSCHunterEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<TSCHunterEntity>)LatexModEntities.TSC_HUNTER.get(), world);
/*     */   }
/*     */   
/*     */   public TSCHunterEntity(EntityType<TSCHunterEntity> type, Level world) {
/*  55 */     super((EntityType)type, world);
/*  56 */     this.f_21364_ = 0;
/*  57 */     m_21557_(false);
/*  58 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  63 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  68 */     super.m_8099_();
/*  69 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  72 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  75 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  76 */     this.f_21345_.m_25352_(3, (Goal)new OpenDoorGoal((Mob)this, true));
/*  77 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, 10, true, false, TargetCheck.IS_GOOD));
/*  78 */     this.f_21345_.m_25352_(12, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/*  79 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  84 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/*  93 */     super.m_7472_(source, looting, recentlyHitIn);
/*  94 */     m_19983_(new ItemStack((ItemLike)Items.f_42416_));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  99 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 104 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 109 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 114 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 115 */       return false; 
/* 116 */     if (source == DamageSource.f_19312_)
/* 117 */       return false; 
/* 118 */     if (source == DamageSource.f_19323_)
/* 119 */       return false; 
/* 120 */     if (source == DamageSource.f_19320_)
/* 121 */       return false; 
/* 122 */     if (source.m_19385_().equals("witherSkull"))
/* 123 */       return false; 
/* 124 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 129 */     super.m_6667_(source);
/* 130 */     TSCHunterEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 135 */     super.m_5993_(entity, score, damageSource);
/* 136 */     TSCHunterThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 143 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 144 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 145 */     builder = builder.m_22268_(Attributes.f_22276_, 85.0D);
/* 146 */     builder = builder.m_22268_(Attributes.f_22284_, 8.0D);
/* 147 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 148 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 149 */     builder = builder.m_22268_(Attributes.f_22278_, 0.7999999999999999D);
/* 150 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCHunterEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */