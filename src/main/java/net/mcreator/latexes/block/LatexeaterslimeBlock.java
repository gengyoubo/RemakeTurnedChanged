/*     */ package net.mcreator.latexes.block;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.procedures.LatexeaterslimeEntityWalksOnTheBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.LatexeaterslimeUpdateTickProcedure;
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
/*     */ public class LatexeaterslimeBlock extends Block {
/*     */   public LatexeaterslimeBlock() {
/*  38 */     super(BlockBehaviour.Properties.of(Material.SPONGE, MaterialColor.COLOR_LIGHT_GREEN).sound(SoundType.SLIME_BLOCK).strength(0.5F, 5.0F)
/*  39 */         .requiresCorrectToolForDrops().friction(0.5F).speedFactor(0.6F).jumpFactor(0.9F));
/*     */   }
/*     */ 
/*     */   
/*     */   public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/*  44 */     super.appendHoverText(itemstack, world, list, flag);
/*  45 */     list.add(new TextComponent("it destroys dark latex blocks."));
/*     */   }
/*     */ 
/*     */   
/*     */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/*  50 */     return 15;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/*  55 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/*  56 */       return (tieredItem.getTier().getLevel() >= 0); }
/*  57 */      return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/*  62 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/*  63 */     if (!dropsOriginal.isEmpty())
/*  64 */       return dropsOriginal; 
/*  65 */     return Collections.singletonList(new ItemStack((ItemLike)Items.SLIME_BALL, 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/*  70 */     super.onPlace(blockstate, world, pos, oldState, moving);
/*  71 */     world.scheduleTick(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/*  76 */     super.tick(blockstate, world, pos, random);
/*  77 */     int x = pos.getX();
/*  78 */     int y = pos.getY();
/*  79 */     int z = pos.getZ();
/*     */     
/*  81 */     LatexeaterslimeUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/*  82 */     world.scheduleTick(pos, this, 25);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
/*  88 */     super.animateTick(blockstate, world, pos, random);
/*  89 */     LocalPlayer localPlayer = (Minecraft.getInstance()).player;
/*  90 */     int x = pos.getX();
/*  91 */     int y = pos.getY();
/*  92 */     int z = pos.getZ();
/*  93 */     for (int l = 0; l < 3; l++) {
/*  94 */       double x0 = (x + random.nextFloat());
/*  95 */       double y0 = (y + random.nextFloat());
/*  96 */       double z0 = (z + random.nextFloat());
/*  97 */       double dx = (random.nextFloat() - 0.5D) * 0.5D;
/*  98 */       double dy = (random.nextFloat() - 0.5D) * 0.5D;
/*  99 */       double dz = (random.nextFloat() - 0.5D) * 0.5D;
/* 100 */       world.addParticle((ParticleOptions)ParticleTypes.ITEM_SLIME, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 106 */     super.entityInside(blockstate, world, pos, entity);
/* 107 */     LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
/* 112 */     super.stepOn(world, pos, blockstate, entity);
/* 113 */     LatexeaterslimeEntityWalksOnTheBlockProcedure.execute(entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\LatexeaterslimeBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */