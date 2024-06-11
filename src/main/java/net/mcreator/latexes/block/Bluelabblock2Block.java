/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
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
/*    */ public class Bluelabblock2Block extends Block {
/* 28 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*    */   
/*    */   public Bluelabblock2Block() {
/* 31 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.2F, 12.5F));
/* 32 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 37 */     super.appendHoverText(itemstack, world, list, flag);
/* 38 */     list.add(new TextComponent("Variant 2"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 43 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 48 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 53 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 57 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 61 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 66 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 67 */     if (!dropsOriginal.isEmpty())
/* 68 */       return dropsOriginal; 
/* 69 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\Bluelabblock2Block.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */