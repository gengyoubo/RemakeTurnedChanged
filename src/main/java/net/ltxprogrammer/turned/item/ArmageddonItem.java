package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/ArmageddonItem.class */
public class ArmageddonItem extends RecordItem {
    public ArmageddonItem() {
        super(0, LatexModSounds.REGISTRY.get(new ResourceLocation("turned:armageddon")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
    }
}
