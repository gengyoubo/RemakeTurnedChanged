package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import net.ltxprogrammer.turned.entity.EvilSniperEntity;
import net.ltxprogrammer.turned.entity.MilitaryEntity;
import net.ltxprogrammer.turned.entity.MilitaryflameunitEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import net.ltxprogrammer.turned.entity.TSCHunterEntity;
import net.ltxprogrammer.turned.entity.TSCdroneEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TSCHunterThisEntityKillsAnotherOneProcedure.class */
public class TSCHunterThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, final TSCHunterEntity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (!(entity instanceof MilitaryEntity) && !(entity instanceof ScientistEntity) && !(entity instanceof MilitaryflameunitEntity) && !(entity instanceof Villager) && !(entity instanceof WanderingTrader) && !(entity instanceof Witch) && !(entity instanceof EvilMilitaryEntity) && !(entity instanceof EvilSniperEntity) && !(entity instanceof EvilScientistEntity) && !(entity instanceof Pillager) && !(entity instanceof Vindicator) && !(entity instanceof Evoker) && !(entity instanceof Player)) {
                return;
            }
            if (Math.random() < 0.2d) {
                if (!entity.level.isClientSide()) {
                    if (entity instanceof Player) {
                        entity.kill();
                    } else {
                        entity.discard();
                    }
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel _level2) {
                    _level2.sendParticles(ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0d, 2.0d, 1.0d, 1.0d);
                    Entity entityToSpawn = new TSCdroneEntity((EntityType<TSCdroneEntity>) LatexModEntities.TS_CDRONE.get(), _level2);
                    entityToSpawn.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0f, 0.0f);
                    entityToSpawn.setYBodyRot(0.0f);
                    entityToSpawn.setYHeadRot(0.0f);
                    ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.35d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                sourceentity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
                sourceentity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false));
                new Object() { // from class: net.ltxprogrammer.turned.procedures.TSCHunterThisEntityKillsAnotherOneProcedure.1
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
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            Entity entityToSpawn2 = new TSCdroneEntity((EntityType<TSCdroneEntity>) LatexModEntities.TS_CDRONE.get(), serverLevel);
                            entityToSpawn2.moveTo(TSCHunterEntity.this.getX(), TSCHunterEntity.this.getY(), TSCHunterEntity.this.getZ(), 0.0f, 0.0f);
                            entityToSpawn2.setYBodyRot(0.0f);
                            entityToSpawn2.setYHeadRot(0.0f);
                            ((Mob) entityToSpawn2).finalizeSpawn(serverLevel, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            this.world.addFreshEntity(entityToSpawn2);
                        }
                        Level level = this.world;
                        if (level instanceof Level) {
                            if (!level.isClientSide()) {
                                level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        ServerLevel _level6 = this.world;
                        if (_level6 instanceof ServerLevel) {
                            _level6.sendParticles(ParticleTypes.END_ROD, TSCHunterEntity.this.getX(), TSCHunterEntity.this.getY(), TSCHunterEntity.this.getZ(), 5, 1.0d, 2.0d, 1.0d, 1.0d);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 200);
            }
        }
    }
}
