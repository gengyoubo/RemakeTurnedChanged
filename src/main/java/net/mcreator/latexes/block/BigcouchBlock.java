/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.item.ItemStack;
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
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class BigcouchBlock
/*    */   extends Block
/*    */ {
/* 35 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*    */   
/*    */   public BigcouchBlock() {
/* 38 */     super(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(1.1F, 10.0F).noOcclusion()
/* 39 */         .isRedstoneConductor((bs, br, bp) -> false));
/* 40 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 50 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 56 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*    */ 
/*    */ 
/*    */       
/* 60 */       Shapes.or(box(-4.0D, 0.0D, 0.0D, 17.0D, 9.0D, 16.0D), box(14.0D, 7.0D, 0.0D, 17.0D, 22.0D, 16.0D));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 66 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 71 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 75 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 79 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 84 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 85 */     if (!dropsOriginal.isEmpty())
/* 86 */       return dropsOriginal; 
/* 87 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 92 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BIGCOUCH.get(), renderType -> (renderType == RenderType.cutout()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BigcouchBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */