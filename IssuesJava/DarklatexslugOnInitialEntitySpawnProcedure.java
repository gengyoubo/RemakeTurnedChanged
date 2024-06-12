//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedEntities;
import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexCentaurEntity;
import net.ltxprogrammer.turned.entity.DarkLatexFoxEntity;
import net.ltxprogrammer.turned.entity.DarkLatexMothEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSnakeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexSpiderEntity;
import net.ltxprogrammer.turned.entity.DarklatexEntity;
import net.ltxprogrammer.turned.entity.DlsharkEntity;
import net.ltxprogrammer.turned.entity.NoiseStalkerEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DarklatexslugOnInitialEntitySpawnProcedure {
    public DarklatexslugOnInitialEntitySpawnProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null) {
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
                    if (entity.isAlive()) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }

                        LevelAccessor var2 = this.world;
                        if (var2 instanceof Level) {
                            Level _level = (Level)var2;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                            }
                        }

                        Mob _mobToSpawn;
                        ServerLevel _levelx;
                        if (Math.random() < 0.175) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxx = new DarkLatexYufeng((EntityType)ChangedEntities.DARK_LATEX_YUFENG.get(), _levelx);
                                entityToSpawnxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxx);
                            }
                        } else if (Math.random() < 0.15) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxxx = new DlsharkEntity((EntityType)LatexModEntities.DLSHARK.get(), _levelx);
                                entityToSpawnxxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxxx);
                            }
                        } else if (Math.random() < 0.175) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxxxx = new DarkLatexFoxEntity((EntityType)LatexModEntities.DARK_LATEX_FOX.get(), _levelx);
                                entityToSpawnxxxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxxxx);
                            }
                        } else if (Math.random() < 0.15) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxxxxx = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), _levelx);
                                entityToSpawnxxxxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxxxxx);
                            }
                        } else if (Math.random() < 0.125) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxxxxxx = new NoiseStalkerEntity((EntityType)LatexModEntities.NOISE_STALKER.get(), _levelx);
                                entityToSpawnxxxxxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxxxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxxxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxxxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxxxxxx);
                            }
                        } else if (Math.random() < 0.125) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxxxxxxxx = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), _levelx);
                                entityToSpawnxxxxxxxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxxxxxxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxxxxxxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxxxxxxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxxxxxxxx);
                            }
                        } else if (Math.random() < 0.125) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawn = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), _levelx);
                                entityToSpawn.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawn);
                            }
                        } else if (Math.random() < 0.125) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnx = new DarkLatexMothEntity((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), _levelx);
                                entityToSpawnx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnx);
                            }
                        } else if (Math.random() < 0.075) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxx = new DarkLatexCentaurEntity((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), _levelx);
                                entityToSpawnxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxx);
                            }
                        } else {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnxxx = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), _levelx);
                                entityToSpawnxxx.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                if (entityToSpawnxxx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnxxx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnxxx);
                            }
                        }
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 30 + world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSLUGGROWTIME));
        }
    }
}
