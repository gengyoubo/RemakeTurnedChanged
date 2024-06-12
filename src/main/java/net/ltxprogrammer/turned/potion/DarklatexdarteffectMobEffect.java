package net.ltxprogrammer.turned.potion;

import net.ltxprogrammer.turned.procedures.DarklatexdarteffectPotionExpiresProcedure;
import net.ltxprogrammer.turned.procedures.DarklatexdarteffectPotionStartedappliedProcedure;
import net.ltxprogrammer.turned.procedures.DarklatexdarteffectonActiveTickConditionProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/potion/DarklatexdarteffectMobEffect.class */
public class DarklatexdarteffectMobEffect extends MobEffect {
    public DarklatexdarteffectMobEffect() {
        super(MobEffectCategory.HARMFUL, -14803426);
    }

    public @NotNull String getDescriptionId() {
        return "effect.turned.darklatexdarteffect";
    }

    public void addAttributeModifiers(@NotNull LivingEntity entity, @NotNull AttributeMap attributeMap, int amplifier) {
        DarklatexdarteffectPotionStartedappliedProcedure.execute(entity);
    }

    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        DarklatexdarteffectonActiveTickConditionProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    public void removeAttributeModifiers(@NotNull LivingEntity entity, @NotNull AttributeMap attributeMap, int amplifier) {
        removeAttributeModifiers(entity, attributeMap, amplifier);
        DarklatexdarteffectPotionExpiresProcedure.execute(entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
