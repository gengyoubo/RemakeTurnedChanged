/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.block.entity.BoxBlockEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.procedures.BoxBlockAddedProcedure;
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
/*  43 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public BoxBlock() {
/*  46 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76320_).m_60918_(SoundType.f_56736_).m_60913_(0.75F, 5.0F).m_60999_());
/*  47 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  52 */     super.m_5871_(itemstack, world, list, flag);
/*  53 */     list.add(new TextComponent("Random Loot"));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  58 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  63 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  68 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  72 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  76 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  81 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  82 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/*  83 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  88 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  89 */     if (!dropsOriginal.isEmpty())
/*  90 */       return dropsOriginal; 
/*  91 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModBlocks.BOX_INVENTORY.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  96 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/*  97 */     BoxBlockAddedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 102 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 103 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 108 */     return (BlockEntity)new BoxBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 113 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 114 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 115 */     return (blockEntity != null && blockEntity.m_7531_(eventID, eventParam));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 120 */     if (state.m_60734_() != newState.m_60734_()) {
/* 121 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 122 */       if (blockEntity instanceof BoxBlockEntity) { BoxBlockEntity be = (BoxBlockEntity)blockEntity;
/* 123 */         Containers.m_19002_(world, pos, (Container)be);
/* 124 */         world.m_46717_(pos, this); }
/*     */       
/* 126 */       super.m_6810_(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState state) {
/* 132 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 137 */     BlockEntity tileentity = world.m_7702_(pos);
/* 138 */     if (tileentity instanceof BoxBlockEntity) { BoxBlockEntity be = (BoxBlockEntity)tileentity;
/* 139 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*     */     
/* 141 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BoxBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */