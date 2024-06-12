package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexdarteffectPotionExpiresProcedure.class */
public class DarklatexdarteffectPotionExpiresProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).removeEffect((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get());
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).removeEffect(MobEffects.DIG_SLOWDOWN);
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).removeEffect(MobEffects.WEAKNESS);
            }
        }
    }
}
