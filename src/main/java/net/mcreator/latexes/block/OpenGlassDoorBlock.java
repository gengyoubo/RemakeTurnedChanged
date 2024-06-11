/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.GlassDoorUpdateTickProcedure;
/*     */ import net.mcreator.latexes.procedures.OpenGlassDoorOnBlockRightClickedProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
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
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class OpenGlassDoorBlock extends Block {
/*  44 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public OpenGlassDoorBlock() {
/*  47 */     super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.STONE).strength(0.75F, 7.5F).requiresCorrectToolForDrops().noCollission()
/*  48 */         .noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
/*  49 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  59 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  65 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  69 */       box(5.0D, 0.0D, 0.0D, 11.0D, 32.0D, 16.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  75 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  80 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
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
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/*  93 */     return BlockPathTypes.DOOR_OPEN;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  98 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  99 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 100 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 105 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 106 */     if (!dropsOriginal.isEmpty())
/* 107 */       return dropsOriginal; 
/* 108 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 113 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 114 */     GlassDoorUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 119 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 120 */     int x = pos.getX();
/* 121 */     int y = pos.getY();
/* 122 */     int z = pos.getZ();
/* 123 */     double hitX = (hit.getLocation()).x;
/* 124 */     double hitY = (hit.getLocation()).y;
/* 125 */     double hitZ = (hit.getLocation()).z;
/* 126 */     Direction direction = hit.getDirection();
/*     */     
/* 128 */     OpenGlassDoorOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 129 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 134 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.OPEN_GLASS_DOOR.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\OpenGlassDoorBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */