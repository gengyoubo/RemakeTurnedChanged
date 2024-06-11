/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.WallBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class BunkerWallBlock
/*    */   extends WallBlock {
/*    */   public BunkerWallBlock() {
/* 22 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5.0F, 25.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 27 */     super.appendHoverText(itemstack, world, list, flag);
/* 28 */     list.add(new TextComponent("Smooth"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 33 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 38 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 39 */     if (!dropsOriginal.isEmpty())
/* 40 */       return dropsOriginal; 
/* 41 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BunkerWallBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */