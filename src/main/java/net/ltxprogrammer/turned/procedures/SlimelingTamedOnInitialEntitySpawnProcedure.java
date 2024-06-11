/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class SlimelingTamedOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (entity instanceof TamableAnimal) { TamableAnimal _tamEnt = (TamableAnimal)entity; if (_tamEnt.m_21824_())
/* 19 */         return;  }  if (entity instanceof TamableAnimal) { TamableAnimal _toTame = (TamableAnimal)entity;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       Entity entity1 = world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 8.0D, 8.0D, 8.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _owner = (Player)entity1;
/* 25 */         _toTame.m_21828_(_owner); }  }
/* 26 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */       _level.m_8767_((ParticleOptions)ParticleTypes.f_123748_, x, y, z, 6, 2.0D, 2.0D, 2.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingTamedOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */