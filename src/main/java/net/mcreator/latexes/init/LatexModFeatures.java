//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.init;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import net.mcreator.latexes.world.features.AbandonedbiglabFeature;
import net.mcreator.latexes.world.features.Abandonedhouse2Feature;
import net.mcreator.latexes.world.features.AbandonedhouseFeature;
import net.mcreator.latexes.world.features.AbandonedrefugeecampFeature;
import net.mcreator.latexes.world.features.AbandonedsmallvillageFeature;
import net.mcreator.latexes.world.features.BlackLabFeature;
import net.mcreator.latexes.world.features.BreachedlabFeature;
import net.mcreator.latexes.world.features.BunkerRuins1Feature;
import net.mcreator.latexes.world.features.Emergencyeviloutpost2Feature;
import net.mcreator.latexes.world.features.EmergencyeviloutpostFeature;
import net.mcreator.latexes.world.features.EnemymilitarybaseFeature;
import net.mcreator.latexes.world.features.FacilitybyCDFeature;
import net.mcreator.latexes.world.features.HiddenbunkerinruinsFeature;
import net.mcreator.latexes.world.features.InfestedlatexbunkerFeature;
import net.mcreator.latexes.world.features.LatexbunkerFeature;
import net.mcreator.latexes.world.features.MakeshiftbeaconpodiumFeature;
import net.mcreator.latexes.world.features.MilitaryBaseFeature;
import net.mcreator.latexes.world.features.OccupiedrefugeecampFeature;
import net.mcreator.latexes.world.features.OperativeFacility3Feature;
import net.mcreator.latexes.world.features.Operativefacility2Feature;
import net.mcreator.latexes.world.features.OperativefacilityFeature;
import net.mcreator.latexes.world.features.RefugeeCampFeature;
import net.mcreator.latexes.world.features.Sandbillagerbunker1Feature;
import net.mcreator.latexes.world.features.Secretbasementruins1Feature;
import net.mcreator.latexes.world.features.Shelterruins1Feature;
import net.mcreator.latexes.world.features.SmallShelter1Feature;
import net.mcreator.latexes.world.features.UndergroundevillabFeature;
import net.mcreator.latexes.world.features.Villagerbunker1Feature;
import net.mcreator.latexes.world.features.lakes.DarkLatexGooFluidFeature;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber
public class LatexModFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY;
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS;
    public static final RegistryObject<Feature<?>> DARK_LATEX_GOO_FLUID;
    public static final RegistryObject<Feature<?>> BLACK_LAB;
    public static final RegistryObject<Feature<?>> BREACHEDLAB;
    public static final RegistryObject<Feature<?>> OPERATIVEFACILITY;
    public static final RegistryObject<Feature<?>> BUNKER_RUINS_1;
    public static final RegistryObject<Feature<?>> VILLAGERBUNKER_1;
    public static final RegistryObject<Feature<?>> SANDBILLAGERBUNKER_1;
    public static final RegistryObject<Feature<?>> INFESTEDLATEXBUNKER;
    public static final RegistryObject<Feature<?>> LATEXBUNKER;
    public static final RegistryObject<Feature<?>> FACILITYBY_CD;
    public static final RegistryObject<Feature<?>> OPERATIVEFACILITY_2;
    public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST;
    public static final RegistryObject<Feature<?>> ABANDONEDHOUSE;
    public static final RegistryObject<Feature<?>> ABANDONEDHOUSE_2;
    public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST_2;
    public static final RegistryObject<Feature<?>> MAKESHIFTBEACONPODIUM;
    public static final RegistryObject<Feature<?>> UNDERGROUNDEVILLAB;
    public static final RegistryObject<Feature<?>> ABANDONEDBIGLAB;
    public static final RegistryObject<Feature<?>> SECRETBASEMENTRUINS_1;
    public static final RegistryObject<Feature<?>> OPERATIVE_FACILITY_3;
    public static final RegistryObject<Feature<?>> SHELTERRUINS_1;
    public static final RegistryObject<Feature<?>> HIDDENBUNKERINRUINS;
    public static final RegistryObject<Feature<?>> ABANDONEDREFUGEECAMP;
    public static final RegistryObject<Feature<?>> OCCUPIEDREFUGEECAMP;
    public static final RegistryObject<Feature<?>> SMALL_SHELTER_1;
    public static final RegistryObject<Feature<?>> MILITARY_BASE;
    public static final RegistryObject<Feature<?>> REFUGEE_CAMP;
    public static final RegistryObject<Feature<?>> ENEMYMILITARYBASE;
    public static final RegistryObject<Feature<?>> ABANDONEDSMALLVILLAGE;

    public LatexModFeatures() {
    }

    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return REGISTRY.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        Iterator var1 = FEATURE_REGISTRATIONS.iterator();

        while(true) {
            FeatureRegistration registration;
            do {
                if (!var1.hasNext()) {
                    return;
                }

                registration = (FeatureRegistration)var1.next();
            } while(registration.biomes() != null && !registration.biomes().contains(event.getName()));

            event.getGeneration().getFeatures(registration.stage()).add((Holder)registration.placedFeature().get());
        }
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "latex");
        FEATURE_REGISTRATIONS = new ArrayList();
        DARK_LATEX_GOO_FLUID = register("dark_latex_goo_fluid", DarkLatexGooFluidFeature::feature, new FeatureRegistration(Decoration.LAKES, DarkLatexGooFluidFeature.GENERATE_BIOMES, DarkLatexGooFluidFeature::placedFeature));
        BLACK_LAB = register("black_lab", BlackLabFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, BlackLabFeature.GENERATE_BIOMES, BlackLabFeature::placedFeature));
        BREACHEDLAB = register("breachedlab", BreachedlabFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, BreachedlabFeature.GENERATE_BIOMES, BreachedlabFeature::placedFeature));
        OPERATIVEFACILITY = register("operativefacility", OperativefacilityFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, OperativefacilityFeature.GENERATE_BIOMES, OperativefacilityFeature::placedFeature));
        BUNKER_RUINS_1 = register("bunker_ruins_1", BunkerRuins1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, BunkerRuins1Feature.GENERATE_BIOMES, BunkerRuins1Feature::placedFeature));
        VILLAGERBUNKER_1 = register("villagerbunker_1", Villagerbunker1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Villagerbunker1Feature.GENERATE_BIOMES, Villagerbunker1Feature::placedFeature));
        SANDBILLAGERBUNKER_1 = register("sandbillagerbunker_1", Sandbillagerbunker1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Sandbillagerbunker1Feature.GENERATE_BIOMES, Sandbillagerbunker1Feature::placedFeature));
        INFESTEDLATEXBUNKER = register("infestedlatexbunker", InfestedlatexbunkerFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, InfestedlatexbunkerFeature.GENERATE_BIOMES, InfestedlatexbunkerFeature::placedFeature));
        LATEXBUNKER = register("latexbunker", LatexbunkerFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, LatexbunkerFeature.GENERATE_BIOMES, LatexbunkerFeature::placedFeature));
        FACILITYBY_CD = register("facilityby_cd", FacilitybyCDFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, FacilitybyCDFeature.GENERATE_BIOMES, FacilitybyCDFeature::placedFeature));
        OPERATIVEFACILITY_2 = register("operativefacility_2", Operativefacility2Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Operativefacility2Feature.GENERATE_BIOMES, Operativefacility2Feature::placedFeature));
        EMERGENCYEVILOUTPOST = register("emergencyeviloutpost", EmergencyeviloutpostFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, EmergencyeviloutpostFeature.GENERATE_BIOMES, EmergencyeviloutpostFeature::placedFeature));
        ABANDONEDHOUSE = register("abandonedhouse", AbandonedhouseFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, AbandonedhouseFeature.GENERATE_BIOMES, AbandonedhouseFeature::placedFeature));
        ABANDONEDHOUSE_2 = register("abandonedhouse_2", Abandonedhouse2Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Abandonedhouse2Feature.GENERATE_BIOMES, Abandonedhouse2Feature::placedFeature));
        EMERGENCYEVILOUTPOST_2 = register("emergencyeviloutpost_2", Emergencyeviloutpost2Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Emergencyeviloutpost2Feature.GENERATE_BIOMES, Emergencyeviloutpost2Feature::placedFeature));
        MAKESHIFTBEACONPODIUM = register("makeshiftbeaconpodium", MakeshiftbeaconpodiumFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, MakeshiftbeaconpodiumFeature.GENERATE_BIOMES, MakeshiftbeaconpodiumFeature::placedFeature));
        UNDERGROUNDEVILLAB = register("undergroundevillab", UndergroundevillabFeature::feature, new FeatureRegistration(Decoration.UNDERGROUND_STRUCTURES, UndergroundevillabFeature.GENERATE_BIOMES, UndergroundevillabFeature::placedFeature));
        ABANDONEDBIGLAB = register("abandonedbiglab", AbandonedbiglabFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, AbandonedbiglabFeature.GENERATE_BIOMES, AbandonedbiglabFeature::placedFeature));
        SECRETBASEMENTRUINS_1 = register("secretbasementruins_1", Secretbasementruins1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Secretbasementruins1Feature.GENERATE_BIOMES, Secretbasementruins1Feature::placedFeature));
        OPERATIVE_FACILITY_3 = register("operative_facility_3", OperativeFacility3Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, OperativeFacility3Feature.GENERATE_BIOMES, OperativeFacility3Feature::placedFeature));
        SHELTERRUINS_1 = register("shelterruins_1", Shelterruins1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, Shelterruins1Feature.GENERATE_BIOMES, Shelterruins1Feature::placedFeature));
        HIDDENBUNKERINRUINS = register("hiddenbunkerinruins", HiddenbunkerinruinsFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, HiddenbunkerinruinsFeature.GENERATE_BIOMES, HiddenbunkerinruinsFeature::placedFeature));
        ABANDONEDREFUGEECAMP = register("abandonedrefugeecamp", AbandonedrefugeecampFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, AbandonedrefugeecampFeature.GENERATE_BIOMES, AbandonedrefugeecampFeature::placedFeature));
        OCCUPIEDREFUGEECAMP = register("occupiedrefugeecamp", OccupiedrefugeecampFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, OccupiedrefugeecampFeature.GENERATE_BIOMES, OccupiedrefugeecampFeature::placedFeature));
        SMALL_SHELTER_1 = register("small_shelter_1", SmallShelter1Feature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, SmallShelter1Feature.GENERATE_BIOMES, SmallShelter1Feature::placedFeature));
        MILITARY_BASE = register("military_base", MilitaryBaseFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, MilitaryBaseFeature.GENERATE_BIOMES, MilitaryBaseFeature::placedFeature));
        REFUGEE_CAMP = register("refugee_camp", RefugeeCampFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, RefugeeCampFeature.GENERATE_BIOMES, RefugeeCampFeature::placedFeature));
        ENEMYMILITARYBASE = register("enemymilitarybase", EnemymilitarybaseFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, EnemymilitarybaseFeature.GENERATE_BIOMES, EnemymilitarybaseFeature::placedFeature));
        ABANDONEDSMALLVILLAGE = register("abandonedsmallvillage", AbandonedsmallvillageFeature::feature, new FeatureRegistration(Decoration.SURFACE_STRUCTURES, AbandonedsmallvillageFeature.GENERATE_BIOMES, AbandonedsmallvillageFeature::placedFeature));
    }

    private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
        private FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
            this.stage = stage;
            this.biomes = biomes;
            this.placedFeature = placedFeature;
        }

        public GenerationStep.Decoration stage() {
            return this.stage;
        }

        public Set<ResourceLocation> biomes() {
            return this.biomes;
        }

        public Supplier<Holder<PlacedFeature>> placedFeature() {
            return this.placedFeature;
        }
    }
}
