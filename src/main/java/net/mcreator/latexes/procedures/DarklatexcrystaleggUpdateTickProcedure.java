/*     */ package net.mcreator.latexes.procedures;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.latexes.entity.DLbeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*     */ import net.mcreator.latexes.entity.DlsharkEntity;
/*     */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*     */ import net.mcreator.latexes.entity.YufengEntity;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class DarklatexcrystaleggUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  30 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/*  31 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  32 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR) ? true : false) == true) {
/*  33 */       world.destroyBlock(new BlockPos(x, y, z), false);
/*     */     }
/*  35 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXCRYSTALSPAWN) == true && 
/*  36 */       Math.random() < 0.15D)
/*  37 */       if (((world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/*  38 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/*  39 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR) ? true : false) == true) {
/*  40 */         if (Math.random() < 0.8D) {
/*  41 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  42 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  43 */             DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/*  44 */             darklatexslugEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  45 */             if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/*  46 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  48 */             world.addFreshEntity((Entity)darklatexslugEntity); }
/*     */         
/*  50 */         } else if (Math.random() < 0.2D) {
/*  51 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  52 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  53 */             YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/*  54 */             yufengEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  55 */             if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/*  56 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  58 */             world.addFreshEntity((Entity)yufengEntity); }
/*     */         
/*  60 */         } else if (Math.random() < 0.1D) {
/*  61 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  62 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  63 */             DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/*  64 */             darkLatexSpiderEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  65 */             if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/*  66 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  68 */             world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*     */         
/*  70 */         } else if (Math.random() < 0.1D) {
/*  71 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  72 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  73 */             DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/*  74 */             darkLatexSnakeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  75 */             if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/*  76 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  78 */             world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*     */         
/*  80 */         } else if (Math.random() < 0.1D) {
/*  81 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  82 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  83 */             NoiseStalkerEntity noiseStalkerEntity = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), (Level)_level);
/*  84 */             noiseStalkerEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  85 */             if (noiseStalkerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)noiseStalkerEntity;
/*  86 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(noiseStalkerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  88 */             world.addFreshEntity((Entity)noiseStalkerEntity); }
/*     */         
/*  90 */         } else if (Math.random() < 0.2D) {
/*  91 */           world.destroyBlock(new BlockPos(x, y, z), false);
/*  92 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  93 */             DarkLatexFoxEntity darkLatexFoxEntity = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), (Level)_level);
/*  94 */             darkLatexFoxEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/*  95 */             if (darkLatexFoxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexFoxEntity;
/*  96 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexFoxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/*  98 */             world.addFreshEntity((Entity)darkLatexFoxEntity); }
/*     */         
/* 100 */         } else if (Math.random() < 0.05D) {
/* 101 */           world.destroyBlock(new BlockPos(x, y, z), false);
/* 102 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 103 */             DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 104 */             dLbeeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 105 */             if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 106 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 108 */             world.addFreshEntity((Entity)dLbeeEntity); }
/*     */         
/* 110 */         } else if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.WATER || world
/* 111 */           .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.WATER) {
/* 112 */           world.destroyBlock(new BlockPos(x, y, z), false);
/* 113 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 114 */             DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 115 */             dlsharkEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 116 */             if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 117 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 119 */             world.addFreshEntity((Entity)dlsharkEntity); }
/*     */         
/*     */         } else {
/* 122 */           world.destroyBlock(new BlockPos(x, y, z), false);
/* 123 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 124 */             DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 125 */             darklatexEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 126 */             if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 127 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*     */             
/* 129 */             world.addFreshEntity((Entity)darklatexEntity); }
/*     */         
/*     */         } 
/*     */       } else {
/*     */         
/* 134 */         BlockPos _bp = new BlockPos(x, y, z);
/* 135 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/* 136 */         BlockState _bso = world.getBlockState(_bp);
/* 137 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 138 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 139 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 141 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 142 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 145 */         world.setBlock(_bp, _bs, 3);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexcrystaleggUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */