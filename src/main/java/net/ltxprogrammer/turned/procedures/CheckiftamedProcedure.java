/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.TamableAnimal;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class CheckiftamedProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/* 15 */       return false; 
/* 16 */     TamableAnimal _tamEnt = (TamableAnimal)entity; return 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       (((((entity instanceof TamableAnimal) ? _tamEnt.m_142480_() : null) == world.m_6443_(Player.class, AABB.m_165882_(new Vec3(x, y, z), 6.0D, 6.0D, 6.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)) ? true : false) != true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CheckiftamedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */