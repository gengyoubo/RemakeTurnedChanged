/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
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
/*    */ public class BreachedlabFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static BreachedlabFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new BreachedlabFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:breachedlab", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 37 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:breachedlab", CONFIGURED_FEATURE, List.of());
/* 38 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 42 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 45 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("desert"));
/*    */   
/* 47 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 49 */   private StructureTemplate template = null;
/*    */   
/*    */   public BreachedlabFeature() {
/* 52 */     super(NoneFeatureConfiguration.f_67815_);
/* 53 */     this.base_blocks = List.of(Blocks.f_50122_, Blocks.f_50228_, Blocks.f_50281_, Blocks.f_50387_, Blocks.f_50440_, Blocks.f_152481_, Blocks.f_50195_, Blocks.f_50493_, Blocks.f_50546_);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 59 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 60 */       return false; 
/* 61 */     if (this.template == null)
/* 62 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "breached_lab")); 
/* 63 */     if (this.template == null)
/* 64 */       return false; 
/* 65 */     boolean anyPlaced = false;
/* 66 */     if (context.m_159776_().nextInt(1000000) + 1 <= 800) {
/* 67 */       int count = context.m_159776_().nextInt(1) + 1;
/* 68 */       for (int a = 0; a < count; a++) {
/* 69 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 70 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 71 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 72 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 74 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 75 */           if (this.template.m_74536_((ServerLevelAccessor)context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 76 */               .m_74377_(Mirror.values()[context.m_159776_().nextInt(2)])
/* 77 */               .m_74379_(Rotation.values()[context.m_159776_().nextInt(3)]).m_74390_(context.m_159776_())
/* 78 */               .m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 79 */               .m_159776_(), 2))
/* 80 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 84 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\BreachedlabFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */