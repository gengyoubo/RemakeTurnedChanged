/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.procedures.NukeBlockDestroyedByExplosionProcedure;
/*     */ import net.mcreator.latexes.procedures.NukeOnBlockRightClickedProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TooltipFlag;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Explosion;
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
/*     */ 
/*     */ public class NukeBlock extends Block {
/*  37 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public NukeBlock() {
/*  40 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.GRAVEL).strength(1.0F, 10.0F));
/*  41 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  46 */     super.appendHoverText(itemstack, world, list, flag);
/*  47 */     list.add(new TextComponent("Creative Only Tool."));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  52 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  57 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  62 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  66 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  70 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  75 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  76 */     if (!dropsOriginal.isEmpty())
/*  77 */       return dropsOriginal; 
/*  78 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/*  83 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/*  84 */     if (world.getBestNeighborSignal(pos) > 0) {
/*  85 */       NukeOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void wasExploded(Level world, BlockPos pos, Explosion e) {
/*  91 */     super.wasExploded(world, pos, e);
/*  92 */     NukeBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/*  97 */     super.use(blockstate, world, pos, entity, hand, hit);
/*  98 */     int x = pos.getX();
/*  99 */     int y = pos.getY();
/* 100 */     int z = pos.getZ();
/* 101 */     double hitX = (hit.getLocation()).x;
/* 102 */     double hitY = (hit.getLocation()).y;
/* 103 */     double hitZ = (hit.getLocation()).z;
/* 104 */     Direction direction = hit.getDirection();
/*     */     
/* 106 */     NukeOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 107 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\NukeBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */