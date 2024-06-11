/*     */ package net.ltxprogrammer.turned.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.changed.block.NonLatexCoverableBlock;
/*     */ import net.ltxprogrammer.turned.procedures.LatexeaterslimeEntityWalksOnTheBlockProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.LatexeaterslimeUpdateTickProcedure;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.player.LocalPlayer;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.TooltipFlag;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.material.MaterialColor;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ 
/*     */ public class LatexeaterslimeBlock extends Block implements NonLatexCoverableBlock {
/*     */   public LatexeaterslimeBlock() {
/*  39 */     super(BlockBehaviour.Properties.m_60944_(Material.f_76318_, MaterialColor.f_76417_).m_60918_(SoundType.f_56750_).m_60913_(0.5F, 5.0F)
/*  40 */         .m_60999_().m_60911_(0.5F).m_60956_(0.6F).m_60967_(0.9F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  45 */     super.m_5871_(itemstack, world, list, flag);
/*  46 */     list.add(new TextComponent("it destroys dark latex blocks."));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  51 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  56 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  57 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/*  58 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  63 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  64 */     if (!dropsOriginal.isEmpty())
/*  65 */       return dropsOriginal; 
/*  66 */     return Collections.singletonList(new ItemStack((ItemLike)Items.f_42518_, 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  71 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/*  72 */     world.m_186460_(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7458_(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  77 */     super.m_7458_(blockstate, world, pos, random);
/*  78 */     int x = pos.m_123341_();
/*  79 */     int y = pos.m_123342_();
/*  80 */     int z = pos.m_123343_();
/*     */     
/*  82 */     LatexeaterslimeUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*  83 */     world.m_186460_(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void m_7100_(BlockState blockstate, Level world, BlockPos pos, Random random) {
/*  89 */     super.m_7100_(blockstate, world, pos, random);
/*  90 */     LocalPlayer localPlayer = (Minecraft.m_91087_()).f_91074_;
/*  91 */     int x = pos.m_123341_();
/*  92 */     int y = pos.m_123342_();
/*  93 */     int z = pos.m_123343_();
/*  94 */     for (int l = 0; l < 3; l++) {
/*  95 */       double x0 = (x + random.nextFloat());
/*  96 */       double y0 = (y + random.nextFloat());
/*  97 */       double z0 = (z + random.nextFloat());
/*  98 */       double dx = (random.nextFloat() - 0.5D) * 0.5D;
/*  99 */       double dy = (random.nextFloat() - 0.5D) * 0.5D;
/* 100 */       double dz = (random.nextFloat() - 0.5D) * 0.5D;
/* 101 */       world.m_7106_((ParticleOptions)ParticleTypes.f_123753_, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7892_(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 107 */     super.m_7892_(blockstate, world, pos, entity);
/* 108 */     LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_141947_(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 113 */     super.m_141947_(world, pos, blockstate, entity);
/* 114 */     LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\LatexeaterslimeBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */