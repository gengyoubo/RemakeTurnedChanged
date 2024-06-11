/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.SlabBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.block.state.properties.SlabType;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class YellowlabslabsBlock extends SlabBlock {
/*    */   public YellowlabslabsBlock() {
/* 20 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.2F, 12.5F).friction(0.5F));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 25 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 30 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 31 */     if (!dropsOriginal.isEmpty())
/* 32 */       return dropsOriginal; 
/* 33 */     return Collections.singletonList(new ItemStack((ItemLike)this, (state.getValue((Property)TYPE) == SlabType.DOUBLE) ? 2 : 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\YellowlabslabsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */