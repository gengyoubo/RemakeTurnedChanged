/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.procedures.Villagerbunker1OnStructureInstanceGeneratedProcedure;
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
/* 33 */   public static Secretbasementruins1Feature FEATURE = null;
/* 34 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 35 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 38 */     FEATURE = new Secretbasementruins1Feature();
/* 39 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:secretbasementruins_1", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 40 */     PLACED_FEATURE = PlacementUtils.register("latex:secretbasementruins_1", CONFIGURED_FEATURE, List.of());
/* 41 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 45 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 48 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("swamp"));
/*    */   
/* 50 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 52 */   private StructureTemplate template = null;
/*    */   
/*    */   public Secretbasementruins1Feature() {
/* 55 */     super(NoneFeatureConfiguration.CODEC);
/* 56 */     this.base_blocks = List.of(Blocks.STONE, Blocks.GRASS_BLOCK, Blocks.DIRT_PATH, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.SAND, Blocks.RED_SAND);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 61 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 62 */       return false; 
/* 63 */     if (this.template == null)
/* 64 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "secret_basement_ruins")); 
/* 65 */     if (this.template == null)
/* 66 */       return false; 
/* 67 */     boolean anyPlaced = false;
/* 68 */     if (context.random().nextInt(1000000) + 1 <= 375) {
/* 69 */       int count = context.random().nextInt(1) + 1;
/* 70 */       for (int a = 0; a < count; a++) {
/* 71 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 72 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 73 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 74 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 76 */           BlockPos spawnTo = new BlockPos(i + 0, j + -7, k + 0);
/* 77 */           WorldGenLevel world = context.level();
/* 78 */           int x = spawnTo.getX();
/* 79 */           int y = spawnTo.getY();
/* 80 */           int z = spawnTo.getZ();
/* 81 */           if (this.template.placeInWorld((ServerLevelAccessor)context
/* 82 */               .level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE)
/* 83 */               .setRandom(context.random()).addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 84 */               .random(), 2)) {
/*    */             
/* 86 */             Villagerbunker1OnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 87 */             anyPlaced = true;
/*    */           } 
/*    */         } 
/*    */       } 
/* 91 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\Secretbasementruins1Feature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */