//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModMobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;

public class DarklatexdarteffectonActiveTickConditionProcedure {
    public DarklatexdarteffectonActiveTickConditionProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            entity.hurt(DamageSource.WITHER, 1.0F);
            if (entity instanceof Player) {
                Player _player = (Player)entity;
                _player.causeFoodExhaustion(0.1F);
            }

            entity.setAirSupply(entity.getAirSupply() - 1);
            LivingEntity _livEnt;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                _livEnt.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false));
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                _livEnt.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false));
            }

            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                _livEnt.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 1, false, false));
            }

            float var10000;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getHealth();
            } else {
                var10000 = -1.0F;
            }

            float var10001;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                var10001 = _livEnt.getMaxHealth();
            } else {
                var10001 = -1.0F;
            }

            if (var10000 <= var10001 / 10.0F && entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                if (_livEnt.hasEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && !(entity instanceof Player) && world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                    DleffecttransfurProcedure.execute(world, x, y, z, entity);
                }
            }

        }
    }
}
