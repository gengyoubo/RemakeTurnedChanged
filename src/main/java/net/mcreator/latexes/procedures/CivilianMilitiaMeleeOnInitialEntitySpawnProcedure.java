/*     */ package net.mcreator.latexes.procedures;
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
/*  18 */           ItemStack _setstack = new ItemStack((ItemLike)Items.STONE_SWORD);
/*  19 */           _setstack.setCount(1);
/*  20 */           _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/*  21 */           if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  22 */             _player.getInventory().setChanged(); }
/*     */            }
/*     */          }
/*  25 */       else if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  26 */         ItemStack _setstack = new ItemStack((ItemLike)Items.STONE_AXE);
/*  27 */         _setstack.setCount(1);
/*  28 */         _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/*  29 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  30 */           _player.getInventory().setChanged(); }
/*     */         
/*     */          }
/*     */     
/*  34 */     } else if (Math.random() < 0.4D) {
/*     */       
/*  36 */       Entity _entity = entity;
/*  37 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  38 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)Items.CHAINMAIL_HELMET));
/*  39 */         _player.getInventory().setChanged(); }
/*  40 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  41 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.CHAINMAIL_HELMET)); }
/*     */ 
/*     */ 
/*     */       
/*  45 */       _entity = entity;
/*  46 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  47 */         (_player.getInventory()).armor.set(2, new ItemStack((ItemLike)Items.CHAINMAIL_CHESTPLATE));
/*  48 */         _player.getInventory().setChanged(); }
/*  49 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  50 */         _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)Items.CHAINMAIL_CHESTPLATE)); }
/*     */ 
/*     */       
/*  53 */       if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/*  54 */         ItemStack _setstack = new ItemStack((ItemLike)Items.STONE_AXE);
/*  55 */         _setstack.setCount(1);
/*  56 */         livingEntity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/*  57 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/*  58 */           _player.getInventory().setChanged(); }  }
/*     */     
/*  60 */     } else if (Math.random() < 0.4D) {
/*  61 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  62 */         ItemStack _setstack = new ItemStack((ItemLike)Items.SHIELD);
/*  63 */         _setstack.setCount(1);
/*  64 */         _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
/*  65 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  66 */           _player.getInventory().setChanged(); }
/*     */          }
/*  68 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/*  69 */         ItemStack _setstack = new ItemStack((ItemLike)Items.STONE_SWORD);
/*  70 */         _setstack.setCount(1);
/*  71 */         _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/*  72 */         if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  73 */           _player.getInventory().setChanged(); }
/*     */          }
/*     */     
/*     */     } else {
/*  77 */       Entity _entity = entity;
/*  78 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  79 */         (_player.getInventory()).armor.set(3, new ItemStack((ItemLike)Items.CHAINMAIL_HELMET));
/*  80 */         _player.getInventory().setChanged(); }
/*  81 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  82 */         _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike)Items.CHAINMAIL_HELMET)); }
/*     */ 
/*     */ 
/*     */       
/*  86 */       _entity = entity;
/*  87 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/*  88 */         (_player.getInventory()).armor.set(2, new ItemStack((ItemLike)Items.CHAINMAIL_CHESTPLATE));
/*  89 */         _player.getInventory().setChanged(); }
/*  90 */       else if (_entity instanceof LivingEntity) { LivingEntity _living = (LivingEntity)_entity;
/*  91 */         _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike)Items.CHAINMAIL_CHESTPLATE)); }
/*     */ 
/*     */       
/*  94 */       if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/*  95 */         ItemStack _setstack = new ItemStack((ItemLike)Items.SHIELD);
/*  96 */         _setstack.setCount(1);
/*  97 */         livingEntity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
/*  98 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/*  99 */           _player.getInventory().setChanged(); }
/*     */          }
/* 101 */        if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity;
/* 102 */         ItemStack _setstack = new ItemStack((ItemLike)Items.IRON_SWORD);
/* 103 */         _setstack.setCount(1);
/* 104 */         livingEntity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/* 105 */         if (livingEntity instanceof Player) { Player _player = (Player)livingEntity;
/* 106 */           _player.getInventory().setChanged(); }
/*     */          }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CivilianMilitiaMeleeOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */