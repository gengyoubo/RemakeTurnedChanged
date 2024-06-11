/*     */ package net.ltxprogrammer.turned.block;
/*     */ 
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import net.ltxprogrammer.turned.block.entity.MetalBoxBlockEntity;
/*     */ import net.ltxprogrammer.turned.world.inventory.BoxguiMenu;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.Containers;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.MenuProvider;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.TieredItem;
/*     */ import net.minecraft.world.item.context.BlockPlaceContext;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.EntityBlock;
/*     */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.block.SoundType;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.StateDefinition;
/*     */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraft.world.level.storage.loot.LootContext;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ 
/*     */ 
/*     */ public class MetalBoxBlock
/*     */   extends Block
/*     */   implements EntityBlock
/*     */ {
/*  51 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.f_54117_;
/*     */   
/*     */   public MetalBoxBlock() {
/*  54 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76279_).m_60918_(SoundType.f_56743_).m_60913_(2.5F, 15.0F).m_60999_());
/*  55 */     m_49959_((BlockState)((BlockState)this.f_49792_.m_61090_()).m_61124_((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  60 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7926_(StateDefinition.Builder<Block, BlockState> builder) {
/*  65 */     builder.m_61104_(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState m_5573_(BlockPlaceContext context) {
/*  70 */     return (BlockState)m_49966_().m_61124_((Property)FACING, (Comparable)context.m_8125_().m_122424_());
/*     */   }
/*     */   
/*     */   public BlockState m_6843_(BlockState state, Rotation rot) {
/*  74 */     return (BlockState)state.m_61124_((Property)FACING, (Comparable)rot.m_55954_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState m_6943_(BlockState state, Mirror mirrorIn) {
/*  78 */     return state.m_60717_(mirrorIn.m_54846_((Direction)state.m_61143_((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  83 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  84 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/*  85 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/*  90 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/*  91 */     if (!dropsOriginal.isEmpty())
/*  92 */       return dropsOriginal; 
/*  93 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6227_(BlockState blockstate, Level world, final BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/*  98 */     super.m_6227_(blockstate, world, pos, entity, hand, hit);
/*  99 */     if (entity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)entity;
/* 100 */       NetworkHooks.openGui(player, new MenuProvider()
/*     */           {
/*     */             public Component m_5446_() {
/* 103 */               return (Component)new TextComponent("Metal Box");
/*     */             }
/*     */ 
/*     */             
/*     */             public AbstractContainerMenu m_7208_(int id, Inventory inventory, Player player) {
/* 108 */               return (AbstractContainerMenu)new BoxguiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).m_130064_(pos));
/*     */             }
/*     */           }pos); }
/*     */     
/* 112 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ 
/*     */   
/*     */   public MenuProvider m_7246_(BlockState state, Level worldIn, BlockPos pos) {
/* 117 */     BlockEntity tileEntity = worldIn.m_7702_(pos);
/* 118 */     MenuProvider menuProvider = (MenuProvider)tileEntity; return (tileEntity instanceof MenuProvider) ? menuProvider : null;
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockEntity m_142194_(BlockPos pos, BlockState state) {
/* 123 */     return (BlockEntity)new MetalBoxBlockEntity(pos, state);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8133_(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 128 */     super.m_8133_(state, world, pos, eventID, eventParam);
/* 129 */     BlockEntity blockEntity = world.m_7702_(pos);
/* 130 */     return (blockEntity != null && blockEntity.m_7531_(eventID, eventParam));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6810_(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 135 */     if (state.m_60734_() != newState.m_60734_()) {
/* 136 */       BlockEntity blockEntity = world.m_7702_(pos);
/* 137 */       if (blockEntity instanceof MetalBoxBlockEntity) { MetalBoxBlockEntity be = (MetalBoxBlockEntity)blockEntity;
/* 138 */         Containers.m_19002_(world, pos, (Container)be);
/* 139 */         world.m_46717_(pos, this); }
/*     */       
/* 141 */       super.m_6810_(state, world, pos, newState, isMoving);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_7278_(BlockState state) {
/* 147 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int m_6782_(BlockState blockState, Level world, BlockPos pos) {
/* 152 */     BlockEntity tileentity = world.m_7702_(pos);
/* 153 */     if (tileentity instanceof MetalBoxBlockEntity) { MetalBoxBlockEntity be = (MetalBoxBlockEntity)tileentity;
/* 154 */       return AbstractContainerMenu.m_38938_((Container)be); }
/*     */     
/* 156 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\MetalBoxBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */