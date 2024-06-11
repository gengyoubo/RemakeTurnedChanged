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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure.class */
public class DT11ShotgunRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new AnonymousClass1().getArrow(projectileLevel, entity, 4.0f, 1);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            Level projectileLevel2 = entity.level;
            if (!projectileLevel2.isClientSide()) {
                Projectile _entityToSpawn2 = new AnonymousClass2().getArrow(projectileLevel2, entity, 4.0f, 1);
                _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel2.addFreshEntity(_entityToSpawn2);
            }
            Level projectileLevel3 = entity.level;
            if (!projectileLevel3.isClientSide()) {
                Projectile _entityToSpawn3 = new AnonymousClass3().getArrow(projectileLevel3, entity, 4.0f, 1);
                _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel3.addFreshEntity(_entityToSpawn3);
            }
            Level projectileLevel4 = entity.level;
            if (!projectileLevel4.isClientSide()) {
                Projectile _entityToSpawn4 = new AnonymousClass4().getArrow(projectileLevel4, entity, 4.0f, 1);
                _entityToSpawn4.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn4.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel4.addFreshEntity(_entityToSpawn4);
            }
            Level projectileLevel5 = entity.level;
            if (!projectileLevel5.isClientSide()) {
                Projectile _entityToSpawn5 = new AnonymousClass5().getArrow(projectileLevel5, entity, 4.0f, 1);
                _entityToSpawn5.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn5.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel5.addFreshEntity(_entityToSpawn5);
            }
            Level projectileLevel6 = entity.level;
            if (!projectileLevel6.isClientSide()) {
                Projectile _entityToSpawn6 = new AnonymousClass6().getArrow(projectileLevel6, entity, 4.0f, 1);
                _entityToSpawn6.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn6.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel6.addFreshEntity(_entityToSpawn6);
            }
            Level projectileLevel7 = entity.level;
            if (!projectileLevel7.isClientSide()) {
                Projectile _entityToSpawn7 = new AnonymousClass7().getArrow(projectileLevel7, entity, 4.0f, 1);
                _entityToSpawn7.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn7.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel7.addFreshEntity(_entityToSpawn7);
            }
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 18);
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$1.class */
    class AnonymousClass1 {
        AnonymousClass1() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$2.class */
    class AnonymousClass2 {
        AnonymousClass2() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$3.class */
    class AnonymousClass3 {
        AnonymousClass3() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$4.class */
    class AnonymousClass4 {
        AnonymousClass4() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$5.class */
    class AnonymousClass5 {
        AnonymousClass5() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$6.class */
    class AnonymousClass6 {
        AnonymousClass6() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DT11ShotgunRangedItemUsedProcedure$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DT11ShotgunRangedItemUsedProcedure$7.class */
    class AnonymousClass7 {
        AnonymousClass7() {
        }

        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
            AbstractArrow entityToSpawn = new CrystalbowEntity((EntityType) LatexModEntities.CRYSTALBOW.get(), level);
            entityToSpawn.setOwner(shooter);
            entityToSpawn.setBaseDamage((double) damage);
            entityToSpawn.setKnockback(knockback);
            entityToSpawn.setSilent(true);
            return entityToSpawn;
        }
    }
}
