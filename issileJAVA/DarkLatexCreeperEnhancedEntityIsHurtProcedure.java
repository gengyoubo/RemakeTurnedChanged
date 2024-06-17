//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.ExplosivegooEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;

public class DarkLatexCreeperEnhancedEntityIsHurtProcedure {
    public DarkLatexCreeperEnhancedEntityIsHurtProcedure() {
    }

    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.01) {
                Entity _shootFrom = entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = ((<undefinedtype>)(new Object() {
                        public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new ExplosivegooEntity((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), level);
                            entityToSpawn.setBaseDamage((double)damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    })).getArrow(projectileLevel, 2.0F, 2, (byte)4);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 8.0F);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
            }

        }
    }
}
