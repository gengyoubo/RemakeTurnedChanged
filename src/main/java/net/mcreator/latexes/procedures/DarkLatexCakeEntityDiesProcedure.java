package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCakeEntityDiesProcedure.class */
public class DarkLatexCakeEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.5d) {
            if (world instanceof Level) {
                Level _level = (Level) world;
                if (!_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            if (world instanceof Level) {
                Level _level2 = (Level) world;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
                    entityToSpawn2.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn2);
                }
            }
            if (Math.random() < 0.5d && (world instanceof Level)) {
                Level _level3 = (Level) world;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Blocks.SWEET_BERRY_BUSH));
                    entityToSpawn3.setPickUpDelay(10);
                    _level3.addFreshEntity(entityToSpawn3);
                }
            }
            if (Math.random() < 0.2d && (world instanceof Level)) {
                Level _level4 = (Level) world;
                if (!_level4.isClientSide()) {
                    ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Blocks.CAKE));
                    entityToSpawn4.setPickUpDelay(10);
                    _level4.addFreshEntity(entityToSpawn4);
                }
            }
        }
    }
}
