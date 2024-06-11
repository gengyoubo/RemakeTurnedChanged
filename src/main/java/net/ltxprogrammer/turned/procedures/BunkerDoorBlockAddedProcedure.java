/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.EnumProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class BunkerDoorBlockAddedProcedure {
/*    */   public static void execute(final LevelAccessor world, double x, double y, double z) {
/* 17 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == LatexModBlocks.BUNKER_DOOR.get() || world
/* 18 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50375_ || world
/* 19 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/* 20 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/* 21 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_) ? true : false) != true) {
/* 22 */       world.m_46961_(new BlockPos(x, y, z), false);
/*    */       
/* 24 */       BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/* 25 */       BlockState _bs = ((Block)LatexModBlocks.BUNKER_DOOR.get()).m_49966_();
/* 26 */       BlockState _bso = world.m_8055_(_bp);
/* 27 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 28 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 29 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 31 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 32 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 35 */       world.m_7731_(_bp, _bs, 3);
/*    */     } 
/*    */     
/* 38 */     if (((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 40 */           BlockState _bs = world.m_8055_(pos);
/* 41 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 42 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 43 */               return _dir; }  }
/* 44 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 45 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 46 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 47 */            return Direction.NORTH;
/*    */         }
/* 49 */       }).getDirection(new BlockPos(x, y, z)) == Direction.NORTH || (new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 51 */           BlockState _bs = world.m_8055_(pos);
/* 52 */           Property<?> property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 53 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 54 */               return _dir; }  }
/* 55 */            property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 56 */           if (property != null) { Comparable comparable = _bs.m_61143_(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 57 */               return Direction.m_122387_(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 58 */            return Direction.NORTH;
/*    */         }
/* 60 */       }).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) && (
/* 61 */       (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50016_ || world
/* 62 */       .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50626_ || world
/* 63 */       .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50627_ || world
/* 64 */       .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50016_ || world
/* 65 */       .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50626_ || world
/* 66 */       .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50627_) ? true : false) != true) {
/*    */       
/* 68 */       Direction _dir = Direction.WEST;
/* 69 */       BlockPos _pos = new BlockPos(x, y, z);
/* 70 */       BlockState _bs = world.m_8055_(_pos);
/* 71 */       Property<?> _property = _bs.m_60734_().m_49965_().m_61081_("facing");
/* 72 */       if (_property instanceof DirectionProperty) { DirectionProperty _dp = (DirectionProperty)_property; if (_dp.m_6908_().contains(_dir)) {
/* 73 */           world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_dp, (Comparable)_dir), 3); return;
/*    */         }  }
/* 75 */        _property = _bs.m_60734_().m_49965_().m_61081_("axis");
/* 76 */       if (_property instanceof EnumProperty) { EnumProperty _ap = (EnumProperty)_property; if (_ap.m_6908_().contains(_dir.m_122434_()))
/* 77 */           world.m_7731_(_pos, (BlockState)_bs.m_61124_((Property)_ap, (Comparable)_dir.m_122434_()), 3);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BunkerDoorBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */