package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.class */
public class DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure {
    public static void execute(Entity entity) {
        if ((entity instanceof LivingEntity)) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.POISON, 80, 1, false, false));
        }
    }
}
