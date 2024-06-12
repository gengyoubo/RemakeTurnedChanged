package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/EvilMilitaryEntityDiesProcedure.class */
public class EvilMilitaryEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.6d) {
            for (int index0 = 0; index0 < ((int) Math.round(Math.random() * 10.0d)); index0++) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(LatexModItems.RIFLE_AMMO.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
            }
            if (Math.random() < 0.1d && (world instanceof Level _level2)) {
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(LatexModItems.AR_70_ASSAULT_RIFLE.get()));
                    entityToSpawn2.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn2);
                }
            }
            if (Math.random() < 0.3d) {
                for (int index1 = 0; index1 < ((int) Math.round(Math.random() * 10.0d)); index1++) {
                    if (world instanceof Level _level3) {
                        if (!_level3.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(LatexModItems.RIFLE_AMMO.get()));
                            entityToSpawn3.setPickUpDelay(10);
                            _level3.addFreshEntity(entityToSpawn3);
                        }
                    }
                }
            }
        }
        if (Math.random() < 0.3d && (world instanceof Level _level4)) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(LatexModItems.KEYCARD.get()));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (Math.random() < 0.1d && (world instanceof Level _level5)) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(LatexModItems.RADIO_DROPPODCALLER.get()));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
        if (Math.random() < 0.4d) {
            for (int index2 = 0; index2 < 3; index2++) {
                if (world instanceof Level _level6) {
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Items.IRON_NUGGET));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
            }
            for (int index3 = 0; index3 < 4; index3++) {
                if (world instanceof Level _level7) {
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
            }
        }
        if (Math.random() < 0.1d && (world instanceof Level _level8)) {
            if (!_level8.isClientSide()) {
                ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack(LatexModItems.KELVARVEST_CHESTPLATE.get()));
                entityToSpawn8.setPickUpDelay(10);
                _level8.addFreshEntity(entityToSpawn8);
            }
        }
    }
}
