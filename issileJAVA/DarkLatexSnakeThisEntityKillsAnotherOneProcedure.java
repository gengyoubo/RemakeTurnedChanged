//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.ScientistEntity;
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
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexSnakeThisEntityKillsAnotherOneProcedure {
    public DarkLatexSnakeThisEntityKillsAnotherOneProcedure() {
    }

    public static boolean execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
                ItemStack var10000;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = (LivingEntity)entity;
                    var10000 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    var10000 = ItemStack.EMPTY;
                }

                boolean var24;
                label256: {
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
                                    var24 = true;
                                    break label256;
                                }
                            }
                        }
                    }

                    var24 = false;
                }

                if (!var24 && !(entity instanceof Player)) {
                    Level _level;
                    if (Math.random() < 0.6) {
                        if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots")))) {
                            return true;
                        }

                        Mob _mobToSpawn;
                        ServerLevel _level;
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
                                Entity entityToSpawn = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:skeletons")))) {
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

                            if (Math.random() < 0.25 && world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
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
                                Entity entityToSpawn = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (!(entity instanceof DarklatexEntity)) {
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
                                Entity entityToSpawn = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        } else if (entity instanceof EvilSniperEntity || entity instanceof ScientistEntity || entity instanceof EvilScientistEntity) {
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

                            if (Math.random() < 0.3) {
                                if (world instanceof ServerLevel) {
                                    _level = (ServerLevel)world;
                                    Entity entityToSpawn = new DarkLatexFoxSniperEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), _level);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                    if (entityToSpawn instanceof Mob) {
                                        _mobToSpawn = (Mob)entityToSpawn;
                                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                    }

                                    world.addFreshEntity(entityToSpawn);
                                }
                            } else if (world instanceof ServerLevel) {
                                _level = (ServerLevel)world;
                                Entity entityToSpawn = new DarkLatexFoxScientistEntity((EntityType)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), _level);
                                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                world.addFreshEntity(entityToSpawn);
                            }
                        }
                    } else {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                            }
                        }

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
                                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                    } else {
                                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                    }
                                }

                                var2 = this.world;
                                ItemEntity entityToSpawn;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
                                        entityToSpawn.setPickUpDelay(10);
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }

                                var2 = this.world;
                                if (var2 instanceof Level _level) {
                                    if (!_level.isClientSide()) {
                                        entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
                                        entityToSpawn.setPickUpDelay(10);
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }

                                if (Math.random() < 0.2) {
                                    var2 = this.world;
                                    if (var2 instanceof Level) {
                                        _level = (Level)var2;
                                        if (!_level.isClientSide()) {
                                            entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.SKELETON_SKULL));
                                            entityToSpawn.setPickUpDelay(10);
                                            _level.addFreshEntity(entityToSpawn);
                                        }
                                    }
                                }

                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        })).start(world, 250);
                    }
                }
            }

            return false;
        } else {
            return false;
        }
    }
}
