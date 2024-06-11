package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCakeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DlSquidDogEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
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
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCakeThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexCakeThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0c4a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        boolean z2;
        if (entity == null || sourceentity == null) {
            return false;
        }
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR)) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_HELMET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                            z2 = true;
                            if (z2) {
                                if (Math.random() < 0.75d) {
                                    if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || (entity instanceof Player)) {
                                        return true;
                                    }
                                    if (entity instanceof FlyingMob) {
                                        if (Math.random() < 0.3d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level = (Level) world;
                                                if (!_level.isClientSide()) {
                                                    _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level2 = (ServerLevel) world;
                                            Entity entityToSpawn = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level2);
                                            entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn instanceof Mob) {
                                                ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn);
                                            return false;
                                        } else if (Math.random() < 0.3d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level3 = (Level) world;
                                                if (!_level3.isClientSide()) {
                                                    _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level4 = (ServerLevel) world;
                                            Entity entityToSpawn2 = new DarkLatexMothEntity((EntityType<DarkLatexMothEntity>) ((EntityType) LatexModEntities.DARK_LATEX_MOTH.get()), (Level) _level4);
                                            entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn2 instanceof Mob) {
                                                ((Mob) entityToSpawn2).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn2);
                                            return false;
                                        } else if (Math.random() < 0.3d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level5 = (Level) world;
                                                if (!_level5.isClientSide()) {
                                                    _level5.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level6 = (ServerLevel) world;
                                            Entity entityToSpawn3 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level6);
                                            entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn3 instanceof Mob) {
                                                ((Mob) entityToSpawn3).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn3);
                                            return false;
                                        } else {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (!sourceentity.level.isClientSide()) {
                                                sourceentity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level7 = (Level) world;
                                                if (!_level7.isClientSide()) {
                                                    _level7.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level7.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level8 = (ServerLevel) world;
                                            Entity entityToSpawn4 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level8);
                                            entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn4 instanceof Mob) {
                                                ((Mob) entityToSpawn4).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn4);
                                            return false;
                                        }
                                    } else if (entity instanceof WaterAnimal) {
                                        if (Math.random() < 0.3d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level9 = (Level) world;
                                                if (!_level9.isClientSide()) {
                                                    _level9.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level9.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level10 = (ServerLevel) world;
                                            Entity entityToSpawn5 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level10);
                                            entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn5 instanceof Mob) {
                                                ((Mob) entityToSpawn5).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn5);
                                            return false;
                                        } else if (Math.random() < 0.2d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level11 = (Level) world;
                                                if (!_level11.isClientSide()) {
                                                    _level11.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level11.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level12 = (ServerLevel) world;
                                            Entity entityToSpawn6 = new DlSquidDogEntity((EntityType<DlSquidDogEntity>) ((EntityType) LatexModEntities.DL_SQUID_DOG.get()), (Level) _level12);
                                            entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn6 instanceof Mob) {
                                                ((Mob) entityToSpawn6).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn6);
                                            return false;
                                        } else {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (!sourceentity.level.isClientSide()) {
                                                sourceentity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level13 = (Level) world;
                                                if (!_level13.isClientSide()) {
                                                    _level13.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level13.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level14 = (ServerLevel) world;
                                            Entity entityToSpawn7 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level14);
                                            entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn7 instanceof Mob) {
                                                ((Mob) entityToSpawn7).finalizeSpawn(_level14, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn7);
                                            return false;
                                        }
                                    } else if (entity instanceof Fox) {
                                        if (!entity.level.isClientSide()) {
                                            entity.discard();
                                        }
                                        if (world instanceof Level) {
                                            Level _level15 = (Level) world;
                                            if (!_level15.isClientSide()) {
                                                _level15.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                            } else {
                                                _level15.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                            }
                                        }
                                        if (!(world instanceof ServerLevel)) {
                                            return false;
                                        }
                                        ServerLevel _level16 = (ServerLevel) world;
                                        Entity entityToSpawn8 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level16);
                                        entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn8 instanceof Mob) {
                                            ((Mob) entityToSpawn8).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        world.addFreshEntity(entityToSpawn8);
                                        return false;
                                    } else {
                                        if ((entity instanceof Skeleton) || (entity instanceof WitherSkeleton)) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level17 = (Level) world;
                                                if (!_level17.isClientSide()) {
                                                    _level17.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level17.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level18 = (ServerLevel) world;
                                            Entity entityToSpawn9 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level18);
                                            entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn9 instanceof Mob) {
                                                ((Mob) entityToSpawn9).finalizeSpawn(_level18, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn9);
                                            return false;
                                        } else if (entity instanceof Bee) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level19 = (Level) world;
                                                if (!_level19.isClientSide()) {
                                                    _level19.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level19.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level20 = (ServerLevel) world;
                                            Entity entityToSpawn10 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level20);
                                            entityToSpawn10.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn10 instanceof Mob) {
                                                ((Mob) entityToSpawn10).finalizeSpawn(_level20, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn10);
                                            return false;
                                        } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                                            return false;
                                        } else {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level21 = (Level) world;
                                                if (!_level21.isClientSide()) {
                                                    _level21.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level21.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level22 = (ServerLevel) world;
                                            Entity entityToSpawn11 = new DarkLatexCakeEntity((EntityType<DarkLatexCakeEntity>) ((EntityType) LatexModEntities.DARK_LATEX_CAKE.get()), (Level) _level22);
                                            entityToSpawn11.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn11 instanceof Mob) {
                                                ((Mob) entityToSpawn11).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn11);
                                            return false;
                                        }
                                    }
                                } else if (Math.random() >= 0.6d) {
                                    return false;
                                } else {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof ServerLevel) {
                                        ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 4, 3.0d, 3.0d, 3.0d, 1.0d);
                                    }
                                    if (world instanceof Level) {
                                        Level _level23 = (Level) world;
                                        if (!_level23.isClientSide()) {
                                            _level23.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                                        } else {
                                            _level23.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                                        }
                                    }
                                    if (sourceentity instanceof LivingEntity) {
                                        ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMaxHealth() : -1.0f) / 2.0f));
                                    }
                                    if (Math.random() >= 0.6d) {
                                        return false;
                                    }
                                    new AnonymousClass1(x, y, z).start(world, 240);
                                    return false;
                                }
                            } else if (entity instanceof Player) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        } else if (Math.random() >= 0.2d) {
            return false;
        } else {
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 4, 3.0d, 3.0d, 3.0d, 1.0d);
            }
            if (world instanceof Level) {
                Level _level24 = (Level) world;
                if (!_level24.isClientSide()) {
                    _level24.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                } else {
                    _level24.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                }
            }
            if (sourceentity instanceof LivingEntity) {
                ((LivingEntity) sourceentity).setHealth((float) (((double) (sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f)) + (((double) (sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMaxHealth() : -1.0f)) / 1.5d)));
            }
            if (Math.random() >= 0.3d) {
                return false;
            }
            new AnonymousClass2(x, y, z).start(world, 240);
            return false;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexCakeThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCakeThisEntityKillsAnotherOneProcedure$1.class */
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
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.BLOCKS, 1.0f, 3.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.BLOCKS, 1.0f, 3.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Blocks.CAKE));
                    entityToSpawn.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexCakeThisEntityKillsAnotherOneProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCakeThisEntityKillsAnotherOneProcedure$2.class */
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
                    _level.playSound((Player) null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dispenser.dispense")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dispenser.dispense")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Blocks.CAKE));
                    entityToSpawn.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
