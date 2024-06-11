/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.procedures.CheckevilraidProcedure;
/*    */ import net.mcreator.latexes.procedures.EmergencyeviloutpostOnStructureInstanceGeneratedProcedure;
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
/* 34 */   public static Emergencyeviloutpost2Feature FEATURE = null;
/* 35 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 36 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 39 */     FEATURE = new Emergencyeviloutpost2Feature();
/* 40 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:emergencyeviloutpost_2", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 41 */     PLACED_FEATURE = PlacementUtils.register("latex:emergencyeviloutpost_2", CONFIGURED_FEATURE, List.of());
/* 42 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 46 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 49 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("taiga"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("birch_forest"), new ResourceLocation("swamp"));
/*    */ 
/*    */   
/* 52 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 54 */   private StructureTemplate template = null;
/*    */   
/*    */   public Emergencyeviloutpost2Feature() {
/* 57 */     super(NoneFeatureConfiguration.CODEC);
/* 58 */     this.base_blocks = List.of(Blocks.GRASS_BLOCK, Blocks.STONE, Blocks.DIRT_PATH, Blocks.DIRT, Blocks.COARSE_DIRT);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 63 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 64 */       return false; 
/* 65 */     if (this.template == null)
/* 66 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "evil_emergency_outpost_2")); 
/* 67 */     if (this.template == null)
/* 68 */       return false; 
/* 69 */     boolean anyPlaced = false;
/* 70 */     if (context.random().nextInt(1000000) + 1 <= 575) {
/* 71 */       int count = context.random().nextInt(1) + 1;
/* 72 */       for (int a = 0; a < count; a++) {
/* 73 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 74 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 75 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 76 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 78 */           BlockPos spawnTo = new BlockPos(i + 0, j + -5, k + 0);
/* 79 */           WorldGenLevel world = context.level();
/* 80 */           int x = spawnTo.getX();
/* 81 */           int y = spawnTo.getY();
/* 82 */           int z = spawnTo.getZ();
/* 83 */           if (CheckevilraidProcedure.execute((LevelAccessor)world))
/*    */           {
/* 85 */             if (this.template.placeInWorld((ServerLevelAccessor)context
/* 86 */                 .level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE)
/* 87 */                 .setRandom(context.random()).addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 88 */                 .random(), 2)) {
/*    */               
/* 90 */               EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 91 */               anyPlaced = true;
/*    */             }  } 
/*    */         } 
/*    */       } 
/* 95 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\Emergencyeviloutpost2Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */