//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.EvilMilitaryEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.MilitaryflameunitEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.TSCdroneEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class TSCHunterThisEntityKillsAnotherOneProcedure {
    public TSCHunterThisEntityKillsAnotherOneProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, final Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (entity instanceof MilitaryEntity || entity instanceof ScientistEntity || entity instanceof MilitaryflameunitEntity || entity instanceof Villager || entity instanceof WanderingTrader || entity instanceof Witch || entity instanceof EvilMilitaryEntity || entity instanceof EvilSniperEntity || entity instanceof EvilScientistEntity || entity instanceof Pillager || entity instanceof Vindicator || entity instanceof Evoker) {
                Level _level;
                if (Math.random() < 0.2) {
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }

                    if (world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }

                    ServerLevel _level;
                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        _level.sendParticles(ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0, 2.0, 1.0, 1.0);
                    }

                    if (world instanceof ServerLevel) {
                        _level = (ServerLevel)world;
                        Entity entityToSpawn = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), _level);
                        entityToSpawn.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0F, 0.0F);
                        entityToSpawn.setYBodyRot(0.0F);
                        entityToSpawn.setYHeadRot(0.0F);
                        if (entityToSpawn instanceof Mob) {
                            Mob _mobToSpawn = (Mob)entityToSpawn;
                            _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                        }

                        world.addFreshEntity(entityToSpawn);
                    }
                } else if (Math.random() < 0.35) {
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

                    LivingEntity _entity;
                    if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
                    }

                    if (sourceentity instanceof LivingEntity) {
                        _entity = (LivingEntity)sourceentity;
                        _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false));
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
                            if (var2 instanceof ServerLevel _level) {
                                Entity entityToSpawn = new TSCdroneEntity((EntityType)LatexModEntities.TS_CDRONE.get(), _level);
                                entityToSpawn.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0F, 0.0F);
                                entityToSpawn.setYBodyRot(0.0F);
                                entityToSpawn.setYHeadRot(0.0F);
                                if (entityToSpawn instanceof Mob _mobToSpawn) {
                                    _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                }

                                this.world.addFreshEntity(entityToSpawn);
                            }

                            var2 = this.world;
                            if (var2 instanceof Level _levelx) {
                                if (!_levelx.isClientSide()) {
                                    _levelx.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                                } else {
                                    _levelx.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                                }
                            }

                            var2 = this.world;
                            if (var2 instanceof ServerLevel _level) {
                                _level.sendParticles(ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0, 2.0, 1.0, 1.0);
                            }

                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    })).start(world, 200);
                }
            }

        }
    }
}
