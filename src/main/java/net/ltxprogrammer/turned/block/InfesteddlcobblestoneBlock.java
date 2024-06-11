/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import net.ltxprogrammer.turned.procedures.InfesteddlcobblestoneBlockDestroyedByPlayerProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.InfesteddlcobblestoneUpdateTickProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class InfesteddlcobblestoneBlock extends Block {
/*    */   public InfesteddlcobblestoneBlock() {
/* 29 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(1.0F, 10.0F).m_60999_());
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 34 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 39 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 40 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 41 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 46 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 47 */     if (!dropsOriginal.isEmpty())
/* 48 */       return dropsOriginal; 
/* 49 */     return Collections.singletonList(new ItemStack((ItemLike)Blocks.f_50652_));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 54 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 55 */     world.m_186460_(pos, this, 120);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 60 */     super.m_7458_(blockstate, world, pos, random);
/* 61 */     int x = pos.m_123341_();
/* 62 */     int y = pos.m_123342_();
/* 63 */     int z = pos.m_123343_();
/*    */     
/* 65 */     InfesteddlcobblestoneUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 66 */     world.m_186460_(pos, this, 120);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 71 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 72 */     InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 73 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\InfesteddlcobblestoneBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */