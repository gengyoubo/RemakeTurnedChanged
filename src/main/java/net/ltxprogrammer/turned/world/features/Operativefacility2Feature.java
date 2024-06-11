/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.turned.procedures.OperativefacilityOnStructureInstanceGeneratedProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.WorldGenLevel;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
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
/*    */ public class Operativefacility2Feature extends Feature<NoneFeatureConfiguration> {
/* 32 */   public static Operativefacility2Feature FEATURE = null;
/* 33 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 34 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 37 */     FEATURE = new Operativefacility2Feature();
/* 38 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:operativefacility_2", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 39 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:operativefacility_2", CONFIGURED_FEATURE, List.of());
/* 40 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 44 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 47 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("plains"));
/* 48 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 50 */   private StructureTemplate template = null;
/*    */   
/*    */   public Operativefacility2Feature() {
/* 53 */     super(NoneFeatureConfiguration.f_67815_);
/* 54 */     this.base_blocks = List.of(Blocks.f_50440_, Blocks.f_50069_, Blocks.f_152481_, Blocks.f_50493_, Blocks.f_50546_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 59 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 60 */       return false; 
/* 61 */     if (this.template == null)
/* 62 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "operative_facility_2")); 
/* 63 */     if (this.template == null)
/* 64 */       return false; 
/* 65 */     boolean anyPlaced = false;
/* 66 */     if (context.m_159776_().nextInt(1000000) + 1 <= 50) {
/* 67 */       int count = context.m_159776_().nextInt(1) + 1;
/* 68 */       for (int a = 0; a < count; a++) {
/* 69 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 70 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 71 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 72 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 74 */           BlockPos spawnTo = new BlockPos(i + 0, j + -2, k + 0);
/* 75 */           WorldGenLevel world = context.m_159774_();
/* 76 */           int x = spawnTo.m_123341_();
/* 77 */           int y = spawnTo.m_123342_();
/* 78 */           int z = spawnTo.m_123343_();
/* 79 */           if (this.template.m_74536_((ServerLevelAccessor)context
/* 80 */               .m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.NONE).m_74379_(Rotation.NONE)
/* 81 */               .m_74390_(context.m_159776_()).m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 82 */               .m_159776_(), 2)) {
/*    */             
/* 84 */             OperativefacilityOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 85 */             anyPlaced = true;
/*    */           } 
/*    */         } 
/*    */       } 
/* 89 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\Operativefacility2Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */