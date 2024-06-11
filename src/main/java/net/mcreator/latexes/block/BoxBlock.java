/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.block.entity.BoxBlockEntity;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.BoxBlockAddedProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.Containers;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.TooltipFlag;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.EntityBlock;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ 
/*     */ public class BoxBlock
/*     */   extends Block implements EntityBlock {
/*  43 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public BoxBlock() {
/*  46 */     super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(0.75F, 5.0F).requiresCorrectToolForDrops());
/*  47 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  52 */     super.appendHoverText(itemstack, world, list, flag);
/*  53 */     list.add(new TextComponent("Random Loot"));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  58 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  63 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  68 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  72 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  76 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  81 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  82 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  83 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  88 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  89 */     if (!dropsOriginal.isEmpty())
/*  90 */       return dropsOriginal; 
/*  91 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModBlocks.BOX_INVENTORY.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  96 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  97 */     BoxBlockAddedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
/* 102 */     BlockEntity tileEntity = worldIn.getBlockEntity(pos);
/* 103 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
/* 108 */     return (BlockEntity)new BoxBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 113 */     super.triggerEvent(state, world, pos, eventID, eventParam);
/* 114 */     BlockEntity blockEntity = world.getBlockEntity(pos);
/* 115 */     return (blockEntity == null) ? false : blockEntity.triggerEvent(eventID, eventParam);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 120 */     if (state.getBlock() != newState.getBlock()) {
/* 121 */       BlockEntity blockEntity = world.getBlockEntity(pos);
/* 122 */       if (blockEntity instanceof BoxBlockEntity) { BoxBlockEntity be = (BoxBlockEntity)blockEntity;
/* 123 */         Containers.dropContents(world, pos, (Container)be);
/* 124 */         world.updateNeighbourForOutputSignal(pos, this); }
/*     */       
/* 126 */       super.onRemove(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasAnalogOutputSignal(BlockState state) {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
/* 137 */     BlockEntity tileentity = world.getBlockEntity(pos);
/* 138 */     if (tileentity instanceof BoxBlockEntity) { BoxBlockEntity be = (BoxBlockEntity)tileentity;
/* 139 */       return AbstractContainerMenu.getRedstoneSignalFromContainer((Container)be); }
/*     */     
/* 141 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BoxBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */