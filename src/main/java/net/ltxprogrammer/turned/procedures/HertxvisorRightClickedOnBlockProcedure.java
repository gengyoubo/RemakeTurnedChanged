/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*     */ import net.ltxprogrammer.turned.entity.AHVHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.BeeHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarFBEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarFEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxvarSolEntity;
/*     */ import net.ltxprogrammer.turned.entity.NXTHertxEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundSource;
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
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ 
/*     */ public class HertxvisorRightClickedOnBlockProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  32 */     if (entity == null)
/*     */       return; 
/*  34 */     if (world.m_8055_(new BlockPos(x, y, z)).m_60734_() == ChangedBlocks.DARK_LATEX_BLOCK.get()) {
/*  35 */       if (entity instanceof Player) { Player _player = (Player)entity;
/*  36 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get());
/*  37 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/*  38 */             .m_39730_()); }
/*     */       
/*  40 */       if (world instanceof Level) { Level _level = (Level)world;
/*  41 */         if (!_level.m_5776_()) {
/*  42 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*     */           
/*  45 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  49 */       world.m_7731_(new BlockPos(x, y, z), Blocks.f_50016_.m_49966_(), 3);
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
/*  68 */       else if (Math.random() < 0.025D)
/*  69 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  70 */           BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/*  71 */           beeHertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  72 */           if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/*  73 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(beeHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  75 */           world.m_7967_((Entity)beeHertxEntity); }
/*     */          }
/*  77 */       else if (Math.random() < 0.0025D)
/*  78 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  79 */           HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/*  80 */           hertxvarSolEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  81 */           if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/*  82 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarSolEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  84 */           world.m_7967_((Entity)hertxvarSolEntity); }
/*     */          }
/*  86 */       else if (Math.random() < 0.05D)
/*  87 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  88 */           HertxvarFBEntity hertxvarFBEntity = new HertxvarFBEntity((EntityType)LatexModEntities.HERTXVAR_FB.get(), (Level)_level);
/*  89 */           hertxvarFBEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  90 */           if (hertxvarFBEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFBEntity;
/*  91 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFBEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  93 */           world.m_7967_((Entity)hertxvarFBEntity); }
/*     */          }
/*  95 */       else if (Math.random() < 0.1D)
/*  96 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  97 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/*  98 */           hertxvarFEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/*  99 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/* 100 */             _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarFEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/* 102 */           world.m_7967_((Entity)hertxvarFEntity); }
/*     */         
/*     */          }
/* 105 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 106 */         HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/* 107 */         hertxEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 108 */         if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/* 109 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/* 111 */         world.m_7967_((Entity)hertxEntity); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxvisorRightClickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */