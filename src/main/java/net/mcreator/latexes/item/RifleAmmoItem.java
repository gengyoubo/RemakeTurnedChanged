package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RifleAmmoItem.class */
public class RifleAmmoItem extends Item {
    public RifleAmmoItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(30).rarity(Rarity.COMMON));
    }

    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack itemstack) {
        return UseAnim.EAT;
    }
}
