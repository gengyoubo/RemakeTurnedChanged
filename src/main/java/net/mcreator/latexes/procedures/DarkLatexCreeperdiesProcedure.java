package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexCreeperdiesProcedure.class */
public class DarkLatexCreeperdiesProcedure {
    /* JADX WARN: Type inference failed for: r0v113, types: [double] */
    /* JADX WARN: Type inference failed for: r0v118, types: [double] */
    /* JADX WARN: Type inference failed for: r0v123, types: [double] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!entity.isOnFire() || Math.random() > 0.75d) {
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
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.GUNPOWDER));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                if (Math.random() < 0.35d) {
                    if (world instanceof Level) {
                        Level _level3 = (Level) world;
                        if (!_level3.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
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
                    }
                }
                if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
                    if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BEDROCK) {
                        return;
                    }
                    if ((world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR) && Math.random() < 0.72d && !entity.isOnFire()) {
                        world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
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
            boolean found = false;
            for (int index0 = 0; index0 < 6; index0++) {
                char c2 = 0;
                for (int index1 = 0; index1 < 6; index1++) {
                    char c3 = 0;
                    for (int index2 = 0; index2 < 6; index2++) {
                        if (!(world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + c, y + c2, z + c3)).getBlock() == Blocks.AIR)) {
                            found = true;
                        }
                        c3 += 0;
                    }
                    c2 += 0;
                }
                c += 0;
            }
            if (!found) {
                return;
            }
            if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR) {
                world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
            }
        }
    }
}
