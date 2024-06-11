/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.turned.procedures.CheckevilraidProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.WorldGenLevel;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.Heightmap;
/*    */ import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessor;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*    */ 
/*    */ public class UndergroundevillabFeature extends Feature<NoneFeatureConfiguration> {
/* 31 */   public static UndergroundevillabFeature FEATURE = null;
/* 32 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 33 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 36 */     FEATURE = new UndergroundevillabFeature();
/* 37 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:undergroundevillab", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 38 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:undergroundevillab", CONFIGURED_FEATURE, List.of());
/* 39 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 43 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 46 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[] { new ResourceLocation("mushroom_fields"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("stony_shore"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("beach"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert"), new ResourceLocation("snowy_beach") });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 53 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/* 54 */   private StructureTemplate template = null;
/*    */   
/*    */   public UndergroundevillabFeature() {
/* 57 */     super(NoneFeatureConfiguration.f_67815_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 62 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 63 */       return false; 
/* 64 */     if (this.template == null)
/* 65 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "underground_evil_lab")); 
/* 66 */     if (this.template == null)
/* 67 */       return false; 
/* 68 */     boolean anyPlaced = false;
/* 69 */     if (context.m_159776_().nextInt(1000000) + 1 <= 4375) {
/* 70 */       int count = context.m_159776_().nextInt(1) + 1;
/* 71 */       for (int a = 0; a < count; a++) {
/* 72 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 73 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 74 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
/* 75 */         j = Mth.m_14072_(context.m_159776_(), 8 + context.m_159774_().m_141937_(), Math.max(j, 9 + context.m_159774_().m_141937_()));
/* 76 */         BlockPos spawnTo = new BlockPos(i + 0, j + -8, k + 0);
/* 77 */         WorldGenLevel world = context.m_159774_();
/* 78 */         int x = spawnTo.m_123341_();
/* 79 */         int y = spawnTo.m_123342_();
/* 80 */         int z = spawnTo.m_123343_();
/* 81 */         if (CheckevilraidProcedure.execute((LevelAccessor)world))
/*    */         {
/* 83 */           if (this.template.m_74536_((ServerLevelAccessor)context
/* 84 */               .m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.NONE).m_74379_(Rotation.NONE)
/* 85 */               .m_74390_(context.m_159776_()).m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 86 */               .m_159776_(), 2))
/* 87 */             anyPlaced = true; 
/*    */         }
/*    */       } 
/*    */     } 
/* 91 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\UndergroundevillabFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */