package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.item.AR70AssaultRifleItem;
import net.mcreator.latexes.item.AllyradiodroppodcallerItem;
import net.mcreator.latexes.item.ArmageddonItem;
import net.mcreator.latexes.item.BatonItem;
import net.mcreator.latexes.item.BatteryItem;
import net.mcreator.latexes.item.BloodSyringeItem;
import net.mcreator.latexes.item.BookpilerandomItem;
import net.mcreator.latexes.item.BrokendlmaskItem;
import net.mcreator.latexes.item.Brokenm16Item;
import net.mcreator.latexes.item.BulleticonItem;
import net.mcreator.latexes.item.CrystalBowUnloadedItem;
import net.mcreator.latexes.item.CrystalarrowItem;
import net.mcreator.latexes.item.CrystalbowItem;
import net.mcreator.latexes.item.DLAxeItem;
import net.mcreator.latexes.item.DLHoeItem;
import net.mcreator.latexes.item.DLPickaxeItem;
import net.mcreator.latexes.item.DLScytheItem;
import net.mcreator.latexes.item.DLShovelItem;
import net.mcreator.latexes.item.DLSwordItem;
import net.mcreator.latexes.item.DLSyringeItem;
import net.mcreator.latexes.item.DarkLatexGooFluidItem;
import net.mcreator.latexes.item.DarkLatexQuiverItem;
import net.mcreator.latexes.item.DarklatexcrystalItem;
import net.mcreator.latexes.item.DarklatexgooItem;
import net.mcreator.latexes.item.DartItem;
import net.mcreator.latexes.item.DartrifleItem;
import net.mcreator.latexes.item.DlmaskItem;
import net.mcreator.latexes.item.DronehertxiconItem;
import net.mcreator.latexes.item.DronehertxupgradekitItem;
import net.mcreator.latexes.item.EvilBeretItem;
import net.mcreator.latexes.item.ExplosivegooItem;
import net.mcreator.latexes.item.FlamethowerItem;
import net.mcreator.latexes.item.GoodBeretItem;
import net.mcreator.latexes.item.GunbarrelItem;
import net.mcreator.latexes.item.GunrepairkitItem;
import net.mcreator.latexes.item.HandcuffsItem;
import net.mcreator.latexes.item.HazmatItem;
import net.mcreator.latexes.item.HertxengineerItem;
import net.mcreator.latexes.item.HertxvisorItem;
import net.mcreator.latexes.item.Instafacility2Item;
import net.mcreator.latexes.item.Instafacility3Item;
import net.mcreator.latexes.item.InstafacilityItem;
import net.mcreator.latexes.item.KelvarvestItem;
import net.mcreator.latexes.item.KeycardItem;
import net.mcreator.latexes.item.LatexDartRifleItem;
import net.mcreator.latexes.item.LatexRadioCallerItem;
import net.mcreator.latexes.item.LatexSoupItem;
import net.mcreator.latexes.item.LatexcannonItem;
import net.mcreator.latexes.item.LatexdartItem;
import net.mcreator.latexes.item.LatextuneItem;
import net.mcreator.latexes.item.M4AssaultRifleItem;
import net.mcreator.latexes.item.MatchLockMusketItem;
import net.mcreator.latexes.item.MatchlockPistolItem;
import net.mcreator.latexes.item.MilitaryDroneHertxIconItem;
import net.mcreator.latexes.item.MusketballItem;
import net.mcreator.latexes.item.OrangeItem;
import net.mcreator.latexes.item.OverundershotgunItem;
import net.mcreator.latexes.item.PhoneItem;
import net.mcreator.latexes.item.RadioDroppodcallerItem;
import net.mcreator.latexes.item.RecruitmentpaperItem;
import net.mcreator.latexes.item.RespiratorItem;
import net.mcreator.latexes.item.RevolvingGooCannonItem;
import net.mcreator.latexes.item.RifleAmmoItem;
import net.mcreator.latexes.item.RiotarmorItem;
import net.mcreator.latexes.item.ScrapM16RifleItem;
import net.mcreator.latexes.item.ShotgunShellItem;
import net.mcreator.latexes.item.SlimeessenceItem;
import net.mcreator.latexes.item.SneppleItem;
import net.mcreator.latexes.item.SyringeItem;
import net.mcreator.latexes.item.TSCPistolItem;
import net.mcreator.latexes.item.TSCpistolmagItem;
import net.mcreator.latexes.item.TabletItem;
import net.mcreator.latexes.item.TabletoffItem;
import net.mcreator.latexes.item.TankCannonItem;
import net.mcreator.latexes.item.VaccineSyringeItem;
import net.mcreator.latexes.item.YufengbodyItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModItems.class */
public class LatexModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LatexMod.MODID);
    public static final RegistryObject<Item> SLIMELING = REGISTRY.register("slimeling_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.SLIMELING, -12925126, -16223982, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARKLATEXSLUG = REGISTRY.register("darklatexslug_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARKLATEXSLUG, -13421773, -10066330, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARKLATEX = REGISTRY.register("darklatex_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARKLATEX, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_CENTAUR = REGISTRY.register("dark_latex_centaur_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CENTAUR, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_SKELETON = REGISTRY.register("dark_latex_skeleton_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SKELETON, -13421773, -16768763, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> YUFENG = REGISTRY.register("yufeng_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.YUFENG, -13421773, -15987700, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> NOISE_STALKER = REGISTRY.register("noise_stalker_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.NOISE_STALKER, -13816531, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DLSHARK = REGISTRY.register("dlshark_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DLSHARK, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_MOTH = REGISTRY.register("dark_latex_moth_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_MOTH, -14408668, -15790321, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_SNEP = REGISTRY.register("dark_latex_snep_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SNEP, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_FOX = REGISTRY.register("dark_latex_fox_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_FOX_SNIPER = REGISTRY.register("dark_latex_fox_sniper_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX_SNIPER, -13421773, -16769758, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_SNAKE = REGISTRY.register("dark_latex_snake_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SNAKE, -15329770, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_DRAGON = REGISTRY.register("dark_latex_dragon_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_DRAGON, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_SPIDER = REGISTRY.register("dark_latex_spider_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SPIDER, -13421773, -13434880, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DL_SQUID_DOG = REGISTRY.register("dl_squid_dog_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DL_SQUID_DOG, -13421773, -15856370, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> D_LBEE = REGISTRY.register("d_lbee_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.D_LBEE, -13948117, -10066432, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_QUEEN_BEE = REGISTRY.register("dark_latex_queen_bee_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_QUEEN_BEE, -13421773, -3355648, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_SPIDER_QUEEN = REGISTRY.register("dark_latex_spider_queen_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_SPIDER_QUEEN, -13421773, -6750208, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARKLATEXCONE = REGISTRY.register("darklatexcone_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARKLATEXCONE, -13421773, -10079488, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> HERTX = REGISTRY.register("hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.HERTX, -13421773, -10027162, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DRONE_HERTX = REGISTRY.register("drone_hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DRONE_HERTX, -13421773, -39424, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> ARMED_DRONE_HERTX = REGISTRY.register("armed_drone_hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.ARMED_DRONE_HERTX, -13421773, -39373, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> SCIENTIST = REGISTRY.register("scientist_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.SCIENTIST, -13083257, -15604244, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> MILITARY = REGISTRY.register("military_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.MILITARY, -14858464, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> MILITARYFLAMEUNIT = REGISTRY.register("militaryflameunit_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.MILITARYFLAMEUNIT, -14858464, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> EVIL_SCIENTIST = REGISTRY.register("evil_scientist_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.EVIL_SCIENTIST, -13083257, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> EVIL_SNIPER = REGISTRY.register("evil_sniper_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.EVIL_SNIPER, -13083257, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> EVIL_MILITARY = REGISTRY.register("evil_military_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.EVIL_MILITARY, -14858464, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> TSC_OUTSIDER = REGISTRY.register("tsc_outsider_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.TSC_OUTSIDER, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> TSC_OUTSIDER_GUNNER = REGISTRY.register("tsc_outsider_gunner_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.TSC_OUTSIDER_GUNNER, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> TS_CDRONE = REGISTRY.register("ts_cdrone_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.TS_CDRONE, -6710887, -6750208, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> TSC_HUNTER = REGISTRY.register("tsc_hunter_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.TSC_HUNTER, -3355444, -65536, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> MILITARY_RIOT = REGISTRY.register("military_riot_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.MILITARY_RIOT, -15517674, -13473224, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> TSC_BERSERK = REGISTRY.register("tsc_berserk_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.TSC_BERSERK, -3355444, -3407872, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_CREEPER = REGISTRY.register("dark_latex_creeper_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CREEPER, -13421773, -16777216, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARK_LATEX_CREEPER_ENHANCED = REGISTRY.register("dark_latex_creeper_enhanced_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CREEPER_ENHANCED, -13948373, -13382656, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> CIVILIAN = REGISTRY.register("civilian_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.CIVILIAN, -6921408, -7218211, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> PRISIONER = REGISTRY.register("prisioner_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.PRISIONER, -6921408, -2256495, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> PRISIONERMILITIA = REGISTRY.register("prisionermilitia_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.PRISIONERMILITIA, -6921408, -2154721, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> CIVLIAN_MILITIA = REGISTRY.register("civlian_militia_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.CIVLIAN_MILITIA, -6921408, -16324627, new Item.Properties().tab(LatexModTabs.TAB_LATEXENTITIES));
    });
    public static final RegistryObject<Item> DARKLATEXGOO = REGISTRY.register("darklatexgoo", () -> {
        return new DarklatexgooItem();
    });
    public static final RegistryObject<Item> DARKLATEXCRYSTAL = REGISTRY.register("darklatexcrystal", () -> {
        return new DarklatexcrystalItem();
    });
    public static final RegistryObject<Item> BROKENDLMASK = REGISTRY.register("brokendlmask", () -> {
        return new BrokendlmaskItem();
    });
    public static final RegistryObject<Item> DLMASK_HELMET = REGISTRY.register("dlmask_helmet", () -> {
        return new DlmaskItem.Helmet();
    });
    public static final RegistryObject<Item> DARK_LATEX_QUIVER_CHESTPLATE = REGISTRY.register("dark_latex_quiver_chestplate", () -> {
        return new DarkLatexQuiverItem.Chestplate();
    });
    public static final RegistryObject<Item> SLIMEESSENCE = REGISTRY.register("slimeessence", () -> {
        return new SlimeessenceItem();
    });
    public static final RegistryObject<Item> BATTERY = REGISTRY.register("battery", () -> {
        return new BatteryItem();
    });
    public static final RegistryObject<Item> KEYCARD = REGISTRY.register("keycard", () -> {
        return new KeycardItem();
    });
    public static final RegistryObject<Item> TABLET = REGISTRY.register("tablet", () -> {
        return new TabletItem();
    });
    public static final RegistryObject<Item> RADIO_DROPPODCALLER = REGISTRY.register("radio_droppodcaller", () -> {
        return new RadioDroppodcallerItem();
    });
    public static final RegistryObject<Item> ALLYRADIODROPPODCALLER = REGISTRY.register("allyradiodroppodcaller", () -> {
        return new AllyradiodroppodcallerItem();
    });
    public static final RegistryObject<Item> HERTXVISOR = REGISTRY.register("hertxvisor", () -> {
        return new HertxvisorItem();
    });
    public static final RegistryObject<Item> INSTAFACILITY = REGISTRY.register("instafacility", () -> {
        return new InstafacilityItem();
    });
    public static final RegistryObject<Item> INSTAFACILITY_2 = REGISTRY.register("instafacility_2", () -> {
        return new Instafacility2Item();
    });
    public static final RegistryObject<Item> INSTAFACILITY_3 = REGISTRY.register("instafacility_3", () -> {
        return new Instafacility3Item();
    });
    public static final RegistryObject<Item> RESPIRATOR_HELMET = REGISTRY.register("respirator_helmet", () -> {
        return new RespiratorItem.Helmet();
    });
    public static final RegistryObject<Item> HAZMAT_HELMET = REGISTRY.register("hazmat_helmet", () -> {
        return new HazmatItem.Helmet();
    });
    public static final RegistryObject<Item> HAZMAT_CHESTPLATE = REGISTRY.register("hazmat_chestplate", () -> {
        return new HazmatItem.Chestplate();
    });
    public static final RegistryObject<Item> HAZMAT_LEGGINGS = REGISTRY.register("hazmat_leggings", () -> {
        return new HazmatItem.Leggings();
    });
    public static final RegistryObject<Item> HAZMAT_BOOTS = REGISTRY.register("hazmat_boots", () -> {
        return new HazmatItem.Boots();
    });
    public static final RegistryObject<Item> HERTXENGINEER_HELMET = REGISTRY.register("hertxengineer_helmet", () -> {
        return new HertxengineerItem.Helmet();
    });
    public static final RegistryObject<Item> HERTXENGINEER_CHESTPLATE = REGISTRY.register("hertxengineer_chestplate", () -> {
        return new HertxengineerItem.Chestplate();
    });
    public static final RegistryObject<Item> HERTXENGINEER_LEGGINGS = REGISTRY.register("hertxengineer_leggings", () -> {
        return new HertxengineerItem.Leggings();
    });
    public static final RegistryObject<Item> HERTXENGINEER_BOOTS = REGISTRY.register("hertxengineer_boots", () -> {
        return new HertxengineerItem.Boots();
    });
    public static final RegistryObject<Item> CRYSTALARROW = REGISTRY.register("crystalarrow", () -> {
        return new CrystalarrowItem();
    });
    public static final RegistryObject<Item> DART = REGISTRY.register("dart", () -> {
        return new DartItem();
    });
    public static final RegistryObject<Item> LATEXDART = REGISTRY.register("latexdart", () -> {
        return new LatexdartItem();
    });
    public static final RegistryObject<Item> RIFLE_AMMO = REGISTRY.register("rifle_ammo", () -> {
        return new RifleAmmoItem();
    });
    public static final RegistryObject<Item> TS_CPISTOLMAG = REGISTRY.register("ts_cpistolmag", () -> {
        return new TSCpistolmagItem();
    });
    public static final RegistryObject<Item> SHOTGUN_SHELL = REGISTRY.register("shotgun_shell", () -> {
        return new ShotgunShellItem();
    });
    public static final RegistryObject<Item> MUSKETBALL = REGISTRY.register("musketball", () -> {
        return new MusketballItem();
    });
    public static final RegistryObject<Item> SYRINGE = REGISTRY.register("syringe", () -> {
        return new SyringeItem();
    });
    public static final RegistryObject<Item> BLOOD_SYRINGE = REGISTRY.register("blood_syringe", () -> {
        return new BloodSyringeItem();
    });
    public static final RegistryObject<Item> DL_SYRINGE = REGISTRY.register("dl_syringe", () -> {
        return new DLSyringeItem();
    });
    public static final RegistryObject<Item> VACCINE_SYRINGE = REGISTRY.register("vaccine_syringe", () -> {
        return new VaccineSyringeItem();
    });
    public static final RegistryObject<Item> DL_SWORD = REGISTRY.register("dl_sword", () -> {
        return new DLSwordItem();
    });
    public static final RegistryObject<Item> DL_AXE = REGISTRY.register("dl_axe", () -> {
        return new DLAxeItem();
    });
    public static final RegistryObject<Item> DL_PICKAXE = REGISTRY.register("dl_pickaxe", () -> {
        return new DLPickaxeItem();
    });
    public static final RegistryObject<Item> DL_SCYTHE = REGISTRY.register("dl_scythe", () -> {
        return new DLScytheItem();
    });
    public static final RegistryObject<Item> DL_HOE = REGISTRY.register("dl_hoe", () -> {
        return new DLHoeItem();
    });
    public static final RegistryObject<Item> DL_SHOVEL = REGISTRY.register("dl_shovel", () -> {
        return new DLShovelItem();
    });
    public static final RegistryObject<Item> CRYSTAL_BOW_UNLOADED = REGISTRY.register("crystal_bow_unloaded", () -> {
        return new CrystalBowUnloadedItem();
    });
    public static final RegistryObject<Item> CRYSTALBOW = REGISTRY.register("crystalbow", () -> {
        return new CrystalbowItem();
    });
    public static final RegistryObject<Item> LATEXCANNON = REGISTRY.register("latexcannon", () -> {
        return new LatexcannonItem();
    });
    public static final RegistryObject<Item> REVOLVING_GOO_CANNON = REGISTRY.register("revolving_goo_cannon", () -> {
        return new RevolvingGooCannonItem();
    });
    public static final RegistryObject<Item> DARTRIFLE = REGISTRY.register("dartrifle", () -> {
        return new DartrifleItem();
    });
    public static final RegistryObject<Item> MATCHLOCK_PISTOL = REGISTRY.register("matchlock_pistol", () -> {
        return new MatchlockPistolItem();
    });
    public static final RegistryObject<Item> MATCH_LOCK_MUSKET = REGISTRY.register("match_lock_musket", () -> {
        return new MatchLockMusketItem();
    });
    public static final RegistryObject<Item> AR_70_ASSAULT_RIFLE = REGISTRY.register("ar_70_assault_rifle", () -> {
        return new AR70AssaultRifleItem();
    });
    public static final RegistryObject<Item> M_4_ASSAULT_RIFLE = REGISTRY.register("m_4_assault_rifle", () -> {
        return new M4AssaultRifleItem();
    });
    public static final RegistryObject<Item> SCRAP_M_16_RIFLE = REGISTRY.register("scrap_m_16_rifle", () -> {
        return new ScrapM16RifleItem();
    });
    public static final RegistryObject<Item> TSC_PISTOL = REGISTRY.register("tsc_pistol", () -> {
        return new TSCPistolItem();
    });
    public static final RegistryObject<Item> OVERUNDERSHOTGUN = REGISTRY.register("overundershotgun", () -> {
        return new OverundershotgunItem();
    });
    public static final RegistryObject<Item> FLAMETHOWER = REGISTRY.register("flamethower", () -> {
        return new FlamethowerItem();
    });
    public static final RegistryObject<Item> LATEX_RADIO_CALLER = REGISTRY.register("latex_radio_caller", () -> {
        return new LatexRadioCallerItem();
    });
    public static final RegistryObject<Item> LATEX_SOUP = REGISTRY.register("latex_soup", () -> {
        return new LatexSoupItem();
    });
    public static final RegistryObject<Item> ORANGE = REGISTRY.register("orange", () -> {
        return new OrangeItem();
    });
    public static final RegistryObject<Item> DRONEHERTXICON = REGISTRY.register("dronehertxicon", () -> {
        return new DronehertxiconItem();
    });
    public static final RegistryObject<Item> MILITARY_DRONE_HERTX_ICON = REGISTRY.register("military_drone_hertx_icon", () -> {
        return new MilitaryDroneHertxIconItem();
    });
    public static final RegistryObject<Item> DRONEHERTXUPGRADEKIT = REGISTRY.register("dronehertxupgradekit", () -> {
        return new DronehertxupgradekitItem();
    });
    public static final RegistryObject<Item> BROKENM_16 = REGISTRY.register("brokenm_16", () -> {
        return new Brokenm16Item();
    });
    public static final RegistryObject<Item> GUNREPAIRKIT = REGISTRY.register("gunrepairkit", () -> {
        return new GunrepairkitItem();
    });
    public static final RegistryObject<Item> GOOD_BERET_HELMET = REGISTRY.register("good_beret_helmet", () -> {
        return new GoodBeretItem.Helmet();
    });
    public static final RegistryObject<Item> EVIL_BERET_HELMET = REGISTRY.register("evil_beret_helmet", () -> {
        return new EvilBeretItem.Helmet();
    });
    public static final RegistryObject<Item> RECRUITMENTPAPER = REGISTRY.register("recruitmentpaper", () -> {
        return new RecruitmentpaperItem();
    });
    public static final RegistryObject<Item> GUNBARREL = REGISTRY.register("gunbarrel", () -> {
        return new GunbarrelItem();
    });
    public static final RegistryObject<Item> HANDCUFFS = REGISTRY.register("handcuffs", () -> {
        return new HandcuffsItem();
    });
    public static final RegistryObject<Item> DARKLATEXBLOCK = block(LatexModBlocks.DARKLATEXBLOCK, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXBLOCKHARMLESS = block(LatexModBlocks.DARKLATEXBLOCKHARMLESS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXBLOCKCRYSTALGROW = block(LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXHIVE = block(LatexModBlocks.DARKLATEXHIVE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXLOG = block(LatexModBlocks.DARKLATEXLOG, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXLEAVES = block(LatexModBlocks.DARKLATEXLEAVES, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> INFESTEDDLCOBBLESTONE = block(LatexModBlocks.INFESTEDDLCOBBLESTONE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXCRYSTALEGG = block(LatexModBlocks.DARKLATEXCRYSTALEGG, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LATEXCOBWEBFIX = block(LatexModBlocks.LATEXCOBWEBFIX, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXICE = block(LatexModBlocks.DARKLATEXICE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> EMPTYCAPSULE = block(LatexModBlocks.EMPTYCAPSULE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> LATEXCAPSULE = block(LatexModBlocks.LATEXCAPSULE, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXCARPET = block(LatexModBlocks.DARKLATEXCARPET, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARKLATEXPUDDLEHARMLESS = block(LatexModBlocks.DARKLATEXPUDDLEHARMLESS, LatexModTabs.TAB_LATEX);
    public static final RegistryObject<Item> DARK_LATEX_GOO_FLUID_BUCKET = REGISTRY.register("dark_latex_goo_fluid_bucket", () -> {
        return new DarkLatexGooFluidItem();
    });
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
    public static final RegistryObject<Item> CONE = block(LatexModBlocks.CONE, LatexModTabs.TAB_LATEX);
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
    public static final RegistryObject<Item> BOOKPILERANDOM = REGISTRY.register("bookpilerandom", () -> {
        return new BookpilerandomItem();
    });
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
    public static final RegistryObject<Item> LATEXTUNE = REGISTRY.register("latextune", () -> {
        return new LatextuneItem();
    });
    public static final RegistryObject<Item> ARMAGEDDON = REGISTRY.register("armageddon", () -> {
        return new ArmageddonItem();
    });
    public static final RegistryObject<Item> YUFENGBODY_CHESTPLATE = REGISTRY.register("yufengbody_chestplate", () -> {
        return new YufengbodyItem.Chestplate();
    });
    public static final RegistryObject<Item> TACTICALBOMB = block(LatexModBlocks.TACTICALBOMB, null);
    public static final RegistryObject<Item> NUKE = block(LatexModBlocks.NUKE, null);
    public static final RegistryObject<Item> LATEX_DART_RIFLE = REGISTRY.register("latex_dart_rifle", () -> {
        return new LatexDartRifleItem();
    });
    public static final RegistryObject<Item> COMPUTER_ON = block(LatexModBlocks.COMPUTER_ON, null);
    public static final RegistryObject<Item> LAPTOP = block(LatexModBlocks.LAPTOP, null);
    public static final RegistryObject<Item> LAPTOP_ON = block(LatexModBlocks.LAPTOP_ON, null);
    public static final RegistryObject<Item> PHONE = REGISTRY.register("phone", () -> {
        return new PhoneItem();
    });
    public static final RegistryObject<Item> TELEPHONENOPHONE = block(LatexModBlocks.TELEPHONENOPHONE, null);
    public static final RegistryObject<Item> VENT_OPEN = block(LatexModBlocks.VENT_OPEN, null);
    public static final RegistryObject<Item> BUNKER_HATCH_OPEN = block(LatexModBlocks.BUNKER_HATCH_OPEN, null);
    public static final RegistryObject<Item> BUNKERDOOROPEN = block(LatexModBlocks.BUNKERDOOROPEN, null);
    public static final RegistryObject<Item> LAB_DOOR_OPEN = block(LatexModBlocks.LAB_DOOR_OPEN, null);
    public static final RegistryObject<Item> TABLETOFF = REGISTRY.register("tabletoff", () -> {
        return new TabletoffItem();
    });
    public static final RegistryObject<Item> WALLSCREENON = block(LatexModBlocks.WALLSCREENON, null);
    public static final RegistryObject<Item> OPEN_GLASS_DOOR = block(LatexModBlocks.OPEN_GLASS_DOOR, null);
    public static final RegistryObject<Item> INVERTED_OPEN_GLASS_DOOR = block(LatexModBlocks.INVERTED_OPEN_GLASS_DOOR, null);
    public static final RegistryObject<Item> BULLETICON = REGISTRY.register("bulleticon", () -> {
        return new BulleticonItem();
    });
    public static final RegistryObject<Item> DARK_LATEX_FOX_SCIENTIST = REGISTRY.register("dark_latex_fox_scientist_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_FOX_SCIENTIST, -13421773, -16777165, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> THECONE = block(LatexModBlocks.THECONE, null);
    public static final RegistryObject<Item> OLD_TVON = block(LatexModBlocks.OLD_TVON, null);
    public static final RegistryObject<Item> AHV_HERTX = REGISTRY.register("ahv_hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.AHV_HERTX, -14274520, -15794418, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> TANK_CANNON = REGISTRY.register("tank_cannon", () -> {
        return new TankCannonItem();
    });
    public static final RegistryObject<Item> NXT_HERTX = REGISTRY.register("nxt_hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.NXT_HERTX, -13421773, -6750208, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> SNEPPLE = REGISTRY.register("snepple", () -> {
        return new SneppleItem();
    });
    public static final RegistryObject<Item> RIOTARMOR_HELMET = REGISTRY.register("riotarmor_helmet", () -> {
        return new RiotarmorItem.Helmet();
    });
    public static final RegistryObject<Item> RIOTARMOR_CHESTPLATE = REGISTRY.register("riotarmor_chestplate", () -> {
        return new RiotarmorItem.Chestplate();
    });
    public static final RegistryObject<Item> BATON = REGISTRY.register("baton", () -> {
        return new BatonItem();
    });
    public static final RegistryObject<Item> EVILBEACONON = block(LatexModBlocks.EVILBEACONON, null);
    public static final RegistryObject<Item> MAKESHIFT_BEACON_ON = block(LatexModBlocks.MAKESHIFT_BEACON_ON, null);
    public static final RegistryObject<Item> KELVARVEST_CHESTPLATE = REGISTRY.register("kelvarvest_chestplate", () -> {
        return new KelvarvestItem.Chestplate();
    });
    public static final RegistryObject<Item> ASHBURY_HERTX = REGISTRY.register("ashbury_hertx_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.ASHBURY_HERTX, -13421773, -26368, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> DOOM_DOLL = block(LatexModBlocks.DOOM_DOLL, null);
    public static final RegistryObject<Item> CONTROLPANELON = block(LatexModBlocks.CONTROLPANELON, null);
    public static final RegistryObject<Item> SLIMELING_TAMED = REGISTRY.register("slimeling_tamed_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.SLIMELING_TAMED, -12925126, -16208791, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> PROTECTOR_SLIMELING = REGISTRY.register("protector_slimeling_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.PROTECTOR_SLIMELING, -267786, -757014, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> DARK_LATEX_CAKE = REGISTRY.register("dark_latex_cake_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.DARK_LATEX_CAKE, -13421773, -806966, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> BLAST_DOOR_OPEN = block(LatexModBlocks.BLAST_DOOR_OPEN, null);
    public static final RegistryObject<Item> EXPLOSIVEGOO = REGISTRY.register("explosivegoo", () -> {
        return new ExplosivegooItem();
    });
    public static final RegistryObject<Item> CIVILIAN_MILITIA_MELEE = REGISTRY.register("civilian_militia_melee_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.CIVILIAN_MILITIA_MELEE, -6921408, -16324627, new Item.Properties().tab((CreativeModeTab) null));
    });
    public static final RegistryObject<Item> PRISIONER_MILITIA_MELEE = REGISTRY.register("prisioner_militia_melee_spawn_egg", () -> {
        return new ForgeSpawnEggItem(LatexModEntities.PRISIONER_MILITIA_MELEE, -6921408, -2154721, new Item.Properties().tab((CreativeModeTab) null));
    });

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block) block.get(), new Item.Properties().tab(tab));
        });
    }
}
