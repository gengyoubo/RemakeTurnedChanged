package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCreeperEnhancedDiesProcedure.class */
public class DarkLatexCreeperEnhancedDiesProcedure {
    /* JADX WARN: Type inference failed for: r0v228, types: [double] */
    /* JADX WARN: Type inference failed for: r0v233, types: [double] */
    /* JADX WARN: Type inference failed for: r0v238, types: [double] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!entity.isOnFire() || Math.random() > 0.9d) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.BONE));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                if (world instanceof Level _level5) {
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                if (world instanceof Level _level6) {
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                if (world instanceof Level _level7) {
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                if (Math.random() < 0.35d) {
                    if (world instanceof Level _level8) {
                        if (!_level8.isClientSide()) {
                            ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
                            entityToSpawn8.setPickUpDelay(10);
                            _level8.addFreshEntity(entityToSpawn8);
                        }
                    }
                    if (world instanceof Level _level9) {
                        if (!_level9.isClientSide()) {
                            ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y, z, new ItemStack(Items.BONE));
                            entityToSpawn9.setPickUpDelay(10);
                            _level9.addFreshEntity(entityToSpawn9);
                        }
                    }
                    if (world instanceof Level _level10) {
                        if (!_level10.isClientSide()) {
                            ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y, z, new ItemStack(Items.BONE));
                            entityToSpawn10.setPickUpDelay(10);
                            _level10.addFreshEntity(entityToSpawn10);
                        }
                    }
                    if (world instanceof Level _level11) {
                        if (!_level11.isClientSide()) {
                            ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
                            entityToSpawn11.setPickUpDelay(10);
                            _level11.addFreshEntity(entityToSpawn11);
                        }
                    }
                    if (world instanceof Level _level12) {
                        if (!_level12.isClientSide()) {
                            ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
                            entityToSpawn12.setPickUpDelay(10);
                            _level12.addFreshEntity(entityToSpawn12);
                        }
                    }
                }
                if (Math.random() < 0.1d) {
                    if (world instanceof Level _level13) {
                        if (!_level13.isClientSide()) {
                            ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
                            entityToSpawn13.setPickUpDelay(10);
                            _level13.addFreshEntity(entityToSpawn13);
                        }
                    }
                    if (world instanceof Level _level14) {
                        if (!_level14.isClientSide()) {
                            ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y, z, new ItemStack(Items.GUNPOWDER));
                            entityToSpawn14.setPickUpDelay(10);
                            _level14.addFreshEntity(entityToSpawn14);
                        }
                    }
                    if (world instanceof Level _level15) {
                        if (!_level15.isClientSide()) {
                            ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y, z, new ItemStack(Items.GUNPOWDER));
                            entityToSpawn15.setPickUpDelay(10);
                            _level15.addFreshEntity(entityToSpawn15);
                        }
                    }
                    if (world instanceof Level _level16) {
                        if (!_level16.isClientSide()) {
                            ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y, z, new ItemStack(Items.GUNPOWDER));
                            entityToSpawn16.setPickUpDelay(10);
                            _level16.addFreshEntity(entityToSpawn16);
                        }
                    }
                    if (Math.random() < 0.1d) {
                        if (world instanceof Level _level17) {
                            if (!_level17.isClientSide()) {
                                ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y, z, new ItemStack(ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
                                entityToSpawn17.setPickUpDelay(10);
                                _level17.addFreshEntity(entityToSpawn17);
                            }
                        }
                        if (world instanceof Level _level18) {
                            if (!_level18.isClientSide()) {
                                ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y, z, new ItemStack(Items.GUNPOWDER));
                                entityToSpawn18.setPickUpDelay(10);
                                _level18.addFreshEntity(entityToSpawn18);
                            }
                        }
                        if (world instanceof Level _level19) {
                            if (!_level19.isClientSide()) {
                                ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y, z, new ItemStack(Items.GUNPOWDER));
                                entityToSpawn19.setPickUpDelay(10);
                                _level19.addFreshEntity(entityToSpawn19);
                            }
                        }
                        if (world instanceof Level _level20) {
                            if (!_level20.isClientSide()) {
                                ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y, z, new ItemStack(Items.GUNPOWDER));
                                entityToSpawn20.setPickUpDelay(10);
                                _level20.addFreshEntity(entityToSpawn20);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof Level _level21) {
                if (!_level21.isClientSide()) {
                    _level21.explode(null, x, y, z, 8.0f, Explosion.BlockInteraction.BREAK);
                }
            }
            char c = 0;
            for (int index0 = 0; index0 < 9; index0++) {
                char c2 = 0;
                for (int index1 = 0; index1 < 9; index1++) {
                    char c3 = 0;
                    for (int index2 = 0; index2 < 9; index2++) {
                        if (world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() != Blocks.CAVE_AIR && world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() != Blocks.VOID_AIR) {
                            world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock();
                        }
                    }
                }
            }
        }
    }
}
