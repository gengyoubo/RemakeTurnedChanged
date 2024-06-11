/*    */ package net.ltxprogrammer.turned.init;
/*    */ import java.util.function.Supplier;
/*    */ import net.ltxprogrammer.changed.entity.LatexType;
/*    */ import net.ltxprogrammer.changed.entity.variant.LatexVariant;
/*    */ import net.ltxprogrammer.turned.LatexMod;
/*    */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexconeEntity;
/*    */ import net.ltxprogrammer.turned.entity.DlsharkEntity;
/*    */ import net.minecraft.world.entity.animal.Bee;
/*    */ import net.minecraft.world.entity.animal.Fox;
/*    */ import net.minecraft.world.entity.animal.horse.AbstractHorse;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class LatexModVariants {
/* 21 */   public static final LatexVariant<DarklatexEntity> DARK_LATEX = register(LatexVariant.Builder.of(LatexVariant.DARK_LATEX_WOLF.male(), (Supplier)LatexModEntities.DARKLATEX)
/* 22 */       .build(LatexMod.modResource("form_darklatex")));
/* 23 */   public static final LatexVariant<DarkLatexCentaurEntity> DARK_LATEX_CENTAUR = register(LatexVariant.Builder.of(LatexVariant.LIGHT_LATEX_CENTAUR, (Supplier)LatexModEntities.DARK_LATEX_CENTAUR).fusionOf(DARK_LATEX, AbstractHorse.class).faction(LatexType.DARK_LATEX)
/* 24 */       .build(LatexMod.modResource("form_dark_latex_centaur")));
/* 25 */   public static final LatexVariant<DlsharkEntity> DARK_LATEX_SHARK = register(LatexVariant.Builder.of(LatexVariant.LATEX_SHARK, (Supplier)LatexModEntities.DLSHARK).faction(LatexType.DARK_LATEX)
/* 26 */       .build(LatexMod.modResource("form_dlshark")));
/* 27 */   public static final LatexVariant<DlSquidDogEntity> DARK_LATEX_SQUID_DOG = register(LatexVariant.Builder.of(LatexVariant.LATEX_SQUID_DOG, (Supplier)LatexModEntities.DL_SQUID_DOG).fusionOf(DARK_LATEX, Squid.class).faction(LatexType.DARK_LATEX)
/* 28 */       .build(LatexMod.modResource("form_dl_squid_dog")));
/* 29 */   public static final LatexVariant<DarkLatexSnepEntity> DARK_LATEX_SNOW_LEOPARD = register(LatexVariant.Builder.of(LatexVariant.LATEX_SNOW_LEOPARD.male(), (Supplier)LatexModEntities.DARK_LATEX_SNEP).faction(LatexType.DARK_LATEX)
/* 30 */       .build(LatexMod.modResource("form_dark_latex_snep")));
/* 31 */   public static final LatexVariant<DarkLatexFoxEntity> DARK_LATEX_FOX = register(LatexVariant.Builder.of(LatexVariant.LATEX_SILVER_FOX, (Supplier)LatexModEntities.DARK_LATEX_FOX).fusionOf(DARK_LATEX, Fox.class).faction(LatexType.DARK_LATEX)
/* 32 */       .build(LatexMod.modResource("form_dark_latex_fox")));
/* 33 */   public static final LatexVariant<DarkLatexSkeletonEntity> DARK_LATEX_SKELETON = register(LatexVariant.Builder.of(DARK_LATEX, (Supplier)LatexModEntities.DARK_LATEX_SKELETON).fusionOf(DARK_LATEX, Skeleton.class).faction(LatexType.DARK_LATEX)
/* 34 */       .build(LatexMod.modResource("form_dark_latex_skeleton")));
/* 35 */   public static final LatexVariant<DarkLatexSpiderEntity> DARK_LATEX_SPIDER = register(LatexVariant.Builder.of((Supplier)LatexModEntities.DARK_LATEX_SPIDER).faction(LatexType.DARK_LATEX).fusionOf(DARK_LATEX, Spider.class).canClimb()
/* 36 */       .build(LatexMod.modResource("form_dark_latex_spider")));
/* 37 */   public static final LatexVariant<DLbeeEntity> DARK_LATEX_BEE = register(LatexVariant.Builder.of((Supplier)LatexModEntities.D_LBEE).faction(LatexType.DARK_LATEX).extraJumps(3).fusionOf(DARK_LATEX, Bee.class)
/* 38 */       .build(LatexMod.modResource("form_d_lbee")));
/* 39 */   public static final LatexVariant<DarklatexconeEntity> DARK_LATEX_CONE = register(LatexVariant.Builder.of(LatexVariant.LATEX_TRAFFIC_CONE_DRAGON, (Supplier)LatexModEntities.DARKLATEXCONE).faction(LatexType.DARK_LATEX)
/* 40 */       .build(LatexMod.modResource("form_darklatexcone")));
/* 41 */   public static final LatexVariant<DarkLatexSnakeEntity> DARK_LATEX_SNAKE = register(LatexVariant.Builder.of(LatexVariant.LATEX_TRAFFIC_CONE_DRAGON, (Supplier)LatexModEntities.DARK_LATEX_SNAKE).faction(LatexType.DARK_LATEX)
/* 42 */       .build(LatexMod.modResource("form_dark_latex_snake")));
/* 43 */   public static final LatexVariant<DarkLatexMothEntity> DARK_LATEX_MOTH = register(LatexVariant.Builder.of((Supplier)LatexModEntities.DARK_LATEX_MOTH).faction(LatexType.DARK_LATEX).extraJumps(3)
/* 44 */       .build(LatexMod.modResource("form_dark_latex_moth")));
/* 45 */   public static final LatexVariant<DarkLatexCakeEntity> DARK_LATEX_CAKE = register(LatexVariant.Builder.of(DARK_LATEX, (Supplier)LatexModEntities.DARK_LATEX_CAKE)
/* 46 */       .build(LatexMod.modResource("form_dark_latex_cake")));
/*    */   
/*    */   private static <T extends net.ltxprogrammer.changed.entity.LatexEntity & net.ltxprogrammer.changed.entity.beast.DarkLatexEntity> LatexVariant<T> register(LatexVariant<T> variant) {
/* 49 */     DarkLatexMask.MASKED_LATEXES.add(variant.getFormId());
/* 50 */     return LatexVariant.register(variant);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModVariants.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */