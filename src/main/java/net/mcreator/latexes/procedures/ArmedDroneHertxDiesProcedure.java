package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/ArmedDroneHertxDiesProcedure.class */
public class ArmedDroneHertxDiesProcedure {
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
                if (world instanceof Level) {
                    Level _level3 = (Level) world;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn3.setPickUpDelay(20);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                if (Math.random() < 0.2d) {
                    if (world instanceof Level) {
                        Level _level4 = (Level) world;
                        if (!_level4.isClientSide()) {
                            ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.IRON_NUGGET));
                            entityToSpawn4.setPickUpDelay(20);
                            _level4.addFreshEntity(entityToSpawn4);
                        }
                    }
                    if (Math.random() < 0.3d) {
                        if (world instanceof Level) {
                            Level _level5 = (Level) world;
                            if (!_level5.isClientSide()) {
                                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn5.setPickUpDelay(20);
                                _level5.addFreshEntity(entityToSpawn5);
                            }
                        }
                        if (world instanceof Level) {
                            Level _level6 = (Level) world;
                            if (!_level6.isClientSide()) {
                                ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn6.setPickUpDelay(20);
                                _level6.addFreshEntity(entityToSpawn6);
                            }
                        }
                        if (world instanceof Level) {
                            Level _level7 = (Level) world;
                            if (!_level7.isClientSide()) {
                                ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Items.IRON_NUGGET));
                                entityToSpawn7.setPickUpDelay(20);
                                _level7.addFreshEntity(entityToSpawn7);
                            }
                        }
                        if (Math.random() < 0.2d && (world instanceof Level)) {
                            Level _level8 = (Level) world;
                            if (!_level8.isClientSide()) {
                                ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn8.setPickUpDelay(20);
                                _level8.addFreshEntity(entityToSpawn8);
                            }
                        }
                    }
                }
            }
            if (Math.random() < 0.2d) {
                if (world instanceof Level) {
                    Level _level9 = (Level) world;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y, z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn9.setPickUpDelay(20);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                if (world instanceof Level) {
                    Level _level10 = (Level) world;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn10.setPickUpDelay(20);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                if (world instanceof Level) {
                    Level _level11 = (Level) world;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y, z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn11.setPickUpDelay(20);
                        _level11.addFreshEntity(entityToSpawn11);
                    }
                }
                if (world instanceof Level) {
                    Level _level12 = (Level) world;
                    if (!_level12.isClientSide()) {
                        ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y, z, new ItemStack(Items.REDSTONE));
                        entityToSpawn12.setPickUpDelay(20);
                        _level12.addFreshEntity(entityToSpawn12);
                    }
                }
                if (Math.random() < 0.2d) {
                    if (world instanceof Level) {
                        Level _level13 = (Level) world;
                        if (!_level13.isClientSide()) {
                            ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn13.setPickUpDelay(20);
                            _level13.addFreshEntity(entityToSpawn13);
                        }
                    }
                    if (world instanceof Level) {
                        Level _level14 = (Level) world;
                        if (!_level14.isClientSide()) {
                            ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn14.setPickUpDelay(20);
                            _level14.addFreshEntity(entityToSpawn14);
                        }
                    }
                    if (world instanceof Level) {
                        Level _level15 = (Level) world;
                        if (!_level15.isClientSide()) {
                            ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn15.setPickUpDelay(20);
                            _level15.addFreshEntity(entityToSpawn15);
                        }
                    }
                }
            }
            if (Math.random() < 0.1d) {
                if (world instanceof Level) {
                    Level _level16 = (Level) world;
                    if (!_level16.isClientSide()) {
                        ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y, z, new ItemStack((ItemLike) LatexModItems.M_4_ASSAULT_RIFLE.get()));
                        entityToSpawn16.setPickUpDelay(20);
                        _level16.addFreshEntity(entityToSpawn16);
                    }
                }
                if (Math.random() < 0.6d) {
                    for (int index0 = 0; index0 < ((int) (Math.random() * 10.0d)); index0++) {
                        if (world instanceof Level) {
                            Level _level17 = (Level) world;
                            if (!_level17.isClientSide()) {
                                ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y, z, new ItemStack((ItemLike) LatexModItems.RIFLE_AMMO.get()));
                                entityToSpawn17.setPickUpDelay(20);
                                _level17.addFreshEntity(entityToSpawn17);
                            }
                        }
                    }
                }
            }
            if (Math.random() < 0.05d) {
                if (world instanceof Level) {
                    Level _level18 = (Level) world;
                    if (!_level18.isClientSide()) {
                        ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get()));
                        entityToSpawn18.setPickUpDelay(20);
                        _level18.addFreshEntity(entityToSpawn18);
                    }
                }
                if (Math.random() < 0.35d) {
                    if (world instanceof Level) {
                        Level _level19 = (Level) world;
                        if (!_level19.isClientSide()) {
                            ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
                            entityToSpawn19.setPickUpDelay(20);
                            _level19.addFreshEntity(entityToSpawn19);
                        }
                    }
                    if (Math.random() < 0.4d && (world instanceof Level)) {
                        Level _level20 = (Level) world;
                        if (!_level20.isClientSide()) {
                            ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y, z, new ItemStack((ItemLike) LatexModItems.HERTXENGINEER_LEGGINGS.get()));
                            entityToSpawn20.setPickUpDelay(20);
                            _level20.addFreshEntity(entityToSpawn20);
                        }
                    }
                }
            }
        } else if (world instanceof Level) {
            Level _level21 = (Level) world;
            if (!_level21.isClientSide()) {
                _level21.explode((Entity) null, x, y, z, 3.0f, Explosion.BlockInteraction.BREAK);
            }
        }
    }
}
