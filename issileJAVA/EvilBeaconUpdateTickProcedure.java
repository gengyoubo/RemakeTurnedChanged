//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.entity.DROPPODEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
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
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class EvilBeaconUpdateTickProcedure {
    public EvilBeaconUpdateTickProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DOEVILSRAID)) {
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
                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 30);
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
                    if (Math.random() < 0.005 * (double)(this.world.getLevelData().getGameRules().getInt(LatexModGameRules.BEACONDROPMULTIPLIER) / 10)) {
                        LevelAccessor var2 = this.world;
                        ServerLevel _level;
                        if (var2 instanceof ServerLevel) {
                            _level = (ServerLevel)var2;
                            _level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 8, 3.0, 2.0, 3.0, 1.0);
                        }

                        var2 = this.world;
                        if (var2 instanceof ServerLevel) {
                            _level = (ServerLevel)var2;
                            _level.sendParticles(ParticleTypes.PORTAL, x, y + 48.0, z, 8, 3.0, 2.0, 3.0, 1.0);
                        }

                        this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
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
                                ServerLevel _level;
                                LevelAccessor var2;
                                Mob _mobToSpawn;
                                DROPPODEntity entityToSpawn;
                                if (Math.random() < 0.1) {
                                    var2 = this.world;
                                    if (var2 instanceof ServerLevel) {
                                        _level = (ServerLevel)var2;
                                        entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                                        entityToSpawn.moveTo(x, y + 36.0, z + 8.0, this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        this.world.addFreshEntity(entityToSpawn);
                                    }

                                    var2 = this.world;
                                    if (var2 instanceof ServerLevel) {
                                        _level = (ServerLevel)var2;
                                        entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                                        entityToSpawn.moveTo(x, y + 36.0, z - 8.0, this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        this.world.addFreshEntity(entityToSpawn);
                                    }

                                    var2 = this.world;
                                    if (var2 instanceof ServerLevel) {
                                        _level = (ServerLevel)var2;
                                        entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                                        entityToSpawn.moveTo(x + 8.0, y + 36.0, z, this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        this.world.addFreshEntity(entityToSpawn);
                                    }

                                    var2 = this.world;
                                    if (var2 instanceof ServerLevel) {
                                        _level = (ServerLevel)var2;
                                        entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                                        entityToSpawn.moveTo(x - 8.0, y + 36.0, z, this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        this.world.addFreshEntity(entityToSpawn);
                                    }
                                } else {
                                    var2 = this.world;
                                    if (var2 instanceof ServerLevel) {
                                        _level = (ServerLevel)var2;
                                        entityToSpawn = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), _level);
                                        entityToSpawn.moveTo(x, y + 48.0, z, this.world.getRandom().nextFloat() * 360.0F, 0.0F);
                                        if (entityToSpawn instanceof Mob) {
                                            _mobToSpawn = (Mob)entityToSpawn;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                                        }

                                        this.world.addFreshEntity(entityToSpawn);
                                    }
                                }

                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        })).start(this.world, 50);
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 200);
        } else {
            BlockPos _bp = new BlockPos(x, y, z);
            BlockState _bs = ((Block)LatexModBlocks.EVIL_BEACON.get()).defaultBlockState();
            BlockState _bso = world.getBlockState(_bp);
            UnmodifiableIterator var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var10.next();
                Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var14) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        }

    }
}
