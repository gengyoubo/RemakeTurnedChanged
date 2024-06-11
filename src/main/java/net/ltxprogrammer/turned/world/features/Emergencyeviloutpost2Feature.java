/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.turned.procedures.CheckevilraidProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.EmergencyeviloutpostOnStructureInstanceGeneratedProcedure;
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
/*    */ public class Emergencyeviloutpost2Feature extends Feature<NoneFeatureConfiguration> {
/* 33 */   public static Emergencyeviloutpost2Feature FEATURE = null;
/* 34 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 35 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 38 */     FEATURE = new Emergencyeviloutpost2Feature();
/* 39 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:emergencyeviloutpost_2", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 40 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:emergencyeviloutpost_2", CONFIGURED_FEATURE, List.of());
/* 41 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 45 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 48 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("taiga"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("birch_forest"), new ResourceLocation("swamp"));
/*    */ 
/*    */   
/* 51 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 53 */   private StructureTemplate template = null;
/*    */   
/*    */   public Emergencyeviloutpost2Feature() {
/* 56 */     super(NoneFeatureConfiguration.f_67815_);
/* 57 */     this.base_blocks = List.of(Blocks.f_50440_, Blocks.f_50069_, Blocks.f_152481_, Blocks.f_50493_, Blocks.f_50546_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 62 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 63 */       return false; 
/* 64 */     if (this.template == null)
/* 65 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "evil_emergency_outpost_2")); 
/* 66 */     if (this.template == null)
/* 67 */       return false; 
/* 68 */     boolean anyPlaced = false;
/* 69 */     if (context.m_159776_().nextInt(1000000) + 1 <= 575) {
/* 70 */       int count = context.m_159776_().nextInt(1) + 1;
/* 71 */       for (int a = 0; a < count; a++) {
/* 72 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 73 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 74 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 75 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 77 */           BlockPos spawnTo = new BlockPos(i + 0, j + -5, k + 0);
/* 78 */           WorldGenLevel world = context.m_159774_();
/* 79 */           int x = spawnTo.m_123341_();
/* 80 */           int y = spawnTo.m_123342_();
/* 81 */           int z = spawnTo.m_123343_();
/* 82 */           if (CheckevilraidProcedure.execute((LevelAccessor)world))
/*    */           {
/* 84 */             if (this.template.m_74536_((ServerLevelAccessor)context
/* 85 */                 .m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.NONE).m_74379_(Rotation.NONE)
/* 86 */                 .m_74390_(context.m_159776_()).m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 87 */                 .m_159776_(), 2)) {
/*    */               
/* 89 */               EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 90 */               anyPlaced = true;
/*    */             }  } 
/*    */         } 
/*    */       } 
/* 94 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\Emergencyeviloutpost2Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */