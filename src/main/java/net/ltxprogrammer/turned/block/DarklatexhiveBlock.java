/*     */ package net.ltxprogrammer.turned.block;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexhiveBlockDestroyedByExplosionProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexhiveUpdateTickProcedure;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.player.LocalPlayer;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Explosion;
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
/*     */ import net.minecraft.world.level.material.FluidState;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class DarklatexhiveBlock extends Block {
/*  36 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public DarklatexhiveBlock() {
/*  39 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76314_).m_60918_(SoundType.f_56750_).m_60913_(0.75F, 5.0F).m_60999_()
/*  40 */         .m_60911_(0.3F).m_60956_(0.6F).m_60967_(0.6F).m_60977_());
/*  41 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  46 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  51 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  56 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  60 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  64 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  69 */     return 20;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/*  74 */     return 30;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  79 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  80 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/*  81 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  86 */     super.m_7458_(blockstate, world, pos, random);
/*  87 */     int x = pos.m_123341_();
/*  88 */     int y = pos.m_123342_();
/*  89 */     int z = pos.m_123343_();
/*     */     
/*  91 */     DarklatexhiveUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void m_7100_(BlockState blockstate, Level world, BlockPos pos, Random random) {
/*  97 */     super.m_7100_(blockstate, world, pos, random);
/*  98 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/*  99 */     int x = pos.m_123341_();
/* 100 */     int y = pos.m_123342_();
/* 101 */     int z = pos.m_123343_();
/* 102 */     for (int l = 0; l < 2; l++) {
/* 103 */       double x0 = (x + random.nextFloat());
/* 104 */       double y0 = (y + random.nextFloat());
/* 105 */       double z0 = (z + random.nextFloat());
/* 106 */       double dx = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 107 */       double dy = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 108 */       double dz = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 109 */       world.m_7106_((ParticleOptions)ParticleTypes.f_123782_, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 115 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 116 */     DarklatexhiveBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/* 117 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7592_(Level world, BlockPos pos, Explosion e) {
/* 122 */     super.m_7592_(world, pos, e);
/* 123 */     DarklatexhiveBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\DarklatexhiveBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */