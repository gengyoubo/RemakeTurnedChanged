package net.ltxprogrammer.turned.world.features;

import java.util.List;
import java.util.Set;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.procedures.LatexbunkerOnStructureInstanceGeneratedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/world/features/LatexbunkerFeature.class */
public class LatexbunkerFeature extends Feature<NoneFeatureConfiguration> {
    public static LatexbunkerFeature FEATURE = null;
    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("changed:dark_latex_plains"));
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
    private StructureTemplate template = null;
    private final List<Block> base_blocks = List.of((Block) ChangedBlocks.DARK_LATEX_BLOCK.get());

    public static Feature<?> feature() {
        FEATURE = new LatexbunkerFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("turned:latexbunker", FEATURE, FeatureConfiguration.NONE);
        PLACED_FEATURE = PlacementUtils.register("turned:latexbunker", CONFIGURED_FEATURE, List.of());
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public LatexbunkerFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        }
        if (this.template == null) {
            this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation(LatexMod.MODID, "latex_bunker"));
        }
        if (this.template == null) {
            return false;
        }
        boolean anyPlaced = false;
        if (context.random().nextInt(1000000) + 1 <= 500) {
            int count = context.random().nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = context.origin().getX() + context.random().nextInt(16);
                int k = context.origin().getZ() + context.random().nextInt(16);
                int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
                if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
                    BlockPos spawnTo = new BlockPos(i + 0, j - 5, k + 0);
                    WorldGenLevel world = context.level();
                    int x = spawnTo.getX();
                    int y = spawnTo.getY();
                    int z = spawnTo.getZ();
                    if (this.template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)]).setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
                        LatexbunkerOnStructureInstanceGeneratedProcedure.execute(world, (double) x, (double) y, (double) z);
                        anyPlaced = true;
                    }
                }
            }
        }
        return anyPlaced;
    }
}
