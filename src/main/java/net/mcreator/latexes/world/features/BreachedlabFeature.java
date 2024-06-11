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
/*    */ public class BreachedlabFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static BreachedlabFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new BreachedlabFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:breachedlab", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 37 */     PLACED_FEATURE = PlacementUtils.register("latex:breachedlab", CONFIGURED_FEATURE, List.of());
/* 38 */     return FEATURE;
/*    */   }
/*    */   
/*    */   public static Holder<PlacedFeature> placedFeature() {
/* 42 */     return PLACED_FEATURE;
/*    */   }
/*    */   
/* 45 */   public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("sunflower_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("desert"));
/*    */   
/* 47 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 49 */   private StructureTemplate template = null;
/*    */   
/*    */   public BreachedlabFeature() {
/* 52 */     super(NoneFeatureConfiguration.CODEC);
/* 53 */     this.base_blocks = List.of(Blocks.GRANITE, Blocks.DIORITE, Blocks.POLISHED_DIORITE, Blocks.POLISHED_ANDESITE, Blocks.GRASS_BLOCK, Blocks.DIRT_PATH, Blocks.MYCELIUM, Blocks.DIRT, Blocks.COARSE_DIRT);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 59 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 60 */       return false; 
/* 61 */     if (this.template == null)
/* 62 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "breached_lab")); 
/* 63 */     if (this.template == null)
/* 64 */       return false; 
/* 65 */     boolean anyPlaced = false;
/* 66 */     if (context.random().nextInt(1000000) + 1 <= 800) {
/* 67 */       int count = context.random().nextInt(1) + 1;
/* 68 */       for (int a = 0; a < count; a++) {
/* 69 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 70 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 71 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 72 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 74 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 75 */           if (this.template.placeInWorld((ServerLevelAccessor)context.level(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 76 */               .setMirror(Mirror.values()[context.random().nextInt(2)])
/* 77 */               .setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
/* 78 */               .addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 79 */               .random(), 2))
/* 80 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 84 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\BreachedlabFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */