package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TargethasabatonProcedure.class */
public class TargethasabatonProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null) {
            return false;
        }
        if (!((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.BATON.get())) {
            return true;
        }
        return false;
    }
}
