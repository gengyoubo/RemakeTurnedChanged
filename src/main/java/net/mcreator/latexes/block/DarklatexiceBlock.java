/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.DirectionalBlock;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class DarklatexiceBlock extends Block {
/* 29 */   public static final DirectionProperty FACING = DirectionalBlock.FACING;
/*    */   
/*    */   public DarklatexiceBlock() {
/* 32 */     super(BlockBehaviour.Properties.of(Material.ICE).sound(SoundType.GLASS).strength(0.75F, 2.0F).requiresCorrectToolForDrops().friction(0.98F));
/* 33 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 38 */     return 7;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 43 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 48 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getNearestLookingDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 52 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 56 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 61 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 62 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 63 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 68 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 69 */     if (!dropsOriginal.isEmpty())
/* 70 */       return dropsOriginal; 
/* 71 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get(), 3));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexiceBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */