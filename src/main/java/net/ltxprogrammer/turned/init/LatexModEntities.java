/*     */ package net.ltxprogrammer.turned.init;
/*     */ import java.util.function.BiFunction;
/*     */ import net.ltxprogrammer.turned.entity.AHVHertxSitEntity;
/*     */ import net.ltxprogrammer.turned.entity.BeeHertxSitEntity;
/*     */ import net.ltxprogrammer.turned.entity.CivilianMilitiaMeleeEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexCreeperEnhancedEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderQueenEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*     */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*     */ import net.ltxprogrammer.turned.entity.HertxSitEntity;
/*     */ import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
/*     */ import net.ltxprogrammer.turned.entity.MilitaryflameunitEntity;
/*     */ import net.ltxprogrammer.turned.entity.NXTHertxEntity;
/*     */ import net.ltxprogrammer.turned.entity.NXTSitEntity;
/*     */ import net.ltxprogrammer.turned.entity.PrisionermilitiaEntity;
/*     */ import net.ltxprogrammer.turned.entity.TSCdroneEntity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class LatexModEntities {
/*  25 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, "turned");
/*  26 */   public static final RegistryObject<EntityType<SlimelingEntity>> SLIMELING = register("slimeling", 
/*  27 */       EntityType.Builder.m_20704_(SlimelingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/*  28 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingEntity::new)
/*     */       
/*  30 */       .m_20699_(0.6F, 2.0F));
/*  31 */   public static final RegistryObject<EntityType<DarklatexslugEntity>> DARKLATEXSLUG = register("darklatexslug", 
/*  32 */       EntityType.Builder.m_20704_(DarklatexslugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  33 */       .setTrackingRange(24).setUpdateInterval(3).setCustomClientFactory(DarklatexslugEntity::new)
/*     */       
/*  35 */       .m_20699_(0.8F, 0.4F));
/*  36 */   public static final RegistryObject<EntityType<DarklatexEntity>> DARKLATEX = register("darklatex", 
/*  37 */       EntityType.Builder.m_20704_(DarklatexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  38 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DarklatexEntity::new)
/*     */       
/*  40 */       .m_20699_(0.6F, 1.8F));
/*  41 */   public static final RegistryObject<EntityType<DarkLatexCentaurEntity>> DARK_LATEX_CENTAUR = register("dark_latex_centaur", 
/*  42 */       EntityType.Builder.m_20704_(DarkLatexCentaurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  43 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DarkLatexCentaurEntity::new)
/*     */       
/*  45 */       .m_20699_(1.2F, 2.25F));
/*  46 */   public static final RegistryObject<EntityType<DarkLatexSkeletonEntity>> DARK_LATEX_SKELETON = register("dark_latex_skeleton", 
/*  47 */       EntityType.Builder.m_20704_(DarkLatexSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  48 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DarkLatexSkeletonEntity::new)
/*     */       
/*  50 */       .m_20699_(0.6F, 1.8F));
/*  51 */   public static final RegistryObject<EntityType<NoiseStalkerEntity>> NOISE_STALKER = register("noise_stalker", 
/*  52 */       EntityType.Builder.m_20704_(NoiseStalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  53 */       .setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(NoiseStalkerEntity::new)
/*     */       
/*  55 */       .m_20699_(0.8F, 2.2F));
/*  56 */   public static final RegistryObject<EntityType<DlsharkEntity>> DLSHARK = register("dlshark", 
/*  57 */       EntityType.Builder.m_20704_(DlsharkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/*  58 */       .setUpdateInterval(3).setCustomClientFactory(DlsharkEntity::new)
/*     */       
/*  60 */       .m_20699_(0.6F, 1.8F));
/*  61 */   public static final RegistryObject<EntityType<DarkLatexMothEntity>> DARK_LATEX_MOTH = register("dark_latex_moth", 
/*  62 */       EntityType.Builder.m_20704_(DarkLatexMothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  63 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexMothEntity::new)
/*     */       
/*  65 */       .m_20699_(0.6F, 2.0F));
/*  66 */   public static final RegistryObject<EntityType<DarkLatexSnepEntity>> DARK_LATEX_SNEP = register("dark_latex_snep", 
/*  67 */       EntityType.Builder.m_20704_(DarkLatexSnepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  68 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSnepEntity::new)
/*     */       
/*  70 */       .m_20699_(0.6F, 2.0F));
/*  71 */   public static final RegistryObject<EntityType<DarkLatexFoxEntity>> DARK_LATEX_FOX = register("dark_latex_fox", 
/*  72 */       EntityType.Builder.m_20704_(DarkLatexFoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  73 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexFoxEntity::new)
/*     */       
/*  75 */       .m_20699_(0.6F, 1.8F));
/*  76 */   public static final RegistryObject<EntityType<DarkLatexFoxSniperEntity>> DARK_LATEX_FOX_SNIPER = register("dark_latex_fox_sniper", 
/*  77 */       EntityType.Builder.m_20704_(DarkLatexFoxSniperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  78 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexFoxSniperEntity::new)
/*     */       
/*  80 */       .m_20699_(0.6F, 1.9F));
/*  81 */   public static final RegistryObject<EntityType<DarkLatexSnakeEntity>> DARK_LATEX_SNAKE = register("dark_latex_snake", 
/*  82 */       EntityType.Builder.m_20704_(DarkLatexSnakeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  83 */       .setTrackingRange(124).setUpdateInterval(3).setCustomClientFactory(DarkLatexSnakeEntity::new)
/*     */       
/*  85 */       .m_20699_(0.6F, 1.9F));
/*  86 */   public static final RegistryObject<EntityType<DarkLatexSpiderEntity>> DARK_LATEX_SPIDER = register("dark_latex_spider", 
/*  87 */       EntityType.Builder.m_20704_(DarkLatexSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  88 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSpiderEntity::new)
/*     */       
/*  90 */       .m_20699_(0.8F, 2.0F));
/*  91 */   public static final RegistryObject<EntityType<DlSquidDogEntity>> DL_SQUID_DOG = register("dl_squid_dog", 
/*  92 */       EntityType.Builder.m_20704_(DlSquidDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/*  93 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DlSquidDogEntity::new)
/*     */       
/*  95 */       .m_20699_(0.8F, 2.2F));
/*  96 */   public static final RegistryObject<EntityType<DLbeeEntity>> D_LBEE = register("d_lbee", 
/*  97 */       EntityType.Builder.m_20704_(DLbeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/*  98 */       .setUpdateInterval(3).setCustomClientFactory(DLbeeEntity::new)
/*     */       
/* 100 */       .m_20699_(0.6F, 1.9F));
/* 101 */   public static final RegistryObject<EntityType<DarkLatexQueenBeeEntity>> DARK_LATEX_QUEEN_BEE = register("dark_latex_queen_bee", 
/* 102 */       EntityType.Builder.m_20704_(DarkLatexQueenBeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 103 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexQueenBeeEntity::new)
/*     */       
/* 105 */       .m_20699_(0.8F, 2.0F));
/* 106 */   public static final RegistryObject<EntityType<DarkLatexSpiderQueenEntity>> DARK_LATEX_SPIDER_QUEEN = register("dark_latex_spider_queen", 
/* 107 */       EntityType.Builder.m_20704_(DarkLatexSpiderQueenEntity::new, MobCategory.MONSTER)
/* 108 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 109 */       .setCustomClientFactory(DarkLatexSpiderQueenEntity::new)
/*     */       
/* 111 */       .m_20699_(1.2F, 3.6F));
/* 112 */   public static final RegistryObject<EntityType<DarklatexconeEntity>> DARKLATEXCONE = register("darklatexcone", 
/* 113 */       EntityType.Builder.m_20704_(DarklatexconeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 114 */       .setTrackingRange(84).setUpdateInterval(3).setCustomClientFactory(DarklatexconeEntity::new)
/*     */       
/* 116 */       .m_20699_(0.6F, 1.8F));
/* 117 */   public static final RegistryObject<EntityType<HertxEntity>> HERTX = register("hertx", 
/* 118 */       EntityType.Builder.m_20704_(HertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/* 119 */       .setUpdateInterval(3).setCustomClientFactory(HertxEntity::new)
/*     */       
/* 121 */       .m_20699_(0.7F, 2.0F));
/* 122 */   public static final RegistryObject<EntityType<DroneHertxEntity>> DRONE_HERTX = register("drone_hertx", 
/* 123 */       EntityType.Builder.m_20704_(DroneHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 124 */       .setTrackingRange(108).setUpdateInterval(3).setCustomClientFactory(DroneHertxEntity::new).m_20719_().m_20699_(0.7F, 2.0F));
/* 125 */   public static final RegistryObject<EntityType<ArmedDroneHertxEntity>> ARMED_DRONE_HERTX = register("armed_drone_hertx", 
/* 126 */       EntityType.Builder.m_20704_(ArmedDroneHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 127 */       .setTrackingRange(116).setUpdateInterval(3).setCustomClientFactory(ArmedDroneHertxEntity::new).m_20719_().m_20699_(0.7F, 2.0F));
/* 128 */   public static final RegistryObject<EntityType<ScientistEntity>> SCIENTIST = register("scientist", 
/* 129 */       EntityType.Builder.m_20704_(ScientistEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 130 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ScientistEntity::new)
/*     */       
/* 132 */       .m_20699_(0.6F, 1.8F));
/* 133 */   public static final RegistryObject<EntityType<MilitaryEntity>> MILITARY = register("military", 
/* 134 */       EntityType.Builder.m_20704_(MilitaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 135 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryEntity::new)
/*     */       
/* 137 */       .m_20699_(0.6F, 1.8F));
/* 138 */   public static final RegistryObject<EntityType<MilitaryflameunitEntity>> MILITARYFLAMEUNIT = register("militaryflameunit", 
/* 139 */       EntityType.Builder.m_20704_(MilitaryflameunitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 140 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryflameunitEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 141 */   public static final RegistryObject<EntityType<EvilScientistEntity>> EVIL_SCIENTIST = register("evil_scientist", 
/* 142 */       EntityType.Builder.m_20704_(EvilScientistEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 143 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(EvilScientistEntity::new)
/*     */       
/* 145 */       .m_20699_(0.6F, 1.8F));
/* 146 */   public static final RegistryObject<EntityType<EvilSniperEntity>> EVIL_SNIPER = register("evil_sniper", 
/* 147 */       EntityType.Builder.m_20704_(EvilSniperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 148 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EvilSniperEntity::new)
/*     */       
/* 150 */       .m_20699_(0.6F, 1.8F));
/* 151 */   public static final RegistryObject<EntityType<EvilMilitaryEntity>> EVIL_MILITARY = register("evil_military", 
/* 152 */       EntityType.Builder.m_20704_(EvilMilitaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 153 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(EvilMilitaryEntity::new)
/*     */       
/* 155 */       .m_20699_(0.6F, 1.8F));
/* 156 */   public static final RegistryObject<EntityType<TSCOutsiderEntity>> TSC_OUTSIDER = register("tsc_outsider", 
/* 157 */       EntityType.Builder.m_20704_(TSCOutsiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 158 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCOutsiderEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 159 */   public static final RegistryObject<EntityType<TSCOutsiderGunnerEntity>> TSC_OUTSIDER_GUNNER = register("tsc_outsider_gunner", 
/* 160 */       EntityType.Builder.m_20704_(TSCOutsiderGunnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 161 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCOutsiderGunnerEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 162 */   public static final RegistryObject<EntityType<TSCdroneEntity>> TS_CDRONE = register("ts_cdrone", 
/* 163 */       EntityType.Builder.m_20704_(TSCdroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 164 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCdroneEntity::new).m_20719_().m_20699_(0.6F, 1.8F));
/* 165 */   public static final RegistryObject<EntityType<TSCHunterEntity>> TSC_HUNTER = register("tsc_hunter", 
/* 166 */       EntityType.Builder.m_20704_(TSCHunterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 167 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCHunterEntity::new).m_20719_()
/* 168 */       .m_20699_(0.7F, 2.5F));
/* 169 */   public static final RegistryObject<EntityType<MilitaryRiotEntity>> MILITARY_RIOT = register("military_riot", 
/* 170 */       EntityType.Builder.m_20704_(MilitaryRiotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 171 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryRiotEntity::new)
/*     */       
/* 173 */       .m_20699_(0.6F, 1.8F));
/* 174 */   public static final RegistryObject<EntityType<TSCBerserkEntity>> TSC_BERSERK = register("tsc_berserk", 
/* 175 */       EntityType.Builder.m_20704_(TSCBerserkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 176 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCBerserkEntity::new).m_20719_().m_20699_(0.7F, 2.1F));
/* 177 */   public static final RegistryObject<EntityType<DarkLatexCreeperEntity>> DARK_LATEX_CREEPER = register("dark_latex_creeper", 
/* 178 */       EntityType.Builder.m_20704_(DarkLatexCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 179 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexCreeperEntity::new)
/*     */       
/* 181 */       .m_20699_(0.6F, 2.0F));
/* 182 */   public static final RegistryObject<EntityType<DarkLatexCreeperEnhancedEntity>> DARK_LATEX_CREEPER_ENHANCED = register("dark_latex_creeper_enhanced", 
/*     */       
/* 184 */       EntityType.Builder.m_20704_(DarkLatexCreeperEnhancedEntity::new, MobCategory.MONSTER)
/* 185 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 186 */       .setCustomClientFactory(DarkLatexCreeperEnhancedEntity::new)
/*     */       
/* 188 */       .m_20699_(0.8F, 3.0F));
/* 189 */   public static final RegistryObject<EntityType<CivilianEntity>> CIVILIAN = register("civilian", 
/* 190 */       EntityType.Builder.m_20704_(CivilianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 191 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivilianEntity::new)
/*     */       
/* 193 */       .m_20699_(0.6F, 1.8F));
/* 194 */   public static final RegistryObject<EntityType<PrisionerEntity>> PRISIONER = register("prisioner", 
/* 195 */       EntityType.Builder.m_20704_(PrisionerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 196 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrisionerEntity::new)
/*     */       
/* 198 */       .m_20699_(0.6F, 1.8F));
/* 199 */   public static final RegistryObject<EntityType<PrisionermilitiaEntity>> PRISIONERMILITIA = register("prisionermilitia", 
/* 200 */       EntityType.Builder.m_20704_(PrisionermilitiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 201 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PrisionermilitiaEntity::new)
/*     */       
/* 203 */       .m_20699_(0.6F, 1.8F));
/* 204 */   public static final RegistryObject<EntityType<CivlianMilitiaEntity>> CIVLIAN_MILITIA = register("civlian_militia", 
/* 205 */       EntityType.Builder.m_20704_(CivlianMilitiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 206 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CivlianMilitiaEntity::new)
/*     */       
/* 208 */       .m_20699_(0.6F, 1.8F));
/* 209 */   public static final RegistryObject<EntityType<CrystalbowEntity>> CRYSTALBOW = register("projectile_crystalbow", 
/* 210 */       EntityType.Builder.m_20704_(CrystalbowEntity::new, MobCategory.MISC).setCustomClientFactory(CrystalbowEntity::new)
/* 211 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 212 */   public static final RegistryObject<EntityType<LatexcannonEntity>> LATEXCANNON = register("projectile_latexcannon", 
/* 213 */       EntityType.Builder.m_20704_(LatexcannonEntity::new, MobCategory.MISC).setCustomClientFactory(LatexcannonEntity::new)
/* 214 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 215 */   public static final RegistryObject<EntityType<RevolvingGooCannonEntity>> REVOLVING_GOO_CANNON = register("projectile_revolving_goo_cannon", 
/* 216 */       EntityType.Builder.m_20704_(RevolvingGooCannonEntity::new, MobCategory.MISC)
/* 217 */       .setCustomClientFactory(RevolvingGooCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 218 */       .setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 219 */   public static final RegistryObject<EntityType<DartrifleEntity>> DARTRIFLE = register("projectile_dartrifle", 
/* 220 */       EntityType.Builder.m_20704_(DartrifleEntity::new, MobCategory.MISC).setCustomClientFactory(DartrifleEntity::new)
/* 221 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 222 */   public static final RegistryObject<EntityType<MatchlockPistolEntity>> MATCHLOCK_PISTOL = register("projectile_matchlock_pistol", 
/* 223 */       EntityType.Builder.m_20704_(MatchlockPistolEntity::new, MobCategory.MISC)
/* 224 */       .setCustomClientFactory(MatchlockPistolEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 225 */       .setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 226 */   public static final RegistryObject<EntityType<MatchLockMusketEntity>> MATCH_LOCK_MUSKET = register("projectile_match_lock_musket", 
/* 227 */       EntityType.Builder.m_20704_(MatchLockMusketEntity::new, MobCategory.MISC)
/* 228 */       .setCustomClientFactory(MatchLockMusketEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 229 */       .setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 230 */   public static final RegistryObject<EntityType<AR70AssaultRifleEntity>> AR_70_ASSAULT_RIFLE = register("projectile_ar_70_assault_rifle", 
/* 231 */       EntityType.Builder.m_20704_(AR70AssaultRifleEntity::new, MobCategory.MISC)
/* 232 */       .setCustomClientFactory(AR70AssaultRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 233 */       .setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 234 */   public static final RegistryObject<EntityType<M4AssaultRifleEntity>> M_4_ASSAULT_RIFLE = register("projectile_m_4_assault_rifle", 
/* 235 */       EntityType.Builder.m_20704_(M4AssaultRifleEntity::new, MobCategory.MISC).setCustomClientFactory(M4AssaultRifleEntity::new)
/* 236 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 237 */   public static final RegistryObject<EntityType<ScrapM16RifleEntity>> SCRAP_M_16_RIFLE = register("projectile_scrap_m_16_rifle", 
/* 238 */       EntityType.Builder.m_20704_(ScrapM16RifleEntity::new, MobCategory.MISC).setCustomClientFactory(ScrapM16RifleEntity::new)
/* 239 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 240 */   public static final RegistryObject<EntityType<TSCPistolEntity>> TSC_PISTOL = register("projectile_tsc_pistol", 
/* 241 */       EntityType.Builder.m_20704_(TSCPistolEntity::new, MobCategory.MISC).setCustomClientFactory(TSCPistolEntity::new)
/* 242 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 243 */   public static final RegistryObject<EntityType<OverundershotgunEntity>> OVERUNDERSHOTGUN = register("projectile_overundershotgun", 
/* 244 */       EntityType.Builder.m_20704_(OverundershotgunEntity::new, MobCategory.MISC)
/* 245 */       .setCustomClientFactory(OverundershotgunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 246 */       .setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 247 */   public static final RegistryObject<EntityType<FlamethowerEntity>> FLAMETHOWER = register("projectile_flamethower", 
/* 248 */       EntityType.Builder.m_20704_(FlamethowerEntity::new, MobCategory.MISC).setCustomClientFactory(FlamethowerEntity::new)
/* 249 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 250 */   public static final RegistryObject<EntityType<LatexDartRifleEntity>> LATEX_DART_RIFLE = register("projectile_latex_dart_rifle", 
/* 251 */       EntityType.Builder.m_20704_(LatexDartRifleEntity::new, MobCategory.MISC).setCustomClientFactory(LatexDartRifleEntity::new)
/* 252 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 253 */   public static final RegistryObject<EntityType<DarkLatexFoxScientistEntity>> DARK_LATEX_FOX_SCIENTIST = register("dark_latex_fox_scientist", 
/* 254 */       EntityType.Builder.m_20704_(DarkLatexFoxScientistEntity::new, MobCategory.MONSTER)
/* 255 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 256 */       .setCustomClientFactory(DarkLatexFoxScientistEntity::new)
/*     */       
/* 258 */       .m_20699_(0.6F, 1.8F));
/* 259 */   public static final RegistryObject<EntityType<BeeHertxEntity>> BEE_HERTX = register("bee_hertx", 
/* 260 */       EntityType.Builder.m_20704_(BeeHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 261 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BeeHertxEntity::new)
/*     */       
/* 263 */       .m_20699_(0.6F, 2.3F));
/* 264 */   public static final RegistryObject<EntityType<AHVHertxEntity>> AHV_HERTX = register("ahv_hertx", 
/* 265 */       EntityType.Builder.m_20704_(AHVHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 266 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AHVHertxEntity::new)
/*     */       
/* 268 */       .m_20699_(0.7F, 2.0F));
/* 269 */   public static final RegistryObject<EntityType<TankCannonEntity>> TANK_CANNON = register("projectile_tank_cannon", 
/* 270 */       EntityType.Builder.m_20704_(TankCannonEntity::new, MobCategory.MISC).setCustomClientFactory(TankCannonEntity::new)
/* 271 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 272 */   public static final RegistryObject<EntityType<La4tankmorphrEntity>> LA_4TANKMORPHR = register("la_4tankmorphr", 
/* 273 */       EntityType.Builder.m_20704_(La4tankmorphrEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 274 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(La4tankmorphrEntity::new).m_20719_()
/* 275 */       .m_20699_(1.1F, 4.2F));
/* 276 */   public static final RegistryObject<EntityType<La4tankmorphmEntity>> LA_4TANKMORPHM = register("la_4tankmorphm", 
/* 277 */       EntityType.Builder.m_20704_(La4tankmorphmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 278 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(La4tankmorphmEntity::new).m_20719_()
/* 279 */       .m_20699_(1.1F, 4.2F));
/* 280 */   public static final RegistryObject<EntityType<NXTHertxEntity>> NXT_HERTX = register("nxt_hertx", 
/* 281 */       EntityType.Builder.m_20704_(NXTHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 282 */       .setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(NXTHertxEntity::new)
/*     */       
/* 284 */       .m_20699_(0.7F, 2.0F));
/* 285 */   public static final RegistryObject<EntityType<DROPPODEntity>> DROPPOD = register("droppod", 
/* 286 */       EntityType.Builder.m_20704_(DROPPODEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
/* 287 */       .setUpdateInterval(3).setCustomClientFactory(DROPPODEntity::new).m_20719_().m_20699_(1.2F, 2.2F));
/* 288 */   public static final RegistryObject<EntityType<SneppleEntity>> SNEPPLE = register("projectile_snepple", 
/* 289 */       EntityType.Builder.m_20704_(SneppleEntity::new, MobCategory.MISC).setCustomClientFactory(SneppleEntity::new)
/* 290 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 291 */   public static final RegistryObject<EntityType<AllydroppodEntity>> ALLYDROPPOD = register("allydroppod", 
/* 292 */       EntityType.Builder.m_20704_(AllydroppodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 293 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AllydroppodEntity::new).m_20719_().m_20699_(1.2F, 2.2F));
/* 294 */   public static final RegistryObject<EntityType<LatexDropPodEntity>> LATEX_DROP_POD = register("latex_drop_pod", 
/* 295 */       EntityType.Builder.m_20704_(LatexDropPodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 296 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LatexDropPodEntity::new).m_20719_().m_20699_(1.2F, 2.2F));
/* 297 */   public static final RegistryObject<EntityType<HertxvarFEntity>> HERTXVAR_F = register("hertxvar_f", 
/* 298 */       EntityType.Builder.m_20704_(HertxvarFEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 299 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HertxvarFEntity::new)
/*     */       
/* 301 */       .m_20699_(0.7F, 2.0F));
/* 302 */   public static final RegistryObject<EntityType<HertxvarSolEntity>> HERTXVAR_SOL = register("hertxvar_sol", 
/* 303 */       EntityType.Builder.m_20704_(HertxvarSolEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 304 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HertxvarSolEntity::new)
/*     */       
/* 306 */       .m_20699_(0.7F, 2.0F));
/* 307 */   public static final RegistryObject<EntityType<HertxvarFBEntity>> HERTXVAR_FB = register("hertxvar_fb", 
/* 308 */       EntityType.Builder.m_20704_(HertxvarFBEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 309 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HertxvarFBEntity::new)
/*     */       
/* 311 */       .m_20699_(0.7F, 2.1F));
/* 312 */   public static final RegistryObject<EntityType<HertxSitEntity>> HERTX_SIT = register("hertx_sit", 
/* 313 */       EntityType.Builder.m_20704_(HertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 314 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxSitEntity::new)
/*     */       
/* 316 */       .m_20699_(0.8F, 1.2F));
/* 317 */   public static final RegistryObject<EntityType<AshburyHertxEntity>> ASHBURY_HERTX = register("ashbury_hertx", 
/* 318 */       EntityType.Builder.m_20704_(AshburyHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 319 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AshburyHertxEntity::new)
/*     */       
/* 321 */       .m_20699_(0.7F, 2.0F));
/* 322 */   public static final RegistryObject<EntityType<AshburySitEntity>> ASHBURY_SIT = register("ashbury_sit", 
/* 323 */       EntityType.Builder.m_20704_(AshburySitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 324 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AshburySitEntity::new)
/*     */       
/* 326 */       .m_20699_(0.8F, 1.2F));
/* 327 */   public static final RegistryObject<EntityType<BeeHertxSitEntity>> BEE_HERTX_SIT = register("bee_hertx_sit", 
/* 328 */       EntityType.Builder.m_20704_(BeeHertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 329 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BeeHertxSitEntity::new)
/*     */       
/* 331 */       .m_20699_(0.8F, 1.2F));
/* 332 */   public static final RegistryObject<EntityType<AHVHertxSitEntity>> AHV_HERTX_SIT = register("ahv_hertx_sit", 
/* 333 */       EntityType.Builder.m_20704_(AHVHertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 334 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AHVHertxSitEntity::new)
/*     */       
/* 336 */       .m_20699_(0.8F, 1.2F));
/* 337 */   public static final RegistryObject<EntityType<NXTSitEntity>> NXT_SIT = register("nxt_sit", 
/* 338 */       EntityType.Builder.m_20704_(NXTSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32)
/* 339 */       .setUpdateInterval(3).setCustomClientFactory(NXTSitEntity::new)
/*     */       
/* 341 */       .m_20699_(0.8F, 1.2F));
/* 342 */   public static final RegistryObject<EntityType<HertxFSitEntity>> HERTX_F_SIT = register("hertx_f_sit", 
/* 343 */       EntityType.Builder.m_20704_(HertxFSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 344 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFSitEntity::new)
/*     */       
/* 346 */       .m_20699_(0.8F, 1.2F));
/* 347 */   public static final RegistryObject<EntityType<HertxFBSitEntity>> HERTX_FB_SIT = register("hertx_fb_sit", 
/* 348 */       EntityType.Builder.m_20704_(HertxFBSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 349 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFBSitEntity::new)
/*     */       
/* 351 */       .m_20699_(0.8F, 1.5F));
/* 352 */   public static final RegistryObject<EntityType<HertxSolWaitEntity>> HERTX_SOL_WAIT = register("hertx_sol_wait", 
/* 353 */       EntityType.Builder.m_20704_(HertxSolWaitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 354 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HertxSolWaitEntity::new)
/*     */       
/* 356 */       .m_20699_(0.7F, 2.0F));
/* 357 */   public static final RegistryObject<EntityType<SlimelingTamedEntity>> SLIMELING_TAMED = register("slimeling_tamed", 
/* 358 */       EntityType.Builder.m_20704_(SlimelingTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 359 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingTamedEntity::new)
/*     */       
/* 361 */       .m_20699_(0.6F, 2.0F));
/* 362 */   public static final RegistryObject<EntityType<SlimelingtamedsitEntity>> SLIMELINGTAMEDSIT = register("slimelingtamedsit", 
/* 363 */       EntityType.Builder.m_20704_(SlimelingtamedsitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 364 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(SlimelingtamedsitEntity::new)
/*     */       
/* 366 */       .m_20699_(0.8F, 1.2F));
/* 367 */   public static final RegistryObject<EntityType<ProtectorSlimelingEntity>> PROTECTOR_SLIMELING = register("protector_slimeling", 
/* 368 */       EntityType.Builder.m_20704_(ProtectorSlimelingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 369 */       .setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(ProtectorSlimelingEntity::new)
/*     */       
/* 371 */       .m_20699_(0.6F, 2.0F));
/* 372 */   public static final RegistryObject<EntityType<ProtectorSlimelingsitEntity>> PROTECTOR_SLIMELINGSIT = register("protector_slimelingsit", 
/* 373 */       EntityType.Builder.m_20704_(ProtectorSlimelingsitEntity::new, MobCategory.MONSTER)
/* 374 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)
/* 375 */       .setCustomClientFactory(ProtectorSlimelingsitEntity::new)
/*     */       
/* 377 */       .m_20699_(0.8F, 1.2F));
/* 378 */   public static final RegistryObject<EntityType<DarkLatexCakeEntity>> DARK_LATEX_CAKE = register("dark_latex_cake", 
/* 379 */       EntityType.Builder.m_20704_(DarkLatexCakeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 380 */       .setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(DarkLatexCakeEntity::new)
/*     */       
/* 382 */       .m_20699_(0.6F, 1.8F));
/* 383 */   public static final RegistryObject<EntityType<DroneHertxWaitEntity>> DRONE_HERTX_WAIT = register("drone_hertx_wait", 
/* 384 */       EntityType.Builder.m_20704_(DroneHertxWaitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 385 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DroneHertxWaitEntity::new).m_20719_().m_20699_(0.7F, 1.2F));
/* 386 */   public static final RegistryObject<EntityType<ArmedDroneHertxWaitEntity>> ARMED_DRONE_HERTX_WAIT = register("armed_drone_hertx_wait", 
/* 387 */       EntityType.Builder.m_20704_(ArmedDroneHertxWaitEntity::new, MobCategory.CREATURE)
/* 388 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
/* 389 */       .setCustomClientFactory(ArmedDroneHertxWaitEntity::new).m_20719_().m_20699_(0.7F, 2.0F));
/* 390 */   public static final RegistryObject<EntityType<ExplosivegooEntity>> EXPLOSIVEGOO = register("projectile_explosivegoo", 
/* 391 */       EntityType.Builder.m_20704_(ExplosivegooEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosivegooEntity::new)
/* 392 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5F, 0.5F));
/* 393 */   public static final RegistryObject<EntityType<CivilianMilitiaMeleeEntity>> CIVILIAN_MILITIA_MELEE = register("civilian_militia_melee", 
/* 394 */       EntityType.Builder.m_20704_(CivilianMilitiaMeleeEntity::new, MobCategory.CREATURE)
/* 395 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
/* 396 */       .setCustomClientFactory(CivilianMilitiaMeleeEntity::new)
/*     */       
/* 398 */       .m_20699_(0.6F, 1.8F));
/* 399 */   public static final RegistryObject<EntityType<PrisionerMilitiaMeleeEntity>> PRISIONER_MILITIA_MELEE = register("prisioner_militia_melee", 
/* 400 */       EntityType.Builder.m_20704_(PrisionerMilitiaMeleeEntity::new, MobCategory.CREATURE)
/* 401 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
/* 402 */       .setCustomClientFactory(PrisionerMilitiaMeleeEntity::new)
/*     */       
/* 404 */       .m_20699_(0.6F, 1.8F));
/*     */   
/*     */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 407 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void init(FMLCommonSetupEvent event) {
/* 412 */     event.enqueueWork(() -> {
/*     */           SlimelingEntity.init();
/*     */           DarklatexslugEntity.init();
/*     */           DarklatexEntity.init();
/*     */           DarkLatexCentaurEntity.init();
/*     */           DarkLatexSkeletonEntity.init();
/*     */           NoiseStalkerEntity.init();
/*     */           DlsharkEntity.init();
/*     */           DarkLatexMothEntity.init();
/*     */           DarkLatexSnepEntity.init();
/*     */           DarkLatexFoxEntity.init();
/*     */           DarkLatexFoxSniperEntity.init();
/*     */           DarkLatexSnakeEntity.init();
/*     */           DarkLatexSpiderEntity.init();
/*     */           DlSquidDogEntity.init();
/*     */           DLbeeEntity.init();
/*     */           DarkLatexQueenBeeEntity.init();
/*     */           DarkLatexSpiderQueenEntity.init();
/*     */           DarklatexconeEntity.init();
/*     */           HertxEntity.init();
/*     */           DroneHertxEntity.init();
/*     */           ArmedDroneHertxEntity.init();
/*     */           ScientistEntity.init();
/*     */           MilitaryEntity.init();
/*     */           MilitaryflameunitEntity.init();
/*     */           EvilScientistEntity.init();
/*     */           EvilSniperEntity.init();
/*     */           EvilMilitaryEntity.init();
/*     */           TSCOutsiderEntity.init();
/*     */           TSCOutsiderGunnerEntity.init();
/*     */           TSCdroneEntity.init();
/*     */           TSCHunterEntity.init();
/*     */           MilitaryRiotEntity.init();
/*     */           TSCBerserkEntity.init();
/*     */           DarkLatexCreeperEntity.init();
/*     */           DarkLatexCreeperEnhancedEntity.init();
/*     */           CivilianEntity.init();
/*     */           PrisionerEntity.init();
/*     */           PrisionermilitiaEntity.init();
/*     */           CivlianMilitiaEntity.init();
/*     */           DarkLatexFoxScientistEntity.init();
/*     */           BeeHertxEntity.init();
/*     */           AHVHertxEntity.init();
/*     */           La4tankmorphrEntity.init();
/*     */           La4tankmorphmEntity.init();
/*     */           NXTHertxEntity.init();
/*     */           DROPPODEntity.init();
/*     */           AllydroppodEntity.init();
/*     */           LatexDropPodEntity.init();
/*     */           HertxvarFEntity.init();
/*     */           HertxvarSolEntity.init();
/*     */           HertxvarFBEntity.init();
/*     */           HertxSitEntity.init();
/*     */           AshburyHertxEntity.init();
/*     */           AshburySitEntity.init();
/*     */           BeeHertxSitEntity.init();
/*     */           AHVHertxSitEntity.init();
/*     */           NXTSitEntity.init();
/*     */           HertxFSitEntity.init();
/*     */           HertxFBSitEntity.init();
/*     */           HertxSolWaitEntity.init();
/*     */           SlimelingTamedEntity.init();
/*     */           SlimelingtamedsitEntity.init();
/*     */           ProtectorSlimelingEntity.init();
/*     */           ProtectorSlimelingsitEntity.init();
/*     */           DarkLatexCakeEntity.init();
/*     */           DroneHertxWaitEntity.init();
/*     */           ArmedDroneHertxWaitEntity.init();
/*     */           CivilianMilitiaMeleeEntity.init();
/*     */           PrisionerMilitiaMeleeEntity.init();
/*     */         });
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void registerAttributes(EntityAttributeCreationEvent event) {
/* 487 */     event.put((EntityType)SLIMELING.get(), SlimelingEntity.createAttributes().m_22265_());
/* 488 */     event.put((EntityType)DARKLATEXSLUG.get(), DarklatexslugEntity.createAttributes().m_22265_());
/* 489 */     event.put((EntityType)DARKLATEX.get(), DarklatexEntity.m_33035_().m_22265_());
/* 490 */     event.put((EntityType)DARK_LATEX_CENTAUR.get(), DarkLatexCentaurEntity.createAttributes().m_22265_());
/* 491 */     event.put((EntityType)DARK_LATEX_SKELETON.get(), DarkLatexSkeletonEntity.m_33035_().m_22265_());
/* 492 */     event.put((EntityType)NOISE_STALKER.get(), NoiseStalkerEntity.createAttributes().m_22265_());
/* 493 */     event.put((EntityType)DLSHARK.get(), LatexEntity.m_33035_().m_22265_());
/* 494 */     event.put((EntityType)DARK_LATEX_MOTH.get(), DarkLatexMothEntity.createAttributes().m_22265_());
/* 495 */     event.put((EntityType)DARK_LATEX_SNEP.get(), DarkLatexSnepEntity.m_33035_().m_22265_());
/* 496 */     event.put((EntityType)DARK_LATEX_FOX.get(), DarkLatexFoxEntity.m_33035_().m_22265_());
/* 497 */     event.put((EntityType)DARK_LATEX_FOX_SNIPER.get(), DarkLatexFoxSniperEntity.createAttributes().m_22265_());
/* 498 */     event.put((EntityType)DARK_LATEX_SNAKE.get(), DarkLatexSnakeEntity.createAttributes().m_22265_());
/* 499 */     event.put((EntityType)DARK_LATEX_SPIDER.get(), DarkLatexSpiderEntity.createAttributes().m_22265_());
/* 500 */     event.put((EntityType)DL_SQUID_DOG.get(), DlSquidDogEntity.createAttributes().m_22265_());
/* 501 */     event.put((EntityType)D_LBEE.get(), DLbeeEntity.createAttributes().m_22265_());
/* 502 */     event.put((EntityType)DARK_LATEX_QUEEN_BEE.get(), DarkLatexQueenBeeEntity.createAttributes().m_22265_());
/* 503 */     event.put((EntityType)DARK_LATEX_SPIDER_QUEEN.get(), DarkLatexSpiderQueenEntity.createAttributes().m_22265_());
/* 504 */     event.put((EntityType)DARKLATEXCONE.get(), DarklatexconeEntity.m_33035_().m_22265_());
/* 505 */     event.put((EntityType)HERTX.get(), HertxEntity.createAttributes().m_22265_());
/* 506 */     event.put((EntityType)DRONE_HERTX.get(), DroneHertxEntity.createAttributes().m_22265_());
/* 507 */     event.put((EntityType)ARMED_DRONE_HERTX.get(), ArmedDroneHertxEntity.createAttributes().m_22265_());
/* 508 */     event.put((EntityType)SCIENTIST.get(), ScientistEntity.createAttributes().m_22265_());
/* 509 */     event.put((EntityType)MILITARY.get(), MilitaryEntity.createAttributes().m_22265_());
/* 510 */     event.put((EntityType)MILITARYFLAMEUNIT.get(), MilitaryflameunitEntity.createAttributes().m_22265_());
/* 511 */     event.put((EntityType)EVIL_SCIENTIST.get(), EvilScientistEntity.createAttributes().m_22265_());
/* 512 */     event.put((EntityType)EVIL_SNIPER.get(), EvilSniperEntity.createAttributes().m_22265_());
/* 513 */     event.put((EntityType)EVIL_MILITARY.get(), EvilMilitaryEntity.createAttributes().m_22265_());
/* 514 */     event.put((EntityType)TSC_OUTSIDER.get(), TSCOutsiderEntity.createAttributes().m_22265_());
/* 515 */     event.put((EntityType)TSC_OUTSIDER_GUNNER.get(), TSCOutsiderGunnerEntity.createAttributes().m_22265_());
/* 516 */     event.put((EntityType)TS_CDRONE.get(), TSCdroneEntity.createAttributes().m_22265_());
/* 517 */     event.put((EntityType)TSC_HUNTER.get(), TSCHunterEntity.createAttributes().m_22265_());
/* 518 */     event.put((EntityType)MILITARY_RIOT.get(), MilitaryRiotEntity.createAttributes().m_22265_());
/* 519 */     event.put((EntityType)TSC_BERSERK.get(), TSCBerserkEntity.createAttributes().m_22265_());
/* 520 */     event.put((EntityType)DARK_LATEX_CREEPER.get(), DarkLatexCreeperEntity.createAttributes().m_22265_());
/* 521 */     event.put((EntityType)DARK_LATEX_CREEPER_ENHANCED.get(), DarkLatexCreeperEnhancedEntity.createAttributes().m_22265_());
/* 522 */     event.put((EntityType)CIVILIAN.get(), CivilianEntity.createAttributes().m_22265_());
/* 523 */     event.put((EntityType)PRISIONER.get(), PrisionerEntity.createAttributes().m_22265_());
/* 524 */     event.put((EntityType)PRISIONERMILITIA.get(), PrisionermilitiaEntity.createAttributes().m_22265_());
/* 525 */     event.put((EntityType)CIVLIAN_MILITIA.get(), CivlianMilitiaEntity.createAttributes().m_22265_());
/* 526 */     event.put((EntityType)DARK_LATEX_FOX_SCIENTIST.get(), DarkLatexFoxScientistEntity.createAttributes().m_22265_());
/* 527 */     event.put((EntityType)BEE_HERTX.get(), BeeHertxEntity.createAttributes().m_22265_());
/* 528 */     event.put((EntityType)AHV_HERTX.get(), AHVHertxEntity.createAttributes().m_22265_());
/* 529 */     event.put((EntityType)LA_4TANKMORPHR.get(), La4tankmorphrEntity.createAttributes().m_22265_());
/* 530 */     event.put((EntityType)LA_4TANKMORPHM.get(), La4tankmorphmEntity.createAttributes().m_22265_());
/* 531 */     event.put((EntityType)NXT_HERTX.get(), NXTHertxEntity.createAttributes().m_22265_());
/* 532 */     event.put((EntityType)DROPPOD.get(), DROPPODEntity.createAttributes().m_22265_());
/* 533 */     event.put((EntityType)ALLYDROPPOD.get(), AllydroppodEntity.createAttributes().m_22265_());
/* 534 */     event.put((EntityType)LATEX_DROP_POD.get(), LatexDropPodEntity.createAttributes().m_22265_());
/* 535 */     event.put((EntityType)HERTXVAR_F.get(), HertxvarFEntity.createAttributes().m_22265_());
/* 536 */     event.put((EntityType)HERTXVAR_SOL.get(), HertxvarSolEntity.createAttributes().m_22265_());
/* 537 */     event.put((EntityType)HERTXVAR_FB.get(), HertxvarFBEntity.createAttributes().m_22265_());
/* 538 */     event.put((EntityType)HERTX_SIT.get(), HertxSitEntity.createAttributes().m_22265_());
/* 539 */     event.put((EntityType)ASHBURY_HERTX.get(), AshburyHertxEntity.createAttributes().m_22265_());
/* 540 */     event.put((EntityType)ASHBURY_SIT.get(), AshburySitEntity.createAttributes().m_22265_());
/* 541 */     event.put((EntityType)BEE_HERTX_SIT.get(), BeeHertxSitEntity.createAttributes().m_22265_());
/* 542 */     event.put((EntityType)AHV_HERTX_SIT.get(), AHVHertxSitEntity.createAttributes().m_22265_());
/* 543 */     event.put((EntityType)NXT_SIT.get(), NXTSitEntity.createAttributes().m_22265_());
/* 544 */     event.put((EntityType)HERTX_F_SIT.get(), HertxFSitEntity.createAttributes().m_22265_());
/* 545 */     event.put((EntityType)HERTX_FB_SIT.get(), HertxFBSitEntity.createAttributes().m_22265_());
/* 546 */     event.put((EntityType)HERTX_SOL_WAIT.get(), HertxSolWaitEntity.createAttributes().m_22265_());
/* 547 */     event.put((EntityType)SLIMELING_TAMED.get(), SlimelingTamedEntity.createAttributes().m_22265_());
/* 548 */     event.put((EntityType)SLIMELINGTAMEDSIT.get(), SlimelingtamedsitEntity.createAttributes().m_22265_());
/* 549 */     event.put((EntityType)PROTECTOR_SLIMELING.get(), ProtectorSlimelingEntity.createAttributes().m_22265_());
/* 550 */     event.put((EntityType)PROTECTOR_SLIMELINGSIT.get(), ProtectorSlimelingsitEntity.createAttributes().m_22265_());
/* 551 */     event.put((EntityType)DARK_LATEX_CAKE.get(), DarkLatexCakeEntity.m_33035_().m_22265_());
/* 552 */     event.put((EntityType)DRONE_HERTX_WAIT.get(), DroneHertxWaitEntity.createAttributes().m_22265_());
/* 553 */     event.put((EntityType)ARMED_DRONE_HERTX_WAIT.get(), ArmedDroneHertxWaitEntity.createAttributes().m_22265_());
/* 554 */     event.put((EntityType)CIVILIAN_MILITIA_MELEE.get(), CivilianMilitiaMeleeEntity.createAttributes().m_22265_());
/* 555 */     event.put((EntityType)PRISIONER_MILITIA_MELEE.get(), PrisionerMilitiaMeleeEntity.createAttributes().m_22265_());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */