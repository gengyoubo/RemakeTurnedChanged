/*    */ package net.mcreator.latexes.world.features.treedecorators;
/*    */ 
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiConsumer;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.level.LevelSimulatedReader;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
/*    */ import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.IForgeRegistryEntry;
/*    */ 
/*    */ public class DarkLatexBiomeFruitDecorator extends CocoaDecorator {
/* 20 */   public static final DarkLatexBiomeFruitDecorator INSTANCE = new DarkLatexBiomeFruitDecorator();
/*    */ 
/*    */ 
/*    */   
/* 24 */   public static Codec<DarkLatexBiomeFruitDecorator> codec = Codec.unit(() -> INSTANCE);
/* 25 */   public static TreeDecoratorType<?> tdt = new TreeDecoratorType(codec); static {
/* 26 */     tdt.setRegistryName("dark_latex_biome_tree_fruit_decorator");
/* 27 */     ForgeRegistries.TREE_DECORATOR_TYPES.register((IForgeRegistryEntry)tdt);
/*    */   }
/*    */   
/*    */   public DarkLatexBiomeFruitDecorator() {
/* 31 */     super(0.2F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TreeDecoratorType<?> type() {
/* 36 */     return tdt;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> blocks, List<BlockPos> blocks2) {
/* 42 */     if (random.nextFloat() < 0.2F) {
/* 43 */       int i = ((BlockPos)blocks.get(0)).getY();
/* 44 */       blocks.stream().filter(p_69980_ -> (p_69980_.getY() - i <= 2))
/*    */         
/* 46 */         .forEach(p_161728_ -> {
/*    */             for (Direction direction : Direction.Plane.HORIZONTAL) {
/*    */               if (random.nextFloat() <= 0.25F) {
/*    */                 Direction direction1 = direction.getOpposite();
/*    */                 BlockPos blockpos = p_161728_.offset(direction1.getStepX(), 0, direction1.getStepZ());
/*    */                 if (Feature.isAir(level, blockpos))
/*    */                   biConsumer.accept(blockpos, ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState()); 
/*    */               } 
/*    */             } 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\treedecorators\DarkLatexBiomeFruitDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */