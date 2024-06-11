/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.mcreator.latexes.block.entity.ChesTrapBlockEntity;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.BoxTrapOnBlockRightClickedProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
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
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class ChesTrapBlock
/*     */   extends Block
/*     */   implements EntityBlock {
/*  55 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public ChesTrapBlock() {
/*  58 */     super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.0F, 5.0F).requiresCorrectToolForDrops().noOcclusion()
/*  59 */         .isRedstoneConductor((bs, br, bp) -> false));
/*  60 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  65 */     super.appendHoverText(itemstack, world, list, flag);
/*  66 */     list.add(new TextComponent("Wait"));
/*  67 */     list.add(new TextComponent("It's a trap!"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  72 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  77 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  83 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  87 */       box(1.0D, 0.0D, 1.0D, 15.0D, 15.0D, 15.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  93 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  98 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/* 102 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 106 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 111 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 112 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 113 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 118 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 119 */     if (!dropsOriginal.isEmpty())
/* 120 */       return dropsOriginal; 
/* 121 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 126 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 127 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 128 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 133 */     super.stepOn(world, pos, blockstate, entity);
/* 134 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 139 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 140 */     int x = pos.getX();
/* 141 */     int y = pos.getY();
/* 142 */     int z = pos.getZ();
/* 143 */     double hitX = (hit.getLocation()).x;
/* 144 */     double hitY = (hit.getLocation()).y;
/* 145 */     double hitZ = (hit.getLocation()).z;
/* 146 */     Direction direction = hit.getDirection();
/*     */     
/* 148 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 149 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
/* 154 */     BlockEntity tileEntity = worldIn.getBlockEntity(pos);
/* 155 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
/* 160 */     return (BlockEntity)new ChesTrapBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 165 */     super.triggerEvent(state, world, pos, eventID, eventParam);
/* 166 */     BlockEntity blockEntity = world.getBlockEntity(pos);
/* 167 */     return (blockEntity == null) ? false : blockEntity.triggerEvent(eventID, eventParam);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 172 */     if (state.getBlock() != newState.getBlock()) {
/* 173 */       BlockEntity blockEntity = world.getBlockEntity(pos);
/* 174 */       if (blockEntity instanceof ChesTrapBlockEntity) { ChesTrapBlockEntity be = (ChesTrapBlockEntity)blockEntity;
/* 175 */         Containers.dropContents(world, pos, (Container)be);
/* 176 */         world.updateNeighbourForOutputSignal(pos, this); }
/*     */       
/* 178 */       super.onRemove(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasAnalogOutputSignal(BlockState state) {
/* 184 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
/* 189 */     BlockEntity tileentity = world.getBlockEntity(pos);
/* 190 */     if (tileentity instanceof ChesTrapBlockEntity) { ChesTrapBlockEntity be = (ChesTrapBlockEntity)tileentity;
/* 191 */       return AbstractContainerMenu.getRedstoneSignalFromContainer((Container)be); }
/*     */     
/* 193 */     return 0;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 198 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.CHES_TRAP.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\ChesTrapBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */