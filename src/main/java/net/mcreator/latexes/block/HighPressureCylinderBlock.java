/*     */ package net.mcreator.latexes.block;
/*     */ 
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.procedures.HighPressureCylinderBlockDestroyedByExplosionProcedure;
/*     */ import net.mcreator.latexes.procedures.HighPressureCylinderUpdateTickProcedure;
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
/*     */ public class HighPressureCylinderBlock extends Block {
/*  45 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public HighPressureCylinderBlock() {
/*  48 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.2F, 7.5F).requiresCorrectToolForDrops().noOcclusion()
/*  49 */         .isRedstoneConductor((bs, br, bp) -> false));
/*  50 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  55 */     super.appendHoverText(itemstack, world, list, flag);
/*  56 */     list.add(new TextComponent("Blue"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/*  61 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  66 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/*  72 */     switch ((Direction)state.getValue((Property)FACING)) { default: case NORTH: case EAST: case WEST: break; }  return 
/*     */ 
/*     */ 
/*     */       
/*  76 */       box(3.0D, 0.0D, 3.0D, 13.0D, 30.0D, 13.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  82 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  87 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  91 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  95 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 100 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 101 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 102 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 107 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 108 */     if (!dropsOriginal.isEmpty())
/* 109 */       return dropsOriginal; 
/* 110 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 115 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 116 */     world.scheduleTick(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 121 */     super.tick(blockstate, world, pos, random);
/* 122 */     int x = pos.getX();
/* 123 */     int y = pos.getY();
/* 124 */     int z = pos.getZ();
/*     */     
/* 126 */     HighPressureCylinderUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 127 */     world.scheduleTick(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void wasExploded(Level world, BlockPos pos, Explosion e) {
/* 132 */     super.wasExploded(world, pos, e);
/* 133 */     HighPressureCylinderBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public static void registerRenderLayer() {
/* 138 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.HIGH_PRESSURE_CYLINDER.get(), renderType -> (renderType == RenderType.cutout()));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\HighPressureCylinderBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */