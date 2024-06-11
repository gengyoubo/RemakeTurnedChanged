/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.procedures.LatexbunkerOnStructureInstanceGeneratedProcedure;
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
/*    */ public class LatexbunkerFeature extends Feature<NoneFeatureConfiguration> {
/* 33 */   public static LatexbunkerFeature FEATURE = null;
/* 34 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 35 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 38 */     FEATURE = new LatexbunkerFeature();
/* 39 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:latexbunker", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 40 */     PLACED_FEATURE = PlacementUtils.register("latex:latexbunker", CONFIGURED_FEATURE, List.of());
/* 41 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 45 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 48 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("latex:dark_latex_biome"));
/* 49 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 51 */   private StructureTemplate template = null;
/*    */   
/*    */   public LatexbunkerFeature() {
/* 54 */     super(NoneFeatureConfiguration.CODEC);
/* 55 */     this.base_blocks = List.of((Block)LatexModBlocks.DARKLATEXBLOCK.get(), (Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 60 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 61 */       return false; 
/* 62 */     if (this.template == null)
/* 63 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "latex_bunker")); 
/* 64 */     if (this.template == null)
/* 65 */       return false; 
/* 66 */     boolean anyPlaced = false;
/* 67 */     if (context.random().nextInt(1000000) + 1 <= 500) {
/* 68 */       int count = context.random().nextInt(1) + 1;
/* 69 */       for (int a = 0; a < count; a++) {
/* 70 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 71 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 72 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 73 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 75 */           BlockPos spawnTo = new BlockPos(i + 0, j + -5, k + 0);
/* 76 */           WorldGenLevel world = context.level();
/* 77 */           int x = spawnTo.getX();
/* 78 */           int y = spawnTo.getY();
/* 79 */           int z = spawnTo.getZ();
/* 80 */           if (this.template.placeInWorld((ServerLevelAccessor)context.level(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 81 */               .setMirror(Mirror.values()[context.random().nextInt(2)])
/* 82 */               .setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
/* 83 */               .addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 84 */               .random(), 2)) {
/*    */             
/* 86 */             LatexbunkerOnStructureInstanceGeneratedProcedure.execute((LevelAccessor)world, x, y, z);
/* 87 */             anyPlaced = true;
/*    */           } 
/*    */         } 
/*    */       } 
/* 91 */     }  return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\LatexbunkerFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */