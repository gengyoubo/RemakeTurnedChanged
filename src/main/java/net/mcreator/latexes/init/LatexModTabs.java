package net.mcreator.latexes.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModTabs.class */
public class LatexModTabs {
    public static CreativeModeTab TAB_LATEX;
    public static CreativeModeTab TAB_LATEXITEMS;
    public static CreativeModeTab TAB_LATEXENTITIES;

    /* renamed from: net.mcreator.latexes.init.LatexModTabs$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModTabs$1.class */
    class AnonymousClass1 extends CreativeModeTab {
        AnonymousClass1(String arg0) {
            super(arg0);
        }

        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) LatexModBlocks.BLACKLABBLOCK_1A.get());
        }

        @OnlyIn(Dist.CLIENT)
        public boolean hasSearchBar() {
            return false;
        }
    }

    public static void load() {
        TAB_LATEX = new AnonymousClass1("tablatex");
        TAB_LATEXITEMS = new AnonymousClass2("tablatexitems");
        TAB_LATEXENTITIES = new AnonymousClass3("tablatexentities");
    }

    /* renamed from: net.mcreator.latexes.init.LatexModTabs$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModTabs$2.class */
    class AnonymousClass2 extends CreativeModeTab {
        AnonymousClass2(String arg0) {
            super(arg0);
        }

        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) LatexModItems.DL_AXE.get());
        }

        @OnlyIn(Dist.CLIENT)
        public boolean hasSearchBar() {
            return false;
        }
    }

    /* renamed from: net.mcreator.latexes.init.LatexModTabs$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModTabs$3.class */
    class AnonymousClass3 extends CreativeModeTab {
        AnonymousClass3(String arg0) {
            super(arg0);
        }

        public ItemStack makeIcon() {
            return new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get());
        }

        @OnlyIn(Dist.CLIENT)
        public boolean hasSearchBar() {
            return false;
        }
    }
}
