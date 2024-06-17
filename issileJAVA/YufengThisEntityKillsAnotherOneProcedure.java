//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class YufengThisEntityKillsAnotherOneProcedure {
    public YufengThisEntityKillsAnotherOneProcedure() {
    }

    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = (LivingEntity)entity;
                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                boolean var22;
                label159: {
                    if (var10000.getItem() == LatexModItems.HAZMAT_HELMET.get()) {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor = (LivingEntity)entity;
                            var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor = (LivingEntity)entity;
                                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
                            } else {
                                var10000 = ItemStack.EMPTY;
                            }

                            if (var10000.getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entGetArmor = (LivingEntity)entity;
                                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
                                } else {
                                    var10000 = ItemStack.EMPTY;
                                }

                                if (var10000.getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                                    var22 = true;
                                    break label159;
                                }
                            }
                        }
                    }

                    var22 = false;
                }

                if (!var22) {
                    Level _level;
                    Mob _mobToSpawn;
                    ServerLevel _level;
                    if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:skeletons")))) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        if (Math.random() < 0.3) {
                            if (!sourceentity.level.isClientSide()) {
                                sourceentity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                }
                            }

                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (Math.random() < 0.02) {
                            if (!sourceentity.level.isClientSide()) {
                                sourceentity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                }
                            }

                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarkLatexDragonEntity((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                }
                            }

                            if (sourceentity instanceof LivingEntity) {
                                LivingEntity _entity = (LivingEntity)sourceentity;
                                float var10001;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = (LivingEntity)entity;
                                    var10001 = _livEnt.getMaxHealth();
                                } else {
                                    var10001 = -1.0F;
                                }

                                _entity.setHealth(var10001);
                            }
                        }
                    } else if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) && !entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots")))) {
                        if (Math.random() < 0.4) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0F, 2.0F, false);
                                }
                            }

                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                } else if (entity instanceof Player) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }
}
