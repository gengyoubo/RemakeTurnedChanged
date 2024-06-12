package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexeaterslimeEntityWalksOnTheBlockProcedure.class */
public class LatexeaterslimeEntityWalksOnTheBlockProcedure {
    public static void execute(Entity entity) {
        if (entity != null && entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) {
            entity.hurt(DamageSource.GENERIC, 4.0f);
            entity.hurt(DamageSource.MAGIC, 8.0f);
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1, false, false));
            }
        }
    }
}
