/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.SlimelingEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class SlimeessenceLivingEntityIsHitWithItemProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if (entity instanceof net.minecraft.world.entity.monster.Slime) {
/* 25 */       if (world instanceof Level) { Level _level = (Level)world;
/* 26 */         if (!_level.isClientSide()) {
/* 27 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 30 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 34 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */         _level.sendParticles((ParticleOptions)ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 36 */        if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 37 */         SlimelingEntity slimelingEntity = new SlimelingEntity((EntityType)LatexModEntities.SLIMELING.get(), (Level)_level);
/* 38 */         slimelingEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 39 */         slimelingEntity.setYBodyRot(0.0F);
/* 40 */         slimelingEntity.setYHeadRot(0.0F);
/* 41 */         if (slimelingEntity instanceof Mob) { Mob _mobToSpawn = (Mob)slimelingEntity;
/* 42 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(slimelingEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 44 */         world.addFreshEntity((Entity)slimelingEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SlimeessenceLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */