/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexblockUpdateTickProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.LevelReader;
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
/*     */ import net.minecraft.world.level.material.Material;
/*     */ 
/*     */ public class DarklatexblockBlock extends Block {
/*  31 */   public static final DirectionProperty FACING = DirectionalBlock.FACING;
/*     */   
/*     */   public DarklatexblockBlock() {
/*  34 */     super(BlockBehaviour.Properties.of(Material.CLAY).sound(SoundType.SLIME_BLOCK).strength(0.75F, 5.0F).requiresCorrectToolForDrops()
/*  35 */         .friction(0.45F).speedFactor(0.5F).jumpFactor(0.7F));
/*  36 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
/*  41 */     return new float[] { 0.2F, 0.2F, 0.2F };
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  46 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  51 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  56 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getNearestLookingDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  60 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  64 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  69 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  74 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  79 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  80 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  81 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  86 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  87 */     world.scheduleTick(pos, this, 325);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  92 */     super.tick(blockstate, world, pos, random);
/*  93 */     int x = pos.getX();
/*  94 */     int y = pos.getY();
/*  95 */     int z = pos.getZ();
/*     */     
/*  97 */     DarklatexblockUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*  98 */     world.scheduleTick(pos, this, 325);
/*     */   }
/*     */ 
/*     */   
/*     */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 103 */     super.entityInside(blockstate, world, pos, entity);
/* 104 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 109 */     super.stepOn(world, pos, blockstate, entity);
/* 110 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexblockBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */