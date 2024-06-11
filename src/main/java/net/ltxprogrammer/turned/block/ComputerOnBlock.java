/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.procedures.ComputerOnOnBlockRightClickedProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.LevelReader;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SimpleWaterloggedBlock;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.BlockStateProperties;
/*     */ import net.minecraft.world.level.block.state.properties.BooleanProperty;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Fluid;
/*     */ import net.minecraft.world.level.material.FluidState;
/*     */ import net.minecraft.world.level.material.Fluids;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.material.MaterialColor;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class ComputerOnBlock
/*     */   extends Block
/*     */   implements SimpleWaterloggedBlock {
/*  51 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*  52 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;
/*     */   
/*     */   public ComputerOnBlock() {
/*  55 */     super(BlockBehaviour.Properties.m_60944_(Material.f_76281_, MaterialColor.f_76404_).m_60918_(SoundType.f_56743_).m_60913_(1.25F, 12.0F).m_60953_(s -> 5)
/*  56 */         .m_60999_().m_60955_().m_60924_((bs, br, bp) -> false));
/*  57 */     m_49959_((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/*  62 */     return state.m_60819_().m_76178_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  67 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  73 */     switch ((Direction)state.m_61143_((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  77 */       m_49796_(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  83 */     builder.m_61104_(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  88 */     boolean flag = (context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_);
/*  89 */     return (BlockState)((BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  93 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  97 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState m_5888_(BlockState state) {
/* 102 */     return ((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue() ? Fluids.f_76193_.m_76068_(false) : super.m_5888_(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState m_7417_(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/* 108 */     if (((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue()) {
/* 109 */       world.m_186469_(currentPos, (Fluid)Fluids.f_76193_, Fluids.f_76193_.m_6718_((LevelReader)world));
/*     */     }
/* 111 */     return super.m_7417_(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 116 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 117 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 118 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 123 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 124 */     if (!dropsOriginal.isEmpty())
/* 125 */       return dropsOriginal; 
/* 126 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModBlocks.COMPUTER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 131 */     super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 132 */     if (world.m_46755_(pos) <= 0)
/*     */     {
/* 134 */       ComputerOnOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 140 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 141 */     int x = pos.m_123341_();
/* 142 */     int y = pos.m_123342_();
/* 143 */     int z = pos.m_123343_();
/* 144 */     double hitX = (hit.m_82450_()).f_82479_;
/* 145 */     double hitY = (hit.m_82450_()).f_82480_;
/* 146 */     double hitZ = (hit.m_82450_()).f_82481_;
/* 147 */     Direction direction = hit.m_82434_();
/*     */     
/* 149 */     ComputerOnOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 150 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 155 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.COMPUTER_ON.get(), renderType -> (renderType == RenderType.m_110463_()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\ComputerOnBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */