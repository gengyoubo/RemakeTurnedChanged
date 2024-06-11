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
/*    */ public class MakeshiftbeaconpodiumFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static MakeshiftbeaconpodiumFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new MakeshiftbeaconpodiumFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.m_206488_("turned:makeshiftbeaconpodium", FEATURE, (FeatureConfiguration)FeatureConfiguration.f_67737_);
/* 37 */     PLACED_FEATURE = PlacementUtils.m_206509_("turned:makeshiftbeaconpodium", CONFIGURED_FEATURE, List.of());
/* 38 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 42 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 45 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[] { new ResourceLocation("mushroom_fields"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("jungle") });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 51 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.f_46428_);
/*    */   private final List<Block> base_blocks;
/* 53 */   private StructureTemplate template = null;
/*    */   
/*    */   public MakeshiftbeaconpodiumFeature() {
/* 56 */     super(NoneFeatureConfiguration.f_67815_);
/* 57 */     this.base_blocks = List.of(Blocks.f_50069_, Blocks.f_50122_, Blocks.f_50228_, Blocks.f_50334_, Blocks.f_50440_, Blocks.f_152481_, Blocks.f_50195_, Blocks.f_50493_, Blocks.f_50546_, Blocks.f_50599_);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean m_142674_(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 63 */     if (!this.generate_dimensions.contains(context.m_159774_().m_6018_().m_46472_()))
/* 64 */       return false; 
/* 65 */     if (this.template == null)
/* 66 */       this.template = context.m_159774_().m_6018_().m_8875_().m_74341_(new ResourceLocation("turned", "makeshift_beacon_podium")); 
/* 67 */     if (this.template == null)
/* 68 */       return false; 
/* 69 */     boolean anyPlaced = false;
/* 70 */     if (context.m_159776_().nextInt(1000000) + 1 <= 250) {
/* 71 */       int count = context.m_159776_().nextInt(1) + 1;
/* 72 */       for (int a = 0; a < count; a++) {
/* 73 */         int i = context.m_159777_().m_123341_() + context.m_159776_().nextInt(16);
/* 74 */         int k = context.m_159777_().m_123343_() + context.m_159776_().nextInt(16);
/* 75 */         int j = context.m_159774_().m_6924_(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 76 */         if (this.base_blocks.contains(context.m_159774_().m_8055_(new BlockPos(i, j, k)).m_60734_())) {
/*    */           
/* 78 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 79 */           if (this.template.m_74536_((ServerLevelAccessor)context.m_159774_(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 80 */               .m_74377_(Mirror.values()[context.m_159776_().nextInt(2)])
/* 81 */               .m_74379_(Rotation.values()[context.m_159776_().nextInt(3)]).m_74390_(context.m_159776_())
/* 82 */               .m_74383_((StructureProcessor)BlockIgnoreProcessor.f_74046_).m_74392_(false), context
/* 83 */               .m_159776_(), 2))
/* 84 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 88 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\world\features\MakeshiftbeaconpodiumFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */