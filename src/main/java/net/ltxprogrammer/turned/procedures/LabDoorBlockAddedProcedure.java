/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class LabDoorBlockAddedProcedure {
/*    */   public static void execute(final LevelAccessor world, double x, double y, double z) {
/* 12 */     if ((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 14 */           BlockState _bs = world.m_8055_(pos);
/* 15 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 16 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 17 */               return _dir; }  }
/* 18 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 19 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 20 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 21 */            return Direction.NORTH;
/*    */         }
/* 23 */       }).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
/* 24 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 25 */       world.m_7731_(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 26 */       world.m_7731_(new BlockPos(x - 1.0D, y, z), Blocks.f_50375_.m_49966_(), 3);
/* 27 */     } else if ((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 29 */           BlockState _bs = world.m_8055_(pos);
/* 30 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 31 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 32 */               return _dir; }  }
/* 33 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 34 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 35 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 36 */            return Direction.NORTH;
/*    */         }
/* 38 */       }).getDirection(new BlockPos(x, y, z)) == Direction.NORTH) {
/* 39 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 40 */       world.m_7731_(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 41 */       world.m_7731_(new BlockPos(x + 1.0D, y, z), Blocks.f_50375_.m_49966_(), 3);
/* 42 */     } else if ((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 44 */           BlockState _bs = world.m_8055_(pos);
/* 45 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 46 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 47 */               return _dir; }  }
/* 48 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 49 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 50 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 51 */            return Direction.NORTH;
/*    */         }
/* 53 */       }).getDirection(new BlockPos(x, y, z)) == Direction.WEST) {
/* 54 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 55 */       world.m_7731_(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.f_50375_.m_49966_(), 3);
/* 56 */       world.m_7731_(new BlockPos(x, y, z - 1.0D), Blocks.f_50375_.m_49966_(), 3);
/* 57 */     } else if ((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 59 */           BlockState _bs = world.m_8055_(pos);
/* 60 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 61 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 62 */               return _dir; }  }
/* 63 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 64 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 65 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 66 */            return Direction.NORTH;
/*    */         }
/* 68 */       }).getDirection(new BlockPos(x, y, z)) == Direction.EAST) {
/* 69 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50375_.m_49966_(), 3);
/* 70 */       world.m_7731_(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.f_50375_.m_49966_(), 3);
/* 71 */       world.m_7731_(new BlockPos(x, y, z + 1.0D), Blocks.f_50375_.m_49966_(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LabDoorBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */