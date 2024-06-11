package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarkLatexDragonEntity;
import net.mcreator.latexes.entity.DarkLatexSkeletonEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/YufengThisEntityKillsAnotherOneProcedure.class */
public class YufengThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ce  */
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
                        if (z2) {
                            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("minecraft:skeletons")))) {
                                if (!entity.level.isClientSide()) {
                                    entity.discard();
                                }
                                if (Math.random() < 0.3d) {
                                    if (!sourceentity.level.isClientSide()) {
                                        sourceentity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level = (Level) world;
                                        if (!_level.isClientSide()) {
                                            _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                        } else {
                                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level2 = (ServerLevel) world;
                                    Entity entityToSpawn = new DarkLatexSkeletonEntity((EntityType<DarkLatexSkeletonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_SKELETON.get()), (Level) _level2);
                                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn instanceof Mob) {
                                        ((Mob) entityToSpawn).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn);
                                    return false;
                                } else if (Math.random() < 0.02d) {
                                    if (!sourceentity.level.isClientSide()) {
                                        sourceentity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level3 = (Level) world;
                                        if (!_level3.isClientSide()) {
                                            _level3.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                        } else {
                                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level4 = (ServerLevel) world;
                                    Entity entityToSpawn2 = new DarkLatexDragonEntity((EntityType<DarkLatexDragonEntity>) ((EntityType) LatexModEntities.DARK_LATEX_DRAGON.get()), (Level) _level4);
                                    entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn2 instanceof Mob) {
                                        ((Mob) entityToSpawn2).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn2);
                                    return false;
                                } else {
                                    if (world instanceof Level) {
                                        Level _level5 = (Level) world;
                                        if (!_level5.isClientSide()) {
                                            _level5.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                        } else {
                                            _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                        }
                                    }
                                    if (!(sourceentity instanceof LivingEntity)) {
                                        return false;
                                    }
                                    ((LivingEntity) sourceentity).setHealth(entity instanceof LivingEntity ? ((LivingEntity) entity).getMaxHealth() : -1.0f);
                                    return false;
                                }
                            } else {
                                if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots")))) {
                                    return false;
                                }
                                if (Math.random() < 0.4d) {
                                    if (!entity.level.isClientSide()) {
                                        entity.discard();
                                    }
                                    if (world instanceof Level) {
                                        Level _level6 = (Level) world;
                                        if (!_level6.isClientSide()) {
                                            _level6.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f);
                                        } else {
                                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 2.0f, 2.0f, false);
                                        }
                                    }
                                    if (!(world instanceof ServerLevel)) {
                                        return false;
                                    }
                                    ServerLevel _level7 = (ServerLevel) world;
                                    Entity entityToSpawn3 = new DarklatexEntity((EntityType<DarklatexEntity>) ((EntityType) LatexModEntities.DARKLATEX.get()), (Level) _level7);
                                    entityToSpawn3.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (entityToSpawn3 instanceof Mob) {
                                        ((Mob) entityToSpawn3).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                    }
                                    world.addFreshEntity(entityToSpawn3);
                                    return false;
                                }
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
                                if (!(world instanceof ServerLevel)) {
                                    return false;
                                }
                                ServerLevel _level9 = (ServerLevel) world;
                                Entity entityToSpawn4 = new YufengEntity((EntityType<YufengEntity>) ((EntityType) LatexModEntities.YUFENG.get()), (Level) _level9);
                                entityToSpawn4.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (entityToSpawn4 instanceof Mob) {
                                    ((Mob) entityToSpawn4).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn4);
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
    }
}
