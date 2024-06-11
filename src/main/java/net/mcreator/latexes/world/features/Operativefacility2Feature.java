/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.procedures.OperativefacilityOnStructureInstanceGeneratedProcedure;
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
/* 33 */   public static Operativefacility2Feature FEATURE = null;
/* 34 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 35 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 38 */     FEATURE = new Operativefacility2Feature();
/* 39 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:operativefacility_2", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 40 */     PLACED_FEATURE = PlacementUtils.register("latex:operativefacility_2", CONFIGURED_FEATURE, List.of());
/* 41 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 45 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 48 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("plains"));
/* 49 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 51 */   private StructureTemplate template = null;
/*    */   
/*    */   public Operativefacility2Feature() {
/* 54 */     super(NoneFeatureConfiguration.CODEC);
/* 55 */     this.base_blocks = List.of(Blocks.GRASS_BLOCK, Blocks.STONE, Blocks.DIRT_PATH, Blocks.DIRT, Blocks.COARSE_DIRT);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 60 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 61 */       return false; 
/* 62 */     if (this.template == null)
/* 63 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "operative_facility_2")); 
/* 64 */     if (this.template == null)
/* 65 */       return false; 
/* 66 */     boolean anyPlaced = false;
/* 67 */     if (context.random().nextInt(1000000) + 1 <= 50) {
/* 68 */       int count = context.random().nextInt(1) + 1;
/* 69 */       for (int a = 0; a < count; a++) {
/* 70 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 71 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 72 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 73 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 75 */           BlockPos spawnTo = new BlockPos(i + 0, j + -2, k + 0);
/* 76 */           WorldGenLevel world = context.level();
/* 77 */           int x = spawnTo.getX();
/* 78 */           int y = spawnTo.getY();
/* 79 */           int z = spawnTo.getZ();
/* 80 */           if (this.template.placeInWorld((ServerLevelAccessor)context
/* 81 */               .level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE)
/* 82 */               .setRandom(context.random()).addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 83 */               .random(), 2)) {
/*    */             
/* 85 */             OperativefacilityOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 86 */             anyPlaced = true;
/*    */           } 
/*    */         } 
/*    */       } 
/* 90 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\Operativefacility2Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */