/*    */ package net.ltxprogrammer.turned.world.features.treedecorators;
/*    */ import com.mojang.serialization.Codec;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ import java.util.function.BiConsumer;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
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
/* 19 */   public static final DarkLatexBiomeFruitDecorator INSTANCE = new DarkLatexBiomeFruitDecorator();
/*    */ 
/*    */ 
/*    */   
/* 23 */   public static Codec<DarkLatexBiomeFruitDecorator> codec = Codec.unit(() -> INSTANCE);
/* 24 */   public static TreeDecoratorType<?> tdt = new TreeDecoratorType(codec); static {
/* 25 */     tdt.setRegistryName("dark_latex_biome_tree_fruit_decorator");
/* 26 */     ForgeRegistries.TREE_DECORATOR_TYPES.register((IForgeRegistryEntry)tdt);
/*    */   }
/*    */   
/*    */   public DarkLatexBiomeFruitDecorator() {
/* 30 */     super(0.2F);
/*    */   }
/*    */ 
/*    */   
/*    */   protected TreeDecoratorType<?> m_6663_() {
/* 35 */     return tdt;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void m_142741_(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> blocks, List<BlockPos> blocks2) {
/* 41 */     if (random.nextFloat() < 0.2F) {
/* 42 */       int i = ((BlockPos)blocks.get(0)).m_123342_();
/* 43 */       blocks.stream().filter(p_69980_ -> (p_69980_.m_123342_() - i <= 2))
/*    */         
/* 45 */         .forEach(p_161728_ -> {
/*    */             for (Direction direction : Direction.Plane.HORIZONTAL) {
/*    */               if (random.nextFloat() <= 0.25F) {
/*    */                 Direction direction1 = direction.m_122424_();
/*    */                 BlockPos blockpos = p_161728_.m_142082_(direction1.m_122429_(), 0, direction1.m_122431_());
/*    */                 if (Feature.m_65810_(level, blockpos))
/*    */                   biConsumer.accept(blockpos, ((Block)LatexModBlocks.DARKLATEXHIVE.get()).m_49966_()); 
/*    */               } 
/*    */             } 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\treedecorators\DarkLatexBiomeFruitDecorator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */