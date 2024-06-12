package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HertxengineerHelmetTickEventProcedure.class */
public class HertxengineerHelmetTickEventProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HERTXENGINEER_HELMET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HERTXENGINEER_LEGGINGS.get()) {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 5, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 5, 1, false, false));
                        return;
                    }
                    return;
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 5, 1, false, false));
            }
        }
    }
}
