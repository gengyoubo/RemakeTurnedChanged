package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexCreeperEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexFoxScientistEntity;
import net.mcreator.latexes.entity.DarkLatexFoxSniperEntity;
import net.mcreator.latexes.entity.DarkLatexMothEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlSquidDogEntity;
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
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0d90  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d8  */
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        boolean z2;
        if (entity == null || sourceentity == null) {
            return false;
        }
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) && Math.random() < 0.75d) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_HELMET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_LEGGINGS.get()) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
                            z2 = true;
                            if (z2) {
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
                                    } else if ((entity instanceof ScientistEntity) || (entity instanceof EvilScientistEntity) || (entity instanceof EvilSniperEntity)) {
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
                                        if (Math.random() < 0.2d) {
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level22 = (ServerLevel) world;
                                            Entity entityToSpawn11 = new DarkLatexFoxSniperEntity((EntityType<DarkLatexFoxSniperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SNIPER.get()), (Level) _level22);
                                            entityToSpawn11.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn11 instanceof Mob) {
                                                ((Mob) entityToSpawn11).finalizeSpawn(_level22, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn11);
                                            return false;
                                        } else if (!(world instanceof ServerLevel)) {
                                            return false;
                                        } else {
                                            ServerLevel _level23 = (ServerLevel) world;
                                            Entity entityToSpawn12 = new DarkLatexFoxScientistEntity((EntityType<DarkLatexFoxScientistEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get()), (Level) _level23);
                                            entityToSpawn12.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn12 instanceof Mob) {
                                                ((Mob) entityToSpawn12).finalizeSpawn(_level23, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn12);
                                            return false;
                                        }
                                    } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                                        return false;
                                    } else {
                                        if (Math.random() < 0.8d) {
                                            if (!entity.level.isClientSide()) {
                                                entity.discard();
                                            }
                                            if (world instanceof Level) {
                                                Level _level24 = (Level) world;
                                                if (!_level24.isClientSide()) {
                                                    _level24.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                                } else {
                                                    _level24.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                                }
                                            }
                                            if (!(world instanceof ServerLevel)) {
                                                return false;
                                            }
                                            ServerLevel _level25 = (ServerLevel) world;
                                            Entity entityToSpawn13 = new DarkLatexCreeperEntity((EntityType<DarkLatexCreeperEntity>) ((EntityType) LatexModEntities.DARK_LATEX_CREEPER.get()), (Level) _level25);
                                            entityToSpawn13.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                            if (entityToSpawn13 instanceof Mob) {
                                                ((Mob) entityToSpawn13).finalizeSpawn(_level25, world.getCurrentDifficultyAt(entityToSpawn13.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                            }
                                            world.addFreshEntity(entityToSpawn13);
                                            return false;
                                        }
                                        if (!entity.level.isClientSide()) {
                                            entity.discard();
                                        }
                                        if (world instanceof Level) {
                                            Level _level26 = (Level) world;
                                            if (!_level26.isClientSide()) {
                                                _level26.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                            } else {
                                                _level26.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                            }
                                        }
                                        if (!(world instanceof ServerLevel)) {
                                            return false;
                                        }
                                        ServerLevel _level27 = (ServerLevel) world;
                                        Entity entityToSpawn14 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level27);
                                        entityToSpawn14.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (entityToSpawn14 instanceof Mob) {
                                            ((Mob) entityToSpawn14).finalizeSpawn(_level27, world.getCurrentDifficultyAt(entityToSpawn14.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                        }
                                        world.addFreshEntity(entityToSpawn14);
                                        return false;
                                    }
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
        } else if (Math.random() >= 0.1d) {
            return false;
        } else {
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.HEART, x, y, z, 4, 2.0d, 2.0d, 2.0d, 1.0d);
            }
            if (world instanceof Level) {
                Level _level28 = (Level) world;
                if (!_level28.isClientSide()) {
                    _level28.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f);
                } else {
                    _level28.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 2.0f, false);
                }
            }
            if (sourceentity instanceof LivingEntity) {
                ((LivingEntity) sourceentity).setHealth((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getHealth() : -1.0f) + ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getMaxHealth() : -1.0f) / 6.0f));
            }
            if (Math.random() >= 0.75d) {
                return false;
            }
            new AnonymousClass1(x, y, z).start(world, 240);
            return false;
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure$1.class */
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
                    ItemEntity entityToSpawn = new ItemEntity(_level2, this.val$x, this.val$y, this.val$z, new ItemStack(Items.GUNPOWDER));
                    entityToSpawn.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn);
                }
            }
            if (Math.random() < 0.25d) {
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level3, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                        entityToSpawn2.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn2);
                    }
                }
                if (Math.random() < 0.25d) {
                    Level level4 = this.world;
                    if (level4 instanceof Level) {
                        Level _level4 = level4;
                        if (!_level4.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level4, this.val$x, this.val$y, this.val$z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                            entityToSpawn3.setPickUpDelay(10);
                            _level4.addFreshEntity(entityToSpawn3);
                        }
                    }
                }
            }
            if (Math.random() < 0.25d) {
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level5, this.val$x, this.val$y, this.val$z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn4.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn4);
                    }
                }
                if (Math.random() < 0.25d) {
                    Level level6 = this.world;
                    if (level6 instanceof Level) {
                        Level _level6 = level6;
                        if (!_level6.isClientSide()) {
                            ItemEntity entityToSpawn5 = new ItemEntity(_level6, this.val$x, this.val$y, this.val$z, new ItemStack(Items.GUNPOWDER));
                            entityToSpawn5.setPickUpDelay(10);
                            _level6.addFreshEntity(entityToSpawn5);
                        }
                    }
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
