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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TSCHunterThisEntityKillsAnotherOneProcedure.class */
public class TSCHunterThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (!((entity instanceof MilitaryEntity) || (entity instanceof ScientistEntity) || (entity instanceof MilitaryflameunitEntity) || (entity instanceof Villager) || (entity instanceof WanderingTrader) || (entity instanceof Witch) || (entity instanceof EvilMilitaryEntity) || (entity instanceof EvilSniperEntity) || (entity instanceof EvilScientistEntity) || (entity instanceof Pillager) || (entity instanceof Vindicator) || (entity instanceof Evoker))) {
                return;
            }
            if (Math.random() < 0.2d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player) null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.END_ROD, sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 5, 1.0d, 2.0d, 1.0d, 1.0d);
                }
                if (world instanceof ServerLevel) {
                    ServerLevel _level2 = (ServerLevel) world;
                    Entity entityToSpawn = new TSCdroneEntity((EntityType<TSCdroneEntity>) ((EntityType) LatexModEntities.TS_CDRONE.get()), (Level) _level2);
                    entityToSpawn.moveTo(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ(), 0.0f, 0.0f);
                    entityToSpawn.setYBodyRot(0.0f);
                    entityToSpawn.setYHeadRot(0.0f);
                    if (entityToSpawn instanceof Mob) {
                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.35d) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level) {
                    Level _level3 = (Level) world;
                    if (!_level3.isClientSide()) {
                        _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (sourceentity instanceof LivingEntity) {
                    ((LivingEntity) sourceentity).addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
                }
                if (sourceentity instanceof LivingEntity) {
                    ((LivingEntity) sourceentity).addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false));
                }
                new AnonymousClass1(sourceentity, x, y, z).start(world, 200);
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.TSCHunterThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TSCHunterThisEntityKillsAnotherOneProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ Entity val$sourceentity;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(Entity entity, double d, double d2, double d3) {
            this.val$sourceentity = entity;
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = (float) waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
                ServerLevel _level = serverLevel;
                Entity entityToSpawn = new TSCdroneEntity((EntityType<TSCdroneEntity>) ((EntityType) LatexModEntities.TS_CDRONE.get()), (Level) _level);
                entityToSpawn.moveTo(this.val$sourceentity.getX(), this.val$sourceentity.getY(), this.val$sourceentity.getZ(), 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                this.world.addFreshEntity(entityToSpawn);
            }
            Level level = this.world;
            if (level instanceof Level) {
                Level _level2 = level;
                if (!_level2.isClientSide()) {
                    _level2.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            ServerLevel _level3 = this.world;
            if (_level3 instanceof ServerLevel) {
                _level3.sendParticles(ParticleTypes.END_ROD, this.val$sourceentity.getX(), this.val$sourceentity.getY(), this.val$sourceentity.getZ(), 5, 1.0d, 2.0d, 1.0d, 1.0d);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
