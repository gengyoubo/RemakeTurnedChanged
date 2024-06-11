/*     */ package net.mcreator.latexes.init;
/*     */ 
/*     */ import java.util.function.BiFunction;
/*     */ import net.mcreator.latexes.entity.AHVHertxEntity;
/*     */ import net.mcreator.latexes.entity.AHVHertxSitEntity;
/*     */ import net.mcreator.latexes.entity.AR70AssaultRifleEntity;
/*     */ import net.mcreator.latexes.entity.AllydroppodEntity;
/*     */ import net.mcreator.latexes.entity.ArmedDroneHertxEntity;
/*     */ import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
/*     */ import net.mcreator.latexes.entity.AshburyHertxEntity;
/*     */ import net.mcreator.latexes.entity.AshburySitEntity;
/*     */ import net.mcreator.latexes.entity.BeeHertxEntity;
/*     */ import net.mcreator.latexes.entity.BeeHertxSitEntity;
/*     */ import net.mcreator.latexes.entity.CivilianEntity;
/*     */ import net.mcreator.latexes.entity.CivilianMilitiaMeleeEntity;
/*     */ import net.mcreator.latexes.entity.CivlianMilitiaEntity;
/*     */ import net.mcreator.latexes.entity.CrystalbowEntity;
/*     */ import net.mcreator.latexes.entity.DLbeeEntity;
/*     */ import net.mcreator.latexes.entity.DROPPODEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexCakeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexCentaurEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexDragonEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexMothEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSnepEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*     */ import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexconeEntity;
/*     */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*     */ import net.mcreator.latexes.entity.DartrifleEntity;
/*     */ import net.mcreator.latexes.entity.DlSquidDogEntity;
/*     */ import net.mcreator.latexes.entity.DlsharkEntity;
/*     */ import net.mcreator.latexes.entity.DroneHertxEntity;
/*     */ import net.mcreator.latexes.entity.DroneHertxWaitEntity;
/*     */ import net.mcreator.latexes.entity.EvilMilitaryEntity;
/*     */ import net.mcreator.latexes.entity.EvilScientistEntity;
/*     */ import net.mcreator.latexes.entity.EvilSniperEntity;
/*     */ import net.mcreator.latexes.entity.ExplosivegooEntity;
/*     */ import net.mcreator.latexes.entity.FlamethowerEntity;
/*     */ import net.mcreator.latexes.entity.HertxEntity;
/*     */ import net.mcreator.latexes.entity.HertxFBSitEntity;
/*     */ import net.mcreator.latexes.entity.HertxFSitEntity;
/*     */ import net.mcreator.latexes.entity.HertxSitEntity;
/*     */ import net.mcreator.latexes.entity.HertxSolWaitEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarFBEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarFEntity;
/*     */ import net.mcreator.latexes.entity.HertxvarSolEntity;
/*     */ import net.mcreator.latexes.entity.La4tankmorphmEntity;
/*     */ import net.mcreator.latexes.entity.La4tankmorphrEntity;
/*     */ import net.mcreator.latexes.entity.LatexDartRifleEntity;
/*     */ import net.mcreator.latexes.entity.LatexDropPodEntity;
/*     */ import net.mcreator.latexes.entity.LatexcannonEntity;
/*     */ import net.mcreator.latexes.entity.M4AssaultRifleEntity;
/*     */ import net.mcreator.latexes.entity.MatchLockMusketEntity;
/*     */ import net.mcreator.latexes.entity.MatchlockPistolEntity;
/*     */ import net.mcreator.latexes.entity.MilitaryEntity;
/*     */ import net.mcreator.latexes.entity.MilitaryRiotEntity;
/*     */ import net.mcreator.latexes.entity.MilitaryflameunitEntity;
/*     */ import net.mcreator.latexes.entity.NXTHertxEntity;
/*     */ import net.mcreator.latexes.entity.NXTSitEntity;
/*     */ import net.mcreator.latexes.entity.NoiseStalkerEntity;
/*     */ import net.mcreator.latexes.entity.OverundershotgunEntity;
/*     */ import net.mcreator.latexes.entity.PrisionerEntity;
/*     */ import net.mcreator.latexes.entity.PrisionerMilitiaMeleeEntity;
/*     */ import net.mcreator.latexes.entity.PrisionermilitiaEntity;
/*     */ import net.mcreator.latexes.entity.ProtectorSlimelingEntity;
/*     */ import net.mcreator.latexes.entity.ProtectorSlimelingsitEntity;
/*     */ import net.mcreator.latexes.entity.RevolvingGooCannonEntity;
/*     */ import net.mcreator.latexes.entity.ScientistEntity;
/*     */ import net.mcreator.latexes.entity.ScrapM16RifleEntity;
/*     */ import net.mcreator.latexes.entity.SlimelingEntity;
/*     */ import net.mcreator.latexes.entity.SlimelingTamedEntity;
/*     */ import net.mcreator.latexes.entity.SlimelingtamedsitEntity;
/*     */ import net.mcreator.latexes.entity.SneppleEntity;
/*     */ import net.mcreator.latexes.entity.TSCBerserkEntity;
/*     */ import net.mcreator.latexes.entity.TSCHunterEntity;
/*     */ import net.mcreator.latexes.entity.TSCOutsiderEntity;
/*     */ import net.mcreator.latexes.entity.TSCOutsiderGunnerEntity;
/*     */ import net.mcreator.latexes.entity.TSCPistolEntity;
/*     */ import net.mcreator.latexes.entity.TSCdroneEntity;
/*     */ import net.mcreator.latexes.entity.TankCannonEntity;
/*     */ import net.mcreator.latexes.entity.YufengEntity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*     */ import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*     */ public class LatexModEntities
/*     */ {
/* 110 */   public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, "latex");
/* 111 */   public static final RegistryObject<EntityType<SlimelingEntity>> SLIMELING = register("slimeling", 
/* 112 */       EntityType.Builder.of(SlimelingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 113 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingEntity::new)
/*     */       
/* 115 */       .sized(0.6F, 2.0F));
/* 116 */   public static final RegistryObject<EntityType<DarklatexslugEntity>> DARKLATEXSLUG = register("darklatexslug", 
/* 117 */       EntityType.Builder.of(DarklatexslugEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 118 */       .setTrackingRange(24).setUpdateInterval(3).setCustomClientFactory(DarklatexslugEntity::new)
/*     */       
/* 120 */       .sized(0.8F, 0.4F));
/* 121 */   public static final RegistryObject<EntityType<DarklatexEntity>> DARKLATEX = register("darklatex", 
/* 122 */       EntityType.Builder.of(DarklatexEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 123 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DarklatexEntity::new)
/*     */       
/* 125 */       .sized(0.6F, 1.8F));
/* 126 */   public static final RegistryObject<EntityType<DarkLatexCentaurEntity>> DARK_LATEX_CENTAUR = register("dark_latex_centaur", 
/* 127 */       EntityType.Builder.of(DarkLatexCentaurEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 128 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DarkLatexCentaurEntity::new)
/*     */       
/* 130 */       .sized(0.4F, 0.7F));
/* 131 */   public static final RegistryObject<EntityType<DarkLatexSkeletonEntity>> DARK_LATEX_SKELETON = register("dark_latex_skeleton", 
/* 132 */       EntityType.Builder.of(DarkLatexSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 133 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DarkLatexSkeletonEntity::new)
/*     */       
/* 135 */       .sized(0.6F, 1.8F));
/* 136 */   public static final RegistryObject<EntityType<YufengEntity>> YUFENG = register("yufeng", 
/* 137 */       EntityType.Builder.of(YufengEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
/* 138 */       .setUpdateInterval(3).setCustomClientFactory(YufengEntity::new)
/*     */       
/* 140 */       .sized(0.6F, 1.9F));
/* 141 */   public static final RegistryObject<EntityType<NoiseStalkerEntity>> NOISE_STALKER = register("noise_stalker", 
/* 142 */       EntityType.Builder.of(NoiseStalkerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 143 */       .setTrackingRange(48).setUpdateInterval(3).setCustomClientFactory(NoiseStalkerEntity::new)
/*     */       
/* 145 */       .sized(0.8F, 2.2F));
/* 146 */   public static final RegistryObject<EntityType<DlsharkEntity>> DLSHARK = register("dlshark", 
/* 147 */       EntityType.Builder.of(DlsharkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/* 148 */       .setUpdateInterval(3).setCustomClientFactory(DlsharkEntity::new)
/*     */       
/* 150 */       .sized(0.6F, 1.8F));
/* 151 */   public static final RegistryObject<EntityType<DarkLatexMothEntity>> DARK_LATEX_MOTH = register("dark_latex_moth", 
/* 152 */       EntityType.Builder.of(DarkLatexMothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 153 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexMothEntity::new)
/*     */       
/* 155 */       .sized(0.6F, 2.0F));
/* 156 */   public static final RegistryObject<EntityType<DarkLatexSnepEntity>> DARK_LATEX_SNEP = register("dark_latex_snep", 
/* 157 */       EntityType.Builder.of(DarkLatexSnepEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 158 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSnepEntity::new)
/*     */       
/* 160 */       .sized(0.4F, 2.0F));
/* 161 */   public static final RegistryObject<EntityType<DarkLatexFoxEntity>> DARK_LATEX_FOX = register("dark_latex_fox", 
/* 162 */       EntityType.Builder.of(DarkLatexFoxEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 163 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexFoxEntity::new)
/*     */       
/* 165 */       .sized(0.6F, 1.8F));
/* 166 */   public static final RegistryObject<EntityType<DarkLatexFoxSniperEntity>> DARK_LATEX_FOX_SNIPER = register("dark_latex_fox_sniper", 
/* 167 */       EntityType.Builder.of(DarkLatexFoxSniperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 168 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexFoxSniperEntity::new)
/*     */       
/* 170 */       .sized(0.6F, 1.9F));
/* 171 */   public static final RegistryObject<EntityType<DarkLatexSnakeEntity>> DARK_LATEX_SNAKE = register("dark_latex_snake", 
/* 172 */       EntityType.Builder.of(DarkLatexSnakeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 173 */       .setTrackingRange(124).setUpdateInterval(3).setCustomClientFactory(DarkLatexSnakeEntity::new)
/*     */       
/* 175 */       .sized(0.5F, 3.4F));
/* 176 */   public static final RegistryObject<EntityType<DarkLatexDragonEntity>> DARK_LATEX_DRAGON = register("dark_latex_dragon", 
/* 177 */       EntityType.Builder.of(DarkLatexDragonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 178 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(DarkLatexDragonEntity::new)
/*     */       
/* 180 */       .sized(1.0F, 2.5F));
/* 181 */   public static final RegistryObject<EntityType<DarkLatexSpiderEntity>> DARK_LATEX_SPIDER = register("dark_latex_spider", 
/* 182 */       EntityType.Builder.of(DarkLatexSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 183 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexSpiderEntity::new)
/*     */       
/* 185 */       .sized(0.8F, 2.0F));
/* 186 */   public static final RegistryObject<EntityType<DlSquidDogEntity>> DL_SQUID_DOG = register("dl_squid_dog", 
/* 187 */       EntityType.Builder.of(DlSquidDogEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 188 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DlSquidDogEntity::new)
/*     */       
/* 190 */       .sized(0.8F, 2.2F));
/* 191 */   public static final RegistryObject<EntityType<DLbeeEntity>> D_LBEE = register("d_lbee", 
/* 192 */       EntityType.Builder.of(DLbeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/* 193 */       .setUpdateInterval(3).setCustomClientFactory(DLbeeEntity::new)
/*     */       
/* 195 */       .sized(0.6F, 1.9F));
/* 196 */   public static final RegistryObject<EntityType<DarkLatexQueenBeeEntity>> DARK_LATEX_QUEEN_BEE = register("dark_latex_queen_bee", 
/* 197 */       EntityType.Builder.of(DarkLatexQueenBeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 198 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexQueenBeeEntity::new)
/*     */       
/* 200 */       .sized(0.8F, 2.0F));
/* 201 */   public static final RegistryObject<EntityType<DarkLatexSpiderQueenEntity>> DARK_LATEX_SPIDER_QUEEN = register("dark_latex_spider_queen", 
/* 202 */       EntityType.Builder.of(DarkLatexSpiderQueenEntity::new, MobCategory.MONSTER)
/* 203 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 204 */       .setCustomClientFactory(DarkLatexSpiderQueenEntity::new)
/*     */       
/* 206 */       .sized(1.2F, 3.6F));
/* 207 */   public static final RegistryObject<EntityType<DarklatexconeEntity>> DARKLATEXCONE = register("darklatexcone", 
/* 208 */       EntityType.Builder.of(DarklatexconeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 209 */       .setTrackingRange(84).setUpdateInterval(3).setCustomClientFactory(DarklatexconeEntity::new)
/*     */       
/* 211 */       .sized(0.6F, 1.8F));
/* 212 */   public static final RegistryObject<EntityType<HertxEntity>> HERTX = register("hertx", 
/* 213 */       EntityType.Builder.of(HertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(96)
/* 214 */       .setUpdateInterval(3).setCustomClientFactory(HertxEntity::new)
/*     */       
/* 216 */       .sized(0.7F, 2.0F));
/* 217 */   public static final RegistryObject<EntityType<DroneHertxEntity>> DRONE_HERTX = register("drone_hertx", 
/* 218 */       EntityType.Builder.of(DroneHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 219 */       .setTrackingRange(108).setUpdateInterval(3).setCustomClientFactory(DroneHertxEntity::new).fireImmune().sized(0.7F, 2.0F));
/* 220 */   public static final RegistryObject<EntityType<ArmedDroneHertxEntity>> ARMED_DRONE_HERTX = register("armed_drone_hertx", 
/* 221 */       EntityType.Builder.of(ArmedDroneHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 222 */       .setTrackingRange(116).setUpdateInterval(3).setCustomClientFactory(ArmedDroneHertxEntity::new).fireImmune().sized(0.7F, 2.0F));
/* 223 */   public static final RegistryObject<EntityType<ScientistEntity>> SCIENTIST = register("scientist", 
/* 224 */       EntityType.Builder.of(ScientistEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 225 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(ScientistEntity::new)
/*     */       
/* 227 */       .sized(0.6F, 1.8F));
/* 228 */   public static final RegistryObject<EntityType<MilitaryEntity>> MILITARY = register("military", 
/* 229 */       EntityType.Builder.of(MilitaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 230 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryEntity::new)
/*     */       
/* 232 */       .sized(0.6F, 1.8F));
/* 233 */   public static final RegistryObject<EntityType<MilitaryflameunitEntity>> MILITARYFLAMEUNIT = register("militaryflameunit", 
/* 234 */       EntityType.Builder.of(MilitaryflameunitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 235 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryflameunitEntity::new).fireImmune().sized(0.6F, 1.8F));
/* 236 */   public static final RegistryObject<EntityType<EvilScientistEntity>> EVIL_SCIENTIST = register("evil_scientist", 
/* 237 */       EntityType.Builder.of(EvilScientistEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 238 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(EvilScientistEntity::new)
/*     */       
/* 240 */       .sized(0.6F, 1.8F));
/* 241 */   public static final RegistryObject<EntityType<EvilSniperEntity>> EVIL_SNIPER = register("evil_sniper", 
/* 242 */       EntityType.Builder.of(EvilSniperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 243 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(EvilSniperEntity::new)
/*     */       
/* 245 */       .sized(0.6F, 1.8F));
/* 246 */   public static final RegistryObject<EntityType<EvilMilitaryEntity>> EVIL_MILITARY = register("evil_military", 
/* 247 */       EntityType.Builder.of(EvilMilitaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 248 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(EvilMilitaryEntity::new)
/*     */       
/* 250 */       .sized(0.6F, 1.8F));
/* 251 */   public static final RegistryObject<EntityType<TSCOutsiderEntity>> TSC_OUTSIDER = register("tsc_outsider", 
/* 252 */       EntityType.Builder.of(TSCOutsiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 253 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCOutsiderEntity::new).fireImmune().sized(0.6F, 1.8F));
/* 254 */   public static final RegistryObject<EntityType<TSCOutsiderGunnerEntity>> TSC_OUTSIDER_GUNNER = register("tsc_outsider_gunner", 
/* 255 */       EntityType.Builder.of(TSCOutsiderGunnerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 256 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCOutsiderGunnerEntity::new).fireImmune().sized(0.6F, 1.8F));
/* 257 */   public static final RegistryObject<EntityType<TSCdroneEntity>> TS_CDRONE = register("ts_cdrone", 
/* 258 */       EntityType.Builder.of(TSCdroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 259 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCdroneEntity::new).fireImmune().sized(0.6F, 1.8F));
/* 260 */   public static final RegistryObject<EntityType<TSCHunterEntity>> TSC_HUNTER = register("tsc_hunter", 
/* 261 */       EntityType.Builder.of(TSCHunterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 262 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCHunterEntity::new).fireImmune()
/* 263 */       .sized(0.7F, 2.5F));
/* 264 */   public static final RegistryObject<EntityType<MilitaryRiotEntity>> MILITARY_RIOT = register("military_riot", 
/* 265 */       EntityType.Builder.of(MilitaryRiotEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 266 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(MilitaryRiotEntity::new)
/*     */       
/* 268 */       .sized(0.6F, 1.8F));
/* 269 */   public static final RegistryObject<EntityType<TSCBerserkEntity>> TSC_BERSERK = register("tsc_berserk", 
/* 270 */       EntityType.Builder.of(TSCBerserkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 271 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(TSCBerserkEntity::new).fireImmune().sized(0.7F, 2.1F));
/* 272 */   public static final RegistryObject<EntityType<DarkLatexCreeperEntity>> DARK_LATEX_CREEPER = register("dark_latex_creeper", 
/* 273 */       EntityType.Builder.of(DarkLatexCreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 274 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkLatexCreeperEntity::new)
/*     */       
/* 276 */       .sized(0.6F, 2.0F));
/* 277 */   public static final RegistryObject<EntityType<DarkLatexCreeperEnhancedEntity>> DARK_LATEX_CREEPER_ENHANCED = register("dark_latex_creeper_enhanced", 
/*     */       
/* 279 */       EntityType.Builder.of(DarkLatexCreeperEnhancedEntity::new, MobCategory.MONSTER)
/* 280 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 281 */       .setCustomClientFactory(DarkLatexCreeperEnhancedEntity::new)
/*     */       
/* 283 */       .sized(0.8F, 3.0F));
/* 284 */   public static final RegistryObject<EntityType<CivilianEntity>> CIVILIAN = register("civilian", 
/* 285 */       EntityType.Builder.of(CivilianEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 286 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CivilianEntity::new)
/*     */       
/* 288 */       .sized(0.6F, 1.8F));
/* 289 */   public static final RegistryObject<EntityType<PrisionerEntity>> PRISIONER = register("prisioner", 
/* 290 */       EntityType.Builder.of(PrisionerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 291 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrisionerEntity::new)
/*     */       
/* 293 */       .sized(0.6F, 1.8F));
/* 294 */   public static final RegistryObject<EntityType<PrisionermilitiaEntity>> PRISIONERMILITIA = register("prisionermilitia", 
/* 295 */       EntityType.Builder.of(PrisionermilitiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 296 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(PrisionermilitiaEntity::new)
/*     */       
/* 298 */       .sized(0.6F, 1.8F));
/* 299 */   public static final RegistryObject<EntityType<CivlianMilitiaEntity>> CIVLIAN_MILITIA = register("civlian_militia", 
/* 300 */       EntityType.Builder.of(CivlianMilitiaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 301 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(CivlianMilitiaEntity::new)
/*     */       
/* 303 */       .sized(0.6F, 1.8F));
/* 304 */   public static final RegistryObject<EntityType<CrystalbowEntity>> CRYSTALBOW = register("projectile_crystalbow", 
/* 305 */       EntityType.Builder.of(CrystalbowEntity::new, MobCategory.MISC).setCustomClientFactory(CrystalbowEntity::new)
/* 306 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 307 */   public static final RegistryObject<EntityType<LatexcannonEntity>> LATEXCANNON = register("projectile_latexcannon", 
/* 308 */       EntityType.Builder.of(LatexcannonEntity::new, MobCategory.MISC).setCustomClientFactory(LatexcannonEntity::new)
/* 309 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 310 */   public static final RegistryObject<EntityType<RevolvingGooCannonEntity>> REVOLVING_GOO_CANNON = register("projectile_revolving_goo_cannon", 
/* 311 */       EntityType.Builder.of(RevolvingGooCannonEntity::new, MobCategory.MISC)
/* 312 */       .setCustomClientFactory(RevolvingGooCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 313 */       .setUpdateInterval(1).sized(0.5F, 0.5F));
/* 314 */   public static final RegistryObject<EntityType<DartrifleEntity>> DARTRIFLE = register("projectile_dartrifle", 
/* 315 */       EntityType.Builder.of(DartrifleEntity::new, MobCategory.MISC).setCustomClientFactory(DartrifleEntity::new)
/* 316 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 317 */   public static final RegistryObject<EntityType<MatchlockPistolEntity>> MATCHLOCK_PISTOL = register("projectile_matchlock_pistol", 
/* 318 */       EntityType.Builder.of(MatchlockPistolEntity::new, MobCategory.MISC)
/* 319 */       .setCustomClientFactory(MatchlockPistolEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 320 */       .setUpdateInterval(1).sized(0.5F, 0.5F));
/* 321 */   public static final RegistryObject<EntityType<MatchLockMusketEntity>> MATCH_LOCK_MUSKET = register("projectile_match_lock_musket", 
/* 322 */       EntityType.Builder.of(MatchLockMusketEntity::new, MobCategory.MISC)
/* 323 */       .setCustomClientFactory(MatchLockMusketEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 324 */       .setUpdateInterval(1).sized(0.5F, 0.5F));
/* 325 */   public static final RegistryObject<EntityType<AR70AssaultRifleEntity>> AR_70_ASSAULT_RIFLE = register("projectile_ar_70_assault_rifle", 
/* 326 */       EntityType.Builder.of(AR70AssaultRifleEntity::new, MobCategory.MISC)
/* 327 */       .setCustomClientFactory(AR70AssaultRifleEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 328 */       .setUpdateInterval(1).sized(0.5F, 0.5F));
/* 329 */   public static final RegistryObject<EntityType<M4AssaultRifleEntity>> M_4_ASSAULT_RIFLE = register("projectile_m_4_assault_rifle", 
/* 330 */       EntityType.Builder.of(M4AssaultRifleEntity::new, MobCategory.MISC).setCustomClientFactory(M4AssaultRifleEntity::new)
/* 331 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 332 */   public static final RegistryObject<EntityType<ScrapM16RifleEntity>> SCRAP_M_16_RIFLE = register("projectile_scrap_m_16_rifle", 
/* 333 */       EntityType.Builder.of(ScrapM16RifleEntity::new, MobCategory.MISC).setCustomClientFactory(ScrapM16RifleEntity::new)
/* 334 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 335 */   public static final RegistryObject<EntityType<TSCPistolEntity>> TSC_PISTOL = register("projectile_tsc_pistol", 
/* 336 */       EntityType.Builder.of(TSCPistolEntity::new, MobCategory.MISC).setCustomClientFactory(TSCPistolEntity::new)
/* 337 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 338 */   public static final RegistryObject<EntityType<OverundershotgunEntity>> OVERUNDERSHOTGUN = register("projectile_overundershotgun", 
/* 339 */       EntityType.Builder.of(OverundershotgunEntity::new, MobCategory.MISC)
/* 340 */       .setCustomClientFactory(OverundershotgunEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
/* 341 */       .setUpdateInterval(1).sized(0.5F, 0.5F));
/* 342 */   public static final RegistryObject<EntityType<FlamethowerEntity>> FLAMETHOWER = register("projectile_flamethower", 
/* 343 */       EntityType.Builder.of(FlamethowerEntity::new, MobCategory.MISC).setCustomClientFactory(FlamethowerEntity::new)
/* 344 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 345 */   public static final RegistryObject<EntityType<LatexDartRifleEntity>> LATEX_DART_RIFLE = register("projectile_latex_dart_rifle", 
/* 346 */       EntityType.Builder.of(LatexDartRifleEntity::new, MobCategory.MISC).setCustomClientFactory(LatexDartRifleEntity::new)
/* 347 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 348 */   public static final RegistryObject<EntityType<DarkLatexFoxScientistEntity>> DARK_LATEX_FOX_SCIENTIST = register("dark_latex_fox_scientist", 
/* 349 */       EntityType.Builder.of(DarkLatexFoxScientistEntity::new, MobCategory.MONSTER)
/* 350 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 351 */       .setCustomClientFactory(DarkLatexFoxScientistEntity::new)
/*     */       
/* 353 */       .sized(0.6F, 1.8F));
/* 354 */   public static final RegistryObject<EntityType<BeeHertxEntity>> BEE_HERTX = register("bee_hertx", 
/* 355 */       EntityType.Builder.of(BeeHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 356 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(BeeHertxEntity::new)
/*     */       
/* 358 */       .sized(0.6F, 2.3F));
/* 359 */   public static final RegistryObject<EntityType<AHVHertxEntity>> AHV_HERTX = register("ahv_hertx", 
/* 360 */       EntityType.Builder.of(AHVHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 361 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AHVHertxEntity::new)
/*     */       
/* 363 */       .sized(0.7F, 2.0F));
/* 364 */   public static final RegistryObject<EntityType<TankCannonEntity>> TANK_CANNON = register("projectile_tank_cannon", 
/* 365 */       EntityType.Builder.of(TankCannonEntity::new, MobCategory.MISC).setCustomClientFactory(TankCannonEntity::new)
/* 366 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 367 */   public static final RegistryObject<EntityType<La4tankmorphrEntity>> LA_4TANKMORPHR = register("la_4tankmorphr", 
/* 368 */       EntityType.Builder.of(La4tankmorphrEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 369 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(La4tankmorphrEntity::new).fireImmune()
/* 370 */       .sized(1.1F, 4.2F));
/* 371 */   public static final RegistryObject<EntityType<La4tankmorphmEntity>> LA_4TANKMORPHM = register("la_4tankmorphm", 
/* 372 */       EntityType.Builder.of(La4tankmorphmEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 373 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(La4tankmorphmEntity::new).fireImmune()
/* 374 */       .sized(1.1F, 4.2F));
/* 375 */   public static final RegistryObject<EntityType<NXTHertxEntity>> NXT_HERTX = register("nxt_hertx", 
/* 376 */       EntityType.Builder.of(NXTHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 377 */       .setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(NXTHertxEntity::new)
/*     */       
/* 379 */       .sized(0.7F, 2.0F));
/* 380 */   public static final RegistryObject<EntityType<DROPPODEntity>> DROPPOD = register("droppod", 
/* 381 */       EntityType.Builder.of(DROPPODEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
/* 382 */       .setUpdateInterval(3).setCustomClientFactory(DROPPODEntity::new).fireImmune().sized(1.2F, 2.2F));
/* 383 */   public static final RegistryObject<EntityType<SneppleEntity>> SNEPPLE = register("projectile_snepple", 
/* 384 */       EntityType.Builder.of(SneppleEntity::new, MobCategory.MISC).setCustomClientFactory(SneppleEntity::new)
/* 385 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 386 */   public static final RegistryObject<EntityType<AllydroppodEntity>> ALLYDROPPOD = register("allydroppod", 
/* 387 */       EntityType.Builder.of(AllydroppodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 388 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AllydroppodEntity::new).fireImmune().sized(1.2F, 2.2F));
/* 389 */   public static final RegistryObject<EntityType<LatexDropPodEntity>> LATEX_DROP_POD = register("latex_drop_pod", 
/* 390 */       EntityType.Builder.of(LatexDropPodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 391 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(LatexDropPodEntity::new).fireImmune().sized(1.2F, 2.2F));
/* 392 */   public static final RegistryObject<EntityType<HertxvarFEntity>> HERTXVAR_F = register("hertxvar_f", 
/* 393 */       EntityType.Builder.of(HertxvarFEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 394 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HertxvarFEntity::new)
/*     */       
/* 396 */       .sized(0.7F, 2.0F));
/* 397 */   public static final RegistryObject<EntityType<HertxvarSolEntity>> HERTXVAR_SOL = register("hertxvar_sol", 
/* 398 */       EntityType.Builder.of(HertxvarSolEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 399 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HertxvarSolEntity::new)
/*     */       
/* 401 */       .sized(0.7F, 2.0F));
/* 402 */   public static final RegistryObject<EntityType<HertxvarFBEntity>> HERTXVAR_FB = register("hertxvar_fb", 
/* 403 */       EntityType.Builder.of(HertxvarFBEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 404 */       .setTrackingRange(96).setUpdateInterval(3).setCustomClientFactory(HertxvarFBEntity::new)
/*     */       
/* 406 */       .sized(0.7F, 2.1F));
/* 407 */   public static final RegistryObject<EntityType<HertxSitEntity>> HERTX_SIT = register("hertx_sit", 
/* 408 */       EntityType.Builder.of(HertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 409 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxSitEntity::new)
/*     */       
/* 411 */       .sized(0.8F, 1.2F));
/* 412 */   public static final RegistryObject<EntityType<AshburyHertxEntity>> ASHBURY_HERTX = register("ashbury_hertx", 
/* 413 */       EntityType.Builder.of(AshburyHertxEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 414 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(AshburyHertxEntity::new)
/*     */       
/* 416 */       .sized(0.7F, 2.0F));
/* 417 */   public static final RegistryObject<EntityType<AshburySitEntity>> ASHBURY_SIT = register("ashbury_sit", 
/* 418 */       EntityType.Builder.of(AshburySitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 419 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AshburySitEntity::new)
/*     */       
/* 421 */       .sized(0.8F, 1.2F));
/* 422 */   public static final RegistryObject<EntityType<BeeHertxSitEntity>> BEE_HERTX_SIT = register("bee_hertx_sit", 
/* 423 */       EntityType.Builder.of(BeeHertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 424 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(BeeHertxSitEntity::new)
/*     */       
/* 426 */       .sized(0.8F, 1.2F));
/* 427 */   public static final RegistryObject<EntityType<AHVHertxSitEntity>> AHV_HERTX_SIT = register("ahv_hertx_sit", 
/* 428 */       EntityType.Builder.of(AHVHertxSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 429 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(AHVHertxSitEntity::new)
/*     */       
/* 431 */       .sized(0.8F, 1.2F));
/* 432 */   public static final RegistryObject<EntityType<NXTSitEntity>> NXT_SIT = register("nxt_sit", 
/* 433 */       EntityType.Builder.of(NXTSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(32)
/* 434 */       .setUpdateInterval(3).setCustomClientFactory(NXTSitEntity::new)
/*     */       
/* 436 */       .sized(0.8F, 1.2F));
/* 437 */   public static final RegistryObject<EntityType<HertxFSitEntity>> HERTX_F_SIT = register("hertx_f_sit", 
/* 438 */       EntityType.Builder.of(HertxFSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 439 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFSitEntity::new)
/*     */       
/* 441 */       .sized(0.8F, 1.2F));
/* 442 */   public static final RegistryObject<EntityType<HertxFBSitEntity>> HERTX_FB_SIT = register("hertx_fb_sit", 
/* 443 */       EntityType.Builder.of(HertxFBSitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 444 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(HertxFBSitEntity::new)
/*     */       
/* 446 */       .sized(0.8F, 1.5F));
/* 447 */   public static final RegistryObject<EntityType<HertxSolWaitEntity>> HERTX_SOL_WAIT = register("hertx_sol_wait", 
/* 448 */       EntityType.Builder.of(HertxSolWaitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 449 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(HertxSolWaitEntity::new)
/*     */       
/* 451 */       .sized(0.7F, 2.0F));
/* 452 */   public static final RegistryObject<EntityType<SlimelingTamedEntity>> SLIMELING_TAMED = register("slimeling_tamed", 
/* 453 */       EntityType.Builder.of(SlimelingTamedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 454 */       .setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimelingTamedEntity::new)
/*     */       
/* 456 */       .sized(0.6F, 2.0F));
/* 457 */   public static final RegistryObject<EntityType<SlimelingtamedsitEntity>> SLIMELINGTAMEDSIT = register("slimelingtamedsit", 
/* 458 */       EntityType.Builder.of(SlimelingtamedsitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 459 */       .setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(SlimelingtamedsitEntity::new)
/*     */       
/* 461 */       .sized(0.8F, 1.2F));
/* 462 */   public static final RegistryObject<EntityType<ProtectorSlimelingEntity>> PROTECTOR_SLIMELING = register("protector_slimeling", 
/* 463 */       EntityType.Builder.of(ProtectorSlimelingEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 464 */       .setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(ProtectorSlimelingEntity::new)
/*     */       
/* 466 */       .sized(0.6F, 2.0F));
/* 467 */   public static final RegistryObject<EntityType<ProtectorSlimelingsitEntity>> PROTECTOR_SLIMELINGSIT = register("protector_slimelingsit", 
/* 468 */       EntityType.Builder.of(ProtectorSlimelingsitEntity::new, MobCategory.MONSTER)
/* 469 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)
/* 470 */       .setCustomClientFactory(ProtectorSlimelingsitEntity::new)
/*     */       
/* 472 */       .sized(0.8F, 1.2F));
/* 473 */   public static final RegistryObject<EntityType<DarkLatexCakeEntity>> DARK_LATEX_CAKE = register("dark_latex_cake", 
/* 474 */       EntityType.Builder.of(DarkLatexCakeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 475 */       .setTrackingRange(72).setUpdateInterval(3).setCustomClientFactory(DarkLatexCakeEntity::new)
/*     */       
/* 477 */       .sized(0.6F, 1.8F));
/* 478 */   public static final RegistryObject<EntityType<DroneHertxWaitEntity>> DRONE_HERTX_WAIT = register("drone_hertx_wait", 
/* 479 */       EntityType.Builder.of(DroneHertxWaitEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
/* 480 */       .setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(DroneHertxWaitEntity::new).fireImmune().sized(0.7F, 1.2F));
/* 481 */   public static final RegistryObject<EntityType<ArmedDroneHertxWaitEntity>> ARMED_DRONE_HERTX_WAIT = register("armed_drone_hertx_wait", 
/* 482 */       EntityType.Builder.of(ArmedDroneHertxWaitEntity::new, MobCategory.CREATURE)
/* 483 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3)
/* 484 */       .setCustomClientFactory(ArmedDroneHertxWaitEntity::new).fireImmune().sized(0.7F, 2.0F));
/* 485 */   public static final RegistryObject<EntityType<ExplosivegooEntity>> EXPLOSIVEGOO = register("projectile_explosivegoo", 
/* 486 */       EntityType.Builder.of(ExplosivegooEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosivegooEntity::new)
/* 487 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5F, 0.5F));
/* 488 */   public static final RegistryObject<EntityType<CivilianMilitiaMeleeEntity>> CIVILIAN_MILITIA_MELEE = register("civilian_militia_melee", 
/* 489 */       EntityType.Builder.of(CivilianMilitiaMeleeEntity::new, MobCategory.CREATURE)
/* 490 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
/* 491 */       .setCustomClientFactory(CivilianMilitiaMeleeEntity::new)
/*     */       
/* 493 */       .sized(0.6F, 1.8F));
/* 494 */   public static final RegistryObject<EntityType<PrisionerMilitiaMeleeEntity>> PRISIONER_MILITIA_MELEE = register("prisioner_militia_melee", 
/* 495 */       EntityType.Builder.of(PrisionerMilitiaMeleeEntity::new, MobCategory.CREATURE)
/* 496 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(96).setUpdateInterval(3)
/* 497 */       .setCustomClientFactory(PrisionerMilitiaMeleeEntity::new)
/*     */       
/* 499 */       .sized(0.6F, 1.8F));
/*     */   
/*     */   private static <T extends net.minecraft.world.entity.Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
/* 502 */     return REGISTRY.register(registryname, () -> entityTypeBuilder.build(registryname));
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void init(FMLCommonSetupEvent event) {
/* 507 */     event.enqueueWork(() -> {
/*     */           SlimelingEntity.init();
/*     */           DarklatexslugEntity.init();
/*     */           DarklatexEntity.init();
/*     */           DarkLatexCentaurEntity.init();
/*     */           DarkLatexSkeletonEntity.init();
/*     */           YufengEntity.init();
/*     */           NoiseStalkerEntity.init();
/*     */           DlsharkEntity.init();
/*     */           DarkLatexMothEntity.init();
/*     */           DarkLatexSnepEntity.init();
/*     */           DarkLatexFoxEntity.init();
/*     */           DarkLatexFoxSniperEntity.init();
/*     */           DarkLatexSnakeEntity.init();
/*     */           DarkLatexDragonEntity.init();
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
/* 584 */     event.put((EntityType)SLIMELING.get(), SlimelingEntity.createAttributes().build());
/* 585 */     event.put((EntityType)DARKLATEXSLUG.get(), DarklatexslugEntity.createAttributes().build());
/* 586 */     event.put((EntityType)DARKLATEX.get(), DarklatexEntity.createAttributes().build());
/* 587 */     event.put((EntityType)DARK_LATEX_CENTAUR.get(), DarkLatexCentaurEntity.createAttributes().build());
/* 588 */     event.put((EntityType)DARK_LATEX_SKELETON.get(), DarkLatexSkeletonEntity.createAttributes().build());
/* 589 */     event.put((EntityType)YUFENG.get(), YufengEntity.createAttributes().build());
/* 590 */     event.put((EntityType)NOISE_STALKER.get(), NoiseStalkerEntity.createAttributes().build());
/* 591 */     event.put((EntityType)DLSHARK.get(), DlsharkEntity.createAttributes().build());
/* 592 */     event.put((EntityType)DARK_LATEX_MOTH.get(), DarkLatexMothEntity.createAttributes().build());
/* 593 */     event.put((EntityType)DARK_LATEX_SNEP.get(), DarkLatexSnepEntity.createAttributes().build());
/* 594 */     event.put((EntityType)DARK_LATEX_FOX.get(), DarkLatexFoxEntity.createAttributes().build());
/* 595 */     event.put((EntityType)DARK_LATEX_FOX_SNIPER.get(), DarkLatexFoxSniperEntity.createAttributes().build());
/* 596 */     event.put((EntityType)DARK_LATEX_SNAKE.get(), DarkLatexSnakeEntity.createAttributes().build());
/* 597 */     event.put((EntityType)DARK_LATEX_DRAGON.get(), DarkLatexDragonEntity.createAttributes().build());
/* 598 */     event.put((EntityType)DARK_LATEX_SPIDER.get(), DarkLatexSpiderEntity.createAttributes().build());
/* 599 */     event.put((EntityType)DL_SQUID_DOG.get(), DlSquidDogEntity.createAttributes().build());
/* 600 */     event.put((EntityType)D_LBEE.get(), DLbeeEntity.createAttributes().build());
/* 601 */     event.put((EntityType)DARK_LATEX_QUEEN_BEE.get(), DarkLatexQueenBeeEntity.createAttributes().build());
/* 602 */     event.put((EntityType)DARK_LATEX_SPIDER_QUEEN.get(), DarkLatexSpiderQueenEntity.createAttributes().build());
/* 603 */     event.put((EntityType)DARKLATEXCONE.get(), DarklatexconeEntity.createAttributes().build());
/* 604 */     event.put((EntityType)HERTX.get(), HertxEntity.createAttributes().build());
/* 605 */     event.put((EntityType)DRONE_HERTX.get(), DroneHertxEntity.createAttributes().build());
/* 606 */     event.put((EntityType)ARMED_DRONE_HERTX.get(), ArmedDroneHertxEntity.createAttributes().build());
/* 607 */     event.put((EntityType)SCIENTIST.get(), ScientistEntity.createAttributes().build());
/* 608 */     event.put((EntityType)MILITARY.get(), MilitaryEntity.createAttributes().build());
/* 609 */     event.put((EntityType)MILITARYFLAMEUNIT.get(), MilitaryflameunitEntity.createAttributes().build());
/* 610 */     event.put((EntityType)EVIL_SCIENTIST.get(), EvilScientistEntity.createAttributes().build());
/* 611 */     event.put((EntityType)EVIL_SNIPER.get(), EvilSniperEntity.createAttributes().build());
/* 612 */     event.put((EntityType)EVIL_MILITARY.get(), EvilMilitaryEntity.createAttributes().build());
/* 613 */     event.put((EntityType)TSC_OUTSIDER.get(), TSCOutsiderEntity.createAttributes().build());
/* 614 */     event.put((EntityType)TSC_OUTSIDER_GUNNER.get(), TSCOutsiderGunnerEntity.createAttributes().build());
/* 615 */     event.put((EntityType)TS_CDRONE.get(), TSCdroneEntity.createAttributes().build());
/* 616 */     event.put((EntityType)TSC_HUNTER.get(), TSCHunterEntity.createAttributes().build());
/* 617 */     event.put((EntityType)MILITARY_RIOT.get(), MilitaryRiotEntity.createAttributes().build());
/* 618 */     event.put((EntityType)TSC_BERSERK.get(), TSCBerserkEntity.createAttributes().build());
/* 619 */     event.put((EntityType)DARK_LATEX_CREEPER.get(), DarkLatexCreeperEntity.createAttributes().build());
/* 620 */     event.put((EntityType)DARK_LATEX_CREEPER_ENHANCED.get(), DarkLatexCreeperEnhancedEntity.createAttributes().build());
/* 621 */     event.put((EntityType)CIVILIAN.get(), CivilianEntity.createAttributes().build());
/* 622 */     event.put((EntityType)PRISIONER.get(), PrisionerEntity.createAttributes().build());
/* 623 */     event.put((EntityType)PRISIONERMILITIA.get(), PrisionermilitiaEntity.createAttributes().build());
/* 624 */     event.put((EntityType)CIVLIAN_MILITIA.get(), CivlianMilitiaEntity.createAttributes().build());
/* 625 */     event.put((EntityType)DARK_LATEX_FOX_SCIENTIST.get(), DarkLatexFoxScientistEntity.createAttributes().build());
/* 626 */     event.put((EntityType)BEE_HERTX.get(), BeeHertxEntity.createAttributes().build());
/* 627 */     event.put((EntityType)AHV_HERTX.get(), AHVHertxEntity.createAttributes().build());
/* 628 */     event.put((EntityType)LA_4TANKMORPHR.get(), La4tankmorphrEntity.createAttributes().build());
/* 629 */     event.put((EntityType)LA_4TANKMORPHM.get(), La4tankmorphmEntity.createAttributes().build());
/* 630 */     event.put((EntityType)NXT_HERTX.get(), NXTHertxEntity.createAttributes().build());
/* 631 */     event.put((EntityType)DROPPOD.get(), DROPPODEntity.createAttributes().build());
/* 632 */     event.put((EntityType)ALLYDROPPOD.get(), AllydroppodEntity.createAttributes().build());
/* 633 */     event.put((EntityType)LATEX_DROP_POD.get(), LatexDropPodEntity.createAttributes().build());
/* 634 */     event.put((EntityType)HERTXVAR_F.get(), HertxvarFEntity.createAttributes().build());
/* 635 */     event.put((EntityType)HERTXVAR_SOL.get(), HertxvarSolEntity.createAttributes().build());
/* 636 */     event.put((EntityType)HERTXVAR_FB.get(), HertxvarFBEntity.createAttributes().build());
/* 637 */     event.put((EntityType)HERTX_SIT.get(), HertxSitEntity.createAttributes().build());
/* 638 */     event.put((EntityType)ASHBURY_HERTX.get(), AshburyHertxEntity.createAttributes().build());
/* 639 */     event.put((EntityType)ASHBURY_SIT.get(), AshburySitEntity.createAttributes().build());
/* 640 */     event.put((EntityType)BEE_HERTX_SIT.get(), BeeHertxSitEntity.createAttributes().build());
/* 641 */     event.put((EntityType)AHV_HERTX_SIT.get(), AHVHertxSitEntity.createAttributes().build());
/* 642 */     event.put((EntityType)NXT_SIT.get(), NXTSitEntity.createAttributes().build());
/* 643 */     event.put((EntityType)HERTX_F_SIT.get(), HertxFSitEntity.createAttributes().build());
/* 644 */     event.put((EntityType)HERTX_FB_SIT.get(), HertxFBSitEntity.createAttributes().build());
/* 645 */     event.put((EntityType)HERTX_SOL_WAIT.get(), HertxSolWaitEntity.createAttributes().build());
/* 646 */     event.put((EntityType)SLIMELING_TAMED.get(), SlimelingTamedEntity.createAttributes().build());
/* 647 */     event.put((EntityType)SLIMELINGTAMEDSIT.get(), SlimelingtamedsitEntity.createAttributes().build());
/* 648 */     event.put((EntityType)PROTECTOR_SLIMELING.get(), ProtectorSlimelingEntity.createAttributes().build());
/* 649 */     event.put((EntityType)PROTECTOR_SLIMELINGSIT.get(), ProtectorSlimelingsitEntity.createAttributes().build());
/* 650 */     event.put((EntityType)DARK_LATEX_CAKE.get(), DarkLatexCakeEntity.createAttributes().build());
/* 651 */     event.put((EntityType)DRONE_HERTX_WAIT.get(), DroneHertxWaitEntity.createAttributes().build());
/* 652 */     event.put((EntityType)ARMED_DRONE_HERTX_WAIT.get(), ArmedDroneHertxWaitEntity.createAttributes().build());
/* 653 */     event.put((EntityType)CIVILIAN_MILITIA_MELEE.get(), CivilianMilitiaMeleeEntity.createAttributes().build());
/* 654 */     event.put((EntityType)PRISIONER_MILITIA_MELEE.get(), PrisionerMilitiaMeleeEntity.createAttributes().build());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModEntities.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */