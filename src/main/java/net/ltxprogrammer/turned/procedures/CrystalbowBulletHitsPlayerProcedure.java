package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/CrystalbowBulletHitsPlayerProcedure.class */
public class CrystalbowBulletHitsPlayerProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.7d && (entity instanceof LivingEntity)) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 60, 1, false, false));
        }
    }
}
