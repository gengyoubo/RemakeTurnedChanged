/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.DarklatexcrystaleggEntityCollidesInTheBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexcrystaleggUpdateTickProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.Mob;
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
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class DarklatexcrystaleggBlock
/*     */   extends Block implements SimpleWaterloggedBlock {
/*  51 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*  52 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
/*     */   
/*     */   public DarklatexcrystaleggBlock() {
/*  55 */     super(BlockBehaviour.Properties.of(Material.ICE_SOLID).sound(SoundType.GLASS).strength(5.0F, 1.0F).requiresCorrectToolForDrops().noCollission()
/*  56 */         .friction(0.9F).noOcclusion().randomTicks().isRedstoneConductor((bs, br, bp) -> false));
/*  57 */     registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH)).setValue((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  62 */     return state.getFluidState().isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  67 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  72 */     builder.add(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  77 */     boolean flag = (context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
/*  78 */     return (BlockState)((BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite())).setValue((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  82 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  86 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState getFluidState(BlockState state) {
/*  91 */     return ((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue() ? Fluids.WATER.getSource(false) : super.getFluidState(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/*  97 */     if (((Boolean)state.getValue((Property)WATERLOGGED)).booleanValue()) {
/*  98 */       world.scheduleTick(currentPos, (Fluid)Fluids.WATER, Fluids.WATER.getTickDelay((LevelReader)world));
/*     */     }
/* 100 */     return super.updateShape(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/* 105 */     return BlockPathTypes.DANGER_CACTUS;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 110 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 111 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 112 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 117 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 118 */     if (!dropsOriginal.isEmpty())
/* 119 */       return dropsOriginal; 
/* 120 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get(), 2));
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 125 */     super.tick(blockstate, world, pos, random);
/* 126 */     int x = pos.getX();
/* 127 */     int y = pos.getY();
/* 128 */     int z = pos.getZ();
/*     */     
/* 130 */     DarklatexcrystaleggUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*     */   }
/*     */ 
/*     */   
/*     */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 135 */     super.entityInside(blockstate, world, pos, entity);
/* 136 */     DarklatexcrystaleggEntityCollidesInTheBlockProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ(), entity);
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 141 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get(), renderType -> (renderType == RenderType.translucent()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexcrystaleggBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */