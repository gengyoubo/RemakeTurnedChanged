package net.mcreator.latexes.init;

import net.minecraft.world.level.GameRules;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModGameRules.class */
public class LatexModGameRules {
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSPREAD = GameRules.register("darkLatexSpread", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXESLEAVEBLOCK = GameRules.register("darkLatexesLeaveBlock", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXTRANSFUR = GameRules.register("darkLatexTransfur", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXCRYSTALSPAWN = GameRules.register("darkLatexCrystalSpawn", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXBREAKBLOCKS = GameRules.register("darkLatexBreakBlocks", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSLUGGROWTIME = GameRules.register("darkLatexSlugGrowTime", GameRules.Category.MOBS, GameRules.IntegerValue.create(325));
    public static final GameRules.Key<GameRules.BooleanValue> DOEVILSRAID = GameRules.register("doEvilsRaid", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DOSLUGSPAWN = GameRules.register("doSlugSpawn", GameRules.Category.SPAWNING, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSPREADSPEED = GameRules.register("darklatexspreadspeed", GameRules.Category.UPDATES, GameRules.IntegerValue.create(50));
    public static final GameRules.Key<GameRules.IntegerValue> BEACONDROPMULTIPLIER = GameRules.register("beaconDropMultiplier", GameRules.Category.UPDATES, GameRules.IntegerValue.create(10));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSUNLIGHTONLY = GameRules.register("darklatexsunlightonly", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSTONESPREAD = GameRules.register("darkLatexStoneSpread", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXFLUIDS = GameRules.register("darklatexfluids", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
    public static final GameRules.Key<GameRules.BooleanValue> CURSEOFBINDINGMASK = GameRules.register("curseofbindingmask", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> CANCOBBLESTONEBEINFESTED = GameRules.register("cancobblestonebeinfested", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
}
