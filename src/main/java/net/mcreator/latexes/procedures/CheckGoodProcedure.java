package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CheckGoodProcedure.class */
public class CheckGoodProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null) {
            return false;
        }
        if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:goodfaction")))) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.GOOD_BERET_HELMET.get()) {
                return false;
            }
        }
        return true;
    }
}
