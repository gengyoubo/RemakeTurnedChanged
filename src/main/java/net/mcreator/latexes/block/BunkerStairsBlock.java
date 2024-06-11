/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.StairBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class BunkerStairsBlock
/*    */   extends StairBlock {
/*    */   public BunkerStairsBlock() {
/* 20 */     super(() -> Blocks.AIR.defaultBlockState(), 
/* 21 */         BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0F, 25.0F).dynamicShape());
/*    */   }
/*    */ 
/*    */   
/*    */   public float getExplosionResistance() {
/* 26 */     return 25.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRandomlyTicking(BlockState p_56947_) {
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 36 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 41 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 42 */     if (!dropsOriginal.isEmpty())
/* 43 */       return dropsOriginal; 
/* 44 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BunkerStairsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */