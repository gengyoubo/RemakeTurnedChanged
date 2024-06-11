/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class ReinforcedconcreteBlock extends Block {
/*    */   public ReinforcedconcreteBlock() {
/* 21 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(2.2F, 22.0F).requiresCorrectToolForDrops());
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 26 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 31 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 32 */       return (tieredItem.getTier().getLevel() >= 2); }
/* 33 */      return false;
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


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\ReinforcedconcreteBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */