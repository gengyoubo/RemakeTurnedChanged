/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.DirectionalBlock;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ 
/*    */ public class DarklatexblockharmlessBlock
/*    */   extends Block {
/* 32 */   public static final DirectionProperty FACING = DirectionalBlock.FACING;
/*    */   
/*    */   public DarklatexblockharmlessBlock() {
/* 35 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.SLIME_BLOCK).strength(0.75F, 5.0F).requiresCorrectToolForDrops()
/* 36 */         .friction(0.8F).speedFactor(0.5F).jumpFactor(0.5F));
/* 37 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 42 */     super.appendHoverText(itemstack, world, list, flag);
/* 43 */     list.add(new TextComponent("But harmless"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 48 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 53 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 58 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getNearestLookingDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 62 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 66 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/* 71 */     return 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/* 76 */     return 30;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 81 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 82 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 83 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 88 */     super.entityInside(blockstate, world, pos, entity);
/* 89 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 94 */     super.stepOn(world, pos, blockstate, entity);
/* 95 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexblockharmlessBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */