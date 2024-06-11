package net.mcreator.latexes.procedures;

import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/RevolvingGooCannonCanUseRangedItemProcedure.class */
public class RevolvingGooCannonCanUseRangedItemProcedure {
    public static boolean execute(ItemStack itemstack) {
        return itemstack.getOrCreateTag().getDouble("ammo") > 0.0d;
    }
}
