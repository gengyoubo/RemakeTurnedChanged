/*    */ package net.mcreator.latexes.world.features;
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
/*    */ public class BlackLabFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static BlackLabFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new BlackLabFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:black_lab", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 37 */     PLACED_FEATURE = PlacementUtils.register("latex:black_lab", CONFIGURED_FEATURE, List.of());
/* 38 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 42 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 45 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("desert"));
/*    */   
/* 47 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 49 */   private StructureTemplate template = null;
/*    */   
/*    */   public BlackLabFeature() {
/* 52 */     super(NoneFeatureConfiguration.CODEC);
/* 53 */     this.base_blocks = List.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRASS_BLOCK, Blocks.DIRT_PATH, Blocks.DIRT);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 58 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 59 */       return false; 
/* 60 */     if (this.template == null)
/* 61 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "black_lab")); 
/* 62 */     if (this.template == null)
/* 63 */       return false; 
/* 64 */     boolean anyPlaced = false;
/* 65 */     if (context.random().nextInt(1000000) + 1 <= 375) {
/* 66 */       int count = context.random().nextInt(1) + 1;
/* 67 */       for (int a = 0; a < count; a++) {
/* 68 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 69 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 70 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 71 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 73 */           BlockPos spawnTo = new BlockPos(i + 0, j + -2, k + 0);
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


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\BlackLabFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */