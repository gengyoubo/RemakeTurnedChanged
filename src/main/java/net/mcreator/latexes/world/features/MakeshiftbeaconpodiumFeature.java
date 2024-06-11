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
/*    */ public class MakeshiftbeaconpodiumFeature extends Feature<NoneFeatureConfiguration> {
/* 30 */   public static MakeshiftbeaconpodiumFeature FEATURE = null;
/* 31 */   public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
/* 32 */   public static Holder<PlacedFeature> PLACED_FEATURE = null;
/*    */   
/*    */   public static Feature<?> feature() {
/* 35 */     FEATURE = new MakeshiftbeaconpodiumFeature();
/* 36 */     CONFIGURED_FEATURE = FeatureUtils.register("latex:makeshiftbeaconpodium", FEATURE, (FeatureConfiguration)FeatureConfiguration.NONE);
/* 37 */     PLACED_FEATURE = PlacementUtils.register("latex:makeshiftbeaconpodium", CONFIGURED_FEATURE, List.of());
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
/* 51 */   private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
/*    */   private final List<Block> base_blocks;
/* 53 */   private StructureTemplate template = null;
/*    */   
/*    */   public MakeshiftbeaconpodiumFeature() {
/* 56 */     super(NoneFeatureConfiguration.CODEC);
/* 57 */     this.base_blocks = List.of(Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRASS_BLOCK, Blocks.DIRT_PATH, Blocks.MYCELIUM, Blocks.DIRT, Blocks.COARSE_DIRT, Blocks.PODZOL);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
/* 63 */     if (!this.generate_dimensions.contains(context.level().getLevel().dimension()))
/* 64 */       return false; 
/* 65 */     if (this.template == null)
/* 66 */       this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "makeshift_beacon_podium")); 
/* 67 */     if (this.template == null)
/* 68 */       return false; 
/* 69 */     boolean anyPlaced = false;
/* 70 */     if (context.random().nextInt(1000000) + 1 <= 250) {
/* 71 */       int count = context.random().nextInt(1) + 1;
/* 72 */       for (int a = 0; a < count; a++) {
/* 73 */         int i = context.origin().getX() + context.random().nextInt(16);
/* 74 */         int k = context.origin().getZ() + context.random().nextInt(16);
/* 75 */         int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
/* 76 */         if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
/*    */           
/* 78 */           BlockPos spawnTo = new BlockPos(i + 0, j + -1, k + 0);
/* 79 */           if (this.template.placeInWorld((ServerLevelAccessor)context.level(), spawnTo, spawnTo, (new StructurePlaceSettings())
/* 80 */               .setMirror(Mirror.values()[context.random().nextInt(2)])
/* 81 */               .setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
/* 82 */               .addProcessor((StructureProcessor)BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context
/* 83 */               .random(), 2))
/* 84 */             anyPlaced = true; 
/*    */         } 
/*    */       } 
/*    */     } 
/* 88 */     return anyPlaced;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\features\MakeshiftbeaconpodiumFeature.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */