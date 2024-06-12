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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexCreeperdiesProcedure.class */
public class DarkLatexCreeperdiesProcedure {
    /* JADX WARN: Type inference failed for: r0v76, types: [double] */
    /* JADX WARN: Type inference failed for: r0v81, types: [double] */
    /* JADX WARN: Type inference failed for: r0v86, types: [double] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!entity.isOnFire() || Math.random() > 0.75d) {
                if (world instanceof Level) {
                    Level _level = (Level) world;
                    if (!_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                if (world instanceof Level) {
                    Level _level2 = (Level) world;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                if (Math.random() < 0.35d) {
                    if (world instanceof Level) {
                        Level _level3 = (Level) world;
                        if (!_level3.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
                            entityToSpawn3.setPickUpDelay(10);
                            _level3.addFreshEntity(entityToSpawn3);
                        }
                    }
                    if (world instanceof Level) {
                        Level _level4 = (Level) world;
                        if (!_level4.isClientSide()) {
                            ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.BONE));
                            entityToSpawn4.setPickUpDelay(10);
                            _level4.addFreshEntity(entityToSpawn4);
                        }
                    }
                }
                if (Math.random() < 0.1d && (world instanceof Level)) {
                    Level _level5 = (Level) world;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof Level) {
                Level _level6 = (Level) world;
                if (!_level6.isClientSide()) {
                    _level6.explode((Entity) null, x, y, z, 5.0f, Explosion.BlockInteraction.BREAK);
                }
            }
            char c = 0;
            for (int index0 = 0; index0 < 6; index0++) {
                char c2 = 0;
                for (int index1 = 0; index1 < 6; index1++) {
                    char c3 = 0;
                    for (int index2 = 0; index2 < 6; index2++) {
                        if (!(world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() != Blocks.AIR)) {
                        }
                        c3 += 0;
                    }
                    c2 += 0;
                }
                c += 0;
            }
        }
    }
}
