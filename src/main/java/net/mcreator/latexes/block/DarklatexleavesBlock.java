/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexleavesBlockDestroyedByPlayerProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexleavesUpdateTickProcedure;
/*     */ import net.minecraft.client.renderer.BiomeColors;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockAndTintGetter;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.GrassColor;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.DirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.FluidState;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.client.event.ColorHandlerEvent;
/*     */ 
/*     */ public class DarklatexleavesBlock extends Block {
/*  41 */   public static final DirectionProperty FACING = DirectionalBlock.FACING;
/*     */   
/*     */   public DarklatexleavesBlock() {
/*  44 */     super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.SLIME_BLOCK).strength(0.35F, 2.5F).requiresCorrectToolForDrops()
/*  45 */         .friction(0.8F).speedFactor(0.5F).jumpFactor(0.5F).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).noDrops());
/*  46 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  51 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  56 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  61 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getNearestLookingDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  65 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  69 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  74 */     return 25;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  79 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  84 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  85 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  86 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  91 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  92 */     world.scheduleTick(pos, this, 60);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  97 */     super.tick(blockstate, world, pos, random);
/*  98 */     int x = pos.getX();
/*  99 */     int y = pos.getY();
/* 100 */     int z = pos.getZ();
/*     */     
/* 102 */     DarklatexleavesUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 103 */     world.scheduleTick(pos, this, 60);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 108 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 109 */     DarklatexleavesBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 110 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 115 */     super.entityInside(blockstate, world, pos, entity);
/* 116 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 121 */     super.stepOn(world, pos, blockstate, entity);
/* 122 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 127 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.DARKLATEXLEAVES.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void blockColorLoad(ColorHandlerEvent.Block event) {
/* 132 */     event.getBlockColors().register((bs, world, pos, index) -> 
/* 133 */         (world != null && pos != null) ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D), new Block[] {
/* 134 */           (Block)LatexModBlocks.DARKLATEXLEAVES.get()
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexleavesBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */