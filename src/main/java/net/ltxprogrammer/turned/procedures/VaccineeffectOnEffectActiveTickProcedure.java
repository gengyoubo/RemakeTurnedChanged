package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/VaccineeffectOnEffectActiveTickProcedure.class */
public class VaccineeffectOnEffectActiveTickProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes"))) && (entity instanceof LivingEntity)) {
                entity.hurt(new DamageSource("%1$s was cleansed from the dark latex parassite.").bypassArmor(), 1.0f);
            }
            if ((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect(LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect(LatexModMobEffects.DARKLATEXDARTEFFECT.get());
            }
        }
    }
}
