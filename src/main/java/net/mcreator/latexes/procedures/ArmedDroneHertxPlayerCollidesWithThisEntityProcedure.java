package net.mcreator.latexes.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/ArmedDroneHertxPlayerCollidesWithThisEntityProcedure.class */
public class ArmedDroneHertxPlayerCollidesWithThisEntityProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.01d && (entity instanceof LivingEntity)) {
            ((LivingEntity) entity).hurt(new DamageSource("%1$s was killed by a Military Drone Hertx's rifle buttstock.").bypassArmor(), 3.0f);
        }
    }
}
