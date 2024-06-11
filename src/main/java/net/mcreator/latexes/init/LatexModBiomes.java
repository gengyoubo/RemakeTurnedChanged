package net.mcreator.latexes.init;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.world.biome.DarkLatexBiomeBiome;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModBiomes.class */
public class LatexModBiomes {
    public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, LatexMod.MODID);
    public static final RegistryObject<Biome> DARK_LATEX_BIOME = REGISTRY.register("dark_latex_biome", () -> {
        return DarkLatexBiomeBiome.createBiome();
    });

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            DarkLatexBiomeBiome.init();
        });
    }

    @Mod.EventBusSubscriber
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModBiomes$BiomeInjector.class */
    public static class BiomeInjector {
        @SubscribeEvent
        public static void onServerAboutToStart(ServerAboutToStartEvent event) {
            MinecraftServer server = event.getServer();
            Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
            Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
            for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : server.getWorldData().worldGenSettings().dimensions().entrySet()) {
                if (((DimensionType) entry.getValue().typeHolder().value()) == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
                    ChunkGenerator chunkGenerator = entry.getValue().generator();
                    MultiNoiseBiomeSource biomeSource = chunkGenerator.getBiomeSource();
                    if (biomeSource instanceof MultiNoiseBiomeSource) {
                        MultiNoiseBiomeSource noiseSource = biomeSource;
                        List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
                        parameters.add(new Pair<>(DarkLatexBiomeBiome.PARAMETER_POINT, biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, LatexModBiomes.DARK_LATEX_BIOME.getId()))));
                        MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList(parameters), noiseSource.preset);
                        chunkGenerator.biomeSource = moddedNoiseSource;
                        chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
                    }
                    if (chunkGenerator instanceof NoiseBasedChunkGenerator) {
                        NoiseBasedChunkGenerator noiseGenerator = (NoiseBasedChunkGenerator) chunkGenerator;
                        NoiseGeneratorSettings noiseGeneratorSettings = (NoiseGeneratorSettings) noiseGenerator.settings.value();
                        SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
                        if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource) {
                            List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(((SurfaceRules.SequenceRuleSource) currentRuleSource).sequence());
                            surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, LatexModBiomes.DARK_LATEX_BIOME.getId()), ((Block) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get()).defaultBlockState(), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), ((Block) LatexModBlocks.DARKLATEXICE.get()).defaultBlockState()));
                            noiseGenerator.settings = new Holder.Direct(new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(), noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence((SurfaceRules.RuleSource[]) surfaceRules.toArray(i -> {
                                return new SurfaceRules.RuleSource[i];
                            })), noiseGeneratorSettings.seaLevel(), noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource()));
                        }
                    }
                }
            }
        }

        private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
            return SurfaceRules.ifTrue(SurfaceRules.isBiome(new ResourceKey[]{biomeKey}), SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(), SurfaceRules.sequence(new SurfaceRules.RuleSource[]{SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR), SurfaceRules.sequence(new SurfaceRules.RuleSource[]{SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock)})), SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))})));
        }
    }
}
