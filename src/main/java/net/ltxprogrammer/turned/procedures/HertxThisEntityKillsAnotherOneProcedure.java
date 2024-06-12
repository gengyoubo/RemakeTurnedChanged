package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HertxThisEntityKillsAnotherOneProcedure.class */
public class HertxThisEntityKillsAnotherOneProcedure {
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) {
                if (Math.random() < 0.3d) {
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    new Object() { // from class: net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure.1
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
                                if (!level.isClientSide()) {
                                    level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                if (!level2.isClientSide()) {
                                    ItemEntity entityToSpawn = new ItemEntity(level2, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
                                    entityToSpawn.setPickUpDelay(60);
                                    level2.addFreshEntity(entityToSpawn);
                                }
                            }
                            if (Math.random() < 0.1d) {
                                Level level3 = this.world;
                                if (level3 instanceof Level) {
                                    if (!level3.isClientSide()) {
                                        ItemEntity entityToSpawn2 = new ItemEntity(level3, x, y, z, new ItemStack(LatexModItems.BROKENDLMASK.get()));
                                        entityToSpawn2.setPickUpDelay(60);
                                        level3.addFreshEntity(entityToSpawn2);
                                    }
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, (int) (Math.random() * 60.0d * 20.0d));
                }
            } else if (((entity instanceof DarkLatexYufeng) || (entity instanceof DarkLatexSkeletonEntity)) && Math.random() < 0.2d) {
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                new Object() { // from class: net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure.2
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
                            if (!level.isClientSide()) {
                                level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            if (!level2.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity(level2, x, y, z, new ItemStack(Items.BONE));
                                entityToSpawn.setPickUpDelay(60);
                                level2.addFreshEntity(entityToSpawn);
                            }
                        }
                        Level level3 = this.world;
                        if (level3 instanceof Level) {
                            if (!level3.isClientSide()) {
                                ItemEntity entityToSpawn2 = new ItemEntity(level3, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
                                entityToSpawn2.setPickUpDelay(60);
                                level3.addFreshEntity(entityToSpawn2);
                            }
                        }
                        if (Math.random() < 0.1d) {
                            Level level4 = this.world;
                            if (level4 instanceof Level) {
                                if (!level4.isClientSide()) {
                                    ItemEntity entityToSpawn3 = new ItemEntity(level4, x, y, z, new ItemStack(LatexModItems.BROKENDLMASK.get()));
                                    entityToSpawn3.setPickUpDelay(60);
                                    level4.addFreshEntity(entityToSpawn3);
                                }
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, (int) (Math.random() * 60.0d * 20.0d));
            }
        }
    }
}
