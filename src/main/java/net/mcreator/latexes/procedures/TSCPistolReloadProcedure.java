/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ 
/*     */ public class TSCPistolReloadProcedure {
/*     */   public static void execute(Entity entity) {
/*  12 */     if (entity == null)
/*     */       return; 
/*  14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.TSC_PISTOL.get()) {
/*  15 */       LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D) {
/*  16 */         LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag()
/*  17 */           .getDouble("ammo") > 1.0D) {
/*  18 */           Player player = (Player)entity; if (entity instanceof Player && player
/*  19 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */             
/*  21 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*     */               
/*  23 */               LivingEntity livingEntity3 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getItem(), 32); }
/*  24 */              for (int index0 = 0; index0 < 12; index0++) {
/*  25 */               LivingEntity livingEntity3 = (LivingEntity)entity;
/*     */               
/*  27 */               Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && player1
/*  28 */                 .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */                 
/*  30 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/*  31 */                 livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity4.getMainHandItem() : ItemStack.EMPTY)
/*  32 */                     .getOrCreateTag().getDouble("ammo") + 1.0D);
/*  33 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/*  34 */                   ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  35 */                   _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*  36 */                       .getCraftSlots()); }
/*     */               
/*     */               } 
/*     */             } 
/*     */           }  return;
/*     */         } 
/*  42 */       }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*     */       
/*  44 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && _playerHasItem
/*  45 */         .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */         
/*  47 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*     */           
/*  49 */           LivingEntity livingEntity = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getItem(), 55); }
/*  50 */          for (int index1 = 0; index1 < 30; index1++) {
/*  51 */           LivingEntity livingEntity = (LivingEntity)entity;
/*     */           
/*  53 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && player
/*  54 */             .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */             
/*  56 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/*  57 */             livingEntity3 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity3.getMainHandItem() : ItemStack.EMPTY)
/*  58 */                 .getOrCreateTag().getDouble("ammo") + 1.0D);
/*  59 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*  60 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  61 */               _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*  62 */                   .getCraftSlots()); }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/*  69 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.TSC_PISTOL
/*  70 */         .get()) {
/*  71 */         LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D) {
/*  72 */           LivingEntity livingEntity3 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity3.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 1.0D) {
/*  73 */             Player player = (Player)entity; if (entity instanceof Player && player
/*  74 */               .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */               
/*  76 */               if (entity instanceof Player) { Player _player = (Player)entity;
/*     */                 
/*  78 */                 LivingEntity livingEntity4 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity4.getOffhandItem() : ItemStack.EMPTY).getItem(), 32); }
/*  79 */                for (int index2 = 0; index2 < 12; index2++) {
/*  80 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/*     */                 
/*  82 */                 Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity4.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && player1
/*  83 */                   .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */                   
/*  85 */                   LivingEntity livingEntity5 = (LivingEntity)entity;
/*  86 */                   livingEntity5 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity5.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity5.getOffhandItem() : ItemStack.EMPTY)
/*  87 */                       .getOrCreateTag().getDouble("ammo") + 1.0D);
/*  88 */                   if (entity instanceof Player) { Player _player = (Player)entity;
/*  89 */                     ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  90 */                     _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*  91 */                         .getCraftSlots()); }
/*     */                 
/*     */                 } 
/*     */               } 
/*     */             }  return;
/*     */           } 
/*  97 */         }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*     */         
/*  99 */         Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && _playerHasItem
/* 100 */           .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */           
/* 102 */           if (entity instanceof Player) { Player _player = (Player)entity;
/*     */             
/* 104 */             LivingEntity livingEntity3 = (LivingEntity)entity; _player.getCooldowns().addCooldown(((entity instanceof LivingEntity) ? livingEntity3.getOffhandItem() : ItemStack.EMPTY).getItem(), 55); }
/* 105 */            for (int index3 = 0; index3 < 30; index3++) {
/* 106 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/*     */             
/* 108 */             Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0D && entity instanceof Player && player
/* 109 */               .getInventory().contains(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */               
/* 111 */               LivingEntity livingEntity4 = (LivingEntity)entity;
/* 112 */               livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", ((entity instanceof LivingEntity) ? livingEntity4.getOffhandItem() : ItemStack.EMPTY)
/* 113 */                   .getOrCreateTag().getDouble("ammo") + 1.0D);
/* 114 */               if (entity instanceof Player) { Player _player = (Player)entity;
/* 115 */                 ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/* 116 */                 _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 117 */                     .getCraftSlots()); }
/*     */             
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCPistolReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */