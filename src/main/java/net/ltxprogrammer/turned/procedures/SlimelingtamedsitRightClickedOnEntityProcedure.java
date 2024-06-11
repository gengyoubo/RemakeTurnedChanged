/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.SlimelingTamedEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingtamedsitRightClickedOnEntityProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 15 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 17 */     if (entity instanceof TamableAnimal) { TamableAnimal _tamIsTamedBy = (TamableAnimal)entity; if (sourceentity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)sourceentity; if (_tamIsTamedBy.m_21830_(_livEnt)) {
/* 18 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 19 */             SlimelingTamedEntity slimelingTamedEntity = new SlimelingTamedEntity((EntityType)LatexModEntities.SLIMELING_TAMED.get(), (Level)_level);
/* 20 */             slimelingTamedEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 21 */             slimelingTamedEntity.m_5618_(entity.m_146908_());
/* 22 */             slimelingTamedEntity.m_5616_(entity.m_146908_());
/* 23 */             if (slimelingTamedEntity instanceof Mob) { Mob _mobToSpawn = (Mob)slimelingTamedEntity;
/* 24 */               _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(slimelingTamedEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */             
/* 26 */             world.m_7967_((Entity)slimelingTamedEntity); }
/*    */           
/* 28 */           if (!entity.f_19853_.m_5776_())
/* 29 */             entity.m_146870_(); 
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingtamedsitRightClickedOnEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */