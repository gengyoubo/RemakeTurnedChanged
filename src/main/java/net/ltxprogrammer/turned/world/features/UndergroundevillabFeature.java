package net.ltxprogrammer.turned.world.features;

import java.util.List;
import java.util.Set;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.procedures.CheckevilraidProcedure;
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
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/world/features/UndergroundevillabFeature.class */
public class UndergroundevillabFeature extends Feature<NoneFeatureConfiguration> {
    public static UndergroundevillabFeature FEATURE = null;
    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of((Object[]) new ResourceLocation[]{new ResourceLocation("mushroom_fields"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("stony_shore"), new ResourceLocation("snowy_plains"), new ResourceLocation("taiga"), new ResourceLocation("sparse_jungle"), new ResourceLocation("birch_forest"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("old_growth_birch_forest"), new ResourceLocation("windswept_hills"), new ResourceLocation("old_growth_pine_taiga"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("beach"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert"), new ResourceLocation("snowy_beach")});
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
    private StructureTemplate template = null;

    public static Feature<?> feature() {
        FEATURE = new UndergroundevillabFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("turned:undergroundevillab", FEATURE, FeatureConfiguration.NONE);
        PLACED_FEATURE = PlacementUtils.register("turned:undergroundevillab", CONFIGURED_FEATURE, List.of());
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public UndergroundevillabFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        }
        if (this.template == null) {
            this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation(LatexMod.MODID, "underground_evil_lab"));
        }
        if (this.template == null) {
            return false;
        }
        boolean anyPlaced = false;
        if (context.random().nextInt(1000000) + 1 <= 4375) {
            int count = context.random().nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = context.origin().getX() + context.random().nextInt(16);
                int k = context.origin().getZ() + context.random().nextInt(16);
                BlockPos spawnTo = new BlockPos(i + 0, Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k), 9 + context.level().getMinBuildHeight())) - 8, k + 0);
                WorldGenLevel world = context.level();
                spawnTo.getX();
                spawnTo.getY();
                spawnTo.getZ();
                if (CheckevilraidProcedure.execute(world) && this.template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
                    anyPlaced = true;
                }
            }
        }
        return anyPlaced;
    }
}
