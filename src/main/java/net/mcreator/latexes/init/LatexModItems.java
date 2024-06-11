/*     */ package net.mcreator.latexes.init;
/*     */ 
/*     */ import java.util.function.Supplier;
/*     */ import net.mcreator.latexes.item.AR70AssaultRifleItem;
/*     */ import net.mcreator.latexes.item.AllyradiodroppodcallerItem;
/*     */ import net.mcreator.latexes.item.ArmageddonItem;
/*     */ import net.mcreator.latexes.item.BatonItem;
/*     */ import net.mcreator.latexes.item.BatteryItem;
/*     */ import net.mcreator.latexes.item.BloodSyringeItem;
/*     */ import net.mcreator.latexes.item.BookpilerandomItem;
/*     */ import net.mcreator.latexes.item.BrokendlmaskItem;
/*     */ import net.mcreator.latexes.item.Brokenm16Item;
/*     */ import net.mcreator.latexes.item.BulleticonItem;
/*     */ import net.mcreator.latexes.item.CrystalBowUnloadedItem;
/*     */ import net.mcreator.latexes.item.CrystalarrowItem;
/*     */ import net.mcreator.latexes.item.CrystalbowItem;
/*     */ import net.mcreator.latexes.item.DLAxeItem;
/*     */ import net.mcreator.latexes.item.DLHoeItem;
/*     */ import net.mcreator.latexes.item.DLPickaxeItem;
/*     */ import net.mcreator.latexes.item.DLScytheItem;
/*     */ import net.mcreator.latexes.item.DLShovelItem;
/*     */ import net.mcreator.latexes.item.DLSwordItem;
/*     */ import net.mcreator.latexes.item.DLSyringeItem;
/*     */ import net.mcreator.latexes.item.DarkLatexGooFluidItem;
/*     */ import net.mcreator.latexes.item.DarkLatexQuiverItem;
/*     */ import net.mcreator.latexes.item.DarklatexcrystalItem;
/*     */ import net.mcreator.latexes.item.DarklatexgooItem;
/*     */ import net.mcreator.latexes.item.DartItem;
/*     */ import net.mcreator.latexes.item.DartrifleItem;
/*     */ import net.mcreator.latexes.item.DlmaskItem;
/*     */ import net.mcreator.latexes.item.DronehertxiconItem;
/*     */ import net.mcreator.latexes.item.DronehertxupgradekitItem;
/*     */ import net.mcreator.latexes.item.EvilBeretItem;
/*     */ import net.mcreator.latexes.item.ExplosivegooItem;
/*     */ import net.mcreator.latexes.item.FlamethowerItem;
/*     */ import net.mcreator.latexes.item.GoodBeretItem;
/*     */ import net.mcreator.latexes.item.GunbarrelItem;
/*     */ import net.mcreator.latexes.item.GunrepairkitItem;
/*     */ import net.mcreator.latexes.item.HandcuffsItem;
/*     */ import net.mcreator.latexes.item.HazmatItem;
/*     */ import net.mcreator.latexes.item.HertxengineerItem;
/*     */ import net.mcreator.latexes.item.HertxvisorItem;
/*     */ import net.mcreator.latexes.item.Instafacility2Item;
/*     */ import net.mcreator.latexes.item.Instafacility3Item;
/*     */ import net.mcreator.latexes.item.InstafacilityItem;
/*     */ import net.mcreator.latexes.item.KelvarvestItem;
/*     */ import net.mcreator.latexes.item.KeycardItem;
/*     */ import net.mcreator.latexes.item.LatexDartRifleItem;
/*     */ import net.mcreator.latexes.item.LatexRadioCallerItem;
/*     */ import net.mcreator.latexes.item.LatexSoupItem;
/*     */ import net.mcreator.latexes.item.LatexcannonItem;
/*     */ import net.mcreator.latexes.item.LatexdartItem;
/*     */ import net.mcreator.latexes.item.LatextuneItem;
/*     */ import net.mcreator.latexes.item.M4AssaultRifleItem;
/*     */ import net.mcreator.latexes.item.MatchLockMusketItem;
/*     */ import net.mcreator.latexes.item.MatchlockPistolItem;
/*     */ import net.mcreator.latexes.item.MilitaryDroneHertxIconItem;
/*     */ import net.mcreator.latexes.item.MusketballItem;
/*     */ import net.mcreator.latexes.item.OrangeItem;
/*     */ import net.mcreator.latexes.item.OverundershotgunItem;
/*     */ import net.mcreator.latexes.item.PhoneItem;
/*     */ import net.mcreator.latexes.item.RadioDroppodcallerItem;
/*     */ import net.mcreator.latexes.item.RecruitmentpaperItem;
/*     */ import net.mcreator.latexes.item.RespiratorItem;
/*     */ import net.mcreator.latexes.item.RevolvingGooCannonItem;
/*     */ import net.mcreator.latexes.item.RifleAmmoItem;
/*     */ import net.mcreator.latexes.item.RiotarmorItem;
/*     */ import net.mcreator.latexes.item.ScrapM16RifleItem;
/*     */ import net.mcreator.latexes.item.ShotgunShellItem;
/*     */ import net.mcreator.latexes.item.SlimeessenceItem;
/*     */ import net.mcreator.latexes.item.SneppleItem;
/*     */ import net.mcreator.latexes.item.SyringeItem;
/*     */ import net.mcreator.latexes.item.TSCPistolItem;
/*     */ import net.mcreator.latexes.item.TSCpistolmagItem;
/*     */ import net.mcreator.latexes.item.TabletItem;
/*     */ import net.mcreator.latexes.item.TabletoffItem;
/*     */ import net.mcreator.latexes.item.TankCannonItem;
/*     */ import net.mcreator.latexes.item.VaccineSyringeItem;
/*     */ import net.mcreator.latexes.item.YufengbodyItem;
/*     */ import net.minecraft.world.item.BlockItem;
/*     */ import net.minecraft.world.item.CreativeModeTab;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraftforge.common.ForgeSpawnEggItem;
/*     */ import net.minecraftforge.registries.DeferredRegister;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ import net.minecraftforge.registries.RegistryObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LatexModItems
/*     */ {
/*  96 */   public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "latex");
/*  97 */   public static final RegistryObject<Item> SLIMELING = REGISTRY.register("slimeling_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.SLIMELING, -12925126, -16223982, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/*  99 */   public static final RegistryObject<Item> DARKLATEXSLUG = REGISTRY.register("darklatexslug_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARKLATEXSLUG, -13421773, -10066330, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 102 */   public static final RegistryObject<Item> DARKLATEX = REGISTRY.register("darklatex_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARKLATEX, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 104 */   public static final RegistryObject<Item> DARK_LATEX_CENTAUR = REGISTRY.register("dark_latex_centaur_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_CENTAUR, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 107 */   public static final RegistryObject<Item> DARK_LATEX_SKELETON = REGISTRY.register("dark_latex_skeleton_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_SKELETON, -13421773, -16768763, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 110 */   public static final RegistryObject<Item> YUFENG = REGISTRY.register("yufeng_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.YUFENG, -13421773, -15987700, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 112 */   public static final RegistryObject<Item> NOISE_STALKER = REGISTRY.register("noise_stalker_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.NOISE_STALKER, -13816531, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 115 */   public static final RegistryObject<Item> DLSHARK = REGISTRY.register("dlshark_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DLSHARK, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 117 */   public static final RegistryObject<Item> DARK_LATEX_MOTH = REGISTRY.register("dark_latex_moth_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_MOTH, -14408668, -15790321, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 120 */   public static final RegistryObject<Item> DARK_LATEX_SNEP = REGISTRY.register("dark_latex_snep_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_SNEP, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 123 */   public static final RegistryObject<Item> DARK_LATEX_FOX = REGISTRY.register("dark_latex_fox_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_FOX, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 126 */   public static final RegistryObject<Item> DARK_LATEX_FOX_SNIPER = REGISTRY.register("dark_latex_fox_sniper_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_FOX_SNIPER, -13421773, -16769758, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 129 */   public static final RegistryObject<Item> DARK_LATEX_SNAKE = REGISTRY.register("dark_latex_snake_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_SNAKE, -15329770, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 132 */   public static final RegistryObject<Item> DARK_LATEX_DRAGON = REGISTRY.register("dark_latex_dragon_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_DRAGON, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 135 */   public static final RegistryObject<Item> DARK_LATEX_SPIDER = REGISTRY.register("dark_latex_spider_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_SPIDER, -13421773, -13434880, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 138 */   public static final RegistryObject<Item> DL_SQUID_DOG = REGISTRY.register("dl_squid_dog_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DL_SQUID_DOG, -13421773, -15856370, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 141 */   public static final RegistryObject<Item> D_LBEE = REGISTRY.register("d_lbee_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.D_LBEE, -13948117, -10066432, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 143 */   public static final RegistryObject<Item> DARK_LATEX_QUEEN_BEE = REGISTRY.register("dark_latex_queen_bee_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_QUEEN_BEE, -13421773, -3355648, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 146 */   public static final RegistryObject<Item> DARK_LATEX_SPIDER_QUEEN = REGISTRY.register("dark_latex_spider_queen_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_SPIDER_QUEEN, -13421773, -6750208, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 149 */   public static final RegistryObject<Item> DARKLATEXCONE = REGISTRY.register("darklatexcone_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARKLATEXCONE, -13421773, -10079488, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 152 */   public static final RegistryObject<Item> HERTX = REGISTRY.register("hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.HERTX, -13421773, -10027162, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 154 */   public static final RegistryObject<Item> DRONE_HERTX = REGISTRY.register("drone_hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DRONE_HERTX, -13421773, -39424, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 156 */   public static final RegistryObject<Item> ARMED_DRONE_HERTX = REGISTRY.register("armed_drone_hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.ARMED_DRONE_HERTX, -13421773, -39373, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 159 */   public static final RegistryObject<Item> SCIENTIST = REGISTRY.register("scientist_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.SCIENTIST, -13083257, -15604244, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 161 */   public static final RegistryObject<Item> MILITARY = REGISTRY.register("military_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.MILITARY, -14858464, -13473224, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 163 */   public static final RegistryObject<Item> MILITARYFLAMEUNIT = REGISTRY.register("militaryflameunit_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.MILITARYFLAMEUNIT, -14858464, -13473224, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 166 */   public static final RegistryObject<Item> EVIL_SCIENTIST = REGISTRY.register("evil_scientist_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.EVIL_SCIENTIST, -13083257, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 169 */   public static final RegistryObject<Item> EVIL_SNIPER = REGISTRY.register("evil_sniper_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.EVIL_SNIPER, -13083257, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 172 */   public static final RegistryObject<Item> EVIL_MILITARY = REGISTRY.register("evil_military_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.EVIL_MILITARY, -14858464, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 175 */   public static final RegistryObject<Item> TSC_OUTSIDER = REGISTRY.register("tsc_outsider_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.TSC_OUTSIDER, -3355444, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 178 */   public static final RegistryObject<Item> TSC_OUTSIDER_GUNNER = REGISTRY.register("tsc_outsider_gunner_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.TSC_OUTSIDER_GUNNER, -3355444, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 181 */   public static final RegistryObject<Item> TS_CDRONE = REGISTRY.register("ts_cdrone_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.TS_CDRONE, -6710887, -6750208, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 183 */   public static final RegistryObject<Item> TSC_HUNTER = REGISTRY.register("tsc_hunter_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.TSC_HUNTER, -3355444, -65536, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 185 */   public static final RegistryObject<Item> MILITARY_RIOT = REGISTRY.register("military_riot_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.MILITARY_RIOT, -15517674, -13473224, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 188 */   public static final RegistryObject<Item> TSC_BERSERK = REGISTRY.register("tsc_berserk_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.TSC_BERSERK, -3355444, -3407872, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 190 */   public static final RegistryObject<Item> DARK_LATEX_CREEPER = REGISTRY.register("dark_latex_creeper_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_CREEPER, -13421773, -16777216, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 193 */   public static final RegistryObject<Item> DARK_LATEX_CREEPER_ENHANCED = REGISTRY.register("dark_latex_creeper_enhanced_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED, -13948373, -13382656, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 196 */   public static final RegistryObject<Item> CIVILIAN = REGISTRY.register("civilian_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.CIVILIAN, -6921408, -7218211, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 198 */   public static final RegistryObject<Item> PRISIONER = REGISTRY.register("prisioner_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.PRISIONER, -6921408, -2256495, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */   
/* 200 */   public static final RegistryObject<Item> PRISIONERMILITIA = REGISTRY.register("prisionermilitia_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.PRISIONERMILITIA, -6921408, -2154721, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 203 */   public static final RegistryObject<Item> CIVLIAN_MILITIA = REGISTRY.register("civlian_militia_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.CIVLIAN_MILITIA, -6921408, -16324627, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXENTITIES)));
/*     */ 
/*     */   
/* 206 */   public static final RegistryObject<Item> DARKLATEXGOO = REGISTRY.register("darklatexgoo", () -> new DarklatexgooItem());
/* 207 */   public static final RegistryObject<Item> DARKLATEXCRYSTAL = REGISTRY.register("darklatexcrystal", () -> new DarklatexcrystalItem());
/* 208 */   public static final RegistryObject<Item> BROKENDLMASK = REGISTRY.register("brokendlmask", () -> new BrokendlmaskItem());
/* 209 */   public static final RegistryObject<Item> DLMASK_HELMET = REGISTRY.register("dlmask_helmet", () -> new DlmaskItem.Helmet());
/* 210 */   public static final RegistryObject<Item> DARK_LATEX_QUIVER_CHESTPLATE = REGISTRY.register("dark_latex_quiver_chestplate", () -> new DarkLatexQuiverItem.Chestplate());
/*     */   
/* 212 */   public static final RegistryObject<Item> SLIMEESSENCE = REGISTRY.register("slimeessence", () -> new SlimeessenceItem());
/* 213 */   public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> new BatteryItem());
/* 214 */   public static final RegistryObject<Item> KEYCARD = REGISTRY.register("keycard", () -> new KeycardItem());
/* 215 */   public static final RegistryObject<Item> TABLET = REGISTRY.register("tablet", () -> new TabletItem());
/* 216 */   public static final RegistryObject<Item> RADIO_DROPPODCALLER = REGISTRY.register("radio_droppodcaller", () -> new RadioDroppodcallerItem());
/* 217 */   public static final RegistryObject<Item> ALLYRADIODROPPODCALLER = REGISTRY.register("allyradiodroppodcaller", () -> new AllyradiodroppodcallerItem());
/*     */   
/* 219 */   public static final RegistryObject<Item> HERTXVISOR = REGISTRY.register("hertxvisor", () -> new HertxvisorItem());
/* 220 */   public static final RegistryObject<Item> INSTAFACILITY = REGISTRY.register("instafacility", () -> new InstafacilityItem());
/* 221 */   public static final RegistryObject<Item> INSTAFACILITY_2 = REGISTRY.register("instafacility_2", () -> new Instafacility2Item());
/* 222 */   public static final RegistryObject<Item> INSTAFACILITY_3 = REGISTRY.register("instafacility_3", () -> new Instafacility3Item());
/* 223 */   public static final RegistryObject<Item> RESPIRATOR_HELMET = REGISTRY.register("respirator_helmet", () -> new RespiratorItem.Helmet());
/* 224 */   public static final RegistryObject<Item> HAZMAT_HELMET = REGISTRY.register("hazmat_helmet", () -> new HazmatItem.Helmet());
/* 225 */   public static final RegistryObject<Item> HAZMAT_CHESTPLATE = REGISTRY.register("hazmat_chestplate", () -> new HazmatItem.Chestplate());
/* 226 */   public static final RegistryObject<Item> HAZMAT_LEGGINGS = REGISTRY.register("hazmat_leggings", () -> new HazmatItem.Leggings());
/* 227 */   public static final RegistryObject<Item> HAZMAT_BOOTS = REGISTRY.register("hazmat_boots", () -> new HazmatItem.Boots());
/* 228 */   public static final RegistryObject<Item> HERTXENGINEER_HELMET = REGISTRY.register("hertxengineer_helmet", () -> new HertxengineerItem.Helmet());
/* 229 */   public static final RegistryObject<Item> HERTXENGINEER_CHESTPLATE = REGISTRY.register("hertxengineer_chestplate", () -> new HertxengineerItem.Chestplate());
/*     */   
/* 231 */   public static final RegistryObject<Item> HERTXENGINEER_LEGGINGS = REGISTRY.register("hertxengineer_leggings", () -> new HertxengineerItem.Leggings());
/*     */   
/* 233 */   public static final RegistryObject<Item> HERTXENGINEER_BOOTS = REGISTRY.register("hertxengineer_boots", () -> new HertxengineerItem.Boots());
/* 234 */   public static final RegistryObject<Item> CRYSTALARROW = REGISTRY.register("crystalarrow", () -> new CrystalarrowItem());
/* 235 */   public static final RegistryObject<Item> DART = REGISTRY.register("dart", () -> new DartItem());
/* 236 */   public static final RegistryObject<Item> LATEXDART = REGISTRY.register("latexdart", () -> new LatexdartItem());
/* 237 */   public static final RegistryObject<Item> RIFLE_AMMO = REGISTRY.register("rifle_ammo", () -> new RifleAmmoItem());
/* 238 */   public static final RegistryObject<Item> TS_CPISTOLMAG = REGISTRY.register("ts_cpistolmag", () -> new TSCpistolmagItem());
/* 239 */   public static final RegistryObject<Item> SHOTGUN_SHELL = REGISTRY.register("shotgun_shell", () -> new ShotgunShellItem());
/* 240 */   public static final RegistryObject<Item> MUSKETBALL = REGISTRY.register("musketball", () -> new MusketballItem());
/* 241 */   public static final RegistryObject<Item> SYRINGE = REGISTRY.register("syringe", () -> new SyringeItem());
/* 242 */   public static final RegistryObject<Item> BLOOD_SYRINGE = REGISTRY.register("blood_syringe", () -> new BloodSyringeItem());
/* 243 */   public static final RegistryObject<Item> DL_SYRINGE = REGISTRY.register("dl_syringe", () -> new DLSyringeItem());
/* 244 */   public static final RegistryObject<Item> VACCINE_SYRINGE = REGISTRY.register("vaccine_syringe", () -> new VaccineSyringeItem());
/* 245 */   public static final RegistryObject<Item> DL_SWORD = REGISTRY.register("dl_sword", () -> new DLSwordItem());
/* 246 */   public static final RegistryObject<Item> DL_AXE = REGISTRY.register("dl_axe", () -> new DLAxeItem());
/* 247 */   public static final RegistryObject<Item> DL_PICKAXE = REGISTRY.register("dl_pickaxe", () -> new DLPickaxeItem());
/* 248 */   public static final RegistryObject<Item> DL_SCYTHE = REGISTRY.register("dl_scythe", () -> new DLScytheItem());
/* 249 */   public static final RegistryObject<Item> DL_HOE = REGISTRY.register("dl_hoe", () -> new DLHoeItem());
/* 250 */   public static final RegistryObject<Item> DL_SHOVEL = REGISTRY.register("dl_shovel", () -> new DLShovelItem());
/* 251 */   public static final RegistryObject<Item> CRYSTAL_BOW_UNLOADED = REGISTRY.register("crystal_bow_unloaded", () -> new CrystalBowUnloadedItem());
/* 252 */   public static final RegistryObject<Item> CRYSTALBOW = REGISTRY.register("crystalbow", () -> new CrystalbowItem());
/* 253 */   public static final RegistryObject<Item> LATEXCANNON = REGISTRY.register("latexcannon", () -> new LatexcannonItem());
/* 254 */   public static final RegistryObject<Item> REVOLVING_GOO_CANNON = REGISTRY.register("revolving_goo_cannon", () -> new RevolvingGooCannonItem());
/* 255 */   public static final RegistryObject<Item> DARTRIFLE = REGISTRY.register("dartrifle", () -> new DartrifleItem());
/* 256 */   public static final RegistryObject<Item> MATCHLOCK_PISTOL = REGISTRY.register("matchlock_pistol", () -> new MatchlockPistolItem());
/* 257 */   public static final RegistryObject<Item> MATCH_LOCK_MUSKET = REGISTRY.register("match_lock_musket", () -> new MatchLockMusketItem());
/* 258 */   public static final RegistryObject<Item> AR_70_ASSAULT_RIFLE = REGISTRY.register("ar_70_assault_rifle", () -> new AR70AssaultRifleItem());
/* 259 */   public static final RegistryObject<Item> M_4_ASSAULT_RIFLE = REGISTRY.register("m_4_assault_rifle", () -> new M4AssaultRifleItem());
/* 260 */   public static final RegistryObject<Item> SCRAP_M_16_RIFLE = REGISTRY.register("scrap_m_16_rifle", () -> new ScrapM16RifleItem());
/* 261 */   public static final RegistryObject<Item> TSC_PISTOL = REGISTRY.register("tsc_pistol", () -> new TSCPistolItem());
/* 262 */   public static final RegistryObject<Item> OVERUNDERSHOTGUN = REGISTRY.register("overundershotgun", () -> new OverundershotgunItem());
/* 263 */   public static final RegistryObject<Item> FLAMETHOWER = REGISTRY.register("flamethower", () -> new FlamethowerItem());
/* 264 */   public static final RegistryObject<Item> LATEX_RADIO_CALLER = REGISTRY.register("latex_radio_caller", () -> new LatexRadioCallerItem());
/* 265 */   public static final RegistryObject<Item> LATEX_SOUP = REGISTRY.register("latex_soup", () -> new LatexSoupItem());
/* 266 */   public static final RegistryObject<Item> ORANGE = REGISTRY.register("orange", () -> new OrangeItem());
/* 267 */   public static final RegistryObject<Item> DRONEHERTXICON = REGISTRY.register("dronehertxicon", () -> new DronehertxiconItem());
/* 268 */   public static final RegistryObject<Item> MILITARY_DRONE_HERTX_ICON = REGISTRY.register("military_drone_hertx_icon", () -> new MilitaryDroneHertxIconItem());
/*     */   
/* 270 */   public static final RegistryObject<Item> DRONEHERTXUPGRADEKIT = REGISTRY.register("dronehertxupgradekit", () -> new DronehertxupgradekitItem());
/* 271 */   public static final RegistryObject<Item> BROKENM_16 = REGISTRY.register("brokenm_16", () -> new Brokenm16Item());
/* 272 */   public static final RegistryObject<Item> GUNREPAIRKIT = REGISTRY.register("gunrepairkit", () -> new GunrepairkitItem());
/* 273 */   public static final RegistryObject<Item> GOOD_BERET_HELMET = REGISTRY.register("good_beret_helmet", () -> new GoodBeretItem.Helmet());
/* 274 */   public static final RegistryObject<Item> EVIL_BERET_HELMET = REGISTRY.register("evil_beret_helmet", () -> new EvilBeretItem.Helmet());
/* 275 */   public static final RegistryObject<Item> RECRUITMENTPAPER = REGISTRY.register("recruitmentpaper", () -> new RecruitmentpaperItem());
/* 276 */   public static final RegistryObject<Item> GUNBARREL = REGISTRY.register("gunbarrel", () -> new GunbarrelItem());
/* 277 */   public static final RegistryObject<Item> HANDCUFFS = REGISTRY.register("handcuffs", () -> new HandcuffsItem());
/* 278 */   public static final RegistryObject<Item> DARKLATEXBLOCK = block(LatexModBlocks.DARKLATEXBLOCK, LatexModTabs.TAB_LATEX);
/* 279 */   public static final RegistryObject<Item> DARKLATEXBLOCKHARMLESS = block(LatexModBlocks.DARKLATEXBLOCKHARMLESS, LatexModTabs.TAB_LATEX);
/* 280 */   public static final RegistryObject<Item> DARKLATEXBLOCKCRYSTALGROW = block(LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW, LatexModTabs.TAB_LATEX);
/* 281 */   public static final RegistryObject<Item> DARKLATEXHIVE = block(LatexModBlocks.DARKLATEXHIVE, LatexModTabs.TAB_LATEX);
/* 282 */   public static final RegistryObject<Item> DARKLATEXLOG = block(LatexModBlocks.DARKLATEXLOG, LatexModTabs.TAB_LATEX);
/* 283 */   public static final RegistryObject<Item> DARKLATEXLEAVES = block(LatexModBlocks.DARKLATEXLEAVES, LatexModTabs.TAB_LATEX);
/* 284 */   public static final RegistryObject<Item> INFESTEDDLCOBBLESTONE = block(LatexModBlocks.INFESTEDDLCOBBLESTONE, LatexModTabs.TAB_LATEX);
/* 285 */   public static final RegistryObject<Item> DARKLATEXCRYSTALEGG = block(LatexModBlocks.DARKLATEXCRYSTALEGG, LatexModTabs.TAB_LATEX);
/* 286 */   public static final RegistryObject<Item> LATEXCOBWEBFIX = block(LatexModBlocks.LATEXCOBWEBFIX, LatexModTabs.TAB_LATEX);
/* 287 */   public static final RegistryObject<Item> DARKLATEXICE = block(LatexModBlocks.DARKLATEXICE, LatexModTabs.TAB_LATEX);
/* 288 */   public static final RegistryObject<Item> EMPTYCAPSULE = block(LatexModBlocks.EMPTYCAPSULE, LatexModTabs.TAB_LATEX);
/* 289 */   public static final RegistryObject<Item> LATEXCAPSULE = block(LatexModBlocks.LATEXCAPSULE, LatexModTabs.TAB_LATEX);
/* 290 */   public static final RegistryObject<Item> DARKLATEXCARPET = block(LatexModBlocks.DARKLATEXCARPET, LatexModTabs.TAB_LATEX);
/* 291 */   public static final RegistryObject<Item> DARKLATEXPUDDLEHARMLESS = block(LatexModBlocks.DARKLATEXPUDDLEHARMLESS, LatexModTabs.TAB_LATEX);
/* 292 */   public static final RegistryObject<Item> DARK_LATEX_GOO_FLUID_BUCKET = REGISTRY.register("dark_latex_goo_fluid_bucket", () -> new DarkLatexGooFluidItem());
/*     */   
/* 294 */   public static final RegistryObject<Item> LATEXEATERSLIME = block(LatexModBlocks.LATEXEATERSLIME, LatexModTabs.TAB_LATEX);
/* 295 */   public static final RegistryObject<Item> BLACKLABBLOCK_1A = block(LatexModBlocks.BLACKLABBLOCK_1A, LatexModTabs.TAB_LATEX);
/* 296 */   public static final RegistryObject<Item> BLACKLABBLOCK_2 = block(LatexModBlocks.BLACKLABBLOCK_2, LatexModTabs.TAB_LATEX);
/* 297 */   public static final RegistryObject<Item> BLACKLABBLOCK_3 = block(LatexModBlocks.BLACKLABBLOCK_3, LatexModTabs.TAB_LATEX);
/* 298 */   public static final RegistryObject<Item> BLACKLABSLAB = block(LatexModBlocks.BLACKLABSLAB, LatexModTabs.TAB_LATEX);
/* 299 */   public static final RegistryObject<Item> REINFORCEDCONCRETE = block(LatexModBlocks.REINFORCEDCONCRETE, LatexModTabs.TAB_LATEX);
/* 300 */   public static final RegistryObject<Item> BLUELABBLOCK_1 = block(LatexModBlocks.BLUELABBLOCK_1, LatexModTabs.TAB_LATEX);
/* 301 */   public static final RegistryObject<Item> BLUELABBLOCK_2 = block(LatexModBlocks.BLUELABBLOCK_2, LatexModTabs.TAB_LATEX);
/* 302 */   public static final RegistryObject<Item> BLUELABSLABS = block(LatexModBlocks.BLUELABSLABS, LatexModTabs.TAB_LATEX);
/* 303 */   public static final RegistryObject<Item> REINFORCEDBLUECONCRETE = block(LatexModBlocks.REINFORCEDBLUECONCRETE, LatexModTabs.TAB_LATEX);
/* 304 */   public static final RegistryObject<Item> GREENLABBLOCK_1 = block(LatexModBlocks.GREENLABBLOCK_1, LatexModTabs.TAB_LATEX);
/* 305 */   public static final RegistryObject<Item> GREENLABBLOCK_2 = block(LatexModBlocks.GREENLABBLOCK_2, LatexModTabs.TAB_LATEX);
/* 306 */   public static final RegistryObject<Item> GREENLABSLABS = block(LatexModBlocks.GREENLABSLABS, LatexModTabs.TAB_LATEX);
/* 307 */   public static final RegistryObject<Item> REINFORCEDGREENCONCRETE = block(LatexModBlocks.REINFORCEDGREENCONCRETE, LatexModTabs.TAB_LATEX);
/* 308 */   public static final RegistryObject<Item> PURPLELABBLOCK_1 = block(LatexModBlocks.PURPLELABBLOCK_1, LatexModTabs.TAB_LATEX);
/* 309 */   public static final RegistryObject<Item> PURPLELABBLOCK_2 = block(LatexModBlocks.PURPLELABBLOCK_2, LatexModTabs.TAB_LATEX);
/* 310 */   public static final RegistryObject<Item> PURPLE_LAB_SLAB = block(LatexModBlocks.PURPLE_LAB_SLAB, LatexModTabs.TAB_LATEX);
/* 311 */   public static final RegistryObject<Item> REINFORCEDPURPLECONCRETE = block(LatexModBlocks.REINFORCEDPURPLECONCRETE, LatexModTabs.TAB_LATEX);
/* 312 */   public static final RegistryObject<Item> YELLOWLABBLOCK_1 = block(LatexModBlocks.YELLOWLABBLOCK_1, LatexModTabs.TAB_LATEX);
/* 313 */   public static final RegistryObject<Item> YELLOWLABBLOCK_2 = block(LatexModBlocks.YELLOWLABBLOCK_2, LatexModTabs.TAB_LATEX);
/* 314 */   public static final RegistryObject<Item> YELLOWLABSLABS = block(LatexModBlocks.YELLOWLABSLABS, LatexModTabs.TAB_LATEX);
/* 315 */   public static final RegistryObject<Item> REINFORCEDYELLOWCONCRETE = block(LatexModBlocks.REINFORCEDYELLOWCONCRETE, LatexModTabs.TAB_LATEX);
/* 316 */   public static final RegistryObject<Item> REDLABBLOCK_1 = block(LatexModBlocks.REDLABBLOCK_1, LatexModTabs.TAB_LATEX);
/* 317 */   public static final RegistryObject<Item> RED_LAB_BLOCK_2 = block(LatexModBlocks.RED_LAB_BLOCK_2, LatexModTabs.TAB_LATEX);
/* 318 */   public static final RegistryObject<Item> RED_LAB_SLABS = block(LatexModBlocks.RED_LAB_SLABS, LatexModTabs.TAB_LATEX);
/* 319 */   public static final RegistryObject<Item> REINFORCEDREDCONCRETE = block(LatexModBlocks.REINFORCEDREDCONCRETE, LatexModTabs.TAB_LATEX);
/* 320 */   public static final RegistryObject<Item> REDLAB_1 = block(LatexModBlocks.REDLAB_1, LatexModTabs.TAB_LATEX);
/* 321 */   public static final RegistryObject<Item> REDLAB_2 = block(LatexModBlocks.REDLAB_2, LatexModTabs.TAB_LATEX);
/* 322 */   public static final RegistryObject<Item> REDLAB_3 = block(LatexModBlocks.REDLAB_3, LatexModTabs.TAB_LATEX);
/* 323 */   public static final RegistryObject<Item> REDLAB_4 = block(LatexModBlocks.REDLAB_4, LatexModTabs.TAB_LATEX);
/* 324 */   public static final RegistryObject<Item> REDLAB_5 = block(LatexModBlocks.REDLAB_5, LatexModTabs.TAB_LATEX);
/* 325 */   public static final RegistryObject<Item> RED_LAB_SLAB = block(LatexModBlocks.RED_LAB_SLAB, LatexModTabs.TAB_LATEX);
/* 326 */   public static final RegistryObject<Item> RED_LAB_STAIRS = block(LatexModBlocks.RED_LAB_STAIRS, LatexModTabs.TAB_LATEX);
/* 327 */   public static final RegistryObject<Item> BUNKERBLOCK = block(LatexModBlocks.BUNKERBLOCK, LatexModTabs.TAB_LATEX);
/* 328 */   public static final RegistryObject<Item> BUNKER_BLOCK_STRIPED = block(LatexModBlocks.BUNKER_BLOCK_STRIPED, LatexModTabs.TAB_LATEX);
/* 329 */   public static final RegistryObject<Item> BUNKER_BLOCK_SMOOTH = block(LatexModBlocks.BUNKER_BLOCK_SMOOTH, LatexModTabs.TAB_LATEX);
/* 330 */   public static final RegistryObject<Item> BUNKER_STAIRS = block(LatexModBlocks.BUNKER_STAIRS, LatexModTabs.TAB_LATEX);
/* 331 */   public static final RegistryObject<Item> BUNKER_SLABS = block(LatexModBlocks.BUNKER_SLABS, LatexModTabs.TAB_LATEX);
/* 332 */   public static final RegistryObject<Item> BUNKER_WALL = block(LatexModBlocks.BUNKER_WALL, LatexModTabs.TAB_LATEX);
/* 333 */   public static final RegistryObject<Item> LIBRARYWALL_1 = block(LatexModBlocks.LIBRARYWALL_1, LatexModTabs.TAB_LATEX);
/* 334 */   public static final RegistryObject<Item> LIBRARYWALL_2 = block(LatexModBlocks.LIBRARYWALL_2, LatexModTabs.TAB_LATEX);
/* 335 */   public static final RegistryObject<Item> LIBRARYWALL_3 = block(LatexModBlocks.LIBRARYWALL_3, LatexModTabs.TAB_LATEX);
/* 336 */   public static final RegistryObject<Item> LIBRARYWALL_4 = block(LatexModBlocks.LIBRARYWALL_4, LatexModTabs.TAB_LATEX);
/* 337 */   public static final RegistryObject<Item> LIBRARYWALL_5 = block(LatexModBlocks.LIBRARYWALL_5, LatexModTabs.TAB_LATEX);
/* 338 */   public static final RegistryObject<Item> SUPPLY_CRATE = block(LatexModBlocks.SUPPLY_CRATE, LatexModTabs.TAB_LATEX);
/* 339 */   public static final RegistryObject<Item> SMALL_BOX = block(LatexModBlocks.SMALL_BOX, LatexModTabs.TAB_LATEX);
/* 340 */   public static final RegistryObject<Item> BOX = block(LatexModBlocks.BOX, LatexModTabs.TAB_LATEX);
/* 341 */   public static final RegistryObject<Item> BOX_INVENTORY = block(LatexModBlocks.BOX_INVENTORY, LatexModTabs.TAB_LATEX);
/* 342 */   public static final RegistryObject<Item> BOX_TRAP = block(LatexModBlocks.BOX_TRAP, LatexModTabs.TAB_LATEX);
/* 343 */   public static final RegistryObject<Item> SCIENTIFIC_CRATE = block(LatexModBlocks.SCIENTIFIC_CRATE, LatexModTabs.TAB_LATEX);
/* 344 */   public static final RegistryObject<Item> CRATE = block(LatexModBlocks.CRATE, LatexModTabs.TAB_LATEX);
/* 345 */   public static final RegistryObject<Item> METAL_BOX = block(LatexModBlocks.METAL_BOX, LatexModTabs.TAB_LATEX);
/* 346 */   public static final RegistryObject<Item> CHES_TRAP = block(LatexModBlocks.CHES_TRAP, LatexModTabs.TAB_LATEX);
/* 347 */   public static final RegistryObject<Item> CONE = block(LatexModBlocks.CONE, LatexModTabs.TAB_LATEX);
/* 348 */   public static final RegistryObject<Item> CONTROLPANELOFF = block(LatexModBlocks.CONTROLPANELOFF, LatexModTabs.TAB_LATEX);
/* 349 */   public static final RegistryObject<Item> SERVERS = block(LatexModBlocks.SERVERS, LatexModTabs.TAB_LATEX);
/* 350 */   public static final RegistryObject<Item> OLD_TV = block(LatexModBlocks.OLD_TV, LatexModTabs.TAB_LATEX);
/* 351 */   public static final RegistryObject<Item> BROKEN_TV = block(LatexModBlocks.BROKEN_TV, LatexModTabs.TAB_LATEX);
/* 352 */   public static final RegistryObject<Item> COMPUTER = block(LatexModBlocks.COMPUTER, LatexModTabs.TAB_LATEX);
/* 353 */   public static final RegistryObject<Item> LAPTOP_CLOSED = block(LatexModBlocks.LAPTOP_CLOSED, LatexModTabs.TAB_LATEX);
/* 354 */   public static final RegistryObject<Item> DESK = block(LatexModBlocks.DESK, LatexModTabs.TAB_LATEX);
/* 355 */   public static final RegistryObject<Item> OFFICECHAIR = block(LatexModBlocks.OFFICECHAIR, LatexModTabs.TAB_LATEX);
/* 356 */   public static final RegistryObject<Item> PLANTER = block(LatexModBlocks.PLANTER, LatexModTabs.TAB_LATEX);
/* 357 */   public static final RegistryObject<Item> FLASKCONTAINER = block(LatexModBlocks.FLASKCONTAINER, LatexModTabs.TAB_LATEX);
/* 358 */   public static final RegistryObject<Item> TELEPHONE = block(LatexModBlocks.TELEPHONE, LatexModTabs.TAB_LATEX);
/* 359 */   public static final RegistryObject<Item> VENT = block(LatexModBlocks.VENT, LatexModTabs.TAB_LATEX);
/* 360 */   public static final RegistryObject<Item> BUNKERHATCH = block(LatexModBlocks.BUNKERHATCH, LatexModTabs.TAB_LATEX);
/* 361 */   public static final RegistryObject<Item> BUNKER_DOOR = block(LatexModBlocks.BUNKER_DOOR, LatexModTabs.TAB_LATEX);
/* 362 */   public static final RegistryObject<Item> LAB_DOOR = block(LatexModBlocks.LAB_DOOR, LatexModTabs.TAB_LATEX);
/* 363 */   public static final RegistryObject<Item> BLASTDOOR = block(LatexModBlocks.BLASTDOOR, LatexModTabs.TAB_LATEX);
/* 364 */   public static final RegistryObject<Item> CEILINGLIGHT = block(LatexModBlocks.CEILINGLIGHT, LatexModTabs.TAB_LATEX);
/* 365 */   public static final RegistryObject<Item> CAGELIGHT = block(LatexModBlocks.CAGELIGHT, LatexModTabs.TAB_LATEX);
/* 366 */   public static final RegistryObject<Item> SAVE_STATION = block(LatexModBlocks.SAVE_STATION, LatexModTabs.TAB_LATEX);
/* 367 */   public static final RegistryObject<Item> OFFICETABLE = block(LatexModBlocks.OFFICETABLE, LatexModTabs.TAB_LATEX);
/* 368 */   public static final RegistryObject<Item> LOCKER = block(LatexModBlocks.LOCKER, LatexModTabs.TAB_LATEX);
/* 369 */   public static final RegistryObject<Item> LAB_EQUIPMENT = block(LatexModBlocks.LAB_EQUIPMENT, LatexModTabs.TAB_LATEX);
/* 370 */   public static final RegistryObject<Item> WALLSCREEN = block(LatexModBlocks.WALLSCREEN, LatexModTabs.TAB_LATEX);
/* 371 */   public static final RegistryObject<Item> MICROSCOPE = block(LatexModBlocks.MICROSCOPE, LatexModTabs.TAB_LATEX);
/* 372 */   public static final RegistryObject<Item> CRYOPOD = block(LatexModBlocks.CRYOPOD, LatexModTabs.TAB_LATEX);
/* 373 */   public static final RegistryObject<Item> BOOKPILERANDOM = REGISTRY.register("bookpilerandom", () -> new BookpilerandomItem());
/* 374 */   public static final RegistryObject<Item> BOOKPILE_1 = block(LatexModBlocks.BOOKPILE_1, LatexModTabs.TAB_LATEX);
/* 375 */   public static final RegistryObject<Item> BOOKPILE_2 = block(LatexModBlocks.BOOKPILE_2, LatexModTabs.TAB_LATEX);
/* 376 */   public static final RegistryObject<Item> BOOKPILE_3 = block(LatexModBlocks.BOOKPILE_3, LatexModTabs.TAB_LATEX);
/* 377 */   public static final RegistryObject<Item> BOOKPILE_4 = block(LatexModBlocks.BOOKPILE_4, LatexModTabs.TAB_LATEX);
/* 378 */   public static final RegistryObject<Item> BOOKPILE_5 = block(LatexModBlocks.BOOKPILE_5, LatexModTabs.TAB_LATEX);
/* 379 */   public static final RegistryObject<Item> GLASS_DOOR = block(LatexModBlocks.GLASS_DOOR, LatexModTabs.TAB_LATEX);
/* 380 */   public static final RegistryObject<Item> INVERTED_GLASS_DOOR = block(LatexModBlocks.INVERTED_GLASS_DOOR, LatexModTabs.TAB_LATEX);
/* 381 */   public static final RegistryObject<Item> BIGCOUCH = block(LatexModBlocks.BIGCOUCH, LatexModTabs.TAB_LATEX);
/* 382 */   public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER, LatexModTabs.TAB_LATEX);
/* 383 */   public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER_RED = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER_RED, LatexModTabs.TAB_LATEX);
/* 384 */   public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER_GREEN = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER_GREEN, LatexModTabs.TAB_LATEX);
/*     */   
/* 386 */   public static final RegistryObject<Item> CEILINGLIGHTENHANCED = block(LatexModBlocks.CEILINGLIGHTENHANCED, LatexModTabs.TAB_LATEX);
/* 387 */   public static final RegistryObject<Item> MAKESHIFT_BEACON = block(LatexModBlocks.MAKESHIFT_BEACON, LatexModTabs.TAB_LATEX);
/* 388 */   public static final RegistryObject<Item> EVIL_BEACON = block(LatexModBlocks.EVIL_BEACON, LatexModTabs.TAB_LATEX);
/* 389 */   public static final RegistryObject<Item> LATEXTUNE = REGISTRY.register("latextune", () -> new LatextuneItem());
/* 390 */   public static final RegistryObject<Item> ARMAGEDDON = REGISTRY.register("armageddon", () -> new ArmageddonItem());
/* 391 */   public static final RegistryObject<Item> YUFENGBODY_CHESTPLATE = REGISTRY.register("yufengbody_chestplate", () -> new YufengbodyItem.Chestplate());
/*     */   
/* 393 */   public static final RegistryObject<Item> TACTICALBOMB = block(LatexModBlocks.TACTICALBOMB, null);
/* 394 */   public static final RegistryObject<Item> NUKE = block(LatexModBlocks.NUKE, null);
/* 395 */   public static final RegistryObject<Item> LATEX_DART_RIFLE = REGISTRY.register("latex_dart_rifle", () -> new LatexDartRifleItem());
/* 396 */   public static final RegistryObject<Item> COMPUTER_ON = block(LatexModBlocks.COMPUTER_ON, null);
/* 397 */   public static final RegistryObject<Item> LAPTOP = block(LatexModBlocks.LAPTOP, null);
/* 398 */   public static final RegistryObject<Item> LAPTOP_ON = block(LatexModBlocks.LAPTOP_ON, null);
/* 399 */   public static final RegistryObject<Item> PHONE = REGISTRY.register("phone", () -> new PhoneItem());
/* 400 */   public static final RegistryObject<Item> TELEPHONENOPHONE = block(LatexModBlocks.TELEPHONENOPHONE, null);
/* 401 */   public static final RegistryObject<Item> VENT_OPEN = block(LatexModBlocks.VENT_OPEN, null);
/* 402 */   public static final RegistryObject<Item> BUNKER_HATCH_OPEN = block(LatexModBlocks.BUNKER_HATCH_OPEN, null);
/* 403 */   public static final RegistryObject<Item> BUNKERDOOROPEN = block(LatexModBlocks.BUNKERDOOROPEN, null);
/* 404 */   public static final RegistryObject<Item> LAB_DOOR_OPEN = block(LatexModBlocks.LAB_DOOR_OPEN, null);
/* 405 */   public static final RegistryObject<Item> TABLETOFF = REGISTRY.register("tabletoff", () -> new TabletoffItem());
/* 406 */   public static final RegistryObject<Item> WALLSCREENON = block(LatexModBlocks.WALLSCREENON, null);
/* 407 */   public static final RegistryObject<Item> OPEN_GLASS_DOOR = block(LatexModBlocks.OPEN_GLASS_DOOR, null);
/* 408 */   public static final RegistryObject<Item> INVERTED_OPEN_GLASS_DOOR = block(LatexModBlocks.INVERTED_OPEN_GLASS_DOOR, null);
/* 409 */   public static final RegistryObject<Item> BULLETICON = REGISTRY.register("bulleticon", () -> new BulleticonItem());
/* 410 */   public static final RegistryObject<Item> DARK_LATEX_FOX_SCIENTIST = REGISTRY.register("dark_latex_fox_scientist_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_FOX_SCIENTIST, -13421773, -16777165, (new Item.Properties()).tab(null)));
/*     */   
/* 412 */   public static final RegistryObject<Item> THECONE = block(LatexModBlocks.THECONE, null);
/* 413 */   public static final RegistryObject<Item> OLD_TVON = block(LatexModBlocks.OLD_TVON, null);
/* 414 */   public static final RegistryObject<Item> AHV_HERTX = REGISTRY.register("ahv_hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.AHV_HERTX, -14274520, -15794418, (new Item.Properties()).tab(null)));
/*     */   
/* 416 */   public static final RegistryObject<Item> TANK_CANNON = REGISTRY.register("tank_cannon", () -> new TankCannonItem());
/* 417 */   public static final RegistryObject<Item> NXT_HERTX = REGISTRY.register("nxt_hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.NXT_HERTX, -13421773, -6750208, (new Item.Properties()).tab(null)));
/*     */   
/* 419 */   public static final RegistryObject<Item> SNEPPLE = REGISTRY.register("snepple", () -> new SneppleItem());
/* 420 */   public static final RegistryObject<Item> RIOTARMOR_HELMET = REGISTRY.register("riotarmor_helmet", () -> new RiotarmorItem.Helmet());
/* 421 */   public static final RegistryObject<Item> RIOTARMOR_CHESTPLATE = REGISTRY.register("riotarmor_chestplate", () -> new RiotarmorItem.Chestplate());
/* 422 */   public static final RegistryObject<Item> BATON = REGISTRY.register("baton", () -> new BatonItem());
/* 423 */   public static final RegistryObject<Item> EVILBEACONON = block(LatexModBlocks.EVILBEACONON, null);
/* 424 */   public static final RegistryObject<Item> MAKESHIFT_BEACON_ON = block(LatexModBlocks.MAKESHIFT_BEACON_ON, null);
/* 425 */   public static final RegistryObject<Item> KELVARVEST_CHESTPLATE = REGISTRY.register("kelvarvest_chestplate", () -> new KelvarvestItem.Chestplate());
/*     */   
/* 427 */   public static final RegistryObject<Item> ASHBURY_HERTX = REGISTRY.register("ashbury_hertx_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.ASHBURY_HERTX, -13421773, -26368, (new Item.Properties()).tab(null)));
/*     */   
/* 429 */   public static final RegistryObject<Item> DOOM_DOLL = block(LatexModBlocks.DOOM_DOLL, null);
/* 430 */   public static final RegistryObject<Item> CONTROLPANELON = block(LatexModBlocks.CONTROLPANELON, null);
/* 431 */   public static final RegistryObject<Item> SLIMELING_TAMED = REGISTRY.register("slimeling_tamed_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.SLIMELING_TAMED, -12925126, -16208791, (new Item.Properties()).tab(null)));
/*     */   
/* 433 */   public static final RegistryObject<Item> PROTECTOR_SLIMELING = REGISTRY.register("protector_slimeling_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.PROTECTOR_SLIMELING, -267786, -757014, (new Item.Properties()).tab(null)));
/*     */   
/* 435 */   public static final RegistryObject<Item> DARK_LATEX_CAKE = REGISTRY.register("dark_latex_cake_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.DARK_LATEX_CAKE, -13421773, -806966, (new Item.Properties()).tab(null)));
/*     */   
/* 437 */   public static final RegistryObject<Item> BLAST_DOOR_OPEN = block(LatexModBlocks.BLAST_DOOR_OPEN, null);
/* 438 */   public static final RegistryObject<Item> EXPLOSIVEGOO = REGISTRY.register("explosivegoo", () -> new ExplosivegooItem());
/* 439 */   public static final RegistryObject<Item> CIVILIAN_MILITIA_MELEE = REGISTRY.register("civilian_militia_melee_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.CIVILIAN_MILITIA_MELEE, -6921408, -16324627, (new Item.Properties()).tab(null)));
/*     */   
/* 441 */   public static final RegistryObject<Item> PRISIONER_MILITIA_MELEE = REGISTRY.register("prisioner_militia_melee_spawn_egg", () -> new ForgeSpawnEggItem((Supplier)LatexModEntities.PRISIONER_MILITIA_MELEE, -6921408, -2154721, (new Item.Properties()).tab(null)));
/*     */ 
/*     */   
/*     */   private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
/* 445 */     return REGISTRY.register(block.getId().getPath(), () -> new BlockItem((Block)block.get(), (new Item.Properties()).tab(tab)));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModItems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */