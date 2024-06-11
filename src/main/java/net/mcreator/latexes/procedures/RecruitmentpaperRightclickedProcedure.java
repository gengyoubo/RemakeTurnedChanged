package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.CivilianEntity;
import net.mcreator.latexes.entity.CivlianMilitiaEntity;
import net.mcreator.latexes.entity.EvilMilitaryEntity;
import net.mcreator.latexes.entity.EvilScientistEntity;
import net.mcreator.latexes.entity.EvilSniperEntity;
import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.MilitaryRiotEntity;
import net.mcreator.latexes.entity.MilitaryflameunitEntity;
import net.mcreator.latexes.entity.PrisionerEntity;
import net.mcreator.latexes.entity.PrisionermilitiaEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/RecruitmentpaperRightclickedProcedure.class */
public class RecruitmentpaperRightclickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (entity instanceof CivilianEntity) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    Entity entityToSpawn = new CivlianMilitiaEntity((EntityType<CivlianMilitiaEntity>) ((EntityType) LatexModEntities.CIVLIAN_MILITIA.get()), (Level) _level);
                    entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn.setYBodyRot(entity.getYRot());
                    entityToSpawn.setYHeadRot(entity.getYRot());
                    entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    if (entityToSpawn instanceof Mob) {
                        ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
            } else {
                if (entity instanceof CivilianEntity) {
                    if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get()) {
                        if (Math.random() < 0.5d) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level2 = (ServerLevel) world;
                                Entity entityToSpawn2 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level2);
                                entityToSpawn2.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn2.setYBodyRot(entity.getYRot());
                                entityToSpawn2.setYHeadRot(entity.getYRot());
                                entityToSpawn2.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn2 instanceof Mob) {
                                    ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn2);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                                Player _player2 = (Player) entity;
                                ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                                _player2.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove2.getItem() == p.getItem();
                                }, 1, _player2.inventoryMenu.getCraftSlots());
                            }
                        } else {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level3 = (ServerLevel) world;
                                Entity entityToSpawn3 = new CivlianMilitiaEntity((EntityType<CivlianMilitiaEntity>) ((EntityType) LatexModEntities.CIVLIAN_MILITIA.get()), (Level) _level3);
                                entityToSpawn3.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn3.setYBodyRot(entity.getYRot());
                                entityToSpawn3.setYHeadRot(entity.getYRot());
                                entityToSpawn3.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn3 instanceof Mob) {
                                    ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn3);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                                Player _player3 = (Player) entity;
                                ItemStack _stktoremove3 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                                _player3.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove3.getItem() == p.getItem();
                                }, 1, _player3.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
                if (entity instanceof ScientistEntity) {
                    if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get()) {
                        if (Math.random() < 0.5d) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level4 = (ServerLevel) world;
                                Entity entityToSpawn4 = new MilitaryRiotEntity((EntityType<MilitaryRiotEntity>) ((EntityType) LatexModEntities.MILITARY_RIOT.get()), (Level) _level4);
                                entityToSpawn4.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn4.setYBodyRot(entity.getYRot());
                                entityToSpawn4.setYHeadRot(entity.getYRot());
                                entityToSpawn4.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn4 instanceof Mob) {
                                    ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn4);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                                Player _player4 = (Player) entity;
                                ItemStack _stktoremove4 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                                _player4.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove4.getItem() == p.getItem();
                                }, 1, _player4.inventoryMenu.getCraftSlots());
                            }
                        } else if (Math.random() < 0.1d) {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level5 = (ServerLevel) world;
                                Entity entityToSpawn5 = new MilitaryflameunitEntity((EntityType<MilitaryflameunitEntity>) ((EntityType) LatexModEntities.MILITARYFLAMEUNIT.get()), (Level) _level5);
                                entityToSpawn5.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn5.setYBodyRot(entity.getYRot());
                                entityToSpawn5.setYHeadRot(entity.getYRot());
                                entityToSpawn5.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn5 instanceof Mob) {
                                    ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn5);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                                Player _player5 = (Player) entity;
                                ItemStack _stktoremove5 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                                _player5.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove5.getItem() == p.getItem();
                                }, 1, _player5.inventoryMenu.getCraftSlots());
                            }
                        } else {
                            if (world instanceof ServerLevel) {
                                ServerLevel _level6 = (ServerLevel) world;
                                Entity entityToSpawn6 = new MilitaryEntity((EntityType<MilitaryEntity>) ((EntityType) LatexModEntities.MILITARY.get()), (Level) _level6);
                                entityToSpawn6.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn6.setYBodyRot(entity.getYRot());
                                entityToSpawn6.setYHeadRot(entity.getYRot());
                                entityToSpawn6.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn6 instanceof Mob) {
                                    ((Mob) entityToSpawn6).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                }
                                world.addFreshEntity(entityToSpawn6);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                                Player _player6 = (Player) entity;
                                ItemStack _stktoremove6 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                                _player6.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove6.getItem() == p.getItem();
                                }, 1, _player6.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.EVIL_BERET_HELMET.get() || !(entity instanceof PrisionerEntity)) {
                if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get() && (entity instanceof PrisionerEntity)) {
                    if (world instanceof ServerLevel) {
                        ServerLevel _level7 = (ServerLevel) world;
                        Entity entityToSpawn7 = new CivilianEntity((EntityType<CivilianEntity>) ((EntityType) LatexModEntities.CIVILIAN.get()), (Level) _level7);
                        entityToSpawn7.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn7.setYBodyRot(entity.getYRot());
                        entityToSpawn7.setYHeadRot(entity.getYRot());
                        entityToSpawn7.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn7 instanceof Mob) {
                            ((Mob) entityToSpawn7).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn7);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                        Player _player7 = (Player) entity;
                        ItemStack _stktoremove7 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                        _player7.getInventory().clearOrCountMatchingItems(p -> {
                            return _stktoremove7.getItem() == p.getItem();
                        }, 1, _player7.inventoryMenu.getCraftSlots());
                    }
                }
            } else {
                if (world instanceof ServerLevel) {
                    ServerLevel _level8 = (ServerLevel) world;
                    Entity entityToSpawn8 = new PrisionermilitiaEntity((EntityType<PrisionermilitiaEntity>) ((EntityType) LatexModEntities.PRISIONERMILITIA.get()), (Level) _level8);
                    entityToSpawn8.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn8.setYBodyRot(entity.getYRot());
                    entityToSpawn8.setYHeadRot(entity.getYRot());
                    entityToSpawn8.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    if (entityToSpawn8 instanceof Mob) {
                        ((Mob) entityToSpawn8).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn8);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                    Player _player8 = (Player) entity;
                    ItemStack _stktoremove8 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                    _player8.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove8.getItem() == p.getItem();
                    }, 1, _player8.inventoryMenu.getCraftSlots());
                }
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.EVIL_BERET_HELMET.get() || !(entity instanceof EvilScientistEntity)) {
                if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.EVIL_BERET_HELMET.get() && (entity instanceof CivilianEntity)) {
                    if (Math.random() < 0.5d) {
                        if (world instanceof ServerLevel) {
                            ServerLevel _level9 = (ServerLevel) world;
                            Entity entityToSpawn9 = new EvilScientistEntity((EntityType<EvilScientistEntity>) ((EntityType) LatexModEntities.EVIL_SCIENTIST.get()), (Level) _level9);
                            entityToSpawn9.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                            entityToSpawn9.setYBodyRot(entity.getYRot());
                            entityToSpawn9.setYHeadRot(entity.getYRot());
                            entityToSpawn9.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            if (entityToSpawn9 instanceof Mob) {
                                ((Mob) entityToSpawn9).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            }
                            world.addFreshEntity(entityToSpawn9);
                        }
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                            Player _player9 = (Player) entity;
                            ItemStack _stktoremove9 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                            _player9.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove9.getItem() == p.getItem();
                            }, 1, _player9.inventoryMenu.getCraftSlots());
                            return;
                        }
                        return;
                    }
                    if (world instanceof ServerLevel) {
                        ServerLevel _level10 = (ServerLevel) world;
                        Entity entityToSpawn10 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) ((EntityType) LatexModEntities.EVIL_MILITARY.get()), (Level) _level10);
                        entityToSpawn10.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn10.setYBodyRot(entity.getYRot());
                        entityToSpawn10.setYHeadRot(entity.getYRot());
                        entityToSpawn10.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        if (entityToSpawn10 instanceof Mob) {
                            ((Mob) entityToSpawn10).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        }
                        world.addFreshEntity(entityToSpawn10);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                        Player _player10 = (Player) entity;
                        ItemStack _stktoremove10 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                        _player10.getInventory().clearOrCountMatchingItems(p -> {
                            return _stktoremove10.getItem() == p.getItem();
                        }, 1, _player10.inventoryMenu.getCraftSlots());
                    }
                }
            } else if (Math.random() < 0.5d) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level11 = (ServerLevel) world;
                    Entity entityToSpawn11 = new EvilSniperEntity((EntityType<EvilSniperEntity>) ((EntityType) LatexModEntities.EVIL_SNIPER.get()), (Level) _level11);
                    entityToSpawn11.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn11.setYBodyRot(entity.getYRot());
                    entityToSpawn11.setYHeadRot(entity.getYRot());
                    entityToSpawn11.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    if (entityToSpawn11 instanceof Mob) {
                        ((Mob) entityToSpawn11).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn11);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                    Player _player11 = (Player) entity;
                    ItemStack _stktoremove11 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                    _player11.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove11.getItem() == p.getItem();
                    }, 1, _player11.inventoryMenu.getCraftSlots());
                }
            } else {
                if (world instanceof ServerLevel) {
                    ServerLevel _level12 = (ServerLevel) world;
                    Entity entityToSpawn12 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) ((EntityType) LatexModEntities.EVIL_MILITARY.get()), (Level) _level12);
                    entityToSpawn12.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn12.setYBodyRot(entity.getYRot());
                    entityToSpawn12.setYHeadRot(entity.getYRot());
                    entityToSpawn12.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    if (entityToSpawn12 instanceof Mob) {
                        ((Mob) entityToSpawn12).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    }
                    world.addFreshEntity(entityToSpawn12);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false) && (entity instanceof Player)) {
                    Player _player12 = (Player) entity;
                    ItemStack _stktoremove12 = new ItemStack((ItemLike) LatexModItems.RECRUITMENTPAPER.get());
                    _player12.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove12.getItem() == p.getItem();
                    }, 1, _player12.inventoryMenu.getCraftSlots());
                }
            }
        }
    }
}
