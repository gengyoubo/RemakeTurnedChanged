package net.mcreator.latexes.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCakePlayerCollidesWithThisEntityProcedure.class */
public class DarkLatexCakePlayerCollidesWithThisEntityProcedure {
    public static void execute(Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null && Math.random() < 0.4d) {
            if (sourceentity instanceof LivingEntity) {
                ((LivingEntity) sourceentity).hurt(new DamageSource("%1$s was absorbed by Dark Latex Cake Monster").bypassArmor(), 2.0f);
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).setHealth((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) + 2.0f);
            }
        }
    }
}
