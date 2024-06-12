package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCakeEntityIsHurtProcedure.class */
public class DarkLatexCakeEntityIsHurtProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() != ItemStack.EMPTY.getItem()) {
                return;
            }
            if (Math.random() < 0.8d) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) + 1.0f);
                }
            } else if (Math.random() < 0.05d && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 50, 1, false, false));
            }
        }
    }
}
