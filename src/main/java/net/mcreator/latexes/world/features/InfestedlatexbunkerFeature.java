/*    */ package net.mcreator.latexes.world.features;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
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
/*    */ public class InfestedlatexbunkerFeature
/*    */   extends Feature<NoneFeatureConfiguration> {
/* 31 */   public static InfestedlatexbunkerFeature FEATURE = null;
/* 32 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 33 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 36 */     FEATURE = new InfestedlatexbunkerFeature();
/* 37 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:infestedlatexbunker", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 38 */     PLACED_FEATURE = PlacementUtils.register("latex:infestedlatexbunker", CONFIGURED_FEATURE, List.of());
/* 39 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 43 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 46 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("latex:dark_latex_biome"));
/* 47 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 49 */   private StructureTemplate template = null;
/*    */   
/*    */   public InfestedlatexbunkerFeature() {
/* 52 */     super(NoneFeatureConfiguration.CODEC);
/* 53 */     this.base_blocks = List.of((Block)LatexModBlocks.DARKLATEXBLOCK.get(), (Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 58 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 59 */       return false; 
/* 60 */     if (this.template == null)
/* 61 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "latex_covered_bunker")); 
/* 62 */     if (this.template == null)
/* 63 */       return false; 
/* 64 */     boolean anyPlaced = false;
/* 65 */     if (context.random().nextInt(1000000) + 1 <= 180) {
/* 66 */       int count = context.random().nextInt(1) + 1;
/* 67 */       for (int a = 0; a < count; a++) {
/* 68 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 69 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 70 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 71 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 73 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 74 */           if (this.template.placeInWorld((ServerLevelAccessor)context.level(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 75 */               .setMirror(Mirror.values()[context.random().nextInt(2)])
/* 76 */               .setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
/* 77 */               .addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 78 */               .random(), 2))
/* 79 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 83 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\InfestedlatexbunkerFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */