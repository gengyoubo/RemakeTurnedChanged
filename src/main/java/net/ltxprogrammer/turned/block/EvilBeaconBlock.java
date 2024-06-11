/*     */ package net.ltxprogrammer.turned.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.EvilBeaconOffUpdateTickProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
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
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ 
/*     */ public class EvilBeaconBlock extends Block {
/*  38 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public EvilBeaconBlock() {
/*  41 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(2.0F, 20.0F).m_60999_());
/*  42 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  47 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  52 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  57 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  61 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  65 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  70 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  71 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/*  72 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  77 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  78 */     if (!dropsOriginal.isEmpty())
/*  79 */       return dropsOriginal; 
/*  80 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  85 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/*  86 */     world.m_186460_(pos, this, 10);
/*  87 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/*  92 */     super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
/*  93 */     if (world.m_46755_(pos) > 0) {
/*  94 */       EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 100 */     super.m_7458_(blockstate, world, pos, random);
/* 101 */     int x = pos.m_123341_();
/* 102 */     int y = pos.m_123342_();
/* 103 */     int z = pos.m_123343_();
/*     */     
/* 105 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 106 */     world.m_186460_(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6256_(BlockState blockstate, Level world, BlockPos pos, Player entity) {
/* 111 */     super.m_6256_(blockstate, world, pos, entity);
/* 112 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_141947_(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 117 */     super.m_141947_(world, pos, blockstate, entity);
/* 118 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6402_(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
/* 123 */     super.m_6402_(world, pos, blockstate, entity, itemstack);
/* 124 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 129 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/* 130 */     int x = pos.m_123341_();
/* 131 */     int y = pos.m_123342_();
/* 132 */     int z = pos.m_123343_();
/* 133 */     double hitX = (hit.m_82450_()).f_82479_;
/* 134 */     double hitY = (hit.m_82450_()).f_82480_;
/* 135 */     double hitZ = (hit.m_82450_()).f_82481_;
/* 136 */     Direction direction = hit.m_82434_();
/*     */     
/* 138 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 139 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\EvilBeaconBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */