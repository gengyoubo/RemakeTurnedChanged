package net.ltxprogrammer.turned.potion;

import net.ltxprogrammer.turned.procedures.VaccineeffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/potion/VaccineeffectMobEffect.class */
public class VaccineeffectMobEffect extends MobEffect {
    public VaccineeffectMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -11211680);
    }

    public String getDescriptionId() {
        return "effect.turned.vaccineeffect";
    }

    public boolean isInstantenous() {
        return true;
    }

    public void applyEffectTick(LivingEntity entity, int amplifier) {
        VaccineeffectOnEffectActiveTickProcedure.execute(entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
