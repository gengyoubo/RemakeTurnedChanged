//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

public class LatexModTabs {
    public static CreativeModeTab TAB_LATEX;
    public static CreativeModeTab TAB_LATEXITEMS;
    public static CreativeModeTab TAB_LATEXENTITIES;

    public LatexModTabs() {
    }

    public static void load() {
        TAB_LATEX = new CreativeModeTab("tablatex") {
            public @NotNull ItemStack makeIcon() {
                return new ItemStack((ItemLike)LatexModBlocks.BLACKLABBLOCK_1A.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
        TAB_LATEXITEMS = new CreativeModeTab("tablatexitems") {
            public @NotNull ItemStack makeIcon() {
                return new ItemStack((ItemLike)LatexModItems.DL_AXE.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
        TAB_LATEXENTITIES = new CreativeModeTab("tablatexentities") {
            public @NotNull ItemStack makeIcon() {
                return new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
