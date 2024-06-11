package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModFluids;
import net.mcreator.latexes.init.LatexModTabs;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DarkLatexGooFluidItem.class */
public class DarkLatexGooFluidItem extends BucketItem {
    public DarkLatexGooFluidItem() {
        super(LatexModFluids.DARK_LATEX_GOO_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(LatexModTabs.TAB_LATEX));
    }
}
