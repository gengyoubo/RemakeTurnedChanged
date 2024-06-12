package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.ArmedDroneHertxEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ArmedDroneHertxWaitRightClickedOnEntityProcedure.class */
public class ArmedDroneHertxWaitRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        float f;
        if (entity != null && sourceentity != null) {
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
                if ((entity instanceof TamableAnimal) && ((TamableAnimal) entity).isTame()) {
                    float health = entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f;
                    if (entity instanceof LivingEntity) {
                        f = ((LivingEntity) entity).getMaxHealth();
                    } else {
                        f = -1.0f;
                    }
                    if (health < f) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false));
                        }
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        if (entity instanceof Player) {
                            Player _player = (Player) entity;
                            ItemStack _stktoremove = new ItemStack(Items.IRON_INGOT);
                            _player.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove.getItem() == p.getItem();
                            }, 1, _player.inventoryMenu.getCraftSlots());
                        }
                    }
                }
            } else if (entity instanceof TamableAnimal) {
                TamableAnimal _tamIsTamedBy = (TamableAnimal) entity;
                if ((sourceentity instanceof LivingEntity) && _tamIsTamedBy.isOwnedBy((LivingEntity) sourceentity)) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        Entity entityToSpawn = new ArmedDroneHertxEntity((EntityType<ArmedDroneHertxEntity>) ((EntityType) LatexModEntities.ARMED_DRONE_HERTX.get()), (Level) _level);
                        entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn.setYBodyRot(entity.getYRot());
                        entityToSpawn.setYHeadRot(entity.getYRot());
                        if (entityToSpawn instanceof Mob) {
                            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
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
