/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.VentOnBlockRightClickedProcedure;
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
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class VentBlock extends Block {
/*  41 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public VentBlock() {
/*  44 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.0F, 12.5F).requiresCorrectToolForDrops().noOcclusion()
/*  45 */         .isRedstoneConductor((bs, br, bp) -> false));
/*  46 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  51 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  56 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  62 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  66 */       box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  72 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  77 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  81 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  85 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  90 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  91 */       return (tieredItem.getTier().getLevel() >= 1); }
/*  92 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  97 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  98 */     if (!dropsOriginal.isEmpty())
/*  99 */       return dropsOriginal; 
/* 100 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 105 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 106 */     int x = pos.getX();
/* 107 */     int y = pos.getY();
/* 108 */     int z = pos.getZ();
/* 109 */     double hitX = (hit.getLocation()).x;
/* 110 */     double hitY = (hit.getLocation()).y;
/* 111 */     double hitZ = (hit.getLocation()).z;
/* 112 */     Direction direction = hit.getDirection();
/*     */     
/* 114 */     VentOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 115 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 120 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.VENT.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\VentBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */