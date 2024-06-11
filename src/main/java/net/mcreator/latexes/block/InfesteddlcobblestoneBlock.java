/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import net.mcreator.latexes.procedures.InfesteddlcobblestoneBlockDestroyedByPlayerProcedure;
/*    */ import net.mcreator.latexes.procedures.InfesteddlcobblestoneUpdateTickProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class InfesteddlcobblestoneBlock extends Block {
/*    */   public InfesteddlcobblestoneBlock() {
/* 29 */     super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.0F, 10.0F).requiresCorrectToolForDrops());
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 34 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 39 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 40 */       return (tieredItem.getTier().getLevel() >= 1); }
/* 41 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 46 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 47 */     if (!dropsOriginal.isEmpty())
/* 48 */       return dropsOriginal; 
/* 49 */     return Collections.singletonList(new ItemStack((ItemLike)Blocks.COBBLESTONE));
/*    */   }
/*    */ 
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 54 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 55 */     world.scheduleTick(pos, this, 120);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 60 */     super.tick(blockstate, world, pos, random);
/* 61 */     int x = pos.getX();
/* 62 */     int y = pos.getY();
/* 63 */     int z = pos.getZ();
/*    */     
/* 65 */     InfesteddlcobblestoneUpdateTickProcedure.execute((LevelAccessor)world, x, y, z);
/* 66 */     world.scheduleTick(pos, this, 120);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 71 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 72 */     InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 73 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\InfesteddlcobblestoneBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */