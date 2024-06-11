/*     */ package net.ltxprogrammer.turned.block;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.block.entity.CrateBlockEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.world.inventory.CrateguiMenu;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.Containers;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.LevelReader;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.EntityBlock;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SimpleWaterloggedBlock;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.BlockStateProperties;
/*     */ import net.minecraft.world.level.block.state.properties.BooleanProperty;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Fluid;
/*     */ import net.minecraft.world.level.material.FluidState;
/*     */ import net.minecraft.world.level.material.Fluids;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ 
/*     */ public class CrateBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
/*  63 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*  64 */   public static final BooleanProperty WATERLOGGED = BlockStateProperties.f_61362_;
/*     */   
/*     */   public CrateBlock() {
/*  67 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(1.5F, 12.5F).m_60999_().m_60955_()
/*  68 */         .m_60924_((bs, br, bp) -> false));
/*  69 */     m_49959_((BlockState)((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH)).m_61124_((Property)WATERLOGGED, Boolean.valueOf(false)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/*  74 */     return state.m_60819_().m_76178_();
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  79 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  85 */     switch ((Direction)state.m_61143_((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  89 */       m_49796_(2.0D, 0.0D, -8.0D, 16.0D, 5.5D, 22.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  95 */     builder.m_61104_(new Property[] { (Property)FACING, (Property)WATERLOGGED });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/* 100 */     boolean flag = (context.m_43725_().m_6425_(context.m_8083_()).m_76152_() == Fluids.f_76193_);
/* 101 */     return (BlockState)((BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_())).m_61124_((Property)WATERLOGGED, Boolean.valueOf(flag));
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 105 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 109 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public FluidState m_5888_(BlockState state) {
/* 114 */     return ((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue() ? Fluids.f_76193_.m_76068_(false) : super.m_5888_(state);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public BlockState m_7417_(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
/* 120 */     if (((Boolean)state.m_61143_((Property)WATERLOGGED)).booleanValue()) {
/* 121 */       world.m_186469_(currentPos, (Fluid)Fluids.f_76193_, Fluids.f_76193_.m_6718_((LevelReader)world));
/*     */     }
/* 123 */     return super.m_7417_(state, facing, facingState, world, currentPos, facingPos);
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/* 128 */     return BlockPathTypes.WALKABLE;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 133 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 134 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 135 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 140 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 141 */     if (!dropsOriginal.isEmpty())
/* 142 */       return dropsOriginal; 
/* 143 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 148 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 149 */     if (entity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)entity;
/* 150 */       NetworkHooks.openGui(player, new MenuProvider()
/*     */           {
/*     */             public Component m_5446_() {
/* 153 */               return (Component)new TextComponent("Crate");
/*     */             }
/*     */ 
/*     */             
/*     */             public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 158 */               return (AbstractContainerMenu)new CrateguiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
/*     */             }
/*     */           }pos); }
/*     */     
/* 162 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 167 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 168 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 173 */     return (BlockEntity)new CrateBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 178 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 179 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 180 */     return (blockEntity != null && blockEntity.m_7531_(eventID, eventParam));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 185 */     if (state.m_60734_() != newState.m_60734_()) {
/* 186 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 187 */       if (blockEntity instanceof CrateBlockEntity) { CrateBlockEntity be = (CrateBlockEntity)blockEntity;
/* 188 */         Containers.m_19002_(world, pos, (Container)be);
/* 189 */         world.m_46717_(pos, this); }
/*     */       
/* 191 */       super.m_6810_(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState state) {
/* 197 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 202 */     BlockEntity tileentity = world.m_7702_(pos);
/* 203 */     if (tileentity instanceof CrateBlockEntity) { CrateBlockEntity be = (CrateBlockEntity)tileentity;
/* 204 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*     */     
/* 206 */     return 0;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 211 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.CRATE.get(), renderType -> (renderType == RenderType.m_110463_()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\CrateBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */