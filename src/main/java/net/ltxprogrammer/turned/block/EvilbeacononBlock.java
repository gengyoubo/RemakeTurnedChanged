/*     */ package net.ltxprogrammer.turned.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.CheckevilraidProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.EvilBeaconUpdateTickProcedure;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.player.LocalPlayer;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
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
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class EvilbeacononBlock extends Block {
/*  39 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public EvilbeacononBlock() {
/*  42 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(2.25F, 22.5F).m_60999_());
/*  43 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  48 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  53 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  58 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  62 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  66 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  71 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  72 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/*  73 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  78 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  79 */     if (!dropsOriginal.isEmpty())
/*  80 */       return dropsOriginal; 
/*  81 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  86 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/*  87 */     world.m_186460_(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  92 */     super.m_7458_(blockstate, world, pos, random);
/*  93 */     int x = pos.m_123341_();
/*  94 */     int y = pos.m_123342_();
/*  95 */     int z = pos.m_123343_();
/*     */     
/*  97 */     EvilBeaconUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*  98 */     world.m_186460_(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void m_7100_(BlockState blockstate, Level world, BlockPos pos, Random random) {
/* 104 */     super.m_7100_(blockstate, world, pos, random);
/* 105 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/* 106 */     int x = pos.m_123341_();
/* 107 */     int y = pos.m_123342_();
/* 108 */     int z = pos.m_123343_();
/* 109 */     if (CheckevilraidProcedure.execute((LevelAccessor)world))
/* 110 */       for (int l = 0; l < 3; l++) {
/* 111 */         double x0 = (x + random.nextFloat());
/* 112 */         double y0 = (y + random.nextFloat());
/* 113 */         double z0 = (z + random.nextFloat());
/* 114 */         double dx = (random.nextFloat() - 0.5D) * 0.5D;
/* 115 */         double dy = (random.nextFloat() - 0.5D) * 0.5D;
/* 116 */         double dz = (random.nextFloat() - 0.5D) * 0.5D;
/* 117 */         world.m_7106_((ParticleOptions)ParticleTypes.f_123744_, x0, y0, z0, dx, dy, dz);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\EvilbeacononBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */