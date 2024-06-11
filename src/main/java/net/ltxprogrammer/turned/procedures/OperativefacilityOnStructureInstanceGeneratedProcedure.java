/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.MilitaryEntity;
/*    */ import net.ltxprogrammer.turned.entity.ScientistEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.npc.Villager;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class OperativefacilityOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 16 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 18 */       villager.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
/* 19 */       villager.m_5618_(0.0F);
/* 20 */       villager.m_5616_(0.0F);
/* 21 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 22 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 23 */        world.m_7967_((Entity)villager); }
/*    */     
/* 25 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 26 */       Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 27 */       villager.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
/* 28 */       villager.m_5618_(0.0F);
/* 29 */       villager.m_5616_(0.0F);
/* 30 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 31 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 32 */        world.m_7967_((Entity)villager); }
/*    */     
/* 34 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */       ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 36 */       scientistEntity.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
/* 37 */       scientistEntity.m_5618_(0.0F);
/* 38 */       scientistEntity.m_5616_(0.0F);
/* 39 */       if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 40 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 41 */        world.m_7967_((Entity)scientistEntity); }
/*    */     
/* 43 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 44 */       ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 45 */       scientistEntity.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
/* 46 */       scientistEntity.m_5618_(0.0F);
/* 47 */       scientistEntity.m_5616_(0.0F);
/* 48 */       if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 49 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(scientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 50 */        world.m_7967_((Entity)scientistEntity); }
/*    */     
/* 52 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 53 */       MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 54 */       militaryEntity.m_7678_(x, y + 1.0D, z, 0.0F, 0.0F);
/* 55 */       militaryEntity.m_5618_(0.0F);
/* 56 */       militaryEntity.m_5616_(0.0F);
/* 57 */       if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 58 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(militaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 59 */        world.m_7967_((Entity)militaryEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\OperativefacilityOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */