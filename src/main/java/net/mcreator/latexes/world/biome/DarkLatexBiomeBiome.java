package net.mcreator.latexes.world.biome;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.mcreator.latexes.init.LatexModBiomes;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.world.features.treedecorators.DarkLatexBiomeFruitDecorator;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraftforge.common.BiomeDictionary;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/biome/DarkLatexBiomeBiome.class */
public class DarkLatexBiomeBiome {
    public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.014285714f, 0.014285714f), Climate.Parameter.span(-1.0142857f, -0.98571426f), Climate.Parameter.span(0.49571428f, 0.52428573f), Climate.Parameter.span(0.8857143f, 0.9142857f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-0.91998696f, -0.89141554f), 0);

    public static Biome createBiome() {
        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-13421773).waterColor(-13421773).waterFogColor(-16777216).skyColor(-13421773).foliageColorOverride(-13421773).grassColorOverride(-13421773).backgroundMusic(new Music(new SoundEvent(new ResourceLocation("latex:puro_the_block_music")), 12000, 24000, true)).build();
        BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
        biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("latex:tree_dark_latex_biome", FeatureUtils.register("latex:tree_dark_latex_biome", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState()), new StraightTrunkPlacer(7, 2, 0), BlockStateProvider.simple(((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState()), new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).decorators(ImmutableList.of(DarkLatexBiomeFruitDecorator.INSTANCE)).build()), List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
        BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
        BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
        BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
        BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
        BiomeDefaultFeatures.addInfestedStone(biomeGenerationSettings);
        BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
        MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARKLATEX.get(), 5, 1, 4));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.YUFENG.get(), 4, 1, 2));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.NOISE_STALKER.get(), 2, 1, 3));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_FOX.get(), 3, 1, 1));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get(), 2, 1, 3));
        mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARKLATEXSLUG.get(), 8, 1, 2));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_SPIDER.get(), 2, 1, 2));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get(), 3, 1, 1));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), 2, 1, 1));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DLSHARK.get(), 3, 1, 2));
        mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData((EntityType) LatexModEntities.DARK_LATEX_CREEPER.get(), 3, 1, 2));
        return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.5f).downfall(0.0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
    }

    public static void init() {
        BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey((Biome) LatexModBiomes.DARK_LATEX_BIOME.get())), new BiomeDictionary.Type[]{BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE, BiomeDictionary.Type.MODIFIED});
    }
}
