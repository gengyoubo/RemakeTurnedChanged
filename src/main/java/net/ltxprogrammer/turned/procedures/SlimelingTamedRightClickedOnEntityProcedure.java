package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.entity.SlimelingtamedsitEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SlimelingTamedRightClickedOnEntityProcedure.class */
public class SlimelingTamedRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        float f;
        float f2;
        float f3;
        if (entity != null && sourceentity != null) {
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == ChangedItems.DARK_LATEX_GOO.get()) {
                if ((entity instanceof TamableAnimal) && ((TamableAnimal) entity).isTame()) {
                    float health = ((LivingEntity) entity).getHealth();
                    f3 = ((LivingEntity) entity).getMaxHealth();
                    if (health < f3) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false));
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEX_SOUP.get()) {
                if ((entity instanceof TamableAnimal) && ((TamableAnimal) entity).isTame()) {
                    float health2 = ((LivingEntity) entity).getHealth();
                    f2 = ((LivingEntity) entity).getMaxHealth();
                    if (health2 < f2) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 2, false, false));
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SLIME_BALL) {
                if ((entity instanceof TamableAnimal) && ((TamableAnimal) entity).isTame()) {
                    float health3 = ((LivingEntity) entity).getHealth();
                    f = ((LivingEntity) entity).getMaxHealth();
                    if (health3 < f) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 1, false, false));
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                    }
                }
            } else if (entity instanceof TamableAnimal _tamIsTamedBy) {
                if ((sourceentity instanceof LivingEntity) && _tamIsTamedBy.isOwnedBy((LivingEntity) sourceentity)) {
                    if (world instanceof ServerLevel _level) {
                        Entity entityToSpawn = new SlimelingtamedsitEntity((EntityType<SlimelingtamedsitEntity>) LatexModEntities.SLIMELINGTAMEDSIT.get(), _level);
                        entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                }
            }
        }
    }
}
