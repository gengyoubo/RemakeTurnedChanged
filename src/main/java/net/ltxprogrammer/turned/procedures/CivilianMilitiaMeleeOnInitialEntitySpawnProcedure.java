/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ 
/*     */ public class CivilianMilitiaMeleeOnInitialEntitySpawnProcedure {
/*     */   public static void execute(Entity entity) {
/*  13 */     if (entity == null)
/*     */       return; 
/*  15 */     if (Math.random() < 0.6D) {
/*  16 */       if (Math.random() < 0.5D)
/*  17 */       { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  18 */           ItemStack _setstack = new ItemStack((ItemLike)Items.f_42425_);
/*  19 */           _setstack.m_41764_(1);
/*  20 */           _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/*  21 */           if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  22 */             _player.m_150109_().m_6596_(); }
/*     */            }
/*     */          }
/*  25 */       else if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  26 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42428_);
/*  27 */         _setstack.m_41764_(1);
/*  28 */         _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/*  29 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  30 */           _player.m_150109_().m_6596_(); }
/*     */         
/*     */          }
/*     */     
/*  34 */     } else if (Math.random() < 0.4D) {
/*     */       
/*  36 */       Entity _entity = entity;
/*  37 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  38 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)Items.f_42464_));
/*  39 */         _player.m_150109_().m_6596_(); }
/*  40 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  41 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42464_)); }
/*     */ 
/*     */ 
/*     */       
/*  45 */       _entity = entity;
/*  46 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  47 */         (_player.m_150109_()).f_35975_.set(2, new ItemStack((ItemLike)Items.f_42465_));
/*  48 */         _player.m_150109_().m_6596_(); }
/*  49 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  50 */         _living.m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)Items.f_42465_)); }
/*     */ 
/*     */       
/*  53 */       if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/*  54 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42428_);
/*  55 */         _setstack.m_41764_(1);
/*  56 */         livingEntity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/*  57 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/*  58 */           _player.m_150109_().m_6596_(); }  }
/*     */     
/*  60 */     } else if (Math.random() < 0.4D) {
/*  61 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  62 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42740_);
/*  63 */         _setstack.m_41764_(1);
/*  64 */         _entity.m_21008_(InteractionHand.OFF_HAND, _setstack);
/*  65 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  66 */           _player.m_150109_().m_6596_(); }
/*     */          }
/*  68 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  69 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42425_);
/*  70 */         _setstack.m_41764_(1);
/*  71 */         _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/*  72 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  73 */           _player.m_150109_().m_6596_(); }
/*     */          }
/*     */     
/*     */     } else {
/*  77 */       Entity _entity = entity;
/*  78 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  79 */         (_player.m_150109_()).f_35975_.set(3, new ItemStack((ItemLike)Items.f_42464_));
/*  80 */         _player.m_150109_().m_6596_(); }
/*  81 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  82 */         _living.m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.f_42464_)); }
/*     */ 
/*     */ 
/*     */       
/*  86 */       _entity = entity;
/*  87 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  88 */         (_player.m_150109_()).f_35975_.set(2, new ItemStack((ItemLike)Items.f_42465_));
/*  89 */         _player.m_150109_().m_6596_(); }
/*  90 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  91 */         _living.m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)Items.f_42465_)); }
/*     */ 
/*     */       
/*  94 */       if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/*  95 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42740_);
/*  96 */         _setstack.m_41764_(1);
/*  97 */         livingEntity.m_21008_(InteractionHand.OFF_HAND, _setstack);
/*  98 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/*  99 */           _player.m_150109_().m_6596_(); }
/*     */          }
/* 101 */        if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/* 102 */         ItemStack _setstack = new ItemStack((ItemLike)Items.f_42383_);
/* 103 */         _setstack.m_41764_(1);
/* 104 */         livingEntity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/* 105 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/* 106 */           _player.m_150109_().m_6596_(); }
/*     */          }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */