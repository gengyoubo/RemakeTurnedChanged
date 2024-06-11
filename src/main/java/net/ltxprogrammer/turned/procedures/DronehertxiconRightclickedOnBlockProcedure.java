/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.DroneHertxEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DronehertxiconRightclickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 19 */       DroneHertxEntity droneHertxEntity = new DroneHertxEntity((EntityType)LatexModEntities.DRONE_HERTX.get(), (Level)_level);
/* 20 */       droneHertxEntity.m_7678_(x, y + 1.0D, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 21 */       if (droneHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)droneHertxEntity;
/* 22 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(droneHertxEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 23 */        world.m_7967_((Entity)droneHertxEntity); }
/*    */     
/* 25 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 26 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DRONEHERTXICON.get());
/* 27 */       _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_.m_39730_()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DronehertxiconRightclickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */