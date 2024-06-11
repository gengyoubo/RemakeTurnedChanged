/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.item.ItemStack;
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
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ public class BigcouchBlock
/*    */   extends Block {
/* 34 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*    */   
/*    */   public BigcouchBlock() {
/* 37 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76272_).m_60918_(SoundType.f_56745_).m_60913_(1.1F, 10.0F).m_60955_()
/* 38 */         .m_60924_((bs, br, bp) -> false));
/* 39 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 44 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 49 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 55 */     switch ((Direction)state.m_61143_((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*    */ 
/*    */ 
/*    */       
/* 59 */       Shapes.m_83110_(m_49796_(-4.0D, 0.0D, 0.0D, 17.0D, 9.0D, 16.0D), m_49796_(14.0D, 7.0D, 0.0D, 17.0D, 22.0D, 16.0D));
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/* 65 */     builder.m_61104_(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState m_5573_(BlockPlaceContext context) {
/* 70 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*    */   }
/*    */   
/*    */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 74 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 78 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 83 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 84 */     if (!dropsOriginal.isEmpty())
/* 85 */       return dropsOriginal; 
/* 86 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 91 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BIGCOUCH.get(), renderType -> (renderType == RenderType.m_110463_()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BigcouchBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */