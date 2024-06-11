/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProtectorSlimelingThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 36 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 38 */     if (Math.random() < 0.5D) {
/* 39 */       if (!entity.level.isClientSide())
/* 40 */         entity.discard(); 
/* 41 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 42 */         _level.sendParticles((ParticleOptions)ParticleTypes.HEART, x, y, z, 3, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 43 */        if (world instanceof Level) { Level _level = (Level)world;
/* 44 */         if (!_level.isClientSide()) {
/* 45 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*    */         } else {
/*    */           
/* 48 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 52 */       if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/* 53 */         LivingEntity _livEnt = (LivingEntity)sourceentity;
/* 54 */         LivingEntity livingEntity1 = (LivingEntity)sourceentity; _entity.setHealth(((sourceentity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) + ((sourceentity instanceof LivingEntity) ? livingEntity1.getMaxHealth() : -1.0F) / 4.0F); } 
/* 55 */     } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && Math.random() < 0.5D && (
/* 56 */       entity instanceof net.minecraft.world.entity.monster.Pillager || entity instanceof net.minecraft.world.entity.player.Player || entity instanceof net.mcreator.latexes.entity.DarklatexEntity || entity instanceof net.minecraft.world.entity.monster.ZombifiedPiglin || entity instanceof net.minecraft.world.entity.monster.piglin.PiglinBrute || entity instanceof net.minecraft.world.entity.monster.ZombieVillager || entity instanceof net.minecraft.world.entity.monster.Vindicator || entity instanceof net.minecraft.world.entity.npc.Villager || entity instanceof net.minecraft.world.entity.npc.WanderingTrader || entity instanceof net.minecraft.world.entity.monster.Husk || entity instanceof net.minecraft.world.entity.monster.Evoker || entity instanceof net.minecraft.world.entity.monster.Illusioner || entity instanceof net.minecraft.world.entity.monster.Drowned)) {
/*    */ 
/*    */ 
/*    */       
/* 60 */       if (world instanceof Level) { Level _level = (Level)world;
/* 61 */         if (!_level.isClientSide()) {
/* 62 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 65 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 69 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 70 */         _level.sendParticles((ParticleOptions)ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 71 */        if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 72 */         ProtectorSlimelingEntity protectorSlimelingEntity = new ProtectorSlimelingEntity((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), (Level)_level);
/* 73 */         protectorSlimelingEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 74 */         if (protectorSlimelingEntity instanceof Mob) { Mob _mobToSpawn = (Mob)protectorSlimelingEntity;
/* 75 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(protectorSlimelingEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 77 */         world.addFreshEntity((Entity)protectorSlimelingEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ProtectorSlimelingThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */