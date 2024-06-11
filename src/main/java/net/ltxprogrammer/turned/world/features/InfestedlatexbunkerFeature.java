/*    */ package net.ltxprogrammer.turned.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
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
/*    */ public class InfestedlatexbunkerFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static InfestedlatexbunkerFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new InfestedlatexbunkerFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:infestedlatexbunker", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 37 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:infestedlatexbunker", CONFIGURED_FEATURE, List.of());
/* 38 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 42 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 45 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("changed:dark_latex_plains"));
/* 46 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 48 */   private StructureTemplate template = null;
/*    */   
/*    */   public InfestedlatexbunkerFeature() {
/* 51 */     super(NoneFeatureConfiguration.f_67815_);
/* 52 */     this.base_blocks = List.of((Block)ChangedBlocks.DARK_LATEX_BLOCK.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 57 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 58 */       return false; 
/* 59 */     if (this.template == null)
/* 60 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "latex_covered_bunker")); 
/* 61 */     if (this.template == null)
/* 62 */       return false; 
/* 63 */     boolean anyPlaced = false;
/* 64 */     if (context.m_159776_().nextInt(1000000) + 1 <= 180) {
/* 65 */       int count = context.m_159776_().nextInt(1) + 1;
/* 66 */       for (int a = 0; a < count; a++) {
/* 67 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 68 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 69 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 70 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 72 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 73 */           if (this.template.m_74536_((ServerLevelAccessor)context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 74 */               .m_74377_(Mirror.values()[context.m_159776_().nextInt(2)])
/* 75 */               .m_74379_(Rotation.values()[context.m_159776_().nextInt(3)]).m_74390_(context.m_159776_())
/* 76 */               .m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 77 */               .m_159776_(), 2))
/* 78 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 82 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\InfestedlatexbunkerFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */