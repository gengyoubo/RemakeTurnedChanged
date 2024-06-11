/*     */ package net.ltxprogrammer.turned.init;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.function.Supplier;
/*     */ import net.ltxprogrammer.turned.world.features.AbandonedbiglabFeature;
/*     */ import net.ltxprogrammer.turned.world.features.Abandonedhouse2Feature;
/*     */ import net.ltxprogrammer.turned.world.features.AbandonedhouseFeature;
/*     */ import net.ltxprogrammer.turned.world.features.AbandonedrefugeecampFeature;
/*     */ import net.ltxprogrammer.turned.world.features.AbandonedsmallvillageFeature;
/*     */ import net.ltxprogrammer.turned.world.features.BlackLabFeature;
/*     */ import net.ltxprogrammer.turned.world.features.BreachedlabFeature;
/*     */ import net.ltxprogrammer.turned.world.features.BunkerRuins1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.Emergencyeviloutpost2Feature;
/*     */ import net.ltxprogrammer.turned.world.features.EmergencyeviloutpostFeature;
/*     */ import net.ltxprogrammer.turned.world.features.EnemymilitarybaseFeature;
/*     */ import net.ltxprogrammer.turned.world.features.FacilitybyCDFeature;
/*     */ import net.ltxprogrammer.turned.world.features.HiddenbunkerinruinsFeature;
/*     */ import net.ltxprogrammer.turned.world.features.InfestedlatexbunkerFeature;
/*     */ import net.ltxprogrammer.turned.world.features.LatexbunkerFeature;
/*     */ import net.ltxprogrammer.turned.world.features.MakeshiftbeaconpodiumFeature;
/*     */ import net.ltxprogrammer.turned.world.features.MilitaryBaseFeature;
/*     */ import net.ltxprogrammer.turned.world.features.OccupiedrefugeecampFeature;
/*     */ import net.ltxprogrammer.turned.world.features.OperativeFacility3Feature;
/*     */ import net.ltxprogrammer.turned.world.features.Operativefacility2Feature;
/*     */ import net.ltxprogrammer.turned.world.features.OperativefacilityFeature;
/*     */ import net.ltxprogrammer.turned.world.features.RefugeeCampFeature;
/*     */ import net.ltxprogrammer.turned.world.features.Sandbillagerbunker1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.Secretbasementruins1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.Shelterruins1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.SmallShelter1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.UndergroundevillabFeature;
/*     */ import net.ltxprogrammer.turned.world.features.Villagerbunker1Feature;
/*     */ import net.ltxprogrammer.turned.world.features.lakes.DarkLatexGooFluidFeature;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.level.levelgen.GenerationStep;
/*     */ import net.minecraft.world.level.levelgen.feature.Feature;
/*     */ import net.minecraft.world.level.levelgen.placement.PlacedFeature;
/*     */ import net.minecraftforge.event.world.BiomeLoadingEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class LatexModFeatures
/*     */ {
/*  58 */   public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, "turned");
/*  59 */   private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
/*  60 */   public static final RegistryObject<Feature<?>> DARK_LATEX_GOO_FLUID = register("dark_latex_goo_fluid", DarkLatexGooFluidFeature::feature, new FeatureRegistration(GenerationStep.Decoration.LAKES, DarkLatexGooFluidFeature.GENERATE_BIOMES, DarkLatexGooFluidFeature::placedFeature));
/*     */ 
/*     */   
/*  63 */   public static final RegistryObject<Feature<?>> BLACK_LAB = register("black_lab", BlackLabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BlackLabFeature.GENERATE_BIOMES, BlackLabFeature::placedFeature));
/*     */   
/*  65 */   public static final RegistryObject<Feature<?>> BREACHEDLAB = register("breachedlab", BreachedlabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BreachedlabFeature.GENERATE_BIOMES, BreachedlabFeature::placedFeature));
/*     */   
/*  67 */   public static final RegistryObject<Feature<?>> OPERATIVEFACILITY = register("operativefacility", OperativefacilityFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OperativefacilityFeature.GENERATE_BIOMES, OperativefacilityFeature::placedFeature));
/*     */ 
/*     */   
/*  70 */   public static final RegistryObject<Feature<?>> BUNKER_RUINS_1 = register("bunker_ruins_1", BunkerRuins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BunkerRuins1Feature.GENERATE_BIOMES, BunkerRuins1Feature::placedFeature));
/*     */   
/*  72 */   public static final RegistryObject<Feature<?>> VILLAGERBUNKER_1 = register("villagerbunker_1", Villagerbunker1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Villagerbunker1Feature.GENERATE_BIOMES, Villagerbunker1Feature::placedFeature));
/*     */ 
/*     */   
/*  75 */   public static final RegistryObject<Feature<?>> SANDBILLAGERBUNKER_1 = register("sandbillagerbunker_1", Sandbillagerbunker1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Sandbillagerbunker1Feature.GENERATE_BIOMES, Sandbillagerbunker1Feature::placedFeature));
/*     */ 
/*     */   
/*  78 */   public static final RegistryObject<Feature<?>> INFESTEDLATEXBUNKER = register("infestedlatexbunker", InfestedlatexbunkerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, InfestedlatexbunkerFeature.GENERATE_BIOMES, InfestedlatexbunkerFeature::placedFeature));
/*     */ 
/*     */   
/*  81 */   public static final RegistryObject<Feature<?>> LATEXBUNKER = register("latexbunker", LatexbunkerFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, LatexbunkerFeature.GENERATE_BIOMES, LatexbunkerFeature::placedFeature));
/*     */   
/*  83 */   public static final RegistryObject<Feature<?>> FACILITYBY_CD = register("facilityby_cd", FacilitybyCDFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, FacilitybyCDFeature.GENERATE_BIOMES, FacilitybyCDFeature::placedFeature));
/*     */   
/*  85 */   public static final RegistryObject<Feature<?>> OPERATIVEFACILITY_2 = register("operativefacility_2", Operativefacility2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Operativefacility2Feature.GENERATE_BIOMES, Operativefacility2Feature::placedFeature));
/*     */ 
/*     */   
/*  88 */   public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST = register("emergencyeviloutpost", EmergencyeviloutpostFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EmergencyeviloutpostFeature.GENERATE_BIOMES, EmergencyeviloutpostFeature::placedFeature));
/*     */ 
/*     */   
/*  91 */   public static final RegistryObject<Feature<?>> ABANDONEDHOUSE = register("abandonedhouse", AbandonedhouseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedhouseFeature.GENERATE_BIOMES, AbandonedhouseFeature::placedFeature));
/*     */ 
/*     */   
/*  94 */   public static final RegistryObject<Feature<?>> ABANDONEDHOUSE_2 = register("abandonedhouse_2", Abandonedhouse2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Abandonedhouse2Feature.GENERATE_BIOMES, Abandonedhouse2Feature::placedFeature));
/*     */ 
/*     */   
/*  97 */   public static final RegistryObject<Feature<?>> EMERGENCYEVILOUTPOST_2 = register("emergencyeviloutpost_2", Emergencyeviloutpost2Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Emergencyeviloutpost2Feature.GENERATE_BIOMES, Emergencyeviloutpost2Feature::placedFeature));
/*     */ 
/*     */   
/* 100 */   public static final RegistryObject<Feature<?>> MAKESHIFTBEACONPODIUM = register("makeshiftbeaconpodium", MakeshiftbeaconpodiumFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MakeshiftbeaconpodiumFeature.GENERATE_BIOMES, MakeshiftbeaconpodiumFeature::placedFeature));
/*     */ 
/*     */   
/* 103 */   public static final RegistryObject<Feature<?>> UNDERGROUNDEVILLAB = register("undergroundevillab", UndergroundevillabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, UndergroundevillabFeature.GENERATE_BIOMES, UndergroundevillabFeature::placedFeature));
/*     */ 
/*     */   
/* 106 */   public static final RegistryObject<Feature<?>> ABANDONEDBIGLAB = register("abandonedbiglab", AbandonedbiglabFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedbiglabFeature.GENERATE_BIOMES, AbandonedbiglabFeature::placedFeature));
/*     */ 
/*     */   
/* 109 */   public static final RegistryObject<Feature<?>> SECRETBASEMENTRUINS_1 = register("secretbasementruins_1", Secretbasementruins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Secretbasementruins1Feature.GENERATE_BIOMES, Secretbasementruins1Feature::placedFeature));
/*     */ 
/*     */   
/* 112 */   public static final RegistryObject<Feature<?>> OPERATIVE_FACILITY_3 = register("operative_facility_3", OperativeFacility3Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OperativeFacility3Feature.GENERATE_BIOMES, OperativeFacility3Feature::placedFeature));
/*     */ 
/*     */   
/* 115 */   public static final RegistryObject<Feature<?>> SHELTERRUINS_1 = register("shelterruins_1", Shelterruins1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Shelterruins1Feature.GENERATE_BIOMES, Shelterruins1Feature::placedFeature));
/*     */   
/* 117 */   public static final RegistryObject<Feature<?>> HIDDENBUNKERINRUINS = register("hiddenbunkerinruins", HiddenbunkerinruinsFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, HiddenbunkerinruinsFeature.GENERATE_BIOMES, HiddenbunkerinruinsFeature::placedFeature));
/*     */ 
/*     */   
/* 120 */   public static final RegistryObject<Feature<?>> ABANDONEDREFUGEECAMP = register("abandonedrefugeecamp", AbandonedrefugeecampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedrefugeecampFeature.GENERATE_BIOMES, AbandonedrefugeecampFeature::placedFeature));
/*     */ 
/*     */   
/* 123 */   public static final RegistryObject<Feature<?>> OCCUPIEDREFUGEECAMP = register("occupiedrefugeecamp", OccupiedrefugeecampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, OccupiedrefugeecampFeature.GENERATE_BIOMES, OccupiedrefugeecampFeature::placedFeature));
/*     */ 
/*     */   
/* 126 */   public static final RegistryObject<Feature<?>> SMALL_SHELTER_1 = register("small_shelter_1", SmallShelter1Feature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SmallShelter1Feature.GENERATE_BIOMES, SmallShelter1Feature::placedFeature));
/*     */ 
/*     */   
/* 129 */   public static final RegistryObject<Feature<?>> MILITARY_BASE = register("military_base", MilitaryBaseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MilitaryBaseFeature.GENERATE_BIOMES, MilitaryBaseFeature::placedFeature));
/*     */   
/* 131 */   public static final RegistryObject<Feature<?>> REFUGEE_CAMP = register("refugee_camp", RefugeeCampFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RefugeeCampFeature.GENERATE_BIOMES, RefugeeCampFeature::placedFeature));
/*     */   
/* 133 */   public static final RegistryObject<Feature<?>> ENEMYMILITARYBASE = register("enemymilitarybase", EnemymilitarybaseFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EnemymilitarybaseFeature.GENERATE_BIOMES, EnemymilitarybaseFeature::placedFeature));
/*     */ 
/*     */   
/* 136 */   public static final RegistryObject<Feature<?>> ABANDONEDSMALLVILLAGE = register("abandonedsmallvillage", AbandonedsmallvillageFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, AbandonedsmallvillageFeature.GENERATE_BIOMES, AbandonedsmallvillageFeature::placedFeature));
/*     */ 
/*     */ 
/*     */   
/*     */   private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
/* 141 */     FEATURE_REGISTRATIONS.add(featureRegistration);
/* 142 */     return REGISTRY.register(registryname, feature);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
/* 147 */     for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
/* 148 */       if (registration.biomes() == null || registration.biomes().contains(event.getName()))
/* 149 */         event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get()); 
/*     */     } 
/*     */   }
/*     */   private static final class FeatureRegistration extends Record { private final GenerationStep.Decoration stage; private final Set<ResourceLocation> biomes; private final Supplier<Holder<PlacedFeature>> placedFeature;
/* 153 */     private FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) { this.stage = stage; this.biomes = biomes; this.placedFeature = placedFeature; } public final String toString() { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: <illegal opcode> toString : (Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration;)Ljava/lang/String;
/*     */       //   6: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #153	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/* 153 */       //   0	7	0	this	Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration; } public GenerationStep.Decoration stage() { return this.stage; } public final int hashCode() { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: <illegal opcode> hashCode : (Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration;)I
/*     */       //   6: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #153	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	7	0	this	Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration; } public final boolean equals(Object o) { // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: <illegal opcode> equals : (Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration;Ljava/lang/Object;)Z
/*     */       //   7: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #153	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	8	0	this	Lnet/ltxprogrammer/turned/init/LatexModFeatures$FeatureRegistration;
/* 153 */       //   0	8	1	o	Ljava/lang/Object; } public Set<ResourceLocation> biomes() { return this.biomes; } public Supplier<Holder<PlacedFeature>> placedFeature() { return this.placedFeature; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModFeatures.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */