package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/MatchLockMusketRangedItemUsedProcedure.class */
public class MatchLockMusketRangedItemUsedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 45);
            }
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 12, 0.5d, 0.5d, 0.5d, 0.25d);
            }
            if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0d) {
                itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0d);
            }
        }
    }
}
