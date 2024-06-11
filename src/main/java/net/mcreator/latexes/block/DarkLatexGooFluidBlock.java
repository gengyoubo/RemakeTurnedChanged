/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.mcreator.latexes.init.LatexModFluids;
/*    */ import net.mcreator.latexes.procedures.DarkLatexGooFluidUpdateTickProcedure;
/*    */ import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.LiquidBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FlowingFluid;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ 
/*    */ public class DarkLatexGooFluidBlock
/*    */   extends LiquidBlock {
/*    */   public DarkLatexGooFluidBlock() {
/* 24 */     super(() -> (FlowingFluid)LatexModFluids.DARK_LATEX_GOO_FLUID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(125.0F));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
/* 31 */     return 20;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 36 */     return 12;
/*    */   }
/*    */ 
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 41 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 42 */     world.scheduleTick(pos, (Block)this, 10);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
/* 47 */     super.tick(blockstate, world, pos, random);
/* 48 */     DarkLatexGooFluidUpdateTickProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 49 */     world.scheduleTick(pos, (Block)this, 10);
/*    */   }
/*    */ 
/*    */   
/*    */   public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
/* 54 */     super.entityInside(blockstate, world, pos, entity);
/* 55 */     DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\DarkLatexGooFluidBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */