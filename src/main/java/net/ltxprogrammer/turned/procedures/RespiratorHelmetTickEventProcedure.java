package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/RespiratorHelmetTickEventProcedure.class */
public class RespiratorHelmetTickEventProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect(MobEffects.CONFUSION)) || (((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect(MobEffects.POISON)) || (((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) || ((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect(MobEffects.WEAKNESS))))) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.CONFUSION);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.POISON);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(MobEffects.WEAKNESS);
                }
            }
        }
    }
}
