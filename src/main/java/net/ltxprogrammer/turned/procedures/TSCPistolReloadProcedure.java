/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*  14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.TSC_PISTOL.get()) {
/*  15 */       LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D) {
/*  16 */         LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_()
/*  17 */           .m_128459_("ammo") > 1.0D) {
/*  18 */           Player player = (Player)entity; if (entity instanceof Player && player
/*  19 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */             
/*  21 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*     */               
/*  23 */               LivingEntity livingEntity3 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41720_(), 32); }
/*  24 */              for (int index0 = 0; index0 < 12; index0++) {
/*  25 */               LivingEntity livingEntity3 = (LivingEntity)entity;
/*     */               
/*  27 */               Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && player1
/*  28 */                 .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */                 
/*  30 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/*  31 */                 livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity4.m_21205_() : ItemStack.f_41583_)
/*  32 */                     .m_41784_().m_128459_("ammo") + 1.0D);
/*  33 */                 if (entity instanceof Player) { Player _player = (Player)entity;
/*  34 */                   ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  35 */                   _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/*  36 */                       .m_39730_()); }
/*     */               
/*     */               } 
/*     */             } 
/*     */           }  return;
/*     */         } 
/*  42 */       }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*     */       
/*  44 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && _playerHasItem
/*  45 */         .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */         
/*  47 */         if (entity instanceof Player) { Player _player = (Player)entity;
/*     */           
/*  49 */           LivingEntity livingEntity = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41720_(), 55); }
/*  50 */          for (int index1 = 0; index1 < 30; index1++) {
/*  51 */           LivingEntity livingEntity = (LivingEntity)entity;
/*     */           
/*  53 */           Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21205_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && player
/*  54 */             .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */             
/*  56 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/*  57 */             livingEntity3 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity3.m_21205_() : ItemStack.f_41583_)
/*  58 */                 .m_41784_().m_128459_("ammo") + 1.0D);
/*  59 */             if (entity instanceof Player) { Player _player = (Player)entity;
/*  60 */               ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  61 */               _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/*  62 */                   .m_39730_()); }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/*  69 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.TSC_PISTOL
/*  70 */         .get()) {
/*  71 */         LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D) {
/*  72 */           LivingEntity livingEntity3 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity3.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") > 1.0D) {
/*  73 */             Player player = (Player)entity; if (entity instanceof Player && player
/*  74 */               .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */               
/*  76 */               if (entity instanceof Player) { Player _player = (Player)entity;
/*     */                 
/*  78 */                 LivingEntity livingEntity4 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity4.m_21206_() : ItemStack.f_41583_).m_41720_(), 32); }
/*  79 */                for (int index2 = 0; index2 < 12; index2++) {
/*  80 */                 LivingEntity livingEntity4 = (LivingEntity)entity;
/*     */                 
/*  82 */                 Player player1 = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity4.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && player1
/*  83 */                   .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */                   
/*  85 */                   LivingEntity livingEntity5 = (LivingEntity)entity;
/*  86 */                   livingEntity5 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity5.m_21206_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity5.m_21206_() : ItemStack.f_41583_)
/*  87 */                       .m_41784_().m_128459_("ammo") + 1.0D);
/*  88 */                   if (entity instanceof Player) { Player _player = (Player)entity;
/*  89 */                     ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/*  90 */                     _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/*  91 */                         .m_39730_()); }
/*     */                 
/*     */                 } 
/*     */               } 
/*     */             }  return;
/*     */           } 
/*  97 */         }  LivingEntity livingEntity2 = (LivingEntity)entity;
/*     */         
/*  99 */         Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity2.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && _playerHasItem
/* 100 */           .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */           
/* 102 */           if (entity instanceof Player) { Player _player = (Player)entity;
/*     */             
/* 104 */             LivingEntity livingEntity3 = (LivingEntity)entity; _player.m_36335_().m_41524_(((entity instanceof LivingEntity) ? livingEntity3.m_21206_() : ItemStack.f_41583_).m_41720_(), 55); }
/* 105 */            for (int index3 = 0; index3 < 30; index3++) {
/* 106 */             LivingEntity livingEntity3 = (LivingEntity)entity;
/*     */             
/* 108 */             Player player = (Player)entity; if (((entity instanceof LivingEntity) ? livingEntity3.m_21206_() : ItemStack.f_41583_).m_41784_().m_128459_("ammo") < 13.0D && entity instanceof Player && player
/* 109 */               .m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get()))) {
/*     */               
/* 111 */               LivingEntity livingEntity4 = (LivingEntity)entity;
/* 112 */               livingEntity4 = (LivingEntity)entity; ((entity instanceof LivingEntity) ? livingEntity4.m_21206_() : ItemStack.f_41583_).m_41784_().m_128347_("ammo", ((entity instanceof LivingEntity) ? livingEntity4.m_21206_() : ItemStack.f_41583_)
/* 113 */                   .m_41784_().m_128459_("ammo") + 1.0D);
/* 114 */               if (entity instanceof Player) { Player _player = (Player)entity;
/* 115 */                 ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.TS_CPISTOLMAG.get());
/* 116 */                 _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 117 */                     .m_39730_()); }
/*     */             
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TSCPistolReloadProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */