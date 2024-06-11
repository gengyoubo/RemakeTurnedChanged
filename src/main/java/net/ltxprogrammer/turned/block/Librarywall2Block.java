/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TooltipFlag;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.LevelReader;
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
/*    */ public class Librarywall2Block extends Block {
/* 29 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*    */   
/*    */   public Librarywall2Block() {
/* 32 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(1.2F, 12.5F));
/* 33 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 38 */     super.m_5871_(itemstack, world, list, flag);
/* 39 */     list.add(new TextComponent("Variant 2"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 44 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/* 49 */     builder.m_61104_(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState m_5573_(BlockPlaceContext context) {
/* 54 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*    */   }
/*    */   
/*    */   public BlockState m_6843_(BlockState state, Rotation rot) {
/* 58 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/* 62 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
/* 67 */     return 0.1F;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 72 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 73 */     if (!dropsOriginal.isEmpty())
/* 74 */       return dropsOriginal; 
/* 75 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\Librarywall2Block.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */