/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class BookpilerandomRightClickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR) {
/* 18 */       Player _plr = (Player)entity; if (!((entity instanceof Player) ? (_plr.getAbilities()).instabuild : 0) && 
/* 19 */         entity instanceof Player) { Player _player = (Player)entity;
/* 20 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.BOOKPILERANDOM.get());
/* 21 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 22 */             .getCraftSlots()); }
/*    */ 
/*    */       
/* 25 */       if (Math.random() < Math.random()) {
/* 26 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.BOOKPILE_1.get()).defaultBlockState(), 3);
/* 27 */       } else if (Math.random() < Math.random()) {
/* 28 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.BOOKPILE_2.get()).defaultBlockState(), 3);
/* 29 */       } else if (Math.random() < Math.random()) {
/* 30 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.BOOKPILE_3.get()).defaultBlockState(), 3);
/* 31 */       } else if (Math.random() < Math.random()) {
/* 32 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.BOOKPILE_4.get()).defaultBlockState(), 3);
/*    */       } else {
/* 34 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.BOOKPILE_5.get()).defaultBlockState(), 3);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BookpilerandomRightClickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */