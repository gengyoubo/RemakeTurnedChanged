//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.potion;

import net.mcreator.latexes.procedures.DarklatexdarteffectPotionExpiresProcedure;
import net.mcreator.latexes.procedures.DarklatexdarteffectPotionStartedappliedProcedure;
import net.mcreator.latexes.procedures.DarklatexdarteffectonActiveTickConditionProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

public class DarklatexdarteffectMobEffect extends MobEffect {
    public DarklatexdarteffectMobEffect() {
        super(MobEffectCategory.HARMFUL, -14803426);
    }

    public String getDescriptionId() {
        return "effect.latex.darklatexdarteffect";
    }

    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        DarklatexdarteffectPotionStartedappliedProcedure.execute(entity);
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        DarklatexdarteffectonActiveTickConditionProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        DarklatexdarteffectPotionExpiresProcedure.execute(entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
