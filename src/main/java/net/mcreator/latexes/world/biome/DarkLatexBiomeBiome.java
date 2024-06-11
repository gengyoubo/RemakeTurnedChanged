/*    */ package net.mcreator.latexes.world.biome;
/*    */ import com.google.common.collect.ImmutableList;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModBiomes;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.mcreator.latexes.world.features.treedecorators.DarkLatexBiomeFruitDecorator;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.data.BuiltinRegistries;
/*    */ import net.minecraft.data.worldgen.BiomeDefaultFeatures;
/*    */ import net.minecraft.data.worldgen.features.FeatureUtils;
/*    */ import net.minecraft.data.worldgen.placement.PlacementUtils;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.Music;
/*    */ import net.minecraft.util.valueproviders.ConstantInt;
/*    */ import net.minecraft.util.valueproviders.IntProvider;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobCategory;
/*    */ import net.minecraft.world.level.biome.Biome;
/*    */ import net.minecraft.world.level.biome.BiomeGenerationSettings;
/*    */ import net.minecraft.world.level.biome.BiomeSpecialEffects;
/*    */ import net.minecraft.world.level.biome.Climate;
/*    */ import net.minecraft.world.level.biome.MobSpawnSettings;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.levelgen.GenerationStep;
/*    */ import net.minecraft.world.level.levelgen.feature.Feature;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
/*    */ import net.minecraft.world.level.levelgen.feature.featuresize.FeatureSize;
/*    */ import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
/*    */ import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
/*    */ import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
/*    */ import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
/*    */ import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
/*    */ import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
/*    */ import net.minecraft.world.level.levelgen.placement.BiomeFilter;
/*    */ import net.minecraft.world.level.levelgen.placement.CountPlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
/*    */ import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
/*    */ import net.minecraftforge.common.BiomeDictionary;
/*    */ 
/*    */ public class DarkLatexBiomeBiome {
/* 45 */   public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.014285714F, 0.014285714F), 
/* 46 */       Climate.Parameter.span(-1.0142857F, -0.98571426F), Climate.Parameter.span(0.49571428F, 0.52428573F), 
/* 47 */       Climate.Parameter.span(0.8857143F, 0.9142857F), Climate.Parameter.point(0.0F), 
/* 48 */       Climate.Parameter.span(-0.91998696F, -0.89141554F), 0L);
/*    */ 
/*    */ 
/*    */   
/*    */   public static Biome createBiome() {
/* 53 */     BiomeSpecialEffects effects = (new BiomeSpecialEffects.Builder()).fogColor(-13421773).waterColor(-13421773).waterFogColor(-16777216).skyColor(-13421773).foliageColorOverride(-13421773).grassColorOverride(-13421773).backgroundMusic(new Music(new SoundEvent(new ResourceLocation("latex:puro_the_block_music")), 12000, 24000, true)).build();
/* 54 */     BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
/* 55 */     biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, 
/* 56 */         PlacementUtils.register("latex:tree_dark_latex_biome", FeatureUtils.register("latex:tree_dark_latex_biome", Feature.TREE, (FeatureConfiguration)(new TreeConfiguration.TreeConfigurationBuilder(
/*    */               
/* 58 */               (BlockStateProvider)BlockStateProvider.simple(((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState()), (TrunkPlacer)new StraightTrunkPlacer(7, 2, 0), 
/* 59 */               (BlockStateProvider)BlockStateProvider.simple(((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState()), (FoliagePlacer)new BlobFoliagePlacer(
/* 60 */                 (IntProvider)ConstantInt.of(2), (IntProvider)ConstantInt.of(0), 3), (FeatureSize)new TwoLayersFeatureSize(1, 0, 1)))
/* 61 */             .decorators((List)ImmutableList.of(DarkLatexBiomeFruitDecorator.INSTANCE))
/*    */ 
/*    */             
/* 64 */             .build()), 
/* 65 */           List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, 
/* 66 */             PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), 
/* 67 */             BiomeFilter.biome())));
/* 68 */     BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
/* 69 */     BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
/* 70 */     BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
/* 71 */     BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
/* 72 */     BiomeDefaultFeatures.addInfestedStone(biomeGenerationSettings);
/* 73 */     BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
/* 74 */     MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
/* 75 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARKLATEX.get(), 5, 1, 4));
/* 76 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.YUFENG.get(), 4, 1, 2));
/* 77 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.NOISE_STALKER.get(), 2, 1, 3));
/* 78 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), 3, 1, 1));
/* 79 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), 2, 1, 3));
/* 80 */     mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARKLATEXSLUG.get(), 8, 1, 2));
/* 81 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), 2, 1, 2));
/* 82 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), 3, 1, 1));
/* 83 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), 2, 1, 1));
/* 84 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DLSHARK.get(), 3, 1, 2));
/* 85 */     mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), 3, 1, 2));
/* 86 */     return (new Biome.BiomeBuilder()).precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.5F)
/* 87 */       .downfall(0.0F).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
/* 88 */       .build();
/*    */   }
/*    */   
/*    */   public static void init() {
/* 92 */     BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(LatexModBiomes.DARK_LATEX_BIOME.get())), new BiomeDictionary.Type[] { BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE, BiomeDictionary.Type.MODIFIED });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\world\biome\DarkLatexBiomeBiome.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */