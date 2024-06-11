/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.entity.DlSquidDogEntity;
/*    */ import net.mcreator.latexes.entity.DlsharkEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DlSquidDogThisEntityKillsAnotherOneProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null)
/*    */       return; 
/* 26 */     if (((entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity
/* 27 */       .getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) || entity instanceof net.minecraft.world.entity.player.Player) ? true : false) != true) {
/*    */       
/* 29 */       if (!entity.level.isClientSide())
/* 30 */         entity.discard(); 
/* 31 */       if (world instanceof Level) { Level _level = (Level)world;
/* 32 */         if (!_level.isClientSide()) {
/* 33 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 36 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 40 */       if (Math.random() < 0.7D)
/* 41 */       { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 42 */           DlSquidDogEntity dlSquidDogEntity = new DlSquidDogEntity((EntityType)LatexModEntities.DL_SQUID_DOG.get(), (Level)_level);
/* 43 */           dlSquidDogEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 44 */           if (dlSquidDogEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlSquidDogEntity;
/* 45 */             _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlSquidDogEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */           
/* 47 */           world.addFreshEntity((Entity)dlSquidDogEntity); }
/*    */         
/*    */          }
/* 50 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 51 */         DlsharkEntity dlsharkEntity = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), (Level)_level);
/* 52 */         dlsharkEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 53 */         if (dlsharkEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dlsharkEntity;
/* 54 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dlsharkEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 56 */         world.addFreshEntity((Entity)dlsharkEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DlSquidDogThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */