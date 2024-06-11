/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*     */ import net.ltxprogrammer.turned.entity.AHVHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.BeeHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarFEntity;
/*     */ import net.ltxprogrammer.turned.entity.NXTHertxEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Registry;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.TagKey;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ 
/*     */ public class HertxvisorLivingEntityIsHitWithItemProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  31 */     if (entity == null)
/*     */       return; 
/*  33 */     if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:darklatexes")))) {
/*  34 */       if (entity instanceof Player) { Player _player = (Player)entity;
/*  35 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get());
/*  36 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/*  37 */             .m_39730_()); }
/*     */       
/*  39 */       if (!entity.f_19853_.m_5776_())
/*  40 */         entity.m_146870_(); 
/*  41 */       if (world instanceof Level) { Level _level = (Level)world;
/*  42 */         if (!_level.m_5776_()) {
/*  43 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*     */           
/*  46 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  50 */       if (Math.random() < 0.01D)
/*  51 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  52 */           AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/*  53 */           aHVHertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  54 */           if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/*  55 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(aHVHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  57 */           world.m_7967_((Entity)aHVHertxEntity); }
/*     */          }
/*  59 */       else if (Math.random() < 0.01D)
/*  60 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  61 */           NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/*  62 */           nXTHertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  63 */           if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/*  64 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(nXTHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  66 */           world.m_7967_((Entity)nXTHertxEntity); }
/*     */          }
/*  68 */       else if (Math.random() < 0.1D)
/*  69 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  70 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/*  71 */           hertxvarFEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  72 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/*  73 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  75 */           world.m_7967_((Entity)hertxvarFEntity); }
/*     */          }
/*  77 */       else if (Math.random() < 0.1D)
/*  78 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  79 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/*  80 */           hertxvarFEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  81 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/*  82 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  84 */           world.m_7967_((Entity)hertxvarFEntity); }
/*     */         
/*     */          }
/*  87 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  88 */         HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/*  89 */         hertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  90 */         if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/*  91 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/*  93 */         world.m_7967_((Entity)hertxEntity); }
/*     */ 
/*     */     
/*  96 */     } else if (entity instanceof net.ltxprogrammer.turned.entity.DLbeeEntity) {
/*  97 */       if (entity instanceof Player) { Player _player = (Player)entity;
/*  98 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get());
/*  99 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 100 */             .m_39730_()); }
/*     */       
/* 102 */       if (!entity.f_19853_.m_5776_())
/* 103 */         entity.m_146870_(); 
/* 104 */       if (world instanceof Level) { Level _level = (Level)world;
/* 105 */         if (!_level.m_5776_()) {
/* 106 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*     */           
/* 109 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/* 113 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 114 */         BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 115 */         beeHertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 116 */         if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 117 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(beeHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/* 119 */         world.m_7967_((Entity)beeHertxEntity); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxvisorLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */