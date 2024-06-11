/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/*    */   public Direction getDirection(BlockPos pos) {
/* 40 */     BlockState _bs = world.m_8055_(pos);
/* 41 */     Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 42 */     if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 43 */         return _dir; }  }
/* 44 */      property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 45 */     if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 46 */         return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 47 */      return Direction.NORTH;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BunkerDoorBlockAddedProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */