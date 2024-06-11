/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import net.minecraft.world.level.GameRules;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class LatexModGameRules
/*    */ {
/* 13 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSPREAD = GameRules.register("darkLatexSpread", GameRules.Category.UPDATES, 
/* 14 */       GameRules.BooleanValue.create(true));
/* 15 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXESLEAVEBLOCK = GameRules.register("darkLatexesLeaveBlock", GameRules.Category.MOBS, 
/* 16 */       GameRules.BooleanValue.create(true));
/* 17 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXTRANSFUR = GameRules.register("darkLatexTransfur", GameRules.Category.MOBS, 
/* 18 */       GameRules.BooleanValue.create(true));
/* 19 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXCRYSTALSPAWN = GameRules.register("darkLatexCrystalSpawn", GameRules.Category.SPAWNING, 
/* 20 */       GameRules.BooleanValue.create(true));
/* 21 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXBREAKBLOCKS = GameRules.register("darkLatexBreakBlocks", GameRules.Category.MOBS, 
/* 22 */       GameRules.BooleanValue.create(true));
/* 23 */   public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSLUGGROWTIME = GameRules.register("darkLatexSlugGrowTime", GameRules.Category.MOBS, 
/* 24 */       GameRules.IntegerValue.create(325));
/* 25 */   public static final GameRules.Key<GameRules.BooleanValue> DOEVILSRAID = GameRules.register("doEvilsRaid", GameRules.Category.SPAWNING, 
/* 26 */       GameRules.BooleanValue.create(true));
/* 27 */   public static final GameRules.Key<GameRules.BooleanValue> DOSLUGSPAWN = GameRules.register("doSlugSpawn", GameRules.Category.SPAWNING, 
/* 28 */       GameRules.BooleanValue.create(true));
/* 29 */   public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSPREADSPEED = GameRules.register("darklatexspreadspeed", GameRules.Category.UPDATES, 
/* 30 */       GameRules.IntegerValue.create(50));
/* 31 */   public static final GameRules.Key<GameRules.IntegerValue> BEACONDROPMULTIPLIER = GameRules.register("beaconDropMultiplier", GameRules.Category.UPDATES, 
/* 32 */       GameRules.IntegerValue.create(10));
/* 33 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSUNLIGHTONLY = GameRules.register("darklatexsunlightonly", GameRules.Category.UPDATES, 
/* 34 */       GameRules.BooleanValue.create(false));
/* 35 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSTONESPREAD = GameRules.register("darkLatexStoneSpread", GameRules.Category.UPDATES, 
/* 36 */       GameRules.BooleanValue.create(false));
/* 37 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXFLUIDS = GameRules.register("darklatexfluids", GameRules.Category.UPDATES, 
/* 38 */       GameRules.BooleanValue.create(false));
/* 39 */   public static final GameRules.Key<GameRules.BooleanValue> CURSEOFBINDINGMASK = GameRules.register("curseofbindingmask", GameRules.Category.PLAYER, 
/* 40 */       GameRules.BooleanValue.create(true));
/* 41 */   public static final GameRules.Key<GameRules.BooleanValue> CANCOBBLESTONEBEINFESTED = GameRules.register("cancobblestonebeinfested", GameRules.Category.UPDATES, 
/* 42 */       GameRules.BooleanValue.create(true));
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModGameRules.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */