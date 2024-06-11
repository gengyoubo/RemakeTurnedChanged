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
/*    */ public class EmergencyeviloutpostFeature extends Feature<NoneFeatureConfiguration> {
/* 34 */   public static EmergencyeviloutpostFeature FEATURE = null;
/* 35 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 36 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 39 */     FEATURE = new EmergencyeviloutpostFeature();
/* 40 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:emergencyeviloutpost", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 41 */     PLACED_FEATURE = PlacementUtils.register("latex:emergencyeviloutpost", CONFIGURED_FEATURE, List.of());
/* 42 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 46 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 49 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("taiga"), new ResourceLocation("plains"), new ResourceLocation("swamp"));
/*    */   
/* 51 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 53 */   private StructureTemplate template = null;
/*    */   
/*    */   public EmergencyeviloutpostFeature() {
/* 56 */     super(NoneFeatureConfiguration.CODEC);
/* 57 */     this.base_blocks = List.of(Blocks.GRASS_BLOCK, Blocks.STONE, Blocks.DIRT_PATH, Blocks.DIRT, Blocks.COARSE_DIRT);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 62 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 63 */       return false; 
/* 64 */     if (this.template == null)
/* 65 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "evil_emergency_outpost")); 
/* 66 */     if (this.template == null)
/* 67 */       return false; 
/* 68 */     boolean anyPlaced = false;
/* 69 */     if (context.random().nextInt(1000000) + 1 <= 750) {
/* 70 */       int count = context.random().nextInt(1) + 1;
/* 71 */       for (int a = 0; a < count; a++) {
/* 72 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 73 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 74 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 75 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 77 */           BlockPos spawnTo = new BlockPos(i + 0, j + -3, k + 0);
/* 78 */           WorldGenLevel world = context.level();
/* 79 */           int x = spawnTo.getX();
/* 80 */           int y = spawnTo.getY();
/* 81 */           int z = spawnTo.getZ();
/* 82 */           if (CheckevilraidProcedure.execute((LevelAccessor)world))
/*    */           {
/* 84 */             if (this.template.placeInWorld((ServerLevelAccessor)context
/* 85 */                 .level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE)
/* 86 */                 .setRandom(context.random()).addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 87 */                 .random(), 2)) {
/*    */               
/* 89 */               EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 90 */               anyPlaced = true;
/*    */             }  } 
/*    */         } 
/*    */       } 
/* 94 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\EmergencyeviloutpostFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */