/*    */ package net.mcreator.latexes.block;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import net.mcreator.latexes.procedures.DarklatexlogUpdateTickProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
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
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.BlockStateProperties;
/*    */ import net.minecraft.world.level.block.state.properties.EnumProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class DarklatexlogBlock extends Block {
/* 31 */   public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;
/*    */   
/*    */   public DarklatexlogBlock() {
/* 34 */     super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.SLIME_BLOCK).strength(1.0F, 8.0F).requiresCorrectToolForDrops().friction(0.45F)
/* 35 */         .speedFactor(0.7F).jumpFactor(0.9F));
/* 36 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)AXIS, (Comparable)Direction.Axis.Y));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 41 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 46 */     builder.add(new Property[] { (Property)AXIS });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 51 */     return (BlockState)defaultBlockState().setValue((Property)AXIS, (Comparable)context.getClickedFace().getAxis());
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 56 */     if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
/* 57 */       if (state.getValue((Property)AXIS) == Direction.Axis.X)
/* 58 */         return (BlockState)state.setValue((Property)AXIS, (Comparable)Direction.Axis.Z); 
/* 59 */       if (state.getValue((Property)AXIS) == Direction.Axis.Z) {
/* 60 */         return (BlockState)state.setValue((Property)AXIS, (Comparable)Direction.Axis.X);
/*    */       }
/*    */     } 
/* 63 */     return state;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 68 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 69 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 70 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 75 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 76 */     if (!dropsOriginal.isEmpty())
/* 77 */       return dropsOriginal; 
/* 78 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 83 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 84 */     world.scheduleTick(pos, this, 200);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 89 */     super.tick(blockstate, world, pos, random);
/* 90 */     int x = pos.getX();
/* 91 */     int y = pos.getY();
/* 92 */     int z = pos.getZ();
/*    */     
/* 94 */     DarklatexlogUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 95 */     world.scheduleTick(pos, this, 200);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexlogBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */