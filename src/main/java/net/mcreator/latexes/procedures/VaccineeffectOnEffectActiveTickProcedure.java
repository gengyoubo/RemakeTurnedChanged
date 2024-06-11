package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModMobEffects;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/VaccineeffectOnEffectActiveTickProcedure.class */
public class VaccineeffectOnEffectActiveTickProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).hurt(new DamageSource("%1$s was cleansed from the dark latex parassite.").bypassArmor(), 1.0f);
            }
            if ((entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && (entity instanceof LivingEntity)) {
                ((LivingEntity) entity).removeEffect((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get());
            }
        }
    }
}
