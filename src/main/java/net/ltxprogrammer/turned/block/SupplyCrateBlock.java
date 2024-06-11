/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import net.ltxprogrammer.turned.block.entity.SupplyCrateBlockEntity;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.procedures.SupplyCrateBlockAddedProcedure;
/*     */ import net.ltxprogrammer.turned.world.inventory.SupplyCrateGuiMenu;
/*     */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*     */ import net.minecraft.client.renderer.RenderType;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.Containers;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.EntityBlock;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.pathfinder.BlockPathTypes;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ 
/*     */ 
/*     */ public class SupplyCrateBlock
/*     */   extends Block
/*     */   implements EntityBlock
/*     */ {
/*     */   public SupplyCrateBlock() {
/*  48 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(2.0F, 20.0F).m_60999_().m_60955_()
/*  49 */         .m_60924_((bs, br, bp) -> false));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/*  54 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  59 */     return 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
/*  64 */     return BlockPathTypes.BLOCKED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  69 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  70 */       return (tieredItem.m_43314_().m_6604_() >= 2); }
/*  71 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6807_(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  76 */     super.m_6807_(blockstate, world, pos, oldState, moving);
/*  77 */     SupplyCrateBlockAddedProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/*  82 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/*  83 */     if (entity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)entity;
/*  84 */       NetworkHooks.openGui(player, new MenuProvider()
/*     */           {
/*     */             public Component m_5446_() {
/*  87 */               return (Component)new TextComponent("Supply Crate");
/*     */             }
/*     */ 
/*     */             
/*     */             public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/*  92 */               return (AbstractContainerMenu)new SupplyCrateGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
/*     */             }
/*     */           }pos); }
/*     */     
/*  96 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 101 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 102 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 107 */     return (BlockEntity)new SupplyCrateBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 112 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 113 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 114 */     return (blockEntity != null && blockEntity.m_7531_(eventID, eventParam));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 119 */     if (state.m_60734_() != newState.m_60734_()) {
/* 120 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 121 */       if (blockEntity instanceof SupplyCrateBlockEntity) { SupplyCrateBlockEntity be = (SupplyCrateBlockEntity)blockEntity;
/* 122 */         Containers.m_19002_(world, pos, (Container)be);
/* 123 */         world.m_46717_(pos, this); }
/*     */       
/* 125 */       super.m_6810_(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState state) {
/* 131 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 136 */     BlockEntity tileentity = world.m_7702_(pos);
/* 137 */     if (tileentity instanceof SupplyCrateBlockEntity) { SupplyCrateBlockEntity be = (SupplyCrateBlockEntity)tileentity;
/* 138 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*     */     
/* 140 */     return 0;
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 145 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.SUPPLY_CRATE.get(), renderType -> (renderType == RenderType.m_110463_()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\SupplyCrateBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */