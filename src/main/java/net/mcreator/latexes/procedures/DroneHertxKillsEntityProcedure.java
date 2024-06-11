package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModItems;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DroneHertxKillsEntityProcedure.class */
public class DroneHertxKillsEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                if (Math.random() < 0.3d) {
                    if (world instanceof Level) {
                        Level _level = (Level) world;
                        if (!_level.isClientSide()) {
                            _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    new AnonymousClass1(x, y, z).start(world, (int) (Math.random() * 60.0d * 20.0d));
                }
            } else if ((entity instanceof YufengEntity) || (entity instanceof DarkLatexSkeletonEntity)) {
                if (Math.random() < 0.2d) {
                    if (world instanceof Level) {
                        Level _level2 = (Level) world;
                        if (!_level2.isClientSide()) {
                            _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    new AnonymousClass2(x, y, z).start(world, (int) (Math.random() * 60.0d * 20.0d));
                }
            } else if (Math.random() < 0.1d) {
                if (world instanceof Level) {
                    Level _level3 = (Level) world;
                    if (!_level3.isClientSide()) {
                        _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                    }
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                new AnonymousClass3(x, y, z).start(world, (int) (Math.random() * 60.0d * 20.0d));
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DroneHertxKillsEntityProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DroneHertxKillsEntityProcedure$1.class */
    class AnonymousClass1 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass1(double d, double d2, double d3) {
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn.setPickUpDelay(60);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            if (Math.random() < 0.1d) {
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.BROKENDLMASK.get()));
                        entityToSpawn2.setPickUpDelay(60);
                        _level3.addFreshEntity(entityToSpawn2);
                    }
                }
            }
            if (Math.random() < 0.1d) {
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn3.setPickUpDelay(60);
                        _level4.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level5, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn4.setPickUpDelay(60);
                        _level5.addFreshEntity(entityToSpawn4);
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DroneHertxKillsEntityProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DroneHertxKillsEntityProcedure$2.class */
    class AnonymousClass2 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass2(double d, double d2, double d3) {
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.BONE));
                    entityToSpawn.setPickUpDelay(60);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn2.setPickUpDelay(60);
                    _level3.addFreshEntity(entityToSpawn2);
                }
            }
            if (Math.random() < 0.1d) {
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.BROKENDLMASK.get()));
                        entityToSpawn3.setPickUpDelay(60);
                        _level4.addFreshEntity(entityToSpawn3);
                    }
                }
            }
            if (Math.random() < 0.1d) {
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level5, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn4.setPickUpDelay(60);
                        _level5.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level6, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn5.setPickUpDelay(60);
                        _level6.addFreshEntity(entityToSpawn5);
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DroneHertxKillsEntityProcedure$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DroneHertxKillsEntityProcedure$3.class */
    class AnonymousClass3 {
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;
        final /* synthetic */ double val$x;
        final /* synthetic */ double val$y;
        final /* synthetic */ double val$z;

        AnonymousClass3(double d, double d2, double d3) {
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_burp")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                    entityToSpawn.setPickUpDelay(60);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_INGOT));
                    entityToSpawn2.setPickUpDelay(60);
                    _level3.addFreshEntity(entityToSpawn2);
                }
            }
            if (Math.random() < 0.3d) {
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack(Items.REDSTONE));
                        entityToSpawn3.setPickUpDelay(60);
                        _level4.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level5, this.val$x, this.val$y, this.val$z, new ItemStack(Items.REDSTONE));
                        entityToSpawn4.setPickUpDelay(60);
                        _level5.addFreshEntity(entityToSpawn4);
                    }
                }
            }
            if (Math.random() < 0.2d) {
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level6, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn5.setPickUpDelay(60);
                        _level6.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level7 = level7;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level7, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn6.setPickUpDelay(60);
                        _level7.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level8 = level8;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level8, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn7.setPickUpDelay(60);
                        _level8.addFreshEntity(entityToSpawn7);
                    }
                }
                if (Math.random() < 0.4d) {
                    Level level9 = this.world;
                    if (level9 instanceof Level) {
                        Level _level9 = level9;
                        if (!_level9.isClientSide()) {
                            ItemEntity entityToSpawn8 = new ItemEntity(_level9, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                            entityToSpawn8.setPickUpDelay(60);
                            _level9.addFreshEntity(entityToSpawn8);
                        }
                    }
                    Level level10 = this.world;
                    if (level10 instanceof Level) {
                        Level _level10 = level10;
                        if (!_level10.isClientSide()) {
                            ItemEntity entityToSpawn9 = new ItemEntity(_level10, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_NUGGET));
                            entityToSpawn9.setPickUpDelay(60);
                            _level10.addFreshEntity(entityToSpawn9);
                        }
                    }
                    if (Math.random() < 0.2d) {
                        Level level11 = this.world;
                        if (level11 instanceof Level) {
                            Level _level11 = level11;
                            if (!_level11.isClientSide()) {
                                ItemEntity entityToSpawn10 = new ItemEntity(_level11, this.val$x, this.val$y, this.val$z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn10.setPickUpDelay(60);
                                _level11.addFreshEntity(entityToSpawn10);
                            }
                        }
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
