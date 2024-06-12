package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/BeeHertxEntityDiesProcedure.class */
public class BeeHertxEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level) {
            Level _level2 = (Level) world;
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (Math.random() < 0.3d && (world instanceof Level)) {
            Level _level3 = (Level) world;
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (Math.random() < 0.2d && (world instanceof Level)) {
            Level _level4 = (Level) world;
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (Math.random() < 0.4d && (world instanceof Level)) {
            Level _level5 = (Level) world;
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.HONEYCOMB));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
    }
}
