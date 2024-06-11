/*    */ package net.ltxprogrammer.turned.world.features.lakes;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
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
/*    */ public class DarkLatexGooFluidFeature extends LakeFeature {
/* 30 */   public static DarkLatexGooFluidFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new DarkLatexGooFluidFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:dark_latex_goo_fluid", (Feature)FEATURE, (FeatureConfiguration)new LakeFeature.Configuration(
/* 37 */           (BlockStateProvider)BlockStateProvider.m_191382_((Block)ChangedBlocks.DARK_LATEX_FLUID.get()), (BlockStateProvider)BlockStateProvider.m_191382_(Blocks.f_50016_)));
/* 38 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:dark_latex_goo_fluid", CONFIGURED_FEATURE, 
/* 39 */         List.of(RarityFilter.m_191900_(2), InSquarePlacement.m_191715_(), PlacementUtils.f_195360_, 
/* 40 */           EnvironmentScanPlacement.m_191653_(Direction.DOWN, BlockPredicate.m_190402_(BlockPredicate.f_190393_), 32), 
/* 41 */           BiomeFilter.m_191561_()));
/* 42 */     return (Feature<?>)FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 46 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 49 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("changed:dark_latex_plains"));
/* 50 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   
/*    */   public DarkLatexGooFluidFeature() {
/* 53 */     super(LakeFeature.Configuration.f_190953_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<LakeFeature.Configuration> context) {
/* 58 */     WorldGenLevel world = context.m_159774_();
/* 59 */     if (!this.generate_dimensions.contains(world.m_6018_().m_46472_()))
/* 60 */       return false; 
/* 61 */     return super.m_142674_(context);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\lakes\DarkLatexGooFluidFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */