/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.entity.AHVHertxEntity;
/*     */ import net.mcreator.latexes.entity.BeeHertxEntity;
/*     */ import net.mcreator.latexes.entity.HertxEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarFEntity;
/*     */ import net.mcreator.latexes.entity.NXTHertxEntity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
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
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class HertxvisorLivingEntityIsHitWithItemProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  30 */     if (entity == null)
/*     */       return; 
/*  32 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
/*  33 */       if (entity instanceof Player) { Player _player = (Player)entity;
/*  34 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get());
/*  35 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*  36 */             .getCraftSlots()); }
/*     */       
/*  38 */       if (!entity.level.isClientSide())
/*  39 */         entity.discard(); 
/*  40 */       if (world instanceof Level) { Level _level = (Level)world;
/*  41 */         if (!_level.isClientSide()) {
/*  42 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*     */           
/*  45 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/*  49 */       if (Math.random() < 0.01D)
/*  50 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  51 */           AHVHertxEntity aHVHertxEntity = new AHVHertxEntity((EntityType)LatexModEntities.AHV_HERTX.get(), (Level)_level);
/*  52 */           aHVHertxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  53 */           if (aHVHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)aHVHertxEntity;
/*  54 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(aHVHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  56 */           world.addFreshEntity((Entity)aHVHertxEntity); }
/*     */          }
/*  58 */       else if (Math.random() < 0.01D)
/*  59 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  60 */           NXTHertxEntity nXTHertxEntity = new NXTHertxEntity((EntityType)LatexModEntities.NXT_HERTX.get(), (Level)_level);
/*  61 */           nXTHertxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  62 */           if (nXTHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)nXTHertxEntity;
/*  63 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(nXTHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  65 */           world.addFreshEntity((Entity)nXTHertxEntity); }
/*     */          }
/*  67 */       else if (Math.random() < 0.1D)
/*  68 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/*  70 */           hertxvarFEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  71 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/*  72 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  74 */           world.addFreshEntity((Entity)hertxvarFEntity); }
/*     */          }
/*  76 */       else if (Math.random() < 0.1D)
/*  77 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  78 */           HertxvarFEntity hertxvarFEntity = new HertxvarFEntity((EntityType)LatexModEntities.HERTXVAR_F.get(), (Level)_level);
/*  79 */           hertxvarFEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  80 */           if (hertxvarFEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarFEntity;
/*  81 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxvarFEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */           
/*  83 */           world.addFreshEntity((Entity)hertxvarFEntity); }
/*     */         
/*     */          }
/*  86 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  87 */         HertxEntity hertxEntity = new HertxEntity((EntityType)LatexModEntities.HERTX.get(), (Level)_level);
/*  88 */         hertxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  89 */         if (hertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxEntity;
/*  90 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(hertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/*  92 */         world.addFreshEntity((Entity)hertxEntity); }
/*     */ 
/*     */     
/*  95 */     } else if (entity instanceof net.mcreator.latexes.entity.DLbeeEntity) {
/*  96 */       if (entity instanceof Player) { Player _player = (Player)entity;
/*  97 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get());
/*  98 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*  99 */             .getCraftSlots()); }
/*     */       
/* 101 */       if (!entity.level.isClientSide())
/* 102 */         entity.discard(); 
/* 103 */       if (world instanceof Level) { Level _level = (Level)world;
/* 104 */         if (!_level.isClientSide()) {
/* 105 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */         } else {
/*     */           
/* 108 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */       
/* 112 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 113 */         BeeHertxEntity beeHertxEntity = new BeeHertxEntity((EntityType)LatexModEntities.BEE_HERTX.get(), (Level)_level);
/* 114 */         beeHertxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 115 */         if (beeHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)beeHertxEntity;
/* 116 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(beeHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */         
/* 118 */         world.addFreshEntity((Entity)beeHertxEntity); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HertxvisorLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */