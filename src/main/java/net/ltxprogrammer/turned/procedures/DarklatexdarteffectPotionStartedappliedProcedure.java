package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexdarteffectPotionStartedappliedProcedure.class */
public class DarklatexdarteffectPotionStartedappliedProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:robots"))) && !entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) {
                entity.hurt(DamageSource.WITHER, 4.0f);
                if (entity instanceof Player) {
                    ((Player) entity).causeFoodExhaustion(0.25f);
                }
            } else if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).removeEffect(LatexModMobEffects.DARKLATEXDARTEFFECT.get());
            }
        }
    }
}
