/*    */ package net.ltxprogrammer.turned.block;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.procedures.MakeshiftBeaconRedstoneOnProcedure;
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
/* 30 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*    */   
/*    */   public MakeshiftBeaconBlock() {
/* 33 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(1.0F, 12.0F).m_60999_());
/* 34 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 39 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/* 44 */     builder.m_61104_(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState m_5573_(BlockPlaceContext context) {
/* 49 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*    */   }
/*    */   
/*    */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 53 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 57 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 62 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 63 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 64 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 69 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 70 */     if (!dropsOriginal.isEmpty())
/* 71 */       return dropsOriginal; 
/* 72 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 77 */     super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 78 */     if (world.m_46755_(pos) > 0)
/* 79 */       MakeshiftBeaconRedstoneOnProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\MakeshiftBeaconBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */