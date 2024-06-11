/*    */ package net.mcreator.latexes.procedures;
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
/*    */ public class HertxOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (entity instanceof TamableAnimal) { TamableAnimal _tamEnt = (TamableAnimal)entity; if (_tamEnt.isTame())
/* 19 */         return;  }  if (entity instanceof TamableAnimal) { TamableAnimal _toTame = (TamableAnimal)entity;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       Entity entity1 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8.0D, 8.0D, 8.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof Player) { Player _owner = (Player)entity1;
/* 25 */         _toTame.tame(_owner); }  }
/* 26 */      if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */       _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, 2.0D, 2.0D, 2.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HertxOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */