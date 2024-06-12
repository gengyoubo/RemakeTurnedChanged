package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.CivilianEntity;
import net.ltxprogrammer.turned.entity.CivlianMilitiaEntity;
import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import net.ltxprogrammer.turned.entity.EvilSniperEntity;
import net.ltxprogrammer.turned.entity.MilitaryEntity;
import net.ltxprogrammer.turned.entity.MilitaryRiotEntity;
import net.ltxprogrammer.turned.entity.MilitaryflameunitEntity;
import net.ltxprogrammer.turned.entity.PrisionerEntity;
import net.ltxprogrammer.turned.entity.PrisionermilitiaEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/RecruitmentpaperRightclickedProcedure.class */
public class RecruitmentpaperRightclickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (entity instanceof CivilianEntity) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new CivlianMilitiaEntity((EntityType<CivlianMilitiaEntity>) LatexModEntities.CIVLIAN_MILITIA.get(), _level);
                    entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn.setYBodyRot(entity.getYRot());
                    entityToSpawn.setYHeadRot(entity.getYRot());
                    entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if ((entity instanceof Player)) {
                    ((Player) entity).getAbilities();
                }
            } else {
                if (entity instanceof CivilianEntity) {
                    if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get()) {
                        if (Math.random() < 0.5d) {
                            if (world instanceof ServerLevel _level2) {
                                Mob entityToSpawn2 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level2);
                                entityToSpawn2.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn2.setYBodyRot(entity.getYRot());
                                entityToSpawn2.setYHeadRot(entity.getYRot());
                                entityToSpawn2.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn2 instanceof Mob) {
                                    entityToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                world.addFreshEntity(entityToSpawn2);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!((entity instanceof Player) && ((Player) entity).getAbilities().instabuild) && (entity instanceof Player _player2)) {
                                ItemStack _stktoremove2 = new ItemStack(LatexModItems.RECRUITMENTPAPER.get());
                                _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
                            }
                        } else {
                            if (world instanceof ServerLevel _level3) {
                                Mob entityToSpawn3 = new CivlianMilitiaEntity((EntityType<CivlianMilitiaEntity>) LatexModEntities.CIVLIAN_MILITIA.get(), _level3);
                                entityToSpawn3.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn3.setYBodyRot(entity.getYRot());
                                entityToSpawn3.setYHeadRot(entity.getYRot());
                                entityToSpawn3.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                if (entityToSpawn3 instanceof Mob) {
                                    entityToSpawn3.finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                world.addFreshEntity(entityToSpawn3);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if (!((entity instanceof Player) && ((Player) entity).getAbilities().instabuild) && (entity instanceof Player _player3)) {
                                ItemStack _stktoremove3 = new ItemStack(LatexModItems.RECRUITMENTPAPER.get());
                                _player3.getInventory().clearOrCountMatchingItems(p -> _stktoremove3.getItem() == p.getItem(), 1, _player3.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
                if (entity instanceof ScientistEntity) {
                    if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get()) {
                        if (Math.random() < 0.5d) {
                            if (world instanceof ServerLevel _level4) {
                                Entity entityToSpawn4 = new MilitaryRiotEntity((EntityType<MilitaryRiotEntity>) LatexModEntities.MILITARY_RIOT.get(), _level4);
                                entityToSpawn4.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn4.setYBodyRot(entity.getYRot());
                                entityToSpawn4.setYHeadRot(entity.getYRot());
                                entityToSpawn4.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                world.addFreshEntity(entityToSpawn4);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if ((entity instanceof Player)) {
                                ((Player) entity).getAbilities();
                            }
                        } else if (Math.random() < 0.1d) {
                            if (world instanceof ServerLevel _level5) {
                                Entity entityToSpawn5 = new MilitaryflameunitEntity((EntityType<MilitaryflameunitEntity>) LatexModEntities.MILITARYFLAMEUNIT.get(), _level5);
                                entityToSpawn5.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn5.setYBodyRot(entity.getYRot());
                                entityToSpawn5.setYHeadRot(entity.getYRot());
                                entityToSpawn5.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                world.addFreshEntity(entityToSpawn5);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if ((entity instanceof Player)) {
                                ((Player) entity).getAbilities();
                            }
                        } else {
                            if (world instanceof ServerLevel _level6) {
                                Entity entityToSpawn6 = new MilitaryEntity((EntityType<MilitaryEntity>) LatexModEntities.MILITARY.get(), _level6);
                                entityToSpawn6.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                                entityToSpawn6.setYBodyRot(entity.getYRot());
                                entityToSpawn6.setYHeadRot(entity.getYRot());
                                entityToSpawn6.setDeltaMovement(0.0d, 0.0d, 0.0d);
                                ((Mob) entityToSpawn6).finalizeSpawn(_level6, world.getCurrentDifficultyAt(entityToSpawn6.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                                world.addFreshEntity(entityToSpawn6);
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            if ((entity instanceof Player)) {
                                ((Player) entity).getAbilities();
                            }
                        }
                    }
                }
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.EVIL_BERET_HELMET.get() || !(entity instanceof PrisionerEntity)) {
                if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.GOOD_BERET_HELMET.get() && (entity instanceof PrisionerEntity)) {
                    if (world instanceof ServerLevel _level7) {
                        Entity entityToSpawn7 = new CivilianEntity((EntityType<CivilianEntity>) LatexModEntities.CIVILIAN.get(), _level7);
                        entityToSpawn7.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn7.setYBodyRot(entity.getYRot());
                        entityToSpawn7.setYHeadRot(entity.getYRot());
                        entityToSpawn7.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        ((Mob) entityToSpawn7).finalizeSpawn(_level7, world.getCurrentDifficultyAt(entityToSpawn7.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn7);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if ((entity instanceof Player)) {
                        ((Player) entity).getAbilities();
                    }
                }
            } else {
                if (world instanceof ServerLevel _level8) {
                    Entity entityToSpawn8 = new PrisionermilitiaEntity((EntityType<PrisionermilitiaEntity>) LatexModEntities.PRISIONERMILITIA.get(), _level8);
                    entityToSpawn8.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn8.setYBodyRot(entity.getYRot());
                    entityToSpawn8.setYHeadRot(entity.getYRot());
                    entityToSpawn8.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn8).finalizeSpawn(_level8, world.getCurrentDifficultyAt(entityToSpawn8.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn8);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if ((entity instanceof Player)) {
                    ((Player) entity).getAbilities();
                }
            }
            if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.EVIL_BERET_HELMET.get() || !(entity instanceof EvilScientistEntity)) {
                if ((sourceentity instanceof LivingEntity ? ((LivingEntity) sourceentity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.EVIL_BERET_HELMET.get() && (entity instanceof CivilianEntity)) {
                    if (Math.random() < 0.5d) {
                        if (world instanceof ServerLevel _level9) {
                            Entity entityToSpawn9 = new EvilScientistEntity((EntityType<EvilScientistEntity>) LatexModEntities.EVIL_SCIENTIST.get(), _level9);
                            entityToSpawn9.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                            entityToSpawn9.setYBodyRot(entity.getYRot());
                            entityToSpawn9.setYHeadRot(entity.getYRot());
                            entityToSpawn9.setDeltaMovement(0.0d, 0.0d, 0.0d);
                            ((Mob) entityToSpawn9).finalizeSpawn(_level9, world.getCurrentDifficultyAt(entityToSpawn9.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                            world.addFreshEntity(entityToSpawn9);
                        }
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        if ((entity instanceof Player)) {
                            ((Player) entity).getAbilities();
                        }
                        return;
                    }
                    if (world instanceof ServerLevel _level10) {
                        Entity entityToSpawn10 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) LatexModEntities.EVIL_MILITARY.get(), _level10);
                        entityToSpawn10.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                        entityToSpawn10.setYBodyRot(entity.getYRot());
                        entityToSpawn10.setYHeadRot(entity.getYRot());
                        entityToSpawn10.setDeltaMovement(0.0d, 0.0d, 0.0d);
                        ((Mob) entityToSpawn10).finalizeSpawn(_level10, world.getCurrentDifficultyAt(entityToSpawn10.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                        world.addFreshEntity(entityToSpawn10);
                    }
                    if (!entity.level.isClientSide()) {
                        entity.discard();
                    }
                    if ((entity instanceof Player)) {
                        ((Player) entity).getAbilities();
                    }
                }
            } else if (Math.random() < 0.5d) {
                if (world instanceof ServerLevel _level11) {
                    Entity entityToSpawn11 = new EvilSniperEntity((EntityType<EvilSniperEntity>) LatexModEntities.EVIL_SNIPER.get(), _level11);
                    entityToSpawn11.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn11.setYBodyRot(entity.getYRot());
                    entityToSpawn11.setYHeadRot(entity.getYRot());
                    entityToSpawn11.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn11).finalizeSpawn(_level11, world.getCurrentDifficultyAt(entityToSpawn11.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn11);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if ((entity instanceof Player)) {
                    ((Player) entity).getAbilities();
                }
            } else {
                if (world instanceof ServerLevel _level12) {
                    Entity entityToSpawn12 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) LatexModEntities.EVIL_MILITARY.get(), _level12);
                    entityToSpawn12.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn12.setYBodyRot(entity.getYRot());
                    entityToSpawn12.setYHeadRot(entity.getYRot());
                    entityToSpawn12.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn12).finalizeSpawn(_level12, world.getCurrentDifficultyAt(entityToSpawn12.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn12);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if ((entity instanceof Player)) {
                    ((Player) entity).getAbilities();
                }
            }
        }
    }
}
