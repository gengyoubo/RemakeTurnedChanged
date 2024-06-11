/*    */ package net.ltxprogrammer.turned.init;
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
/* 13 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSPREAD = GameRules.m_46189_("darkLatexSpread", GameRules.Category.UPDATES, 
/* 14 */       GameRules.BooleanValue.m_46250_(true));
/* 15 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXESLEAVEBLOCK = GameRules.m_46189_("darkLatexesLeaveBlock", GameRules.Category.MOBS, 
/* 16 */       GameRules.BooleanValue.m_46250_(true));
/* 17 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXTRANSFUR = GameRules.m_46189_("darkLatexTransfur", GameRules.Category.MOBS, 
/* 18 */       GameRules.BooleanValue.m_46250_(true));
/* 19 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXCRYSTALSPAWN = GameRules.m_46189_("darkLatexCrystalSpawn", GameRules.Category.SPAWNING, 
/* 20 */       GameRules.BooleanValue.m_46250_(true));
/* 21 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXBREAKBLOCKS = GameRules.m_46189_("darkLatexBreakBlocks", GameRules.Category.MOBS, 
/* 22 */       GameRules.BooleanValue.m_46250_(true));
/* 23 */   public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSLUGGROWTIME = GameRules.m_46189_("darkLatexSlugGrowTime", GameRules.Category.MOBS, 
/* 24 */       GameRules.IntegerValue.m_46312_(325));
/* 25 */   public static final GameRules.Key<GameRules.BooleanValue> DOEVILSRAID = GameRules.m_46189_("doEvilsRaid", GameRules.Category.SPAWNING, 
/* 26 */       GameRules.BooleanValue.m_46250_(true));
/* 27 */   public static final GameRules.Key<GameRules.BooleanValue> DOSLUGSPAWN = GameRules.m_46189_("doSlugSpawn", GameRules.Category.SPAWNING, 
/* 28 */       GameRules.BooleanValue.m_46250_(true));
/* 29 */   public static final GameRules.Key<GameRules.IntegerValue> DARKLATEXSPREADSPEED = GameRules.m_46189_("darklatexspreadspeed", GameRules.Category.UPDATES, 
/* 30 */       GameRules.IntegerValue.m_46312_(50));
/* 31 */   public static final GameRules.Key<GameRules.IntegerValue> BEACONDROPMULTIPLIER = GameRules.m_46189_("beaconDropMultiplier", GameRules.Category.UPDATES, 
/* 32 */       GameRules.IntegerValue.m_46312_(10));
/* 33 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSUNLIGHTONLY = GameRules.m_46189_("darklatexsunlightonly", GameRules.Category.UPDATES, 
/* 34 */       GameRules.BooleanValue.m_46250_(false));
/* 35 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXSTONESPREAD = GameRules.m_46189_("darkLatexStoneSpread", GameRules.Category.UPDATES, 
/* 36 */       GameRules.BooleanValue.m_46250_(false));
/* 37 */   public static final GameRules.Key<GameRules.BooleanValue> DARKLATEXFLUIDS = GameRules.m_46189_("darklatexfluids", GameRules.Category.UPDATES, 
/* 38 */       GameRules.BooleanValue.m_46250_(false));
/* 39 */   public static final GameRules.Key<GameRules.BooleanValue> CURSEOFBINDINGMASK = GameRules.m_46189_("curseofbindingmask", GameRules.Category.PLAYER, 
/* 40 */       GameRules.BooleanValue.m_46250_(true));
/* 41 */   public static final GameRules.Key<GameRules.BooleanValue> CANCOBBLESTONEBEINFESTED = GameRules.m_46189_("cancobblestonebeinfested", GameRules.Category.UPDATES, 
/* 42 */       GameRules.BooleanValue.m_46250_(true));
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModGameRules.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */