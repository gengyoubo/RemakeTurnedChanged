/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*    */ import net.ltxprogrammer.changed.entity.LatexType;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Vec3i;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.item.enchantment.Enchantments;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexeaterslimeUpdateTickProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 31 */     BlockPos[] checkPos = { new BlockPos(x + 1.0D, y, z), new BlockPos(x - 1.0D, y, z), new BlockPos(x, y + 1.0D, z), new BlockPos(x, y - 1.0D, z), new BlockPos(x, y, z + 1.0D), new BlockPos(x, y, z - 1.0D) };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 40 */     boolean flag = false;
/* 41 */     for (BlockPos blockPos : checkPos) {
/* 42 */       BlockState original = world.m_8055_(blockPos);
/* 43 */       if (original.m_61147_().contains(AbstractLatexBlock.COVERED) && original.m_61143_((Property)AbstractLatexBlock.COVERED) != LatexType.NEUTRAL) {
/* 44 */         flag = true;
/* 45 */         if (world instanceof ServerLevel) { ServerLevel server = (ServerLevel)world;
/* 46 */           ItemStack silkPick = Items.f_42395_.m_7968_();
/* 47 */           silkPick.m_41663_(Enchantments.f_44985_, 255);
/* 48 */           original.m_60724_((new LootContext.Builder(server)).m_78977_(server.f_46441_)
/* 49 */               .m_78972_(LootContextParams.f_81460_, Vec3.m_82512_((Vec3i)blockPos))
/* 50 */               .m_78972_(LootContextParams.f_81463_, silkPick)).forEach(itemStack -> {
/*    */                 if (!itemStack.m_150930_((Item)ChangedItems.DARK_LATEX_GOO.get()) && !itemStack.m_150930_((Item)ChangedItems.WHITE_LATEX_GOO.get()))
/*    */                   Block.m_49840_((Level)server, blockPos, itemStack); 
/*    */               }); }
/*    */         
/* 55 */         world.m_7731_(blockPos, ((Block)LatexModBlocks.LATEXEATERSLIME.get()).m_49966_(), 3);
/*    */         
/*    */         break;
/*    */       } 
/* 59 */       if (original.m_60734_() instanceof AbstractLatexBlock || original.m_60734_() instanceof net.ltxprogrammer.changed.block.AbstractLatexIceBlock) {
/* 60 */         flag = true;
/* 61 */         world.m_7731_(blockPos, ((Block)LatexModBlocks.LATEXEATERSLIME.get()).m_49966_(), 3);
/*    */         
/*    */         break;
/*    */       } 
/*    */     } 
/* 66 */     if (!flag && Math.random() < 0.3D)
/* 67 */       world.m_7731_(new BlockPos(x, y, z), Blocks.f_50016_.m_49966_(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexeaterslimeUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */