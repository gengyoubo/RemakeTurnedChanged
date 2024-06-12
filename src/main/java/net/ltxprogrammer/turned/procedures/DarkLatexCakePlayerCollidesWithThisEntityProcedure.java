package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.variant.LatexVariant;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCakePlayerCollidesWithThisEntityProcedure.class */
public class DarkLatexCakePlayerCollidesWithThisEntityProcedure {
    public static void execute(Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null && Math.random() < 0.4d) {
            if (sourceentity instanceof LivingEntity) {
                sourceentity.hurt(new DamageSource("%1$s was absorbed by Dark Latex Cake Monster").bypassArmor(), 2.0f);
            }
            if (entity instanceof LivingEntity _entity) {
                if (LatexVariant.getEntityVariant(_entity) == null && LatexVariant.getEntityTransfur(_entity) == null) {
                    _entity.setHealth((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) + 2.0f);
                }
            }
        }
    }
}
