package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.SlimelingtamedsitEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimelingTamedRightClickedOnEntityProcedure.class */
public class SlimelingTamedRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        float f;
        float f2;
        float f3;
        if (entity != null && sourceentity != null) {
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARKLATEXGOO.get()) {
                if (entity instanceof TamableAnimal ? ((TamableAnimal) entity).isTame() : false) {
                    float health = entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f;
                    if (entity instanceof LivingEntity) {
                        f3 = ((LivingEntity) entity).getMaxHealth();
                    } else {
                        f3 = -1.0f;
                    }
                    if (health < f3) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1, false, false));
                        }
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        if (entity instanceof Player) {
                            Player _player = (Player) entity;
                            ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get());
                            _player.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove.getItem() == p.getItem();
                            }, 1, _player.inventoryMenu.getCraftSlots());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.LATEX_SOUP.get()) {
                if (entity instanceof TamableAnimal ? ((TamableAnimal) entity).isTame() : false) {
                    float health2 = entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f;
                    if (entity instanceof LivingEntity) {
                        f2 = ((LivingEntity) entity).getMaxHealth();
                    } else {
                        f2 = -1.0f;
                    }
                    if (health2 < f2) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 2, false, false));
                        }
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        if (entity instanceof Player) {
                            Player _player2 = (Player) entity;
                            ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.LATEX_SOUP.get());
                            _player2.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove2.getItem() == p.getItem();
                            }, 1, _player2.inventoryMenu.getCraftSlots());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SLIME_BALL) {
                if (entity instanceof TamableAnimal ? ((TamableAnimal) entity).isTame() : false) {
                    float health3 = entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f;
                    if (entity instanceof LivingEntity) {
                        f = ((LivingEntity) entity).getMaxHealth();
                    } else {
                        f = -1.0f;
                    }
                    if (health3 < f) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 120, 1, false, false));
                        }
                        if (world instanceof ServerLevel) {
                            ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        if (entity instanceof Player) {
                            Player _player3 = (Player) entity;
                            ItemStack _stktoremove3 = new ItemStack(Items.SLIME_BALL);
                            _player3.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove3.getItem() == p.getItem();
                            }, 1, _player3.inventoryMenu.getCraftSlots());
                        }
                    }
                }
            } else if (entity instanceof TamableAnimal) {
                TamableAnimal _tamIsTamedBy = (TamableAnimal) entity;
                if ((sourceentity instanceof LivingEntity) && _tamIsTamedBy.isOwnedBy((LivingEntity) sourceentity)) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level = (ServerLevel) world;
                        Entity entityToSpawn = new SlimelingtamedsitEntity((EntityType<SlimelingtamedsitEntity>) ((EntityType) LatexModEntities.SLIMELINGTAMEDSIT.get()), (Level) _level);
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
