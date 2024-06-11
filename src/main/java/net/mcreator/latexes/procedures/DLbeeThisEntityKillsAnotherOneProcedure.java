package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DLbeeEntity;
import net.mcreator.latexes.entity.DarklatexEntity;
import net.mcreator.latexes.entity.DlsharkEntity;
import net.mcreator.latexes.entity.HertxEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DLbeeThisEntityKillsAnotherOneProcedure.class */
public class DLbeeThisEntityKillsAnotherOneProcedure {
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
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
                        if ((entity instanceof IronGolem) || (entity instanceof Player) || (entity instanceof HertxEntity)) {
                            return true;
                        }
                        if (entity instanceof WaterAnimal) {
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
                                Entity entityToSpawn = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level2);
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
                            if (!sourceentity.level.isClientSide()) {
                                sourceentity.discard();
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
                            Entity entityToSpawn2 = new DlsharkEntity((EntityType<DlsharkEntity>) ((EntityType) LatexModEntities.DLSHARK.get()), (Level) _level4);
                            entityToSpawn2.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (entityToSpawn2 instanceof Mob) {
                                ((Mob) entityToSpawn2).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn2);
                            return false;
                        } else if (entity instanceof DarklatexEntity) {
                            return false;
                        } else {
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
