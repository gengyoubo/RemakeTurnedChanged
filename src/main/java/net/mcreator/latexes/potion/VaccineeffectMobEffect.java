package net.mcreator.latexes.potion;

import net.mcreator.latexes.procedures.VaccineeffectOnEffectActiveTickProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/potion/VaccineeffectMobEffect.class */
public class VaccineeffectMobEffect extends MobEffect {
    public VaccineeffectMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -11211680);
    }

    public @NotNull String getDescriptionId() {
        return "effect.latex.vaccineeffect";
    }

    public boolean isInstantenous() {
        return true;
    }

    public void applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        VaccineeffectOnEffectActiveTickProcedure.execute(entity);
    }

    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
