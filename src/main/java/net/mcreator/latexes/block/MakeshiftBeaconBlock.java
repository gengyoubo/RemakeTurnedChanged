/*    */ package net.mcreator.latexes.block;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.procedures.MakeshiftBeaconRedstoneOnProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class MakeshiftBeaconBlock extends Block {
/* 30 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*    */   
/*    */   public MakeshiftBeaconBlock() {
/* 33 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.0F, 12.0F).requiresCorrectToolForDrops());
/* 34 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 39 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 44 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 49 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 53 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 57 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 62 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 63 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 64 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 69 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 70 */     if (!dropsOriginal.isEmpty())
/* 71 */       return dropsOriginal; 
/* 72 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 77 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 78 */     if (world.getBestNeighborSignal(pos) > 0)
/* 79 */       MakeshiftBeaconRedstoneOnProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\MakeshiftBeaconBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */