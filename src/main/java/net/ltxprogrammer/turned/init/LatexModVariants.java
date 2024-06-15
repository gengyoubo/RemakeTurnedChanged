//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.changed.entity.LatexEntity;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.entity.beast.DarkLatexEntity;
import net.ltxprogrammer.changed.entity.variant.LatexVariant;
import net.ltxprogrammer.changed.entity.variant.LatexVariant.Builder;
import net.ltxprogrammer.changed.item.DarkLatexMask;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexCakeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.DarklatexconeEntity;
import net.ltxprogrammer.turned.entity.DlSquidDogEntity;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Spider;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class LatexModVariants {
    public static final LatexVariant<DarklatexEntity> DARK_LATEX;
    public static final LatexVariant<DarkLatexCentaurEntity> DARK_LATEX_CENTAUR;
    public static final LatexVariant<DlsharkEntity> DARK_LATEX_SHARK;
    //public static final LatexVariant<DlSquidDogEntity> DARK_LATEX_SQUID_DOG;
    public static final LatexVariant<DarkLatexSnepEntity> DARK_LATEX_SNOW_LEOPARD;
    //public static final LatexVariant<DarkLatexFoxEntity> DARK_LATEX_FOX;
    public static final LatexVariant<DarkLatexSkeletonEntity> DARK_LATEX_SKELETON;
    public static final LatexVariant<DarkLatexSpiderEntity> DARK_LATEX_SPIDER;
    public static final LatexVariant<DLbeeEntity> DARK_LATEX_BEE;
    public static final LatexVariant<DarklatexconeEntity> DARK_LATEX_CONE;
    public static final LatexVariant<DarkLatexSnakeEntity> DARK_LATEX_SNAKE;
    public static final LatexVariant<DarkLatexMothEntity> DARK_LATEX_MOTH;
    public static final LatexVariant<DarkLatexCakeEntity> DARK_LATEX_CAKE;

    public LatexModVariants() {
    }

    private static <T extends LatexEntity & DarkLatexEntity> LatexVariant<T> register(LatexVariant<T> variant) {
        DarkLatexMask.MASKED_LATEXES.add(variant.getFormId());
        return LatexVariant.register(variant);
    }

    static {
        DARK_LATEX = register(Builder.of(LatexVariant.DARK_LATEX_WOLF.male(), LatexModEntities.DARKLATEX).build(LatexMod.modResource("form_darklatex")));
        DARK_LATEX_CENTAUR = register(Builder.of(LatexVariant.LIGHT_LATEX_CENTAUR, LatexModEntities.DARK_LATEX_CENTAUR).fusionOf(DARK_LATEX, AbstractHorse.class).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dark_latex_centaur")));
        DARK_LATEX_SHARK = register(Builder.of(LatexVariant.LATEX_SHARK, LatexModEntities.DLSHARK).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dlshark")));
        //DARK_LATEX_SQUID_DOG = register(Builder.of(LatexVariant.LATEX_SQUID_DOG, LatexModEntities.DL_SQUID_DOG).fusionOf(DARK_LATEX, Squid.class).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dl_squid_dog")));
        DARK_LATEX_SNOW_LEOPARD = register(Builder.of(LatexVariant.LATEX_SNOW_LEOPARD.male(), LatexModEntities.DARK_LATEX_SNEP).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dark_latex_snep")));
        //DARK_LATEX_FOX = register(Builder.of(LatexVariant.LATEX_SILVER_FOX, LatexModEntities.DARK_LATEX_FOX).fusionOf(DARK_LATEX, Fox.class).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dark_latex_fox")));
        DARK_LATEX_SKELETON = register(Builder.of(DARK_LATEX, LatexModEntities.DARK_LATEX_SKELETON).fusionOf(DARK_LATEX, Skeleton.class).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dark_latex_skeleton")));
        DARK_LATEX_SPIDER = register(Builder.of(LatexModEntities.DARK_LATEX_SPIDER).faction(LatexType.DARK_LATEX).fusionOf(DARK_LATEX, Spider.class).canClimb().build(LatexMod.modResource("form_dark_latex_spider")));
        DARK_LATEX_BEE = register(Builder.of(LatexModEntities.D_LBEE).faction(LatexType.DARK_LATEX).extraJumps(3).fusionOf(DARK_LATEX, Bee.class).build(LatexMod.modResource("form_d_lbee")));
        DARK_LATEX_CONE = register(Builder.of(LatexVariant.LATEX_TRAFFIC_CONE_DRAGON, LatexModEntities.DARKLATEXCONE).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_darklatexcone")));
        DARK_LATEX_SNAKE = register(Builder.of(LatexVariant.LATEX_TRAFFIC_CONE_DRAGON, LatexModEntities.DARK_LATEX_SNAKE).faction(LatexType.DARK_LATEX).build(LatexMod.modResource("form_dark_latex_snake")));
        DARK_LATEX_MOTH = register(Builder.of(LatexModEntities.DARK_LATEX_MOTH).faction(LatexType.DARK_LATEX).extraJumps(3).build(LatexMod.modResource("form_dark_latex_moth")));
        DARK_LATEX_CAKE = register(Builder.of(DARK_LATEX, LatexModEntities.DARK_LATEX_CAKE).build(LatexMod.modResource("form_dark_latex_cake")));
    }
}
