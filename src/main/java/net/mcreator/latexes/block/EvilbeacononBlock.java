/*     */ package net.mcreator.latexes.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckevilraidProcedure;
/*     */ import net.mcreator.latexes.procedures.EvilBeaconUpdateTickProcedure;
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
/*  39 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public EvilbeacononBlock() {
/*  42 */     super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(2.25F, 22.5F).requiresCorrectToolForDrops());
/*  43 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  48 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  53 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  58 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  62 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  66 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  71 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  72 */       return (tieredItem.getTier().getLevel() >= 1); }
/*  73 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  78 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  79 */     if (!dropsOriginal.isEmpty())
/*  80 */       return dropsOriginal; 
/*  81 */     return Collections.singletonList(new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  86 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  87 */     world.scheduleTick(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  92 */     super.tick(blockstate, world, pos, random);
/*  93 */     int x = pos.getX();
/*  94 */     int y = pos.getY();
/*  95 */     int z = pos.getZ();
/*     */     
/*  97 */     EvilBeaconUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*  98 */     world.scheduleTick(pos, this, 10);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
/* 104 */     super.animateTick(blockstate, world, pos, random);
/* 105 */     LocalPlayer localPlayer = (Minecraft.getInstance()).player;
/* 106 */     int x = pos.getX();
/* 107 */     int y = pos.getY();
/* 108 */     int z = pos.getZ();
/* 109 */     if (CheckevilraidProcedure.execute((LevelAccessor)world))
/* 110 */       for (int l = 0; l < 3; l++) {
/* 111 */         double x0 = (x + random.nextFloat());
/* 112 */         double y0 = (y + random.nextFloat());
/* 113 */         double z0 = (z + random.nextFloat());
/* 114 */         double dx = (random.nextFloat() - 0.5D) * 0.5D;
/* 115 */         double dy = (random.nextFloat() - 0.5D) * 0.5D;
/* 116 */         double dz = (random.nextFloat() - 0.5D) * 0.5D;
/* 117 */         world.addParticle((ParticleOptions)ParticleTypes.FLAME, x0, y0, z0, dx, dy, dz);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\EvilbeacononBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */