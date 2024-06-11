package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TSCHunterEntityDiesProcedure.class */
public class TSCHunterEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() >= 0.1d || !world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
            if (Math.random() < 0.4d) {
                for (int index0 = 0; index0 < 4; index0++) {
                    if (world instanceof Level) {
                        Level _level = (Level) world;
                        if (!_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                    }
                    if (Math.random() < 0.4d && (world instanceof Level)) {
                        Level _level2 = (Level) world;
                        if (!_level2.isClientSide()) {
                            ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.IRON_NUGGET));
                            entityToSpawn2.setPickUpDelay(10);
                            _level2.addFreshEntity(entityToSpawn2);
                        }
                    }
                }
                if (Math.random() < 0.2d) {
                    for (int index1 = 0; index1 < 3; index1++) {
                        if (world instanceof Level) {
                            Level _level3 = (Level) world;
                            if (!_level3.isClientSide()) {
                                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.IRON_INGOT));
                                entityToSpawn3.setPickUpDelay(10);
                                _level3.addFreshEntity(entityToSpawn3);
                            }
                        }
                        if (Math.random() < 0.1d && (world instanceof Level)) {
                            Level _level4 = (Level) world;
                            if (!_level4.isClientSide()) {
                                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.GOLD_NUGGET));
                                entityToSpawn4.setPickUpDelay(10);
                                _level4.addFreshEntity(entityToSpawn4);
                            }
                        }
                    }
                    if (Math.random() < 0.1d) {
                        for (int index2 = 0; index2 < 3; index2++) {
                            if (world instanceof Level) {
                                Level _level5 = (Level) world;
                                if (!_level5.isClientSide()) {
                                    ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.IRON_INGOT));
                                    entityToSpawn5.setPickUpDelay(10);
                                    _level5.addFreshEntity(entityToSpawn5);
                                }
                            }
                        }
                    }
                }
            }
            if (Math.random() < 0.4d) {
                for (int index3 = 0; index3 < 5; index3++) {
                    if (world instanceof Level) {
                        Level _level6 = (Level) world;
                        if (!_level6.isClientSide()) {
                            ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn6.setPickUpDelay(10);
                            _level6.addFreshEntity(entityToSpawn6);
                        }
                    }
                    if (Math.random() < 0.3d && (world instanceof Level)) {
                        Level _level7 = (Level) world;
                        if (!_level7.isClientSide()) {
                            ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn7.setPickUpDelay(10);
                            _level7.addFreshEntity(entityToSpawn7);
                        }
                    }
                }
            }
            if (Math.random() < 0.2d) {
                for (int index4 = 0; index4 < 2; index4++) {
                    if (world instanceof Level) {
                        Level _level8 = (Level) world;
                        if (!_level8.isClientSide()) {
                            ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack((ItemLike) LatexModItems.BATTERY.get()));
                            entityToSpawn8.setPickUpDelay(10);
                            _level8.addFreshEntity(entityToSpawn8);
                        }
                    }
                }
            }
            if (Math.random() < 0.1d) {
                if (world instanceof Level) {
                    Level _level9 = (Level) world;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                if (Math.random() < 0.3d && (world instanceof Level)) {
                    Level _level10 = (Level) world;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y, z, new ItemStack(Items.GOLD_NUGGET));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
            }
        } else if (world instanceof Level) {
            Level _level11 = (Level) world;
            if (!_level11.isClientSide()) {
                _level11.explode((Entity) null, x, y, z, 1.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
    }
}
