/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.procedures.BlastdoorOnBlockRightClickedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.LabDoorBlockAddedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.LabDoorBlockDestroyedByExplosionProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Explosion;
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
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class BlastdoorBlock extends Block implements SimpleWaterloggedBlock {
/*  55 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*  56 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;
/*     */   
/*     */   public BlastdoorBlock() {
/*  59 */     super(BlockBehaviour.Properties.m_60944_(Material.f_76279_, MaterialColor.f_76404_).m_60918_(SoundType.f_56743_).m_60913_(3.5F, 27.5F)
/*  60 */         .m_60999_().m_60955_().m_60924_((bs, br, bp) -> false));
/*  61 */     m_49959_((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  66 */     return 15;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  72 */     switch ((Direction)state.m_61143_((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  76 */       m_49796_(0.0D, 0.0D, -16.0D, 16.0D, 32.0D, 16.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  82 */     builder.m_61104_(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  87 */     boolean flag = (context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_);
/*  88 */     return (BlockState)((BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  92 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  96 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState m_5888_(BlockState state) {
/* 101 */     return ((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue() ? Fluids.f_76193_.m_76068_(false) : super.m_5888_(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState m_7417_(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/* 107 */     if (((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue()) {
/* 108 */       world.m_186469_(currentPos, (Fluid)Fluids.f_76193_, Fluids.f_76193_.m_6718_((LevelReader)world));
/*     */     }
/* 110 */     return super.m_7417_(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/* 115 */     return BlockPathTypes.DOOR_IRON_CLOSED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 120 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 121 */       return (tieredItem.m_43314_().m_6604_() >= 2); }
/* 122 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 127 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 128 */     if (!dropsOriginal.isEmpty())
/* 129 */       return dropsOriginal; 
/* 130 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 135 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 136 */     LabDoorBlockAddedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 141 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 142 */     LabDoorBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 143 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7592_(Level world, BlockPos pos, Explosion e) {
/* 148 */     super.m_7592_(world, pos, e);
/* 149 */     LabDoorBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 154 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 155 */     int x = pos.m_123341_();
/* 156 */     int y = pos.m_123342_();
/* 157 */     int z = pos.m_123343_();
/* 158 */     double hitX = (hit.m_82450_()).f_82479_;
/* 159 */     double hitY = (hit.m_82450_()).f_82480_;
/* 160 */     double hitZ = (hit.m_82450_()).f_82481_;
/* 161 */     Direction direction = hit.m_82434_();
/*     */     
/* 163 */     BlastdoorOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/* 164 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 169 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BLASTDOOR.get(), renderType -> (renderType == RenderType.m_110463_()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BlastdoorBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */