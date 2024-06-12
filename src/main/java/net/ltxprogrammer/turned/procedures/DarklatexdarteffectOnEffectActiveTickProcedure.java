package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexdarteffectOnEffectActiveTickProcedure.class */
public class DarklatexdarteffectOnEffectActiveTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        float f;
        if (entity != null && sourceentity != null) {
            entity.hurt(DamageSource.WITHER, 1.0f);
            if (entity instanceof Player) {
                ((Player) entity).causeFoodExhaustion(0.1f);
            }
            entity.setAirSupply(entity.getAirSupply() - 1);
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 1, false, false));
            }
            if (entity instanceof LivingEntity) {
                f = ((LivingEntity) entity).getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= (entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f) / 10.0f && (entity instanceof LivingEntity) && ((LivingEntity) entity).hasEffect((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && !(entity instanceof Player) && world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                DarklatexThisEntityKillsAnotherOneProcedure.execute(world, x, y, z, entity, sourceentity);
            }
        }
    }
}
