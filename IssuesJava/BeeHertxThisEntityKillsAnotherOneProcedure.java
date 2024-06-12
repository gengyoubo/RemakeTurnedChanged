//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.entity.beast.DarkLatexYufeng;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedSounds;
import net.ltxprogrammer.turned.entity.DarkLatexSkeletonEntity;
import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import net.ltxprogrammer.turned.entity.EvilSniperEntity;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class BeeHertxThisEntityKillsAnotherOneProcedure {
    public BeeHertxThisEntityKillsAnotherOneProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity != null) {
            Level _level;
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:darklatexes")))) {
                if (Math.random() < 0.3) {
                    if (world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F);
                        } else {
                            _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                        }
                    }

                    if (!entity.level.isClientSide()) {
                        entity.discard();
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
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                                }
                            }

                            var2 = this.world;
                            ItemEntity entityToSpawn;
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
                                    entityToSpawn.setPickUpDelay(60);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }

                            var2 = this.world;
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                    entityToSpawn.setPickUpDelay(60);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }

                            if (Math.random() < 0.1) {
                                var2 = this.world;
                                if (var2 instanceof Level) {
                                    _level = (Level)var2;
                                    if (!_level.isClientSide()) {
                                        entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
                                        entityToSpawn.setPickUpDelay(60);
                                        _level.addFreshEntity(entityToSpawn);
                                    }
                                }
                            }

                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    })).start(world, (int)(Math.random() * 60.0 * 20.0));
                }
            } else if (!(entity instanceof DarkLatexYufeng) && !(entity instanceof DarkLatexSkeletonEntity)) {
                if ((entity instanceof Animal || entity instanceof Vindicator || entity instanceof EvilMilitaryEntity || entity instanceof EvilSniperEntity || entity instanceof EvilScientistEntity || entity instanceof Monster || entity instanceof Vindicator || entity instanceof Pillager || entity instanceof Witch || entity instanceof Illusioner || entity instanceof Evoker) && Math.random() < 0.2) {
                    if (world instanceof Level) {
                        _level = (Level)world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F);
                        } else {
                            _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                        }
                    }

                    if (!entity.level.isClientSide()) {
                        entity.discard();
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
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                                } else {
                                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                                }
                            }

                            var2 = this.world;
                            if (var2 instanceof Level _level) {
                                if (!_level.isClientSide()) {
                                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                    entityToSpawn.setPickUpDelay(60);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }

                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    })).start(world, (int)(Math.random() * 50.0 * 20.0));
                }
            } else if (Math.random() < 0.2) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F);
                    } else {
                        _level.playLocalSound(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                    }
                }

                if (!entity.level.isClientSide()) {
                    entity.discard();
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
                        if (var2 instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F);
                            } else {
                                _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_burp")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
                            }
                        }

                        var2 = this.world;
                        ItemEntity entityToSpawn;
                        if (var2 instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE));
                                entityToSpawn.setPickUpDelay(60);
                                _level.addFreshEntity(entityToSpawn);
                            }
                        }

                        var2 = this.world;
                        if (var2 instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
                                entityToSpawn.setPickUpDelay(60);
                                _level.addFreshEntity(entityToSpawn);
                            }
                        }

                        var2 = this.world;
                        if (var2 instanceof Level _level) {
                            if (!_level.isClientSide()) {
                                entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                entityToSpawn.setPickUpDelay(60);
                                _level.addFreshEntity(entityToSpawn);
                            }
                        }

                        if (Math.random() < 0.1) {
                            var2 = this.world;
                            if (var2 instanceof Level) {
                                _level = (Level)var2;
                                if (!_level.isClientSide()) {
                                    entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BROKENDLMASK.get()));
                                    entityToSpawn.setPickUpDelay(60);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }

                            var2 = this.world;
                            if (var2 instanceof Level) {
                                _level = (Level)var2;
                                if (!_level.isClientSide()) {
                                    entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));
                                    entityToSpawn.setPickUpDelay(60);
                                    _level.addFreshEntity(entityToSpawn);
                                }
                            }
                        }

                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                })).start(world, (int)(Math.random() * 60.0 * 20.0));
            }

        }
    }
}
