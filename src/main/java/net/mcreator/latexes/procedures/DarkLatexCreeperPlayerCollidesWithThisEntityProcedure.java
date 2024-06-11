/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DarkLatexCreeperPlayerCollidesWithThisEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 22 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 24 */     entity.hurt(DamageSource.WITHER, 3.0F);
/* 25 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) <= 4.0F && sourceentity.isAlive()) {
/* 26 */       entity.hurt(DamageSource.WITHER, 8.0F);
/* 27 */       entity.hurt(DamageSource.GENERIC, 8.0F);
/* 28 */       if (!entity.level.isClientSide())
/* 29 */         entity.discard(); 
/* 30 */       if (world instanceof Level) { Level _level = (Level)world;
/* 31 */         if (!_level.isClientSide()) {
/* 32 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.HOSTILE, 2.0F, 1.0F);
/*    */         } else {
/*    */           
/* 35 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.HOSTILE, 2.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 39 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 40 */         DarkLatexCreeperEntity darkLatexCreeperEntity = new DarkLatexCreeperEntity((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), (Level)_level);
/* 41 */         darkLatexCreeperEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 42 */         if (darkLatexCreeperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexCreeperEntity;
/* 43 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexCreeperEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 45 */         world.addFreshEntity((Entity)darkLatexCreeperEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */