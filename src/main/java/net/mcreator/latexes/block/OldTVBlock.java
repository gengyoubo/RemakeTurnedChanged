/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.OldTVRedstoneOnProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.TooltipFlag;
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
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class OldTVBlock
/*     */   extends Block implements SimpleWaterloggedBlock {
/*  47 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*  48 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
/*     */   
/*     */   public OldTVBlock() {
/*  51 */     super(BlockBehaviour.Properties.of(Material.HEAVY_METAL).sound(SoundType.METAL).strength(2.0F, 17.5F).requiresCorrectToolForDrops()
/*  52 */         .noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
/*  53 */     registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH)).setValue((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  58 */     super.appendHoverText(itemstack, world, list, flag);
/*  59 */     list.add(new TextComponent("Requires Redstone to work"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  64 */     return state.getFluidState().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  69 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  74 */     builder.add(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  79 */     boolean flag = (context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
/*  80 */     return (BlockState)((BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite())).setValue((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  84 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  88 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState getFluidState(BlockState state) {
/*  93 */     return ((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue() ? Fluids.WATER.getSource(false) : super.getFluidState(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/*  99 */     if (((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue()) {
/* 100 */       world.scheduleTick(currentPos, (Fluid)Fluids.WATER, Fluids.WATER.getTickDelay((LevelReader)world));
/*     */     }
/* 102 */     return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 107 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 108 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 109 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 114 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 115 */     if (!dropsOriginal.isEmpty())
/* 116 */       return dropsOriginal; 
/* 117 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 122 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 123 */     if (world.getBestNeighborSignal(pos) > 0) {
/* 124 */       OldTVRedstoneOnProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */     }
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 130 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.OLD_TV.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\OldTVBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */