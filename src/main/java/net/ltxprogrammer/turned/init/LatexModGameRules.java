//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.init;

import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.GameRules.BooleanValue;
import net.minecraft.world.level.GameRules.Category;
import net.minecraft.world.level.GameRules.IntegerValue;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class LatexModGameRules {
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSPREAD;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXESLEAVEBLOCK;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXTRANSFUR;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXCRYSTALSPAWN;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXBREAKBLOCKS;
    public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSLUGGROWTIME;
    public static final GameRules.Key<GameRules.BooleanValue> DOEVILSRAID;
    public static final GameRules.Key<GameRules.BooleanValue> DOSLUGSPAWN;
    public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSPREADSPEED;
    public static final GameRules.Key<GameRules.IntegerValue> BEACONDROPMULTIPLIER;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSUNLIGHTONLY;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSTONESPREAD;
    public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXFLUIDS;
    public static final GameRules.Key<GameRules.BooleanValue> CURSEOFBINDINGMASK;
    public static final GameRules.Key<GameRules.BooleanValue> CANCOBBLESTONEBEINFESTED;

    public LatexModGameRules() {
    }

    static {
        DARKLATEXSPREAD = GameRules.register("darkLatexSpread", Category.UPDATES, BooleanValue.create(true));
        DARKLATEXESLEAVEBLOCK = GameRules.register("darkLatexesLeaveBlock", Category.MOBS, BooleanValue.create(true));
        DARKLATEXTRANSFUR = GameRules.register("darkLatexTransfur", Category.MOBS, BooleanValue.create(true));
        DARKLATEXCRYSTALSPAWN = GameRules.register("darkLatexCrystalSpawn", Category.SPAWNING, BooleanValue.create(true));
        DARKLATEXBREAKBLOCKS = GameRules.register("darkLatexBreakBlocks", Category.MOBS, BooleanValue.create(true));
        DARKLATEXSLUGGROWTIME = GameRules.register("darkLatexSlugGrowTime", Category.MOBS, IntegerValue.create(325));
        DOEVILSRAID = GameRules.register("doEvilsRaid", Category.SPAWNING, BooleanValue.create(true));
        DOSLUGSPAWN = GameRules.register("doSlugSpawn", Category.SPAWNING, BooleanValue.create(true));
        DARKLATEXSPREADSPEED = GameRules.register("darklatexspreadspeed", Category.UPDATES, IntegerValue.create(50));
        BEACONDROPMULTIPLIER = GameRules.register("beaconDropMultiplier", Category.UPDATES, IntegerValue.create(10));
        DARKLATEXSUNLIGHTONLY = GameRules.register("darklatexsunlightonly", Category.UPDATES, BooleanValue.create(false));
        DARKLATEXSTONESPREAD = GameRules.register("darkLatexStoneSpread", Category.UPDATES, BooleanValue.create(false));
        DARKLATEXFLUIDS = GameRules.register("darklatexfluids", Category.UPDATES, BooleanValue.create(false));
        CURSEOFBINDINGMASK = GameRules.register("curseofbindingmask", Category.PLAYER, BooleanValue.create(true));
        CANCOBBLESTONEBEINFESTED = GameRules.register("cancobblestonebeinfested", Category.UPDATES, BooleanValue.create(true));
    }
}
