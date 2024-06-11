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
/*    */ class null
/*    */ {
/*    */   public Direction getDirection(BlockPos pos) {
/* 14 */     BlockState _bs = world.m_8055_(pos);
/* 15 */     Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 16 */     if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 17 */         return _dir; }  }
/* 18 */      property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 19 */     if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 20 */         return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 21 */      return Direction.NORTH;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LabDoorBlockAddedProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */