/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.BunkerDoorBlockAddedProcedure;
/*     */ import net.mcreator.latexes.procedures.BunkerDoorBlockDestroyedByPlayerProcedure;
/*     */ import net.mcreator.latexes.procedures.BunkerDoorOnBlockRightClickedProcedure;
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
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class BunkerDoorBlock extends Block implements SimpleWaterloggedBlock {
/*  54 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*  55 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
/*     */   
/*     */   public BunkerDoorBlock() {
/*  58 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(7.0F, 30.0F).requiresCorrectToolForDrops().noOcclusion()
/*  59 */         .isRedstoneConductor((bs, br, bp) -> false));
/*  60 */     registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH)).setValue((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  65 */     return 15;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  71 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  75 */       box(0.0D, -16.0D, -16.0D, 16.0D, 32.0D, 32.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  81 */     builder.add(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  86 */     boolean flag = (context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
/*  87 */     return (BlockState)((BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite())).setValue((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  91 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  95 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState getFluidState(BlockState state) {
/* 100 */     return ((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue() ? Fluids.WATER.getSource(false) : super.getFluidState(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/* 106 */     if (((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue()) {
/* 107 */       world.scheduleTick(currentPos, (Fluid)Fluids.WATER, Fluids.WATER.getTickDelay((LevelReader)world));
/*     */     }
/* 109 */     return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/* 114 */     return BlockPathTypes.DOOR_IRON_CLOSED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 119 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 120 */       return (tieredItem.getTier().getLevel() >= 21); }
/* 121 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 126 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 127 */     if (!dropsOriginal.isEmpty())
/* 128 */       return dropsOriginal; 
/* 129 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 134 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 135 */     BunkerDoorBlockAddedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 140 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 141 */     BunkerDoorBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 142 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void wasExploded(Level world, BlockPos pos, Explosion e) {
/* 147 */     super.wasExploded(world, pos, e);
/* 148 */     BunkerDoorBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 153 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 154 */     int x = pos.getX();
/* 155 */     int y = pos.getY();
/* 156 */     int z = pos.getZ();
/* 157 */     double hitX = (hit.getLocation()).x;
/* 158 */     double hitY = (hit.getLocation()).y;
/* 159 */     double hitZ = (hit.getLocation()).z;
/* 160 */     Direction direction = hit.getDirection();
/*     */     
/* 162 */     BunkerDoorOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)entity);
/* 163 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 168 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BUNKER_DOOR.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BunkerDoorBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */