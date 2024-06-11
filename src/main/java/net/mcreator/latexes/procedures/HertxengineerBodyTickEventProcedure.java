package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HertxengineerBodyTickEventProcedure.class */
public class HertxengineerBodyTickEventProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HERTXENGINEER_CHESTPLATE.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HERTXENGINEER_LEGGINGS.get()) {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 5, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 50, 1, false, false));
                    }
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 5, 1, false, false));
                        return;
                    }
                    return;
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 5, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 5, 1, false, false));
            }
        }
    }
}
