/*    */ package net.mcreator.latexes.world.features.lakes;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.WorldGenLevel;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
/*    */ import net.minecraft.world.level.levelgen.feature.LakeFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
/*    */ import net.minecraft.world.level.levelgen.placement.BiomeFilter;
/*    */ import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*    */ import net.minecraft.world.level.levelgen.placement.RarityFilter;
/*    */ 
/*    */ public class DarkLatexGooFluidFeature
/*    */   extends LakeFeature {
/* 31 */   public static DarkLatexGooFluidFeature FEATURE = null;
/* 32 */   public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
/* 33 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 36 */     FEATURE = new DarkLatexGooFluidFeature();
/* 37 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:dark_latex_goo_fluid", (Feature)FEATURE, (FeatureConfiguration)new LakeFeature.Configuration(
/* 38 */           (BlockStateProvider)BlockStateProvider.simple((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()), (BlockStateProvider)BlockStateProvider.simple(Blocks.AIR)));
/* 39 */     PLACED_FEATURE = PlacementUtils.register("latex:dark_latex_goo_fluid", CONFIGURED_FEATURE, 
/* 40 */         List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, 
/* 41 */           EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.not(BlockPredicate.ONLY_IN_AIR_PREDICATE), 32), 
/* 42 */           BiomeFilter.biome()));
/* 43 */     return (Feature<?>)FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 47 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 50 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("latex:dark_latex_biome"));
/* 51 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   
/*    */   public DarkLatexGooFluidFeature() {
/* 54 */     super(LakeFeature.Configuration.CODEC);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
/* 59 */     WorldGenLevel world = context.level();
/* 60 */     if (!this.generate_dimensions.contains(world.getLevel().dimension()))
/* 61 */       return false; 
/* 62 */     return super.place(context);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\lakes\DarkLatexGooFluidFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */