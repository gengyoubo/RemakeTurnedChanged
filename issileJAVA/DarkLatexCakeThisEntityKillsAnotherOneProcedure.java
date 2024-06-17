//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCakeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexCakeThisEntityKillsAnotherOneProcedure {
    public DarkLatexCakeThisEntityKillsAnotherOneProcedure() {
    }

    public static boolean execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            LivingEntity _livEnt;
            LivingEntity _livEnt;
            LivingEntity _entity;
            float var10001;
            float var10002;
            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    _entity = (LivingEntity)entity;
                    var10000 = _entity.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                boolean var30;
                label372: {
                    if (var10000.getItem() == LatexModItems.HAZMAT_HELMET.get()) {
                        if (entity instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entity;
                            var10000 = _livEnt.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            var10000 = ItemStack.EMPTY;
                        }

                        if (var10000.getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                            if (entity instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entity;
                                var10000 = _livEnt.getItemBySlot(EquipmentSlot.LEGS);
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
                                    var30 = true;
                                    break label372;
                                }
                            }
                        }
                    }

                    var30 = false;
                }

                if (!var30) {
                    ServerLevel _level;
                    Level _level;
                    if (Math.random() < 0.75) {
                        if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity instanceof Player) {
                            return true;
                        }

                        DLbeeEntity entityToSpawn;
                        Mob _mobToSpawn;
                        if (entity instanceof FlyingMob) {
                            YufengEntity entityToSpawn;
                            if (Math.random() < 0.3) {
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
                                    entityToSpawn = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else if (Math.random() < 0.3) {
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
                                    Entity entityToSpawn = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else if (Math.random() < 0.3) {
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
                                    entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
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

                                if (!sourceentity.level.isClientSide()) {
                                    sourceentity.discard();
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
                                    entityToSpawn = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            }
                        } else if (entity instanceof WaterAnimal) {
                            DlsharkEntity entityToSpawn;
                            if (Math.random() < 0.3) {
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
                                    entityToSpawn = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else if (Math.random() < 0.2) {
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
                                    Entity entityToSpawn = new DlSquidDogEntity((EntityType)LatexModEntities.DL_SQUID_DOG.get(), _level);
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

                                if (!sourceentity.level.isClientSide()) {
                                    sourceentity.discard();
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
                                    entityToSpawn = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            }
                        } else if (entity instanceof Fox) {
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
                                Entity entityToSpawn = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (entity instanceof Skeleton || entity instanceof WitherSkeleton) {
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
                                Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (entity instanceof Bee) {
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
                                entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
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
                                Entity entityToSpawn = new DarkLatexCakeEntity((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    } else if (Math.random() < 0.6) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        if (world instanceof ServerLevel) {
                            _level = (ServerLevel)world;
                            _level.sendParticles(ParticleTypes.HEART, x, y, z, 4, 3.0, 3.0, 3.0, 1.0);
                        }

                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                            }
                        }

                        if (sourceentity instanceof LivingEntity) {
                            LivingEntity _entity = (LivingEntity)sourceentity;
                            if (sourceentity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)sourceentity;
                                var10001 = _livEnt.getHealth();
                            } else {
                                var10001 = -1.0F;
                            }

                            if (sourceentity instanceof LivingEntity) {
                                LivingEntity _livEnt = (LivingEntity)sourceentity;
                                var10002 = _livEnt.getMaxHealth();
                            } else {
                                var10002 = -1.0F;
                            }

                            _entity.setHealth(var10001 + var10002 / 2.0F);
                        }

                        if (Math.random() < 0.6) {
                            ((<undefinedtype>)(new Object() {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                public void start(LevelAccessor world, int waitTicks) {
                                    this.waitTicks = (float)waitTicks;
                                    MinecraftForge.EVENT_BUS.register(this);
                                    this.world = world;
                                }

                                @SubscribeEvent
                                public void tick(TickEvent.ServerTickEvent event) {
                                    if (event.phase == Phase.END) {
                                        ++this.ticks;
                                        if ((float)this.ticks >= this.waitTicks) {
                                            this.run();
                                        }
                                    }

                                }

                                private void run() {
                                    LevelAccessor var2 = this.world;
                                    if (var2 instanceof Level _level) {
                                        if (!_level.isClientSide()) {
                                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.BLOCKS, 1.0F, 3.0F);
                                        } else {
                                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.BLOCKS, 1.0F, 3.0F, false);
                                        }
                                    }

                                    var2 = this.world;
                                    if (var2 instanceof Level _level) {
                                        if (!_level.isClientSide()) {
                                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CAKE));
                                            entityToSpawn.setPickUpDelay(10);
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }

                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            })).start(world, 240);
                        }
                    }
                } else if (entity instanceof Player) {
                    return true;
                }
            } else if (Math.random() < 0.2) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }

                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    _level.sendParticles(ParticleTypes.HEART, x, y, z, 4, 3.0, 3.0, 3.0, 1.0);
                }

                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                    }
                }

                if (sourceentity instanceof LivingEntity) {
                    _entity = (LivingEntity)sourceentity;
                    if (sourceentity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)sourceentity;
                        var10001 = _livEnt.getHealth();
                    } else {
                        var10001 = -1.0F;
                    }

                    double var29 = (double)var10001;
                    if (sourceentity instanceof LivingEntity) {
                        _livEnt = (LivingEntity)sourceentity;
                        var10002 = _livEnt.getMaxHealth();
                    } else {
                        var10002 = -1.0F;
                    }

                    _entity.setHealth((float)(var29 + (double)var10002 / 1.5));
                }

                if (Math.random() < 0.3) {
                    ((<undefinedtype>)(new Object() {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = (float)waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
                        }

                        @SubscribeEvent
                        public void tick(TickEvent.ServerTickEvent event) {
                            if (event.phase == Phase.END) {
                                ++this.ticks;
                                if ((float)this.ticks >= this.waitTicks) {
                                    this.run();
                                }
                            }

                        }

                        private void run() {
                            LevelAccessor var2 = this.world;
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dispenser.dispense")), SoundSource.BLOCKS, 1.0F, 1.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dispenser.dispense")), SoundSource.BLOCKS, 1.0F, 1.0F, false);
                                }
                            }

                            var2 = this.world;
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.CAKE));
                                    entityToSpawn.setPickUpDelay(10);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }

                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    })).start(world, 240);
                }
            }

            return false;
        } else {
            return false;
        }
    }
}
