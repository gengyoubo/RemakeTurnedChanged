//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.world.features;

import java.util.List;
import java.util.Set;
import net.mcreator.latexes.procedures.CheckevilraidProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class UndergroundevillabFeature extends Feature<NoneFeatureConfiguration> {
    public static UndergroundevillabFeature FEATURE = null;
    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("mushroom_fields"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("stony_shore"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("beach"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert"), new ResourceLocation("snowy_beach"));
    private final Set<ResourceKey<Level>> generate_dimensions;
    private StructureTemplate template;

    public static Feature<?> feature() {
        FEATURE = new UndergroundevillabFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("latex:undergroundevillab", FEATURE, FeatureConfiguration.NONE);
        PLACED_FEATURE = PlacementUtils.register("latex:undergroundevillab", CONFIGURED_FEATURE, List.of());
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public UndergroundevillabFeature() {
        super(NoneFeatureConfiguration.CODEC);
        this.generate_dimensions = Set.of(Level.OVERWORLD);
        this.template = null;
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        } else {
            if (this.template == null) {
                this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("latex", "underground_evil_lab"));
            }

            if (this.template == null) {
                return false;
            } else {
                boolean anyPlaced = false;
                if (context.random().nextInt(1000000) + 1 <= 4375) {
                    int count = context.random().nextInt(1) + 1;

                    for(int a = 0; a < count; ++a) {
                        int i = context.origin().getX() + context.random().nextInt(16);
                        int k = context.origin().getZ() + context.random().nextInt(16);
                        int j = context.level().getHeight(Types.OCEAN_FLOOR_WG, i, k);
                        j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));
                        BlockPos spawnTo = new BlockPos(i + 0, j + -8, k + 0);
                        WorldGenLevel world = context.level();
                        int x = spawnTo.getX();
                        int y = spawnTo.getY();
                        int z = spawnTo.getZ();
                        if (CheckevilraidProcedure.execute(world) && this.template.placeInWorld(context.level(), spawnTo, spawnTo, (new StructurePlaceSettings()).setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
                            anyPlaced = true;
                        }
                    }
                }

                return anyPlaced;
            }
        }
    }
}
