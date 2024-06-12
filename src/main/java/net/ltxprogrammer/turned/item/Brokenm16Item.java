package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/Brokenm16Item.class */
public class Brokenm16Item extends Item {
    public Brokenm16Item() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("hmm... maybe it's not junk yet..."));
    }
}
