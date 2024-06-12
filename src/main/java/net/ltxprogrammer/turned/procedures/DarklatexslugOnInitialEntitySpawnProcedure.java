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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexslugOnInitialEntitySpawnProcedure.class */
public class DarklatexslugOnInitialEntitySpawnProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null) {
            new Object() { // from class: net.ltxprogrammer.turned.procedures.DarklatexslugOnInitialEntitySpawnProcedure.1
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
                    if (entity.isAlive()) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        Level level = this.world;
                        if (level instanceof Level) {
                            if (!level.isClientSide()) {
                                level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        if (Math.random() < 0.175d) {
                            ServerLevel serverLevel = this.world;
                            if (serverLevel instanceof ServerLevel) {
                                Entity entityToSpawn = new DarkLatexYufeng(ChangedEntities.DARK_LATEX_YUFENG.get(), serverLevel);
                                entityToSpawn.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn).finalizeSpawn(serverLevel, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn);
                            }
                        } else if (Math.random() < 0.15d) {
                            ServerLevel serverLevel2 = this.world;
                            if (serverLevel2 instanceof ServerLevel) {
                                Entity entityToSpawn2 = new DlsharkEntity((EntityType<DlsharkEntity>) LatexModEntities.DLSHARK.get(), serverLevel2);
                                entityToSpawn2.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn2).finalizeSpawn(serverLevel2, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn2);
                            }
                        } else if (Math.random() < 0.175d) {
                            ServerLevel serverLevel3 = this.world;
                            if (serverLevel3 instanceof ServerLevel) {
                                Entity entityToSpawn3 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) LatexModEntities.DARK_LATEX_FOX.get(), serverLevel3);
                                entityToSpawn3.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn3).finalizeSpawn(serverLevel3, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn3);
                            }
                        } else if (Math.random() < 0.15d) {
                            ServerLevel serverLevel4 = this.world;
                            if (serverLevel4 instanceof ServerLevel) {
                                Entity entityToSpawn4 = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), serverLevel4);
                                entityToSpawn4.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn4).finalizeSpawn(serverLevel4, this.world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn4);
                            }
                        } else if (Math.random() < 0.125d) {
                            ServerLevel serverLevel5 = this.world;
                            if (serverLevel5 instanceof ServerLevel) {
                                Entity entityToSpawn5 = new NoiseStalkerEntity((EntityType<NoiseStalkerEntity>) LatexModEntities.NOISE_STALKER.get(), serverLevel5);
                                entityToSpawn5.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn5).finalizeSpawn(serverLevel5, this.world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn5);
                            }
                        } else if (Math.random() < 0.125d) {
                            ServerLevel serverLevel6 = this.world;
                            if (serverLevel6 instanceof ServerLevel) {
                                Entity entityToSpawn6 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) LatexModEntities.DARK_LATEX_SNAKE.get(), serverLevel6);
                                entityToSpawn6.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn6).finalizeSpawn(serverLevel6, this.world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn6);
                            }
                        } else if (Math.random() < 0.125d) {
                            ServerLevel serverLevel7 = this.world;
                            if (serverLevel7 instanceof ServerLevel) {
                                Entity entityToSpawn7 = new DarkLatexSpiderEntity((EntityType<DarkLatexSpiderEntity>) LatexModEntities.DARK_LATEX_SPIDER.get(), serverLevel7);
                                entityToSpawn7.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn7).finalizeSpawn(serverLevel7, this.world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn7);
                            }
                        } else if (Math.random() < 0.125d) {
                            ServerLevel serverLevel8 = this.world;
                            if (serverLevel8 instanceof ServerLevel) {
                                Entity entityToSpawn8 = new DarkLatexMothEntity((EntityType<DarkLatexMothEntity>) LatexModEntities.DARK_LATEX_MOTH.get(), serverLevel8);
                                entityToSpawn8.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn8).finalizeSpawn(serverLevel8, this.world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn8);
                            }
                        } else if (Math.random() < 0.075d) {
                            ServerLevel serverLevel9 = this.world;
                            if (serverLevel9 instanceof ServerLevel) {
                                Entity entityToSpawn9 = new DarkLatexCentaurEntity((EntityType<DarkLatexCentaurEntity>) LatexModEntities.DARK_LATEX_CENTAUR.get(), serverLevel9);
                                entityToSpawn9.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn9).finalizeSpawn(serverLevel9, this.world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn9);
                            }
                        } else {
                            ServerLevel serverLevel10 = this.world;
                            if (serverLevel10 instanceof ServerLevel) {
                                Entity entityToSpawn10 = new DarklatexEntity((EntityType<DarklatexEntity>) LatexModEntities.DARKLATEX.get(), serverLevel10);
                                entityToSpawn10.moveTo(entity.getX(), entity.getY(), entity.getZ(), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                ((Mob) entityToSpawn10).finalizeSpawn(serverLevel10, this.world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                this.world.addFreshEntity(entityToSpawn10);
                            }
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 30 + world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSLUGGROWTIME));
        }
    }
}
