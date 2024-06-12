package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TSCOutsiderEntityDiesProcedure.class */
public class TSCOutsiderEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() >= 0.1d || !world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING)) {
            if (Math.random() < 0.3d) {
                for (int index0 = 0; index0 < 2; index0++) {
                    if (world instanceof Level) {
                        Level _level = (Level) world;
                        if (!_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                    }
                }
            }
            if (Math.random() < 0.4d) {
                for (int index1 = 0; index1 < 5; index1++) {
                    if (world instanceof Level) {
                        Level _level2 = (Level) world;
                        if (!_level2.isClientSide()) {
                            ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.REDSTONE));
                            entityToSpawn2.setPickUpDelay(10);
                            _level2.addFreshEntity(entityToSpawn2);
                        }
                    }
                }
            }
            if (Math.random() < 0.2d && (world instanceof Level)) {
                Level _level3 = (Level) world;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack((ItemLike) LatexModItems.BATTERY.get()));
                    entityToSpawn3.setPickUpDelay(10);
                    _level3.addFreshEntity(entityToSpawn3);
                }
            }
        } else if (world instanceof Level) {
            Level _level4 = (Level) world;
            if (!_level4.isClientSide()) {
                _level4.explode((Entity) null, x, y, z, 1.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
    }
}
