//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.AllydroppodEntity;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.entity.LatexDropPodEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class MakeshiftBeaconOnUpdateTickProcedure {
    public MakeshiftBeaconOnUpdateTickProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
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
                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }

                MinecraftForge.EVENT_BUS.unregister(this);
            }
        })).start(world, 35);
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
                if (Math.random() < 0.0075 * (double)(this.world.getLevelData().getGameRules().getInt(LatexModGameRules.BEACONDROPMULTIPLIER) / 10)) {
                    LevelAccessor var2 = this.world;
                    if (var2 instanceof Level) {
                        Level _level = (Level)var2;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }

                    var2 = this.world;
                    ServerLevel _levelx;
                    if (var2 instanceof ServerLevel) {
                        _levelx = (ServerLevel)var2;
                        _levelx.sendParticles(ParticleTypes.END_ROD, x, y, z, 5, 3.0, 1.0, 3.0, 1.0);
                    }

                    var2 = this.world;
                    if (var2 instanceof ServerLevel) {
                        _levelx = (ServerLevel)var2;
                        _levelx.sendParticles(ParticleTypes.PORTAL, x, y + 48.0, z, 8, 3.0, 1.0, 3.0, 1.0);
                    }

                    Mob _mobToSpawn;
                    AllydroppodEntity entityToSpawnxx;
                    if (Math.random() < 0.6) {
                        var2 = this.world;
                        if (var2 instanceof ServerLevel) {
                            _levelx = (ServerLevel)var2;
                            entityToSpawnxx = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), _levelx);
                            entityToSpawnxx.moveTo(x, y + 48.0, z, 0.0F, 0.0F);
                            entityToSpawnxx.setYBodyRot(0.0F);
                            entityToSpawnxx.setYHeadRot(0.0F);
                            entityToSpawnxx.setDeltaMovement(0.0, 0.0, 0.0);
                            if (entityToSpawnxx instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawnxx;
                                _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                            }

                            this.world.addFreshEntity(entityToSpawnxx);
                        }
                    } else if (Math.random() < 0.1) {
                        var2 = this.world;
                        if (var2 instanceof ServerLevel) {
                            _levelx = (ServerLevel)var2;
                            entityToSpawnxx = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), _levelx);
                            entityToSpawnxx.moveTo(x + 6.0, y + 48.0, z + 6.0, 0.0F, 0.0F);
                            entityToSpawnxx.setYBodyRot(0.0F);
                            entityToSpawnxx.setYHeadRot(0.0F);
                            entityToSpawnxx.setDeltaMovement(0.0, 0.0, 0.0);
                            if (entityToSpawnxx instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawnxx;
                                _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                            }

                            this.world.addFreshEntity(entityToSpawnxx);
                        }

                        var2 = this.world;
                        if (var2 instanceof ServerLevel) {
                            _levelx = (ServerLevel)var2;
                            entityToSpawnxx = new AllydroppodEntity((EntityType)LatexModEntities.ALLYDROPPOD.get(), _levelx);
                            entityToSpawnxx.moveTo(x - 6.0, y + 48.0, z - 6.0, 0.0F, 0.0F);
                            entityToSpawnxx.setYBodyRot(0.0F);
                            entityToSpawnxx.setYHeadRot(0.0F);
                            entityToSpawnxx.setDeltaMovement(0.0, 0.0, 0.0);
                            if (entityToSpawnxx instanceof Mob) {
                                _mobToSpawn = (Mob)entityToSpawnxx;
                                _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnxx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                            }

                            this.world.addFreshEntity(entityToSpawnxx);
                        }
                    } else {
                        LatexDropPodEntity entityToSpawn;
                        if (Math.random() < 0.5) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                entityToSpawn = new LatexDropPodEntity((EntityType)LatexModEntities.LATEX_DROP_POD.get(), _levelx);
                                entityToSpawn.moveTo(x, y + 48.0, z, 0.0F, 0.0F);
                                entityToSpawn.setYBodyRot(0.0F);
                                entityToSpawn.setYHeadRot(0.0F);
                                entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawn);
                            }
                        } else if (this.world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID)) {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                Entity entityToSpawnx = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _levelx);
                                entityToSpawnx.moveTo(x, y + 48.0, z, 0.0F, 0.0F);
                                entityToSpawnx.setYBodyRot(0.0F);
                                entityToSpawnx.setYHeadRot(0.0F);
                                entityToSpawnx.setDeltaMovement(0.0, 0.0, 0.0);
                                if (entityToSpawnx instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawnx;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawnx.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawnx);
                            }
                        } else {
                            var2 = this.world;
                            if (var2 instanceof ServerLevel) {
                                _levelx = (ServerLevel)var2;
                                entityToSpawn = new LatexDropPodEntity((EntityType)LatexModEntities.LATEX_DROP_POD.get(), _levelx);
                                entityToSpawn.moveTo(x, y + 48.0, z, 0.0F, 0.0F);
                                entityToSpawn.setYBodyRot(0.0F);
                                entityToSpawn.setYHeadRot(0.0F);
                                entityToSpawn.setDeltaMovement(0.0, 0.0, 0.0);
                                if (entityToSpawn instanceof Mob) {
                                    _mobToSpawn = (Mob)entityToSpawn;
                                    _mobToSpawn.finalizeSpawn(_levelx, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawn);
                            }
                        }
                    }

                    this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                }

                MinecraftForge.EVENT_BUS.unregister(this);
            }
        })).start(world, 250);
    }
}
