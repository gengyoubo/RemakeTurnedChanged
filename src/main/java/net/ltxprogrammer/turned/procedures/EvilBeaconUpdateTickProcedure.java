package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.entity.DROPPODEntity;
import net.ltxprogrammer.turned.init.LatexModBlocks;
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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/EvilBeaconUpdateTickProcedure.class */
public class EvilBeaconUpdateTickProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID)) {
            new Object() { // from class: net.ltxprogrammer.turned.procedures.EvilBeaconUpdateTickProcedure.1
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
                            _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 30);
            new Object() { // from class: net.ltxprogrammer.turned.procedures.EvilBeaconUpdateTickProcedure.2
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
                    if (Math.random() < 0.005d * ((double) (this.world.getLevelData().getGameRules().getInt(LatexModGameRules.BEACONDROPMULTIPLIER) / 10))) {
                        ServerLevel _level = this.world;
                        if (_level instanceof ServerLevel) {
                            _level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 8, 3.0d, 2.0d, 3.0d, 1.0d);
                        }
                        ServerLevel _level2 = this.world;
                        if (_level2 instanceof ServerLevel) {
                            _level2.sendParticles(ParticleTypes.PORTAL, x, y + 48.0d, z, 8, 3.0d, 2.0d, 3.0d, 1.0d);
                        }
                        this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                        new Object() { // from class: net.ltxprogrammer.turned.procedures.EvilBeaconUpdateTickProcedure.2.1
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
                                if (Math.random() < 0.1d) {
                                    ServerLevel serverLevel = this.world;
                                    if (serverLevel instanceof ServerLevel) {
                                        ServerLevel _level3 = serverLevel;
                                        Entity entityToSpawn = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level3);
                                        entityToSpawn.moveTo(x, y + 36.0d, z + 8.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn instanceof Mob) {
                                            ((Mob) entityToSpawn).finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        this.world.addFreshEntity(entityToSpawn);
                                    }
                                    ServerLevel serverLevel2 = this.world;
                                    if (serverLevel2 instanceof ServerLevel) {
                                        ServerLevel _level4 = serverLevel2;
                                        Entity entityToSpawn2 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level4);
                                        entityToSpawn2.moveTo(x, y + 36.0d, z - 8.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn2 instanceof Mob) {
                                            ((Mob) entityToSpawn2).finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        this.world.addFreshEntity(entityToSpawn2);
                                    }
                                    ServerLevel serverLevel3 = this.world;
                                    if (serverLevel3 instanceof ServerLevel) {
                                        ServerLevel _level5 = serverLevel3;
                                        Entity entityToSpawn3 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level5);
                                        entityToSpawn3.moveTo(x + 8.0d, y + 36.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn3 instanceof Mob) {
                                            ((Mob) entityToSpawn3).finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        this.world.addFreshEntity(entityToSpawn3);
                                    }
                                    ServerLevel serverLevel4 = this.world;
                                    if (serverLevel4 instanceof ServerLevel) {
                                        ServerLevel _level6 = serverLevel4;
                                        Entity entityToSpawn4 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level6);
                                        entityToSpawn4.moveTo(x - 8.0d, y + 36.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn4 instanceof Mob) {
                                            ((Mob) entityToSpawn4).finalizeSpawn(_level6, this.world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        this.world.addFreshEntity(entityToSpawn4);
                                    }
                                } else {
                                    ServerLevel serverLevel5 = this.world;
                                    if (serverLevel5 instanceof ServerLevel) {
                                        ServerLevel _level7 = serverLevel5;
                                        Entity entityToSpawn5 = new DROPPODEntity((EntityType<DROPPODEntity>) ((EntityType) LatexModEntities.DROPPOD.get()), (Level) _level7);
                                        entityToSpawn5.moveTo(x, y + 48.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn5 instanceof Mob) {
                                            ((Mob) entityToSpawn5).finalizeSpawn(_level7, this.world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        this.world.addFreshEntity(entityToSpawn5);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 50);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 200);
            return;
        }
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = ((Block) LatexModBlocks.EVIL_BEACON.get()).defaultBlockState();
        UnmodifiableIterator it = world.getBlockState(_bp).getValues().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) it.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (!(_property == null || _bs.getValue(_property) == null)) {
                try {
                    _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                } catch (Exception e) {
                }
            }
        }
        world.setBlock(_bp, _bs, 3);
    }
}
