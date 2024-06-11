/*    */ package net.mcreator.latexes.block;
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
/*    */ import net.minecraft.world.level.block.SlabBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.block.state.properties.SlabType;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class RedLabSlabBlock extends SlabBlock {
/*    */   public RedLabSlabBlock() {
/* 25 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).requiresCorrectToolForDrops());
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 30 */     super.appendHoverText(itemstack, world, list, flag);
/* 31 */     list.add(new TextComponent("Variant C"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 36 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 41 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 42 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 43 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 48 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 49 */     if (!dropsOriginal.isEmpty())
/* 50 */       return dropsOriginal; 
/* 51 */     return Collections.singletonList(new ItemStack((ItemLike)this, (state.getValue((Property)TYPE) == SlabType.DOUBLE) ? 2 : 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\RedLabSlabBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */