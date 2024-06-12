package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.ExplosivegooEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCreeperEnhancedEntityIsHurtProcedure.class */
public class DarkLatexCreeperEnhancedEntityIsHurtProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.01d) {
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure.1
                    public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
                        AbstractArrow entityToSpawn = new ExplosivegooEntity((EntityType) LatexModEntities.EXPLOSIVEGOO.get(), level);
                        entityToSpawn.setBaseDamage((double) damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setPierceLevel(piercing);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, 2.0f, 2, (byte) 4);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 8.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
        }
    }
}
