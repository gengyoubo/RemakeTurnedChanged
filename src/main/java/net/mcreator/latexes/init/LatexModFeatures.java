package net.mcreator.latexes.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import net.mcreator.latexes.LatexMod;
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
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModFeatures.class */
public class LatexModFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LatexMod.MODID);
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList();
    public static final RegistryObject<Feature<?>> DARK_LATEX_GOO_FLUID = register("dark_latex_goo_fluid", DarkLatexGooFluidFeature::feature, new FeatureRegistration(GenerationStep.Decoration.LAKES, DarkLatexGooFluidFeature.GENERATE_BIOMES, DarkLatexGooFluidFeature::placedFeature));
    public static final RegistryObject<Feature<?>> BLACK_LAB = register("black_lab", BlackLabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BlackLabFeature.GENERATE_BIOMES, BlackLabFeature::placedFeature));
    public static final RegistryObject<Feature<?>> BREACHEDLAB = register("breachedlab", BreachedlabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BreachedlabFeature.GENERATE_BIOMES, BreachedlabFeature::placedFeature));
    public static final RegistryObject<Feature<?>> OPERATIVEFACILITY = register("operativefacility", OperativefacilityFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OperativefacilityFeature.GENERATE_BIOMES, OperativefacilityFeature::placedFeature));
    public static final RegistryObject<Feature<?>> BUNKER_RUINS_1 = register("bunker_ruins_1", BunkerRuins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BunkerRuins1Feature.GENERATE_BIOMES, BunkerRuins1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> VILLAGERBUNKER_1 = register("villagerbunker_1", Villagerbunker1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Villagerbunker1Feature.GENERATE_BIOMES, Villagerbunker1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> SANDBILLAGERBUNKER_1 = register("sandbillagerbunker_1", Sandbillagerbunker1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Sandbillagerbunker1Feature.GENERATE_BIOMES, Sandbillagerbunker1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> INFESTEDLATEXBUNKER = register("infestedlatexbunker", InfestedlatexbunkerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, InfestedlatexbunkerFeature.GENERATE_BIOMES, InfestedlatexbunkerFeature::placedFeature));
    public static final RegistryObject<Feature<?>> LATEXBUNKER = register("latexbunker", LatexbunkerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LatexbunkerFeature.GENERATE_BIOMES, LatexbunkerFeature::placedFeature));
    public static final RegistryObject<Feature<?>> FACILITYBY_CD = register("facilityby_cd", FacilitybyCDFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FacilitybyCDFeature.GENERATE_BIOMES, FacilitybyCDFeature::placedFeature));
    public static final RegistryObject<Feature<?>> OPERATIVEFACILITY_2 = register("operativefacility_2", Operativefacility2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Operativefacility2Feature.GENERATE_BIOMES, Operativefacility2Feature::placedFeature));
    public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST = register("emergencyeviloutpost", EmergencyeviloutpostFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EmergencyeviloutpostFeature.GENERATE_BIOMES, EmergencyeviloutpostFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ABANDONEDHOUSE = register("abandonedhouse", AbandonedhouseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedhouseFeature.GENERATE_BIOMES, AbandonedhouseFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ABANDONEDHOUSE_2 = register("abandonedhouse_2", Abandonedhouse2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Abandonedhouse2Feature.GENERATE_BIOMES, Abandonedhouse2Feature::placedFeature));
    public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST_2 = register("emergencyeviloutpost_2", Emergencyeviloutpost2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Emergencyeviloutpost2Feature.GENERATE_BIOMES, Emergencyeviloutpost2Feature::placedFeature));
    public static final RegistryObject<Feature<?>> MAKESHIFTBEACONPODIUM = register("makeshiftbeaconpodium", MakeshiftbeaconpodiumFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MakeshiftbeaconpodiumFeature.GENERATE_BIOMES, MakeshiftbeaconpodiumFeature::placedFeature));
    public static final RegistryObject<Feature<?>> UNDERGROUNDEVILLAB = register("undergroundevillab", UndergroundevillabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, UndergroundevillabFeature.GENERATE_BIOMES, UndergroundevillabFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ABANDONEDBIGLAB = register("abandonedbiglab", AbandonedbiglabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedbiglabFeature.GENERATE_BIOMES, AbandonedbiglabFeature::placedFeature));
    public static final RegistryObject<Feature<?>> SECRETBASEMENTRUINS_1 = register("secretbasementruins_1", Secretbasementruins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Secretbasementruins1Feature.GENERATE_BIOMES, Secretbasementruins1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> OPERATIVE_FACILITY_3 = register("operative_facility_3", OperativeFacility3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OperativeFacility3Feature.GENERATE_BIOMES, OperativeFacility3Feature::placedFeature));
    public static final RegistryObject<Feature<?>> SHELTERRUINS_1 = register("shelterruins_1", Shelterruins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Shelterruins1Feature.GENERATE_BIOMES, Shelterruins1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> HIDDENBUNKERINRUINS = register("hiddenbunkerinruins", HiddenbunkerinruinsFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HiddenbunkerinruinsFeature.GENERATE_BIOMES, HiddenbunkerinruinsFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ABANDONEDREFUGEECAMP = register("abandonedrefugeecamp", AbandonedrefugeecampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedrefugeecampFeature.GENERATE_BIOMES, AbandonedrefugeecampFeature::placedFeature));
    public static final RegistryObject<Feature<?>> OCCUPIEDREFUGEECAMP = register("occupiedrefugeecamp", OccupiedrefugeecampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OccupiedrefugeecampFeature.GENERATE_BIOMES, OccupiedrefugeecampFeature::placedFeature));
    public static final RegistryObject<Feature<?>> SMALL_SHELTER_1 = register("small_shelter_1", SmallShelter1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SmallShelter1Feature.GENERATE_BIOMES, SmallShelter1Feature::placedFeature));
    public static final RegistryObject<Feature<?>> MILITARY_BASE = register("military_base", MilitaryBaseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MilitaryBaseFeature.GENERATE_BIOMES, MilitaryBaseFeature::placedFeature));
    public static final RegistryObject<Feature<?>> REFUGEE_CAMP = register("refugee_camp", RefugeeCampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RefugeeCampFeature.GENERATE_BIOMES, RefugeeCampFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ENEMYMILITARYBASE = register("enemymilitarybase", EnemymilitarybaseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EnemymilitarybaseFeature.GENERATE_BIOMES, EnemymilitarybaseFeature::placedFeature));
    public static final RegistryObject<Feature<?>> ABANDONEDSMALLVILLAGE = register("abandonedsmallvillage", AbandonedsmallvillageFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedsmallvillageFeature.GENERATE_BIOMES, AbandonedsmallvillageFeature::placedFeature));

    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return REGISTRY.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
            if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
                event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
            }
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModFeatures$FeatureRegistration.class */
    private static final class FeatureRegistration extends Record {
        private final GenerationStep.Decoration stage;
        private final Set<ResourceLocation> biomes;
        private final Supplier<Holder<PlacedFeature>> placedFeature;

        /*  JADX ERROR: Dependency scan failed at insn: 0x0001: INVOKE_CUSTOM
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInsn(UsageInfoVisitor.java:122)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.lambda$processInstructions$0(UsageInfoVisitor.java:79)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInstructions(UsageInfoVisitor.java:77)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processMethod(UsageInfoVisitor.java:62)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processClass(UsageInfoVisitor.java:51)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.init(UsageInfoVisitor.java:36)
            	at jadx.core.dex.nodes.RootNode.runPreDecompileStage(RootNode.java:267)
            */
        /*  JADX ERROR: Failed to decode insn: 0x0001: INVOKE_CUSTOM, method: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.toString():java.lang.String
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:47)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:43)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:194)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:309)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:315)
            	at jadx.core.ProcessClass.process(ProcessClass.java:53)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:85)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:300)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:265)
            */
        public final java.lang.String toString() {
            /*
                r2 = this;
                r0 = r2
                // decode failed: Can't encode constant CLASS as encoded value
                r1 = -1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.toString():java.lang.String");
        }

        /*  JADX ERROR: Dependency scan failed at insn: 0x0001: INVOKE_CUSTOM
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInsn(UsageInfoVisitor.java:122)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.lambda$processInstructions$0(UsageInfoVisitor.java:79)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInstructions(UsageInfoVisitor.java:77)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processMethod(UsageInfoVisitor.java:62)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processClass(UsageInfoVisitor.java:51)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.init(UsageInfoVisitor.java:36)
            	at jadx.core.dex.nodes.RootNode.runPreDecompileStage(RootNode.java:267)
            */
        /*  JADX ERROR: Failed to decode insn: 0x0001: INVOKE_CUSTOM, method: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.hashCode():int
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:47)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:43)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:194)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:309)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:315)
            	at jadx.core.ProcessClass.process(ProcessClass.java:53)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:85)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:300)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:265)
            */
        public final int hashCode() {
            /*
                r2 = this;
                r0 = r2
                // decode failed: Can't encode constant CLASS as encoded value
                r1 = -1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.hashCode():int");
        }

        /*  JADX ERROR: Dependency scan failed at insn: 0x0002: INVOKE_CUSTOM
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInsn(UsageInfoVisitor.java:122)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.lambda$processInstructions$0(UsageInfoVisitor.java:79)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processInstructions(UsageInfoVisitor.java:77)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processMethod(UsageInfoVisitor.java:62)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.processClass(UsageInfoVisitor.java:51)
            	at jadx.core.dex.visitors.usage.UsageInfoVisitor.init(UsageInfoVisitor.java:36)
            	at jadx.core.dex.nodes.RootNode.runPreDecompileStage(RootNode.java:267)
            */
        /*  JADX ERROR: Failed to decode insn: 0x0002: INVOKE_CUSTOM, method: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.equals(java.lang.Object):boolean
            jadx.plugins.input.java.utils.JavaClassParseException: Can't encode constant CLASS as encoded value
            	at jadx.plugins.input.java.data.ConstPoolReader.readAsEncodedValue(ConstPoolReader.java:230)
            	at jadx.plugins.input.java.data.ConstPoolReader.resolveMethodCallSite(ConstPoolReader.java:117)
            	at jadx.plugins.input.java.data.ConstPoolReader.getCallSite(ConstPoolReader.java:97)
            	at jadx.plugins.input.java.data.code.JavaInsnData.getIndexAsCallSite(JavaInsnData.java:168)
            	at jadx.plugins.input.java.data.code.decoders.InvokeDecoder.decode(InvokeDecoder.java:32)
            	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
            	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:47)
            	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:82)
            	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:43)
            	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:194)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:309)
            	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:315)
            	at jadx.core.ProcessClass.process(ProcessClass.java:53)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:85)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:300)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:265)
            */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = r3
                r1 = r4
                // decode failed: Can't encode constant CLASS as encoded value
                r2 = -1
            */
            throw new UnsupportedOperationException("Method not decompiled: net.mcreator.latexes.init.LatexModFeatures.FeatureRegistration.equals(java.lang.Object):boolean");
        }

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
