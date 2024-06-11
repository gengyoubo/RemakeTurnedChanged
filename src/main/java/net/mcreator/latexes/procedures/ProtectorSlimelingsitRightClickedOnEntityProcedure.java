/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class ProtectorSlimelingsitRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 16 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 18 */     if (entity instanceof TamableAnimal) { TamableAnimal _tamIsTamedBy = (TamableAnimal)entity; if (sourceentity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)sourceentity; if (_tamIsTamedBy
/* 19 */           .isOwnedBy(_livEnt)) {
/*    */           
/* 21 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 22 */             ProtectorSlimelingEntity protectorSlimelingEntity = new ProtectorSlimelingEntity((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), (Level)_level);
/* 23 */             protectorSlimelingEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 24 */             protectorSlimelingEntity.setYBodyRot(entity.getYRot());
/* 25 */             protectorSlimelingEntity.setYHeadRot(entity.getYRot());
/* 26 */             if (protectorSlimelingEntity instanceof Mob) { Mob _mobToSpawn = (Mob)protectorSlimelingEntity;
/* 27 */               _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(protectorSlimelingEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */             
/* 29 */             world.addFreshEntity((Entity)protectorSlimelingEntity); }
/*    */           
/* 31 */           if (!entity.level.isClientSide())
/* 32 */             entity.discard(); 
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ProtectorSlimelingsitRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */