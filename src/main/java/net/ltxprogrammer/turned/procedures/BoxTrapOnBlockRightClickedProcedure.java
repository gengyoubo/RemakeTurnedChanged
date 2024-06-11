/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class BoxTrapOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 17 */     world.m_46961_(new BlockPos(x, y, z), false);
/* 18 */     if (Math.random() < 0.4D)
/* 19 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 20 */         DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 21 */         darklatexEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 22 */         if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 23 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 25 */         world.m_7967_((Entity)darklatexEntity); }
/*    */        }
/* 27 */     else if (Math.random() < 0.1D)
/* 28 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 29 */         DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 30 */         darkLatexSnepEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 31 */         if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 32 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnepEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 34 */         world.m_7967_((Entity)darkLatexSnepEntity); }
/*    */        }
/* 36 */     else if (Math.random() < 0.1D)
/* 37 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 38 */         DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 39 */         darkLatexSnakeEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 40 */         if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 41 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnakeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 43 */         world.m_7967_((Entity)darkLatexSnakeEntity); }
/*    */        }
/* 45 */     else if (Math.random() < 0.1D)
/* 46 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 47 */         DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 48 */         darkLatexSpiderEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 49 */         if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 50 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSpiderEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 52 */         world.m_7967_((Entity)darkLatexSpiderEntity); }
/*    */        }
/* 54 */     else if (Math.random() < 0.1D)
/* 55 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 56 */         DarkLatexYufeng darkLatexYufeng = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), (Level)_level);
/* 57 */         darkLatexYufeng.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 58 */         if (darkLatexYufeng instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexYufeng;
/* 59 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexYufeng.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 61 */         world.m_7967_((Entity)darkLatexYufeng); }
/*    */       
/*    */        }
/* 64 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 65 */       DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 66 */       darklatexslugEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 67 */       if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 68 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 70 */       world.m_7967_((Entity)darklatexslugEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BoxTrapOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */