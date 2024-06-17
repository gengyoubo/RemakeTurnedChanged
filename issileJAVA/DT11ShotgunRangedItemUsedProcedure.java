//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.CrystalbowEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DT11ShotgunRangedItemUsedProcedure {
    public DT11ShotgunRangedItemUsedProcedure() {
    }

    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            Entity _shootFrom = entity;
            Level projectileLevel = _shootFrom.level;
            Projectile _entityToSpawn;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            _shootFrom = entity;
            projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                _entityToSpawn = ((<undefinedtype>)(new Object() {
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType)LatexModEntities.CRYSTALBOW.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage((double)damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                })).getArrow(projectileLevel, entity, 4.0F, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0F, 0.0F);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }

            if (entity instanceof Player) {
                Player _player = (Player)entity;
                _player.getCooldowns().addCooldown(itemstack.getItem(), 18);
            }

        }
    }
}
