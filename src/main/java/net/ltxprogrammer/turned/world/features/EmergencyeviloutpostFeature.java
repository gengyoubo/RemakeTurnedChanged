package net.ltxprogrammer.turned.world.features;

import java.util.List;
import java.util.Set;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.procedures.CheckevilraidProcedure;
import net.ltxprogrammer.turned.procedures.EmergencyeviloutpostOnStructureInstanceGeneratedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/world/features/EmergencyeviloutpostFeature.class */
public class EmergencyeviloutpostFeature extends Feature<NoneFeatureConfiguration> {
    public static EmergencyeviloutpostFeature FEATURE = null;
    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("forest"), new ResourceLocation("taiga"), new ResourceLocation("plains"), new ResourceLocation("swamp"));
    private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
    private StructureTemplate template = null;
    private final List<Block> base_blocks = List.of(Blocks.GRASS_BLOCK, Blocks.STONE, Blocks.DIRT_PATH, Blocks.DIRT, Blocks.COARSE_DIRT);

    public static Feature<?> feature() {
        FEATURE = new EmergencyeviloutpostFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("turned:emergencyeviloutpost", FEATURE, FeatureConfiguration.NONE);
        PLACED_FEATURE = PlacementUtils.register("turned:emergencyeviloutpost", CONFIGURED_FEATURE, List.of());
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    public EmergencyeviloutpostFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        }
        if (this.template == null) {
            this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation(LatexMod.MODID, "evil_emergency_outpost"));
        }
        boolean anyPlaced = false;
        if (context.random().nextInt(1000000) + 1 <= 750) {
            int count = context.random().nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = context.origin().getX() + context.random().nextInt(16);
                int k = context.origin().getZ() + context.random().nextInt(16);
                int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
                if (this.base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock())) {
                    BlockPos spawnTo = new BlockPos(i, j - 3, k);
                    WorldGenLevel world = context.level();
                    int x = spawnTo.getX();
                    int y = spawnTo.getY();
                    int z = spawnTo.getZ();
                    if (CheckevilraidProcedure.execute(world) && this.template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.NONE).setRotation(Rotation.NONE).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
                        EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.execute(world, x, y, z);
                        anyPlaced = true;
                    }
                }
            }
        }
        return anyPlaced;
    }
}
