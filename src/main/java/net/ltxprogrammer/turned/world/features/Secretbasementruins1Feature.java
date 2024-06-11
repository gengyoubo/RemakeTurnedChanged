/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.turned.procedures.Villagerbunker1OnStructureInstanceGeneratedProcedure;
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
/*    */ public class Secretbasementruins1Feature extends Feature<NoneFeatureConfiguration> {
/* 32 */   public static Secretbasementruins1Feature FEATURE = null;
/* 33 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 34 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 37 */     FEATURE = new Secretbasementruins1Feature();
/* 38 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:secretbasementruins_1", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 39 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:secretbasementruins_1", CONFIGURED_FEATURE, List.of());
/* 40 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 44 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 47 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("swamp"));
/*    */   
/* 49 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 51 */   private StructureTemplate template = null;
/*    */   
/*    */   public Secretbasementruins1Feature() {
/* 54 */     super(NoneFeatureConfiguration.f_67815_);
/* 55 */     this.base_blocks = List.of(Blocks.f_50069_, Blocks.f_50440_, Blocks.f_152481_, Blocks.f_50493_, Blocks.f_50546_, Blocks.f_49992_, Blocks.f_49993_);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 60 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 61 */       return false; 
/* 62 */     if (this.template == null)
/* 63 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "secret_basement_ruins")); 
/* 64 */     if (this.template == null)
/* 65 */       return false; 
/* 66 */     boolean anyPlaced = false;
/* 67 */     if (context.m_159776_().nextInt(1000000) + 1 <= 375) {
/* 68 */       int count = context.m_159776_().nextInt(1) + 1;
/* 69 */       for (int a = 0; a < count; a++) {
/* 70 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 71 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 72 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 73 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 75 */           BlockPos spawnTo = new BlockPos(i + 0, j + -7, k + 0);
/* 76 */           WorldGenLevel world = context.m_159774_();
/* 77 */           int x = spawnTo.m_123341_();
/* 78 */           int y = spawnTo.m_123342_();
/* 79 */           int z = spawnTo.m_123343_();
/* 80 */           if (this.template.m_74536_((ServerLevelAccessor)context
/* 81 */               .m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings()).m_74377_(Mirror.NONE).m_74379_(Rotation.NONE)
/* 82 */               .m_74390_(context.m_159776_()).m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 83 */               .m_159776_(), 2)) {
/*    */             
/* 85 */             Villagerbunker1OnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 86 */             anyPlaced = true;
/*    */           } 
/*    */         } 
/*    */       } 
/* 90 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\Secretbasementruins1Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */