/*     */ package net.mcreator.latexes.block;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.procedures.DarklatexhiveBlockDestroyedByExplosionProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexhiveUpdateTickProcedure;
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
/*  36 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*     */   
/*     */   public DarklatexhiveBlock() {
/*  39 */     super(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.SLIME_BLOCK).strength(0.75F, 5.0F).requiresCorrectToolForDrops()
/*  40 */         .friction(0.3F).speedFactor(0.6F).jumpFactor(0.6F).randomTicks());
/*  41 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  46 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/*  51 */     builder.add(new Property[] { (Property)FACING });
/*     */   }
/*     */ 
/*     */   
/*     */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/*  56 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*     */   }
/*     */   
/*     */   public BlockState rotate(BlockState state, Rotation rot) {
/*  60 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*     */   }
/*     */   
/*     */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/*  64 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
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
/*  79 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  80 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  81 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  86 */     super.tick(blockstate, world, pos, random);
/*  87 */     int x = pos.getX();
/*  88 */     int y = pos.getY();
/*  89 */     int z = pos.getZ();
/*     */     
/*  91 */     DarklatexhiveUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
/*  97 */     super.animateTick(blockstate, world, pos, random);
/*  98 */     LocalPlayer localPlayer = (Minecraft.getInstance()).player;
/*  99 */     int x = pos.getX();
/* 100 */     int y = pos.getY();
/* 101 */     int z = pos.getZ();
/* 102 */     for (int l = 0; l < 2; l++) {
/* 103 */       double x0 = (x + random.nextFloat());
/* 104 */       double y0 = (y + random.nextFloat());
/* 105 */       double z0 = (z + random.nextFloat());
/* 106 */       double dx = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 107 */       double dy = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 108 */       double dz = (random.nextFloat() - 0.5D) * 0.5000000014901161D;
/* 109 */       world.addParticle((ParticleOptions)ParticleTypes.FALLING_NECTAR, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 115 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 116 */     DarklatexhiveBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 117 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void wasExploded(Level world, BlockPos pos, Explosion e) {
/* 122 */     super.wasExploded(world, pos, e);
/* 123 */     DarklatexhiveBlockDestroyedByExplosionProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarklatexhiveBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */