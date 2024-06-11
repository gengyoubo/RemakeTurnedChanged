/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.changed.Changed;
/*     */ import net.ltxprogrammer.changed.ability.AbstractAbility;
/*     */ import net.ltxprogrammer.changed.ability.AccessSaddleAbilityInstance;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.entity.beast.LightLatexCentaur;
/*     */ import net.ltxprogrammer.changed.entity.variant.LatexVariant;
/*     */ import net.ltxprogrammer.changed.init.ChangedAbilities;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.changed.network.packet.MountLatexPacket;
/*     */ import net.ltxprogrammer.changed.process.ProcessTransfur;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.minecraft.nbt.Tag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.sounds.SoundEvents;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.Saddleable;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PacketDistributor;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ public class DarkLatexCentaurEntity
/*     */   extends AbstractDarkLatexEntity
/*     */   implements Saddleable
/*     */ {
/*     */   public DarkLatexCentaurEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<DarkLatexCentaurEntity>)LatexModEntities.DARK_LATEX_CENTAUR.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCentaurEntity(EntityType<DarkLatexCentaurEntity> type, Level world) {
/*  69 */     super(type, world);
/*  70 */     this.f_21364_ = 8;
/*  71 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  76 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  81 */     return MobType.f_21642_;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6048_() {
/*  86 */     return super.m_6048_() + 1.4000000000000001D;
/*     */   }
/*     */   
/*     */   public static void init() {
/*  90 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/*  94 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/*  95 */     builder = builder.m_22268_(Attributes.f_22279_, 0.32D);
/*  96 */     builder = builder.m_22268_(Attributes.f_22276_, 28.0D);
/*  97 */     builder = builder.m_22268_(Attributes.f_22284_, 1.0D);
/*  98 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/*  99 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 100 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 101 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 102 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 107 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6741_() {
/* 112 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5853_(@Nullable SoundSource p_21748_) {
/* 117 */     getPersistentData().m_128365_(LightLatexCentaur.SADDLE_LOCATION, (Tag)(new ItemStack((ItemLike)Items.f_42450_)).serializeNBT());
/* 118 */     if (p_21748_ != null) {
/* 119 */       this.f_19853_.m_6269_((Player)null, (Entity)this, SoundEvents.f_12034_, p_21748_, 0.5F, 1.0F);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m_6254_() {
/* 126 */     if (getUnderlyingPlayer() != null && ProcessTransfur.isPlayerLatex(getUnderlyingPlayer())) {
/* 127 */       LatexVariant<?> variant = ProcessTransfur.getPlayerLatexVariant(getUnderlyingPlayer());
/* 128 */       AccessSaddleAbilityInstance ability = (AccessSaddleAbilityInstance)variant.getAbilityInstance((AbstractAbility)ChangedAbilities.ACCESS_SADDLE);
/* 129 */       if (ability != null) {
/* 130 */         return (ability.saddle != null && !ability.saddle.m_41619_());
/*     */       }
/* 132 */       return false;
/*     */     } 
/* 134 */     return getPersistentData().m_128441_(LightLatexCentaur.SADDLE_LOCATION);
/*     */   }
/*     */   
/*     */   protected void doPlayerRide(Player p_30634_) {
/* 138 */     if (!this.f_19853_.f_46443_) {
/* 139 */       p_30634_.m_146922_(m_146908_());
/* 140 */       p_30634_.m_146926_(m_146909_());
/* 141 */       Player underlying = getUnderlyingPlayer();
/* 142 */       if (underlying == null) {
/* 143 */         p_30634_.m_20329_((Entity)this);
/*     */       } else {
/* 145 */         p_30634_.m_20329_((Entity)underlying);
/* 146 */         Changed.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new MountLatexPacket(p_30634_.m_142081_(), underlying.m_142081_()));
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public InteractionResult m_6071_(Player p_30713_, InteractionHand p_30714_) {
/* 152 */     if (m_6254_()) {
/* 153 */       doPlayerRide(p_30713_);
/* 154 */       return InteractionResult.m_19078_(this.f_19853_.f_46443_);
/*     */     } 
/*     */     
/* 157 */     return InteractionResult.PASS;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexCentaurEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */