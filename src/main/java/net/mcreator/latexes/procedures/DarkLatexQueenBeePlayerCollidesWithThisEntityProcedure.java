package net.mcreator.latexes.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.class */
public class DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof LivingEntity)) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.POISON, 80, 1, false, false));
        }
    }
}
