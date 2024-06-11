package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.FlyingMob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexSnakeThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexSnakeThisEntityKillsAnotherOneProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        boolean z2;
        if (entity == null || sourceentity == null || !world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_HELMET.get()) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                        z2 = true;
                        if (z2 && !(entity instanceof Player)) {
                            if (Math.random() >= 0.6d) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (world instanceof Level) {
                                    Level _level = (Level) world;
                                    if (!_level.isClientSide()) {
                                        _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                                    } else {
                                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                                    }
                                }
                                new AnonymousClass1(x, y, z).start(world, 250);
                                return false;
                            } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots")))) {
                                return true;
                            } else {
                                if (entity instanceof FlyingMob) {
                                    if (Math.random() < 0.3d) {
                                        if (!entity.level.isClientSide()) {
                                            entity.discard();
                                        }
                                        if (world instanceof Level) {
                                            Level _level2 = (Level) world;
                                            if (!_level2.isClientSide()) {
                                                _level2.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                            } else {
                                                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                            }
                                        }
                                        if (!(world instanceof ServerLevel)) {
                                            return false;
                                        }
                                        ServerLevel _level3 = (ServerLevel) world;
                                        Entity entityToSpawn = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level3);
                                        entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn instanceof Mob) {
                                            ((Mob) entityToSpawn).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        world.addFreshEntity(entityToSpawn);
                                        return false;
                                    }
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (!sourceentity.level.isClientSide()) {
                                        sourceentity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level4 = (Level) world;
                                        if (!_level4.isClientSide()) {
                                            _level4.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level5 = (ServerLevel) world;
                                    Entity entityToSpawn2 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level5);
                                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn2 instanceof Mob) {
                                        ((Mob) entityToSpawn2).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn2);
                                    return false;
                                } else if (entity instanceof WaterAnimal) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level6 = (Level) world;
                                        if (!_level6.isClientSide()) {
                                            _level6.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level7 = (ServerLevel) world;
                                    Entity entityToSpawn3 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level7);
                                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn3 instanceof Mob) {
                                        ((Mob) entityToSpawn3).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn3);
                                    return false;
                                } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:skeletons")))) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level8 = (Level) world;
                                        if (!_level8.isClientSide()) {
                                            _level8.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level8.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (Math.random() >= 0.25d || !(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level9 = (ServerLevel) world;
                                    Entity entityToSpawn4 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level9);
                                    entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn4 instanceof Mob) {
                                        ((Mob) entityToSpawn4).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn4);
                                    return false;
                                } else if (entity instanceof Fox) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level10 = (Level) world;
                                        if (!_level10.isClientSide()) {
                                            _level10.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level10.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level11 = (ServerLevel) world;
                                    Entity entityToSpawn5 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level11);
                                    entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn5 instanceof Mob) {
                                        ((Mob) entityToSpawn5).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn5);
                                    return false;
                                } else if (entity instanceof Bee) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level12 = (Level) world;
                                        if (!_level12.isClientSide()) {
                                            _level12.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level12.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level13 = (ServerLevel) world;
                                    Entity entityToSpawn6 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level13);
                                    entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn6 instanceof Mob) {
                                        ((Mob) entityToSpawn6).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn6);
                                    return false;
                                } else if (!(entity instanceof DarklatexEntity)) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level14 = (Level) world;
                                        if (!_level14.isClientSide()) {
                                            _level14.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level14.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level15 = (ServerLevel) world;
                                    Entity entityToSpawn7 = new DarkLatexSnakeEntity((EntityType<DarkLatexSnakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SNAKE.get()), (Level) _level15);
                                    entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn7 instanceof Mob) {
                                        ((Mob) entityToSpawn7).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn7);
                                    return false;
                                } else {
                                    if (!((entity instanceof EvilSniperEntity) || (entity instanceof ScientistEntity) || (entity instanceof EvilScientistEntity))) {
                                        return false;
                                    }
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level16 = (Level) world;
                                        if (!_level16.isClientSide()) {
                                            _level16.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level16.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (Math.random() < 0.3d) {
                                        if (!(world instanceof ServerLevel)) {
                                            return false;
                                        }
                                        ServerLevel _level17 = (ServerLevel) world;
                                        Entity entityToSpawn8 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level17);
                                        entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn8 instanceof Mob) {
                                            ((Mob) entityToSpawn8).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        world.addFreshEntity(entityToSpawn8);
                                        return false;
                                    } else if (!(world instanceof ServerLevel)) {
                                        return false;
                                    } else {
                                        ServerLevel _level18 = (ServerLevel) world;
                                        Entity entityToSpawn9 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level18);
                                        entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn9 instanceof Mob) {
                                            ((Mob) entityToSpawn9).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        world.addFreshEntity(entityToSpawn9);
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        z2 = false;
        return z2 ? false : false;
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexSnakeThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexSnakeThisEntityKillsAnotherOneProcedure$1.class */
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
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:burp")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack(Items.BONE));
                    entityToSpawn2.setPickUpDelay(10);
                    _level3.addFreshEntity(entityToSpawn2);
                }
            }
            if (Math.random() < 0.2d) {
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack(Blocks.SKELETON_SKULL));
                        entityToSpawn3.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn3);
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
