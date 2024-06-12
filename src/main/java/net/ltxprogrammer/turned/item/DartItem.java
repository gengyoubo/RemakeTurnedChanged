package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/DartItem.class */
public class DartItem extends Item {
    public DartItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }
}
