/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.procedures.CheckevilraidProcedure;
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
/* 32 */   public static UndergroundevillabFeature FEATURE = null;
/* 33 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 34 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 37 */     FEATURE = new UndergroundevillabFeature();
/* 38 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:undergroundevillab", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 39 */     PLACED_FEATURE = PlacementUtils.register("latex:undergroundevillab", CONFIGURED_FEATURE, List.of());
/* 40 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 44 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 47 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation[] { new ResourceLocation("mushroom_fields"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("stony_shore"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("beach"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert"), new ResourceLocation("snowy_beach") });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 54 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/* 55 */   private StructureTemplate template = null;
/*    */   
/*    */   public UndergroundevillabFeature() {
/* 58 */     super(NoneFeatureConfiguration.CODEC);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 63 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 64 */       return false; 
/* 65 */     if (this.template == null)
/* 66 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "underground_evil_lab")); 
/* 67 */     if (this.template == null)
/* 68 */       return false; 
/* 69 */     boolean anyPlaced = false;
/* 70 */     if (context.random().nextInt(1000000) + 1 <= 4375) {
/* 71 */       int count = context.random().nextInt(1) + 1;
/* 72 */       for (int a = 0; a < count; a++) {
/* 73 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 74 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 75 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
/* 76 */         j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));
/* 77 */         BlockPos spawnTo = new BlockPos(i + 0, j + -8, k + 0);
/* 78 */         WorldGenLevel world = context.level();
/* 79 */         int x = spawnTo.getX();
/* 80 */         int y = spawnTo.getY();
/* 81 */         int z = spawnTo.getZ();
/* 82 */         if (CheckevilraidProcedure.execute((LevelAccessor)world))
/*    */         {
/* 84 */           if (this.template.placeInWorld((ServerLevelAccessor)context
/* 85 */               .level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE)
/* 86 */               .setRandom(context.random()).addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 87 */               .random(), 2))
/* 88 */             anyPlaced = true; 
/*    */         }
/*    */       } 
/*    */     } 
/* 92 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\UndergroundevillabFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */