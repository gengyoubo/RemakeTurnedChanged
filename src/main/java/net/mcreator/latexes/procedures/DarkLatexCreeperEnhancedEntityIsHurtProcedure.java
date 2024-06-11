package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.ExplosivegooEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperEnhancedEntityIsHurtProcedure.class */
public class DarkLatexCreeperEnhancedEntityIsHurtProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.01d) {
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new AnonymousClass1().getArrow(projectileLevel, 2.0f, 2, (byte) 4);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 8.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperEnhancedEntityIsHurtProcedure$1.class */
    class AnonymousClass1 {
        AnonymousClass1() {
        }

        public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
            AbstractArrow entityToSpawn = new ExplosivegooEntity((EntityType) LatexModEntities.EXPLOSIVEGOO.get(), level);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            entityToSpawn.setPierceLevel(piercing);
            return entityToSpawn;
        }
    }
}
