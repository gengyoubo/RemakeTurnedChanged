/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
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
/* 18 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.BUNKER_DOOR.get() || world
/* 19 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BARRIER || world
/* 20 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/* 21 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 22 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) != true) {
/* 23 */       world.destroyBlock(new BlockPos(x, y, z), false);
/*    */       
/* 25 */       BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/* 26 */       BlockState _bs = ((Block)LatexModBlocks.BUNKER_DOOR.get()).defaultBlockState();
/* 27 */       BlockState _bso = world.getBlockState(_bp);
/* 28 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 29 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 30 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 32 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 33 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 36 */       world.setBlock(_bp, _bs, 3);
/*    */     } 
/*    */     
/* 39 */     if (((new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 41 */           BlockState _bs = world.getBlockState(pos);
/* 42 */           Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
/* 43 */           if (property != null) { Comparable comparable = _bs.getValue(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 44 */               return _dir; }  }
/* 45 */            property = _bs.getBlock().getStateDefinition().getProperty("axis");
/* 46 */           if (property != null) { Comparable comparable = _bs.getValue(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 47 */               return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 48 */            return Direction.NORTH;
/*    */         }
/* 50 */       }).getDirection(new BlockPos(x, y, z)) == Direction.NORTH || (new Object() {
/*    */         public Direction getDirection(BlockPos pos) {
/* 52 */           BlockState _bs = world.getBlockState(pos);
/* 53 */           Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
/* 54 */           if (property != null) { Comparable comparable = _bs.getValue(property); if (comparable instanceof Direction) { Direction _dir = (Direction)comparable;
/* 55 */               return _dir; }  }
/* 56 */            property = _bs.getBlock().getStateDefinition().getProperty("axis");
/* 57 */           if (property != null) { Comparable comparable = _bs.getValue(property); if (comparable instanceof Direction.Axis) { Direction.Axis _axis = (Direction.Axis)comparable;
/* 58 */               return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE); }  }
/* 59 */            return Direction.NORTH;
/*    */         }
/* 61 */       }).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) && (
/* 62 */       (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.AIR || world
/* 63 */       .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 64 */       .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 65 */       .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.AIR || world
/* 66 */       .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 67 */       .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) != true) {
/*    */       
/* 69 */       Direction _dir = Direction.WEST;
/* 70 */       BlockPos _pos = new BlockPos(x, y, z);
/* 71 */       BlockState _bs = world.getBlockState(_pos);
/* 72 */       Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
/* 73 */       if (_property instanceof DirectionProperty) { DirectionProperty _dp = (DirectionProperty)_property; if (_dp.getPossibleValues().contains(_dir)) {
/* 74 */           world.setBlock(_pos, (BlockState)_bs.setValue((Property)_dp, (Comparable)_dir), 3); return;
/*    */         }  }
/* 76 */        _property = _bs.getBlock().getStateDefinition().getProperty("axis");
/* 77 */       if (_property instanceof EnumProperty) { EnumProperty _ap = (EnumProperty)_property; if (_ap.getPossibleValues().contains(_dir.getAxis()))
/* 78 */           world.setBlock(_pos, (BlockState)_bs.setValue((Property)_ap, (Comparable)_dir.getAxis()), 3);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BunkerDoorBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */