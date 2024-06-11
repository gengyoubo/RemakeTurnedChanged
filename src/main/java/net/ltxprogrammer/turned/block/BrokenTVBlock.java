/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.LevelReader;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SimpleWaterloggedBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.BlockStateProperties;
/*    */ import net.minecraft.world.level.block.state.properties.BooleanProperty;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Fluid;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.level.material.Fluids;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class BrokenTVBlock extends Block implements SimpleWaterloggedBlock {
/* 36 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/* 37 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;
/*    */   
/*    */   public BrokenTVBlock() {
/* 40 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76281_).m_60918_(SoundType.f_56743_).m_60913_(1.0F, 7.5F).m_60999_().m_60955_()
/* 41 */         .m_60924_((bs, br, bp) -> false));
/* 42 */     m_49959_((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)WATERLOGGED, Boolean.valueOf(false)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 47 */     return state.m_60819_().m_76178_();
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 52 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/* 57 */     builder.m_61104_(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState m_5573_(BlockPlaceContext context) {
/* 62 */     boolean flag = (context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_);
/* 63 */     return (BlockState)((BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)WATERLOGGED, Boolean.valueOf(flag));
/*    */   }
/*    */   
/*    */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 67 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 71 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public FluidState m_5888_(BlockState state) {
/* 76 */     return ((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue() ? Fluids.f_76193_.m_76068_(false) : super.m_5888_(state);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public BlockState m_7417_(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/* 82 */     if (((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue()) {
/* 83 */       world.m_186469_(currentPos, (Fluid)Fluids.f_76193_, Fluids.f_76193_.m_6718_((LevelReader)world));
/*    */     }
/* 85 */     return super.m_7417_(state, facing, facingState, world, currentPos, facingPos);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 90 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 91 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 92 */      return false;
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 97 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BROKEN_TV.get(), renderType -> (renderType == RenderType.m_110463_()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BrokenTVBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */