package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarkLatexFoxEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
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
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexSkeletonThisEntityKillsAnotherOneProcedure.class */
public class DarkLatexSkeletonThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1  */
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
                        if (!z2) {
                            return false;
                        }
                        if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || (entity instanceof Player)) {
                            return true;
                        }
                        if (entity instanceof FlyingMob) {
                            if (Math.random() < 0.3d) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (!sourceentity.level.isClientSide()) {
                                    sourceentity.discard();
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
                            }
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
                            Entity entityToSpawn2 = new DLbeeEntity((EntityType<DLbeeEntity>) ((EntityType) LatexModEntities.D_LBEE.get()), (Level) _level4);
                            entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn2 instanceof Mob) {
                                ((Mob) entityToSpawn2).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn2);
                            return false;
                        } else if (entity instanceof WaterAnimal) {
                            if (Math.random() < 0.3d) {
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
                                Entity entityToSpawn3 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level6);
                                entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn3 instanceof Mob) {
                                    ((Mob) entityToSpawn3).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn3);
                                return false;
                            }
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
                            Entity entityToSpawn4 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level8);
                            entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn4 instanceof Mob) {
                                ((Mob) entityToSpawn4).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn4);
                            return false;
                        } else if (entity instanceof Fox) {
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
                            Entity entityToSpawn5 = new DarkLatexFoxEntity((EntityType<DarkLatexFoxEntity>) ((EntityType) LatexModEntities.DARK_LATEX_FOX.get()), (Level) _level10);
                            entityToSpawn5.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn5 instanceof Mob) {
                                ((Mob) entityToSpawn5).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn5);
                            return false;
                        } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:skeletons")))) {
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
                            if (Math.random() < 0.25d) {
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level12 = (ServerLevel) world;
                                Entity entityToSpawn6 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level12);
                                entityToSpawn6.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn6 instanceof Mob) {
                                    ((Mob) entityToSpawn6).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn6);
                                return false;
                            } else if (!(world instanceof ServerLevel)) {
                                return false;
                            } else {
                                ServerLevel _level13 = (ServerLevel) world;
                                Entity entityToSpawn7 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level13);
                                entityToSpawn7.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn7 instanceof Mob) {
                                    ((Mob) entityToSpawn7).finalizeSpawn(_level13, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn7);
                                return false;
                            }
                        } else if (entity instanceof DarklatexEntity) {
                            return false;
                        } else {
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
                            if (Math.random() < 0.25d) {
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level15 = (ServerLevel) world;
                                Entity entityToSpawn8 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level15);
                                entityToSpawn8.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn8 instanceof Mob) {
                                    ((Mob) entityToSpawn8).finalizeSpawn(_level15, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn8);
                                return false;
                            } else if (Math.random() < 0.01d) {
                                if (!sourceentity.level.isClientSide()) {
                                    sourceentity.discard();
                                }
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level16 = (ServerLevel) world;
                                Entity entityToSpawn9 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level16);
                                entityToSpawn9.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn9 instanceof Mob) {
                                    ((Mob) entityToSpawn9).finalizeSpawn(_level16, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn9);
                                return false;
                            } else if (!(world instanceof ServerLevel)) {
                                return false;
                            } else {
                                ServerLevel _level17 = (ServerLevel) world;
                                Entity entityToSpawn10 = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level17);
                                entityToSpawn10.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn10 instanceof Mob) {
                                    ((Mob) entityToSpawn10).finalizeSpawn(_level17, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn10);
                                return false;
                            }
                        }
                    }
                }
            }
        }
        z2 = false;
        if (!z2) {
        }
    }
}
