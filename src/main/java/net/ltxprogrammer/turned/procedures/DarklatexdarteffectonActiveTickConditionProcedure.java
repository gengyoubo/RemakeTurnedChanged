package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.turned.init.LatexModVariants;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexdarteffectonActiveTickConditionProcedure.class */
public class DarklatexdarteffectonActiveTickConditionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && (entity instanceof LivingEntity)) {
            LivingEntity livingEntity = (LivingEntity) entity;
            ProcessTransfur.progressTransfur(livingEntity, 1, LatexModVariants.DARK_LATEX.getFormId());
            if (entity instanceof Player) {
                ((Player) entity).causeFoodExhaustion(0.1f);
            }
            entity.setAirSupply(entity.getAirSupply() - 1);
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 1, false, false));
        }
    }
}
