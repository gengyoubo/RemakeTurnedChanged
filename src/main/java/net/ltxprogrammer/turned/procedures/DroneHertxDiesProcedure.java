package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DroneHertxDiesProcedure.class */
public class DroneHertxDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() >= 0.05d) {
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
                    entityToSpawn.setPickUpDelay(20);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            if (Math.random() < 0.3d) {
                if (world instanceof Level) {
                    Level _level2 = (Level) world;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn2.setPickUpDelay(20);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                if (Math.random() < 0.2d) {
                    if (world instanceof Level) {
                        Level _level3 = (Level) world;
                        if (!_level3.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.IRON_NUGGET));
                            entityToSpawn3.setPickUpDelay(20);
                            _level3.addFreshEntity(entityToSpawn3);
                        }
                    }
                    if (Math.random() < 0.3d) {
                        if (world instanceof Level) {
                            Level _level4 = (Level) world;
                            if (!_level4.isClientSide()) {
                                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn4.setPickUpDelay(20);
                                _level4.addFreshEntity(entityToSpawn4);
                            }
                        }
                        if (world instanceof Level) {
                            Level _level5 = (Level) world;
                            if (!_level5.isClientSide()) {
                                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.IRON_NUGGET));
                                entityToSpawn5.setPickUpDelay(20);
                                _level5.addFreshEntity(entityToSpawn5);
                            }
                        }
                        if (Math.random() < 0.2d && (world instanceof Level)) {
                            Level _level6 = (Level) world;
                            if (!_level6.isClientSide()) {
                                ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn6.setPickUpDelay(20);
                                _level6.addFreshEntity(entityToSpawn6);
                            }
                        }
                    }
                }
            }
            if (Math.random() < 0.2d) {
                if (world instanceof Level) {
                    Level _level7 = (Level) world;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn7.setPickUpDelay(20);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                if (world instanceof Level) {
                    Level _level8 = (Level) world;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack(Items.REDSTONE));
                        entityToSpawn8.setPickUpDelay(20);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                if (Math.random() < 0.2d && (world instanceof Level)) {
                    Level _level9 = (Level) world;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y, z, new ItemStack(Items.REDSTONE));
                        entityToSpawn9.setPickUpDelay(20);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                if (Math.random() < 0.05d) {
                    if (world instanceof Level) {
                        Level _level10 = (Level) world;
                        if (!_level10.isClientSide()) {
                            ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get()));
                            entityToSpawn10.setPickUpDelay(20);
                            _level10.addFreshEntity(entityToSpawn10);
                        }
                    }
                    if (Math.random() < 0.35d) {
                        if (world instanceof Level) {
                            Level _level11 = (Level) world;
                            if (!_level11.isClientSide()) {
                                ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
                                entityToSpawn11.setPickUpDelay(20);
                                _level11.addFreshEntity(entityToSpawn11);
                            }
                        }
                        if (Math.random() < 0.4d && (world instanceof Level)) {
                            Level _level12 = (Level) world;
                            if (!_level12.isClientSide()) {
                                ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXENGINEER_LEGGINGS.get()));
                                entityToSpawn12.setPickUpDelay(20);
                                _level12.addFreshEntity(entityToSpawn12);
                            }
                        }
                    }
                }
            }
        } else if (world instanceof Level) {
            Level _level13 = (Level) world;
            if (!_level13.isClientSide()) {
                _level13.explode((Entity) null, x, y, z, 3.0f, Explosion.BlockInteraction.BREAK);
            }
        }
    }
}
