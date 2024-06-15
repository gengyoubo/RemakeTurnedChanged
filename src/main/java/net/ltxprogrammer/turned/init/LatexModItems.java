package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.item.AR70AssaultRifleItem;
import net.ltxprogrammer.turned.item.AllyradiodroppodcallerItem;
import net.ltxprogrammer.turned.item.ArmageddonItem;
import net.ltxprogrammer.turned.item.BatonItem;
import net.ltxprogrammer.turned.item.BatteryItem;
import net.ltxprogrammer.turned.item.BookpilerandomItem;
import net.ltxprogrammer.turned.item.BrokendlmaskItem;
import net.ltxprogrammer.turned.item.Brokenm16Item;
import net.ltxprogrammer.turned.item.BulleticonItem;
import net.ltxprogrammer.turned.item.CrystalBowUnloadedItem;
import net.ltxprogrammer.turned.item.CrystalarrowItem;
import net.ltxprogrammer.turned.item.CrystalbowItem;
import net.ltxprogrammer.turned.item.DLAxeItem;
import net.ltxprogrammer.turned.item.DLHoeItem;
import net.ltxprogrammer.turned.item.DLPickaxeItem;
import net.ltxprogrammer.turned.item.DLScytheItem;
import net.ltxprogrammer.turned.item.DLShovelItem;
import net.ltxprogrammer.turned.item.DLSwordItem;
import net.ltxprogrammer.turned.item.DarkLatexQuiverItem;
import net.ltxprogrammer.turned.item.DartItem;
import net.ltxprogrammer.turned.item.DartrifleItem;
import net.ltxprogrammer.turned.item.DronehertxiconItem;
import net.ltxprogrammer.turned.item.DronehertxupgradekitItem;
import net.ltxprogrammer.turned.item.EvilBeretItem;
import net.ltxprogrammer.turned.item.ExplosivegooItem;
import net.ltxprogrammer.turned.item.FlamethowerItem;
import net.ltxprogrammer.turned.item.GoodBeretItem;
import net.ltxprogrammer.turned.item.GunbarrelItem;
import net.ltxprogrammer.turned.item.GunrepairkitItem;
import net.ltxprogrammer.turned.item.HandcuffsItem;
import net.ltxprogrammer.turned.item.HazmatItem;
import net.ltxprogrammer.turned.item.HertxengineerItem;
import net.ltxprogrammer.turned.item.HertxvisorItem;
import net.ltxprogrammer.turned.item.Instafacility2Item;
import net.ltxprogrammer.turned.item.Instafacility3Item;
import net.ltxprogrammer.turned.item.InstafacilityItem;
import net.ltxprogrammer.turned.item.KelvarvestItem;
import net.ltxprogrammer.turned.item.KeycardItem;
import net.ltxprogrammer.turned.item.LatexDartRifleItem;
import net.ltxprogrammer.turned.item.LatexRadioCallerItem;
import net.ltxprogrammer.turned.item.LatexSoupItem;
import net.ltxprogrammer.turned.item.LatexcannonItem;
import net.ltxprogrammer.turned.item.LatexdartItem;
import net.ltxprogrammer.turned.item.LatextuneItem;
import net.ltxprogrammer.turned.item.M4AssaultRifleItem;
import net.ltxprogrammer.turned.item.MatchLockMusketItem;
import net.ltxprogrammer.turned.item.MatchlockPistolItem;
import net.ltxprogrammer.turned.item.MilitaryDroneHertxIconItem;
import net.ltxprogrammer.turned.item.MusketballItem;
import net.ltxprogrammer.turned.item.OverundershotgunItem;
import net.ltxprogrammer.turned.item.PhoneItem;
import net.ltxprogrammer.turned.item.RadioDroppodcallerItem;
import net.ltxprogrammer.turned.item.RecruitmentpaperItem;
import net.ltxprogrammer.turned.item.RespiratorItem;
import net.ltxprogrammer.turned.item.RevolvingGooCannonItem;
import net.ltxprogrammer.turned.item.RifleAmmoItem;
import net.ltxprogrammer.turned.item.RiotarmorItem;
import net.ltxprogrammer.turned.item.ScrapM16RifleItem;
import net.ltxprogrammer.turned.item.ShotgunShellItem;
import net.ltxprogrammer.turned.item.SlimeessenceItem;
import net.ltxprogrammer.turned.item.SneppleItem;
import net.ltxprogrammer.turned.item.TSCPistolItem;
import net.ltxprogrammer.turned.item.TSCpistolmagItem;
import net.ltxprogrammer.turned.item.TabletItem;
import net.ltxprogrammer.turned.item.TabletoffItem;
import net.ltxprogrammer.turned.item.TankCannonItem;
import net.ltxprogrammer.turned.item.VaccineSyringeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModItems.class */
public class LatexModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LatexMod.MODID);
    //public static final RegistryObject<Item> SLIMELING = REGISTRY.register("slimeling_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.SLIMELING, -12925126, -16223982, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARKLATEXSLUG = REGISTRY.register("darklatexslug_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARKLATEXSLUG, -13421773, -10066330, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARKLATEX = REGISTRY.register("darklatex_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARKLATEX, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_CENTAUR = REGISTRY.register("dark_latex_centaur_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CENTAUR, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_SKELETON = REGISTRY.register("dark_latex_skeleton_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SKELETON, -13421773, -16768763, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> NOISE_STALKER = REGISTRY.register("noise_stalker_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.NOISE_STALKER, -13816531, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DLSHARK = REGISTRY.register("dlshark_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DLSHARK, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_MOTH = REGISTRY.register("dark_latex_moth_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_MOTH, -14408668, -15790321, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_SNEP = REGISTRY.register("dark_latex_snep_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SNEP, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_FOX = REGISTRY.register("dark_latex_fox_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_FOX_SNIPER = REGISTRY.register("dark_latex_fox_sniper_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX_SNIPER, -13421773, -16769758, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    //public static final RegistryObject<Item> DARK_LATEX_SNAKE = REGISTRY.register("dark_latex_snake_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SNAKE, -15329770, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_SPIDER = REGISTRY.register("dark_latex_spider_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SPIDER, -13421773, -13434880, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DL_SQUID_DOG = REGISTRY.register("dl_squid_dog_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DL_SQUID_DOG, -13421773, -15856370, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> D_LBEE = REGISTRY.register("d_lbee_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.D_LBEE, -13948117, -10066432, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_QUEEN_BEE = REGISTRY.register("dark_latex_queen_bee_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_QUEEN_BEE, -13421773, -3355648, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_SPIDER_QUEEN = REGISTRY.register("dark_latex_spider_queen_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SPIDER_QUEEN, -13421773, -6750208, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARKLATEXCONE = REGISTRY.register("darklatexcone_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARKLATEXCONE, -13421773, -10079488, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> HERTX = REGISTRY.register("hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.HERTX, -13421773, -10027162, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DRONE_HERTX = REGISTRY.register("drone_hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DRONE_HERTX, -13421773, -39424, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> ARMED_DRONE_HERTX = REGISTRY.register("armed_drone_hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.ARMED_DRONE_HERTX, -13421773, -39373, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> SCIENTIST = REGISTRY.register("scientist_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.SCIENTIST, -13083257, -15604244, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> MILITARY = REGISTRY.register("military_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.MILITARY, -14858464, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> MILITARYFLAMEUNIT = REGISTRY.register("militaryflameunit_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.MILITARYFLAMEUNIT, -14858464, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> EVIL_SCIENTIST = REGISTRY.register("evil_scientist_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.EVIL_SCIENTIST, -13083257, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> EVIL_SNIPER = REGISTRY.register("evil_sniper_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.EVIL_SNIPER, -13083257, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> EVIL_MILITARY = REGISTRY.register("evil_military_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.EVIL_MILITARY, -14858464, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TSC_OUTSIDER = REGISTRY.register("tsc_outsider_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.TSC_OUTSIDER, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TSC_OUTSIDER_GUNNER = REGISTRY.register("tsc_outsider_gunner_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.TSC_OUTSIDER_GUNNER, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TS_CDRONE = REGISTRY.register("ts_cdrone_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.TS_CDRONE, -6710887, -6750208, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TSC_HUNTER = REGISTRY.register("tsc_hunter_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.TSC_HUNTER, -3355444, -65536, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> MILITARY_RIOT = REGISTRY.register("military_riot_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.MILITARY_RIOT, -15517674, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TSC_BERSERK = REGISTRY.register("tsc_berserk_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.TSC_BERSERK, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_CREEPER = REGISTRY.register("dark_latex_creeper_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CREEPER, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_CREEPER_ENHANCED = REGISTRY.register("dark_latex_creeper_enhanced_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CREEPER_ENHANCED, -13948373, -13382656, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> CIVILIAN = REGISTRY.register("civilian_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.CIVILIAN, -6921408, -7218211, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> PRISIONER = REGISTRY.register("prisioner_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.PRISIONER, -6921408, -2256495, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> PRISIONERMILITIA = REGISTRY.register("prisionermilitia_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.PRISIONERMILITIA, -6921408, -2154721, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> CIVLIAN_MILITIA = REGISTRY.register("civlian_militia_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.CIVLIAN_MILITIA, -6921408, -16324627, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> BROKENDLMASK = REGISTRY.register("brokendlmask", BrokendlmaskItem::new);
    public static final RegistryObject<Item> DARK_LATEX_QUIVER_CHESTPLATE = REGISTRY.register("dark_latex_quiver_chestplate", DarkLatexQuiverItem.Chestplate::new);
    public static final RegistryObject<Item> SLIMEESSENCE = REGISTRY.register("slimeessence", SlimeessenceItem::new);
    public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", BatteryItem::new);
    public static final RegistryObject<Item> KEYCARD = REGISTRY.register("keycard", KeycardItem::new);
    public static final RegistryObject<Item> TABLET = REGISTRY.register("tablet", TabletItem::new);
    public static final RegistryObject<Item> RADIO_DROPPODCALLER = REGISTRY.register("radio_droppodcaller", RadioDroppodcallerItem::new);
    public static final RegistryObject<Item> ALLYRADIODROPPODCALLER = REGISTRY.register("allyradiodroppodcaller", AllyradiodroppodcallerItem::new);
    public static final RegistryObject<Item> HERTXVISOR = REGISTRY.register("hertxvisor", HertxvisorItem::new);
    public static final RegistryObject<Item> INSTAFACILITY = REGISTRY.register("instafacility", InstafacilityItem::new);
    public static final RegistryObject<Item> INSTAFACILITY_2 = REGISTRY.register("instafacility_2", Instafacility2Item::new);
    public static final RegistryObject<Item> INSTAFACILITY_3 = REGISTRY.register("instafacility_3", Instafacility3Item::new);
    public static final RegistryObject<Item> RESPIRATOR_HELMET = REGISTRY.register("respirator_helmet", RespiratorItem.Helmet::new);
    public static final RegistryObject<Item> HAZMAT_HELMET = REGISTRY.register("hazmat_helmet", HazmatItem.Helmet::new);
    public static final RegistryObject<Item> HAZMAT_CHESTPLATE = REGISTRY.register("hazmat_chestplate", HazmatItem.Chestplate::new);
    public static final RegistryObject<Item> HAZMAT_LEGGINGS = REGISTRY.register("hazmat_leggings", HazmatItem.Leggings::new);
    public static final RegistryObject<Item> HAZMAT_BOOTS = REGISTRY.register("hazmat_boots", HazmatItem.Boots::new);
    public static final RegistryObject<Item> HERTXENGINEER_HELMET = REGISTRY.register("hertxengineer_helmet", HertxengineerItem.Helmet::new);
    public static final RegistryObject<Item> HERTXENGINEER_CHESTPLATE = REGISTRY.register("hertxengineer_chestplate", HertxengineerItem.Chestplate::new);
    public static final RegistryObject<Item> HERTXENGINEER_LEGGINGS = REGISTRY.register("hertxengineer_leggings", HertxengineerItem.Leggings::new);
    public static final RegistryObject<Item> HERTXENGINEER_BOOTS = REGISTRY.register("hertxengineer_boots", HertxengineerItem.Boots::new);
    public static final RegistryObject<Item> CRYSTALARROW = REGISTRY.register("crystalarrow", CrystalarrowItem::new);
    public static final RegistryObject<Item> DART = REGISTRY.register("dart", DartItem::new);
    public static final RegistryObject<Item> LATEXDART = REGISTRY.register("latexdart", LatexdartItem::new);
    public static final RegistryObject<Item> RIFLE_AMMO = REGISTRY.register("rifle_ammo", RifleAmmoItem::new);
    public static final RegistryObject<Item> TS_CPISTOLMAG = REGISTRY.register("ts_cpistolmag", TSCpistolmagItem::new);
    public static final RegistryObject<Item> SHOTGUN_SHELL = REGISTRY.register("shotgun_shell", ShotgunShellItem::new);
    public static final RegistryObject<Item> MUSKETBALL = REGISTRY.register("musketball", MusketballItem::new);
    public static final RegistryObject<Item> VACCINE_SYRINGE = REGISTRY.register("vaccine_syringe", VaccineSyringeItem::new);
    public static final RegistryObject<Item> DL_SWORD = REGISTRY.register("dl_sword", DLSwordItem::new);
    public static final RegistryObject<Item> DL_AXE = REGISTRY.register("dl_axe", DLAxeItem::new);
    public static final RegistryObject<Item> DL_PICKAXE = REGISTRY.register("dl_pickaxe", DLPickaxeItem::new);
    public static final RegistryObject<Item> DL_SCYTHE = REGISTRY.register("dl_scythe", DLScytheItem::new);
    public static final RegistryObject<Item> DL_HOE = REGISTRY.register("dl_hoe", DLHoeItem::new);
    public static final RegistryObject<Item> DL_SHOVEL = REGISTRY.register("dl_shovel", DLShovelItem::new);
    public static final RegistryObject<Item> CRYSTAL_BOW_UNLOADED = REGISTRY.register("crystal_bow_unloaded", CrystalBowUnloadedItem::new);
    public static final RegistryObject<Item> CRYSTALBOW = REGISTRY.register("crystalbow", CrystalbowItem::new);
    public static final RegistryObject<Item> LATEXCANNON = REGISTRY.register("latexcannon", LatexcannonItem::new);
    public static final RegistryObject<Item> REVOLVING_GOO_CANNON = REGISTRY.register("revolving_goo_cannon", RevolvingGooCannonItem::new);
    public static final RegistryObject<Item> DARTRIFLE = REGISTRY.register("dartrifle", DartrifleItem::new);
    public static final RegistryObject<Item> MATCHLOCK_PISTOL = REGISTRY.register("matchlock_pistol", MatchlockPistolItem::new);
    public static final RegistryObject<Item> MATCH_LOCK_MUSKET = REGISTRY.register("match_lock_musket", MatchLockMusketItem::new);
    public static final RegistryObject<Item> AR_70_ASSAULT_RIFLE = REGISTRY.register("ar_70_assault_rifle", AR70AssaultRifleItem::new);
    public static final RegistryObject<Item> M_4_ASSAULT_RIFLE = REGISTRY.register("m_4_assault_rifle", M4AssaultRifleItem::new);
    public static final RegistryObject<Item> SCRAP_M_16_RIFLE = REGISTRY.register("scrap_m_16_rifle", ScrapM16RifleItem::new);
    public static final RegistryObject<Item> TSC_PISTOL = REGISTRY.register("tsc_pistol", TSCPistolItem::new);
    public static final RegistryObject<Item> OVERUNDERSHOTGUN = REGISTRY.register("overundershotgun", OverundershotgunItem::new);
    public static final RegistryObject<Item> FLAMETHOWER = REGISTRY.register("flamethower", FlamethowerItem::new);
    public static final RegistryObject<Item> LATEX_RADIO_CALLER = REGISTRY.register("latex_radio_caller", LatexRadioCallerItem::new);
    public static final RegistryObject<Item> LATEX_SOUP = REGISTRY.register("latex_soup", LatexSoupItem::new);
    public static final RegistryObject<Item> DRONEHERTXICON = REGISTRY.register("dronehertxicon", DronehertxiconItem::new);
    public static final RegistryObject<Item> MILITARY_DRONE_HERTX_ICON = REGISTRY.register("military_drone_hertx_icon", MilitaryDroneHertxIconItem::new);
    public static final RegistryObject<Item> DRONEHERTXUPGRADEKIT = REGISTRY.register("dronehertxupgradekit", DronehertxupgradekitItem::new);
    public static final RegistryObject<Item> BROKENM_16 = REGISTRY.register("brokenm_16", Brokenm16Item::new);
    public static final RegistryObject<Item> GUNREPAIRKIT = REGISTRY.register("gunrepairkit", GunrepairkitItem::new);
    public static final RegistryObject<Item> GOOD_BERET_HELMET = REGISTRY.register("good_beret_helmet", GoodBeretItem.Helmet::new);
    public static final RegistryObject<Item> EVIL_BERET_HELMET = REGISTRY.register("evil_beret_helmet", EvilBeretItem.Helmet::new);
    public static final RegistryObject<Item> RECRUITMENTPAPER = REGISTRY.register("recruitmentpaper", RecruitmentpaperItem::new);
    public static final RegistryObject<Item> GUNBARREL = REGISTRY.register("gunbarrel", GunbarrelItem::new);
    public static final RegistryObject<Item> HANDCUFFS = REGISTRY.register("handcuffs", HandcuffsItem::new);
    public static final RegistryObject<Item> DARKLATEXHIVE = block(LatexModBlocks.DARKLATEXHIVE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> INFESTEDDLCOBBLESTONE = block(LatexModBlocks.INFESTEDDLCOBBLESTONE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> EMPTYCAPSULE = block(LatexModBlocks.EMPTYCAPSULE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LATEXCAPSULE = block(LatexModBlocks.LATEXCAPSULE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXPUDDLEHARMLESS = block(LatexModBlocks.DARKLATEXPUDDLEHARMLESS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LATEXEATERSLIME = block(LatexModBlocks.LATEXEATERSLIME, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLACKLABBLOCK_1A = block(LatexModBlocks.BLACKLABBLOCK_1A, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLACKLABBLOCK_2 = block(LatexModBlocks.BLACKLABBLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLACKLABBLOCK_3 = block(LatexModBlocks.BLACKLABBLOCK_3, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLACKLABSLAB = block(LatexModBlocks.BLACKLABSLAB, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDCONCRETE = block(LatexModBlocks.REINFORCEDCONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLUELABBLOCK_1 = block(LatexModBlocks.BLUELABBLOCK_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLUELABBLOCK_2 = block(LatexModBlocks.BLUELABBLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLUELABSLABS = block(LatexModBlocks.BLUELABSLABS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDBLUECONCRETE = block(LatexModBlocks.REINFORCEDBLUECONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> GREENLABBLOCK_1 = block(LatexModBlocks.GREENLABBLOCK_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> GREENLABBLOCK_2 = block(LatexModBlocks.GREENLABBLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> GREENLABSLABS = block(LatexModBlocks.GREENLABSLABS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDGREENCONCRETE = block(LatexModBlocks.REINFORCEDGREENCONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> PURPLELABBLOCK_1 = block(LatexModBlocks.PURPLELABBLOCK_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> PURPLELABBLOCK_2 = block(LatexModBlocks.PURPLELABBLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> PURPLE_LAB_SLAB = block(LatexModBlocks.PURPLE_LAB_SLAB, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDPURPLECONCRETE = block(LatexModBlocks.REINFORCEDPURPLECONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> YELLOWLABBLOCK_1 = block(LatexModBlocks.YELLOWLABBLOCK_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> YELLOWLABBLOCK_2 = block(LatexModBlocks.YELLOWLABBLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> YELLOWLABSLABS = block(LatexModBlocks.YELLOWLABSLABS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDYELLOWCONCRETE = block(LatexModBlocks.REINFORCEDYELLOWCONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLABBLOCK_1 = block(LatexModBlocks.REDLABBLOCK_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> RED_LAB_BLOCK_2 = block(LatexModBlocks.RED_LAB_BLOCK_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> RED_LAB_SLABS = block(LatexModBlocks.RED_LAB_SLABS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REINFORCEDREDCONCRETE = block(LatexModBlocks.REINFORCEDREDCONCRETE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLAB_1 = block(LatexModBlocks.REDLAB_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLAB_2 = block(LatexModBlocks.REDLAB_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLAB_3 = block(LatexModBlocks.REDLAB_3, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLAB_4 = block(LatexModBlocks.REDLAB_4, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> REDLAB_5 = block(LatexModBlocks.REDLAB_5, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> RED_LAB_SLAB = block(LatexModBlocks.RED_LAB_SLAB, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> RED_LAB_STAIRS = block(LatexModBlocks.RED_LAB_STAIRS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKERBLOCK = block(LatexModBlocks.BUNKERBLOCK, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_BLOCK_STRIPED = block(LatexModBlocks.BUNKER_BLOCK_STRIPED, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_BLOCK_SMOOTH = block(LatexModBlocks.BUNKER_BLOCK_SMOOTH, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_STAIRS = block(LatexModBlocks.BUNKER_STAIRS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_SLABS = block(LatexModBlocks.BUNKER_SLABS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_WALL = block(LatexModBlocks.BUNKER_WALL, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LIBRARYWALL_1 = block(LatexModBlocks.LIBRARYWALL_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LIBRARYWALL_2 = block(LatexModBlocks.LIBRARYWALL_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LIBRARYWALL_3 = block(LatexModBlocks.LIBRARYWALL_3, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LIBRARYWALL_4 = block(LatexModBlocks.LIBRARYWALL_4, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LIBRARYWALL_5 = block(LatexModBlocks.LIBRARYWALL_5, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> SUPPLY_CRATE = block(LatexModBlocks.SUPPLY_CRATE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> SMALL_BOX = block(LatexModBlocks.SMALL_BOX, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOX = block(LatexModBlocks.BOX, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOX_INVENTORY = block(LatexModBlocks.BOX_INVENTORY, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOX_TRAP = block(LatexModBlocks.BOX_TRAP, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> SCIENTIFIC_CRATE = block(LatexModBlocks.SCIENTIFIC_CRATE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CRATE = block(LatexModBlocks.CRATE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> METAL_BOX = block(LatexModBlocks.METAL_BOX, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CHES_TRAP = block(LatexModBlocks.CHES_TRAP, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CONTROLPANELOFF = block(LatexModBlocks.CONTROLPANELOFF, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> SERVERS = block(LatexModBlocks.SERVERS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> OLD_TV = block(LatexModBlocks.OLD_TV, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BROKEN_TV = block(LatexModBlocks.BROKEN_TV, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> COMPUTER = block(LatexModBlocks.COMPUTER, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LAPTOP_CLOSED = block(LatexModBlocks.LAPTOP_CLOSED, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DESK = block(LatexModBlocks.DESK, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> OFFICECHAIR = block(LatexModBlocks.OFFICECHAIR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> PLANTER = block(LatexModBlocks.PLANTER, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> FLASKCONTAINER = block(LatexModBlocks.FLASKCONTAINER, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> TELEPHONE = block(LatexModBlocks.TELEPHONE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> VENT = block(LatexModBlocks.VENT, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKERHATCH = block(LatexModBlocks.BUNKERHATCH, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BUNKER_DOOR = block(LatexModBlocks.BUNKER_DOOR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LAB_DOOR = block(LatexModBlocks.LAB_DOOR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BLASTDOOR = block(LatexModBlocks.BLASTDOOR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CEILINGLIGHT = block(LatexModBlocks.CEILINGLIGHT, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CAGELIGHT = block(LatexModBlocks.CAGELIGHT, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> SAVE_STATION = block(LatexModBlocks.SAVE_STATION, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> OFFICETABLE = block(LatexModBlocks.OFFICETABLE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LOCKER = block(LatexModBlocks.LOCKER, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LAB_EQUIPMENT = block(LatexModBlocks.LAB_EQUIPMENT, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> WALLSCREEN = block(LatexModBlocks.WALLSCREEN, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> MICROSCOPE = block(LatexModBlocks.MICROSCOPE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CRYOPOD = block(LatexModBlocks.CRYOPOD, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOOKPILERANDOM = REGISTRY.register("bookpilerandom", BookpilerandomItem::new);
    public static final RegistryObject<Item> BOOKPILE_1 = block(LatexModBlocks.BOOKPILE_1, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOOKPILE_2 = block(LatexModBlocks.BOOKPILE_2, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOOKPILE_3 = block(LatexModBlocks.BOOKPILE_3, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOOKPILE_4 = block(LatexModBlocks.BOOKPILE_4, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BOOKPILE_5 = block(LatexModBlocks.BOOKPILE_5, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> GLASS_DOOR = block(LatexModBlocks.GLASS_DOOR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> INVERTED_GLASS_DOOR = block(LatexModBlocks.INVERTED_GLASS_DOOR, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> BIGCOUCH = block(LatexModBlocks.BIGCOUCH, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER_RED = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER_RED, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> HIGH_PRESSURE_CYLINDER_GREEN = block(LatexModBlocks.HIGH_PRESSURE_CYLINDER_GREEN, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> CEILINGLIGHTENHANCED = block(LatexModBlocks.CEILINGLIGHTENHANCED, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> MAKESHIFT_BEACON = block(LatexModBlocks.MAKESHIFT_BEACON, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> EVIL_BEACON = block(LatexModBlocks.EVIL_BEACON, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LATEXTUNE = REGISTRY.register("latextune", LatextuneItem::new);
    public static final RegistryObject<Item> ARMAGEDDON = REGISTRY.register("armageddon", ArmageddonItem::new);
    public static final RegistryObject<Item> TACTICALBOMB = block(LatexModBlocks.TACTICALBOMB, null);
    public static final RegistryObject<Item> NUKE = block(LatexModBlocks.NUKE, null);
    public static final RegistryObject<Item> LATEX_DART_RIFLE = REGISTRY.register("latex_dart_rifle", LatexDartRifleItem::new);
    public static final RegistryObject<Item> COMPUTER_ON = block(LatexModBlocks.COMPUTER_ON, null);
    public static final RegistryObject<Item> LAPTOP = block(LatexModBlocks.LAPTOP, null);
    public static final RegistryObject<Item> LAPTOP_ON = block(LatexModBlocks.LAPTOP_ON, null);
    public static final RegistryObject<Item> PHONE = REGISTRY.register("phone", PhoneItem::new);
    public static final RegistryObject<Item> TELEPHONENOPHONE = block(LatexModBlocks.TELEPHONENOPHONE, null);
    public static final RegistryObject<Item> VENT_OPEN = block(LatexModBlocks.VENT_OPEN, null);
    public static final RegistryObject<Item> BUNKER_HATCH_OPEN = block(LatexModBlocks.BUNKER_HATCH_OPEN, null);
    public static final RegistryObject<Item> BUNKERDOOROPEN = block(LatexModBlocks.BUNKERDOOROPEN, null);
    public static final RegistryObject<Item> LAB_DOOR_OPEN = block(LatexModBlocks.LAB_DOOR_OPEN, null);
    public static final RegistryObject<Item> TABLETOFF = REGISTRY.register("tabletoff", TabletoffItem::new);
    public static final RegistryObject<Item> WALLSCREENON = block(LatexModBlocks.WALLSCREENON, null);
    public static final RegistryObject<Item> OPEN_GLASS_DOOR = block(LatexModBlocks.OPEN_GLASS_DOOR, null);
    public static final RegistryObject<Item> INVERTED_OPEN_GLASS_DOOR = block(LatexModBlocks.INVERTED_OPEN_GLASS_DOOR, null);
    public static final RegistryObject<Item> BULLETICON = REGISTRY.register("bulleticon", BulleticonItem::new);
    public static final RegistryObject<Item> DARK_LATEX_FOX_SCIENTIST = REGISTRY.register("dark_latex_fox_scientist_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX_SCIENTIST, -13421773, -16777165, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> THECONE = block(LatexModBlocks.THECONE, null);
    public static final RegistryObject<Item> OLD_TVON = block(LatexModBlocks.OLD_TVON, null);
    public static final RegistryObject<Item> AHV_HERTX = REGISTRY.register("ahv_hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.AHV_HERTX, -14274520, -15794418, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> TANK_CANNON = REGISTRY.register("tank_cannon", TankCannonItem::new);
    public static final RegistryObject<Item> NXT_HERTX = REGISTRY.register("nxt_hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.NXT_HERTX, -13421773, -6750208, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> SNEPPLE = REGISTRY.register("snepple", SneppleItem::new);
    public static final RegistryObject<Item> RIOTARMOR_HELMET = REGISTRY.register("riotarmor_helmet", RiotarmorItem.Helmet::new);
    public static final RegistryObject<Item> RIOTARMOR_CHESTPLATE = REGISTRY.register("riotarmor_chestplate", RiotarmorItem.Chestplate::new);
    public static final RegistryObject<Item> BATON = REGISTRY.register("baton", BatonItem::new);
    public static final RegistryObject<Item> EVILBEACONON = block(LatexModBlocks.EVILBEACONON, null);
    public static final RegistryObject<Item> MAKESHIFT_BEACON_ON = block(LatexModBlocks.MAKESHIFT_BEACON_ON, null);
    public static final RegistryObject<Item> KELVARVEST_CHESTPLATE = REGISTRY.register("kelvarvest_chestplate", KelvarvestItem.Chestplate::new);
    public static final RegistryObject<Item> ASHBURY_HERTX = REGISTRY.register("ashbury_hertx_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.ASHBURY_HERTX, -13421773, -26368, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DOOM_DOLL = block(LatexModBlocks.DOOM_DOLL, null);
    public static final RegistryObject<Item> CONTROLPANELON = block(LatexModBlocks.CONTROLPANELON, null);
    public static final RegistryObject<Item> SLIMELING_TAMED = REGISTRY.register("slimeling_tamed_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.SLIMELING_TAMED, -12925126, -16208791, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> PROTECTOR_SLIMELING = REGISTRY.register("protector_slimeling_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.PROTECTOR_SLIMELING, -267786, -757014, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> DARK_LATEX_CAKE = REGISTRY.register("dark_latex_cake_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CAKE, -13421773, -806966, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> BLAST_DOOR_OPEN = block(LatexModBlocks.BLAST_DOOR_OPEN, null);
    public static final RegistryObject<Item> EXPLOSIVEGOO = REGISTRY.register("explosivegoo", ExplosivegooItem::new);
    public static final RegistryObject<Item> CIVILIAN_MILITIA_MELEE = REGISTRY.register("civilian_militia_melee_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.CIVILIAN_MILITIA_MELEE, -6921408, -16324627, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));
    public static final RegistryObject<Item> PRISIONER_MILITIA_MELEE = REGISTRY.register("prisioner_militia_melee_spawn_egg", () -> new ForgeSpawnEggItem(LatexModEntities.PRISIONER_MILITIA_MELEE, -6921408, -2154721, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES)));

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem((Block) block.get(), new Item.Properties().tab(tab)));
    }
}
