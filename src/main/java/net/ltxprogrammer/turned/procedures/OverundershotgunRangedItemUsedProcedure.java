package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.OverundershotgunEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/OverundershotgunRangedItemUsedProcedure.class */
public class OverundershotgunRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, entity, 3.0f, 2);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            Level projectileLevel2 = entity.level;
            if (!projectileLevel2.isClientSide()) {
                Projectile _entityToSpawn2 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.2
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel2, entity, 3.0f, 2);
                _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel2.addFreshEntity(_entityToSpawn2);
            }
            Level projectileLevel3 = entity.level;
            if (!projectileLevel3.isClientSide()) {
                Projectile _entityToSpawn3 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.3
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel3, entity, 3.0f, 2);
                _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel3.addFreshEntity(_entityToSpawn3);
            }
            Level projectileLevel4 = entity.level;
            if (!projectileLevel4.isClientSide()) {
                Projectile _entityToSpawn4 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.4
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel4, entity, 3.0f, 2);
                _entityToSpawn4.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn4.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel4.addFreshEntity(_entityToSpawn4);
            }
            Level projectileLevel5 = entity.level;
            if (!projectileLevel5.isClientSide()) {
                Projectile _entityToSpawn5 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.5
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel5, entity, 3.0f, 2);
                _entityToSpawn5.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn5.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel5.addFreshEntity(_entityToSpawn5);
            }
            Level projectileLevel6 = entity.level;
            if (!projectileLevel6.isClientSide()) {
                Projectile _entityToSpawn6 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.6
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel6, entity, 3.0f, 2);
                _entityToSpawn6.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn6.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel6.addFreshEntity(_entityToSpawn6);
            }
            Level projectileLevel7 = entity.level;
            if (!projectileLevel7.isClientSide()) {
                Projectile _entityToSpawn7 = new Object() { // from class: net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure.7
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new OverundershotgunEntity(LatexModEntities.OVERUNDERSHOTGUN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel7, entity, 3.0f, 2);
                _entityToSpawn7.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn7.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 2.0f);
                projectileLevel7.addFreshEntity(_entityToSpawn7);
            }
            if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0d) {
                itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0d);
            }
        }
    }
}
