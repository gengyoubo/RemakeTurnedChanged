//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.init;

import net.mcreator.latexes.entity.AHVHertxEntity;
import net.mcreator.latexes.entity.AHVHertxSitEntity;
import net.mcreator.latexes.entity.AR70AssaultRifleEntity;
import net.mcreator.latexes.entity.AllydroppodEntity;
import net.mcreator.latexes.entity.ArmedDroneHertxEntity;
import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
import net.mcreator.latexes.entity.AshburyHertxEntity;
import net.mcreator.latexes.entity.AshburySitEntity;
import net.mcreator.latexes.entity.BeeHertxEntity;
import net.mcreator.latexes.entity.BeeHertxSitEntity;
import net.mcreator.latexes.entity.CivilianEntity;
import net.mcreator.latexes.entity.CivilianMilitiaMeleeEntity;
import net.mcreator.latexes.entity.CivlianMilitiaEntity;
import net.mcreator.latexes.entity.CrystalbowEntity;
import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.entity.DarkLatexCakeEntity;
import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarkLatexSnepEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DarklatexconeEntity;
import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.entity.DartrifleEntity;
import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.DroneHertxEntity;
import net.mcreator.latexes.entity.DroneHertxWaitEntity;
import net.mcreator.latexes.entity.EvilMilitaryEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.ExplosivegooEntity;
import net.mcreator.latexes.entity.FlamethowerEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.entity.HertxFBSitEntity;
import net.mcreator.latexes.entity.HertxFSitEntity;
import net.mcreator.latexes.entity.HertxSitEntity;
import net.mcreator.latexes.entity.HertxSolWaitEntity;
import net.mcreator.latexes.entity.HertxvarFBEntity;
import net.mcreator.latexes.entity.HertxvarFEntity;
import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.mcreator.latexes.entity.La4tankmorphmEntity;
import net.mcreator.latexes.entity.La4tankmorphrEntity;
import net.mcreator.latexes.entity.LatexDartRifleEntity;
import net.mcreator.latexes.entity.LatexDropPodEntity;
import net.mcreator.latexes.entity.LatexcannonEntity;
import net.mcreator.latexes.entity.M4AssaultRifleEntity;
import net.mcreator.latexes.entity.MatchLockMusketEntity;
import net.mcreator.latexes.entity.MatchlockPistolEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.MilitaryRiotEntity;
import net.mcreator.latexes.entity.MilitaryflameunitEntity;
import net.mcreator.latexes.entity.NXTHertxEntity;
import net.mcreator.latexes.entity.NXTSitEntity;
import net.mcreator.latexes.entity.NoiseStalkerEntity;
import net.mcreator.latexes.entity.OverundershotgunEntity;
import net.mcreator.latexes.entity.PrisionerEntity;
import net.mcreator.latexes.entity.PrisionerMilitiaMeleeEntity;
import net.mcreator.latexes.entity.PrisionermilitiaEntity;
import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
import net.mcreator.latexes.entity.ProtectorSlimelingsitEntity;
import net.mcreator.latexes.entity.RevolvingGooCannonEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.ScrapM16RifleEntity;
import net.mcreator.latexes.entity.SlimelingEntity;
import net.mcreator.latexes.entity.SlimelingTamedEntity;
import net.mcreator.latexes.entity.SlimelingtamedsitEntity;
import net.mcreator.latexes.entity.SneppleEntity;
import net.mcreator.latexes.entity.TSCBerserkEntity;
import net.mcreator.latexes.entity.TSCHunterEntity;
import net.mcreator.latexes.entity.TSCOutsiderEntity;
import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
import net.mcreator.latexes.entity.TSCPistolEntity;
import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.entity.TankCannonEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType.Builder;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class LatexModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY;
    public static final RegistryObject<EntityType<DarklatexslugEntity>> DARKLATEXSLUG;
    public static final RegistryObject<EntityType<DarklatexEntity>> DARKLATEX;
    public static final RegistryObject<EntityType<DarkLatexCentaurEntity>> DARK_LATEX_CENTAUR;
    public static final RegistryObject<EntityType<DarkLatexSkeletonEntity>> DARK_LATEX_SKELETON;
    public static final RegistryObject<EntityType<NoiseStalkerEntity>> NOISE_STALKER;
    public static final RegistryObject<EntityType<DlsharkEntity>> DLSHARK;
    public static final RegistryObject<EntityType<DarkLatexMothEntity>> DARK_LATEX_MOTH;
    public static final RegistryObject<EntityType<DarkLatexSnepEntity>> DARK_LATEX_SNEP;
    public static final RegistryObject<EntityType<DarkLatexFoxEntity>> DARK_LATEX_FOX;
    public static final RegistryObject<EntityType<DarkLatexFoxSniperEntity>> DARK_LATEX_FOX_SNIPER;
    public static final RegistryObject<EntityType<DarkLatexSpiderEntity>> DARK_LATEX_SPIDER;
    public static final RegistryObject<EntityType<DlSquidDogEntity>> DL_SQUID_DOG;
    public static final RegistryObject<EntityType<DLbeeEntity>> D_LBEE;
    public static final RegistryObject<EntityType<DarkLatexQueenBeeEntity>> DARK_LATEX_QUEEN_BEE;
    public static final RegistryObject<EntityType<DarkLatexSpiderQueenEntity>> DARK_LATEX_SPIDER_QUEEN;
    public static final RegistryObject<EntityType<DarklatexconeEntity>> DARKLATEXCONE;
    public static final RegistryObject<EntityType<HertxEntity>> HERTX;
    public static final RegistryObject<EntityType<DroneHertxEntity>> DRONE_HERTX;
    public static final RegistryObject<EntityType<ArmedDroneHertxEntity>> ARMED_DRONE_HERTX;
    public static final RegistryObject<EntityType<ScientistEntity>> SCIENTIST;
    public static final RegistryObject<EntityType<MilitaryEntity>> MILITARY;
    public static final RegistryObject<EntityType<MilitaryflameunitEntity>> MILITARYFLAMEUNIT;
    public static final RegistryObject<EntityType<EvilScientistEntity>> EVIL_SCIENTIST;
    public static final RegistryObject<EntityType<EvilSniperEntity>> EVIL_SNIPER;
    public static final RegistryObject<EntityType<EvilMilitaryEntity>> EVIL_MILITARY;
    public static final RegistryObject<EntityType<TSCOutsiderEntity>> TSC_OUTSIDER;
    public static final RegistryObject<EntityType<TSCOutsiderGunnerEntity>> TSC_OUTSIDER_GUNNER;
    public static final RegistryObject<EntityType<TSCdroneEntity>> TS_CDRONE;
    public static final RegistryObject<EntityType<TSCHunterEntity>> TSC_HUNTER;
    public static final RegistryObject<EntityType<MilitaryRiotEntity>> MILITARY_RIOT;
    public static final RegistryObject<EntityType<TSCBerserkEntity>> TSC_BERSERK;
    public static final RegistryObject<EntityType<DarkLatexCreeperEntity>> DARK_LATEX_CREEPER;
    public static final RegistryObject<EntityType<DarkLatexCreeperEnhancedEntity>> DARK_LATEX_CREEPER_ENHANCED;
    public static final RegistryObject<EntityType<CivilianEntity>> CIVILIAN;
    public static final RegistryObject<EntityType<PrisionerEntity>> PRISIONER;
    public static final RegistryObject<EntityType<PrisionermilitiaEntity>> PRISIONERMILITIA;
    public static final RegistryObject<EntityType<CivlianMilitiaEntity>> CIVLIAN_MILITIA;
    public static final RegistryObject<EntityType<CrystalbowEntity>> CRYSTALBOW;
    public static final RegistryObject<EntityType<LatexcannonEntity>> LATEXCANNON;
    public static final RegistryObject<EntityType<RevolvingGooCannonEntity>> REVOLVING_GOO_CANNON;
    public static final RegistryObject<EntityType<DartrifleEntity>> DARTRIFLE;
    public static final RegistryObject<EntityType<MatchlockPistolEntity>> MATCHLOCK_PISTOL;
    public static final RegistryObject<EntityType<MatchLockMusketEntity>> MATCH_LOCK_MUSKET;
    public static final RegistryObject<EntityType<AR70AssaultRifleEntity>> AR_70_ASSAULT_RIFLE;
    public static final RegistryObject<EntityType<M4AssaultRifleEntity>> M_4_ASSAULT_RIFLE;
    public static final RegistryObject<EntityType<ScrapM16RifleEntity>> SCRAP_M_16_RIFLE;
    public static final RegistryObject<EntityType<TSCPistolEntity>> TSC_PISTOL;
    public static final RegistryObject<EntityType<OverundershotgunEntity>> OVERUNDERSHOTGUN;
    public static final RegistryObject<EntityType<FlamethowerEntity>> FLAMETHOWER;
    public static final RegistryObject<EntityType<LatexDartRifleEntity>> LATEX_DART_RIFLE;
    public static final RegistryObject<EntityType<DarkLatexFoxScientistEntity>> DARK_LATEX_FOX_SCIENTIST;
    public static final RegistryObject<EntityType<BeeHertxEntity>> BEE_HERTX;
    public static final RegistryObject<EntityType<AHVHertxEntity>> AHV_HERTX;
    public static final RegistryObject<EntityType<TankCannonEntity>> TANK_CANNON;
    public static final RegistryObject<EntityType<La4tankmorphrEntity>> LA_4TANKMORPHR;
    public static final RegistryObject<EntityType<La4tankmorphmEntity>> LA_4TANKMORPHM;
    public static final RegistryObject<EntityType<NXTHertxEntity>> NXT_HERTX;
    public static final RegistryObject<EntityType<DROPPODEntity>> DROPPOD;
    public static final RegistryObject<EntityType<SneppleEntity>> SNEPPLE;
    public static final RegistryObject<EntityType<AllydroppodEntity>> ALLYDROPPOD;
    public static final RegistryObject<EntityType<LatexDropPodEntity>> LATEX_DROP_POD;
    public static final RegistryObject<EntityType<HertxvarFEntity>> HERTXVAR_F;
    public static final RegistryObject<EntityType<HertxvarSolEntity>> HERTXVAR_SOL;
    public static final RegistryObject<EntityType<HertxvarFBEntity>> HERTXVAR_FB;
    public static final RegistryObject<EntityType<HertxSitEntity>> HERTX_SIT;
    public static final RegistryObject<EntityType<AshburyHertxEntity>> ASHBURY_HERTX;
    public static final RegistryObject<EntityType<AshburySitEntity>> ASHBURY_SIT;
    public static final RegistryObject<EntityType<BeeHertxSitEntity>> BEE_HERTX_SIT;
    public static final RegistryObject<EntityType<AHVHertxSitEntity>> AHV_HERTX_SIT;
    public static final RegistryObject<EntityType<NXTSitEntity>> NXT_SIT;
    public static final RegistryObject<EntityType<HertxFSitEntity>> HERTX_F_SIT;
    public static final RegistryObject<EntityType<HertxFBSitEntity>> HERTX_FB_SIT;
    public static final RegistryObject<EntityType<HertxSolWaitEntity>> HERTX_SOL_WAIT;
    public static final RegistryObject<EntityType<SlimelingTamedEntity>> SLIMELING_TAMED;
    public static final RegistryObject<EntityType<SlimelingtamedsitEntity>> SLIMELINGTAMEDSIT;
    public static final RegistryObject<EntityType<ProtectorSlimelingEntity>> PROTECTOR_SLIMELING;
    public static final RegistryObject<EntityType<ProtectorSlimelingsitEntity>> PROTECTOR_SLIMELINGSIT;
    public static final RegistryObject<EntityType<DarkLatexCakeEntity>> DARK_LATEX_CAKE;
    public static final RegistryObject<EntityType<DroneHertxWaitEntity>> DRONE_HERTX_WAIT;
    public static final RegistryObject<EntityType<ArmedDroneHertxWaitEntity>> ARMED_DRONE_HERTX_WAIT;
    public static final RegistryObject<EntityType<ExplosivegooEntity>> EXPLOSIVEGOO;
    public static final RegistryObject<EntityType<CivilianMilitiaMeleeEntity>> CIVILIAN_MILITIA_MELEE;
    public static final RegistryObject<EntityType<PrisionerMilitiaMeleeEntity>> PRISIONER_MILITIA_MELEE;

    public LatexModEntities() {
    }

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> {
            return entityTypeBuilder.build(registryname);
        });
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SlimelingEntity.init();
            DarklatexslugEntity.init();
            DarklatexEntity.init();
            DarkLatexCentaurEntity.init();
            DarkLatexSkeletonEntity.init();
            YufengEntity.init();
            NoiseStalkerEntity.init();
            DlsharkEntity.init();
            DarkLatexMothEntity.init();
            DarkLatexSnepEntity.init();
            DarkLatexFoxEntity.init();
            DarkLatexFoxSniperEntity.init();
            DarkLatexSnakeEntity.init();
            DarkLatexDragonEntity.init();
            DarkLatexSpiderEntity.init();
            DlSquidDogEntity.init();
            DLbeeEntity.init();
            DarkLatexQueenBeeEntity.init();
            DarkLatexSpiderQueenEntity.init();
            DarklatexconeEntity.init();
            HertxEntity.init();
            DroneHertxEntity.init();
            ArmedDroneHertxEntity.init();
            ScientistEntity.init();
            MilitaryEntity.init();
            MilitaryflameunitEntity.init();
            EvilScientistEntity.init();
            EvilSniperEntity.init();
            EvilMilitaryEntity.init();
            TSCOutsiderEntity.init();
            TSCOutsiderGunnerEntity.init();
            TSCdroneEntity.init();
            TSCHunterEntity.init();
            MilitaryRiotEntity.init();
            TSCBerserkEntity.init();
            DarkLatexCreeperEntity.init();
            DarkLatexCreeperEnhancedEntity.init();
            CivilianEntity.init();
            PrisionerEntity.init();
            PrisionermilitiaEntity.init();
            CivlianMilitiaEntity.init();
            DarkLatexFoxScientistEntity.init();
            BeeHertxEntity.init();
            AHVHertxEntity.init();
            La4tankmorphrEntity.init();
            La4tankmorphmEntity.init();
            NXTHertxEntity.init();
            DROPPODEntity.init();
            AllydroppodEntity.init();
            LatexDropPodEntity.init();
            HertxvarFEntity.init();
            HertxvarSolEntity.init();
            HertxvarFBEntity.init();
            HertxSitEntity.init();
            AshburyHertxEntity.init();
            AshburySitEntity.init();
            BeeHertxSitEntity.init();
            AHVHertxSitEntity.init();
            NXTSitEntity.init();
            HertxFSitEntity.init();
            HertxFBSitEntity.init();
            HertxSolWaitEntity.init();
            SlimelingTamedEntity.init();
            SlimelingtamedsitEntity.init();
            ProtectorSlimelingEntity.init();
            ProtectorSlimelingsitEntity.init();
            DarkLatexCakeEntity.init();
            DroneHertxWaitEntity.init();
            ArmedDroneHertxWaitEntity.init();
            CivilianMilitiaMeleeEntity.init();
            PrisionerMilitiaMeleeEntity.init();
        });
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, "turned");
        //CREATURES类
        DARK_LATEX_CENTAUR = register("slimeling", Builder.of((EntityType<DarkLatexCentaurEntity> type, Level world) -> new DarkLatexCentaurEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexCentaurEntity::new).sized(0.6F, 1.95F));
        DARK_LATEX_SKELETON = register("dark_latex_skeleton", Builder.of((EntityType<DarkLatexSkeletonEntity> type, Level world) -> new DarkLatexSkeletonEntity(type, world), MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSkeletonEntity::new).sized(0.6F, 1.95F));
        AHV_HERTX = register("ahv_hertx", Builder.of((EntityType<AHVHertxEntity> type, Level world) -> new AHVHertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AHVHertxEntity::new).sized(0.6F, 1.95F));
        ARMED_DRONE_HERTX = register("armed_drone_hertx", Builder.of((EntityType<ArmedDroneHertxEntity> type, Level world) -> new ArmedDroneHertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArmedDroneHertxEntity::new).sized(0.6F, 1.95F));
        ASHBURY_HERTX = register("ashbury_hertx", Builder.of((EntityType<AshburyHertxEntity> type, Level world) -> new AshburyHertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshburyHertxEntity::new).sized(0.6F, 1.95F));
        ASHBURY_SIT = register("ashbury_sit", Builder.of((EntityType<AshburySitEntity> type, Level world) -> new AshburySitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AshburySitEntity::new).sized(0.6F, 1.95F));
        BEE_HERTX = register("bee_hertx", Builder.of((EntityType<BeeHertxEntity> type, Level world) -> new BeeHertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeeHertxEntity::new).sized(0.6F, 1.95F));
        BEE_HERTX_SIT = register("bee_hertx_sit", Builder.of((EntityType<BeeHertxSitEntity> type, Level world) -> new BeeHertxSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeeHertxSitEntity::new).sized(0.6F, 1.95F));
        CIVILIAN = register("civilian", Builder.of((EntityType<CivilianEntity> type, Level world) -> new CivilianEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivilianEntity::new).sized(0.6F, 1.95F));
        CIVLIAN_MILITIA = register("civlian_militia", Builder.of((EntityType<CivlianMilitiaEntity> type, Level world) -> new CivlianMilitiaEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivlianMilitiaEntity::new).sized(0.6F, 1.95F));
        CIVILIAN_MILITIA_MELEE = register("civlian_militia_melee", Builder.of((EntityType<CivilianMilitiaMeleeEntity> type, Level world) -> new CivilianMilitiaMeleeEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivilianMilitiaMeleeEntity::new).sized(0.6F, 1.95F));
        DRONE_HERTX = register("drone_hertx", Builder.of((EntityType<DroneHertxEntity> type, Level world) -> new DroneHertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroneHertxEntity::new).sized(0.6F, 1.95F));
        HERTX = register("hertx", Builder.of((EntityType<HertxEntity> type, Level world) -> new HertxEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HertxEntity::new).sized(0.6F, 1.95F));
        HERTX_SIT = register("hertx_sit", Builder.of((EntityType<HertxSitEntity> type, Level world) -> new HertxSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HertxSitEntity::new).sized(0.6F, 1.95F));
        HERTXVAR_F = register("hertxvar_f", Builder.of((EntityType<HertxvarFEntity> type, Level world) -> new HertxvarFEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HertxvarFEntity::new).sized(0.6F, 1.95F));
        HERTXVAR_FB = register("hertxvar_fb", Builder.of((EntityType<HertxvarFBEntity> type, Level world) -> new HertxvarFBEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HertxvarFBEntity::new).sized(0.6F, 1.95F));
        HERTXVAR_SOL = register("hertxvar_sol", Builder.of((EntityType<HertxvarSolEntity> type, Level world) -> new HertxvarSolEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HertxvarSolEntity::new).sized(0.6F, 1.95F));
        MILITARY = register("military", Builder.of((EntityType<MilitaryEntity> type, Level world) -> new MilitaryEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MilitaryEntity::new).sized(0.6F, 1.95F));
        MILITARYFLAMEUNIT = register("militaryflameunit",Builder.of((EntityType<MilitaryflameunitEntity> type,Level world) -> new MilitaryflameunitEntity(type,world),MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MilitaryflameunitEntity::new).sized(0.6F, 1.8F));
        NXT_HERTX = register("nxt_hertx", Builder.of((EntityType<NXTHertxEntity> type,Level world)-> new NXTHertxEntity(type,world),MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NXTHertxEntity::new).sized(0.7F, 2.0F));
        PRISIONER = register("prisioner", Builder.of((EntityType<PrisionerEntity> type, Level world) -> new PrisionerEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrisionerEntity::new).sized(0.6F, 1.95F));
        PRISIONERMILITIA = register("prisionermilitia", Builder.of((EntityType<PrisionermilitiaEntity> type, Level world) -> new PrisionermilitiaEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrisionermilitiaEntity::new).sized(0.6F, 1.95F));
        SCIENTIST = register("scientist", Builder.of((EntityType<ScientistEntity> type, Level world) -> new ScientistEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScientistEntity::new).sized(0.6F, 1.95F));
        //SLIMELING = register("slimeling", Builder.of((EntityType<SlimelingEntity> type, Level world) -> new SlimelingEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingEntity::new).sized(0.6F, 1.95F));
        PRISIONER_MILITIA_MELEE = register("prisioner_militia_melee", Builder.of((EntityType<PrisionerMilitiaMeleeEntity> type, Level world) -> new PrisionerMilitiaMeleeEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrisionerMilitiaMeleeEntity::new).sized(0.6F, 1.95F));
        DRONE_HERTX_WAIT = register("drone_hertx_wait", Builder.of((EntityType<DroneHertxWaitEntity> type, Level world) -> new DroneHertxWaitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroneHertxWaitEntity::new).sized(0.6F, 1.95F));
        ARMED_DRONE_HERTX_WAIT =register("armed_drone_hertx_wait",Builder.of((EntityType<ArmedDroneHertxWaitEntity>type, Level world) -> new ArmedDroneHertxWaitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ArmedDroneHertxWaitEntity::new).fireImmune().sized(0.7F, 2.0F));
        DARK_LATEX_SPIDER = register("dark_latex_spider", Builder.of((EntityType<DarkLatexSpiderEntity> type, Level world) -> new DarkLatexSpiderEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSpiderEntity::new).sized(1.0F, 1.0F));
        EVIL_SCIENTIST = register("evil_scientist", Builder.of((EntityType<EvilScientistEntity> type,Level world) -> new EvilScientistEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilScientistEntity::new).sized(1.0F, 1.0F));
        EVIL_SNIPER  = register("evil_sniper",Builder.of((EntityType<EvilSniperEntity> type,Level world) -> new EvilSniperEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilSniperEntity::new).sized(1.0F, 1.0F));
        EVIL_MILITARY = register("evil_militery",Builder.of((EntityType<EvilMilitaryEntity> type,Level world) -> new EvilMilitaryEntity(type,world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvilMilitaryEntity::new).sized(1.0F, 1.0F));
        DL_SQUID_DOG = register("dl_squid_dog", Builder.of((EntityType<DlSquidDogEntity> type,Level world) -> new DlSquidDogEntity(type, world), MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DlSquidDogEntity::new).sized(0.8F, 2.2F));
        MILITARY_RIOT = register("military_riot", Builder.of((EntityType<MilitaryRiotEntity> type,Level world) -> new MilitaryRiotEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryRiotEntity::new).sized(0.6F, 1.8F));
        PROTECTOR_SLIMELING = register("protector_slimeling", Builder.of((EntityType<ProtectorSlimelingEntity> type,Level world) -> new ProtectorSlimelingEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(ProtectorSlimelingEntity::new).sized(0.6F, 2.0F));
        AHV_HERTX_SIT = register("ahv_hertx_sit", Builder.of((EntityType<AHVHertxSitEntity> type,Level world) -> new AHVHertxSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AHVHertxSitEntity::new).sized(0.8F, 1.2F));
        NXT_SIT = register("nxt_sit",Builder.of((EntityType<NXTSitEntity> type,Level world) -> new NXTSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(NXTSitEntity::new).sized(0.8F, 1.2F));
        HERTX_F_SIT = register("hertx_f_sit", Builder.of((EntityType<HertxFSitEntity> type,Level world) -> new HertxFSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFSitEntity::new).sized(0.8F, 1.2F));
        HERTX_FB_SIT = register("hertx_fb_sit", Builder.of((EntityType<HertxFBSitEntity> type,Level world) -> new HertxFBSitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFBSitEntity::new).sized(0.8F, 1.5F));
        HERTX_SOL_WAIT = register("hertx_sol_wait", Builder.of((EntityType<HertxSolWaitEntity> type,Level world) -> new HertxSolWaitEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HertxSolWaitEntity::new).sized(0.7F, 2.0F));
        SLIMELING_TAMED = register("slimeling_tamed",Builder.of((EntityType<SlimelingTamedEntity> type,Level world) -> new SlimelingTamedEntity(type, world), MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingTamedEntity::new).sized(0.6F, 2.0F));
        AR_70_ASSAULT_RIFLE = register("projectile_ar_70_assault_rifle", EntityType.Builder.<AR70AssaultRifleEntity>of(AR70AssaultRifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        M_4_ASSAULT_RIFLE = register("projectile_m_4_assault_rifle", EntityType.Builder.<M4AssaultRifleEntity>of(M4AssaultRifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        SCRAP_M_16_RIFLE = register("projectile_scrap_m_16_rifle", EntityType.Builder.<ScrapM16RifleEntity>of(ScrapM16RifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        TSC_PISTOL = register("projectile_tsc_pistol", EntityType.Builder.<TSCPistolEntity>of(TSCPistolEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        OVERUNDERSHOTGUN = register("projectile_overundershotgun", EntityType.Builder.<OverundershotgunEntity>of(OverundershotgunEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        FLAMETHOWER = register("projectile_flamethower", EntityType.Builder.<FlamethowerEntity>of(FlamethowerEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        LATEX_DART_RIFLE = register("projectile_latex_dart_rifle", EntityType.Builder.<LatexDartRifleEntity>of(LatexDartRifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        TANK_CANNON = register("projectile_tank_cannon", EntityType.Builder.<TankCannonEntity>of(TankCannonEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        SNEPPLE = register("projectile_snepple", EntityType.Builder.<SneppleEntity>of(SneppleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        EXPLOSIVEGOO = register("projectile_explosivegoo", EntityType.Builder.<ExplosivegooEntity>of(ExplosivegooEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        CRYSTALBOW = register("projectile_crystalbow", EntityType.Builder.<CrystalbowEntity>of(CrystalbowEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        LATEXCANNON = register("projectile_latexcannon", EntityType.Builder.<LatexcannonEntity>of(LatexcannonEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        REVOLVING_GOO_CANNON = register("projectile_revolving_goo_cannon", EntityType.Builder.<RevolvingGooCannonEntity>of(RevolvingGooCannonEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        DARTRIFLE = register("projectile_dartrifle", EntityType.Builder.<DartrifleEntity>of(DartrifleEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        MATCHLOCK_PISTOL = register("projectile_matchlock_pistol", EntityType.Builder.<MatchlockPistolEntity>of(MatchlockPistolEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        MATCH_LOCK_MUSKET = register("projectile_match_lock_musket", EntityType.Builder.<MatchLockMusketEntity>of(MatchLockMusketEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
        //MONSTER类
        LA_4TANKMORPHR = register("la4tankmorphr", EntityType.Builder.<La4tankmorphrEntity>of(La4tankmorphrEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        LA_4TANKMORPHM = register("la4tankmorphm", EntityType.Builder.<La4tankmorphmEntity>of(La4tankmorphmEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARKLATEXSLUG = register("darklatexslug", EntityType.Builder.<DarklatexslugEntity>of(DarklatexslugEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARKLATEX = register("darklatex", EntityType.Builder.<DarklatexEntity>of(DarklatexEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        NOISE_STALKER = register("noise_stalker", EntityType.Builder.<NoiseStalkerEntity>of(NoiseStalkerEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DLSHARK = register("dlshark", EntityType.Builder.<DlsharkEntity>of(DlsharkEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_MOTH = register("dark_latex_moth", EntityType.Builder.<DarkLatexMothEntity>of(DarkLatexMothEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_SNEP = register("dark_latex_snep", EntityType.Builder.<DarkLatexSnepEntity>of(DarkLatexSnepEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_FOX = register("dark_latex_fox", EntityType.Builder.<DarkLatexFoxEntity>of(DarkLatexFoxEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_FOX_SNIPER = register("dark_latex_fox_sniper", EntityType.Builder.<DarkLatexFoxSniperEntity>of(DarkLatexFoxSniperEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        //DARK_LATEX_SNAKE = register("dark_latex_snake", EntityType.Builder.<DarkLatexSnakeEntity>of(DarkLatexSnakeEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        D_LBEE = register("d_lbee", EntityType.Builder.<DLbeeEntity>of(DLbeeEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_QUEEN_BEE = register("dark_latex_queen_bee", EntityType.Builder.<DarkLatexQueenBeeEntity>of(DarkLatexQueenBeeEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_SPIDER_QUEEN = register("dark_latex_spider_queen", EntityType.Builder.<DarkLatexSpiderQueenEntity>of(DarkLatexSpiderQueenEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARKLATEXCONE = register("darklatexcone", EntityType.Builder.<DarklatexconeEntity>of(DarklatexconeEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        TSC_OUTSIDER = register("tsc_outsider", EntityType.Builder.<TSCOutsiderEntity>of(TSCOutsiderEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        TSC_OUTSIDER_GUNNER = register("tsc_outsider_gunner", EntityType.Builder.<TSCOutsiderGunnerEntity>of(TSCOutsiderGunnerEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        TS_CDRONE = register("ts_cdron", EntityType.Builder.<TSCdroneEntity>of(TSCdroneEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        TSC_HUNTER = register("tsc_hunter", EntityType.Builder.<TSCHunterEntity>of(TSCHunterEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        TSC_BERSERK = register("tsc_berserk", EntityType.Builder.<TSCBerserkEntity>of(TSCBerserkEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_CREEPER = register("dark_latex_creeper", EntityType.Builder.<DarkLatexCreeperEntity>of(DarkLatexCreeperEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_CREEPER_ENHANCED = register("dark_latex_creeper_enhanced", EntityType.Builder.<DarkLatexCreeperEnhancedEntity>of(DarkLatexCreeperEnhancedEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_FOX_SCIENTIST = register("dark_latex_fox_scientist", EntityType.Builder.<DarkLatexFoxScientistEntity>of(DarkLatexFoxScientistEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DROPPOD = register("droppod", EntityType.Builder.<DROPPODEntity>of(DROPPODEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        ALLYDROPPOD = register("allydroppod", EntityType.Builder.<AllydroppodEntity>of(AllydroppodEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        LATEX_DROP_POD = register("latex_drop_pod", EntityType.Builder.<LatexDropPodEntity>of(LatexDropPodEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        SLIMELINGTAMEDSIT = register("slimelingtamedsit", EntityType.Builder.<SlimelingtamedsitEntity>of(SlimelingtamedsitEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        PROTECTOR_SLIMELINGSIT = register("protector_slimelingsit", EntityType.Builder.<ProtectorSlimelingsitEntity>of(ProtectorSlimelingsitEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
        DARK_LATEX_CAKE = register("dark_latex_cake", EntityType.Builder.<DarkLatexCakeEntity>of(DarkLatexCakeEntity::new, MobCategory.MONSTER).sized(1.5F, 1.5F));
    }
}
