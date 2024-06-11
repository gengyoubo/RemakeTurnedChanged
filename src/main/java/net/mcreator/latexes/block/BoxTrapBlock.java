/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.block.entity.BoxTrapBlockEntity;
/*     */ import net.mcreator.latexes.procedures.BoxTrapOnBlockRightClickedProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.Containers;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.Entity;
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
/*     */ import net.minecraft.world.level.material.FluidState;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ 
/*     */ public class BoxTrapBlock
/*     */   extends Block implements EntityBlock {
/*  47 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public BoxTrapBlock() {
/*  50 */     super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(0.75F, 5.0F).requiresCorrectToolForDrops());
/*  51 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  56 */     super.appendHoverText(itemstack, world, list, flag);
/*  57 */     list.add(new TextComponent("Wait"));
/*  58 */     list.add(new TextComponent("It's a trap!"));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  63 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  68 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  73 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  77 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  81 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  86 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  87 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  88 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  93 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  94 */     if (!dropsOriginal.isEmpty())
/*  95 */       return dropsOriginal; 
/*  96 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 101 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 102 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 103 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 108 */     super.stepOn(world, pos, blockstate, entity);
/* 109 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 114 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 115 */     int x = pos.getX();
/* 116 */     int y = pos.getY();
/* 117 */     int z = pos.getZ();
/* 118 */     double hitX = (hit.getLocation()).x;
/* 119 */     double hitY = (hit.getLocation()).y;
/* 120 */     double hitZ = (hit.getLocation()).z;
/* 121 */     Direction direction = hit.getDirection();
/*     */     
/* 123 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 124 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
/* 129 */     BlockEntity tileEntity = worldIn.getBlockEntity(pos);
/* 130 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
/* 135 */     return (BlockEntity)new BoxTrapBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 140 */     super.triggerEvent(state, world, pos, eventID, eventParam);
/* 141 */     BlockEntity blockEntity = world.getBlockEntity(pos);
/* 142 */     return (blockEntity == null) ? false : blockEntity.triggerEvent(eventID, eventParam);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 147 */     if (state.getBlock() != newState.getBlock()) {
/* 148 */       BlockEntity blockEntity = world.getBlockEntity(pos);
/* 149 */       if (blockEntity instanceof BoxTrapBlockEntity) { BoxTrapBlockEntity be = (BoxTrapBlockEntity)blockEntity;
/* 150 */         Containers.dropContents(world, pos, (Container)be);
/* 151 */         world.updateNeighbourForOutputSignal(pos, this); }
/*     */       
/* 153 */       super.onRemove(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasAnalogOutputSignal(BlockState state) {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
/* 164 */     BlockEntity tileentity = world.getBlockEntity(pos);
/* 165 */     if (tileentity instanceof BoxTrapBlockEntity) { BoxTrapBlockEntity be = (BoxTrapBlockEntity)tileentity;
/* 166 */       return AbstractContainerMenu.getRedstoneSignalFromContainer((Container)be); }
/*     */     
/* 168 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\BoxTrapBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */