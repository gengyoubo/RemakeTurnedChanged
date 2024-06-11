/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.block.entity.BoxTrapBlockEntity;
/*     */ import net.ltxprogrammer.turned.procedures.BoxTrapOnBlockRightClickedProcedure;
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
/*  47 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public BoxTrapBlock() {
/*  50 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(0.75F, 5.0F).m_60999_());
/*  51 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  56 */     super.m_5871_(itemstack, world, list, flag);
/*  57 */     list.add(new TextComponent("Wait"));
/*  58 */     list.add(new TextComponent("It's a trap!"));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  63 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  68 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  73 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  77 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  81 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  86 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  87 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/*  88 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  93 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  94 */     if (!dropsOriginal.isEmpty())
/*  95 */       return dropsOriginal; 
/*  96 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 101 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 102 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 103 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_141947_(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 108 */     super.m_141947_(world, pos, blockstate, entity);
/* 109 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 114 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 115 */     int x = pos.m_123341_();
/* 116 */     int y = pos.m_123342_();
/* 117 */     int z = pos.m_123343_();
/* 118 */     double hitX = (hit.m_82450_()).f_82479_;
/* 119 */     double hitY = (hit.m_82450_()).f_82480_;
/* 120 */     double hitZ = (hit.m_82450_()).f_82481_;
/* 121 */     Direction direction = hit.m_82434_();
/*     */     
/* 123 */     BoxTrapOnBlockRightClickedProcedure.execute((LevelAccessor)world, x, y, z);
/* 124 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 129 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 130 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 135 */     return (BlockEntity)new BoxTrapBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 140 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 141 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 142 */     return (blockEntity != null && blockEntity.m_7531_(eventID, eventParam));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 147 */     if (state.m_60734_() != newState.m_60734_()) {
/* 148 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 149 */       if (blockEntity instanceof BoxTrapBlockEntity) { BoxTrapBlockEntity be = (BoxTrapBlockEntity)blockEntity;
/* 150 */         Containers.m_19002_(world, pos, (Container)be);
/* 151 */         world.m_46717_(pos, this); }
/*     */       
/* 153 */       super.m_6810_(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState state) {
/* 159 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 164 */     BlockEntity tileentity = world.m_7702_(pos);
/* 165 */     if (tileentity instanceof BoxTrapBlockEntity) { BoxTrapBlockEntity be = (BoxTrapBlockEntity)tileentity;
/* 166 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*     */     
/* 168 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BoxTrapBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */