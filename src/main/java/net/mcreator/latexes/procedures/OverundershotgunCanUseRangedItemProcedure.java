package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/OverundershotgunCanUseRangedItemProcedure.class */
public class OverundershotgunCanUseRangedItemProcedure {
    public static boolean execute(Entity entity, ItemStack itemstack) {
        if (entity != null && itemstack.getOrCreateTag().getDouble("ammo") > 0.0d) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.OVERUNDERSHOTGUN.get()) {
                return true;
            }
        }
        return false;
    }
}
