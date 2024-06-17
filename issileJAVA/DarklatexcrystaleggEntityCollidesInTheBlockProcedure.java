//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEnhancedEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
import net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

public class DarklatexcrystaleggEntityCollidesInTheBlockProcedure {
    public DarklatexcrystaleggEntityCollidesInTheBlockProcedure() {
    }

    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return false;
        } else {
            if (entity instanceof Player) {
                Player _plr = (Player)entity;
                if (_plr.getAbilities().instabuild) {
                    return true;
                }
            }

            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _entGetArmor = (LivingEntity)entity;
                var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                var10000 = ItemStack.EMPTY;
            }

            boolean var29;
            label462: {
                label461: {
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
                                    break label461;
                                }
                            }
                        }
                    }

                    if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) && !(entity instanceof ElderGuardian) && !(entity instanceof WitherBoss) && !(entity instanceof EnderDragon)) {
                        var29 = false;
                        break label462;
                    }
                }

                var29 = true;
            }

            if (var29) {
                return true;
            } else {
                if (Math.random() < 0.25 && !(entity instanceof Player)) {
                    Level _level;
                    Mob _mobToSpawn;
                    ServerLevel _level;
                    LivingEntity _entity;
                    float var10001;
                    LivingEntity _livEnt;
                    if (entity instanceof DarklatexEntity) {
                        if (Math.random() < 0.3) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
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
                        } else if (Math.random() < 0.1) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
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
                        } else {
                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    var10001 = _livEnt.getMaxHealth();
                                } else {
                                    var10001 = -1.0F;
                                }

                                _entity.setHealth(var10001);
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                            }
                        }

                        world.destroyBlock(new BlockPos(x, y, z), false);
                    } else if (entity instanceof DLbeeEntity) {
                        if (Math.random() < 0.3) {
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

                            if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarkLatexQueenBeeEntity((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else {
                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    var10001 = _livEnt.getMaxHealth();
                                } else {
                                    var10001 = -1.0F;
                                }

                                _entity.setHealth(var10001);
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                            }
                        }

                        world.destroyBlock(new BlockPos(x, y, z), false);
                    } else {
                        DarkLatexDragonEntity entityToSpawn;
                        if (entity instanceof YufengEntity) {
                            if (Math.random() < 0.01) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }

                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                    }
                                }

                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    entityToSpawn = new DarkLatexDragonEntity((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else {
                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        var10001 = _livEnt.getMaxHealth();
                                    } else {
                                        var10001 = -1.0F;
                                    }

                                    _entity.setHealth(var10001);
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1, false, false));
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                                }
                            }

                            world.destroyBlock(new BlockPos(x, y, z), false);
                        } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                if (entity instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entity;
                                    var10001 = _livEnt.getMaxHealth();
                                } else {
                                    var10001 = -1.0F;
                                }

                                _entity.setHealth(var10001);
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                            }

                            if (entity instanceof LivingEntity) {
                                _entity = (LivingEntity)entity;
                                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                            }

                            world.destroyBlock(new BlockPos(x, y, z), false);
                        } else if (entity instanceof DarkLatexCreeperEntity) {
                            if (Math.random() < 0.01) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }

                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                    }
                                }

                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = new DarkLatexCreeperEnhancedEntity((EntityType)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else {
                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        var10001 = _livEnt.getMaxHealth();
                                    } else {
                                        var10001 = -1.0F;
                                    }

                                    _entity.setHealth(var10001);
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 320, 1, false, false));
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 320, 1, false, false));
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 320, 2, false, false));
                                }
                            }
                        } else if (entity instanceof Bee) {
                            entity.hurt(DamageSource.CACTUS, 20.0F);
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            world.destroyBlock(new BlockPos(x, y, z), false);
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
                                Entity entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (entity instanceof DarkLatexSkeletonEntity) {
                            if (Math.random() < 0.02) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }

                                if (world instanceof Level) {
                                    _level = (Level)world;
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                    }
                                }

                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    entityToSpawn = new DarkLatexDragonEntity((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }

                                world.destroyBlock(new BlockPos(x, y, z), false);
                            } else {
                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    if (entity instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entity;
                                        var10001 = _livEnt.getMaxHealth();
                                    } else {
                                        var10001 = -1.0F;
                                    }

                                    _entity.setHealth(var10001);
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                                }

                                if (entity instanceof LivingEntity) {
                                    _entity = (LivingEntity)entity;
                                    _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                                }

                                world.destroyBlock(new BlockPos(x, y, z), false);
                            }
                        } else if (entity.isInWater()) {
                            entity.hurt(DamageSource.CACTUS, 20.0F);
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            world.destroyBlock(new BlockPos(x, y, z), false);
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
                                Entity entityToSpawn = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (!(entity instanceof Spider) && !(entity instanceof CaveSpider)) {
                            if (entity instanceof Creeper) {
                                entity.hurt(DamageSource.CACTUS, 20.0F);
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }

                                world.destroyBlock(new BlockPos(x, y, z), false);
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
                                    Entity entityToSpawn = new DarkLatexCreeperEntity((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else if (entity instanceof DarkLatexSpiderEntity) {
                                if (Math.random() < 0.3) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }

                                    world.destroyBlock(new BlockPos(x, y, z), false);
                                    if (world instanceof Level) {
                                        _level = (Level)world;
                                        if (!_level.isClientSide()) {
                                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                        } else {
                                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie_villager.converted")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                        }
                                    }

                                    if (world instanceof ServerLevel) {
                                        _level = (ServerLevel)world;
                                        Entity entityToSpawn = new DarkLatexSpiderQueenEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), _level);
                                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        world.addFreshEntity(entityToSpawn);
                                    }
                                } else {
                                    if (entity instanceof LivingEntity) {
                                        _entity = (LivingEntity)entity;
                                        if (entity instanceof LivingEntity) {
                                            _livEnt = (LivingEntity)entity;
                                            var10001 = _livEnt.getMaxHealth();
                                        } else {
                                            var10001 = -1.0F;
                                        }

                                        _entity.setHealth(var10001);
                                    }

                                    if (entity instanceof LivingEntity) {
                                        _entity = (LivingEntity)entity;
                                        _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1, false, false));
                                    }

                                    if (entity instanceof LivingEntity) {
                                        _entity = (LivingEntity)entity;
                                        _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false));
                                    }

                                    world.destroyBlock(new BlockPos(x, y, z), false);
                                }
                            } else {
                                entity.hurt(DamageSource.CACTUS, 20.0F);
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }

                                world.destroyBlock(new BlockPos(x, y, z), false);
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
                                    Entity entityToSpawn = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            }
                        } else {
                            entity.hurt(DamageSource.CACTUS, 20.0F);
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }

                            world.destroyBlock(new BlockPos(x, y, z), false);
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
                                Entity entityToSpawn = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                } else {
                    entity.hurt(DamageSource.CACTUS, 5.0F);
                }

                return false;
            }
        }
    }
}
