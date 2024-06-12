package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.AllydroppodEntity;
import net.ltxprogrammer.turned.entity.DROPPODEntity;
import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/MakeshiftBeaconOnUpdateTickProcedure.class */
public class MakeshiftBeaconOnUpdateTickProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: net.ltxprogrammer.turned.procedures.MakeshiftBeaconOnUpdateTickProcedure.1
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world2, int waitTicks) {
                this.waitTicks = (float) waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world2;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (((float) this.ticks) >= this.waitTicks) {
                        run();
                    }
                }
            }

            private void run() {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.experience_orb.pickup")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 35);
        new Object() { // from class: net.ltxprogrammer.turned.procedures.MakeshiftBeaconOnUpdateTickProcedure.2
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world2, int waitTicks) {
                this.waitTicks = (float) waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world2;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (((float) this.ticks) >= this.waitTicks) {
                        run();
                    }
                }
            }

            private void run() {
                if (Math.random() < 0.0075d * ((double) (this.world.getLevelData().getGameRules().getInt(LatexModGameRules.BEACONDROPMULTIPLIER) / 10))) {
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    ServerLevel _level2 = this.world;
                    if (_level2 instanceof ServerLevel) {
                        _level2.sendParticles(ParticleTypes.END_ROD, x, y, z, 5, 3.0d, 1.0d, 3.0d, 1.0d);
                    }
                    ServerLevel _level3 = this.world;
                    if (_level3 instanceof ServerLevel) {
                        _level3.sendParticles(ParticleTypes.PORTAL, x, y + 48.0d, z, 8, 3.0d, 1.0d, 3.0d, 1.0d);
                    }
                    if (Math.random() < 0.6d) {
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            ServerLevel _level4 = serverLevel;
                            Entity entityToSpawn = new AllydroppodEntity((EntityType<AllydroppodEntity>) ((EntityType) LatexModEntities.ALLYDROPPOD.get()), (Level) _level4);
                            entityToSpawn.moveTo(x, y + 48.0d, z, 0.0f, 0.0f);
                            entityToSpawn.setYBodyRot(0.0f);
                            entityToSpawn.setYHeadRot(0.0f);
                            entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn instanceof Mob) {
                                ((Mob) entityToSpawn).finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn);
                        }
                    } else if (Math.random() < 0.1d) {
                        ServerLevel serverLevel2 = this.world;
                        if (serverLevel2 instanceof ServerLevel) {
                            ServerLevel _level5 = serverLevel2;
                            Entity entityToSpawn2 = new AllydroppodEntity((EntityType<AllydroppodEntity>) ((EntityType) LatexModEntities.ALLYDROPPOD.get()), (Level) _level5);
                            entityToSpawn2.moveTo(x + 6.0d, y + 48.0d, z + 6.0d, 0.0f, 0.0f);
                            entityToSpawn2.setYBodyRot(0.0f);
                            entityToSpawn2.setYHeadRot(0.0f);
                            entityToSpawn2.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn2 instanceof Mob) {
                                ((Mob) entityToSpawn2).finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn2);
                        }
                        ServerLevel serverLevel3 = this.world;
                        if (serverLevel3 instanceof ServerLevel) {
                            ServerLevel _level6 = serverLevel3;
                            Entity entityToSpawn3 = new AllydroppodEntity((EntityType<AllydroppodEntity>) ((EntityType) LatexModEntities.ALLYDROPPOD.get()), (Level) _level6);
                            entityToSpawn3.moveTo(x - 6.0d, y + 48.0d, z - 6.0d, 0.0f, 0.0f);
                            entityToSpawn3.setYBodyRot(0.0f);
                            entityToSpawn3.setYHeadRot(0.0f);
                            entityToSpawn3.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn3 instanceof Mob) {
                                ((Mob) entityToSpawn3).finalizeSpawn(_level6, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn3);
                        }
                    } else if (Math.random() < 0.5d) {
                        ServerLevel serverLevel4 = this.world;
                        if (serverLevel4 instanceof ServerLevel) {
                            ServerLevel _level7 = serverLevel4;
                            Entity entityToSpawn4 = new LatexDropPodEntity((EntityType<LatexDropPodEntity>) ((EntityType) LatexModEntities.LATEX_DROP_POD.get()), (Level) _level7);
                            entityToSpawn4.moveTo(x, y + 48.0d, z, 0.0f, 0.0f);
                            entityToSpawn4.setYBodyRot(0.0f);
                            entityToSpawn4.setYHeadRot(0.0f);
                            entityToSpawn4.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn4 instanceof Mob) {
                                ((Mob) entityToSpawn4).finalizeSpawn(_level7, this.world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn4);
                        }
                    } else if (this.world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID)) {
                        ServerLevel serverLevel5 = this.world;
                        if (serverLevel5 instanceof ServerLevel) {
                            ServerLevel _level8 = serverLevel5;
                            Entity entityToSpawn5 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level8);
                            entityToSpawn5.moveTo(x, y + 48.0d, z, 0.0f, 0.0f);
                            entityToSpawn5.setYBodyRot(0.0f);
                            entityToSpawn5.setYHeadRot(0.0f);
                            entityToSpawn5.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn5 instanceof Mob) {
                                ((Mob) entityToSpawn5).finalizeSpawn(_level8, this.world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn5);
                        }
                    } else {
                        ServerLevel serverLevel6 = this.world;
                        if (serverLevel6 instanceof ServerLevel) {
                            ServerLevel _level9 = serverLevel6;
                            Entity entityToSpawn6 = new LatexDropPodEntity((EntityType<LatexDropPodEntity>) ((EntityType) LatexModEntities.LATEX_DROP_POD.get()), (Level) _level9);
                            entityToSpawn6.moveTo(x, y + 48.0d, z, 0.0f, 0.0f);
                            entityToSpawn6.setYBodyRot(0.0f);
                            entityToSpawn6.setYHeadRot(0.0f);
                            entityToSpawn6.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn6 instanceof Mob) {
                                ((Mob) entityToSpawn6).finalizeSpawn(_level9, this.world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            this.world.addFreshEntity(entityToSpawn6);
                        }
                    }
                    this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 250);
    }
}
