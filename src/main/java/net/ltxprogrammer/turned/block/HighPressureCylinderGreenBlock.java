/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.procedures.HighPressureCylinderBlockDestroyedByExplosionProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HighPressureCylinderUpdateTickProcedure;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.TooltipFlag;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.shapes.CollisionContext;
/*     */ import net.minecraft.world.phys.shapes.VoxelShape;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class HighPressureCylinderGreenBlock extends Block {
/*  45 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public HighPressureCylinderGreenBlock() {
/*  48 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(1.2F, 7.5F).m_60999_().m_60955_()
/*  49 */         .m_60924_((bs, br, bp) -> false));
/*  50 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  55 */     super.m_5871_(itemstack, world, list, flag);
/*  56 */     list.add(new TextComponent("Green"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  66 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  72 */     switch ((Direction)state.m_61143_((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  76 */       m_49796_(3.0D, 0.0D, 3.0D, 13.0D, 30.0D, 13.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  82 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  87 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  91 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  95 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 100 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 101 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 102 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 107 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 108 */     if (!dropsOriginal.isEmpty())
/* 109 */       return dropsOriginal; 
/* 110 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 115 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/* 116 */     world.m_186460_(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 121 */     super.m_7458_(blockstate, world, pos, random);
/* 122 */     int x = pos.m_123341_();
/* 123 */     int y = pos.m_123342_();
/* 124 */     int z = pos.m_123343_();
/*     */     
/* 126 */     HighPressureCylinderUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 127 */     world.m_186460_(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7592_(Level world, BlockPos pos, Explosion e) {
/* 132 */     super.m_7592_(world, pos, e);
/* 133 */     HighPressureCylinderBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 138 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.HIGH_PRESSURE_CYLINDER_GREEN.get(), renderType -> (renderType == RenderType.m_110463_()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\HighPressureCylinderGreenBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */