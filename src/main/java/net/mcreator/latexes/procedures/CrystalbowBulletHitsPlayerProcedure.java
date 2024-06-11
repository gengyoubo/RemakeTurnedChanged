package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CrystalbowBulletHitsPlayerProcedure.class */
public class CrystalbowBulletHitsPlayerProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.7d && (entity instanceof LivingEntity)) {
            ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 60, 1, false, false));
        }
    }
}
