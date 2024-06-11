package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModSounds;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/LatextuneItem.class */
public class LatextuneItem extends RecordItem {
    public LatextuneItem() {
        super(0, LatexModSounds.REGISTRY.get(new ResourceLocation("latex:latex_tune")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
    }
}
