/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.TooltipFlag;
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
/*    */ public class RedLabStairsBlock extends StairBlock {
/*    */   public RedLabStairsBlock() {
/* 25 */     super(() -> Blocks.AIR.defaultBlockState(), 
/* 26 */         BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).requiresCorrectToolForDrops().dynamicShape());
/*    */   }
/*    */ 
/*    */   
/*    */   public float getExplosionResistance() {
/* 31 */     return 10.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRandomlyTicking(BlockState p_56947_) {
/* 36 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 41 */     super.appendHoverText(itemstack, world, list, flag);
/* 42 */     list.add(new TextComponent("Variant C"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 47 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 52 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 53 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 54 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 59 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 60 */     if (!dropsOriginal.isEmpty())
/* 61 */       return dropsOriginal; 
/* 62 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\RedLabStairsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */