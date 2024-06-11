/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*     */ import net.ltxprogrammer.changed.entity.LatexType;
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.TSCOutsiderGunnerEntityDiesProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
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
/*     */ 
/*     */ 
/*     */ public class TSCOutsiderGunnerEntity
/*     */   extends Monster
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public TSCOutsiderGunnerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  54 */     this((EntityType<TSCOutsiderGunnerEntity>)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), world);
/*     */   }
/*     */   
/*     */   public TSCOutsiderGunnerEntity(EntityType<TSCOutsiderGunnerEntity> type, Level world) {
/*  58 */     super(type, world);
/*  59 */     this.f_21364_ = 0;
/*  60 */     m_21557_(false);
/*  61 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  71 */     super.m_8099_();
/*  72 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/*  73 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.WHITE_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/*  74 */     this.f_21345_.m_25352_(13, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), (PathfinderMob)this, 1.0D, 3));
/*  75 */     this.f_21345_.m_25352_(14, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), (PathfinderMob)this, 1.0D, 3));
/*  76 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/*  77 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/*  78 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/*  81 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  88 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  93 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/*  97 */     super.m_7472_(source, looting, recentlyHitIn);
/*  98 */     m_19983_(new ItemStack((ItemLike)Items.f_42416_));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 103 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 108 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 113 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 118 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 119 */       return false; 
/* 120 */     if (source == DamageSource.f_19312_)
/* 121 */       return false; 
/* 122 */     if (source == DamageSource.f_19323_)
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
/* 134 */     TSCOutsiderGunnerEntityDiesProcedure.execute();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 141 */     TSCPistolEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 148 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 149 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 150 */     builder = builder.m_22268_(Attributes.f_22276_, 30.0D);
/* 151 */     builder = builder.m_22268_(Attributes.f_22284_, 6.0D);
/* 152 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 155 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCOutsiderGunnerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */