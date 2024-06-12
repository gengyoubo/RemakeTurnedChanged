package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ExplosivegooProjectileHitsPlayerProcedure.class */
public class ExplosivegooProjectileHitsPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    _level.explode((Entity) null, x, y, z, 1.0f, Explosion.BlockInteraction.NONE);
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 120, 1));
            }
        }
    }
}
