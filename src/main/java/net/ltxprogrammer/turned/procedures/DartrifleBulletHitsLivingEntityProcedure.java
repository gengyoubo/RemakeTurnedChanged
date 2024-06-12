package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DartrifleBulletHitsLivingEntityProcedure.class */
public class DartrifleBulletHitsLivingEntityProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (!(entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:robots"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 82, 1, false, false));
            }
        }
    }
}
