/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
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
/*    */ import net.minecraft.world.level.material.MaterialColor;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.common.IPlantable;
/*    */ 
/*    */ public class PlanterBlock extends Block {
/* 35 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*    */   
/*    */   public PlanterBlock() {
/* 38 */     super(BlockBehaviour.Properties.m_60944_(Material.f_76314_, MaterialColor.f_76399_).m_60918_(SoundType.f_56736_).m_60913_(0.75F, 6.5F)
/* 39 */         .m_60999_().m_60955_().m_60924_((bs, br, bp) -> false));
/* 40 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 45 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 50 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/* 55 */     builder.m_61104_(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState m_5573_(BlockPlaceContext context) {
/* 60 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*    */   }
/*    */   
/*    */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 64 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 68 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
/* 73 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 78 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 79 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/* 80 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 85 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 86 */     if (!dropsOriginal.isEmpty())
/* 87 */       return dropsOriginal; 
/* 88 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 93 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.PLANTER.get(), renderType -> (renderType == RenderType.m_110463_()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\PlanterBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */