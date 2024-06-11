/*     */ package net.mcreator.latexes.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.EvilBeaconOffUpdateTickProcedure;
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
/*  38 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public EvilBeaconBlock() {
/*  41 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(2.0F, 20.0F).requiresCorrectToolForDrops());
/*  42 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  47 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  52 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  57 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  61 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  65 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  70 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  71 */       return (tieredItem.getTier().getLevel() >= 1); }
/*  72 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  77 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  78 */     if (!dropsOriginal.isEmpty())
/*  79 */       return dropsOriginal; 
/*  80 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  85 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  86 */     world.scheduleTick(pos, this, 10);
/*  87 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/*  92 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/*  93 */     if (world.getBestNeighborSignal(pos) > 0) {
/*  94 */       EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 100 */     super.tick(blockstate, world, pos, random);
/* 101 */     int x = pos.getX();
/* 102 */     int y = pos.getY();
/* 103 */     int z = pos.getZ();
/*     */     
/* 105 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 106 */     world.scheduleTick(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   public void attack(BlockState blockstate, Level world, BlockPos pos, Player entity) {
/* 111 */     super.attack(blockstate, world, pos, entity);
/* 112 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 117 */     super.stepOn(world, pos, blockstate, entity);
/* 118 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
/* 123 */     super.setPlacedBy(world, pos, blockstate, entity, itemstack);
/* 124 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
/* 129 */     super.use(blockstate, world, pos, entity, hand, hit);
/* 130 */     int x = pos.getX();
/* 131 */     int y = pos.getY();
/* 132 */     int z = pos.getZ();
/* 133 */     double hitX = (hit.getLocation()).x;
/* 134 */     double hitY = (hit.getLocation()).y;
/* 135 */     double hitZ = (hit.getLocation()).z;
/* 136 */     Direction direction = hit.getDirection();
/*     */     
/* 138 */     EvilBeaconOffUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 139 */     return InteractionResult.SUCCESS;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\EvilBeaconBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */