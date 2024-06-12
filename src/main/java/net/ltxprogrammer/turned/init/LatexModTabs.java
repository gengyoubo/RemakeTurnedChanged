package net.ltxprogrammer.turned.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModTabs.class */
public class LatexModTabs {
    public static CreativeModeTab TAB_LATEX;
    public static CreativeModeTab TAB_LATEXITEMS;
    public static CreativeModeTab TAB_LATEXENTITIES;

    public static void load() {
        TAB_LATEX = new CreativeModeTab("tablatex") { // from class: net.ltxprogrammer.turned.init.LatexModTabs.1
            public ItemStack makeIcon() {
                return new ItemStack((ItemLike) LatexModBlocks.BLACKLABBLOCK_1A.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
        TAB_LATEXITEMS = new CreativeModeTab("tablatexitems") { // from class: net.ltxprogrammer.turned.init.LatexModTabs.2
            public ItemStack makeIcon() {
                return new ItemStack((ItemLike) LatexModItems.DL_AXE.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
        TAB_LATEXENTITIES = new CreativeModeTab("tablatexentities") { // from class: net.ltxprogrammer.turned.init.LatexModTabs.3
            public ItemStack makeIcon() {
                return new ItemStack((ItemLike) LatexModItems.BROKENDLMASK.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
