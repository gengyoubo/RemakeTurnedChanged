package net.mcreator.latexes.world.features.lakes;

import java.util.List;
import java.util.Set;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.EnvironmentScanPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/world/features/lakes/DarkLatexGooFluidFeature.class */
public class DarkLatexGooFluidFeature extends LakeFeature {
    public static DarkLatexGooFluidFeature FEATURE = null;
    public static Holder<ConfiguredFeature<LakeFeature.Configuration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("latex:dark_latex_biome"));
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

    public static Feature<?> feature() {
        FEATURE = new DarkLatexGooFluidFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("latex:dark_latex_goo_fluid", FEATURE, new LakeFeature.Configuration(BlockStateProvider.simple((Block) LatexModBlocks.DARK_LATEX_GOO_FLUID.get()), BlockStateProvider.simple(Blocks.AIR)));
        PLACED_FEATURE = PlacementUtils.register("latex:dark_latex_goo_fluid", CONFIGURED_FEATURE, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT, EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.not(BlockPredicate.ONLY_IN_AIR_PREDICATE), 32), BiomeFilter.biome()));
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public DarkLatexGooFluidFeature() {
        super(LakeFeature.Configuration.CODEC);
    }

    public boolean place(FeaturePlaceContext<LakeFeature.Configuration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        }
        return place(context);
    }
}
